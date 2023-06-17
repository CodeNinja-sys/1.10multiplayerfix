/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bbt
extends bfa {
    public static final byc a = byc.a("variant", crt.class);
    public static final int b = crt.a.b();
    public static final int c = crt.b.b();
    public static final int d = crt.c.b();
    public static final int e = crt.d.b();

    public bbt() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)crt.a)));
        this.a(zm.b);
    }

    @Override
    public int d(dbk dbk2) {
        return ((crt)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (crt crt2 : crt.values()) {
            list.add(new bhl(azg2, 1, crt2.b()));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)crt.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((crt)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

