/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.c.aa;
import org.apache.commons.c.ao;
import org.apache.commons.c.c;
import org.apache.commons.c.g.h;
import org.apache.commons.c.g.i;
import org.apache.commons.c.g.j;
import org.apache.commons.c.g.k;
import org.apache.commons.c.g.m;
import org.apache.commons.c.o;

public class g {
    public static final WildcardType a = g.a().a(new Type[]{Object.class}).b();

    public static boolean a(Type type, Type type2) {
        return g.a(type, type2, null);
    }

    private static boolean a(Type type, Type type2, Map map) {
        if (type2 == null || type2 instanceof Class) {
            return g.b(type, (Class)type2);
        }
        if (type2 instanceof ParameterizedType) {
            return g.a(type, (ParameterizedType)type2, map);
        }
        if (type2 instanceof GenericArrayType) {
            return g.a(type, (GenericArrayType)type2, map);
        }
        if (type2 instanceof WildcardType) {
            return g.a(type, (WildcardType)type2, map);
        }
        if (type2 instanceof TypeVariable) {
            return g.a(type, (TypeVariable)type2, map);
        }
        throw new IllegalStateException("found an unhandled type: " + type2);
    }

    private static boolean b(Type type, Class class_) {
        if (type == null) {
            return class_ == null || !class_.isPrimitive();
        }
        if (class_ == null) {
            return false;
        }
        if (class_.equals(type)) {
            return true;
        }
        if (type instanceof Class) {
            return o.a((Class)type, class_);
        }
        if (type instanceof ParameterizedType) {
            return g.b((Type)g.b((ParameterizedType)type), class_);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable)type).getBounds()) {
                if (!g.b(type2, class_)) continue;
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return class_.equals(Object.class) || class_.isArray() && g.b(((GenericArrayType)type).getGenericComponentType(), class_.getComponentType());
        }
        if (type instanceof WildcardType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean a(Type type, ParameterizedType parameterizedType, Map map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class class_ = g.b(parameterizedType);
        Map map2 = g.b(type, class_, null);
        if (map2 == null) {
            return false;
        }
        if (map2.isEmpty()) {
            return true;
        }
        Map map3 = g.a(parameterizedType, class_, map);
        for (TypeVariable typeVariable : map3.keySet()) {
            Type type2 = g.a(typeVariable, map3);
            Type type3 = g.a(typeVariable, map2);
            if (type3 == null || type2.equals(type3) || type2 instanceof WildcardType && g.a(type3, type2, map)) continue;
            return false;
        }
        return true;
    }

    private static Type a(TypeVariable typeVariable, Map map) {
        Type type;
        while ((type = (Type)map.get(typeVariable)) instanceof TypeVariable && !type.equals(typeVariable)) {
            typeVariable = (TypeVariable)type;
        }
        return type;
    }

    private static boolean a(Type type, GenericArrayType genericArrayType, Map map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type type2 = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class class_ = (Class)type;
            return class_.isArray() && g.a(class_.getComponentType(), type2, map);
        }
        if (type instanceof GenericArrayType) {
            return g.a(((GenericArrayType)type).getGenericComponentType(), type2, map);
        }
        if (type instanceof WildcardType) {
            for (Type type3 : g.a((WildcardType)type)) {
                if (!g.a(type3, (Type)genericArrayType)) continue;
                return true;
            }
            return false;
        }
        if (type instanceof TypeVariable) {
            for (Type type4 : g.a((TypeVariable)type)) {
                if (!g.a(type4, (Type)genericArrayType)) continue;
                return true;
            }
            return false;
        }
        if (type instanceof ParameterizedType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean a(Type type, WildcardType wildcardType, Map map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] arrtype = g.a(wildcardType);
        Type[] arrtype2 = g.b(wildcardType);
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType)type;
            Type[] arrtype3 = g.a(wildcardType2);
            Type[] arrtype4 = g.b(wildcardType2);
            for (Type type2 : arrtype) {
                type2 = g.a(type2, map);
                for (Type type3 : arrtype3) {
                    if (g.a(type3, type2, map)) continue;
                    return false;
                }
            }
            for (Type type2 : arrtype2) {
                type2 = g.a(type2, map);
                for (Type type3 : arrtype4) {
                    if (g.a(type2, type3, map)) continue;
                    return false;
                }
            }
            return true;
        }
        for (Type type4 : arrtype) {
            if (g.a(type, g.a(type4, map), map)) continue;
            return false;
        }
        for (Type type4 : arrtype2) {
            if (g.a(g.a(type4, map), type, map)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(Type type, TypeVariable typeVariable, Map map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            Type[] arrtype;
            for (Type type2 : arrtype = g.a((TypeVariable)type)) {
                if (!g.a(type2, typeVariable, map)) continue;
                return true;
            }
        }
        if (type instanceof Class || type instanceof ParameterizedType || type instanceof GenericArrayType || type instanceof WildcardType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static Type a(Type type, Map map) {
        if (type instanceof TypeVariable && map != null) {
            Type type2 = (Type)map.get(type);
            if (type2 == null) {
                throw new IllegalArgumentException("missing assignment type for type variable " + type);
            }
            return type2;
        }
        return type;
    }

    public static Map a(ParameterizedType parameterizedType) {
        return g.a(parameterizedType, g.b(parameterizedType), null);
    }

    public static Map a(Type type, Class class_) {
        return g.b(type, class_, null);
    }

    private static Map b(Type type, Class class_, Map map) {
        if (type instanceof Class) {
            return g.a((Class)type, (Class)class_, map);
        }
        if (type instanceof ParameterizedType) {
            return g.a((ParameterizedType)type, (Class)class_, map);
        }
        if (type instanceof GenericArrayType) {
            return g.b(((GenericArrayType)type).getGenericComponentType(), class_.isArray() ? class_.getComponentType() : class_, map);
        }
        if (type instanceof WildcardType) {
            for (Type type2 : g.a((WildcardType)type)) {
                if (!g.b(type2, class_)) continue;
                return g.b(type2, class_, map);
            }
            return null;
        }
        if (type instanceof TypeVariable) {
            for (Type type3 : g.a((TypeVariable)type)) {
                if (!g.b(type3, class_)) continue;
                return g.b(type3, class_, map);
            }
            return null;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static Map a(ParameterizedType parameterizedType, Class class_, Map map) {
        Map map2;
        Type[] arrtype;
        Class class_2 = g.b(parameterizedType);
        if (!g.b((Type)class_2, class_)) {
            return null;
        }
        Type type = parameterizedType.getOwnerType();
        if (type instanceof ParameterizedType) {
            arrtype = (Type[])type;
            map2 = g.a((ParameterizedType)arrtype, g.b((ParameterizedType)arrtype), map);
        } else {
            map2 = map == null ? new HashMap() : new HashMap(map);
        }
        arrtype = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<T>>[] arrtypeVariable = class_2.getTypeParameters();
        for (int i2 = 0; i2 < arrtypeVariable.length; ++i2) {
            Type type2 = arrtype[i2];
            map2.put(arrtypeVariable[i2], map2.containsKey(type2) ? (Type)map2.get(type2) : type2);
        }
        if (class_.equals(class_2)) {
            return map2;
        }
        return g.b(g.a(class_2, class_), class_, map2);
    }

    private static Map a(Class class_, Class class_2, Map map) {
        HashMap hashMap;
        if (!g.b((Type)class_, class_2)) {
            return null;
        }
        if (class_.isPrimitive()) {
            if (class_2.isPrimitive()) {
                return new HashMap();
            }
            class_ = o.h(class_);
        }
        HashMap hashMap2 = hashMap = map == null ? new HashMap() : new HashMap(map);
        if (class_2.equals(class_)) {
            return hashMap;
        }
        return g.b(g.a(class_, class_2), class_2, hashMap);
    }

    public static Map a(Class class_, ParameterizedType parameterizedType) {
        ao.a((Object)class_, "cls is null", new Object[0]);
        ao.a((Object)parameterizedType, "superType is null", new Object[0]);
        Class class_2 = g.b(parameterizedType);
        if (!g.b((Type)class_, class_2)) {
            return null;
        }
        if (class_.equals(class_2)) {
            return g.a(parameterizedType, class_2, null);
        }
        Type type = g.a(class_, class_2);
        if (type instanceof Class) {
            return g.a((Class)type, parameterizedType);
        }
        ParameterizedType parameterizedType2 = (ParameterizedType)type;
        Class class_3 = g.b(parameterizedType2);
        Map map = g.a(class_3, parameterizedType);
        g.a(class_, parameterizedType2, map);
        return map;
    }

    private static void a(Class class_, ParameterizedType parameterizedType, Map map) {
        Type type = parameterizedType.getOwnerType();
        if (type instanceof ParameterizedType) {
            g.a(class_, (ParameterizedType)type, map);
        }
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<T>>[] arrtypeVariable = g.b(parameterizedType).getTypeParameters();
        List list = Arrays.asList(class_.getTypeParameters());
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            TypeVariable typeVariable = arrtypeVariable[i2];
            Type type2 = arrtype[i2];
            if (!list.contains(type2) || !map.containsKey(typeVariable)) continue;
            map.put((TypeVariable)type2, map.get(typeVariable));
        }
    }

    private static Type a(Class class_, Class class_2) {
        if (class_2.isInterface()) {
            Type[] arrtype = class_.getGenericInterfaces();
            Type type = null;
            for (Type type2 : arrtype) {
                Class class_3 = null;
                if (type2 instanceof ParameterizedType) {
                    class_3 = g.b((ParameterizedType)type2);
                } else if (type2 instanceof Class) {
                    class_3 = (Class)type2;
                } else {
                    throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                }
                if (!g.b((Type)class_3, class_2) || !g.a(type, (Type)class_3)) continue;
                type = type2;
            }
            if (type != null) {
                return type;
            }
        }
        return class_.getGenericSuperclass();
    }

    public static boolean a(Object object, Type type) {
        if (type == null) {
            return false;
        }
        return object == null ? !(type instanceof Class) || !((Class)type).isPrimitive() : g.a(object.getClass(), type, null);
    }

    public static Type[] a(Type[] arrtype) {
        ao.a((Object)arrtype, "null value specified for bounds array", new Object[0]);
        if (arrtype.length < 2) {
            return arrtype;
        }
        HashSet<Type> hashSet = new HashSet<Type>(arrtype.length);
        for (Type type : arrtype) {
            boolean bl2 = false;
            for (Type type2 : arrtype) {
                if (type == type2 || !g.a(type2, type, null)) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            hashSet.add(type);
        }
        return hashSet.toArray(new Type[hashSet.size()]);
    }

    public static Type[] a(TypeVariable typeVariable) {
        Type[] arrtype;
        ao.a((Object)typeVariable, "typeVariable is null", new Object[0]);
        Type[] arrtype2 = typeVariable.getBounds();
        if (arrtype2.length == 0) {
            Type[] arrtype3 = new Type[1];
            arrtype = arrtype3;
            arrtype3[0] = Object.class;
        } else {
            arrtype = g.a(arrtype2);
        }
        return arrtype;
    }

    public static Type[] a(WildcardType wildcardType) {
        Type[] arrtype;
        ao.a((Object)wildcardType, "wildcardType is null", new Object[0]);
        Type[] arrtype2 = wildcardType.getUpperBounds();
        if (arrtype2.length == 0) {
            Type[] arrtype3 = new Type[1];
            arrtype = arrtype3;
            arrtype3[0] = Object.class;
        } else {
            arrtype = g.a(arrtype2);
        }
        return arrtype;
    }

    public static Type[] b(WildcardType wildcardType) {
        Type[] arrtype;
        ao.a((Object)wildcardType, "wildcardType is null", new Object[0]);
        Type[] arrtype2 = wildcardType.getLowerBounds();
        if (arrtype2.length == 0) {
            Type[] arrtype3 = new Type[1];
            arrtype = arrtype3;
            arrtype3[0] = null;
        } else {
            arrtype = arrtype2;
        }
        return arrtype;
    }

    public static boolean a(Map map) {
        ao.a((Object)map, "typeVarAssigns is null", new Object[0]);
        for (Map.Entry entry : map.entrySet()) {
            TypeVariable typeVariable = (TypeVariable)entry.getKey();
            Type type = (Type)entry.getValue();
            for (Type type2 : g.a(typeVariable)) {
                if (g.a(type, g.a(type2, map), map)) continue;
                return false;
            }
        }
        return true;
    }

    private static Class b(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getRawType();
        if (!(type instanceof Class)) {
            throw new IllegalStateException("Wait... What!? Type of rawType: " + type);
        }
        return (Class)type;
    }

    public static Class b(Type type, Type type2) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            return g.b((ParameterizedType)type);
        }
        if (type instanceof TypeVariable) {
            if (type2 == null) {
                return null;
            }
            Object d2 = ((TypeVariable)type).getGenericDeclaration();
            if (!(d2 instanceof Class)) {
                return null;
            }
            Map map = g.a(type2, (Class)d2);
            if (map == null) {
                return null;
            }
            Type type3 = (Type)map.get(type);
            if (type3 == null) {
                return null;
            }
            return g.b(type3, type2);
        }
        if (type instanceof GenericArrayType) {
            Class class_ = g.b(((GenericArrayType)type).getGenericComponentType(), type2);
            return Array.newInstance(class_, 0).getClass();
        }
        if (type instanceof WildcardType) {
            return null;
        }
        throw new IllegalArgumentException("unknown type: " + type);
    }

    public static boolean a(Type type) {
        return type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray();
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class class_ = (Class)type;
            return class_.isArray() ? class_.getComponentType() : null;
        }
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType)type).getGenericComponentType();
        }
        return null;
    }

    public static Type a(Map map, Type type) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        if (g.c(type)) {
            if (type instanceof TypeVariable) {
                return g.a(map, (Type)map.get(type));
            }
            if (type instanceof ParameterizedType) {
                Map map2;
                ParameterizedType parameterizedType = (ParameterizedType)type;
                if (parameterizedType.getOwnerType() == null) {
                    map2 = map;
                } else {
                    map2 = new HashMap(map);
                    map2.putAll(g.a(parameterizedType));
                }
                Type[] arrtype = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < arrtype.length; ++i2) {
                    Type type2 = g.a(map2, arrtype[i2]);
                    if (type2 == null) continue;
                    arrtype[i2] = type2;
                }
                return g.a(parameterizedType.getOwnerType(), (Class)parameterizedType.getRawType(), arrtype);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType)type;
                return g.a().a(g.a(map, wildcardType.getUpperBounds())).b(g.a(map, wildcardType.getLowerBounds())).b();
            }
        }
        return type;
    }

    private static Type[] a(Map map, Type[] arrtype) {
        Object[] arrobject = arrtype;
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Type type = g.a(map, arrobject[i2]);
            if (type == null) {
                arrobject = (Type[])c.a(arrobject, i2--);
                continue;
            }
            arrobject[i2] = type;
        }
        return arrobject;
    }

    public static boolean c(Type type) {
        if (type instanceof TypeVariable) {
            return true;
        }
        if (type instanceof Class) {
            return ((Class)type).getTypeParameters().length > 0;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType)type).getActualTypeArguments()) {
                if (!g.c(type2)) continue;
                return true;
            }
            return false;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            return g.c(g.b(wildcardType)[0]) || g.c(g.a(wildcardType)[0]);
        }
        return false;
    }

    public static final ParameterizedType a(Class class_, Type ... arrtype) {
        return g.a(null, class_, arrtype);
    }

    public static final ParameterizedType a(Class class_, Map map) {
        ao.a((Object)class_, "raw class is null", new Object[0]);
        ao.a((Object)map, "typeArgMappings is null", new Object[0]);
        return g.a(null, class_, g.a(map, class_.getTypeParameters()));
    }

    public static final ParameterizedType a(Type type, Class class_, Type ... arrtype) {
        Type type2;
        ao.a((Object)class_, "raw class is null", new Object[0]);
        if (class_.getEnclosingClass() == null) {
            ao.a(type == null, "no owner allowed for top-level %s", new Object[]{class_});
            type2 = null;
        } else if (type == null) {
            type2 = class_.getEnclosingClass();
        } else {
            ao.a(g.b(type, class_.getEnclosingClass()), "%s is invalid owner type for parameterized %s", new Object[]{type, class_});
            type2 = type;
        }
        ao.b(arrtype, "null type argument at index %s", new Object[0]);
        ao.a(class_.getTypeParameters().length == arrtype.length, "invalid number of type parameters specified: expected %s, got %s", new Object[]{class_.getTypeParameters().length, arrtype.length});
        return new j(class_, type2, arrtype, null);
    }

    public static final ParameterizedType a(Type type, Class class_, Map map) {
        ao.a((Object)class_, "raw class is null", new Object[0]);
        ao.a((Object)map, "typeArgMappings is null", new Object[0]);
        return g.a(type, class_, g.a(map, class_.getTypeParameters()));
    }

    private static Type[] a(Map map, TypeVariable[] arrtypeVariable) {
        Type[] arrtype = new Type[arrtypeVariable.length];
        int n2 = 0;
        for (TypeVariable typeVariable : arrtypeVariable) {
            ao.a(map.containsKey(typeVariable), "missing argument mapping for %s", new Object[]{g.e(typeVariable)});
            arrtype[n2++] = (Type)map.get(typeVariable);
        }
        return arrtype;
    }

    public static k a() {
        return new k(null);
    }

    public static GenericArrayType d(Type type) {
        return new i((Type)ao.a((Object)type, "componentType is null", new Object[0]), null);
    }

    public static boolean c(Type type, Type type2) {
        if (aa.b((Object)type, (Object)type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return g.b((ParameterizedType)type, type2);
        }
        if (type instanceof GenericArrayType) {
            return g.b((GenericArrayType)type, type2);
        }
        if (type instanceof WildcardType) {
            return g.b((WildcardType)type, type2);
        }
        return false;
    }

    private static boolean b(ParameterizedType parameterizedType, Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType)type;
            if (g.c(parameterizedType.getRawType(), parameterizedType2.getRawType()) && g.c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
                return g.a(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
        }
        return false;
    }

    private static boolean b(GenericArrayType genericArrayType, Type type) {
        return type instanceof GenericArrayType && g.c(genericArrayType.getGenericComponentType(), ((GenericArrayType)type).getGenericComponentType());
    }

    private static boolean b(WildcardType wildcardType, Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType)type;
            return g.a(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) && g.a(g.a(wildcardType), g.a(wildcardType2));
        }
        return true;
    }

    private static boolean a(Type[] arrtype, Type[] arrtype2) {
        if (arrtype.length == arrtype2.length) {
            for (int i2 = 0; i2 < arrtype.length; ++i2) {
                if (g.c(arrtype[i2], arrtype2[i2])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static String e(Type type) {
        ao.a(type);
        if (type instanceof Class) {
            return g.b((Class)type);
        }
        if (type instanceof ParameterizedType) {
            return g.c((ParameterizedType)type);
        }
        if (type instanceof WildcardType) {
            return g.c((WildcardType)type);
        }
        if (type instanceof TypeVariable) {
            return g.c((TypeVariable)type);
        }
        if (type instanceof GenericArrayType) {
            return g.a((GenericArrayType)type);
        }
        throw new IllegalArgumentException(aa.b((Object)type));
    }

    public static String b(TypeVariable typeVariable) {
        StringBuilder stringBuilder;
        block5: {
            ao.a((Object)typeVariable, "var is null", new Object[0]);
            stringBuilder = new StringBuilder();
            Object d2 = typeVariable.getGenericDeclaration();
            if (d2 instanceof Class) {
                Class<?> class_ = (Class<?>)d2;
                while (true) {
                    if (class_.getEnclosingClass() == null) {
                        stringBuilder.insert(0, class_.getName());
                        break block5;
                    }
                    stringBuilder.insert(0, class_.getSimpleName()).insert(0, '.');
                    class_ = class_.getEnclosingClass();
                }
            }
            if (d2 instanceof Type) {
                stringBuilder.append(g.e((Type)d2));
            } else {
                stringBuilder.append(d2);
            }
        }
        return stringBuilder.append(':').append(g.c(typeVariable)).toString();
    }

    public static m f(Type type) {
        return new h(type);
    }

    public static m a(Class class_) {
        return g.f(class_);
    }

    private static String b(Class class_) {
        StringBuilder stringBuilder = new StringBuilder();
        if (class_.getEnclosingClass() != null) {
            stringBuilder.append(g.b(class_.getEnclosingClass())).append('.').append(class_.getSimpleName());
        } else {
            stringBuilder.append(class_.getName());
        }
        if (class_.getTypeParameters().length > 0) {
            stringBuilder.append('<');
            g.a(stringBuilder, ", ", (Type[])class_.getTypeParameters());
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    private static String c(TypeVariable typeVariable) {
        StringBuilder stringBuilder = new StringBuilder(typeVariable.getName());
        Type[] arrtype = typeVariable.getBounds();
        if (!(arrtype.length <= 0 || arrtype.length == 1 && Object.class.equals((Object)arrtype[0]))) {
            stringBuilder.append(" extends ");
            g.a(stringBuilder, " & ", typeVariable.getBounds());
        }
        return stringBuilder.toString();
    }

    private static String c(ParameterizedType parameterizedType) {
        StringBuilder stringBuilder = new StringBuilder();
        Type type = parameterizedType.getOwnerType();
        Class class_ = (Class)parameterizedType.getRawType();
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        if (type == null) {
            stringBuilder.append(class_.getName());
        } else {
            if (type instanceof Class) {
                stringBuilder.append(((Class)type).getName());
            } else {
                stringBuilder.append(type.toString());
            }
            stringBuilder.append('.').append(class_.getSimpleName());
        }
        g.a(stringBuilder.append('<'), ", ", arrtype).append('>');
        return stringBuilder.toString();
    }

    private static String c(WildcardType wildcardType) {
        StringBuilder stringBuilder = new StringBuilder().append('?');
        Type[] arrtype = wildcardType.getLowerBounds();
        Type[] arrtype2 = wildcardType.getUpperBounds();
        if (arrtype.length > 0) {
            g.a(stringBuilder.append(" super "), " & ", arrtype);
        } else if (arrtype2.length != 1 || !Object.class.equals((Object)arrtype2[0])) {
            g.a(stringBuilder.append(" extends "), " & ", arrtype2);
        }
        return stringBuilder.toString();
    }

    private static String a(GenericArrayType genericArrayType) {
        return String.format("%s[]", g.e(genericArrayType.getGenericComponentType()));
    }

    private static StringBuilder a(StringBuilder stringBuilder, String string, Type ... arrtype) {
        ao.a(ao.b(arrtype));
        if (arrtype.length > 0) {
            stringBuilder.append(g.e(arrtype[0]));
            for (int i2 = 1; i2 < arrtype.length; ++i2) {
                stringBuilder.append(string).append(g.e(arrtype[i2]));
            }
        }
        return stringBuilder;
    }

    static /* synthetic */ boolean a(GenericArrayType genericArrayType, Type type) {
        return g.b(genericArrayType, type);
    }

    static /* synthetic */ boolean a(ParameterizedType parameterizedType, Type type) {
        return g.b(parameterizedType, type);
    }

    static /* synthetic */ boolean a(WildcardType wildcardType, Type type) {
        return g.b(wildcardType, type);
    }
}

