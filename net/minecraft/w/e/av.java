/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.i;
import net.minecraft.a.w;
import net.minecraft.m.cg;
import net.minecraft.q.a.a.j;
import net.minecraft.q.ab;
import net.minecraft.q.b.q;
import net.minecraft.q.k;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.b.ae;
import net.minecraft.w.b.ag;
import net.minecraft.w.d;
import net.minecraft.w.e.aw;
import net.minecraft.w.e.bd;
import net.minecraft.w.e.bf;
import net.minecraft.w.e.bj;
import net.minecraft.w.e.e;
import net.minecraft.w.e.r;
import net.minecraft.w.e.s;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;

public class av
extends f
implements aw {
    private static final g d = net.minecraft.x.a.o.a(av.class, net.minecraft.x.a.q.b);
    public float a;
    public float b;
    public float c;
    private boolean e;

    public av(k k2) {
        super(k2);
        this.l = new e(this);
    }

    @Override
    protected void cA_() {
        this.o.a(1, new bd(this));
        this.o.a(2, new s(this));
        this.o.a(3, new bf(this));
        this.o.a(5, new r(this));
        this.p.a(1, new ag(this));
        this.p.a(3, new ae(this, bj.class));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(d, 1);
    }

    protected void b(int n2) {
        this.bE.b(d, n2);
        this.d(0.51000005f * (float)n2, 0.51000005f * (float)n2);
        this.e(this.aU, this.aV, this.aW);
        this.a(net.minecraft.w.d.a).a((double)(n2 * n2));
        this.a(net.minecraft.w.d.d).a(0.2f + 0.1f * (float)n2);
        this.h(this.bw());
        this.k = n2;
    }

    public int c() {
        return (Integer)this.bE.a(d);
    }

    public static void a(a a2) {
        f.a(a2, "Slime");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Size", this.c() - 1);
        e2.a("wasOnGround", this.e);
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        int n2 = e2.h("Size");
        if (n2 < 0) {
            n2 = 0;
        }
        this.b(n2 + 1);
        this.e = e2.p("wasOnGround");
    }

    public boolean p() {
        return this.c() <= 1;
    }

    protected aj q() {
        return net.minecraft.u.aj.H;
    }

    @Override
    public void cE_() {
        if (!this.aQ.C && this.aQ.R() == net.minecraft.q.l.a && this.c() > 0) {
            this.bk = true;
        }
        this.b += (this.a - this.b) * 0.5f;
        this.c = this.b;
        super.cE_();
        if (this.be && !this.e) {
            int n2 = this.c();
            for (int i2 = 0; i2 < n2 * 8; ++i2) {
                float f2 = this.bx.nextFloat() * ((float)Math.PI * 2);
                float f3 = this.bx.nextFloat() * 0.5f + 0.5f;
                float f4 = net.minecraft.u.b.n.a(f2) * (float)n2 * 0.5f * f3;
                float f5 = net.minecraft.u.b.n.b(f2) * (float)n2 * 0.5f * f3;
                k k2 = this.aQ;
                aj aj2 = this.q();
                double d2 = this.aU + (double)f4;
                double d3 = this.aW + (double)f5;
                k2.a(aj2, d2, this.cT().b, d3, 0.0, 0.0, 0.0, new int[0]);
            }
            this.a(this.y(), this.bE(), ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            this.a = -0.5f;
        } else if (!this.be && this.e) {
            this.a = 1.0f;
        }
        this.e = this.be;
        this.r();
    }

    protected void r() {
        this.a *= 0.6f;
    }

    protected int s() {
        return this.bx.nextInt(20) + 10;
    }

    protected av t() {
        return new av(this.aQ);
    }

    @Override
    public void a(g g2) {
        if (d.equals(g2)) {
            int n2 = this.c();
            this.d(0.51000005f * (float)n2, 0.51000005f * (float)n2);
            this.ba = this.am;
            this.ak = this.am;
            if (this.cm() && this.bx.nextInt(20) == 0) {
                this.al();
            }
        }
        super.a(g2);
    }

    @Override
    public void aa() {
        int n2 = this.c();
        if (!this.aQ.C && n2 > 1 && this.bo() <= 0.0f) {
            int n3 = 2 + this.bx.nextInt(3);
            for (int i2 = 0; i2 < n3; ++i2) {
                float f2 = ((float)(i2 % 2) - 0.5f) * (float)n2 / 4.0f;
                float f3 = ((float)(i2 / 2) - 0.5f) * (float)n2 / 4.0f;
                av av2 = this.t();
                if (this.bO_()) {
                    av2.g(this.cP());
                }
                if (this.aM()) {
                    av2.aJ();
                }
                av2.b(n2 / 2);
                av2.b(this.aU + (double)f2, this.aV + 0.5, this.aW + (double)f3, this.bx.nextFloat() * 360.0f, 0.0f);
                this.aQ.a(av2);
            }
        }
        super.aa();
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        if (n2 instanceof bj && this.v()) {
            this.d((l)n2);
        }
    }

    @Override
    public void d(b b2) {
        if (this.v()) {
            this.d((l)b2);
        }
    }

    protected void d(l l2) {
        int n2 = this.c();
        if (this.l(l2) && this.n(l2) < 0.6 * (double)n2 * 0.6 * (double)n2 && l2.a(net.minecraft.u.n.a(this), (float)this.w())) {
            this.a(net.minecraft.a.f.fB, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            this.a(this, l2);
        }
    }

    @Override
    public float ce_() {
        return 0.625f * this.bm;
    }

    protected boolean v() {
        return !this.p();
    }

    protected int w() {
        return this.c();
    }

    @Override
    protected bv cc_() {
        return this.p() ? net.minecraft.a.f.fP : net.minecraft.a.f.fG;
    }

    @Override
    protected bv cd_() {
        return this.p() ? net.minecraft.a.f.fO : net.minecraft.a.f.fD;
    }

    protected bv y() {
        return this.p() ? net.minecraft.a.f.fR : net.minecraft.a.f.fJ;
    }

    @Override
    protected cg ah() {
        return this.c() == 1 ? w.aT : null;
    }

    @Override
    protected bp ai() {
        return this.c() == 1 ? net.minecraft.q.a.a.j.ae : net.minecraft.q.a.a.j.a;
    }

    @Override
    public boolean aq() {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(net.minecraft.u.b.n.c(this.aU), 0, net.minecraft.u.b.n.c(this.aW));
        net.minecraft.q.f.k k2 = this.aQ.e(b2);
        if (this.aQ.F().t() == net.minecraft.q.ab.c && this.bx.nextInt(4) != 1) {
            return false;
        }
        if (this.aQ.R() != net.minecraft.q.l.a) {
            q q2 = this.aQ.a(b2);
            if (q2 == i.h && this.aV > 50.0 && this.aV < 70.0 && this.bx.nextFloat() < 0.5f && this.bx.nextFloat() < this.aQ.p() && this.aQ.j(new net.minecraft.u.b.b(this)) <= this.bx.nextInt(8)) {
                return super.aq();
            }
            if (this.bx.nextInt(10) == 0 && k2.a(987234911L).nextInt(10) == 0 && this.aV < 40.0) {
                return super.aq();
            }
        }
        return false;
    }

    @Override
    protected float bE() {
        return 0.4f * (float)this.c();
    }

    @Override
    public int ao() {
        return 0;
    }

    protected boolean z() {
        return this.c() > 0;
    }

    @Override
    protected void aj() {
        this.aY = 0.42f;
        this.bO = true;
    }

    @Override
    public ac a(z z2, ac ac2) {
        int n2 = this.bx.nextInt(3);
        if (n2 < 2 && this.bx.nextFloat() < 0.5f * z2.c()) {
            ++n2;
        }
        int n3 = 1 << n2;
        this.b(n3);
        return super.a(z2, ac2);
    }

    protected bv E() {
        return this.p() ? net.minecraft.a.f.fQ : net.minecraft.a.f.fH;
    }
}

