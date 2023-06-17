/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cqe
extends agz {
    public static final byc f = byc.a("color", dck.class);

    public cqe() {
        super(ahk.s, false);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(f, (Comparable)((Object)dck.a)));
        this.a(zm.c);
    }

    @Override
    public int d(dbk dbk2) {
        return ((dck)((Object)dbk2.b(f))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (int i2 = 0; i2 < dck.values().length; ++i2) {
            list.add(new bhl(azg2, 1, i2));
        }
    }

    @Override
    public bif a(dbk dbk2) {
        return ((dck)((Object)dbk2.b(f))).e();
    }

    @Override
    public kj b() {
        return kj.d;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(f, (Comparable)((Object)dck.b(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((dck)((Object)dbk2.b(f))).b();
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                return dbk2.a(a, dbk2.b(c)).a(b, dbk2.b(d)).a(c, dbk2.b(a)).a(d, dbk2.b(b));
            }
            case d: {
                return dbk2.a(a, dbk2.b(b)).a(b, dbk2.b(c)).a(c, dbk2.b(d)).a(d, dbk2.b(a));
            }
            case b: {
                return dbk2.a(a, dbk2.b(d)).a(b, dbk2.b(a)).a(c, dbk2.b(b)).a(d, dbk2.b(c));
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        switch (cdk2) {
            case b: {
                return dbk2.a(a, dbk2.b(c)).a(c, dbk2.b(a));
            }
            case c: {
                return dbk2.a(b, dbk2.b(d)).a(d, dbk2.b(b));
            }
        }
        return super.a(dbk2, cdk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, d, c, f);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (!iu2.C) {
            aga.c(iu2, cmz2);
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        if (!iu2.C) {
            aga.c(iu2, cmz2);
        }
    }
}

