/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class gd
extends bfa {
    public static final ddi a = ddi.b("north");
    public static final ddi b = ddi.b("east");
    public static final ddi c = ddi.b("south");
    public static final ddi d = ddi.b("west");
    protected static final cxt[] e = new cxt[]{new cxt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 1.0, 1.0), new cxt(0.0, 0.0, 0.375, 0.625, 1.0, 0.625), new cxt(0.0, 0.0, 0.375, 0.625, 1.0, 1.0), new cxt(0.375, 0.0, 0.0, 0.625, 1.0, 0.625), new cxt(0.375, 0.0, 0.0, 0.625, 1.0, 1.0), new cxt(0.0, 0.0, 0.0, 0.625, 1.0, 0.625), new cxt(0.0, 0.0, 0.0, 0.625, 1.0, 1.0), new cxt(0.375, 0.0, 0.375, 1.0, 1.0, 0.625), new cxt(0.375, 0.0, 0.375, 1.0, 1.0, 1.0), new cxt(0.0, 0.0, 0.375, 1.0, 1.0, 0.625), new cxt(0.0, 0.0, 0.375, 1.0, 1.0, 1.0), new cxt(0.375, 0.0, 0.0, 1.0, 1.0, 0.625), new cxt(0.375, 0.0, 0.0, 1.0, 1.0, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.625), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    public static final cxt f = new cxt(0.375, 0.0, 0.375, 0.625, 1.5, 0.625);
    public static final cxt g = new cxt(0.375, 0.0, 0.625, 0.625, 1.5, 1.0);
    public static final cxt h = new cxt(0.0, 0.0, 0.375, 0.375, 1.5, 0.625);
    public static final cxt i = new cxt(0.375, 0.0, 0.0, 0.625, 1.5, 0.375);
    public static final cxt j = new cxt(0.625, 0.0, 0.375, 1.0, 1.5, 0.625);

    public gd(ahk ahk2, bif bif2) {
        super(ahk2, bif2);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
        this.a(zm.c);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        dbk2 = dbk2.b((bnj)iu2, cmz2);
        gd.a(cmz2, cxt2, list, f);
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            gd.a(cmz2, cxt2, list, i);
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            gd.a(cmz2, cxt2, list, j);
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            gd.a(cmz2, cxt2, list, g);
        }
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            gd.a(cmz2, cxt2, list, h);
        }
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = this.b(dbk2, bnj2, cmz2);
        return e[gd.m(dbk2)];
    }

    private static int m(dbk dbk2) {
        int n2 = 0;
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            n2 |= 1 << bqk.c.c();
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 1 << bqk.f.c();
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= 1 << bqk.d.c();
        }
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            n2 |= 1 << bqk.e.c();
        }
        return n2;
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
    public boolean a(bnj bnj2, cmz cmz2) {
        return false;
    }

    public boolean b(bnj bnj2, cmz cmz2) {
        dbk dbk2 = bnj2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.cv) {
            return false;
        }
        if (bfa2 instanceof gd && bfa2.L == this.L || bfa2 instanceof bty) {
            return true;
        }
        if (bfa2.L.j() && dbk2.h()) {
            return bfa2.L != ahk.C;
        }
        return false;
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return true;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        return mx.a(bdl2, iu2, cmz2);
    }

    @Override
    public int e(dbk dbk2) {
        return 0;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2.a(a, Boolean.valueOf(this.b(bnj2, cmz2.i()))).a(b, Boolean.valueOf(this.b(bnj2, cmz2.l()))).a(c, Boolean.valueOf(this.b(bnj2, cmz2.j()))).a(d, Boolean.valueOf(this.b(bnj2, cmz2.k())));
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

