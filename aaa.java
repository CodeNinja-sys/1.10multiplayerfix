/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class aaa
extends bfa {
    public static final byc a = byc.a("type", byj.class);

    public aaa() {
        super(ahk.e, aac.b.d());
        this.D(this.O.b().a(a, (Comparable)((Object)byj.a)));
        this.a(zm.b);
    }

    @Override
    public int d(dbk dbk2) {
        return ((byj)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (byj byj2 : byj.values()) {
            list.add(new bhl(azg2, 1, byj2.b()));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)byj.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((byj)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

