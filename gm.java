/*
 * Decompiled with CFR 0.150.
 */
public class gm
extends bxs {
    public static final byc a = byc.a("shape", ctp.class, new buv());
    public static final ddi b = ddi.b("powered");

    protected gm() {
        super(true);
        this.D(this.O.b().a(a, (Comparable)((Object)ctp.a)).a(b, Boolean.valueOf(false)));
    }

    protected boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2, int n2) {
        if (n2 >= 8) {
            return false;
        }
        int n3 = cmz2.a();
        int n4 = cmz2.b();
        int n5 = cmz2.c();
        boolean bl3 = true;
        ctp ctp2 = (ctp)((Object)dbk2.b(a));
        switch (ctp2) {
            case a: {
                if (bl2) {
                    ++n5;
                    break;
                }
                --n5;
                break;
            }
            case b: {
                if (bl2) {
                    --n3;
                    break;
                }
                ++n3;
                break;
            }
            case c: {
                if (bl2) {
                    --n3;
                } else {
                    ++n3;
                    ++n4;
                    bl3 = false;
                }
                ctp2 = ctp.b;
                break;
            }
            case d: {
                if (bl2) {
                    --n3;
                    ++n4;
                    bl3 = false;
                } else {
                    ++n3;
                }
                ctp2 = ctp.b;
                break;
            }
            case e: {
                if (bl2) {
                    ++n5;
                } else {
                    --n5;
                    ++n4;
                    bl3 = false;
                }
                ctp2 = ctp.a;
                break;
            }
            case f: {
                if (bl2) {
                    ++n5;
                    ++n4;
                    bl3 = false;
                } else {
                    --n5;
                }
                ctp2 = ctp.a;
            }
        }
        if (this.a(iu2, new cmz(n3, n4, n5), bl2, n2, ctp2)) {
            return true;
        }
        return bl3 && this.a(iu2, new cmz(n3, n4 - 1, n5), bl2, n2, ctp2);
    }

    protected boolean a(iu iu2, cmz cmz2, boolean bl2, int n2, ctp ctp2) {
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() != this) {
            return false;
        }
        ctp ctp3 = (ctp)((Object)dbk2.b(a));
        if (ctp2 == ctp.b && (ctp3 == ctp.a || ctp3 == ctp.e || ctp3 == ctp.f)) {
            return false;
        }
        if (ctp2 == ctp.a && (ctp3 == ctp.b || ctp3 == ctp.c || ctp3 == ctp.d)) {
            return false;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            if (iu2.x(cmz2)) {
                return true;
            }
            return this.a(iu2, cmz2, dbk2, bl2, n2 + 1);
        }
        return false;
    }

    @Override
    protected void b(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        boolean bl2;
        boolean bl3 = (Boolean)dbk2.b(b);
        boolean bl4 = bl2 = iu2.x(cmz2) || this.a(iu2, cmz2, dbk2, true, 0) || this.a(iu2, cmz2, dbk2, false, 0);
        if (bl2 != bl3) {
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(bl2)), 3);
            iu2.b(cmz2.h(), this);
            if (((ctp)((Object)dbk2.b(a))).c()) {
                iu2.b(cmz2.g(), this);
            }
        }
    }

    @Override
    public bvs d() {
        return a;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)ctp.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((ctp)((Object)dbk2.b(a))).b();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                switch ((ctp)((Object)dbk2.b(a))) {
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                }
            }
            case d: {
                switch ((ctp)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)ctp.b));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)ctp.a));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                }
            }
            case b: {
                switch ((ctp)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)ctp.b));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)ctp.a));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                }
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        ctp ctp2 = (ctp)((Object)dbk2.b(a));
        switch (cdk2) {
            case b: {
                switch (ctp2) {
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                }
                break;
            }
            case c: {
                switch (ctp2) {
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                }
                break;
            }
        }
        return super.a(dbk2, cdk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }
}

