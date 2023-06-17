/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class crw
extends bfa {
    public static final byc a = byc.a("variant", bzb.class);
    public static final int b = bzb.a.b();
    public static final int c = bzb.b.b();
    public static final int d = bzb.c.b();

    public crw() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)bzb.a)));
        this.a(zm.b);
    }

    @Override
    public String az_() {
        return caf.a(this.n() + "." + bzb.a.c() + ".name");
    }

    @Override
    public bif a(dbk dbk2) {
        if (dbk2.b(a) == bzb.a) {
            return bif.y;
        }
        return bif.G;
    }

    @Override
    public int d(dbk dbk2) {
        return ((bzb)((Object)dbk2.b(a))).b();
    }

    @Override
    public int e(dbk dbk2) {
        return ((bzb)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bzb.a(n2)));
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2, 1, b));
        list.add(new bhl(azg2, 1, c));
        list.add(new bhl(azg2, 1, d));
    }
}

