/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ddd
extends bfa {
    public static final byc a = byc.a("variant", bjn.class);

    public ddd() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)bjn.a)));
        this.a(zm.b);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        if (n2 == bjn.c.b()) {
            switch (bqk2.l()) {
                case c: {
                    return this.s().a(a, (Comparable)((Object)bjn.e));
                }
                case a: {
                    return this.s().a(a, (Comparable)((Object)bjn.d));
                }
                case b: {
                    return this.s().a(a, (Comparable)((Object)bjn.c));
                }
            }
        }
        if (n2 == bjn.b.b()) {
            return this.s().a(a, (Comparable)((Object)bjn.b));
        }
        return this.s().a(a, (Comparable)((Object)bjn.a));
    }

    @Override
    public int d(dbk dbk2) {
        bjn bjn2 = (bjn)((Object)dbk2.b(a));
        if (bjn2 == bjn.d || bjn2 == bjn.e) {
            return bjn.c.b();
        }
        return bjn2.b();
    }

    @Override
    protected bhl a_(dbk dbk2) {
        bjn bjn2 = (bjn)((Object)dbk2.b(a));
        if (bjn2 == bjn.d || bjn2 == bjn.e) {
            return new bhl(azg.a(this), 1, bjn.c.b());
        }
        return super.a_(dbk2);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2, 1, bjn.a.b()));
        list.add(new bhl(azg2, 1, bjn.b.b()));
        list.add(new bhl(azg2, 1, bjn.c.b()));
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.p;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bjn.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((bjn)((Object)dbk2.b(a))).b();
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case d: 
            case b: {
                switch ((bjn)((Object)dbk2.b(a))) {
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)bjn.e));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)bjn.d));
                    }
                }
                return dbk2;
            }
        }
        return dbk2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

