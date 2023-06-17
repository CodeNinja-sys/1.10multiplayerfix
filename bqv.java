/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bqv
extends bfa {
    public static final byc a = byc.a("type", byr.class);

    public bqv() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)byr.a)));
        this.a(zm.b);
    }

    @Override
    public int d(dbk dbk2) {
        return ((byr)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (byr byr2 : byr.values()) {
            list.add(new bhl(azg2, 1, byr2.b()));
        }
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.d;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)byr.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((byr)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

