/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.bx;
import com.a.a.b.cl;
import com.a.a.m.ay;
import com.a.a.m.x;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicInteger;

final class ac {
    private final AtomicInteger a = new AtomicInteger();

    private ac() {
    }

    Type a(Type type) {
        cl.a(type);
        if (type instanceof Class) {
            return type;
        }
        if (type instanceof TypeVariable) {
            return type;
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType)type;
            return ay.a(this.a(genericArrayType.getGenericComponentType()));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            return ay.a(this.b(parameterizedType.getOwnerType()), (Class)parameterizedType.getRawType(), this.a(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            Type[] arrtype = wildcardType.getLowerBounds();
            if (arrtype.length == 0) {
                Object[] arrobject = wildcardType.getUpperBounds();
                String string = "capture#" + this.a.incrementAndGet() + "-of ? extends " + bx.a('&').a(arrobject);
                return ay.a(ac.class, string, wildcardType.getUpperBounds());
            }
            return type;
        }
        throw new AssertionError((Object)"must have been one of the known types");
    }

    private Type b(Type type) {
        if (type == null) {
            return null;
        }
        return this.a(type);
    }

    private Type[] a(Type[] arrtype) {
        Type[] arrtype2 = new Type[arrtype.length];
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            arrtype2[i2] = this.a(arrtype[i2]);
        }
        return arrtype2;
    }

    /* synthetic */ ac(x x2) {
        this();
    }
}

