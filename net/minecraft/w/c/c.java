/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import java.util.List;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.b.o;
import net.minecraft.u.bp;
import net.minecraft.w.a.b;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.s;

public abstract class c
extends n
implements s {
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private cn g;
    protected boolean a;
    public int b;
    private l h;
    private String i;
    private int j;
    private int k;
    public n c;
    private int l;

    public c(k k2) {
        super(k2);
        this.d(0.25f, 0.25f);
    }

    public c(k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
    }

    public c(k k2, l l2) {
        this(k2, l2.aU, l2.aV + (double)l2.ce_() - (double)0.1f, l2.aW);
        this.h = l2;
    }

    @Override
    protected void cb_() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cT().a() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public void a(n n2, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -net.minecraft.u.b.n.a(f3 * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(f2 * ((float)Math.PI / 180));
        float f8 = -net.minecraft.u.b.n.a((f2 + f4) * ((float)Math.PI / 180));
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
        this.j = 0;
    }

    @Override
    public void k(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
            this.ba = (float)(net.minecraft.u.b.n.b(d2, d4) * 57.29577951308232);
            this.bb = (float)(net.minecraft.u.b.n.b(d3, (double)f2) * 57.29577951308232);
            this.bc = this.ba;
            this.bd = this.bb;
        }
    }

    @Override
    public void cE_() {
        this.br = this.aU;
        this.bs = this.aV;
        this.bt = this.aW;
        super.cE_();
        if (this.b > 0) {
            --this.b;
        }
        if (this.a) {
            if (this.aQ.n(new net.minecraft.u.b.b(this.d, this.e, this.f)).c() == this.g) {
                ++this.j;
                if (this.j == 1200) {
                    this.aa();
                }
                return;
            }
            this.a = false;
            this.aX *= (double)(this.bx.nextFloat() * 0.2f);
            this.aY *= (double)(this.bx.nextFloat() * 0.2f);
            this.aZ *= (double)(this.bx.nextFloat() * 0.2f);
            this.j = 0;
            this.k = 0;
        } else {
            ++this.k;
        }
        net.minecraft.u.b.s s2 = new net.minecraft.u.b.s(this.aU, this.aV, this.aW);
        net.minecraft.u.b.s s3 = new net.minecraft.u.b.s(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        o o2 = this.aQ.a(s2, s3);
        s2 = new net.minecraft.u.b.s(this.aU, this.aV, this.aW);
        s3 = new net.minecraft.u.b.s(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        if (o2 != null) {
            s3 = new net.minecraft.u.b.s(o2.c.b, o2.c.c, o2.c.d);
        }
        n n2 = null;
        List list = this.aQ.b((n)this, this.cT().a(this.aX, this.aY, this.aZ).b(1.0));
        double d2 = 0.0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            n n3 = (n)list.get(i2);
            if (!n3.cg_()) continue;
            if (n3 == this.c) {
                bl2 = true;
                continue;
            }
            if (this.by < 2 && this.c == null) {
                this.c = n3;
                bl2 = true;
                continue;
            }
            bl2 = false;
            a a2 = n3.cT().b(0.3f);
            o o3 = a2.b(s2, s3);
            if (o3 == null || !((d3 = s2.g(o3.c)) < d2) && d2 != 0.0) continue;
            n2 = n3;
            d2 = d3;
        }
        if (this.c != null) {
            if (bl2) {
                this.l = 2;
            } else if (this.l-- <= 0) {
                this.c = null;
            }
        }
        if (n2 != null) {
            o2 = new o(n2);
        }
        if (o2 != null) {
            if (o2.a == net.minecraft.u.b.p.b && this.aQ.n(o2.a()).c() == p.aY) {
                this.e(o2.a());
            } else {
                this.a(o2);
            }
        }
        this.aU += this.aX;
        this.aV += this.aY;
        this.aW += this.aZ;
        float f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
        this.ba = (float)(net.minecraft.u.b.n.b(this.aX, this.aZ) * 57.29577951308232);
        this.bb = (float)(net.minecraft.u.b.n.b(this.aY, (double)f2) * 57.29577951308232);
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
        float f3 = 0.99f;
        float f4 = this.a();
        if (this.cm()) {
            for (int i3 = 0; i3 < 4; ++i3) {
                float f5 = 0.25f;
                this.aQ.a(aj.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
            }
            f3 = 0.8f;
        }
        this.aX *= (double)f3;
        this.aY *= (double)f3;
        this.aZ *= (double)f3;
        if (!this.ci()) {
            this.aY -= (double)f4;
        }
        this.e(this.aU, this.aV, this.aW);
    }

    protected float a() {
        return 0.03f;
    }

    protected abstract void a(o var1);

    public static void a(net.minecraft.u.a.a a2, String string) {
    }

    @Override
    public void a(e e2) {
        e2.a("xTile", this.d);
        e2.a("yTile", this.e);
        e2.a("zTile", this.f);
        bp bp2 = (bp)cn.v.b(this.g);
        e2.a("inTile", bp2 == null ? "" : bp2.toString());
        e2.a("shake", (byte)this.b);
        e2.a("inGround", (byte)(this.a ? 1 : 0));
        if ((this.i == null || this.i.isEmpty()) && this.h instanceof b) {
            this.i = this.h.X();
        }
        e2.a("ownerName", this.i == null ? "" : this.i);
    }

    @Override
    public void b(e e2) {
        this.d = e2.h("xTile");
        this.e = e2.h("yTile");
        this.f = e2.h("zTile");
        this.g = e2.b("inTile", 8) ? cn.a(e2.l("inTile")) : cn.d(e2.f("inTile") & 0xFF);
        this.b = e2.f("shake") & 0xFF;
        this.a = e2.f("inGround") == 1;
        this.h = null;
        this.i = e2.l("ownerName");
        if (this.i != null && this.i.isEmpty()) {
            this.i = null;
        }
        this.h = this.c();
    }

    public l c() {
        if (this.h == null && this.i != null && !this.i.isEmpty()) {
            this.h = this.aQ.a(this.i);
            if (this.h == null && this.aQ instanceof v) {
                try {
                    n n2 = ((v)this.aQ).b(UUID.fromString(this.i));
                    if (n2 instanceof l) {
                        this.h = (l)n2;
                    }
                }
                catch (Throwable throwable) {
                    this.h = null;
                }
            }
        }
        return this.h;
    }
}

