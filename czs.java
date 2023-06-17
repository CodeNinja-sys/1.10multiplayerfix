/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class czs
extends bfa {
    public static final byc a = byc.a("north", avp.class);
    public static final byc b = byc.a("east", avp.class);
    public static final byc c = byc.a("south", avp.class);
    public static final byc d = byc.a("west", avp.class);
    public static final qf e = qf.a("power", 0, 15);
    protected static final cxt[] f = new cxt[]{new cxt(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 0.8125), new cxt(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 1.0), new cxt(0.0, 0.0, 0.1875, 0.8125, 0.0625, 0.8125), new cxt(0.0, 0.0, 0.1875, 0.8125, 0.0625, 1.0), new cxt(0.1875, 0.0, 0.0, 0.8125, 0.0625, 0.8125), new cxt(0.1875, 0.0, 0.0, 0.8125, 0.0625, 1.0), new cxt(0.0, 0.0, 0.0, 0.8125, 0.0625, 0.8125), new cxt(0.0, 0.0, 0.0, 0.8125, 0.0625, 1.0), new cxt(0.1875, 0.0, 0.1875, 1.0, 0.0625, 0.8125), new cxt(0.1875, 0.0, 0.1875, 1.0, 0.0625, 1.0), new cxt(0.0, 0.0, 0.1875, 1.0, 0.0625, 0.8125), new cxt(0.0, 0.0, 0.1875, 1.0, 0.0625, 1.0), new cxt(0.1875, 0.0, 0.0, 1.0, 0.0625, 0.8125), new cxt(0.1875, 0.0, 0.0, 1.0, 0.0625, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.0625, 0.8125), new cxt(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0)};
    private boolean g = true;
    private final Set h = aad.a();

    public czs() {
        super(ahk.q);
        this.D(this.O.b().a(a, (Comparable)((Object)avp.c)).a(b, (Comparable)((Object)avp.c)).a(c, (Comparable)((Object)avp.c)).a(d, (Comparable)((Object)avp.c)).a(e, Integer.valueOf(0)));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return f[czs.n(dbk2.b(bnj2, cmz2))];
    }

    private static int n(dbk dbk2) {
        boolean bl2;
        int n2 = 0;
        boolean bl3 = dbk2.b(a) != avp.c;
        boolean bl4 = dbk2.b(b) != avp.c;
        boolean bl5 = dbk2.b(c) != avp.c;
        boolean bl6 = bl2 = dbk2.b(d) != avp.c;
        if (bl3 || bl5 && !bl3 && !bl4 && !bl2) {
            n2 |= 1 << bqk.c.c();
        }
        if (bl4 || bl2 && !bl3 && !bl4 && !bl5) {
            n2 |= 1 << bqk.f.c();
        }
        if (bl5 || bl3 && !bl4 && !bl5 && !bl2) {
            n2 |= 1 << bqk.d.c();
        }
        if (bl2 || bl4 && !bl3 && !bl5 && !bl2) {
            n2 |= 1 << bqk.e.c();
        }
        return n2;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = dbk2.a(d, (Comparable)((Object)this.b(bnj2, cmz2, bqk.e)));
        dbk2 = dbk2.a(b, (Comparable)((Object)this.b(bnj2, cmz2, bqk.f)));
        dbk2 = dbk2.a(a, (Comparable)((Object)this.b(bnj2, cmz2, bqk.c)));
        dbk2 = dbk2.a(c, (Comparable)((Object)this.b(bnj2, cmz2, bqk.d)));
        return dbk2;
    }

    private avp b(bnj bnj2, cmz cmz2, bqk bqk2) {
        cmz cmz3 = cmz2.c(bqk2);
        dbk dbk2 = bnj2.n(cmz2.c(bqk2));
        if (czs.a(bnj2.n(cmz3), bqk2) || !dbk2.l() && czs.m(bnj2.n(cmz3.h()))) {
            return avp.b;
        }
        dbk dbk3 = bnj2.n(cmz2.g());
        if (!dbk3.l()) {
            boolean bl2;
            boolean bl3 = bl2 = bnj2.n(cmz3).q() || bnj2.n(cmz3).t() == blg.aX;
            if (bl2 && czs.m(bnj2.n(cmz3.g()))) {
                if (dbk2.k()) {
                    return avp.a;
                }
                return avp.b;
            }
        }
        return avp.c;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
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
    public boolean a(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.h()).q() || iu2.n(cmz2.h()).t() == blg.aX;
    }

    private dbk e(iu iu2, cmz cmz2, dbk dbk2) {
        dbk2 = this.a(iu2, cmz2, cmz2, dbk2);
        ArrayList arrayList = ov.a(this.h);
        this.h.clear();
        for (cmz cmz3 : arrayList) {
            iu2.b(cmz3, this);
        }
        return dbk2;
    }

    private dbk a(iu iu2, cmz cmz2, cmz cmz3, dbk dbk2) {
        dbk dbk3 = dbk2;
        int n2 = (Integer)dbk3.b(e);
        int n3 = 0;
        n3 = this.a(iu2, cmz3, n3);
        this.g = false;
        int n4 = iu2.y(cmz2);
        this.g = true;
        if (n4 > 0 && n4 > n3 - 1) {
            n3 = n4;
        }
        int n5 = 0;
        for (bqk bqk2 : afj.a) {
            boolean bl2;
            cmz cmz4 = cmz2.c(bqk2);
            boolean bl3 = bl2 = cmz4.a() != cmz3.a() || cmz4.c() != cmz3.c();
            if (bl2) {
                n5 = this.a(iu2, cmz4, n5);
            }
            if (iu2.n(cmz4).l() && !iu2.n(cmz2.g()).l()) {
                if (!bl2 || cmz2.b() < cmz3.b()) continue;
                n5 = this.a(iu2, cmz4.g(), n5);
                continue;
            }
            if (iu2.n(cmz4).l() || !bl2 || cmz2.b() > cmz3.b()) continue;
            n5 = this.a(iu2, cmz4.h(), n5);
        }
        n3 = n5 > n3 ? n5 - 1 : (n3 > 0 ? --n3 : 0);
        if (n4 > n3 - 1) {
            n3 = n4;
        }
        if (n2 != n3) {
            dbk2 = dbk2.a(e, Integer.valueOf(n3));
            if (iu2.n(cmz2) == dbk3) {
                iu2.a(cmz2, dbk2, 2);
            }
            this.h.add(cmz2);
            for (bqk bqk3 : bqk.values()) {
                this.h.add(cmz2.c(bqk3));
            }
        }
        return dbk2;
    }

    private void c(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2).t() != this) {
            return;
        }
        iu2.b(cmz2, this);
        for (bqk bqk2 : bqk.values()) {
            iu2.b(cmz2.c(bqk2), this);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.C) {
            return;
        }
        this.e(iu2, cmz2, dbk2);
        for (bqk bqk2 : afj.b) {
            iu2.b(cmz2.c(bqk2), this);
        }
        for (bqk bqk2 : afj.a) {
            this.c(iu2, cmz2.c(bqk2));
        }
        for (bqk bqk2 : afj.a) {
            cmz cmz3 = cmz2.c(bqk2);
            if (iu2.n(cmz3).l()) {
                this.c(iu2, cmz3.g());
                continue;
            }
            this.c(iu2, cmz3.h());
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        super.b(iu2, cmz2, dbk2);
        if (iu2.C) {
            return;
        }
        for (bqk bqk2 : bqk.values()) {
            iu2.b(cmz2.c(bqk2), this);
        }
        this.e(iu2, cmz2, dbk2);
        for (bqk bqk3 : afj.a) {
            this.c(iu2, cmz2.c(bqk3));
        }
        for (bqk bqk4 : afj.a) {
            cmz cmz3 = cmz2.c(bqk4);
            if (iu2.n(cmz3).l()) {
                this.c(iu2, cmz3.g());
                continue;
            }
            this.c(iu2, cmz3.h());
        }
    }

    private int a(iu iu2, cmz cmz2, int n2) {
        if (iu2.n(cmz2).t() != this) {
            return n2;
        }
        int n3 = (Integer)iu2.n(cmz2).b(e);
        if (n3 > n2) {
            return n3;
        }
        return n2;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.C) {
            return;
        }
        if (this.a(iu2, cmz2)) {
            this.e(iu2, cmz2, dbk2);
        } else {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.aE;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!this.g) {
            return 0;
        }
        return dbk2.a(bnj2, cmz2, bqk2);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!this.g) {
            return 0;
        }
        int n2 = (Integer)dbk2.b(e);
        if (n2 == 0) {
            return 0;
        }
        if (bqk2 == bqk.b) {
            return n2;
        }
        EnumSet<bqk> enumSet = EnumSet.noneOf(bqk.class);
        for (bqk bqk3 : afj.a) {
            if (!this.c(bnj2, cmz2, bqk3)) continue;
            enumSet.add(bqk3);
        }
        if (bqk2.l().d() && enumSet.isEmpty()) {
            return n2;
        }
        if (enumSet.contains(bqk2) && !enumSet.contains(bqk2.g()) && !enumSet.contains(bqk2.f())) {
            return n2;
        }
        return 0;
    }

    private boolean c(bnj bnj2, cmz cmz2, bqk bqk2) {
        cmz cmz3 = cmz2.c(bqk2);
        dbk dbk2 = bnj2.n(cmz3);
        boolean bl2 = dbk2.l();
        boolean bl3 = bnj2.n(cmz2.g()).l();
        if (!bl3 && bl2 && czs.c(bnj2, cmz3.g())) {
            return true;
        }
        if (czs.a(dbk2, bqk2)) {
            return true;
        }
        if (dbk2.t() == blg.bc && dbk2.b(vh.j) == bqk2) {
            return true;
        }
        return !bl2 && czs.c(bnj2, cmz3.h());
    }

    protected static boolean c(bnj bnj2, cmz cmz2) {
        return czs.m(bnj2.n(cmz2));
    }

    protected static boolean m(dbk dbk2) {
        return czs.a(dbk2, null);
    }

    protected static boolean a(dbk dbk2, bqk bqk2) {
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.af) {
            return true;
        }
        if (blg.bb.p(dbk2)) {
            bqk bqk3 = (bqk)((Object)dbk2.b(xc.j));
            return bqk3 == bqk2 || bqk3.e() == bqk2;
        }
        return dbk2.m() && bqk2 != null;
    }

    @Override
    public boolean i(dbk dbk2) {
        return this.g;
    }

    public static int b(int n2) {
        float f2 = (float)n2 / 15.0f;
        float f3 = f2 * 0.6f + 0.4f;
        if (n2 == 0) {
            f3 = 0.3f;
        }
        float f4 = f2 * f2 * 0.7f - 0.5f;
        float f5 = f2 * f2 * 0.6f - 0.7f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        int n3 = cmk.a((int)(f3 * 255.0f), 0, 255);
        int n4 = cmk.a((int)(f4 * 255.0f), 0, 255);
        int n5 = cmk.a((int)(f5 * 255.0f), 0, 255);
        return 0xFF000000 | n3 << 16 | n4 << 8 | n5;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        int n2 = (Integer)dbk2.b(e);
        if (n2 == 0) {
            return;
        }
        double d2 = (double)cmz2.a() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
        double d3 = (float)cmz2.b() + 0.0625f;
        double d4 = (double)cmz2.c() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
        float f2 = (float)n2 / 15.0f;
        float f3 = f2 * 0.6f + 0.4f;
        float f4 = Math.max(0.0f, f2 * f2 * 0.7f - 0.5f);
        float f5 = Math.max(0.0f, f2 * f2 * 0.6f - 0.7f);
        iu2.a(lz.E, d2, d3, d4, (double)f3, (double)f4, (double)f5, new int[0]);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.aE);
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(e, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(e);
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
        return new bkp(this, a, b, c, d, e);
    }
}

