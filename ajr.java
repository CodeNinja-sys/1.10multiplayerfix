/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ajr
extends cgv {
    public static final byc a = byc.a("color", dck.class);

    public ajr(ahk ahk2) {
        super(ahk2, false);
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
    public kj b() {
        return kj.d;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)dck.b(n2)));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (!iu2.C) {
            aga.c(iu2, cmz2);
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        if (!iu2.C) {
            aga.c(iu2, cmz2);
        }
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

