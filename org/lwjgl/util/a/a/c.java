/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.d;
import org.lwjgl.util.a.a.e;

class c {
    e a;
    Object b;
    d c;

    private c() {
    }

    static c a(Object object, d d2) {
        c c2 = new c();
        c2.a = new e();
        c2.a.a = null;
        c2.a.b = c2.a;
        c2.a.c = c2.a;
        c2.b = object;
        c2.c = d2;
        return c2;
    }

    static void a(c c2) {
        c2.a = null;
        c2.b = null;
        c2.c = null;
    }

    static e a(c c2, Object object) {
        return org.lwjgl.util.a.a.c.a(c2, c2.a, object);
    }

    static e a(c c2, e e2, Object object) {
        do {
            e2 = e2.c;
        } while (e2.a != null && !c2.c.a(c2.b, e2.a, object));
        e e3 = new e();
        e3.a = object;
        e3.b = e2.b;
        e2.b.c = e3;
        e3.c = e2;
        e2.b = e3;
        return e3;
    }

    static Object a(e e2) {
        return e2.a;
    }

    static e b(e e2) {
        return e2.b;
    }

    static e c(e e2) {
        return e2.c;
    }

    static e b(c c2) {
        return c2.a.b;
    }

    static e c(c c2) {
        return c2.a.c;
    }

    static void a(c c2, e e2) {
        e2.b.c = e2.c;
        e2.c.b = e2.b;
    }

    static e b(c c2, Object object) {
        e e2 = c2.a;
        do {
            e2 = e2.b;
        } while (e2.a != null && !c2.c.a(c2.b, object, e2.a));
        return e2;
    }
}

