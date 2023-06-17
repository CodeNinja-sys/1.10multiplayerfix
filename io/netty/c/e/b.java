/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.a;

public final class b {
    public static final b a = new b(io.netty.c.e.a.a, true);
    public static final b b = new b(io.netty.c.e.a.a, false);
    public static final b c = new b(io.netty.c.e.a.b, true);
    public static final b d = new b(io.netty.c.e.a.b, false);
    public static final b e = new b(io.netty.c.e.a.c, true);
    public static final b f = new b(io.netty.c.e.a.c, false);
    private final a g;
    private final boolean h;

    private b(a a2, boolean bl2) {
        this.g = a2;
        this.h = bl2;
    }

    public a a() {
        return this.g;
    }

    public boolean b() {
        return this.h;
    }
}

