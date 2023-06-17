/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.List;
import java.util.Random;

public class bra
extends vh
implements gk {
    public static final ddi c = ddi.b("powered");
    public static final byc d = byc.a("mode", aih.class);

    public bra(boolean bl2) {
        super(bl2);
        this.D(this.O.b().a(j, (Comparable)((Object)bqk.c)).a(c, Boolean.valueOf(false)).a(d, (Comparable)((Object)aih.a)));
        this.I = true;
    }

    @Override
    public String az_() {
        return caf.a("item.comparator.name");
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.co;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.co);
    }

    @Override
    protected int r(dbk dbk2) {
        return 2;
    }

    @Override
    protected dbk s(dbk dbk2) {
        Boolean bl2 = (Boolean)dbk2.b(c);
        aih aih2 = (aih)((Object)dbk2.b(d));
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        return blg.ck.s().a(j, (Comparable)((Object)bqk2)).a(c, bl2).a(d, (Comparable)((Object)aih2));
    }

    @Override
    protected dbk t(dbk dbk2) {
        Boolean bl2 = (Boolean)dbk2.b(c);
        aih aih2 = (aih)((Object)dbk2.b(d));
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        return blg.cj.s().a(j, (Comparable)((Object)bqk2)).a(c, bl2).a(d, (Comparable)((Object)aih2));
    }

    @Override
    protected boolean m(dbk dbk2) {
        return this.b || (Boolean)dbk2.b(c) != false;
    }

    @Override
    protected int c(bnj bnj2, cmz cmz2, dbk dbk2) {
        bql bql2 = bnj2.q(cmz2);
        if (bql2 instanceof csd) {
            return ((csd)bql2).f();
        }
        return 0;
    }

    private int j(iu iu2, cmz cmz2, dbk dbk2) {
        if (dbk2.b(d) == aih.b) {
            return Math.max(this.g(iu2, cmz2, dbk2) - this.b((bnj)iu2, cmz2, dbk2), 0);
        }
        return this.g(iu2, cmz2, dbk2);
    }

    @Override
    protected boolean f(iu iu2, cmz cmz2, dbk dbk2) {
        int n2 = this.g(iu2, cmz2, dbk2);
        if (n2 >= 15) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        int n3 = this.b((bnj)iu2, cmz2, dbk2);
        if (n3 == 0) {
            return true;
        }
        return n2 >= n3;
    }

    @Override
    protected int g(iu iu2, cmz cmz2, dbk dbk2) {
        int n2 = super.g(iu2, cmz2, dbk2);
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        cmz cmz3 = cmz2.c(bqk2);
        dbk dbk3 = iu2.n(cmz3);
        if (dbk3.n()) {
            n2 = dbk3.a(iu2, cmz3);
        } else if (n2 < 15 && dbk3.l()) {
            cvr cvr2;
            dbk3 = iu2.n(cmz3 = cmz3.c(bqk2));
            if (dbk3.n()) {
                n2 = dbk3.a(iu2, cmz3);
            } else if (dbk3.a() == ahk.a && (cvr2 = this.a(iu2, bqk2, cmz3)) != null) {
                n2 = cvr2.C();
            }
        }
        return n2;
    }

    private cvr a(iu iu2, bqk bqk2, cmz cmz2) {
        List list = iu2.a(cvr.class, new cxt(cmz2.a(), cmz2.b(), cmz2.c(), cmz2.a() + 1, cmz2.b() + 1, cmz2.c() + 1), (cm)new bbi(this, bqk2));
        if (list.size() == 1) {
            return (cvr)list.get(0);
        }
        return null;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (!bdl2.G.e) {
            return false;
        }
        float f5 = (dbk2 = dbk2.a(d)).b(d) == aih.b ? 0.55f : 0.5f;
        iu2.a(bdl2, cmz2, dah.al, csg.e, 0.3f, f5);
        iu2.a(cmz2, dbk2, 2);
        this.k(iu2, cmz2, dbk2);
        return true;
    }

    @Override
    protected void e(iu iu2, cmz cmz2, dbk dbk2) {
        int n2;
        if (iu2.d(cmz2, this)) {
            return;
        }
        int n3 = this.j(iu2, cmz2, dbk2);
        bql bql2 = iu2.q(cmz2);
        int n4 = n2 = bql2 instanceof csd ? ((csd)bql2).f() : 0;
        if (n3 != n2 || this.m(dbk2) != this.f(iu2, cmz2, dbk2)) {
            if (this.i(iu2, cmz2, dbk2)) {
                iu2.a(cmz2, this, 2, -1);
            } else {
                iu2.a(cmz2, this, 2, 0);
            }
        }
    }

    private void k(iu iu2, cmz cmz2, dbk dbk2) {
        int n2 = this.j(iu2, cmz2, dbk2);
        bql bql2 = iu2.q(cmz2);
        int n3 = 0;
        if (bql2 instanceof csd) {
            csd csd2 = (csd)bql2;
            n3 = csd2.f();
            csd2.a(n2);
        }
        if (n3 != n2 || dbk2.b(d) == aih.a) {
            boolean bl2 = this.f(iu2, cmz2, dbk2);
            boolean bl3 = this.m(dbk2);
            if (bl3 && !bl2) {
                iu2.a(cmz2, dbk2.a(c, Boolean.valueOf(false)), 2);
            } else if (!bl3 && bl2) {
                iu2.a(cmz2, dbk2.a(c, Boolean.valueOf(true)), 2);
            }
            this.h(iu2, cmz2, dbk2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (this.b) {
            iu2.a(cmz2, this.t(dbk2).a(c, Boolean.valueOf(true)), 4);
        }
        this.k(iu2, cmz2, dbk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        super.a(iu2, cmz2, dbk2);
        iu2.a(cmz2, this.a(iu2, 0));
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        super.b(iu2, cmz2, dbk2);
        iu2.r(cmz2);
        this.h(iu2, cmz2, dbk2);
    }

    @Override
    public boolean a(dbk dbk2, iu iu2, cmz cmz2, int n2, int n3) {
        super.a(dbk2, iu2, cmz2, n2, n3);
        bql bql2 = iu2.q(cmz2);
        if (bql2 == null) {
            return false;
        }
        return bql2.a_(n2, n3);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new csd();
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(j, (Comparable)((Object)bqk.b(n2))).a(c, Boolean.valueOf((n2 & 8) > 0)).a(d, (Comparable)((Object)((n2 & 4) > 0 ? aih.b : aih.a)));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(j))).c();
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= 8;
        }
        if (dbk2.b(d) == aih.b) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(j, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(j)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(j))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, j, d, c);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(j, (Comparable)((Object)bga2.B_().e())).a(c, Boolean.valueOf(false)).a(d, (Comparable)((Object)aih.a));
    }
}

