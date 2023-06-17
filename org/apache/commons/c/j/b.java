/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.j;

import org.apache.commons.c.j.f;

public final class b
extends f {
    private static final long d = 1L;
    public final Object a;
    public final Object b;
    public final Object c;

    public static b a(Object object, Object object2, Object object3) {
        return new b(object, object2, object3);
    }

    public b(Object object, Object object2, Object object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    @Override
    public Object a() {
        return this.a;
    }

    @Override
    public Object b() {
        return this.b;
    }

    @Override
    public Object c() {
        return this.c;
    }
}

