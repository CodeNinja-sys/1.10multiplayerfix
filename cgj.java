/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cgj
extends anr {
    protected static final bpb a = new bpb(false, true);
    protected static final bpb b = new bpb(false, false);
    protected static final ddz c = new ddz(false);
    private final nk d;

    public cgj(nk nk2, ain ain2) {
        super(ain2);
        this.d = nk2;
        this.z.z = 10;
        this.z.C = 2;
        if (this.d == nk.b) {
            this.z.z = 6;
            this.z.B = 100;
            this.z.C = 1;
            this.B.add(new clh(amq.class, 4, 2, 3));
        }
        if (this.d == nk.a) {
            this.B.add(new clh(cqw.class, 5, 4, 4));
        }
        if (this.d == nk.d) {
            this.z.z = -999;
        }
    }

    @Override
    public ko a(Random random) {
        if (this.d == nk.d && random.nextInt(3) > 0) {
            return c;
        }
        if (this.d == nk.c || random.nextInt(5) == 0) {
            return b;
        }
        if (random.nextInt(10) == 0) {
            return u;
        }
        return t;
    }

    @Override
    public amt a(Random random, cmz cmz2) {
        if (this.d == nk.b) {
            double d2 = cmk.a((1.0 + r.a((double)cmz2.a() / 48.0, (double)cmz2.c() / 48.0)) / 2.0, 0.0, 0.9999);
            amt amt2 = amt.values()[(int)(d2 * (double)amt.values().length)];
            if (amt2 == amt.c) {
                return amt.b;
            }
            return amt2;
        }
        return super.a(random, cmz2);
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        if (this.d == nk.d) {
            this.b(iu2, random, cmz2);
        }
        int n2 = random.nextInt(5) - 3;
        if (this.d == nk.b) {
            n2 += 2;
        }
        this.a(iu2, random, cmz2, n2);
        super.a(iu2, random, cmz2);
    }

    protected void b(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                to to2;
                int n2 = i2 * 4 + 1 + 8 + random.nextInt(3);
                int n3 = i3 * 4 + 1 + 8 + random.nextInt(3);
                cmz cmz3 = iu2.k(cmz2.e(n2, 0, n3));
                if (random.nextInt(20) == 0) {
                    to2 = new axx();
                    ((axx)to2).a(iu2, random, cmz3);
                    continue;
                }
                to2 = this.a(random);
                to2.e();
                if (!to2.a(iu2, random, cmz3)) continue;
                ((ko)to2).b(iu2, random, cmz3);
            }
        }
    }

    protected void a(iu iu2, Random random, cmz cmz2, int n2) {
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = random.nextInt(3);
            if (n3 == 0) {
                s.a(bon.b);
            } else if (n3 == 1) {
                s.a(bon.e);
            } else if (n3 == 2) {
                s.a(bon.f);
            }
            for (int i3 = 0; i3 < 5; ++i3) {
                int n4 = random.nextInt(16) + 8;
                int n5 = random.nextInt(16) + 8;
                int n6 = random.nextInt(iu2.k(cmz2.e(n4, 0, n5)).b() + 32);
                if (s.a(iu2, random, new cmz(cmz2.a() + n4, n6, cmz2.c() + n5))) continue block0;
            }
        }
    }

    @Override
    public Class g() {
        return cgj.class;
    }

    @Override
    public int a(cmz cmz2) {
        int n2 = super.a(cmz2);
        if (this.d == nk.d) {
            return (n2 & 0xFEFEFE) + 2634762 >> 1;
        }
        return n2;
    }
}

