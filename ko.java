/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class ko
extends to {
    public ko(boolean bl2) {
        super(bl2);
    }

    protected boolean a(bfa bfa2) {
        ahk ahk2 = bfa2.s().a();
        return ahk2 == ahk.a || ahk2 == ahk.j || bfa2 == blg.c || bfa2 == blg.d || bfa2 == blg.r || bfa2 == blg.s || bfa2 == blg.g || bfa2 == blg.bn;
    }

    public void b(iu iu2, Random random, cmz cmz2) {
    }

    protected void a(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2).t() != blg.d) {
            this.a(iu2, cmz2, blg.d.s());
        }
    }
}

