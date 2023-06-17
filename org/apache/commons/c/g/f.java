/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.apache.commons.c.ao;
import org.apache.commons.c.g.g;
import org.apache.commons.c.g.m;

public abstract class f
implements m {
    private static final TypeVariable b = f.class.getTypeParameters()[0];
    public final Type a = (Type)ao.a(g.a(this.getClass(), f.class).get(b), "%s does not assign type parameter %s", this.getClass(), g.b(b));
    private final String c = String.format("%s<%s>", f.class.getSimpleName(), g.e(this.a));

    protected f() {
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        return g.c(this.a, f2.a);
    }

    public int hashCode() {
        return 0x250 | this.a.hashCode();
    }

    public String toString() {
        return this.c;
    }

    @Override
    public Type a() {
        return this.a;
    }
}

