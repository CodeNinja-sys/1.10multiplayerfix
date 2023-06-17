/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.UUID;

public abstract class bjv
extends cpk
implements cvj {
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private bfa g;
    protected boolean a;
    public int b;
    private bga h;
    private String i;
    private int j;
    private int k;
    public cpk c;
    private int l;

    public bjv(iu iu2) {
        super(iu2);
        this.a_(0.25f, 0.25f);
    }

    public bjv(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
    }

    public bjv(iu iu2, bga bga2) {
        this(iu2, bga2.aU, bga2.aV + (double)bga2.A() - (double)0.1f, bga2.aW);
        this.h = bga2;
    }

    @Override
    protected void a() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cD().a() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -cmk.a(f3 * ((float)Math.PI / 180)) * cmk.b(f2 * ((float)Math.PI / 180));
        float f8 = -cmk.a((f2 + f4) * ((float)Math.PI / 180));
        float f9 = cmk.b(f3 * ((float)Math.PI / 180)) * cmk.b(f2 * ((float)Math.PI / 180));
        this.a((double)f7, (double)f8, (double)f9, f5, f6);
        this.aX += cpk2.aX;
        this.aZ += cpk2.aZ;
        if (!cpk2.be) {
            this.aY += cpk2.aY;
        }
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3) {
        float f4 = cmk.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        this.aX = d2 *= (double)f2;
        this.aY = d3 *= (double)f2;
        this.aZ = d4 *= (double)f2;
        float f5 = cmk.a(d2 * d2 + d4 * d4);
        this.ba = (float)(cmk.b(d2, d4) * 57.2957763671875);
        this.bb = (float)(cmk.b(d3, (double)f5) * 57.2957763671875);
        this.bc = this.ba;
        this.bd = this.bb;
        this.j = 0;
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = cmk.a(d2 * d2 + d4 * d4);
            this.ba = (float)(cmk.b(d2, d4) * 57.2957763671875);
            this.bb = (float)(cmk.b(d3, (double)f2) * 57.2957763671875);
            this.bc = this.ba;
            this.bd = this.bb;
        }
    }

    @Override
    public void bb_() {
        this.br = this.aU;
        this.bs = this.aV;
        this.bt = this.aW;
        super.bb_();
        if (this.b > 0) {
            --this.b;
        }
        if (this.a) {
            if (this.aQ.n(new cmz(this.d, this.e, this.f)).t() == this.g) {
                ++this.j;
                if (this.j == 1200) {
                    this.ak_();
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
        amj amj2 = new amj(this.aU, this.aV, this.aW);
        amj amj3 = new amj(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        auu auu2 = this.aQ.a(amj2, amj3);
        amj2 = new amj(this.aU, this.aV, this.aW);
        amj3 = new amj(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        if (auu2 != null) {
            amj3 = new amj(auu2.c.b, auu2.c.c, auu2.c.d);
        }
        cpk cpk2 = null;
        List list = this.aQ.b((cpk)this, this.cD().a(this.aX, this.aY, this.aZ).b(1.0));
        double d2 = 0.0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            cpk cpk3 = (cpk)list.get(i2);
            if (!cpk3.bc_()) continue;
            if (cpk3 == this.c) {
                bl2 = true;
                continue;
            }
            if (this.by < 2 && this.c == null) {
                this.c = cpk3;
                bl2 = true;
                continue;
            }
            bl2 = false;
            cxt cxt2 = cpk3.cD().b(0.3f);
            auu auu3 = cxt2.b(amj2, amj3);
            if (auu3 == null || !((d3 = amj2.g(auu3.c)) < d2) && d2 != 0.0) continue;
            cpk2 = cpk3;
            d2 = d3;
        }
        if (this.c != null) {
            if (bl2) {
                this.l = 2;
            } else if (this.l-- <= 0) {
                this.c = null;
            }
        }
        if (cpk2 != null) {
            auu2 = new auu(cpk2);
        }
        if (auu2 != null) {
            if (auu2.a == bmw.b && this.aQ.n(auu2.a()).t() == blg.aY) {
                this.g(auu2.a());
            } else {
                this.a(auu2);
            }
        }
        this.aU += this.aX;
        this.aV += this.aY;
        this.aW += this.aZ;
        float f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
        this.ba = (float)(cmk.b(this.aX, this.aZ) * 57.2957763671875);
        this.bb = (float)(cmk.b(this.aY, (double)f2) * 57.2957763671875);
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
        float f4 = this.n();
        if (this.V_()) {
            for (int i3 = 0; i3 < 4; ++i3) {
                float f5 = 0.25f;
                this.aQ.a(lz.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
            }
            f3 = 0.8f;
        }
        this.aX *= (double)f3;
        this.aY *= (double)f3;
        this.aZ *= (double)f3;
        if (!this.cf()) {
            this.aY -= (double)f4;
        }
        this.d(this.aU, this.aV, this.aW);
    }

    protected float n() {
        return 0.03f;
    }

    protected abstract void a(auu var1);

    public static void a(cgy cgy2, String string) {
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("xTile", this.d);
        bvp2.a("yTile", this.e);
        bvp2.a("zTile", this.f);
        bpx bpx2 = (bpx)bfa.v.b(this.g);
        bvp2.a("inTile", bpx2 == null ? "" : bpx2.toString());
        bvp2.a("shake", (byte)this.b);
        bvp2.a("inGround", (byte)(this.a ? 1 : 0));
        if ((this.i == null || this.i.isEmpty()) && this.h instanceof bdl) {
            this.i = this.h.i_();
        }
        bvp2.a("ownerName", this.i == null ? "" : this.i);
    }

    @Override
    public void b(bvp bvp2) {
        this.d = bvp2.h("xTile");
        this.e = bvp2.h("yTile");
        this.f = bvp2.h("zTile");
        this.g = bvp2.b("inTile", 8) ? bfa.a(bvp2.l("inTile")) : bfa.f(bvp2.f("inTile") & 0xFF);
        this.b = bvp2.f("shake") & 0xFF;
        this.a = bvp2.f("inGround") == 1;
        this.h = null;
        this.i = bvp2.l("ownerName");
        if (this.i != null && this.i.isEmpty()) {
            this.i = null;
        }
        this.h = this.p();
    }

    public bga p() {
        if (this.h == null && this.i != null && !this.i.isEmpty()) {
            this.h = this.aQ.a(this.i);
            if (this.h == null && this.aQ instanceof alj) {
                try {
                    cpk cpk2 = ((alj)this.aQ).b(UUID.fromString(this.i));
                    if (cpk2 instanceof bga) {
                        this.h = (bga)cpk2;
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

