/*
 * Decompiled with CFR 0.150.
 */
public class yt
extends awv {
    private final cef m;
    private float n = 0.0f;

    public yt(cef cef2) {
        super(dah.dB, csg.g);
        this.m = cef2;
        this.i = true;
        this.j = 0;
    }

    @Override
    public void a() {
        if (this.m.bk) {
            this.l = true;
            return;
        }
        this.f = (float)this.m.aU;
        this.g = (float)this.m.aV;
        this.h = (float)this.m.aW;
        float f2 = cmk.a(this.m.aX * this.m.aX + this.m.aZ * this.m.aZ);
        if ((double)f2 >= 0.01) {
            this.n = cmk.a(this.n + 0.0025f, 0.0f, 1.0f);
            this.d = 0.0f + cmk.a(f2, 0.0f, 0.5f) * 0.7f;
        } else {
            this.n = 0.0f;
            this.d = 0.0f;
        }
    }
}

