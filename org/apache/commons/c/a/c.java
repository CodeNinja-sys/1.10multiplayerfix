/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.lang.reflect.Type;
import org.apache.commons.c.aa;
import org.apache.commons.c.g.g;
import org.apache.commons.c.j.e;

public abstract class c
extends e {
    private static final long a = 1L;
    private final Type b = (Type)aa.a(g.a(this.getClass(), c.class).get(c.class.getTypeParameters()[0]), Object.class);
    private final String c;

    protected c(String string) {
        this.c = string;
    }

    public final Type a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    @Override
    public final String toString() {
        return String.format("[%s: %s, %s]", this.c, this.f(), this.e());
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException("Cannot alter Diff object.");
    }
}

