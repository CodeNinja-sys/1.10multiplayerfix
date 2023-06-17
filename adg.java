/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class adg
extends bfa {
    public static final byc a = byc.a("variant", zg.class);

    public adg() {
        super(ahk.d);
        this.D(this.O.b().a(a, (Comparable)((Object)zg.a)));
        this.a(zm.b);
    }

    @Override
    public int d(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (zg zg2 : zg.values()) {
            list.add(new bhl(azg2, 1, zg2.b()));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)zg.a(n2)));
    }

    @Override
    public bif a(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).c();
    }

    @Override
    public int e(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

