/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bnq
extends anr {
    private final boolean a;
    private static final dbk b = blg.r.s().a(ff.a, (Comparable)((Object)zg.d));
    private static final dbk c = blg.t.s().a(dbo.e, (Comparable)((Object)zg.d)).a(aai.b, Boolean.valueOf(false));
    private static final dbk d = blg.t.s().a(dbo.e, (Comparable)((Object)zg.a)).a(aai.b, Boolean.valueOf(false));

    public bnq(boolean bl2, ain ain2) {
        super(ain2);
        this.a = bl2;
        this.z.z = bl2 ? 2 : 50;
        this.z.C = 25;
        this.z.B = 4;
        if (!bl2) {
            this.A.add(new clh(fl.class, 2, 1, 1));
        }
        this.B.add(new clh(jp.class, 10, 4, 4));
    }

    @Override
    public ko a(Random random) {
        if (random.nextInt(10) == 0) {
            return u;
        }
        if (random.nextInt(2) == 0) {
            return new cxb(b, d);
        }
        if (!this.a && random.nextInt(3) == 0) {
            return new bma(false, 10, 20, b, c);
        }
        return new ctj(false, 4 + random.nextInt(7), b, c, true);
    }

    @Override
    public to b(Random random) {
        if (random.nextInt(4) == 0) {
            return new cfr(deq.c);
        }
        return new cfr(deq.b);
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        super.a(iu2, random, cmz2);
        int n2 = random.nextInt(16) + 8;
        int n3 = random.nextInt(16) + 8;
        int n4 = random.nextInt(iu2.k(cmz2.e(n2, 0, n3)).b() * 2);
        new cbs().a(iu2, random, cmz2.e(n2, n4, n3));
        bdy bdy2 = new bdy();
        for (n3 = 0; n3 < 50; ++n3) {
            n4 = random.nextInt(16) + 8;
            int n5 = 128;
            int n6 = random.nextInt(16) + 8;
            bdy2.a(iu2, random, cmz2.e(n4, 128, n6));
        }
    }
}

