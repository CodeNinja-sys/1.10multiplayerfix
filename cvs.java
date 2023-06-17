/*
 * Decompiled with CFR 0.150.
 */
public class cvs
extends cpk {
    public int a;
    public int b;
    public int c;
    private int d = 5;
    private int e;
    private bdl f;
    private int g;

    public cvs(iu iu2, double d2, double d3, double d4, int n2) {
        super(iu2);
        this.a_(0.5f, 0.5f);
        this.d(d2, d3, d4);
        this.ba = (float)(Math.random() * 360.0);
        this.aX = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.aY = (float)(Math.random() * 0.2) * 2.0f;
        this.aZ = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.e = n2;
    }

    @Override
    protected boolean e() {
        return false;
    }

    public cvs(iu iu2) {
        super(iu2);
        this.a_(0.25f, 0.25f);
    }

    @Override
    protected void a() {
    }

    @Override
    public int b(float f2) {
        float f3 = 0.5f;
        f3 = cmk.a(f3, 0.0f, 1.0f);
        int n2 = super.b(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void bb_() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        super.bb_();
        if (this.c > 0) {
            --this.c;
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (!this.cf()) {
            this.aY -= (double)0.03f;
        }
        if (this.aQ.n(new cmz(this)).a() == ahk.i) {
            this.aY = 0.2f;
            this.aX = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
            this.aZ = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
            this.a(dah.bB, 0.4f, 2.0f + this.bx.nextFloat() * 0.4f);
        }
        this.e(this.aU, (this.cD().b + this.cD().e) / 2.0, this.aW);
        double d7 = 8.0;
        if (this.g < this.a - 20 + this.bW() % 100) {
            if (this.f == null || this.f.l(this) > 64.0) {
                this.f = this.aQ.a((cpk)this, 8.0);
            }
            this.g = this.a;
        }
        if (this.f != null && this.f.aL()) {
            this.f = null;
        }
        if (this.f != null && (d6 = 1.0 - (d5 = Math.sqrt((d4 = (this.f.aU - this.aU) / 8.0) * d4 + (d3 = (this.f.aV + (double)this.f.A() / 2.0 - this.aV) / 8.0) * d3 + (d2 = (this.f.aW - this.aW) / 8.0) * d2))) > 0.0) {
            d6 *= d6;
            this.aX += d4 / d5 * d6 * 0.1;
            this.aY += d3 / d5 * d6 * 0.1;
            this.aZ += d2 / d5 * d6 * 0.1;
        }
        this.b(this.aX, this.aY, this.aZ);
        float f2 = 0.98f;
        if (this.be) {
            f2 = this.aQ.n((cmz)new cmz((int)cmk.c((double)this.aU), (int)(cmk.c((double)this.cD().b) - 1), (int)cmk.c((double)this.aW))).t().N * 0.98f;
        }
        this.aX *= (double)f2;
        this.aY *= (double)0.98f;
        this.aZ *= (double)f2;
        if (this.be) {
            this.aY *= (double)-0.9f;
        }
        ++this.a;
        ++this.b;
        if (this.b >= 6000) {
            this.ak_();
        }
    }

    @Override
    public boolean bf_() {
        return this.aQ.a(this.cD(), ahk.h, (cpk)this);
    }

    @Override
    protected void f_(int n2) {
        this.a(ahy.a, (float)n2);
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        this.bz();
        this.d = (int)((float)this.d - f2);
        if (this.d <= 0) {
            this.ak_();
        }
        return false;
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("Health", (short)this.d);
        bvp2.a("Age", (short)this.b);
        bvp2.a("Value", (short)this.e);
    }

    @Override
    public void b(bvp bvp2) {
        this.d = bvp2.g("Health");
        this.b = bvp2.g("Age");
        this.e = bvp2.g("Value");
    }

    @Override
    public void b_(bdl bdl2) {
        if (this.aQ.C) {
            return;
        }
        if (this.c == 0 && bdl2.u == 0) {
            bdl2.u = 2;
            this.aQ.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.bk, csg.h, 0.1f, 0.5f * ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.7f + 1.8f));
            bdl2.b(this, 1);
            bhl bhl2 = acz.b(bbh.A, bdl2);
            if (bhl2 != null && bhl2.f()) {
                int n2 = Math.min(this.e(this.e), bhl2.g());
                this.e -= this.d(n2);
                bhl2.b(bhl2.g() - n2);
            }
            if (this.e > 0) {
                bdl2.h(this.e);
            }
            this.ak_();
        }
    }

    private int d(int n2) {
        return n2 / 2;
    }

    private int e(int n2) {
        return n2 * 2;
    }

    public int n() {
        return this.e;
    }

    public int p() {
        if (this.e >= 2477) {
            return 10;
        }
        if (this.e >= 1237) {
            return 9;
        }
        if (this.e >= 617) {
            return 8;
        }
        if (this.e >= 307) {
            return 7;
        }
        if (this.e >= 149) {
            return 6;
        }
        if (this.e >= 73) {
            return 5;
        }
        if (this.e >= 37) {
            return 4;
        }
        if (this.e >= 17) {
            return 3;
        }
        if (this.e >= 7) {
            return 2;
        }
        if (this.e >= 3) {
            return 1;
        }
        return 0;
    }

    public static int c(int n2) {
        if (n2 >= 2477) {
            return 2477;
        }
        if (n2 >= 1237) {
            return 1237;
        }
        if (n2 >= 617) {
            return 617;
        }
        if (n2 >= 307) {
            return 307;
        }
        if (n2 >= 149) {
            return 149;
        }
        if (n2 >= 73) {
            return 73;
        }
        if (n2 >= 37) {
            return 37;
        }
        if (n2 >= 17) {
            return 17;
        }
        if (n2 >= 7) {
            return 7;
        }
        if (n2 >= 3) {
            return 3;
        }
        return 1;
    }

    @Override
    public boolean c() {
        return false;
    }
}

