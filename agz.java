/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class agz
extends bfa {
    public static final ddi a = ddi.b("north");
    public static final ddi b = ddi.b("east");
    public static final ddi c = ddi.b("south");
    public static final ddi d = ddi.b("west");
    protected static final cxt[] e = new cxt[]{new cxt(0.4375, 0.0, 0.4375, 0.5625, 1.0, 0.5625), new cxt(0.4375, 0.0, 0.4375, 0.5625, 1.0, 1.0), new cxt(0.0, 0.0, 0.4375, 0.5625, 1.0, 0.5625), new cxt(0.0, 0.0, 0.4375, 0.5625, 1.0, 1.0), new cxt(0.4375, 0.0, 0.0, 0.5625, 1.0, 0.5625), new cxt(0.4375, 0.0, 0.0, 0.5625, 1.0, 1.0), new cxt(0.0, 0.0, 0.0, 0.5625, 1.0, 0.5625), new cxt(0.0, 0.0, 0.0, 0.5625, 1.0, 1.0), new cxt(0.4375, 0.0, 0.4375, 1.0, 1.0, 0.5625), new cxt(0.4375, 0.0, 0.4375, 1.0, 1.0, 1.0), new cxt(0.0, 0.0, 0.4375, 1.0, 1.0, 0.5625), new cxt(0.0, 0.0, 0.4375, 1.0, 1.0, 1.0), new cxt(0.4375, 0.0, 0.0, 1.0, 1.0, 0.5625), new cxt(0.4375, 0.0, 0.0, 1.0, 1.0, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.5625), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    private final boolean f;

    protected agz(ahk ahk2, boolean bl2) {
        super(ahk2);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
        this.f = bl2;
        this.a(zm.c);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        dbk2 = this.b(dbk2, (bnj)iu2, cmz2);
        agz.a(cmz2, cxt2, list, e[0]);
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            agz.a(cmz2, cxt2, list, e[agz.a(bqk.c)]);
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            agz.a(cmz2, cxt2, list, e[agz.a(bqk.d)]);
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            agz.a(cmz2, cxt2, list, e[agz.a(bqk.f)]);
        }
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            agz.a(cmz2, cxt2, list, e[agz.a(bqk.e)]);
        }
    }

    private static int a(bqk bqk2) {
        return 1 << bqk2.c();
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = this.b(dbk2, bnj2, cmz2);
        return e[agz.m(dbk2)];
    }

    private static int m(dbk dbk2) {
        int n2 = 0;
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            n2 |= agz.a(bqk.c);
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= agz.a(bqk.f);
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= agz.a(bqk.d);
        }
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            n2 |= agz.a(bqk.e);
        }
        return n2;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2.a(a, Boolean.valueOf(this.b(bnj2.n(cmz2.i()).t()))).a(c, Boolean.valueOf(this.b(bnj2.n(cmz2.j()).t()))).a(d, Boolean.valueOf(this.b(bnj2.n(cmz2.k()).t()))).a(b, Boolean.valueOf(this.b(bnj2.n(cmz2.l()).t())));
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (!this.f) {
            return null;
        }
        return super.a(dbk2, random, n2);
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
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bnj2.n(cmz2.c(bqk2)).t() == this) {
            return false;
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }

    public final boolean b(bfa bfa2) {
        return bfa2.s().h() || bfa2 == this || bfa2 == blg.w || bfa2 == blg.cG || bfa2 == blg.cH || bfa2 instanceof agz;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public kj b() {
        return kj.b;
    }

    @Override
    public int e(dbk dbk2) {
        return 0;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                return dbk2.a(a, dbk2.b(c)).a(b, dbk2.b(d)).a(c, dbk2.b(a)).a(d, dbk2.b(b));
            }
            case d: {
                return dbk2.a(a, dbk2.b(b)).a(b, dbk2.b(c)).a(c, dbk2.b(d)).a(d, dbk2.b(a));
            }
            case b: {
                return dbk2.a(a, dbk2.b(d)).a(b, dbk2.b(a)).a(c, dbk2.b(b)).a(d, dbk2.b(c));
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        switch (cdk2) {
            case b: {
                return dbk2.a(a, dbk2.b(c)).a(c, dbk2.b(a));
            }
            case c: {
                return dbk2.a(b, dbk2.b(d)).a(d, dbk2.b(b));
            }
        }
        return super.a(dbk2, cdk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, d, c);
    }
}

