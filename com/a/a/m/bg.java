/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cc;
import com.a.a.m.ay;
import com.a.a.m.bh;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class bg
implements Serializable,
GenericArrayType {
    private final Type a;
    private static final long b = 0L;

    bg(Type type) {
        this.a = bh.c.b(type);
    }

    @Override
    public Type getGenericComponentType() {
        return this.a;
    }

    public String toString() {
        return ay.d(this.a) + "[]";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType)object;
            return cc.a((Object)this.getGenericComponentType(), (Object)genericArrayType.getGenericComponentType());
        }
        return false;
    }
}

