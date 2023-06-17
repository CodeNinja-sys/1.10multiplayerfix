/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bwu
extends anr {
    public bwu(ain ain2) {
        super(ain2);
        this.B.clear();
        this.x = blg.m.s();
        this.y = blg.m.s();
        this.z.z = -999;
        this.z.D = 2;
        this.z.F = 50;
        this.z.G = 10;
        this.B.clear();
        this.B.add(new clh(amq.class, 4, 2, 3));
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        super.a(iu2, random, cmz2);
        if (random.nextInt(1000) == 0) {
            int n2 = random.nextInt(16) + 8;
            int n3 = random.nextInt(16) + 8;
            cmz cmz3 = iu2.k(cmz2.e(n2, 0, n3)).g();
            new nj().a(iu2, random, cmz3);
        }
        if (random.nextInt(64) == 0) {
            new ch().a(iu2, random, cmz2);
        }
    }
}

