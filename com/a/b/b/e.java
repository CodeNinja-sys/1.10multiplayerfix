/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.a;
import com.a.b.b.b;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class e
implements Serializable,
WildcardType {
    private final Type a;
    private final Type b;
    private static final long c = 0L;

    public e(Type[] arrtype, Type[] arrtype2) {
        com.a.b.b.a.a(arrtype2.length <= 1);
        com.a.b.b.a.a(arrtype.length == 1);
        if (arrtype2.length == 1) {
            com.a.b.b.a.a(arrtype2[0]);
            com.a.b.b.b.h(arrtype2[0]);
            com.a.b.b.a.a(arrtype[0] == Object.class);
            this.b = com.a.b.b.b.d(arrtype2[0]);
            this.a = Object.class;
        } else {
            com.a.b.b.a.a(arrtype[0]);
            com.a.b.b.b.h(arrtype[0]);
            this.b = null;
            this.a = com.a.b.b.b.d(arrtype[0]);
        }
    }

    public Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public Type[] getLowerBounds() {
        Type[] arrtype;
        if (this.b != null) {
            Type[] arrtype2 = new Type[1];
            arrtype = arrtype2;
            arrtype2[0] = this.b;
        } else {
            arrtype = com.a.b.b.b.a;
        }
        return arrtype;
    }

    public boolean equals(Object object) {
        return object instanceof WildcardType && com.a.b.b.b.a((Type)this, (WildcardType)object);
    }

    public int hashCode() {
        return (this.b != null ? 31 + this.b.hashCode() : 1) ^ 31 + this.a.hashCode();
    }

    public String toString() {
        if (this.b != null) {
            return "? super " + com.a.b.b.b.f(this.b);
        }
        if (this.a == Object.class) {
            return "?";
        }
        return "? extends " + com.a.b.b.b.f(this.a);
    }
}

