/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class biv
extends bfa {
    public static final byc a = byc.a("variant", afg.class);
    private final bfa b;

    public biv(ahk ahk2, bif bif2, bfa bfa2) {
        super(ahk2, bif2);
        this.D(this.O.b().a(a, (Comparable)((Object)afg.l)));
        this.b = bfa2;
    }

    @Override
    public int a(Random random) {
        return Math.max(0, random.nextInt(10) - 7);
    }

    @Override
    public bif a(dbk dbk2) {
        switch ((afg)((Object)dbk2.b(a))) {
            case m: {
                return bif.e;
            }
            case k: {
                return bif.d;
            }
            case j: {
                return bif.d;
            }
        }
        return super.a(dbk2);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(this.b);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this.b);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s();
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)afg.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((afg)((Object)dbk2.b(a))).b();
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        block0 : switch (ih2) {
            case c: {
                switch ((afg)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)afg.i));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)afg.h));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)afg.g));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)afg.f));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)afg.d));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)afg.c));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)afg.b));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)afg.a));
                    }
                    case j: {
                        break;
                    }
                    default: {
                        return dbk2;
                    }
                }
            }
            case d: {
                switch ((afg)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)afg.g));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)afg.d));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)afg.a));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)afg.h));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)afg.b));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)afg.i));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)afg.f));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)afg.c));
                    }
                    case j: {
                        break;
                    }
                    default: {
                        return dbk2;
                    }
                }
            }
            case b: {
                switch ((afg)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)afg.c));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)afg.f));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)afg.i));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)afg.b));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)afg.h));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)afg.a));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)afg.d));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)afg.g));
                    }
                    case j: {
                        break block0;
                    }
                }
                return dbk2;
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        afg afg2 = (afg)((Object)dbk2.b(a));
        switch (cdk2) {
            case b: {
                switch (afg2) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)afg.g));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)afg.h));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)afg.i));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)afg.a));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)afg.b));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)afg.c));
                    }
                }
                break;
            }
            case c: {
                switch (afg2) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)afg.c));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)afg.a));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)afg.f));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)afg.d));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)afg.i));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)afg.g));
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

