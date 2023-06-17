/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.j;

import org.apache.commons.c.j.f;

public class d
extends f {
    private static final long d = 1L;
    public Object a;
    public Object b;
    public Object c;

    public static d a(Object object, Object object2, Object object3) {
        return new d(object, object2, object3);
    }

    public d() {
    }

    public d(Object object, Object object2, Object object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    @Override
    public Object a() {
        return this.a;
    }

    public void a(Object object) {
        this.a = object;
    }

    @Override
    public Object b() {
        return this.b;
    }

    public void b(Object object) {
        this.b = object;
    }

    @Override
    public Object c() {
        return this.c;
    }

    public void c(Object object) {
        this.c = object;
    }
}

