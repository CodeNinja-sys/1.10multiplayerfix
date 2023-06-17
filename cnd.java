/*
 * Decompiled with CFR 0.150.
 */
public class cnd
extends cpk {
    private double a;
    private double b;
    private double c;
    private int d;
    private boolean e;

    public cnd(iu iu2) {
        super(iu2);
        this.a_(0.25f, 0.25f);
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

    public cnd(iu iu2, double d2, double d3, double d4) {
        super(iu2);
        this.d = 0;
        this.a_(0.25f, 0.25f);
        this.d(d2, d3, d4);
    }

    public void a(cmz cmz2) {
        double d2 = cmz2.a();
        int n2 = cmz2.b();
        double d3 = d2 - this.aU;
        double d4 = cmz2.c();
        double d5 = d4 - this.aW;
        float f2 = cmk.a(d3 * d3 + d5 * d5);
        if (f2 > 12.0f) {
            this.a = this.aU + d3 / (double)f2 * 12.0;
            this.c = this.aW + d5 / (double)f2 * 12.0;
            this.b = this.aV + 8.0;
        } else {
            this.a = d2;
            this.b = n2;
            this.c = d4;
        }
        this.d = 0;
        this.e = this.bx.nextInt(5) > 0;
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
        if (!this.aQ.C) {
            double d2 = this.a - this.aU;
            double d3 = this.c - this.aW;
            float f3 = (float)Math.sqrt(d2 * d2 + d3 * d3);
            float f4 = (float)cmk.b(d3, d2);
            double d4 = (double)f2 + (double)(f3 - f2) * 0.0025;
            if (f3 < 1.0f) {
                d4 *= 0.8;
                this.aY *= 0.8;
            }
            this.aX = Math.cos(f4) * d4;
            this.aZ = Math.sin(f4) * d4;
            this.aY = this.aV < this.b ? (this.aY += (1.0 - this.aY) * (double)0.015f) : (this.aY += (-1.0 - this.aY) * (double)0.015f);
        }
        float f5 = 0.25f;
        if (this.V_()) {
            for (int i2 = 0; i2 < 4; ++i2) {
                this.aQ.a(lz.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
            }
        } else {
            this.aQ.a(lz.y, this.aU - this.aX * 0.25 + this.bx.nextDouble() * 0.6 - 0.3, this.aV - this.aY * 0.25 - 0.5, this.aW - this.aZ * 0.25 + this.bx.nextDouble() * 0.6 - 0.3, this.aX, this.aY, this.aZ, new int[0]);
        }
        if (!this.aQ.C) {
            this.d(this.aU, this.aV, this.aW);
            ++this.d;
            if (this.d > 80 && !this.aQ.C) {
                this.ak_();
                if (this.e) {
                    this.aQ.b(new er(this.aQ, this.aU, this.aV, this.aW, new bhl(hp.bR)));
                } else {
                    this.aQ.b(2003, new cmz(this), 0);
                }
            }
        }
    }

    @Override
    public void a(bvp bvp2) {
    }

    @Override
    public void b(bvp bvp2) {
    }

    @Override
    public float a(float f2) {
        return 1.0f;
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }

    @Override
    public boolean c() {
        return false;
    }
}

