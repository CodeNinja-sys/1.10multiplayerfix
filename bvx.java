/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

final class bvx
extends ckc {
    bvx() {
    }

    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        bts bts2 = crh.a(bcl2);
        double d2 = bts2.b() + (double)((float)bqk2.h() * 0.3f);
        double d3 = bts2.c() + (double)((float)bqk2.i() * 0.3f);
        double d4 = bts2.d() + (double)((float)bqk2.j() * 0.3f);
        iu iu2 = bcl2.a();
        Random random = iu2.p;
        double d5 = random.nextGaussian() * 0.05 + (double)bqk2.h();
        double d6 = random.nextGaussian() * 0.05 + (double)bqk2.i();
        double d7 = random.nextGaussian() * 0.05 + (double)bqk2.j();
        iu2.b(new bx(iu2, d2, d3, d4, d5, d6, d7));
        bhl2.a(1);
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        bcl2.a().b(1018, bcl2.e(), 0);
    }
}

