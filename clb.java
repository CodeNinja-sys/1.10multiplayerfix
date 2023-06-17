/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class clb
extends anr {
    private final to a = new bld(blg.be.s().a(aob.a, (Comparable)((Object)btc.a)), 9);
    private final akf b = new akf(false);
    private final aqw c;

    protected clb(aqw aqw2, ain ain2) {
        super(ain2);
        if (aqw2 == aqw.b) {
            this.z.z = 3;
        }
        this.c = aqw2;
    }

    @Override
    public ko a(Random random) {
        if (random.nextInt(3) > 0) {
            return this.b;
        }
        return super.a(random);
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        super.a(iu2, random, cmz2);
        int n5 = 3 + random.nextInt(6);
        for (n4 = 0; n4 < n5; ++n4) {
            int n6;
            n3 = random.nextInt(16);
            cmz cmz3 = cmz2.e(n3, n2 = random.nextInt(28) + 4, n6 = random.nextInt(16));
            if (iu2.n(cmz3).t() != blg.b) continue;
            iu2.a(cmz3, blg.bP.s(), 2);
        }
        for (n5 = 0; n5 < 7; ++n5) {
            n4 = random.nextInt(16);
            n3 = random.nextInt(64);
            n2 = random.nextInt(16);
            this.a.a(iu2, random, cmz2.e(n4, n3, n2));
        }
    }

    @Override
    public void a(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        this.x = blg.c.s();
        this.y = blg.d.s();
        if ((d2 < -1.0 || d2 > 2.0) && this.c == aqw.c) {
            this.x = blg.n.s();
            this.y = blg.n.s();
        } else if (d2 > 1.0 && this.c != aqw.b) {
            this.x = blg.b.s();
            this.y = blg.b.s();
        }
        this.b(iu2, random, cnb2, n2, n3, d2);
    }
}

