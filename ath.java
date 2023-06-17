/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class ath
extends ajj {
    public static final ddi a = ddi.b("extended");
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
    protected static final cxt c = new cxt(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
    protected static final cxt e = new cxt(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
    protected static final cxt f = new cxt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
    protected static final cxt g = new cxt(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
    private final boolean h;

    public ath(boolean bl2) {
        super(ahk.H);
        this.D(this.O.b().a(o, (Comparable)((Object)bqk.c)).a(a, Boolean.valueOf(false)));
        this.h = bl2;
        this.a(acv.d);
        this.c(0.5f);
        this.a(zm.d);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            switch ((bqk)((Object)dbk2.b(o))) {
                case a: {
                    return g;
                }
                default: {
                    return f;
                }
                case c: {
                    return e;
                }
                case d: {
                    return d;
                }
                case e: {
                    return c;
                }
                case f: 
            }
            return b;
        }
        return x;
    }

    @Override
    public boolean f(dbk dbk2) {
        return (Boolean)dbk2.b(a) == false || dbk2.b(o) == bqk.a;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        ath.a(cmz2, cxt2, list, dbk2.c((bnj)iu2, cmz2));
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        iu2.a(cmz2, dbk2.a(o, (Comparable)((Object)ath.a(cmz2, bga2))), 2);
        if (!iu2.C) {
            this.e(iu2, cmz2, dbk2);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!iu2.C) {
            this.e(iu2, cmz2, dbk2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (!iu2.C && iu2.q(cmz2) == null) {
            this.e(iu2, cmz2, dbk2);
        }
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(o, (Comparable)((Object)ath.a(cmz2, bga2))).a(a, Boolean.valueOf(false));
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(o));
        boolean bl2 = this.b(iu2, cmz2, bqk2);
        if (bl2 && !((Boolean)dbk2.b(a)).booleanValue()) {
            if (new act(iu2, cmz2, bqk2, true).a()) {
                iu2.c(cmz2, this, 0, bqk2.b());
            }
        } else if (!bl2 && ((Boolean)dbk2.b(a)).booleanValue()) {
            iu2.c(cmz2, this, 1, bqk2.b());
        }
    }

    private boolean b(iu iu2, cmz cmz2, bqk bqk2) {
        for (bqk bqk3 : bqk.values()) {
            if (bqk3 == bqk2 || !iu2.b(cmz2.c(bqk3), bqk3)) continue;
            return true;
        }
        if (iu2.b(cmz2, bqk.a)) {
            return true;
        }
        cmz cmz3 = cmz2.g();
        for (bqk bqk4 : bqk.values()) {
            if (bqk4 == bqk.a || !iu2.b(cmz3.c(bqk4), bqk4)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(dbk dbk2, iu iu2, cmz cmz2, int n2, int n3) {
        bqk bqk2 = (bqk)((Object)dbk2.b(o));
        if (!iu2.C) {
            boolean bl2 = this.b(iu2, cmz2, bqk2);
            if (bl2 && n2 == 1) {
                iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)), 2);
                return false;
            }
            if (!bl2 && n2 == 0) {
                return false;
            }
        }
        if (n2 == 0) {
            if (!this.a(iu2, cmz2, bqk2, true)) return false;
            iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)), 2);
            iu2.a(null, cmz2, dah.eb, csg.e, 0.5f, iu2.p.nextFloat() * 0.25f + 0.6f);
            return true;
        } else {
            if (n2 != 1) return true;
            bql bql2 = iu2.q(cmz2.c(bqk2));
            if (bql2 instanceof csv) {
                ((csv)bql2).n();
            }
            iu2.a(cmz2, blg.M.s().a(pk.a, (Comparable)((Object)bqk2)).a(pk.b, (Comparable)((Object)(this.h ? cu.b : cu.a))), 3);
            iu2.a(cmz2, pk.a(this.a(n3), bqk2, false, true));
            if (this.h) {
                csv csv2;
                bql bql3;
                cmz cmz3 = cmz2.e(bqk2.h() * 2, bqk2.i() * 2, bqk2.j() * 2);
                dbk dbk3 = iu2.n(cmz3);
                bfa bfa2 = dbk3.t();
                boolean bl3 = false;
                if (bfa2 == blg.M && (bql3 = iu2.q(cmz3)) instanceof csv && (csv2 = (csv)bql3).h() == bqk2 && csv2.g()) {
                    csv2.n();
                    bl3 = true;
                }
                if (!bl3 && dbk3.a() != ahk.a && ath.a(dbk3, iu2, cmz3, bqk2.e(), false) && (dbk3.o() == bez.a || bfa2 == blg.J || bfa2 == blg.F)) {
                    this.a(iu2, cmz2, bqk2, false);
                }
            } else {
                iu2.f(cmz2.c(bqk2));
            }
            iu2.a(null, cmz2, dah.ea, csg.e, 0.5f, iu2.p.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    public static bqk b(int n2) {
        int n3 = n2 & 7;
        if (n3 > 5) {
            return null;
        }
        return bqk.a(n3);
    }

    public static bqk a(cmz cmz2, bga bga2) {
        if (cmk.e((float)bga2.aU - (float)cmz2.a()) < 2.0f && cmk.e((float)bga2.aW - (float)cmz2.c()) < 2.0f) {
            double d2 = bga2.aV + (double)bga2.A();
            if (d2 - (double)cmz2.b() > 2.0) {
                return bqk.b;
            }
            if ((double)cmz2.b() - d2 > 0.0) {
                return bqk.a;
            }
        }
        return bga2.B_().e();
    }

    public static boolean a(dbk dbk2, iu iu2, cmz cmz2, bqk bqk2, boolean bl2) {
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.Z) {
            return false;
        }
        if (!iu2.U().a(cmz2)) {
            return false;
        }
        if (cmz2.b() < 0 || bqk2 == bqk.a && cmz2.b() == 0) {
            return false;
        }
        if (cmz2.b() > iu2.K() - 1 || bqk2 == bqk.b && cmz2.b() == iu2.K() - 1) {
            return false;
        }
        if (bfa2 == blg.J || bfa2 == blg.F) {
            if (((Boolean)dbk2.b(a)).booleanValue()) {
                return false;
            }
        } else {
            if (dbk2.b(iu2, cmz2) == -1.0f) {
                return false;
            }
            if (dbk2.o() == bez.c) {
                return false;
            }
            if (dbk2.o() == bez.b) {
                return bl2;
            }
        }
        return !bfa2.l();
    }

    private boolean a(iu iu2, cmz cmz2, bqk bqk2, boolean bl2) {
        int n2;
        dbk dbk2;
        Object object;
        int n3;
        act act2;
        if (!bl2) {
            iu2.f(cmz2.c(bqk2));
        }
        if (!(act2 = new act(iu2, cmz2, bqk2, bl2)).a()) {
            return false;
        }
        List list = act2.b();
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cmz cmz3 = (cmz)list.get(i2);
            arrayList.add(iu2.n(cmz3).b((bnj)iu2, cmz3));
        }
        List list2 = act2.c();
        int n4 = list.size() + list2.size();
        dbk[] arrdbk = new dbk[n4];
        bqk bqk3 = bl2 ? bqk2 : bqk2.e();
        for (n3 = list2.size() - 1; n3 >= 0; --n3) {
            object = (cmz)list2.get(n3);
            dbk2 = iu2.n((cmz)object);
            dbk2.t().b(iu2, (cmz)object, dbk2, 0);
            iu2.f((cmz)object);
            arrdbk[--n4] = dbk2;
        }
        for (n3 = list.size() - 1; n3 >= 0; --n3) {
            object = (cmz)list.get(n3);
            dbk2 = iu2.n((cmz)object);
            iu2.a((cmz)object, blg.a.s(), 2);
            object = ((cmz)object).c(bqk3);
            iu2.a((cmz)object, blg.M.s().a(o, (Comparable)((Object)bqk2)), 4);
            iu2.a((cmz)object, pk.a((dbk)arrayList.get(n3), bqk2, bl2, false));
            arrdbk[--n4] = dbk2;
        }
        cmz cmz4 = cmz2.c(bqk2);
        if (bl2) {
            object = this.h ? cu.b : cu.a;
            dbk2 = blg.K.s().a(ln.o, (Comparable)((Object)bqk2)).a(ln.a, (Comparable)object);
            dbk dbk3 = blg.M.s().a(pk.a, (Comparable)((Object)bqk2)).a(pk.b, (Comparable)((Object)(this.h ? cu.b : cu.a)));
            iu2.a(cmz4, dbk3, 4);
            iu2.a(cmz4, pk.a(dbk2, bqk2, true, false));
        }
        for (n2 = list2.size() - 1; n2 >= 0; --n2) {
            iu2.b((cmz)list2.get(n2), arrdbk[n4++].t());
        }
        for (n2 = list.size() - 1; n2 >= 0; --n2) {
            iu2.b((cmz)list.get(n2), arrdbk[n4++].t());
        }
        if (bl2) {
            iu2.b(cmz4, blg.K);
            iu2.b(cmz2, this);
        }
        return true;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(o, (Comparable)((Object)ath.b(n2))).a(a, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(o))).b();
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(o, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(o)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(o))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, o, a);
    }
}

