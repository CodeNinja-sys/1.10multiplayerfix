/*
 * Decompiled with CFR 0.150.
 */
public abstract class bxs
extends bfa {
    protected static final cxt c = new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    protected final boolean d;

    public static boolean c(iu iu2, cmz cmz2) {
        return bxs.m(iu2.n(cmz2));
    }

    public static boolean m(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        return bfa2 == blg.av || bfa2 == blg.D || bfa2 == blg.E || bfa2 == blg.cs;
    }

    protected bxs(boolean bl2) {
        super(ahk.q);
        this.d = bl2;
        this.a(zm.e);
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
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        ctp ctp2;
        ctp ctp3 = ctp2 = dbk2.t() == this ? (ctp)((Object)dbk2.b(this.d())) : null;
        if (ctp2 != null && ctp2.c()) {
            return x;
        }
        return c;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.h()).q();
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (!iu2.C) {
            dbk2 = this.b(iu2, cmz2, dbk2, true);
            if (this.d) {
                dbk2.a(iu2, cmz2, this);
            }
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.C) {
            return;
        }
        ctp ctp2 = (ctp)((Object)dbk2.b(this.d()));
        boolean bl2 = false;
        if (!iu2.n(cmz2.h()).q()) {
            bl2 = true;
        }
        if (ctp2 == ctp.c && !iu2.n(cmz2.l()).q()) {
            bl2 = true;
        } else if (ctp2 == ctp.d && !iu2.n(cmz2.k()).q()) {
            bl2 = true;
        } else if (ctp2 == ctp.e && !iu2.n(cmz2.i()).q()) {
            bl2 = true;
        } else if (ctp2 == ctp.f && !iu2.n(cmz2.j()).q()) {
            bl2 = true;
        }
        if (bl2 && !iu2.c(cmz2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        } else {
            this.b(dbk2, iu2, cmz2, bfa2);
        }
    }

    protected void b(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
    }

    protected dbk b(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        if (iu2.C) {
            return dbk2;
        }
        return new axn(this, iu2, cmz2, dbk2).a(iu2.x(cmz2), bl2).c();
    }

    @Override
    public bez j(dbk dbk2) {
        return bez.a;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        super.b(iu2, cmz2, dbk2);
        if (((ctp)((Object)dbk2.b(this.d()))).c()) {
            iu2.b(cmz2.g(), this);
        }
        if (this.d) {
            iu2.b(cmz2, this);
            iu2.b(cmz2.h(), this);
        }
    }

    public abstract bvs d();
}

