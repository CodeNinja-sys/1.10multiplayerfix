/*
 * Decompiled with CFR 0.150.
 */
final class bvw
extends ckc {
    bvw() {
    }

    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        double d2 = bcl2.b() + (double)bqk2.h();
        double d3 = (float)bcl2.e().b() + 0.2f;
        double d4 = bcl2.d() + (double)bqk2.j();
        p p2 = new p(bcl2.a(), d2, d3, d4, bhl2);
        bcl2.a().b(p2);
        bhl2.a(1);
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        bcl2.a().b(1004, bcl2.e(), 0);
    }
}

