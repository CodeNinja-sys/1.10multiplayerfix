/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class oo
extends cv {
    public oo() {
    }

    public oo(iu iu2, Random random, int n2, int n3) {
        this(iu2, random, n2, n3, iu2.a(new cmz(n2 * 16 + 8, 0, n3 * 16 + 8)));
    }

    public oo(iu iu2, Random random, int n2, int n3, anr anr2) {
        super(n2, n3);
        if (anr2 == cff.w || anr2 == cff.x) {
            bit bit2 = new bit(random, n2 * 16, n3 * 16);
            this.a.add(bit2);
        } else if (anr2 == cff.h) {
            cpo cpo2 = new cpo(random, n2 * 16, n3 * 16);
            this.a.add(cpo2);
        } else if (anr2 == cff.d || anr2 == cff.s) {
            bnp bnp2 = new bnp(random, n2 * 16, n3 * 16);
            this.a.add(bnp2);
        } else if (anr2 == cff.n || anr2 == cff.F) {
            bnu bnu2 = new bnu(random, n2 * 16, n3 * 16);
            this.a.add(bnu2);
        }
        this.d();
    }
}

