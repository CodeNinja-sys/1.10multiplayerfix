/*
 * Decompiled with CFR 0.150.
 */
public class aua
extends awv {
    private final bdl m;
    private final cef n;

    public aua(bdl bdl2, cef cef2) {
        super(dah.dA, csg.g);
        this.m = bdl2;
        this.n = cef2;
        this.k = btu.a;
        this.i = true;
        this.j = 0;
    }

    @Override
    public void a() {
        if (this.n.bk || !this.m.cp() || this.m.cL() != this.n) {
            this.l = true;
            return;
        }
        float f2 = cmk.a(this.n.aX * this.n.aX + this.n.aZ * this.n.aZ);
        this.d = (double)f2 >= 0.01 ? 0.0f + cmk.a(f2, 0.0f, 1.0f) * 0.75f : 0.0f;
    }
}

