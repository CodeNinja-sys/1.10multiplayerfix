/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.a;
import com.a.b.b.b;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class d
implements Serializable,
ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;
    private static final long d = 0L;

    public d(Type type, Type type2, Type ... arrtype) {
        if (type2 instanceof Class) {
            Class class_ = (Class)type2;
            com.a.b.b.a.a(type != null || class_.getEnclosingClass() == null);
            com.a.b.b.a.a(type == null || class_.getEnclosingClass() != null);
        }
        this.a = type == null ? null : com.a.b.b.b.d(type);
        this.b = com.a.b.b.b.d(type2);
        this.c = (Type[])arrtype.clone();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            com.a.b.b.a.a(this.c[i2]);
            com.a.b.b.b.h(this.c[i2]);
            this.c[i2] = com.a.b.b.b.d(this.c[i2]);
        }
    }

    public Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    public Type getRawType() {
        return this.b;
    }

    public Type getOwnerType() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof ParameterizedType && com.a.b.b.b.a((Type)this, (ParameterizedType)object);
    }

    public int hashCode() {
        return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ com.a.b.b.b.a((Object)this.a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(30 * (this.c.length + 1));
        stringBuilder.append(com.a.b.b.b.f(this.b));
        if (this.c.length == 0) {
            return stringBuilder.toString();
        }
        stringBuilder.append("<").append(com.a.b.b.b.f(this.c[0]));
        for (int i2 = 1; i2 < this.c.length; ++i2) {
            stringBuilder.append(", ").append(com.a.b.b.b.f(this.c[i2]));
        }
        return stringBuilder.append(">").toString();
    }
}

