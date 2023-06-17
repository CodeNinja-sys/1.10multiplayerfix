/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class zd
extends bfa {
    public static final ddi a = ddi.b("up");
    public static final ddi b = ddi.b("north");
    public static final ddi c = ddi.b("east");
    public static final ddi d = ddi.b("south");
    public static final ddi e = ddi.b("west");
    public static final byc f = byc.a("variant", wv.class);
    protected static final cxt[] g = new cxt[]{new cxt(0.25, 0.0, 0.25, 0.75, 1.0, 0.75), new cxt(0.25, 0.0, 0.25, 0.75, 1.0, 1.0), new cxt(0.0, 0.0, 0.25, 0.75, 1.0, 0.75), new cxt(0.0, 0.0, 0.25, 0.75, 1.0, 1.0), new cxt(0.25, 0.0, 0.0, 0.75, 1.0, 0.75), new cxt(0.3125, 0.0, 0.0, 0.6875, 0.875, 1.0), new cxt(0.0, 0.0, 0.0, 0.75, 1.0, 0.75), new cxt(0.0, 0.0, 0.0, 0.75, 1.0, 1.0), new cxt(0.25, 0.0, 0.25, 1.0, 1.0, 0.75), new cxt(0.25, 0.0, 0.25, 1.0, 1.0, 1.0), new cxt(0.0, 0.0, 0.3125, 1.0, 0.875, 0.6875), new cxt(0.0, 0.0, 0.25, 1.0, 1.0, 1.0), new cxt(0.25, 0.0, 0.0, 1.0, 1.0, 0.75), new cxt(0.25, 0.0, 0.0, 1.0, 1.0, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.75), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    protected static final cxt[] h = new cxt[]{g[0].a(1.5), g[1].a(1.5), g[2].a(1.5), g[3].a(1.5), g[4].a(1.5), g[5].a(1.5), g[6].a(1.5), g[7].a(1.5), g[8].a(1.5), g[9].a(1.5), g[10].a(1.5), g[11].a(1.5), g[12].a(1.5), g[13].a(1.5), g[14].a(1.5), g[15].a(1.5)};

    public zd(bfa bfa2) {
        super(bfa2.L);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, (Comparable)((Object)wv.a)));
        this.c(bfa2.E);
        this.b(bfa2.F / 3.0f);
        this.a(bfa2.J);
        this.a(zm.b);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = this.b(dbk2, bnj2, cmz2);
        return g[zd.m(dbk2)];
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        dbk2 = this.b(dbk2, (bnj)iu2, cmz2);
        return h[zd.m(dbk2)];
    }

    private static int m(dbk dbk2) {
        int n2 = 0;
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 1 << bqk.c.c();
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= 1 << bqk.f.c();
        }
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            n2 |= 1 << bqk.d.c();
        }
        if (((Boolean)dbk2.b(e)).booleanValue()) {
            n2 |= 1 << bqk.e.c();
        }
        return n2;
    }

    @Override
    public String az_() {
        return caf.a(this.n() + "." + wv.a.c() + ".name");
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    private boolean c(bnj bnj2, cmz cmz2) {
        dbk dbk2 = bnj2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.cv) {
            return false;
        }
        if (bfa2 == this || bfa2 instanceof bty) {
            return true;
        }
        if (bfa2.L.j() && dbk2.h()) {
            return bfa2.L != ahk.C;
        }
        return false;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (wv wv2 : wv.values()) {
            list.add(new bhl(azg2, 1, wv2.b()));
        }
    }

    @Override
    public int d(dbk dbk2) {
        return ((wv)((Object)dbk2.b(f))).b();
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.a) {
            return super.a(dbk2, bnj2, cmz2, bqk2);
        }
        return true;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(f, (Comparable)((Object)wv.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((wv)((Object)dbk2.b(f))).b();
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        boolean bl2 = this.c(bnj2, cmz2.i());
        boolean bl3 = this.c(bnj2, cmz2.l());
        boolean bl4 = this.c(bnj2, cmz2.j());
        boolean bl5 = this.c(bnj2, cmz2.k());
        boolean bl6 = bl2 && !bl3 && bl4 && !bl5 || !bl2 && bl3 && !bl4 && bl5;
        return dbk2.a(a, Boolean.valueOf(!bl6 || !bnj2.c(cmz2.g()))).a(b, Boolean.valueOf(bl2)).a(c, Boolean.valueOf(bl3)).a(d, Boolean.valueOf(bl4)).a(e, Boolean.valueOf(bl5));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c, e, d, f);
    }
}

