/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public abstract class amh
extends lp {
    protected byc a;

    protected amh() {
        this.D(this.O.b().a(this.h(), (Comparable)((Object)(this.d() == ayx.b ? amt.b : amt.a))));
    }

    @Override
    public int d(dbk dbk2) {
        return ((amt)((Object)dbk2.b(this.h()))).c();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (amt amt2 : amt.a(this.d())) {
            list.add(new bhl(azg2, 1, amt2.c()));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(this.h(), (Comparable)((Object)amt.a(this.d(), n2)));
    }

    public abstract ayx d();

    public bvs h() {
        if (this.a == null) {
            this.a = byc.a("type", amt.class, new bxx(this));
        }
        return this.a;
    }

    @Override
    public int e(dbk dbk2) {
        return ((amt)((Object)dbk2.b(this.h()))).c();
    }

    @Override
    protected bkp a() {
        return new bkp(this, this.h());
    }

    @Override
    public bjp aA_() {
        return bjp.b;
    }
}

