/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.c.b;
import net.minecraft.g.dj;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.t;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bu;
import net.minecraft.w.f.f;
import net.minecraft.w.f.m;
import net.minecraft.w.n;

public class c
extends f {
    private int a = -1;

    public c(k k2) {
        super(k2);
    }

    public c(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        f.a(a2, "MinecartTNT");
    }

    @Override
    public m a() {
        return m.d;
    }

    @Override
    public b c() {
        return p.W.v();
    }

    @Override
    public void cE_() {
        double d2;
        super.cE_();
        if (this.a > 0) {
            --this.a;
            this.aQ.a(aj.l, this.aU, this.aV + 0.5, this.aW, 0.0, 0.0, 0.0, new int[0]);
        } else if (this.a == 0) {
            this.c(this.aX * this.aX + this.aZ * this.aZ);
        }
        if (this.bf && (d2 = this.aX * this.aX + this.aZ * this.aZ) >= (double)0.01f) {
            this.c(d2);
        }
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        net.minecraft.w.c.f f3;
        n n3 = n2.i();
        if (n3 instanceof net.minecraft.w.c.f && (f3 = (net.minecraft.w.c.f)n3).cy()) {
            this.c(f3.aX * f3.aX + f3.aY * f3.aY + f3.aZ * f3.aZ);
        }
        return super.a(n2, f2);
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        double d2 = this.aX * this.aX + this.aZ * this.aZ;
        if (!n2.c() && this.aQ.G().b("doEntityDrops")) {
            this.a(new cu(p.W, 1), 0.0f);
        }
        if (n2.o() || n2.c() || d2 >= (double)0.01f) {
            this.c(d2);
        }
    }

    protected void c(double d2) {
        if (!this.aQ.C) {
            double d3 = Math.sqrt(d2);
            if (d3 > 5.0) {
                d3 = 5.0;
            }
            this.aQ.a(this, this.aU, this.aV, this.aW, (float)(4.0 + this.bx.nextDouble() * 1.5 * d3), true);
            this.aa();
        }
    }

    @Override
    public void c(float f2, float f3) {
        if (f2 >= 3.0f) {
            float f4 = f2 / 10.0f;
            this.c(f4 * f4);
        }
        super.c(f2, f3);
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.a < 0) {
            this.f();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.f();
        } else {
            super.a(by2);
        }
    }

    public void f() {
        this.a = 80;
        if (!this.aQ.C) {
            this.aQ.a((n)this, (byte)10);
            if (!this.ch()) {
                this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.gz, net.minecraft.u.bu.e, 1.0f, 1.0f);
            }
        }
    }

    public int g() {
        return this.a;
    }

    public boolean i() {
        return this.a > -1;
    }

    @Override
    public float a(t t2, k k2, net.minecraft.u.b.b b2, b b3) {
        return !this.i() || !dj.l(b3) && !dj.c(k2, b2.b()) ? super.a(t2, k2, b2, b3) : 0.0f;
    }

    @Override
    public boolean a(t t2, k k2, net.minecraft.u.b.b b2, b b3, float f2) {
        return !this.i() || !dj.l(b3) && !dj.c(k2, b2.b()) ? super.a(t2, k2, b2, b3, f2) : false;
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        if (e2.b("TNTFuse", 99)) {
            this.a = e2.h("TNTFuse");
        }
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("TNTFuse", this.a);
    }
}

