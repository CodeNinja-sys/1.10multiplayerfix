/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class che
extends to {
    private final bfa a;

    public che(bfa bfa2) {
        this.a = bfa2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        if (iu2.n(cmz2.g()).t() != blg.b) {
            return false;
        }
        if (iu2.n(cmz2.h()).t() != blg.b) {
            return false;
        }
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.a() != ahk.a && dbk2.t() != blg.b) {
            return false;
        }
        int n2 = 0;
        if (iu2.n(cmz2.k()).t() == blg.b) {
            ++n2;
        }
        if (iu2.n(cmz2.l()).t() == blg.b) {
            ++n2;
        }
        if (iu2.n(cmz2.i()).t() == blg.b) {
            ++n2;
        }
        if (iu2.n(cmz2.j()).t() == blg.b) {
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
        if (n2 == 3 && n3 == 1) {
            dbk dbk3 = this.a.s();
            iu2.a(cmz2, dbk3, 2);
            iu2.a(cmz2, dbk3, random);
        }
        return true;
    }
}

