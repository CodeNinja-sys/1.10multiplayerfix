/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

public class coj
extends cli {
    private ve a;
    private ve b;
    private ve c;
    private ve d;
    private static final cm e = new hj();

    protected coj() {
        super(ahk.C, bif.q);
        this.D(this.O.b().a(j, (Comparable)((Object)bqk.c)));
        this.b(true);
        this.a(zm.b);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        super.a(iu2, cmz2, dbk2);
        this.d(iu2, cmz2);
    }

    public boolean c(iu iu2, cmz cmz2) {
        return this.h().a(iu2, cmz2) != null || this.w().a(iu2, cmz2) != null;
    }

    private void d(iu iu2, cmz cmz2) {
        block9: {
            int n2;
            aiz aiz2;
            block8: {
                int n3;
                Object object;
                aiz2 = this.v().a(iu2, cmz2);
                if (aiz2 == null) break block8;
                for (int i2 = 0; i2 < this.v().b(); ++i2) {
                    object = aiz2.a(0, i2, 0);
                    iu2.a(((amr)object).c(), blg.a.s(), 2);
                }
                cce cce2 = new cce(iu2);
                object = aiz2.a(0, 2, 0).c();
                cce2.a_((double)((cjx)object).a() + 0.5, (double)((cjx)object).b() + 0.05, (double)((cjx)object).c() + 0.5, 0.0f, 0.0f);
                iu2.b(cce2);
                for (n3 = 0; n3 < 120; ++n3) {
                    iu2.a(lz.G, (double)((cjx)object).a() + iu2.p.nextDouble(), (double)((cjx)object).b() + iu2.p.nextDouble() * 2.5, (double)((cjx)object).c() + iu2.p.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
                for (n3 = 0; n3 < this.v().b(); ++n3) {
                    amr amr2 = aiz2.a(0, n3, 0);
                    iu2.a(amr2.c(), blg.a);
                }
                break block9;
            }
            aiz2 = this.x().a(iu2, cmz2);
            if (aiz2 == null) break block9;
            for (int i3 = 0; i3 < this.x().c(); ++i3) {
                for (int i4 = 0; i4 < this.x().b(); ++i4) {
                    iu2.a(aiz2.a(i3, i4, 0).c(), blg.a.s(), 2);
                }
            }
            cmz cmz3 = aiz2.a(1, 2, 0).c();
            hx hx2 = new hx(iu2);
            hx2.b(true);
            hx2.a_((double)cmz3.a() + 0.5, (double)cmz3.b() + 0.05, (double)cmz3.c() + 0.5, 0.0f, 0.0f);
            iu2.b(hx2);
            for (n2 = 0; n2 < 120; ++n2) {
                iu2.a(lz.F, (double)cmz3.a() + iu2.p.nextDouble(), (double)cmz3.b() + iu2.p.nextDouble() * 3.9, (double)cmz3.c() + iu2.p.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (n2 = 0; n2 < this.x().c(); ++n2) {
                for (int i5 = 0; i5 < this.x().b(); ++i5) {
                    amr amr3 = aiz2.a(n2, i5, 0);
                    iu2.a(amr3.c(), blg.a);
                }
            }
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return iu2.n((cmz)cmz2).t().L.i() && iu2.n(cmz2.h()).q();
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
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(j, (Comparable)((Object)bga2.B_().e()));
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(j, (Comparable)((Object)bqk.b(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((bqk)((Object)dbk2.b(j))).c();
    }

    @Override
    protected bkp a() {
        return new bkp(this, j);
    }

    protected ve h() {
        if (this.a == null) {
            this.a = chl.a().a(" ", "#", "#").a('#', amr.a(ail.a(blg.aJ))).b();
        }
        return this.a;
    }

    protected ve v() {
        if (this.b == null) {
            this.b = chl.a().a("^", "#", "#").a('^', amr.a(e)).a('#', amr.a(ail.a(blg.aJ))).b();
        }
        return this.b;
    }

    protected ve w() {
        if (this.c == null) {
            this.c = chl.a().a("~ ~", "###", "~#~").a('#', amr.a(ail.a(blg.S))).a('~', amr.a(na.a(ahk.a))).b();
        }
        return this.c;
    }

    protected ve x() {
        if (this.d == null) {
            this.d = chl.a().a("~^~", "###", "~#~").a('^', amr.a(e)).a('#', amr.a(ail.a(blg.S))).a('~', amr.a(na.a(ahk.a))).b();
        }
        return this.d;
    }
}

