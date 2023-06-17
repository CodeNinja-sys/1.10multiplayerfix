/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public abstract class clq
extends bnr {
    public static final ddi a = ddi.b("seamless");
    public static final byc b = byc.a("variant", dgk.class);

    public clq() {
        super(ahk.e);
        dbk dbk2 = this.O.b();
        dbk2 = this.d() ? dbk2.a(a, Boolean.valueOf(false)) : dbk2.a(c, (Comparable)((Object)dew.b));
        this.D(dbk2.a(b, (Comparable)((Object)dgk.a)));
        this.a(zm.b);
    }

    @Override
    public String az_() {
        return caf.a(this.n() + ".red_sandstone.name");
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.cP);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.cP, 1, ((dgk)((Object)dbk2.b(b))).b());
    }

    @Override
    public String b(int n2) {
        return super.n() + "." + dgk.a(n2).d();
    }

    @Override
    public bvs av_() {
        return b;
    }

    @Override
    public Comparable a(bhl bhl2) {
        return dgk.a(bhl2.h() & 7);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        if (azg2 == azg.a(blg.cO)) {
            return;
        }
        for (dgk dgk2 : dgk.values()) {
            list.add(new bhl(azg2, 1, dgk2.b()));
        }
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s().a(b, (Comparable)((Object)dgk.a(n2 & 7)));
        dbk2 = this.d() ? dbk2.a(a, Boolean.valueOf((n2 & 8) != 0)) : dbk2.a(c, (Comparable)((Object)((n2 & 8) == 0 ? dew.b : dew.a)));
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((dgk)((Object)dbk2.b(b))).b();
        if (this.d()) {
            if (((Boolean)dbk2.b(a)).booleanValue()) {
                n2 |= 8;
            }
        } else if (dbk2.b(c) == dew.a) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        if (this.d()) {
            return new bkp(this, a, b);
        }
        return new bkp(this, c, b);
    }

    @Override
    public bif a(dbk dbk2) {
        return ((dgk)((Object)dbk2.b(b))).c();
    }

    @Override
    public int d(dbk dbk2) {
        return ((dgk)((Object)dbk2.b(b))).b();
    }
}

