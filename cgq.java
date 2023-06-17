/*
 * Decompiled with CFR 0.150.
 */
public abstract class cgq
extends xy {
    public cgq(iu iu2) {
        super(iu2);
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    protected void a(double d2, boolean bl2, dbk dbk2, cmz cmz2) {
    }

    @Override
    public void b(float f2, float f3) {
        if (this.V_()) {
            this.b(f2, f3, 0.02f);
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= (double)0.8f;
            this.aY *= (double)0.8f;
            this.aZ *= (double)0.8f;
        } else if (this.cj()) {
            this.b(f2, f3, 0.02f);
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= 0.5;
            this.aY *= 0.5;
            this.aZ *= 0.5;
        } else {
            float f4 = 0.91f;
            if (this.be) {
                f4 = this.aQ.n((cmz)new cmz((int)cmk.c((double)this.aU), (int)(cmk.c((double)this.cD().b) - 1), (int)cmk.c((double)this.aW))).t().N * 0.91f;
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            this.b(f2, f3, this.be ? 0.1f * f5 : 0.02f);
            f4 = 0.91f;
            if (this.be) {
                f4 = this.aQ.n((cmz)new cmz((int)cmk.c((double)this.aU), (int)(cmk.c((double)this.cD().b) - 1), (int)cmk.c((double)this.aW))).t().N * 0.91f;
            }
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= (double)f4;
            this.aY *= (double)f4;
            this.aZ *= (double)f4;
        }
        this.Z = this.aa;
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f6 = cmk.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.aa += (f6 - this.aa) * 0.4f;
        this.ab += this.aa;
    }

    @Override
    public boolean ai() {
        return false;
    }
}

