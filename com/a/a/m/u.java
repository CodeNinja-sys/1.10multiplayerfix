/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class u {
    u() {
    }

    final Type a() {
        Type type = this.getClass().getGenericSuperclass();
        cl.a(type instanceof ParameterizedType, "%s isn't parameterized", new Object[]{type});
        return ((ParameterizedType)type).getActualTypeArguments()[0];
    }
}

