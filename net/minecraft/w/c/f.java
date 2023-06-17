/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import com.a.a.b.cm;
import java.util.List;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.b.o;
import net.minecraft.u.bp;
import net.minecraft.u.r;
import net.minecraft.w.a.g;
import net.minecraft.w.c.l;
import net.minecraft.w.c.p;
import net.minecraft.w.e.au;
import net.minecraft.w.n;
import net.minecraft.w.s;
import net.minecraft.x.a.q;
import net.minecraft.x.d.b.ce;

public abstract class f
extends n
implements s {
    private static final cm f = com.a.a.b.cn.a(r.e, r.a, new l());
    private static final net.minecraft.x.a.g g = net.minecraft.x.a.o.a(f.class, q.a);
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private cn k;
    private int l;
    protected boolean a;
    protected int b;
    public p c = net.minecraft.w.c.p.a;
    public int d;
    public n e;
    private int m;
    private int n;
    private double o = 2.0;
    private int p;

    public f(k k2) {
        super(k2);
        this.d(0.5f, 0.5f);
    }

    public f(k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
    }

    public f(k k2, net.minecraft.w.l l2) {
        this(k2, l2.aU, l2.aV + (double)l2.ce_() - (double)0.1f, l2.aW);
        this.e = l2;
        if (l2 instanceof net.minecraft.w.a.b) {
            this.c = net.minecraft.w.c.p.b;
        }
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cT().a() * 10.0;
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 = d3 * 64.0 * net.minecraft.w.c.f.cO()) * d3;
    }

    @Override
    protected void cb_() {
        this.bE.a(g, (byte)0);
    }

    public void a(n n2, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -net.minecraft.u.b.n.a(f3 * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(f2 * ((float)Math.PI / 180));
        float f8 = -net.minecraft.u.b.n.a(f2 * ((float)Math.PI / 180));
        float f9 = net.minecraft.u.b.n.b(f3 * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(f2 * ((float)Math.PI / 180));
        this.c(f7, f8, f9, f5, f6);
        this.aX += n2.aX;
        this.aZ += n2.aZ;
        if (!n2.be) {
            this.aY += n2.aY;
        }
    }

    @Override
    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        this.aX = d2 *= (double)f2;
        this.aY = d3 *= (double)f2;
        this.aZ = d4 *= (double)f2;
        float f5 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
        this.ba = (float)(net.minecraft.u.b.n.b(d2, d4) * 57.29577951308232);
        this.bb = (float)(net.minecraft.u.b.n.b(d3, (double)f5) * 57.29577951308232);
        this.bc = this.ba;
        this.bd = this.bb;
        this.m = 0;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.e(d2, d3, d4);
        this.e(f2, f3);
    }

    @Override
    public void k(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
            this.bb = (float)(net.minecraft.u.b.n.b(d3, (double)f2) * 57.29577951308232);
            this.ba = (float)(net.minecraft.u.b.n.b(d2, d4) * 57.29577951308232);
            this.bd = this.bb;
            this.bc = this.ba;
            this.b(this.aU, this.aV, this.aW, this.ba, this.bb);
            this.m = 0;
        }
    }

    @Override
    public void cE_() {
        Object object;
        super.cE_();
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
            this.ba = (float)(net.minecraft.u.b.n.b(this.aX, this.aZ) * 57.29577951308232);
            this.bb = (float)(net.minecraft.u.b.n.b(this.aY, (double)f2) * 57.29577951308232);
            this.bc = this.ba;
            this.bd = this.bb;
        }
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.h, this.i, this.j);
        b b3 = this.aQ.n(b2);
        cn cn2 = b3.c();
        if (b3.d() != net.minecraft.g.a.h.a && (object = b3.d(this.aQ, b2)) != cn.y && ((a)object).a(b2).a(new net.minecraft.u.b.s(this.aU, this.aV, this.aW))) {
            this.a = true;
        }
        if (this.d > 0) {
            --this.d;
        }
        if (this.a) {
            int n2 = cn2.b(b3);
            if (cn2 == this.k && n2 == this.l) {
                ++this.m;
                if (this.m >= 1200) {
                    this.aa();
                }
            } else {
                this.a = false;
                this.aX *= (double)(this.bx.nextFloat() * 0.2f);
                this.aY *= (double)(this.bx.nextFloat() * 0.2f);
                this.aZ *= (double)(this.bx.nextFloat() * 0.2f);
                this.m = 0;
                this.n = 0;
            }
            ++this.b;
        } else {
            n n3;
            this.b = 0;
            ++this.n;
            object = new net.minecraft.u.b.s(this.aU, this.aV, this.aW);
            net.minecraft.u.b.s s2 = new net.minecraft.u.b.s(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
            o o2 = this.aQ.a((net.minecraft.u.b.s)object, s2, false, true, false);
            object = new net.minecraft.u.b.s(this.aU, this.aV, this.aW);
            s2 = new net.minecraft.u.b.s(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
            if (o2 != null) {
                s2 = new net.minecraft.u.b.s(o2.c.b, o2.c.c, o2.c.d);
            }
            if ((n3 = this.a((net.minecraft.u.b.s)object, s2)) != null) {
                o2 = new o(n3);
            }
            if (o2 != null && o2.d != null && o2.d instanceof net.minecraft.w.a.b) {
                net.minecraft.w.a.b b4 = (net.minecraft.w.a.b)o2.d;
                if (this.e instanceof net.minecraft.w.a.b && !((net.minecraft.w.a.b)this.e).a(b4)) {
                    o2 = null;
                }
            }
            if (o2 != null) {
                this.a(o2);
            }
            if (this.f()) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    this.aQ.a(aj.j, this.aU + this.aX * (double)i2 / 4.0, this.aV + this.aY * (double)i2 / 4.0, this.aW + this.aZ * (double)i2 / 4.0, -this.aX, -this.aY + 0.2, -this.aZ, new int[0]);
                }
            }
            this.aU += this.aX;
            this.aV += this.aY;
            this.aW += this.aZ;
            float f3 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
            this.ba = (float)(net.minecraft.u.b.n.b(this.aX, this.aZ) * 57.29577951308232);
            this.bb = (float)(net.minecraft.u.b.n.b(this.aY, (double)f3) * 57.29577951308232);
            while (this.bb - this.bd < -180.0f) {
                this.bd -= 360.0f;
            }
            while (this.bb - this.bd >= 180.0f) {
                this.bd += 360.0f;
            }
            while (this.ba - this.bc < -180.0f) {
                this.bc -= 360.0f;
            }
            while (this.ba - this.bc >= 180.0f) {
                this.bc += 360.0f;
            }
            this.bb = this.bd + (this.bb - this.bd) * 0.2f;
            this.ba = this.bc + (this.ba - this.bc) * 0.2f;
            float f4 = 0.99f;
            float f5 = 0.05f;
            if (this.cm()) {
                for (int i3 = 0; i3 < 4; ++i3) {
                    float f6 = 0.25f;
                    this.aQ.a(aj.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
                }
                f4 = 0.6f;
            }
            if (this.cl()) {
                this.ce();
            }
            this.aX *= (double)f4;
            this.aY *= (double)f4;
            this.aZ *= (double)f4;
            if (!this.ci()) {
                this.aY -= (double)0.05f;
            }
            this.e(this.aU, this.aV, this.aW);
            this.cg();
        }
    }

    protected void a(o o2) {
        n n2 = o2.d;
        if (n2 != null) {
            float f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aY * this.aY + this.aZ * this.aZ);
            int n3 = net.minecraft.u.b.n.f((double)f2 * this.o);
            if (this.f()) {
                n3 += this.bx.nextInt(n3 / 2 + 2);
            }
            net.minecraft.u.n n4 = this.e == null ? net.minecraft.u.n.a(this, (n)this) : net.minecraft.u.n.a(this, this.e);
            if (this.cy() && !(n2 instanceof au)) {
                n2.k(5);
            }
            if (n2.a(n4, (float)n3)) {
                if (n2 instanceof net.minecraft.w.l) {
                    float f3;
                    net.minecraft.w.l l2 = (net.minecraft.w.l)n2;
                    if (!this.aQ.C) {
                        l2.i(l2.bx() + 1);
                    }
                    if (this.p > 0 && (f3 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ)) > 0.0f) {
                        l2.a_(this.aX * (double)this.p * (double)0.6f / (double)f3, 0.1, this.aZ * (double)this.p * (double)0.6f / (double)f3);
                    }
                    if (this.e instanceof net.minecraft.w.l) {
                        net.minecraft.o.f.a(l2, this.e);
                        net.minecraft.o.f.b((net.minecraft.w.l)this.e, (n)l2);
                    }
                    this.a(l2);
                    if (this.e != null && l2 != this.e && l2 instanceof net.minecraft.w.a.b && this.e instanceof g) {
                        ((g)this.e).a.a(new ce(6, 0.0f));
                    }
                }
                this.a(net.minecraft.a.f.t, 1.0f, 1.2f / (this.bx.nextFloat() * 0.2f + 0.9f));
                if (!(n2 instanceof au)) {
                    this.aa();
                }
            } else {
                this.aX *= (double)-0.1f;
                this.aY *= (double)-0.1f;
                this.aZ *= (double)-0.1f;
                this.ba += 180.0f;
                this.bc += 180.0f;
                this.n = 0;
                if (!this.aQ.C && this.aX * this.aX + this.aY * this.aY + this.aZ * this.aZ < (double)0.001f) {
                    if (this.c == net.minecraft.w.c.p.b) {
                        this.a(this.a(), 0.1f);
                    }
                    this.aa();
                }
            }
        } else {
            net.minecraft.u.b.b b2 = o2.a();
            this.h = b2.cy_();
            this.i = b2.k();
            this.j = b2.l();
            b b3 = this.aQ.n(b2);
            this.k = b3.c();
            this.l = this.k.b(b3);
            this.aX = (float)(o2.c.b - this.aU);
            this.aY = (float)(o2.c.c - this.aV);
            this.aZ = (float)(o2.c.d - this.aW);
            float f4 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aY * this.aY + this.aZ * this.aZ);
            this.aU -= this.aX / (double)f4 * (double)0.05f;
            this.aV -= this.aY / (double)f4 * (double)0.05f;
            this.aW -= this.aZ / (double)f4 * (double)0.05f;
            this.a(net.minecraft.a.f.t, 1.0f, 1.2f / (this.bx.nextFloat() * 0.2f + 0.9f));
            this.a = true;
            this.d = 7;
            this.a(false);
            if (b3.d() != net.minecraft.g.a.h.a) {
                this.k.a(this.aQ, b2, b3, this);
            }
        }
    }

    protected void a(net.minecraft.w.l l2) {
    }

    protected n a(net.minecraft.u.b.s s2, net.minecraft.u.b.s s3) {
        n n2 = null;
        List list = this.aQ.a((n)this, this.cT().a(this.aX, this.aY, this.aZ).b(1.0), f);
        double d2 = 0.0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            a a2;
            o o2;
            n n3 = (n)list.get(i2);
            if (n3 == this.e && this.n < 5 || (o2 = (a2 = n3.cT().b(0.3f)).b(s2, s3)) == null || !((d3 = s2.g(o2.c)) < d2) && d2 != 0.0) continue;
            n2 = n3;
            d2 = d3;
        }
        return n2;
    }

    public static void a(net.minecraft.u.a.a a2, String string) {
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.c.f.a(a2, "Arrow");
    }

    @Override
    public void a(e e2) {
        e2.a("xTile", this.h);
        e2.a("yTile", this.i);
        e2.a("zTile", this.j);
        e2.a("life", (short)this.m);
        bp bp2 = (bp)cn.v.b(this.k);
        e2.a("inTile", bp2 == null ? "" : bp2.toString());
        e2.a("inData", (byte)this.l);
        e2.a("shake", (byte)this.d);
        e2.a("inGround", (byte)(this.a ? 1 : 0));
        e2.a("pickup", (byte)this.c.ordinal());
        e2.a("damage", this.o);
    }

    @Override
    public void b(e e2) {
        this.h = e2.h("xTile");
        this.i = e2.h("yTile");
        this.j = e2.h("zTile");
        this.m = e2.g("life");
        this.k = e2.b("inTile", 8) ? cn.a(e2.l("inTile")) : cn.d(e2.f("inTile") & 0xFF);
        this.l = e2.f("inData") & 0xFF;
        this.d = e2.f("shake") & 0xFF;
        boolean bl2 = this.a = e2.f("inGround") == 1;
        if (e2.b("damage", 99)) {
            this.o = e2.k("damage");
        }
        if (e2.b("pickup", 99)) {
            this.c = net.minecraft.w.c.p.a(e2.f("pickup"));
        } else if (e2.b("player", 99)) {
            this.c = e2.p("player") ? net.minecraft.w.c.p.b : net.minecraft.w.c.p.a;
        }
    }

    @Override
    public void d(net.minecraft.w.a.b b2) {
        if (!this.aQ.C && this.a && this.d <= 0) {
            boolean bl2;
            boolean bl3 = bl2 = this.c == net.minecraft.w.c.p.b || this.c == net.minecraft.w.c.p.c && b2.J.d;
            if (this.c == net.minecraft.w.c.p.b && !b2.q.c(this.a())) {
                bl2 = false;
            }
            if (bl2) {
                this.a(net.minecraft.a.f.da, 0.2f, ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                b2.b(this, 1);
                this.aa();
            }
        }
    }

    protected abstract cu a();

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    public int m(float f2) {
        return 0xF000F0;
    }

    public void c(double d2) {
        this.o = d2;
    }

    public double c() {
        return this.o;
    }

    public void b(int n2) {
        this.p = n2;
    }

    @Override
    public boolean cG() {
        return false;
    }

    @Override
    public float ce_() {
        return 0.0f;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(g);
        if (bl2) {
            this.bE.b(g, (byte)(by2 | 1));
        } else {
            this.bE.b(g, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    public boolean f() {
        byte by2 = (Byte)this.bE.a(g);
        return (by2 & 1) != 0;
    }
}

