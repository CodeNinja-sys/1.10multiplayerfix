/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.q.f.b;
import net.minecraft.q.f.d;

public class e {
    private final int a;
    private int b;
    private int c;
    private final d d;
    private b e;
    private b f;

    public e(int n2, boolean bl2) {
        this.a = n2;
        this.d = new d();
        this.e = new b();
        if (bl2) {
            this.f = new b();
        }
    }

    public net.minecraft.g.c.b a(int n2, int n3, int n4) {
        return this.d.a(n2, n3, n4);
    }

    public void a(int n2, int n3, int n4, net.minecraft.g.c.b b2) {
        net.minecraft.g.c.b b3 = this.a(n2, n3, n4);
        cn cn2 = b3.c();
        cn cn3 = b2.c();
        if (cn2 != p.a) {
            --this.b;
            if (cn2.m()) {
                --this.c;
            }
        }
        if (cn3 != p.a) {
            ++this.b;
            if (cn3.m()) {
                ++this.c;
            }
        }
        this.d.a(n2, n3, n4, b2);
    }

    public boolean a() {
        return this.b == 0;
    }

    public boolean b() {
        return this.c > 0;
    }

    public int c() {
        return this.a;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.f.a(n2, n3, n4, n5);
    }

    public int b(int n2, int n3, int n4) {
        return this.f.a(n2, n3, n4);
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.e.a(n2, n3, n4, n5);
    }

    public int c(int n2, int n3, int n4) {
        return this.e.a(n2, n3, n4);
    }

    public void d() {
        this.b = 0;
        this.c = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    cn cn2 = this.a(i2, i3, i4).c();
                    if (cn2 == p.a) continue;
                    ++this.b;
                    if (!cn2.m()) continue;
                    ++this.c;
                }
            }
        }
    }

    public d e() {
        return this.d;
    }

    public b f() {
        return this.e;
    }

    public b g() {
        return this.f;
    }

    public void a(b b2) {
        this.e = b2;
    }

    public void b(b b2) {
        this.f = b2;
    }
}

