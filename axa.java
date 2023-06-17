/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class axa
extends anr {
    private final boolean a;
    private final cqk b = new cqk();
    private final dao c = new dao(4);

    public axa(boolean bl2, ain ain2) {
        super(ain2);
        this.a = bl2;
        if (bl2) {
            this.x = blg.aJ.s();
        }
        this.B.clear();
        this.B.add(new clh(amq.class, 10, 2, 3));
        this.B.add(new clh(cmg.class, 1, 1, 2));
    }

    @Override
    public float f() {
        return 0.07f;
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        if (this.a) {
            int n2;
            int n3;
            int n4;
            for (n4 = 0; n4 < 3; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                this.b.a(iu2, random, iu2.k(cmz2.e(n3, 0, n2)));
            }
            for (n4 = 0; n4 < 2; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                this.c.a(iu2, random, iu2.k(cmz2.e(n3, 0, n2)));
            }
        }
        super.a(iu2, random, cmz2);
    }

    @Override
    public ko a(Random random) {
        return new akf(false);
    }
}

