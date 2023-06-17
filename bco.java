/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bco
extends anr {
    private static final azm a = new azm();
    private static final akf b = new akf(false);
    private static final asf c = new asf(false, false);
    private static final asf d = new asf(false, true);
    private static final beq e = new beq(blg.Y, 0);
    private final cwy f;

    public bco(cwy cwy2, ain ain2) {
        super(ain2);
        this.f = cwy2;
        this.B.add(new clh(cqw.class, 8, 4, 4));
        this.B.add(new clh(amq.class, 4, 2, 3));
        this.z.z = 10;
        if (cwy2 == cwy.b || cwy2 == cwy.c) {
            this.z.C = 7;
            this.z.D = 1;
            this.z.E = 3;
        } else {
            this.z.C = 1;
            this.z.E = 1;
        }
    }

    @Override
    public ko a(Random random) {
        if ((this.f == cwy.b || this.f == cwy.c) && random.nextInt(3) == 0) {
            if (this.f == cwy.c || random.nextInt(13) == 0) {
                return d;
            }
            return c;
        }
        if (random.nextInt(3) == 0) {
            return a;
        }
        return b;
    }

    @Override
    public to b(Random random) {
        if (random.nextInt(5) > 0) {
            return new cfr(deq.c);
        }
        return new cfr(deq.b);
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.f == cwy.b || this.f == cwy.c) {
            n5 = random.nextInt(3);
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                cmz cmz3 = iu2.k(cmz2.e(n3, 0, n2));
                e.a(iu2, random, cmz3);
            }
        }
        s.a(bon.d);
        for (n5 = 0; n5 < 7; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(iu2.k(cmz2.e(n4, 0, n3)).b() + 32);
            s.a(iu2, random, cmz2.e(n4, n2, n3));
        }
        super.a(iu2, random, cmz2);
    }

    @Override
    public void a(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        if (this.f == cwy.b || this.f == cwy.c) {
            this.x = blg.c.s();
            this.y = blg.d.s();
            if (d2 > 1.75) {
                this.x = blg.d.s().a(bwt.a, (Comparable)((Object)dgu.b));
            } else if (d2 > -0.95) {
                this.x = blg.d.s().a(bwt.a, (Comparable)((Object)dgu.c));
            }
        }
        this.b(iu2, random, cnb2, n2, n3, d2);
    }
}

