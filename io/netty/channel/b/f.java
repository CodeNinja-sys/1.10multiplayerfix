/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.channel.an;
import io.netty.channel.b.e;
import io.netty.channel.b.g;
import io.netty.channel.b.h;
import io.netty.channel.b.i;
import io.netty.channel.b.j;
import io.netty.channel.b.k;
import io.netty.channel.dh;

public final class f {
    private static final e a = new g();
    private static final e b = f.a(dh.class);
    private static final e c = f.b(dh.class);

    private f() {
    }

    public static e a() {
        return a;
    }

    public static e a(an an2) {
        return f.a(f.b(an2));
    }

    public static e b(an an2) {
        return new j(an2);
    }

    public static e a(Class class_) {
        return new h(class_);
    }

    public static e b(Class class_) {
        return f.a(f.a(class_));
    }

    public static e b() {
        return b;
    }

    public static e c() {
        return c;
    }

    public static e a(e e2) {
        return new k(e2);
    }

    public static e a(e ... arre) {
        if (arre.length < 1) {
            throw new IllegalArgumentException("matchers must at least contain one element");
        }
        if (arre.length == 1) {
            return arre[0];
        }
        return new i(arre);
    }
}

