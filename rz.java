/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public abstract class rz
extends ajj {
    public static final ddi a = ddi.b("powered");
    protected static final cxt b = new cxt(0.3125, 0.875, 0.375, 0.6875, 1.0, 0.625);
    protected static final cxt c = new cxt(0.3125, 0.0, 0.375, 0.6875, 0.125, 0.625);
    protected static final cxt d = new cxt(0.3125, 0.375, 0.875, 0.6875, 0.625, 1.0);
    protected static final cxt e = new cxt(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.125);
    protected static final cxt f = new cxt(0.875, 0.375, 0.3125, 1.0, 0.625, 0.6875);
    protected static final cxt g = new cxt(0.0, 0.375, 0.3125, 0.125, 0.625, 0.6875);
    protected static final cxt h = new cxt(0.3125, 0.9375, 0.375, 0.6875, 1.0, 0.625);
    protected static final cxt i = new cxt(0.3125, 0.0, 0.375, 0.6875, 0.0625, 0.625);
    protected static final cxt j = new cxt(0.3125, 0.375, 0.9375, 0.6875, 0.625, 1.0);
    protected static final cxt k = new cxt(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.0625);
    protected static final cxt l = new cxt(0.9375, 0.375, 0.3125, 1.0, 0.625, 0.6875);
    protected static final cxt m = new cxt(0.0, 0.375, 0.3125, 0.0625, 0.625, 0.6875);
    private final boolean n;

    protected rz(boolean bl2) {
        super(ahk.q);
        this.D(this.O.b().a(o, (Comparable)((Object)bqk.c)).a(a, Boolean.valueOf(false)));
        this.b(true);
        this.a(zm.d);
        this.n = bl2;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public int a(iu iu2) {
        return this.n ? 30 : 20;
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
    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        return rz.b(iu2, cmz2, bqk2.e());
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        for (bqk bqk2 : bqk.values()) {
            if (!rz.b(iu2, cmz2, bqk2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean b(iu iu2, cmz cmz2, bqk bqk2) {
        cmz cmz3 = cmz2.c(bqk2);
        if (bqk2 == bqk.a) {
            return iu2.n(cmz3).q();
        }
        return iu2.n(cmz3).l();
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        if (rz.b(iu2, cmz2, bqk2.e())) {
            return this.s().a(o, (Comparable)((Object)bqk2)).a(a, Boolean.valueOf(false));
        }
        return this.s().a(o, (Comparable)((Object)bqk.a)).a(a, Boolean.valueOf(false));
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (this.e(iu2, cmz2, dbk2) && !rz.b(iu2, cmz2, ((bqk)((Object)dbk2.b(o))).e())) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    private boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.a(iu2, cmz2)) {
            return true;
        }
        this.b(iu2, cmz2, dbk2, 0);
        iu2.f(cmz2);
        return false;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(o));
        boolean bl2 = (Boolean)dbk2.b(a);
        switch (bqk2) {
            case f: {
                return bl2 ? m : g;
            }
            case e: {
                return bl2 ? l : f;
            }
            case d: {
                return bl2 ? k : e;
            }
            default: {
                return bl2 ? j : d;
            }
            case b: {
                return bl2 ? i : c;
            }
            case a: 
        }
        return bl2 ? h : b;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            return true;
        }
        iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)), 3);
        iu2.b(cmz2, cmz2);
        this.a(bdl2, iu2, cmz2);
        this.c(iu2, cmz2, (bqk)((Object)dbk2.b(o)));
        iu2.a(cmz2, (bfa)this, this.a(iu2));
        return true;
    }

    protected abstract void a(bdl var1, iu var2, cmz var3);

    protected abstract void b(iu var1, cmz var2);

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            this.c(iu2, cmz2, (bqk)((Object)dbk2.b(o)));
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return (Boolean)dbk2.b(a) != false ? 15 : 0;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!((Boolean)dbk2.b(a)).booleanValue()) {
            return 0;
        }
        if (dbk2.b(o) == bqk2) {
            return 15;
        }
        return 0;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (!((Boolean)dbk2.b(a)).booleanValue()) {
            return;
        }
        if (this.n) {
            this.e(dbk2, iu2, cmz2);
        } else {
            iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(false)));
            this.c(iu2, cmz2, (bqk)((Object)dbk2.b(o)));
            this.b(iu2, cmz2);
            iu2.b(cmz2, cmz2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        if (iu2.C) {
            return;
        }
        if (!this.n) {
            return;
        }
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            return;
        }
        this.e(dbk2, iu2, cmz2);
    }

    private void e(dbk dbk2, iu iu2, cmz cmz2) {
        List list = iu2.a(cwt.class, dbk2.c((bnj)iu2, cmz2).a(cmz2));
        boolean bl2 = !list.isEmpty();
        boolean bl3 = (Boolean)dbk2.b(a);
        if (bl2 && !bl3) {
            iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)));
            this.c(iu2, cmz2, (bqk)((Object)dbk2.b(o)));
            iu2.b(cmz2, cmz2);
            this.a((bdl)null, iu2, cmz2);
        }
        if (!bl2 && bl3) {
            iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(false)));
            this.c(iu2, cmz2, (bqk)((Object)dbk2.b(o)));
            iu2.b(cmz2, cmz2);
            this.b(iu2, cmz2);
        }
        if (bl2) {
            iu2.a(new cmz(cmz2), (bfa)this, this.a(iu2));
        }
    }

    private void c(iu iu2, cmz cmz2, bqk bqk2) {
        iu2.b(cmz2, this);
        iu2.b(cmz2.c(bqk2.e()), this);
    }

    @Override
    public dbk a(int n2) {
        bqk bqk2;
        switch (n2 & 7) {
            case 0: {
                bqk2 = bqk.a;
                break;
            }
            case 1: {
                bqk2 = bqk.f;
                break;
            }
            case 2: {
                bqk2 = bqk.e;
                break;
            }
            case 3: {
                bqk2 = bqk.d;
                break;
            }
            case 4: {
                bqk2 = bqk.c;
                break;
            }
            default: {
                bqk2 = bqk.b;
            }
        }
        return this.s().a(o, (Comparable)((Object)bqk2)).a(a, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2;
        switch ((bqk)((Object)dbk2.b(o))) {
            case a: {
                n2 = 0;
                break;
            }
            case f: {
                n2 = 1;
                break;
            }
            case e: {
                n2 = 2;
                break;
            }
            case d: {
                n2 = 3;
                break;
            }
            case c: {
                n2 = 4;
                break;
            }
            default: {
                n2 = 5;
            }
        }
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

