/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class bbf
extends bnr {
    public static final byc a = byc.a("variant", axm.class);

    public bbf() {
        super(ahk.e);
        dbk dbk2 = this.O.b();
        if (!this.d()) {
            dbk2 = dbk2.a(c, (Comparable)((Object)dew.b));
        }
        this.D(dbk2.a(a, (Comparable)((Object)axm.a)));
        this.a(zm.b);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.cX);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.cX);
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s().a(a, (Comparable)((Object)axm.a));
        if (!this.d()) {
            dbk2 = dbk2.a(c, (Comparable)((Object)((n2 & 8) == 0 ? dew.b : dew.a)));
        }
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
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
    public String b(int n2) {
        return super.n();
    }

    @Override
    public bvs av_() {
        return a;
    }

    @Override
    public Comparable a(bhl bhl2) {
        return axm.a;
    }
}

