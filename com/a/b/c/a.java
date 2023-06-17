/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.c;

import com.a.b.b.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class a {
    final Class a;
    final Type b;
    final int c;

    protected a() {
        this.b = com.a.b.c.a.a(this.getClass());
        this.a = com.a.b.b.b.e(this.b);
        this.c = this.b.hashCode();
    }

    a(Type type) {
        this.b = com.a.b.b.b.d((Type)com.a.b.b.a.a(type));
        this.a = com.a.b.b.b.e(this.b);
        this.c = this.b.hashCode();
    }

    static Type a(Class class_) {
        Type type = class_.getGenericSuperclass();
        if (type instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterizedType = (ParameterizedType)type;
        return com.a.b.b.b.d(parameterizedType.getActualTypeArguments()[0]);
    }

    public final Class a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public boolean b(Class class_) {
        return this.a(class_);
    }

    public boolean a(Type type) {
        if (type == null) {
            return false;
        }
        if (this.b.equals(type)) {
            return true;
        }
        if (this.b instanceof Class) {
            return this.a.isAssignableFrom(com.a.b.b.b.e(type));
        }
        if (this.b instanceof ParameterizedType) {
            return com.a.b.c.a.a(type, (ParameterizedType)this.b, new HashMap());
        }
        if (this.b instanceof GenericArrayType) {
            return this.a.isAssignableFrom(com.a.b.b.b.e(type)) && com.a.b.c.a.a(type, (GenericArrayType)this.b);
        }
        throw com.a.b.c.a.a(this.b, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public boolean a(a a2) {
        return this.a(a2.b());
    }

    private static boolean a(Type type, GenericArrayType genericArrayType) {
        Type type2 = genericArrayType.getGenericComponentType();
        if (type2 instanceof ParameterizedType) {
            Type type3 = type;
            if (type instanceof GenericArrayType) {
                type3 = ((GenericArrayType)type).getGenericComponentType();
            } else if (type instanceof Class) {
                Class<?> class_ = (Class<?>)type;
                while (class_.isArray()) {
                    class_ = class_.getComponentType();
                }
                type3 = class_;
            }
            return com.a.b.c.a.a(type3, (ParameterizedType)type2, new HashMap());
        }
        return true;
    }

    private static boolean a(Type type, ParameterizedType parameterizedType, Map map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class class_ = com.a.b.b.b.e(type);
        ParameterizedType parameterizedType2 = null;
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType)type;
        }
        if (parameterizedType2 != null) {
            Type[] object = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<T>>[] arrtypeVariable = class_.getTypeParameters();
            for (int i2 = 0; i2 < object.length; ++i2) {
                Type type2 = object[i2];
                TypeVariable typeVariable = arrtypeVariable[i2];
                while (type2 instanceof TypeVariable) {
                    TypeVariable typeVariable2 = (TypeVariable)type2;
                    type2 = (Type)map.get(typeVariable2.getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (com.a.b.c.a.a(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type2 : class_.getGenericInterfaces()) {
            if (!com.a.b.c.a.a(type2, parameterizedType, new HashMap(map))) continue;
            return true;
        }
        Type type3 = class_.getGenericSuperclass();
        return com.a.b.c.a.a(type3, parameterizedType, new HashMap(map));
    }

    private static boolean a(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        if (parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            Type[] arrtype = parameterizedType.getActualTypeArguments();
            Type[] arrtype2 = parameterizedType2.getActualTypeArguments();
            for (int i2 = 0; i2 < arrtype.length; ++i2) {
                if (com.a.b.c.a.a(arrtype[i2], arrtype2[i2], map)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private static AssertionError a(Type type, Class ... arrclass) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class class_ : arrclass) {
            stringBuilder.append(class_.getName()).append(", ");
        }
        stringBuilder.append("but got: ").append(type.getClass().getName()).append(", for type token: ").append(type.toString()).append('.');
        return new AssertionError((Object)stringBuilder.toString());
    }

    private static boolean a(Type type, Type type2, Map map) {
        return type2.equals(type) || type instanceof TypeVariable && type2.equals(map.get(((TypeVariable)type).getName()));
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object object) {
        return object instanceof a && com.a.b.b.b.a(this.b, ((a)object).b);
    }

    public final String toString() {
        return com.a.b.b.b.f(this.b);
    }

    public static a b(Type type) {
        return new a(type);
    }

    public static a c(Class class_) {
        return new a(class_);
    }
}

