/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.a;
import com.a.b.b.c;
import com.a.b.b.d;
import com.a.b.b.e;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class b {
    static final Type[] a = new Type[0];

    private b() {
    }

    public static ParameterizedType a(Type type, Type type2, Type ... arrtype) {
        return new d(type, type2, arrtype);
    }

    public static GenericArrayType a(Type type) {
        return new c(type);
    }

    public static WildcardType b(Type type) {
        return new e(new Type[]{type}, a);
    }

    public static WildcardType c(Type type) {
        return new e(new Type[]{Object.class}, new Type[]{type});
    }

    public static Type d(Type type) {
        if (type instanceof Class) {
            Class class_ = (Class)type;
            return class_.isArray() ? new c(b.d(class_.getComponentType())) : class_;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            return new d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType)type;
            return new c(genericArrayType.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static Class e(Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            Type type2 = parameterizedType.getRawType();
            com.a.b.b.a.a(type2 instanceof Class);
            return (Class)type2;
        }
        if (type instanceof GenericArrayType) {
            Type type3 = ((GenericArrayType)type).getGenericComponentType();
            return Array.newInstance(b.e(type3), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return b.e(((WildcardType)type).getUpperBounds()[0]);
        }
        String string = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + string);
    }

    static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType)type;
            ParameterizedType parameterizedType2 = (ParameterizedType)type2;
            return b.a((Object)parameterizedType.getOwnerType(), (Object)parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            GenericArrayType genericArrayType = (GenericArrayType)type;
            GenericArrayType genericArrayType2 = (GenericArrayType)type2;
            return b.a(genericArrayType.getGenericComponentType(), genericArrayType2.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType)type;
            WildcardType wildcardType2 = (WildcardType)type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (type instanceof TypeVariable) {
            if (!(type2 instanceof TypeVariable)) {
                return false;
            }
            TypeVariable typeVariable = (TypeVariable)type;
            TypeVariable typeVariable2 = (TypeVariable)type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
        return false;
    }

    private static int b(Object object) {
        return object != null ? object.hashCode() : 0;
    }

    public static String f(Type type) {
        return type instanceof Class ? ((Class)type).getName() : type.toString();
    }

    static Type a(Type type, Class object, Class class_) {
        Object object2;
        if (class_ == object) {
            return type;
        }
        if (class_.isInterface()) {
            object2 = ((Class)object).getInterfaces();
            int n2 = ((Class<?>[])object2).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (object2[i2] == class_) {
                    return ((Class)object).getGenericInterfaces()[i2];
                }
                if (!class_.isAssignableFrom(object2[i2])) continue;
                return b.a(((Class)object).getGenericInterfaces()[i2], (Class)object2[i2], class_);
            }
        }
        if (!((Class)object).isInterface()) {
            while (object != Object.class) {
                object2 = ((Class)object).getSuperclass();
                if (object2 == class_) {
                    return ((Class)object).getGenericSuperclass();
                }
                if (class_.isAssignableFrom((Class<?>)object2)) {
                    return b.a(((Class)object).getGenericSuperclass(), object2, class_);
                }
                object = object2;
            }
        }
        return class_;
    }

    static Type b(Type type, Class class_, Class class_2) {
        com.a.b.b.a.a(class_2.isAssignableFrom(class_));
        return b.a(type, class_, b.a(type, class_, class_2));
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType)type).getGenericComponentType() : ((Class)type).getComponentType();
    }

    public static Type a(Type type, Class class_) {
        Type type2 = b.b(type, class_, Collection.class);
        if (type2 instanceof WildcardType) {
            type2 = ((WildcardType)type2).getUpperBounds()[0];
        }
        if (type2 instanceof ParameterizedType) {
            return ((ParameterizedType)type2).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] b(Type type, Class class_) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type type2 = b.b(type, class_, Map.class);
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type2;
            return parameterizedType.getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type a(Type type, Class class_, Type type2) {
        Type type3;
        while (type2 instanceof TypeVariable) {
            type3 = (TypeVariable)type2;
            if ((type2 = b.a(type, class_, (TypeVariable)type3)) != type3) continue;
            return type2;
        }
        if (type2 instanceof Class && ((Class)type2).isArray()) {
            Type type4;
            type3 = (Class)type2;
            Class<?> class_2 = ((Class)type3).getComponentType();
            return class_2 == (type4 = b.a(type, class_, class_2)) ? type3 : b.a(type4);
        }
        if (type2 instanceof GenericArrayType) {
            Type type5;
            type3 = (GenericArrayType)type2;
            Type type6 = type3.getGenericComponentType();
            return type6 == (type5 = b.a(type, class_, type6)) ? type3 : b.a(type5);
        }
        if (type2 instanceof ParameterizedType) {
            type3 = (ParameterizedType)type2;
            Type type7 = type3.getOwnerType();
            Type type8 = b.a(type, class_, type7);
            boolean bl2 = type8 != type7;
            Type[] arrtype = type3.getActualTypeArguments();
            int n2 = arrtype.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Type type9 = b.a(type, class_, arrtype[i2]);
                if (type9 == arrtype[i2]) continue;
                if (!bl2) {
                    arrtype = (Type[])arrtype.clone();
                    bl2 = true;
                }
                arrtype[i2] = type9;
            }
            return bl2 ? b.a(type8, type3.getRawType(), arrtype) : type3;
        }
        if (type2 instanceof WildcardType) {
            Type type10;
            type3 = (WildcardType)type2;
            Type[] arrtype = type3.getLowerBounds();
            Type[] arrtype2 = type3.getUpperBounds();
            if (arrtype.length == 1) {
                Type type11 = b.a(type, class_, arrtype[0]);
                if (type11 != arrtype[0]) {
                    return b.c(type11);
                }
            } else if (arrtype2.length == 1 && (type10 = b.a(type, class_, arrtype2[0])) != arrtype2[0]) {
                return b.b(type10);
            }
            return type3;
        }
        return type2;
    }

    static Type a(Type type, Class class_, TypeVariable typeVariable) {
        Class class_2 = b.a(typeVariable);
        if (class_2 == null) {
            return typeVariable;
        }
        Type type2 = b.a(type, class_, class_2);
        if (type2 instanceof ParameterizedType) {
            int n2 = b.a(class_2.getTypeParameters(), (Object)typeVariable);
            return ((ParameterizedType)type2).getActualTypeArguments()[n2];
        }
        return typeVariable;
    }

    private static int a(Object[] arrobject, Object object) {
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            if (!object.equals(arrobject[i2])) continue;
            return i2;
        }
        throw new NoSuchElementException();
    }

    private static Class a(TypeVariable typeVariable) {
        Object d2 = typeVariable.getGenericDeclaration();
        return d2 instanceof Class ? (Class)d2 : null;
    }

    private static void i(Type type) {
        com.a.b.b.a.a(!(type instanceof Class) || !((Class)type).isPrimitive());
    }

    static /* synthetic */ void h(Type type) {
        b.i(type);
    }

    static /* synthetic */ int a(Object object) {
        return b.b(object);
    }
}

