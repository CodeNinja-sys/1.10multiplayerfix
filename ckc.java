/*
 * Decompiled with CFR 0.150.
 */
public class ckc
implements atl {
    @Override
    public final bhl b(bcl bcl2, bhl bhl2) {
        bhl bhl3 = this.a(bcl2, bhl2);
        this.a(bcl2);
        this.a(bcl2, (bqk)((Object)bcl2.f().b(crh.a)));
        return bhl3;
    }

    protected bhl a(bcl bcl2, bhl bhl2) {
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        bts bts2 = crh.a(bcl2);
        bhl bhl3 = bhl2.a(1);
        ckc.a(bcl2.a(), bhl3, 6, bqk2, bts2);
        return bhl2;
    }

    public static void a(iu iu2, bhl bhl2, int n2, bqk bqk2, bts bts2) {
        double d2 = bts2.b();
        double d3 = bts2.c();
        double d4 = bts2.d();
        d3 = bqk2.l() == ctv.b ? (d3 -= 0.125) : (d3 -= 0.15625);
        er er2 = new er(iu2, d2, d3, d4, bhl2);
        double d5 = iu2.p.nextDouble() * 0.1 + 0.2;
        er2.aX = (double)bqk2.h() * d5;
        er2.aY = 0.2f;
        er2.aZ = (double)bqk2.j() * d5;
        er2.aX += iu2.p.nextGaussian() * (double)0.0075f * (double)n2;
        er2.aY += iu2.p.nextGaussian() * (double)0.0075f * (double)n2;
        er2.aZ += iu2.p.nextGaussian() * (double)0.0075f * (double)n2;
        iu2.b(er2);
    }

    protected void a(bcl bcl2) {
        bcl2.a().b(1000, bcl2.e(), 0);
    }

    protected void a(bcl bcl2, bqk bqk2) {
        bcl2.a().b(2000, bcl2.e(), this.a(bqk2));
    }

    private int a(bqk bqk2) {
        return bqk2.h() + 1 + (bqk2.j() + 1) * 3;
    }
}

