/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bwt
extends bfa {
    public static final byc a = byc.a("variant", dgu.class);
    public static final ddi b = ddi.b("snowy");

    protected bwt() {
        super(ahk.c);
        this.D(this.O.b().a(a, (Comparable)((Object)dgu.a)).a(b, Boolean.valueOf(false)));
        this.a(zm.b);
    }

    @Override
    public bif a(dbk dbk2) {
        return ((dgu)((Object)dbk2.b(a))).d();
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (dbk2.b(a) == dgu.c) {
            bfa bfa2 = bnj2.n(cmz2.g()).t();
            dbk2 = dbk2.a(b, Boolean.valueOf(bfa2 == blg.aJ || bfa2 == blg.aH));
        }
        return dbk2;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(this, 1, dgu.a.b()));
        list.add(new bhl(this, 1, dgu.b.b()));
        list.add(new bhl(this, 1, dgu.c.b()));
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this, 1, ((dgu)((Object)dbk2.b(a))).b());
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)dgu.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((dgu)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }

    @Override
    public int d(dbk dbk2) {
        dgu dgu2 = (dgu)((Object)dbk2.b(a));
        if (dgu2 == dgu.c) {
            dgu2 = dgu.a;
        }
        return dgu2.b();
    }
}

