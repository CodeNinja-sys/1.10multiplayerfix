/*
 * Decompiled with CFR 0.150.
 */
public class arb
extends awv {
    private final ob m;
    private int n;

    public arb(ob ob2) {
        super(dah.aK, csg.h);
        this.m = ob2;
        this.i = true;
        this.j = 0;
        this.d = 0.1f;
    }

    @Override
    public void a() {
        ++this.n;
        if (this.m.bk || this.n > 20 && !this.m.bL()) {
            this.l = true;
            return;
        }
        this.f = (float)this.m.aU;
        this.g = (float)this.m.aV;
        this.h = (float)this.m.aW;
        float f2 = cmk.a(this.m.aX * this.m.aX + this.m.aZ * this.m.aZ + this.m.aY * this.m.aY);
        float f3 = f2 / 2.0f;
        this.d = (double)f2 >= 0.01 ? cmk.a(f3 * f3, 0.0f, 1.0f) : 0.0f;
        if (this.n < 20) {
            this.d = 0.0f;
        } else if (this.n < 40) {
            this.d = (float)((double)this.d * ((double)(this.n - 20) / 20.0));
        }
        float f4 = 0.8f;
        this.e = this.d > 0.8f ? 1.0f + (this.d - 0.8f) : 1.0f;
    }
}

