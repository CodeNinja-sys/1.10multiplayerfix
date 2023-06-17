/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.g;
import net.minecraft.u.b.s;
import net.minecraft.w.n;
import net.minecraft.x.a;

public class i {
    private final g[] a;
    private g[] b = new g[0];
    private g[] c = new g[0];
    private g d;
    private int e;
    private int f;

    public i(g[] arrg) {
        this.a = arrg;
        this.f = arrg.length;
    }

    public void a() {
        ++this.e;
    }

    public boolean b() {
        return this.e >= this.f;
    }

    public g c() {
        return this.f > 0 ? this.a[this.f - 1] : null;
    }

    public g a(int n2) {
        return this.a[n2];
    }

    public void a(int n2, g g2) {
        this.a[n2] = g2;
    }

    public int d() {
        return this.f;
    }

    public void b(int n2) {
        this.f = n2;
    }

    public int e() {
        return this.e;
    }

    public void c(int n2) {
        this.e = n2;
    }

    public s a(n n2, int n3) {
        double d2 = (double)this.a[n3].a + (double)((int)(n2.bl + 1.0f)) * 0.5;
        double d3 = this.a[n3].b;
        double d4 = (double)this.a[n3].c + (double)((int)(n2.bl + 1.0f)) * 0.5;
        return new s(d2, d3, d4);
    }

    public s a(n n2) {
        return this.a(n2, this.e);
    }

    public s f() {
        g g2 = this.a[this.e];
        return new s(g2.a, g2.b, g2.c);
    }

    public boolean a(i i2) {
        if (i2 == null) {
            return false;
        }
        if (i2.a.length != this.a.length) {
            return false;
        }
        for (int i3 = 0; i3 < this.a.length; ++i3) {
            if (this.a[i3].a == i2.a[i3].a && this.a[i3].b == i2.a[i3].b && this.a[i3].c == i2.a[i3].c) continue;
            return false;
        }
        return true;
    }

    public g[] g() {
        return this.b;
    }

    public g[] h() {
        return this.c;
    }

    public g i() {
        return this.d;
    }

    public static i a(a a2) {
        int n2 = a2.K();
        g g2 = g.a(a2);
        g[] arrg = new g[a2.K()];
        for (int i2 = 0; i2 < arrg.length; ++i2) {
            arrg[i2] = g.a(a2);
        }
        g[] arrg2 = new g[a2.K()];
        for (int i3 = 0; i3 < arrg2.length; ++i3) {
            arrg2[i3] = g.a(a2);
        }
        g[] arrg3 = new g[a2.K()];
        for (int i4 = 0; i4 < arrg3.length; ++i4) {
            arrg3[i4] = g.a(a2);
        }
        i i5 = new i(arrg);
        i5.b = arrg2;
        i5.c = arrg3;
        i5.d = g2;
        i5.e = n2;
        return i5;
    }
}

