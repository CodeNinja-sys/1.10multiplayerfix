/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.b;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class c
implements Serializable,
GenericArrayType {
    private final Type a;
    private static final long b = 0L;

    public c(Type type) {
        this.a = com.a.b.b.b.d(type);
    }

    public Type getGenericComponentType() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof GenericArrayType && com.a.b.b.b.a((Type)this, (GenericArrayType)object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return com.a.b.b.b.f(this.a) + "[]";
    }
}

