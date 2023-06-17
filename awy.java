/*
 * Decompiled with CFR 0.150.
 */
class awy
extends cel {
    private final bym i;

    public awy(bym bym2) {
        super(bym2);
        this.i = bym2;
    }

    @Override
    public void a() {
        if (this.h != azu.b || this.i.ap().m()) {
            this.i.i(0.0f);
            bym.a(this.i, false);
            return;
        }
        double d2 = this.b - this.i.aU;
        double d3 = this.c - this.i.aV;
        double d4 = this.d - this.i.aW;
        double d5 = d2 * d2 + d3 * d3 + d4 * d4;
        d5 = cmk.a(d5);
        float f2 = (float)(cmk.b(d4, d2) * 57.2957763671875) - 90.0f;
        this.i.ah = this.i.ba = this.a(this.i.ba, f2, 90.0f);
        float f3 = (float)(this.e * this.i.a(cgz.d).e());
        this.i.i(this.i.G_() + (f3 - this.i.G_()) * 0.125f);
        double d6 = Math.sin((double)(this.i.by + this.i.bW()) * 0.5) * 0.05;
        double d7 = Math.cos(this.i.ba * ((float)Math.PI / 180));
        double d8 = Math.sin(this.i.ba * ((float)Math.PI / 180));
        this.i.aX += d6 * d7;
        this.i.aZ += d6 * d8;
        d6 = Math.sin((double)(this.i.by + this.i.bW()) * 0.75) * 0.05;
        this.i.aY += d6 * (d8 + d7) * 0.25;
        this.i.aY += (double)this.i.G_() * (d3 /= d5) * 0.1;
        on on2 = this.i.am();
        double d9 = this.i.aU + d2 / d5 * 2.0;
        double d10 = (double)this.i.A() + this.i.aV + d3 / d5;
        double d11 = this.i.aW + d4 / d5 * 2.0;
        double d12 = on2.c();
        double d13 = on2.d();
        double d14 = on2.e();
        if (!on2.b()) {
            d12 = d9;
            d13 = d10;
            d14 = d11;
        }
        this.i.am().a(d12 + (d9 - d12) * 0.125, d13 + (d10 - d13) * 0.125, d14 + (d11 - d14) * 0.125, 10.0f, 40.0f);
        bym.a(this.i, true);
    }
}

