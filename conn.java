/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class conn
extends anr {
    protected boolean a;

    protected conn(boolean bl2, ain ain2) {
        super(ain2);
        this.a = bl2;
        this.B.add(new clh(it.class, 5, 2, 6));
        this.z.z = 0;
        this.z.A = 0.05f;
        this.z.B = 4;
        this.z.C = 10;
    }

    @Override
    public amt a(Random random, cmz cmz2) {
        double d2 = r.a((double)cmz2.a() / 200.0, (double)cmz2.c() / 200.0);
        if (d2 < -0.8) {
            int n2 = random.nextInt(4);
            switch (n2) {
                case 0: {
                    return amt.g;
                }
                case 1: {
                    return amt.f;
                }
                case 2: {
                    return amt.i;
                }
            }
            return amt.h;
        }
        if (random.nextInt(3) > 0) {
            int n3 = random.nextInt(3);
            if (n3 == 0) {
                return amt.b;
            }
            if (n3 == 1) {
                return amt.e;
            }
            return amt.j;
        }
        return amt.a;
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5;
        double d2 = r.a((double)(cmz2.a() + 8) / 200.0, (double)(cmz2.c() + 8) / 200.0);
        if (d2 < -0.8) {
            this.z.B = 15;
            this.z.C = 5;
        } else {
            this.z.B = 4;
            this.z.C = 10;
            s.a(bon.c);
            for (n5 = 0; n5 < 7; ++n5) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(iu2.k(cmz2.e(n4, 0, n3)).b() + 32);
                s.a(iu2, random, cmz2.e(n4, n2, n3));
            }
        }
        if (this.a) {
            s.a(bon.a);
            for (n5 = 0; n5 < 10; ++n5) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(iu2.k(cmz2.e(n4, 0, n3)).b() + 32);
                s.a(iu2, random, cmz2.e(n4, n2, n3));
            }
        }
        super.a(iu2, random, cmz2);
    }

    @Override
    public ko a(Random random) {
        if (random.nextInt(3) == 0) {
            return u;
        }
        return t;
    }
}

