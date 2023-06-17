/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.sz;
import com.a.a.m.ay;
import com.a.a.m.bo;
import com.a.a.m.x;
import com.a.a.m.y;
import com.a.a.m.z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;

public final class w {
    private final z a;

    public w() {
        this.a = new z();
    }

    private w(z z2) {
        this.a = z2;
    }

    static w a(Type type) {
        return new w().a(y.a(type));
    }

    public w a(Type type, Type type2) {
        HashMap hashMap = sz.c();
        w.b(hashMap, (Type)cl.a(type), (Type)cl.a(type2));
        return this.a(hashMap);
    }

    w a(Map map) {
        return new w(this.a.a(map));
    }

    private static void b(Map map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new x(map, type2).a(type);
    }

    public Type b(Type type) {
        cl.a(type);
        if (type instanceof TypeVariable) {
            return this.a.a((TypeVariable)type);
        }
        if (type instanceof ParameterizedType) {
            return this.a((ParameterizedType)type);
        }
        if (type instanceof GenericArrayType) {
            return this.a((GenericArrayType)type);
        }
        if (type instanceof WildcardType) {
            return this.a((WildcardType)type);
        }
        return type;
    }

    private Type[] a(Type[] arrtype) {
        Type[] arrtype2 = new Type[arrtype.length];
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            arrtype2[i2] = this.b(arrtype[i2]);
        }
        return arrtype2;
    }

    private WildcardType a(WildcardType wildcardType) {
        Type[] arrtype = wildcardType.getLowerBounds();
        Type[] arrtype2 = wildcardType.getUpperBounds();
        return new bo(this.a(arrtype), this.a(arrtype2));
    }

    private Type a(GenericArrayType genericArrayType) {
        Type type = genericArrayType.getGenericComponentType();
        Type type2 = this.b(type);
        return ay.a(type2);
    }

    private ParameterizedType a(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getOwnerType();
        Type type2 = type == null ? null : this.b(type);
        Type type3 = this.b(parameterizedType.getRawType());
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        Type[] arrtype2 = this.a(arrtype);
        return ay.a(type2, (Class)type3, arrtype2);
    }

    private static Object b(Class class_, Object object) {
        try {
            return class_.cast(object);
        }
        catch (ClassCastException classCastException) {
            throw new IllegalArgumentException(object + " is not a " + class_.getSimpleName());
        }
    }

    static /* synthetic */ Object a(Class class_, Object object) {
        return w.b(class_, object);
    }

    static /* synthetic */ void a(Map map, Type type, Type type2) {
        w.b(map, type, type2);
    }

    /* synthetic */ w(z z2, x x2) {
        this(z2);
    }

    static /* synthetic */ Type[] a(w w2, Type[] arrtype) {
        return w2.a(arrtype);
    }
}

