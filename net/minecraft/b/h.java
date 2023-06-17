/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.b;

import net.minecraft.u.ad;
import net.minecraft.u.b.b;

public class h {
    private final b a;
    private final b b;
    private final ad c;
    private int d;
    private boolean e;
    private int f;

    public h(b b2, int n2, int n3, int n4) {
        this(b2, h.a(n2, n3), n4);
    }

    private static ad a(int n2, int n3) {
        return n2 < 0 ? ad.e : (n2 > 0 ? ad.f : (n3 < 0 ? ad.c : ad.d));
    }

    public h(b b2, ad ad2, int n2) {
        this.a = b2;
        this.c = ad2;
        this.b = b2.a(ad2, 2);
        this.d = n2;
    }

    public int a(int n2, int n3, int n4) {
        return (int)this.a.e((double)n2, (double)n3, (double)n4);
    }

    public int a(b b2) {
        return (int)b2.i(this.d());
    }

    public int b(b b2) {
        return (int)this.b.i(b2);
    }

    public boolean c(b b2) {
        int n2 = b2.cy_() - this.a.cy_();
        int n3 = b2.l() - this.a.k();
        return n2 * this.c.h() + n3 * this.c.j() >= 0;
    }

    public void a() {
        this.f = 0;
    }

    public void b() {
        ++this.f;
    }

    public int c() {
        return this.f;
    }

    public b d() {
        return this.a;
    }

    public b e() {
        return this.b;
    }

    public int f() {
        return this.c.h() * 2;
    }

    public int g() {
        return this.c.j() * 2;
    }

    public int h() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public boolean i() {
        return this.e;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    public ad j() {
        return this.c;
    }
}

