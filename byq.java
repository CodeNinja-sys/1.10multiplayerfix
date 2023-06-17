/*
 * Decompiled with CFR 0.150.
 */
public class byq
extends ctk {
    private int b;

    public byq(brd brd2) {
        super(brd2);
    }

    @Override
    public void a() {
        ++this.b;
        bdl bdl2 = this.a.aQ.a((cpk)this.a, 20.0, 10.0);
        if (bdl2 != null) {
            if (this.b > 25) {
                this.a.aL().a(baw.h);
            } else {
                amj amj2 = new amj(bdl2.aU - this.a.aU, 0.0, bdl2.aW - this.a.aW).a();
                amj amj3 = new amj(cmk.a(this.a.ba * ((float)Math.PI / 180)), 0.0, -cmk.b(this.a.ba * ((float)Math.PI / 180))).a();
                float f2 = (float)amj3.b(amj2);
                float f3 = (float)(Math.acos(f2) * 57.2957763671875) + 0.5f;
                if (f3 < 0.0f || f3 > 10.0f) {
                    float f4;
                    double d2 = bdl2.aU - this.a.e.aU;
                    double d3 = bdl2.aW - this.a.e.aW;
                    double d4 = cmk.a(cmk.g(180.0 - cmk.b(d2, d3) * 57.2957763671875 - (double)this.a.ba), -100.0, 100.0);
                    this.a.aA *= 0.8f;
                    float f5 = f4 = cmk.a(d2 * d2 + d3 * d3) + 1.0f;
                    if (f4 > 40.0f) {
                        f4 = 40.0f;
                    }
                    this.a.aA = (float)((double)this.a.aA + d4 * (double)(0.7f / f4 / f5));
                    this.a.ba += this.a.aA;
                }
            }
        } else if (this.b >= 100) {
            bdl2 = this.a.aQ.a((cpk)this.a, 150.0, 150.0);
            this.a.aL().a(baw.e);
            if (bdl2 != null) {
                this.a.aL().a(baw.i);
                ((adb)this.a.aL().b(baw.i)).a(new amj(bdl2.aU, bdl2.aV, bdl2.aW));
            }
        }
    }

    @Override
    public void b() {
        this.b = 0;
    }

    @Override
    public baw d() {
        return baw.g;
    }
}

