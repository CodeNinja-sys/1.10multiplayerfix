/*
 * Decompiled with CFR 0.150.
 */
final class pp
extends ckc {
    pp() {
    }

    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        double d2 = bcl2.b() + (double)bqk2.h();
        double d3 = (float)bcl2.e().b() + 0.2f;
        double d4 = bcl2.d() + (double)bqk2.j();
        cpk cpk2 = clx.a(bcl2.a(), clx.h(bhl2), d2, d3, d4);
        if (cpk2 instanceof bga && bhl2.s()) {
            cpk2.g(bhl2.q());
        }
        clx.a(bcl2.a(), null, bhl2, cpk2);
        bhl2.a(1);
        return bhl2;
    }
}

