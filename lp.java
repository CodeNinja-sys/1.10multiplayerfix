/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class lp
extends bfa {
    protected static final cxt b = new cxt(0.3f, 0.0, 0.3f, 0.7f, 0.6f, 0.7f);

    protected lp() {
        this(ahk.k);
    }

    protected lp(ahk ahk2) {
        this(ahk2, ahk2.p());
    }

    protected lp(ahk ahk2, bif bif2) {
        super(ahk2, bif2);
        this.b(true);
        this.a(zm.c);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return super.a(iu2, cmz2) && this.m(iu2.n(cmz2.h()));
    }

    protected boolean m(dbk dbk2) {
        return dbk2.t() == blg.c || dbk2.t() == blg.d || dbk2.t() == blg.ak;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        super.a(dbk2, iu2, cmz2, bfa2);
        this.f(iu2, cmz2, dbk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        this.f(iu2, cmz2, dbk2);
    }

    protected void f(iu iu2, cmz cmz2, dbk dbk2) {
        if (!this.e(iu2, cmz2, dbk2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.a(cmz2, blg.a.s(), 3);
        }
    }

    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        return this.m(iu2.n(cmz2.h()));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public kj b() {
        return kj.c;
    }
}

