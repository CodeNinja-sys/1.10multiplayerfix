/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.i.g;
import net.minecraft.i.i;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.c.o;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;
import net.minecraft.w.l;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class h
extends k {
    private static final d b = org.apache.logging.log4j.c.c();
    private int c;
    private i d;
    private s e;
    private l f;
    private boolean g;

    public h(a a2) {
        super(a2);
    }

    @Override
    public void b() {
        if (this.f == null) {
            b.f("Skipping player strafe phase because no player was found");
            this.a.p().a(j.a);
        } else {
            double d2;
            double d3;
            double d4;
            if (this.d != null && this.d.b()) {
                d4 = this.f.aU;
                d3 = this.f.aW;
                double d5 = d4 - this.a.aU;
                double d6 = d3 - this.a.aW;
                d2 = n.a(d5 * d5 + d6 * d6);
                double d7 = Math.min((double)0.4f + d2 / 80.0 - 1.0, 10.0);
                this.e = new s(d4, this.f.aV + d7, d3);
            }
            double d8 = d4 = this.e == null ? 0.0 : this.e.c(this.a.aU, this.a.aV, this.a.aW);
            if (d4 < 100.0 || d4 > 22500.0) {
                this.j();
            }
            d3 = 64.0;
            if (this.f.n(this.a) < 4096.0) {
                if (this.a.l(this.f)) {
                    ++this.c;
                    s s2 = new s(this.f.aU - this.a.aU, 0.0, this.f.aW - this.a.aW).a();
                    s s3 = new s(n.a(this.a.ba * ((float)Math.PI / 180)), 0.0, -n.b(this.a.ba * ((float)Math.PI / 180))).a();
                    float f2 = (float)s3.b(s2);
                    float f3 = (float)(Math.acos(f2) * 57.29577951308232);
                    f3 += 0.5f;
                    if (this.c >= 5 && f3 >= 0.0f && f3 < 10.0f) {
                        d2 = 1.0;
                        s s4 = this.a.i(1.0f);
                        double d9 = this.a.e.aU - s4.b * 1.0;
                        double d10 = this.a.e.aV + (double)(this.a.e.bm / 2.0f) + 0.5;
                        double d11 = this.a.e.aW - s4.d * 1.0;
                        double d12 = this.f.aU - d9;
                        double d13 = this.f.aV + (double)(this.f.bm / 2.0f) - (d10 + (double)(this.a.e.bm / 2.0f));
                        double d14 = this.f.aW - d11;
                        this.a.aQ.a(null, 1017, new b(this.a), 0);
                        o o2 = new o(this.a.aQ, this.a, d12, d13, d14);
                        o2.aU = d9;
                        o2.aV = d10;
                        o2.aW = d11;
                        this.a.aQ.a(o2);
                        this.c = 0;
                        if (this.d != null) {
                            while (!this.d.b()) {
                                this.d.a();
                            }
                        }
                        this.a.p().a(j.a);
                    }
                } else if (this.c > 0) {
                    --this.c;
                }
            } else if (this.c > 0) {
                --this.c;
            }
        }
    }

    private void j() {
        if (this.d == null || this.d.b()) {
            int n2;
            int n3 = n2 = this.a.c();
            if (this.a.bd().nextInt(8) == 0) {
                this.g = !this.g;
                n3 = n2 + 6;
            }
            n3 = this.g ? ++n3 : --n3;
            if (this.a.q() != null && this.a.q().c() >= 0) {
                if ((n3 %= 12) < 0) {
                    n3 += 12;
                }
            } else {
                n3 -= 12;
                n3 &= 7;
                n3 += 12;
            }
            this.d = this.a.a(n2, n3, null);
            if (this.d != null) {
                this.d.a();
            }
        }
        this.k();
    }

    private void k() {
        if (this.d != null && !this.d.b()) {
            double d2;
            s s2 = this.d.f();
            this.d.a();
            double d3 = s2.b;
            double d4 = s2.d;
            while (!((d2 = s2.c + (double)(this.a.bd().nextFloat() * 20.0f)) >= s2.c)) {
            }
            this.e = new s(d3, d2, d4);
        }
    }

    @Override
    public void e() {
        this.c = 0;
        this.e = null;
        this.d = null;
        this.f = null;
    }

    public void a(l l2) {
        this.f = l2;
        int n2 = this.a.c();
        int n3 = this.a.l(this.f.aU, this.f.aV, this.f.aW);
        int n4 = n.c(this.f.aU);
        int n5 = n.c(this.f.aW);
        double d2 = (double)n4 - this.a.aU;
        double d3 = (double)n5 - this.a.aW;
        double d4 = n.a(d2 * d2 + d3 * d3);
        double d5 = Math.min((double)0.4f + d4 / 80.0 - 1.0, 10.0);
        int n6 = n.c(this.f.aV + d5);
        g g2 = new g(n4, n6, n5);
        this.d = this.a.a(n2, n3, g2);
        if (this.d != null) {
            this.d.a();
            this.k();
        }
    }

    @Override
    public s f() {
        return this.e;
    }

    @Override
    public j g() {
        return j.b;
    }
}

