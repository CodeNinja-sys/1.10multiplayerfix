/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class aob
extends bfa {
    public static final byc a = byc.a("variant", btc.class);

    public aob() {
        super(ahk.B);
        this.D(this.O.b().a(a, (Comparable)((Object)btc.a)));
        this.c(0.0f);
        this.a(zm.c);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public static boolean m(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        return dbk2 == blg.b.s().a(cec.a, (Comparable)((Object)ade.a)) || bfa2 == blg.e || bfa2 == blg.bf;
    }

    @Override
    protected bhl a_(dbk dbk2) {
        switch ((btc)((Object)dbk2.b(a))) {
            case b: {
                return new bhl(blg.e);
            }
            case c: {
                return new bhl(blg.bf);
            }
            case d: {
                return new bhl(blg.bf, 1, crt.b.b());
            }
            case e: {
                return new bhl(blg.bf, 1, crt.c.b());
            }
            case f: {
                return new bhl(blg.bf, 1, crt.d.b());
            }
        }
        return new bhl(blg.b);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (!iu2.C && iu2.F().b("doTileDrops")) {
            zv zv2 = new zv(iu2);
            zv2.a_((double)cmz2.a() + 0.5, cmz2.b(), (double)cmz2.c() + 0.5, 0.0f, 0.0f);
            iu2.b(zv2);
            zv2.at();
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this, 1, dbk2.t().e(dbk2));
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (btc btc2 : btc.values()) {
            list.add(new bhl(azg2, 1, btc2.c()));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)btc.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((btc)((Object)dbk2.b(a))).c();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

