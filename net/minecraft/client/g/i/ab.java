/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.bq;
import net.minecraft.client.g.i.a.a;
import net.minecraft.client.g.i.a.i;
import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.a.n;
import net.minecraft.client.g.i.a.v;
import net.minecraft.client.g.i.a.x;
import net.minecraft.client.g.i.a.z;
import net.minecraft.client.g.i.al;
import net.minecraft.client.g.i.f;
import net.minecraft.client.h.d;
import net.minecraft.client.j.ap;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.m.av;
import net.minecraft.m.cu;
import net.minecraft.u.ai;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.w.l;

public class ab
extends al {
    private final boolean a;

    public ab(f f2) {
        this(f2, false);
    }

    public ab(f f2, boolean bl2) {
        super(f2, new net.minecraft.client.j.f(0.0f, bl2), 0.5f);
        this.a = bl2;
        this.a(new x(this));
        this.a(new j(this));
        this.a(new n(this));
        this.a(new a(this));
        this.a(new v(this));
        this.a(new z(this.e().a));
        this.a(new i(this));
    }

    public net.minecraft.client.j.f e() {
        return (net.minecraft.client.j.f)super.f();
    }

    public void a(net.minecraft.client.h.a a2, double d2, double d3, double d4, float f2, float f3) {
        if (!a2.u() || this.c.c == a2) {
            double d5 = d3;
            if (a2.G() && !(a2 instanceof d)) {
                d5 = d3 - 0.125;
            }
            this.d(a2);
            bd.a(bq.b);
            super.a(a2, d2, d5, d4, f2, f3);
            bd.b(bq.b);
        }
    }

    private void d(net.minecraft.client.h.a a2) {
        net.minecraft.client.j.f f2 = this.e();
        if (a2.a()) {
            f2.a(false);
            f2.a.j = true;
            f2.b.j = true;
        } else {
            av av2;
            cu cu2 = a2.bC();
            cu cu3 = a2.bD();
            f2.a(true);
            f2.b.j = a2.a(net.minecraft.w.a.j.g);
            f2.o.j = a2.a(net.minecraft.w.a.j.b);
            f2.m.j = a2.a(net.minecraft.w.a.j.e);
            f2.n.j = a2.a(net.minecraft.w.a.j.f);
            f2.k.j = a2.a(net.minecraft.w.a.j.c);
            f2.l.j = a2.a(net.minecraft.w.a.j.d);
            f2.j = a2.G();
            net.minecraft.client.j.z z2 = net.minecraft.client.j.z.a;
            net.minecraft.client.j.z z3 = net.minecraft.client.j.z.a;
            if (cu2 != null) {
                z2 = net.minecraft.client.j.z.b;
                if (a2.bS() > 0) {
                    av2 = cu2.m();
                    if (av2 == av.d) {
                        z2 = net.minecraft.client.j.z.c;
                    } else if (av2 == av.e) {
                        z2 = net.minecraft.client.j.z.d;
                    }
                }
            }
            if (cu3 != null) {
                z3 = net.minecraft.client.j.z.b;
                if (a2.bS() > 0 && (av2 = cu3.m()) == av.d) {
                    z3 = net.minecraft.client.j.z.c;
                }
            }
            if (a2.aH() == ai.b) {
                f2.i = z2;
                f2.h = z3;
            } else {
                f2.i = z3;
                f2.h = z2;
            }
        }
    }

    protected bp a(net.minecraft.client.h.a a2) {
        return a2.g();
    }

    @Override
    public void a() {
        bd.c(0.0f, 0.1875f, 0.0f);
    }

    protected void a(net.minecraft.client.h.a a2, float f2) {
        float f3 = 0.9375f;
        bd.b(0.9375f, 0.9375f, 0.9375f);
    }

    protected void a(net.minecraft.client.h.a a2, double d2, double d3, double d4, String string, double d5) {
        r r2;
        net.minecraft.j.j j2;
        if (d5 < 100.0 && (j2 = (r2 = a2.az()).a(2)) != null) {
            p p2 = r2.c(a2.X(), j2);
            this.a((net.minecraft.w.n)a2, String.valueOf(p2.b()) + " " + j2.d(), d2, d3, d4, 64);
            d3 += (double)((float)this.b().a * 1.15f * 0.025f);
        }
        super.a((net.minecraft.w.n)a2, d2, d3, d4, string, d5);
    }

    public void b(net.minecraft.client.h.a a2) {
        float f2 = 1.0f;
        bd.d(1.0f, 1.0f, 1.0f);
        float f3 = 0.0625f;
        net.minecraft.client.j.f f4 = this.e();
        this.d(a2);
        bd.l();
        f4.p = 0.0f;
        f4.j = false;
        f4.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, a2);
        f4.d.f = 0.0f;
        f4.d.a(0.0625f);
        f4.l.f = 0.0f;
        f4.l.a(0.0625f);
        bd.k();
    }

    public void c(net.minecraft.client.h.a a2) {
        float f2 = 1.0f;
        bd.d(1.0f, 1.0f, 1.0f);
        float f3 = 0.0625f;
        net.minecraft.client.j.f f4 = this.e();
        this.d(a2);
        bd.l();
        f4.j = false;
        f4.p = 0.0f;
        f4.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, a2);
        f4.e.f = 0.0f;
        f4.e.a(0.0625f);
        f4.k.f = 0.0f;
        f4.k.a(0.0625f);
        bd.k();
    }

    protected void a(net.minecraft.client.h.a a2, double d2, double d3, double d4) {
        if (a2.br() && a2.ae()) {
            super.a((l)a2, d2 + (double)a2.G, d3 + (double)a2.H, d4 + (double)a2.I);
        } else {
            super.a((l)a2, d2, d3, d4);
        }
    }

    protected void a(net.minecraft.client.h.a a2, float f2, float f3, float f4) {
        if (a2.br() && a2.ae()) {
            bd.b(a2.ad(), 0.0f, 1.0f, 0.0f);
            bd.b(this.c((l)a2), 0.0f, 0.0f, 1.0f);
            bd.b(270.0f, 0.0f, 1.0f, 0.0f);
        } else if (a2.bW()) {
            super.a((l)a2, f2, f3, f4);
            float f5 = (float)a2.bX() + f4;
            float f6 = net.minecraft.u.b.n.a(f5 * f5 / 100.0f, 0.0f, 1.0f);
            bd.b(f6 * (-90.0f - a2.bb), 1.0f, 0.0f, 0.0f);
            s s2 = a2.i(f4);
            double d2 = a2.aX * a2.aX + a2.aZ * a2.aZ;
            double d3 = s2.b * s2.b + s2.d * s2.d;
            if (d2 > 0.0 && d3 > 0.0) {
                double d4 = (a2.aX * s2.b + a2.aZ * s2.d) / (Math.sqrt(d2) * Math.sqrt(d3));
                double d5 = a2.aX * s2.d - a2.aZ * s2.b;
                bd.b((float)(Math.signum(d5) * Math.acos(d4)) * 180.0f / (float)Math.PI, 0.0f, 1.0f, 0.0f);
            }
        } else {
            super.a((l)a2, f2, f3, f4);
        }
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.client.h.a)n2);
    }

    @Override
    public /* synthetic */ ap f() {
        return this.e();
    }
}

