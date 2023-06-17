/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class qi
extends bfa {
    public static final yc a = cli.j;
    public static final byc b = byc.a("half", bp.class);
    public static final byc c = byc.a("shape", me.class);
    protected static final cxt d = new cxt(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt e = new cxt(0.0, 0.5, 0.0, 0.5, 1.0, 1.0);
    protected static final cxt f = new cxt(0.5, 0.5, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt g = new cxt(0.0, 0.5, 0.0, 1.0, 1.0, 0.5);
    protected static final cxt h = new cxt(0.0, 0.5, 0.5, 1.0, 1.0, 1.0);
    protected static final cxt i = new cxt(0.0, 0.5, 0.0, 0.5, 1.0, 0.5);
    protected static final cxt j = new cxt(0.5, 0.5, 0.0, 1.0, 1.0, 0.5);
    protected static final cxt k = new cxt(0.0, 0.5, 0.5, 0.5, 1.0, 1.0);
    protected static final cxt l = new cxt(0.5, 0.5, 0.5, 1.0, 1.0, 1.0);
    protected static final cxt m = new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
    protected static final cxt n = new cxt(0.0, 0.0, 0.0, 0.5, 0.5, 1.0);
    protected static final cxt o = new cxt(0.5, 0.0, 0.0, 1.0, 0.5, 1.0);
    protected static final cxt p = new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 0.5);
    protected static final cxt q = new cxt(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
    protected static final cxt r = new cxt(0.0, 0.0, 0.0, 0.5, 0.5, 0.5);
    protected static final cxt s = new cxt(0.5, 0.0, 0.0, 1.0, 0.5, 0.5);
    protected static final cxt t = new cxt(0.0, 0.0, 0.5, 0.5, 0.5, 1.0);
    protected static final cxt u = new cxt(0.5, 0.0, 0.5, 1.0, 0.5, 1.0);
    private final bfa P;
    private final dbk Q;

    protected qi(dbk dbk2) {
        super(dbk2.t().L);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, (Comparable)((Object)bp.b)).a(c, (Comparable)((Object)me.a)));
        this.P = dbk2.t();
        this.Q = dbk2;
        this.c(this.P.E);
        this.b(this.P.F / 3.0f);
        this.a(this.P.J);
        this.h(255);
        this.a(zm.b);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        dbk2 = this.b(dbk2, (bnj)iu2, cmz2);
        for (cxt cxt3 : qi.n(dbk2)) {
            qi.a(cmz2, cxt2, list, cxt3);
        }
    }

    private static List n(dbk dbk2) {
        ArrayList arrayList = ov.a();
        boolean bl2 = dbk2.b(b) == bp.a;
        arrayList.add(bl2 ? d : m);
        me me2 = (me)((Object)dbk2.b(c));
        if (me2 == me.a || me2 == me.b || me2 == me.c) {
            arrayList.add(qi.o(dbk2));
        }
        if (me2 != me.a) {
            arrayList.add(qi.p(dbk2));
        }
        return arrayList;
    }

    private static cxt o(dbk dbk2) {
        boolean bl2 = dbk2.b(b) == bp.a;
        switch ((bqk)((Object)dbk2.b(a))) {
            default: {
                return bl2 ? p : g;
            }
            case d: {
                return bl2 ? q : h;
            }
            case e: {
                return bl2 ? n : e;
            }
            case f: 
        }
        return bl2 ? o : f;
    }

    private static cxt p(dbk dbk2) {
        bqk bqk2;
        bqk bqk3 = (bqk)((Object)dbk2.b(a));
        switch ((me)((Object)dbk2.b(c))) {
            default: {
                bqk2 = bqk3;
                break;
            }
            case e: {
                bqk2 = bqk3.f();
                break;
            }
            case c: {
                bqk2 = bqk3.e();
                break;
            }
            case b: {
                bqk2 = bqk3.g();
            }
        }
        boolean bl2 = dbk2.b(b) == bp.a;
        switch (bqk2) {
            default: {
                return bl2 ? r : i;
            }
            case f: {
                return bl2 ? s : j;
            }
            case d: {
                return bl2 ? u : l;
            }
            case e: 
        }
        return bl2 ? t : k;
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
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        this.P.a(dbk2, iu2, cmz2, random);
    }

    @Override
    public void a(iu iu2, cmz cmz2, bdl bdl2) {
        this.P.a(iu2, cmz2, bdl2);
    }

    @Override
    public void a_(iu iu2, cmz cmz2, dbk dbk2) {
        this.P.a_(iu2, cmz2, dbk2);
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2) {
        return this.Q.a(bnj2, cmz2);
    }

    @Override
    public float a(cpk cpk2) {
        return this.P.a(cpk2);
    }

    @Override
    public kj b() {
        return this.P.b();
    }

    @Override
    public int a(iu iu2) {
        return this.P.a(iu2);
    }

    @Override
    public cxt c(dbk dbk2, iu iu2, cmz cmz2) {
        return this.Q.c(iu2, cmz2);
    }

    @Override
    public amj a(iu iu2, cmz cmz2, cpk cpk2, amj amj2) {
        return this.P.a(iu2, cmz2, cpk2, amj2);
    }

    @Override
    public boolean Y_() {
        return this.P.Y_();
    }

    @Override
    public boolean a(dbk dbk2, boolean bl2) {
        return this.P.a(dbk2, bl2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return this.P.a(iu2, cmz2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.Q.a(iu2, cmz2, blg.a);
        this.P.a(iu2, cmz2, this.Q);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        this.P.b(iu2, cmz2, this.Q);
    }

    @Override
    public void a(iu iu2, cmz cmz2, cpk cpk2) {
        this.P.a(iu2, cmz2, cpk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        this.P.a(iu2, cmz2, dbk2, random);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        return this.P.a(iu2, cmz2, this.Q, bdl2, bqp2, bhl2, bqk.a, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(iu iu2, cmz cmz2, yk yk2) {
        this.P.a(iu2, cmz2, yk2);
    }

    @Override
    public boolean f(dbk dbk2) {
        return dbk2.b(b) == bp.a;
    }

    @Override
    public bif a(dbk dbk2) {
        return this.P.a(this.Q);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        dbk dbk2 = super.a(iu2, cmz2, bqk2, f2, f3, f4, n2, bga2);
        dbk2 = dbk2.a(a, (Comparable)((Object)bga2.B_())).a(c, (Comparable)((Object)me.a));
        if (bqk2 == bqk.a || bqk2 != bqk.b && (double)f3 > 0.5) {
            return dbk2.a(b, (Comparable)((Object)bp.a));
        }
        return dbk2.a(b, (Comparable)((Object)bp.b));
    }

    @Override
    public auu a(dbk dbk2, iu iu2, cmz cmz2, amj amj2, amj amj3) {
        ArrayList arrayList = ov.a();
        for (cxt cxt2 : qi.n(this.b(dbk2, (bnj)iu2, cmz2))) {
            arrayList.add(this.a(cmz2, amj2, amj3, cxt2));
        }
        Object object = null;
        double d2 = 0.0;
        for (auu auu2 : arrayList) {
            double d3;
            if (auu2 == null || !((d3 = auu2.c.g(amj3)) > d2)) continue;
            object = auu2;
            d2 = d3;
        }
        return object;
    }

    @Override
    public dbk a(int n2) {
        dbk dbk2 = this.s().a(b, (Comparable)((Object)((n2 & 4) > 0 ? bp.a : bp.b)));
        dbk2 = dbk2.a(a, (Comparable)((Object)bqk.a(5 - (n2 & 3))));
        return dbk2;
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        if (dbk2.b(b) == bp.a) {
            n2 |= 4;
        }
        return n2 |= 5 - ((bqk)((Object)dbk2.b(a))).b();
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2.a(c, (Comparable)((Object)qi.d(dbk2, bnj2, cmz2)));
    }

    private static me d(dbk dbk2, bnj bnj2, cmz cmz2) {
        bqk bqk2;
        Object object;
        bqk bqk3 = (bqk)((Object)dbk2.b(a));
        dbk dbk3 = bnj2.n(cmz2.c(bqk3));
        if (qi.m(dbk3) && dbk2.b(b) == dbk3.b(b) && ((bqk)(object = (bqk)((Object)dbk3.b(a)))).l() != ((bqk)((Object)dbk2.b(a))).l() && qi.d(dbk2, bnj2, cmz2, ((bqk)object).e())) {
            if (object == bqk3.g()) {
                return me.d;
            }
            return me.e;
        }
        object = bnj2.n(cmz2.c(bqk3.e()));
        if (qi.m((dbk)object) && dbk2.b(b) == object.b(b) && (bqk2 = (bqk)((Object)object.b(a))).l() != ((bqk)((Object)dbk2.b(a))).l() && qi.d(dbk2, bnj2, cmz2, bqk2)) {
            if (bqk2 == bqk3.g()) {
                return me.b;
            }
            return me.c;
        }
        return me.a;
    }

    private static boolean d(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        dbk dbk3 = bnj2.n(cmz2.c(bqk2));
        return !qi.m(dbk3) || dbk3.b(a) != dbk2.b(a) || dbk3.b(b) != dbk2.b(b);
    }

    public static boolean m(dbk dbk2) {
        return dbk2.t() instanceof qi;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        me me2 = (me)((Object)dbk2.b(c));
        switch (cdk2) {
            case b: {
                if (bqk2.l() != ctv.c) break;
                switch (me2) {
                    case b: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.c));
                    }
                    case c: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.b));
                    }
                    case d: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.e));
                    }
                    case e: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.d));
                    }
                }
                return dbk2.a(ih.c);
            }
            case c: {
                if (bqk2.l() != ctv.a) break;
                switch (me2) {
                    case b: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.b));
                    }
                    case c: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.c));
                    }
                    case d: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.e));
                    }
                    case e: {
                        return dbk2.a(ih.c).a(c, (Comparable)((Object)me.d));
                    }
                    case a: {
                        return dbk2.a(ih.c);
                    }
                }
                break;
            }
        }
        return super.a(dbk2, cdk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c);
    }
}

