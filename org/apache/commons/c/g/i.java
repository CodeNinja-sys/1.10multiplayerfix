/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import org.apache.commons.c.g.g;
import org.apache.commons.c.g.h;

final class i
implements GenericArrayType {
    private final Type a;

    private i(Type type) {
        this.a = type;
    }

    @Override
    public Type getGenericComponentType() {
        return this.a;
    }

    public String toString() {
        return g.e(this);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof GenericArrayType && g.a(this, (Type)((GenericArrayType)object));
    }

    public int hashCode() {
        int n2 = 1072;
        return n2 |= this.a.hashCode();
    }

    /* synthetic */ i(Type type, h h2) {
        this(type);
    }
}

