/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.Random;

public class cvc
extends ar {
    public static final yc a = ajj.o;
    public static final ddi b = ddi.b("nodrop");
    private static final cm h = new bpc();
    protected static final cxt c = new cxt(0.25, 0.0, 0.25, 0.75, 0.5, 0.75);
    protected static final cxt d = new cxt(0.25, 0.25, 0.5, 0.75, 0.75, 1.0);
    protected static final cxt e = new cxt(0.25, 0.25, 0.0, 0.75, 0.75, 0.5);
    protected static final cxt f = new cxt(0.5, 0.25, 0.25, 1.0, 0.75, 0.75);
    protected static final cxt g = new cxt(0.0, 0.25, 0.25, 0.5, 0.75, 0.75);
    private ve i;
    private ve j;

    protected cvc() {
        super(ahk.q);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public String az_() {
        return caf.a("tile.skull.skeleton.name");
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(a))) {
            default: {
                return c;
            }
            case c: {
                return d;
            }
            case d: {
                return e;
            }
            case e: {
                return f;
            }
            case f: 
        }
        return g;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)bga2.B_())).a(b, Boolean.valueOf(false));
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new tr();
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        int n2 = 0;
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof tr) {
            n2 = ((tr)bql2).f();
        }
        return new bhl(hp.ch, 1, n2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        if (bdl2.G.d) {
            dbk2 = dbk2.a(b, Boolean.valueOf(true));
            iu2.a(cmz2, dbk2, 4);
        }
        super.a(iu2, cmz2, dbk2, bdl2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2;
        if (iu2.C) {
            return;
        }
        if (!((Boolean)dbk2.b(b)).booleanValue() && (bql2 = iu2.q(cmz2)) instanceof tr) {
            tr tr2 = (tr)bql2;
            bhl bhl2 = this.c(iu2, cmz2, dbk2);
            if (tr2.f() == 3 && tr2.d() != null) {
                bhl2.d(new bvp());
                bvp bvp2 = new bvp();
                ayj.a(bvp2, tr2.d());
                bhl2.o().a("SkullOwner", bvp2);
            }
            cvc.a(iu2, cmz2, bhl2);
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.ch;
    }

    public boolean b(iu iu2, cmz cmz2, bhl bhl2) {
        if (bhl2.h() == 1 && cmz2.b() >= 2 && iu2.Q() != ct.a && !iu2.C) {
            return this.h().a(iu2, cmz2) != null;
        }
        return false;
    }

    public void a(iu iu2, cmz cmz2, tr tr2) {
        int n2;
        Object object;
        int n3;
        if (tr2.f() != 1 || cmz2.b() < 2 || iu2.Q() == ct.a || iu2.C) {
            return;
        }
        ve ve2 = this.v();
        aiz aiz2 = ve2.a(iu2, cmz2);
        if (aiz2 == null) {
            return;
        }
        for (n3 = 0; n3 < 3; ++n3) {
            amr amr2 = aiz2.a(n3, 0, 0);
            iu2.a(amr2.c(), amr2.a().a(b, Boolean.valueOf(true)), 2);
        }
        for (n3 = 0; n3 < ve2.c(); ++n3) {
            for (int i2 = 0; i2 < ve2.b(); ++i2) {
                object = aiz2.a(n3, i2, 0);
                iu2.a(((amr)object).c(), blg.a.s(), 2);
            }
        }
        cmz cmz3 = aiz2.a(1, 0, 0).c();
        dga dga2 = new dga(iu2);
        object = aiz2.a(1, 2, 0).c();
        dga2.a_((double)((cjx)object).a() + 0.5, (double)((cjx)object).b() + 0.55, (double)((cjx)object).c() + 0.5, aiz2.b().l() == ctv.a ? 0.0f : 90.0f, 0.0f);
        dga2.ah = aiz2.b().l() == ctv.a ? 0.0f : 90.0f;
        dga2.T();
        for (bdl bdl2 : iu2.a(bdl.class, dga2.cD().b(50.0))) {
            bdl2.a((cyd)bpa.I);
        }
        iu2.b(dga2);
        for (n2 = 0; n2 < 120; ++n2) {
            iu2.a(lz.F, (double)cmz3.a() + iu2.p.nextDouble(), (double)(cmz3.b() - 2) + iu2.p.nextDouble() * 3.9, (double)cmz3.c() + iu2.p.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
        }
        for (n2 = 0; n2 < ve2.c(); ++n2) {
            for (int i3 = 0; i3 < ve2.b(); ++i3) {
                amr amr3 = aiz2.a(n2, i3, 0);
                iu2.a(amr3.c(), blg.a);
            }
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bqk.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).b();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }

    protected ve h() {
        if (this.i == null) {
            this.i = chl.a().a("   ", "###", "~#~").a('#', amr.a(ail.a(blg.aW))).a('~', amr.a(na.a(ahk.a))).b();
        }
        return this.i;
    }

    protected ve v() {
        if (this.j == null) {
            this.j = chl.a().a("^^^", "###", "~#~").a('#', amr.a(ail.a(blg.aW))).a('^', h).a('~', amr.a(na.a(ahk.a))).b();
        }
        return this.j;
    }
}

