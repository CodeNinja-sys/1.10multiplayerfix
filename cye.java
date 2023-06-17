/*
 * Decompiled with CFR 0.150.
 */
public class cye
extends ck {
    xy a;
    bga b;
    float c;

    public cye(xy xy2, float f2) {
        this.a = xy2;
        this.c = f2;
        this.a(5);
    }

    @Override
    public boolean b() {
        this.b = this.a.ar();
        if (this.b == null) {
            return false;
        }
        double d2 = this.a.l(this.b);
        if (d2 < 4.0 || d2 > 16.0) {
            return false;
        }
        if (!this.a.be) {
            return false;
        }
        return this.a.aW().nextInt(5) == 0;
    }

    @Override
    public boolean a() {
        return !this.a.be;
    }

    @Override
    public void c() {
        double d2 = this.b.aU - this.a.aU;
        double d3 = this.b.aW - this.a.aW;
        float f2 = cmk.a(d2 * d2 + d3 * d3);
        this.a.aX += d2 / (double)f2 * 0.5 * (double)0.8f + this.a.aX * (double)0.2f;
        this.a.aZ += d3 / (double)f2 * 0.5 * (double)0.8f + this.a.aZ * (double)0.2f;
        this.a.aY = this.c;
    }
}

