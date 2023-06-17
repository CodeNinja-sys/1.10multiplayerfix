/*
 * Decompiled with CFR 0.150.
 */
public class cve
extends awv {
    private final bym m;

    public cve(bym bym2) {
        super(dah.ci, csg.f);
        this.m = bym2;
        this.k = btu.a;
        this.i = true;
        this.j = 0;
    }

    @Override
    public void a() {
        if (this.m.bk || !this.m.aQ()) {
            this.l = true;
            return;
        }
        this.f = (float)this.m.aU;
        this.g = (float)this.m.aV;
        this.h = (float)this.m.aW;
        float f2 = this.m.p(0.0f);
        this.d = 0.0f + 1.0f * f2 * f2;
        this.e = 0.7f + 0.5f * f2;
    }
}

