/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public abstract class cda
extends bnr {
    public static final byc a = byc.a("variant", zg.class);

    public cda() {
        super(ahk.d);
        dbk dbk2 = this.O.b();
        if (!this.d()) {
            dbk2 = dbk2.a(c, (Comparable)((Object)dew.b));
        }
        this.D(dbk2.a(a, (Comparable)((Object)zg.a)));
        this.a(zm.b);
    }

    @Override
    public bif a(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).c();
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.bM);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.bM, 1, ((zg)((Object)dbk2.b(a))).b());
    }

    @Override
    public String b(int n2) {
        return super.n() + "." + zg.a(n2).d();
    }

    @Override
    public bvs av_() {
        return a;
    }

    @Override
    public Comparable a(bhl bhl2) {
        return zg.a(bhl2.h() & 7);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        if (azg2 == azg.a(blg.bL)) {
            return;
        }
        for (zg zg2 : zg.values()) {
            list.add(new bhl(azg2, 1, zg2.b()));
        }
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s().a(a, (Comparable)((Object)zg.a(n2 & 7)));
        if (!this.d()) {
            dbk2 = dbk2.a(c, (Comparable)((Object)((n2 & 8) == 0 ? dew.b : dew.a)));
        }
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((zg)((Object)dbk2.b(a))).b();
        if (!this.d() && dbk2.b(c) == dew.a) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        if (this.d()) {
            return new bkp(this, a);
        }
        return new bkp(this, c, a);
    }

    @Override
    public int d(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).b();
    }
}

