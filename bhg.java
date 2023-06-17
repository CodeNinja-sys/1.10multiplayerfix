/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bhg
extends cmy {
    public static final byc a = byc.a("variant", aac.class);

    public bhg() {
        this.D(this.O.b().a(a, (Comparable)((Object)aac.a)));
    }

    @Override
    public int d(dbk dbk2) {
        return ((aac)((Object)dbk2.b(a))).c();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (aac aac2 : aac.values()) {
            list.add(new bhl(azg2, 1, aac2.c()));
        }
    }

    @Override
    public bif a(dbk dbk2) {
        return ((aac)((Object)dbk2.b(a))).d();
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)aac.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((aac)((Object)dbk2.b(a))).c();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public int m(dbk dbk2) {
        aac aac2 = (aac)((Object)dbk2.b(a));
        return aac2.b();
    }
}

