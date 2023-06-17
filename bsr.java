/*
 * Decompiled with CFR 0.150.
 */
public class bsr
extends bxs {
    public static final byc a = byc.a("shape", ctp.class);

    protected bsr() {
        super(false);
        this.D(this.O.b().a(a, (Comparable)((Object)ctp.a)));
    }

    @Override
    protected void b(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (bfa2.s().m() && new axn(this, iu2, cmz2, dbk2).b() == 3) {
            this.b(iu2, cmz2, dbk2, false);
        }
    }

    @Override
    public bvs d() {
        return a;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)ctp.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((ctp)((Object)dbk2.b(a))).b();
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
        return new bkp(this, a);
    }
}

