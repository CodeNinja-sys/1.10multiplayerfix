/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ao
extends ar {
    public static final yc a = yc.a("facing", new kc());
    public static final ddi b = ddi.b("enabled");
    protected static final cxt c = new cxt(0.0, 0.0, 0.0, 1.0, 0.625, 1.0);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
    protected static final cxt e = new cxt(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
    protected static final cxt f = new cxt(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt g = new cxt(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);

    public ao() {
        super(ahk.f, bif.m);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.a)).a(b, Boolean.valueOf(true)));
        this.a(zm.d);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return x;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        ao.a(cmz2, cxt2, list, c);
        ao.a(cmz2, cxt2, list, g);
        ao.a(cmz2, cxt2, list, f);
        ao.a(cmz2, cxt2, list, d);
        ao.a(cmz2, cxt2, list, e);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        bqk bqk3 = bqk2.e();
        if (bqk3 == bqk.b) {
            bqk3 = bqk.a;
        }
        return this.s().a(a, (Comparable)((Object)bqk3)).a(b, Boolean.valueOf(true));
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new cls();
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        super.a(iu2, cmz2, dbk2, bga2, bhl2);
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof cls) {
            ((cls)bql2).a(bhl2.q());
        }
    }

    @Override
    public boolean f(dbk dbk2) {
        return true;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.e(iu2, cmz2, dbk2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof cls) {
            bdl2.a((cls)bql2);
            bdl2.a(bpv.R);
        }
        return true;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.e(iu2, cmz2, dbk2);
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        boolean bl2;
        boolean bl3 = bl2 = !iu2.x(cmz2);
        if (bl2 != (Boolean)dbk2.b(b)) {
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(bl2)), 4);
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof cls) {
            ckw.a(iu2, cmz2, (tb)((cls)bql2));
            iu2.f(cmz2, this);
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return true;
    }

    public static bqk b(int n2) {
        return bqk.a(n2 & 7);
    }

    public static boolean c(int n2) {
        return (n2 & 8) != 8;
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return apq.a(iu2.q(cmz2));
    }

    @Override
    public kj b() {
        return kj.b;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)ao.b(n2))).a(b, Boolean.valueOf(ao.c(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).b();
        if (!((Boolean)dbk2.b(b)).booleanValue()) {
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
}

