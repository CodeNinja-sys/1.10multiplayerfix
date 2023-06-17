/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.j;

import org.apache.commons.c.j.e;

public class c
extends e {
    private static final long c = 4954918890077093841L;
    public Object a;
    public Object b;

    public static c a(Object object, Object object2) {
        return new c(object, object2);
    }

    public c() {
    }

    public c(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    @Override
    public Object f() {
        return this.a;
    }

    public void a(Object object) {
        this.a = object;
    }

    @Override
    public Object e() {
        return this.b;
    }

    public void b(Object object) {
        this.b = object;
    }

    public Object setValue(Object object) {
        Object object2 = this.e();
        this.b(object);
        return object2;
    }
}

