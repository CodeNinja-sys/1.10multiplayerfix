/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class cay
extends bfa {
    protected static final cxt b = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.03125, 0.9375);
    protected static final cxt c = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.0625, 0.9375);
    protected static final cxt d = new cxt(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

    protected cay(ahk ahk2) {
        this(ahk2, ahk2.p());
    }

    protected cay(ahk ahk2, bif bif2) {
        super(ahk2, bif2);
        this.a(zm.d);
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        boolean bl2;
        boolean bl3 = bl2 = this.m(dbk2) > 0;
        if (bl2) {
            return b;
        }
        return c;
    }

    @Override
    public int a(iu iu2) {
        return 20;
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
    public boolean a(bnj bnj2, cmz cmz2) {
        return true;
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return this.g(iu2, cmz2.h());
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.g(iu2, cmz2.h())) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    private boolean g(iu iu2, cmz cmz2) {
        return iu2.n(cmz2).q() || iu2.n(cmz2).t() instanceof gd;
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        int n2 = this.m(dbk2);
        if (n2 > 0) {
            this.a(iu2, cmz2, dbk2, n2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        if (iu2.C) {
            return;
        }
        int n2 = this.m(dbk2);
        if (n2 == 0) {
            this.a(iu2, cmz2, dbk2, n2);
        }
    }

    protected void a(iu iu2, cmz cmz2, dbk dbk2, int n2) {
        boolean bl2;
        int n3 = this.e(iu2, cmz2);
        boolean bl3 = n2 > 0;
        boolean bl4 = bl2 = n3 > 0;
        if (n2 != n3) {
            dbk2 = this.a(dbk2, n3);
            iu2.a(cmz2, dbk2, 2);
            this.f(iu2, cmz2);
            iu2.b(cmz2, cmz2);
        }
        if (!bl2 && bl3) {
            this.d(iu2, cmz2);
        } else if (bl2 && !bl3) {
            this.c(iu2, cmz2);
        }
        if (bl2) {
            iu2.a(new cmz(cmz2), (bfa)this, this.a(iu2));
        }
    }

    protected abstract void c(iu var1, cmz var2);

    protected abstract void d(iu var1, cmz var2);

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.m(dbk2) > 0) {
            this.f(iu2, cmz2);
        }
        super.b(iu2, cmz2, dbk2);
    }

    protected void f(iu iu2, cmz cmz2) {
        iu2.b(cmz2, this);
        iu2.b(cmz2.h(), this);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return this.m(dbk2);
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.b) {
            return this.m(dbk2);
        }
        return 0;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public bez j(dbk dbk2) {
        return bez.b;
    }

    protected abstract int e(iu var1, cmz var2);

    protected abstract int m(dbk var1);

    protected abstract dbk a(dbk var1, int var2);
}

