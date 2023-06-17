/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ew
extends to {
    private final bfa a;
    private final boolean b;

    public ew(bfa bfa2, boolean bl2) {
        this.a = bfa2;
        this.b = bl2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        if (iu2.n(cmz2.g()).t() != blg.aV) {
            return false;
        }
        if (iu2.n(cmz2).a() != ahk.a && iu2.n(cmz2).t() != blg.aV) {
            return false;
        }
        int n2 = 0;
        if (iu2.n(cmz2.k()).t() == blg.aV) {
            ++n2;
        }
        if (iu2.n(cmz2.l()).t() == blg.aV) {
            ++n2;
        }
        if (iu2.n(cmz2.i()).t() == blg.aV) {
            ++n2;
        }
        if (iu2.n(cmz2.j()).t() == blg.aV) {
            ++n2;
        }
        if (iu2.n(cmz2.h()).t() == blg.aV) {
            ++n2;
        }
        int n3 = 0;
        if (iu2.c(cmz2.k())) {
            ++n3;
        }
        if (iu2.c(cmz2.l())) {
            ++n3;
        }
        if (iu2.c(cmz2.i())) {
            ++n3;
        }
        if (iu2.c(cmz2.j())) {
            ++n3;
        }
        if (iu2.c(cmz2.h())) {
            ++n3;
        }
        if (!this.b && n2 == 4 && n3 == 1 || n2 == 5) {
            dbk dbk2 = this.a.s();
            iu2.a(cmz2, dbk2, 2);
            iu2.a(cmz2, dbk2, random);
        }
        return true;
    }
}

