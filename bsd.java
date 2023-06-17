/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bsd
extends bfa {
    public static final byc a = byc.a("color", dck.class);

    public bsd(ahk ahk2) {
        super(ahk2);
        this.D(this.O.b().a(a, (Comparable)((Object)dck.a)));
        this.a(zm.b);
    }

    @Override
    public int d(dbk dbk2) {
        return ((dck)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (dck dck2 : dck.values()) {
            list.add(new bhl(azg2, 1, dck2.b()));
        }
    }

    @Override
    public bif a(dbk dbk2) {
        return ((dck)((Object)dbk2.b(a))).e();
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)dck.b(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((dck)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

