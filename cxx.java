/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cxx
extends anr {
    private static final bmc a = new bmc(false);

    protected cxx(ain ain2) {
        super(ain2);
        this.B.add(new clh(it.class, 1, 2, 6));
        this.z.z = 1;
        this.z.B = 4;
        this.z.C = 20;
    }

    @Override
    public ko a(Random random) {
        if (random.nextInt(5) > 0) {
            return a;
        }
        return t;
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        s.a(bon.c);
        for (int i2 = 0; i2 < 7; ++i2) {
            int n2 = random.nextInt(16) + 8;
            int n3 = random.nextInt(16) + 8;
            int n4 = random.nextInt(iu2.k(cmz2.e(n2, 0, n3)).b() + 32);
            s.a(iu2, random, cmz2.e(n2, n4, n3));
        }
        super.a(iu2, random, cmz2);
    }

    @Override
    public Class g() {
        return cxx.class;
    }
}

