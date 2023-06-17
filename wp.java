/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class wp
extends anr {
    protected static final dbk a = blg.bx.s();

    protected wp(ain ain2) {
        super(ain2);
        this.z.z = 2;
        this.z.B = 1;
        this.z.D = 1;
        this.z.E = 8;
        this.z.F = 10;
        this.z.J = 1;
        this.z.y = 4;
        this.z.I = 0;
        this.z.H = 0;
        this.z.C = 5;
        this.A.add(new clh(akr.class, 1, 1, 1));
    }

    @Override
    public ko a(Random random) {
        return v;
    }

    @Override
    public int a(cmz cmz2) {
        double d2 = r.a((double)cmz2.a() * 0.0225, (double)cmz2.c() * 0.0225);
        if (d2 < -0.1) {
            return 5011004;
        }
        return 6975545;
    }

    @Override
    public int b(cmz cmz2) {
        return 6975545;
    }

    @Override
    public amt a(Random random, cmz cmz2) {
        return amt.c;
    }

    @Override
    public void a(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        double d3 = r.a((double)n2 * 0.25, (double)n3 * 0.25);
        if (d3 > 0.0) {
            int n4 = n2 & 0xF;
            int n5 = n3 & 0xF;
            for (int i2 = 255; i2 >= 0; --i2) {
                if (cnb2.a(n5, i2, n4).a() == ahk.a) continue;
                if (i2 != 62 || cnb2.a(n5, i2, n4).t() == blg.j) break;
                cnb2.a(n5, i2, n4, n);
                if (!(d3 < 0.12)) break;
                cnb2.a(n5, i2 + 1, n4, a);
                break;
            }
        }
        this.b(iu2, random, cnb2, n2, n3, d2);
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        super.a(iu2, random, cmz2);
        if (random.nextInt(64) == 0) {
            new ch().a(iu2, random, cmz2);
        }
    }
}

