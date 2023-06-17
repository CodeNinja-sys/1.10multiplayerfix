/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;

public class vn
extends ciy {
    private int a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public vn(iu iu2, e e2) {
        super(iu2, e2);
        this.bu = 0.0f;
        this.bv = true;
        this.E = 0.25f;
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cD().a() * 10.0;
        if (Double.isNaN(d3)) {
            d3 = 1.0;
        }
        return d2 < (d3 *= 64.0 * vn.cz()) * d3;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        return true;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = f2;
        this.f = f3;
        this.a = n2;
    }

    @Override
    public void bb_() {
        this.E = 0.0f;
        super.bb_();
        this.Z = this.aa;
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f2 = cmk.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.aa += (f2 - this.aa) * 0.4f;
        this.ab += this.aa;
    }

    @Override
    public void Q_() {
        if (this.a > 0) {
            double d2;
            double d3 = this.aU + (this.b - this.aU) / (double)this.a;
            double d4 = this.aV + (this.c - this.aV) / (double)this.a;
            double d5 = this.aW + (this.d - this.aW) / (double)this.a;
            for (d2 = this.e - (double)this.ba; d2 < -180.0; d2 += 360.0) {
            }
            while (d2 >= 180.0) {
                d2 -= 360.0;
            }
            this.ba = (float)((double)this.ba + d2 / (double)this.a);
            this.bb = (float)((double)this.bb + (this.f - (double)this.bb) / (double)this.a);
            --this.a;
            this.d(d3, d4, d5);
            this.e(this.ba, this.bb);
        }
        this.s = this.t;
        this.br();
        float f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
        float f3 = (float)Math.atan(-this.aY * (double)0.2f) * 15.0f;
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.be || this.bh() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.be || this.bh() <= 0.0f) {
            f3 = 0.0f;
        }
        this.t += (f2 - this.t) * 0.4f;
        this.ae += (f3 - this.ae) * 0.8f;
        this.aQ.A.a("push");
        this.ae_();
        this.aQ.A.b();
    }

    @Override
    public void a(cbg cbg2) {
        bxy.B().r.c().a(cbg2);
    }

    @Override
    public boolean a(int n2, String string) {
        return false;
    }

    @Override
    public cmz k_() {
        return new cmz(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5);
    }
}

