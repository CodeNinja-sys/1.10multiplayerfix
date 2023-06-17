/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.j;

import org.apache.commons.c.j.e;

public final class a
extends e {
    private static final long c = 4954918890077093841L;
    public final Object a;
    public final Object b;

    public static a a(Object object, Object object2) {
        return new a(object, object2);
    }

    public a(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    @Override
    public Object f() {
        return this.a;
    }

    @Override
    public Object e() {
        return this.b;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }
}

