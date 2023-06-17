/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.d.c;
import net.minecraft.g.a.h;
import net.minecraft.i.e;
import net.minecraft.i.j;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.at;
import net.minecraft.w.e.ba;
import net.minecraft.w.e.bc;
import net.minecraft.w.e.bg;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;
import net.minecraft.x.d.b.ce;

public class g
extends k {
    private static final net.minecraft.x.a.g a = net.minecraft.x.a.o.a(g.class, net.minecraft.x.a.q.a);
    private static final net.minecraft.x.a.g b = net.minecraft.x.a.o.a(g.class, net.minecraft.x.a.q.b);
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private l h;
    private int i;
    private boolean u;
    private az v;

    public g(net.minecraft.q.k k2) {
        super(k2);
        this.k = 10;
        this.d(0.85f, 0.85f);
        this.l = new ba(this);
        this.d = this.c = this.bx.nextFloat();
    }

    @Override
    protected void cA_() {
        net.minecraft.w.b.n n2 = new net.minecraft.w.b.n(this, 1.0);
        this.v = new az(this, 1.0, 80);
        this.o.a(4, new at(this));
        this.o.a(5, n2);
        this.o.a(7, this.v);
        this.o.a(8, new ap(this, b.class, 8.0f));
        this.o.a(8, new ap(this, g.class, 12.0f, 0.01f));
        this.o.a(9, new bh(this));
        this.v.b(3);
        n2.b(3);
        this.p.a(1, new y(this, l.class, 10, true, false, new bg(this)));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.e).a(6.0);
        this.a(net.minecraft.w.d.d).a(0.5);
        this.a(net.minecraft.w.d.b).a(16.0);
        this.a(net.minecraft.w.d.a).a(30.0);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Guardian");
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a(e2.p("Elder"));
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Elder", this.q());
    }

    @Override
    protected j a(net.minecraft.q.k k2) {
        return new e(this, k2);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
        this.bE.a(b, 0);
    }

    private boolean b(int n2) {
        return ((Byte)this.bE.a(a) & n2) != 0;
    }

    private void b(int n2, boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | n2));
        } else {
            this.bE.b(a, (byte)(by2 & ~n2));
        }
    }

    public boolean c() {
        return this.b(2);
    }

    private void c(boolean bl2) {
        this.b(2, bl2);
    }

    public int p() {
        return this.q() ? 60 : 80;
    }

    public boolean q() {
        return this.b(4);
    }

    public void a(boolean bl2) {
        this.b(4, bl2);
        if (bl2) {
            this.d(1.9975f, 1.9975f);
            this.a(net.minecraft.w.d.d).a(0.3f);
            this.a(net.minecraft.w.d.e).a(8.0);
            this.a(net.minecraft.w.d.a).a(80.0);
            this.aJ();
            if (this.v != null) {
                this.v.a(400);
            }
        }
    }

    public void r() {
        this.a(true);
        this.g = this.f = 1.0f;
    }

    private void c(int n2) {
        this.bE.b(b, n2);
    }

    public boolean s() {
        return (Integer)this.bE.a(b) != 0;
    }

    public l t() {
        if (!this.s()) {
            return null;
        }
        if (this.aQ.C) {
            if (this.h != null) {
                return this.h;
            }
            n n2 = this.aQ.a((Integer)this.bE.a(b));
            if (n2 instanceof l) {
                this.h = (l)n2;
                return this.h;
            }
            return null;
        }
        return this.W();
    }

    @Override
    public void a(net.minecraft.x.a.g g2) {
        super.a(g2);
        if (a.equals(g2)) {
            if (this.q() && this.bl < 1.0f) {
                this.d(1.9975f, 1.9975f);
            }
        } else if (b.equals(g2)) {
            this.i = 0;
            this.h = null;
        }
    }

    @Override
    public int ac() {
        return 160;
    }

    @Override
    protected bv j() {
        return this.q() ? (this.cm() ? net.minecraft.a.f.aD : net.minecraft.a.f.aE) : (this.cm() ? net.minecraft.a.f.cg : net.minecraft.a.f.ch);
    }

    @Override
    protected bv cc_() {
        return this.q() ? (this.cm() ? net.minecraft.a.f.aI : net.minecraft.a.f.aJ) : (this.cm() ? net.minecraft.a.f.cm : net.minecraft.a.f.cn);
    }

    @Override
    protected bv cd_() {
        return this.q() ? (this.cm() ? net.minecraft.a.f.aG : net.minecraft.a.f.aH) : (this.cm() ? net.minecraft.a.f.cj : net.minecraft.a.f.ck);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    public float ce_() {
        return this.bm * 0.5f;
    }

    @Override
    public float a(net.minecraft.u.b.b b2) {
        return this.aQ.n(b2).d() == net.minecraft.g.a.h.h ? 10.0f + this.aQ.m(b2) - 0.5f : super.a(b2);
    }

    @Override
    public void n() {
        if (this.aQ.C) {
            Object object;
            this.d = this.c;
            if (!this.cm()) {
                this.e = 2.0f;
                if (this.aY > 0.0 && this.u && !this.ch()) {
                    this.aQ.a(this.aU, this.aV, this.aW, net.minecraft.a.f.cl, this.S(), 1.0f, 1.0f, false);
                }
                this.u = this.aY < 0.0 && this.aQ.d(new net.minecraft.u.b.b(this).c(), false);
            } else {
                this.e = this.c() ? (this.e < 0.5f ? 4.0f : (this.e += (0.5f - this.e) * 0.1f)) : (this.e += (0.125f - this.e) * 0.2f);
            }
            this.c += this.e;
            this.g = this.f;
            this.f = !this.cm() ? this.bx.nextFloat() : (this.c() ? (this.f += (0.0f - this.f) * 0.25f) : (this.f += (1.0f - this.f) * 0.06f));
            if (this.c() && this.cm()) {
                object = this.i(0.0f);
                for (int i2 = 0; i2 < 2; ++i2) {
                    this.aQ.a(net.minecraft.u.aj.e, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl - ((s)object).b * 1.5, this.aV + this.bx.nextDouble() * (double)this.bm - ((s)object).c * 1.5, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl - ((s)object).d * 1.5, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (this.s()) {
                if (this.i < this.p()) {
                    ++this.i;
                }
                if ((object = this.t()) != null) {
                    this.I().a((n)object, 90.0f, 90.0f);
                    this.I().a();
                    double d2 = this.s(0.0f);
                    double d3 = ((l)object).aU - this.aU;
                    double d4 = ((l)object).aV + (double)(((l)object).bm * 0.5f) - (this.aV + (double)this.ce_());
                    double d5 = ((l)object).aW - this.aW;
                    double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    double d7 = this.bx.nextDouble();
                    while (d7 < d6) {
                        this.aQ.a(net.minecraft.u.aj.e, this.aU + d3 * (d7 += 1.8 - d2 + this.bx.nextDouble() * (1.7 - d2)), this.aV + d4 * d7 + (double)this.ce_(), this.aW + d5 * d7, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
            }
        }
        if (this.bA) {
            this.n(300);
        } else if (this.be) {
            this.aY += 0.5;
            this.aX += (double)((this.bx.nextFloat() * 2.0f - 1.0f) * 0.4f);
            this.aZ += (double)((this.bx.nextFloat() * 2.0f - 1.0f) * 0.4f);
            this.ba = this.bx.nextFloat() * 360.0f;
            this.be = false;
            this.bO = true;
        }
        if (this.s()) {
            this.ba = this.am;
        }
        super.n();
    }

    public float q(float f2) {
        return this.d + (this.c - this.d) * f2;
    }

    public float r(float f2) {
        return this.g + (this.f - this.g) * f2;
    }

    public float s(float f2) {
        return ((float)this.i + f2) / (float)this.p();
    }

    @Override
    protected void e() {
        super.e();
        if (this.q()) {
            int n2 = 1200;
            int n3 = 1200;
            int n4 = 6000;
            int n5 = 2;
            if ((this.by + this.ca()) % 1200 == 0) {
                c c2 = net.minecraft.a.c.d;
                for (net.minecraft.w.a.g g2 : this.aQ.b(net.minecraft.w.a.g.class, new bc(this))) {
                    if (g2.b(c2) && g2.c(c2).c() >= 2 && g2.c(c2).b() >= 1200) continue;
                    g2.a.a(new ce(10, 0.0f));
                    g2.c(new net.minecraft.d.j(c2, 6000, 2));
                }
            }
            if (!this.dm()) {
                this.a(new net.minecraft.u.b.b(this), 16);
            }
        }
    }

    @Override
    protected bp ai() {
        return this.q() ? net.minecraft.q.a.a.j.x : net.minecraft.q.a.a.j.w;
    }

    @Override
    protected boolean cB_() {
        return true;
    }

    @Override
    public boolean ar() {
        return this.aQ.a(this.cT(), (n)this) && this.aQ.a((n)this, this.cT()).isEmpty();
    }

    @Override
    public boolean aq() {
        return (this.bx.nextInt(20) == 0 || !this.aQ.h(new net.minecraft.u.b.b(this))) && super.aq();
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (!this.c() && !n2.s() && n2.i() instanceof l) {
            l l2 = (l)n2.i();
            if (!n2.c()) {
                l2.a(net.minecraft.u.n.a((n)this), 2.0f);
            }
        }
        if (this.v != null) {
            this.v.f();
        }
        return super.a(n2, f2);
    }

    @Override
    public int ao() {
        return 180;
    }

    @Override
    public void b(float f2, float f3) {
        if (this.A()) {
            if (this.cm()) {
                this.a(f2, f3, 0.1f, true);
                this.b(this.aX, this.aY, this.aZ);
                this.aX *= (double)0.9f;
                this.aY *= (double)0.9f;
                this.aZ *= (double)0.9f;
                if (!this.c() && this.W() == null) {
                    this.aY -= 0.005;
                }
            } else {
                super.b(f2, f3);
            }
        } else {
            super.b(f2, f3);
        }
    }

    static /* synthetic */ void a(g g2, int n2) {
        g2.c(n2);
    }

    static /* synthetic */ az a(g g2) {
        return g2.v;
    }

    static /* synthetic */ void a(g g2, boolean bl2) {
        g2.c(bl2);
    }
}

