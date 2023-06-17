/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class czv
extends bfa {
    private final boolean a;

    public czv(boolean bl2) {
        super(ahk.t);
        this.a = bl2;
        if (bl2) {
            this.a(1.0f);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.C) {
            return;
        }
        if (this.a && !iu2.x(cmz2)) {
            iu2.a(cmz2, blg.bJ.s(), 2);
        } else if (!this.a && iu2.x(cmz2)) {
            iu2.a(cmz2, blg.bK.s(), 2);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.C) {
            return;
        }
        if (this.a && !iu2.x(cmz2)) {
            iu2.a(cmz2, (bfa)this, 4);
        } else if (!this.a && iu2.x(cmz2)) {
            iu2.a(cmz2, blg.bK.s(), 2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (this.a && !iu2.x(cmz2)) {
            iu2.a(cmz2, blg.bJ.s(), 2);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.bJ);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.bJ);
    }

    @Override
    protected bhl a_(dbk dbk2) {
        return new bhl(blg.bJ);
    }
}

