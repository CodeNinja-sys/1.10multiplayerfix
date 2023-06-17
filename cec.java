/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cec
extends bfa {
    public static final byc a = byc.a("variant", ade.class);

    public cec() {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)ade.a)));
        this.a(zm.b);
    }

    @Override
    public String az_() {
        return caf.a(this.n() + "." + ade.a.d() + ".name");
    }

    @Override
    public bif a(dbk dbk2) {
        return ((ade)((Object)dbk2.b(a))).c();
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (dbk2.b(a) == ade.a) {
            return azg.a(blg.e);
        }
        return azg.a(blg.b);
    }

    @Override
    public int d(dbk dbk2) {
        return ((ade)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (ade ade2 : ade.values()) {
            list.add(new bhl(azg2, 1, ade2.b()));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)ade.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((ade)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

