/*
 * Decompiled with CFR 0.150.
 */
public class v
extends um {
    @Override
    public aqn a() {
        return this.a(cmk.c(this.b.cD().a), cmk.c(this.b.cD().b + 0.5), cmk.c(this.b.cD().c));
    }

    @Override
    public aqn a(double d2, double d3, double d4) {
        return this.a(cmk.c(d2 - (double)(this.b.bl / 2.0f)), cmk.c(d3 + 0.5), cmk.c(d4 - (double)(this.b.bl / 2.0f)));
    }

    @Override
    public int a(aqn[] arraqn, aqn aqn2, aqn aqn3, float f2) {
        int n2 = 0;
        for (bqk bqk2 : bqk.values()) {
            aqn aqn4 = this.b(aqn2.a + bqk2.h(), aqn2.b + bqk2.i(), aqn2.c + bqk2.j());
            if (aqn4 == null || aqn4.i || !(aqn4.a(aqn3) < f2)) continue;
            arraqn[n2++] = aqn4;
        }
        return n2;
    }

    @Override
    public cfh a(bnj bnj2, int n2, int n3, int n4, xy xy2, int n5, int n6, int n7, boolean bl2, boolean bl3) {
        return cfh.g;
    }

    @Override
    public cfh a(bnj bnj2, int n2, int n3, int n4) {
        return cfh.g;
    }

    private aqn b(int n2, int n3, int n4) {
        cfh cfh2 = this.c(n2, n3, n4);
        if (cfh2 == cfh.g) {
            return this.a(n2, n3, n4);
        }
        return null;
    }

    private cfh c(int n2, int n3, int n4) {
        pj pj2 = new pj();
        for (int i2 = n2; i2 < n2 + this.d; ++i2) {
            for (int i3 = n3; i3 < n3 + this.e; ++i3) {
                for (int i4 = n4; i4 < n4 + this.f; ++i4) {
                    dbk dbk2 = this.a.n(pj2.a(i2, i3, i4));
                    if (dbk2.a() == ahk.h) continue;
                    return cfh.a;
                }
            }
        }
        return cfh.g;
    }
}

