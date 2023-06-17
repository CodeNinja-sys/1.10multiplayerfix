/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import net.minecraft.u.b.b;

public class a {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final net.minecraft.u.b.a f;

    public a(int n2, int n3, int n4, int n5, boolean bl2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = bl2;
        this.f = new net.minecraft.u.b.a(n2 - n4, 0.0, n3 - n4, n2 + n4, 256.0, n3 + n4);
    }

    public boolean a(b b2) {
        int n2 = this.a - this.c;
        int n3 = this.b - this.c;
        return b2.cy_() == (n2 & 0xFFFFFFF0) && b2.l() == (n3 & 0xFFFFFFF0);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public net.minecraft.u.b.a f() {
        return this.f;
    }
}

