/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.c.a.i.a;
import io.netty.c.a.i.b;
import io.netty.c.a.i.c;
import io.netty.c.a.i.m;
import io.netty.c.a.i.n;
import io.netty.util.c.u;
import java.util.HashMap;

public final class d {
    public static c a(ClassLoader classLoader) {
        return new b(d.f(classLoader));
    }

    public static c b(ClassLoader classLoader) {
        return new a(new b(d.f(classLoader)), new n(new HashMap()));
    }

    public static c c(ClassLoader classLoader) {
        return new a(new b(d.f(classLoader)), new m(new HashMap()));
    }

    public static c d(ClassLoader classLoader) {
        return new a(new b(d.f(classLoader)), new n(u.m()));
    }

    public static c e(ClassLoader classLoader) {
        return new a(new b(d.f(classLoader)), new m(u.m()));
    }

    static ClassLoader f(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader classLoader2 = u.o();
        if (classLoader2 != null) {
            return classLoader2;
        }
        return u.a(d.class);
    }

    private d() {
    }
}

