/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.b.g;
import net.minecraft.u.b.s;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.n;
import net.minecraft.w.t;

public class ah
extends bm {
    private final t b;
    protected double a;
    private double c;
    private double d;
    private double e;

    public ah(t t2, double d2) {
        this.b = t2;
        this.a = d2;
        this.b(1);
    }

    @Override
    public boolean e() {
        if (this.b.be() == null && !this.b.cy()) {
            return false;
        }
        if (!this.b.cy()) {
            s s2 = af.a(this.b, 5, 4);
            if (s2 == null) {
                return false;
            }
            this.c = s2.b;
            this.d = s2.c;
            this.e = s2.d;
            return true;
        }
        net.minecraft.u.b.b b2 = this.a(this.b.aQ, this.b, 5, 4);
        if (b2 == null) {
            return false;
        }
        this.c = b2.cy_();
        this.d = b2.k();
        this.e = b2.l();
        return true;
    }

    @Override
    public void b() {
        this.b.N().a(this.c, this.d, this.e, this.a);
    }

    @Override
    public boolean a() {
        return !this.b.N().l();
    }

    private net.minecraft.u.b.b a(k k2, n n2, int n3, int n4) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2);
        g g2 = new g();
        int n5 = b2.cy_();
        int n6 = b2.k();
        int n7 = b2.l();
        float f2 = n3 * n3 * n4 * 2;
        net.minecraft.u.b.b b3 = null;
        for (int i2 = n5 - n3; i2 <= n5 + n3; ++i2) {
            for (int i3 = n6 - n4; i3 <= n6 + n4; ++i3) {
                for (int i4 = n7 - n3; i4 <= n7 + n3; ++i4) {
                    float f3;
                    g2.b(i2, i3, i4);
                    b b4 = k2.n(g2);
                    cn cn2 = b4.c();
                    if (cn2 != p.j && cn2 != p.i || !((f3 = (float)((i2 - n5) * (i2 - n5) + (i3 - n6) * (i3 - n6) + (i4 - n7) * (i4 - n7))) < f2)) continue;
                    f2 = f3;
                    b3 = new net.minecraft.u.b.b(g2);
                }
            }
        }
        return b3;
    }
}

