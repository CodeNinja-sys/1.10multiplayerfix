/*
 * Decompiled with CFR 0.150.
 */
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class cyi
extends en {
    int b;

    protected cyi(ahk ahk2) {
        super(ahk2);
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        iu2.a(cmz2, cyi.b(this.L).s().a(a, dbk2.b(a)), 2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        int n2;
        int n3 = (Integer)dbk2.b(a);
        int n4 = 1;
        if (this.L == ahk.i && !iu2.q.m()) {
            n4 = 2;
        }
        int n5 = this.a(iu2);
        if (n3 > 0) {
            int n6 = -100;
            this.b = 0;
            for (bqk bqk2 : afj.a) {
                n6 = this.a(iu2, cmz2.c(bqk2), n6);
            }
            int n7 = n6 + n4;
            if (n7 >= 8 || n6 < 0) {
                n7 = -1;
            }
            if ((n2 = this.l(iu2.n(cmz2.g()))) >= 0) {
                n7 = n2 >= 8 ? n2 : n2 + 8;
            }
            if (this.b >= 2 && this.L == ahk.h) {
                dbk dbk3 = iu2.n(cmz2.h());
                if (dbk3.a().a()) {
                    n7 = 0;
                } else if (dbk3.a() == this.L && (Integer)dbk3.b(a) == 0) {
                    n7 = 0;
                }
            }
            if (this.L == ahk.i && n3 < 8 && n7 < 8 && n7 > n3 && random.nextInt(4) != 0) {
                n5 *= 4;
            }
            if (n7 == n3) {
                this.e(iu2, cmz2, dbk2);
            } else {
                n3 = n7;
                if (n3 < 0) {
                    iu2.f(cmz2);
                } else {
                    dbk2 = dbk2.a(a, Integer.valueOf(n3));
                    iu2.a(cmz2, dbk2, 2);
                    iu2.a(cmz2, (bfa)this, n5);
                    iu2.b(cmz2, this);
                }
            }
        } else {
            this.e(iu2, cmz2, dbk2);
        }
        dbk dbk4 = iu2.n(cmz2.h());
        if (this.g(iu2, cmz2.h(), dbk4)) {
            if (this.L == ahk.i && iu2.n(cmz2.h()).a() == ahk.h) {
                iu2.a(cmz2.h(), blg.b.s());
                this.b(iu2, cmz2.h());
                return;
            }
            if (n3 >= 8) {
                this.a(iu2, cmz2.h(), dbk4, n3);
            } else {
                this.a(iu2, cmz2.h(), dbk4, n3 + 8);
            }
        } else if (n3 >= 0 && (n3 == 0 || this.f(iu2, cmz2.h(), dbk4))) {
            Set set = this.c(iu2, cmz2);
            n2 = n3 + n4;
            if (n3 >= 8) {
                n2 = 1;
            }
            if (n2 >= 8) {
                return;
            }
            for (bqk bqk3 : set) {
                this.a(iu2, cmz2.c(bqk3), iu2.n(cmz2.c(bqk3)), n2);
            }
        }
    }

    private void a(iu iu2, cmz cmz2, dbk dbk2, int n2) {
        if (this.g(iu2, cmz2, dbk2)) {
            if (dbk2.a() != ahk.a) {
                if (this.L == ahk.i) {
                    this.b(iu2, cmz2);
                } else {
                    dbk2.t().b(iu2, cmz2, dbk2, 0);
                }
            }
            iu2.a(cmz2, this.s().a(a, Integer.valueOf(n2)), 3);
        }
    }

    private int a(iu iu2, cmz cmz2, int n2, bqk bqk2) {
        int n3 = 1000;
        for (bqk bqk3 : afj.a) {
            dbk dbk2;
            cmz cmz3;
            if (bqk3 == bqk2 || this.f(iu2, cmz3 = cmz2.c(bqk3), dbk2 = iu2.n(cmz3)) || dbk2.a() == this.L && (Integer)dbk2.b(a) <= 0) continue;
            if (this.f(iu2, cmz3.h(), dbk2)) {
                int n4;
                if (n2 >= this.b(iu2) || (n4 = this.a(iu2, cmz3, n2 + 1, bqk3.e())) >= n3) continue;
                n3 = n4;
                continue;
            }
            return n2;
        }
        return n3;
    }

    private int b(iu iu2) {
        if (this.L == ahk.i && !iu2.q.m()) {
            return 2;
        }
        return 4;
    }

    private Set c(iu iu2, cmz cmz2) {
        int n2 = 1000;
        EnumSet<bqk> enumSet = EnumSet.noneOf(bqk.class);
        for (bqk bqk2 : afj.a) {
            dbk dbk2;
            cmz cmz3 = cmz2.c(bqk2);
            if (this.f(iu2, cmz3, dbk2 = iu2.n(cmz3)) || dbk2.a() == this.L && (Integer)dbk2.b(a) <= 0) continue;
            int n3 = this.f(iu2, cmz3.h(), iu2.n(cmz3.h())) ? this.a(iu2, cmz3, 1, bqk2.e()) : 0;
            if (n3 < n2) {
                enumSet.clear();
            }
            if (n3 > n2) continue;
            enumSet.add(bqk2);
            n2 = n3;
        }
        return enumSet;
    }

    private boolean f(iu iu2, cmz cmz2, dbk dbk2) {
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2 instanceof xt || bfa2 == blg.an || bfa2 == blg.au || bfa2 == blg.aM) {
            return true;
        }
        if (bfa2.L == ahk.E || bfa2.L == ahk.J) {
            return true;
        }
        return bfa2.L.c();
    }

    protected int a(iu iu2, cmz cmz2, int n2) {
        int n3 = this.l(iu2.n(cmz2));
        if (n3 < 0) {
            return n2;
        }
        if (n3 == 0) {
            ++this.b;
        }
        if (n3 >= 8) {
            n3 = 0;
        }
        return n2 < 0 || n3 < n2 ? n3 : n2;
    }

    private boolean g(iu iu2, cmz cmz2, dbk dbk2) {
        ahk ahk2 = dbk2.a();
        return ahk2 != this.L && ahk2 != ahk.i && !this.f(iu2, cmz2, dbk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (!this.d(iu2, cmz2, dbk2)) {
            iu2.a(cmz2, (bfa)this, this.a(iu2));
        }
    }
}

