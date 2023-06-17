/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.cm;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.c.a;

public abstract class iu
implements bnj {
    private int a = 63;
    protected boolean b;
    public final List c = ov.a();
    protected final List d = ov.a();
    public final List e = ov.a();
    public final List f = ov.a();
    private final List G = ov.a();
    private final List H = ov.a();
    public final List g = ov.a();
    public final List h = ov.a();
    protected final cyn i = new cyn();
    private final long I = 0xFFFFFFL;
    private int J;
    protected int j = new Random().nextInt();
    protected final int k = 1013904223;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    private int K;
    public final Random p = new Random();
    public final byf q;
    protected bfm r = new bfm();
    protected List s = ov.a(this.r);
    protected apb t;
    protected final ajq u;
    protected cvn v;
    protected boolean w;
    protected bkj x;
    protected go y;
    protected baz z;
    public final cfe A;
    private final Calendar L = Calendar.getInstance();
    protected bzt B = new bzt();
    public final boolean C;
    protected boolean D = true;
    protected boolean E = true;
    private boolean M;
    private final ajw N;
    int[] F = new int[32768];

    protected iu(ajq ajq2, cvn cvn2, byf byf2, cfe cfe2, boolean bl2) {
        this.u = ajq2;
        this.A = cfe2;
        this.v = cvn2;
        this.q = byf2;
        this.C = bl2;
        this.N = byf2.p();
    }

    public iu b() {
        return this;
    }

    @Override
    public anr a(cmz cmz2) {
        if (this.d(cmz2)) {
            bhm bhm2 = this.e(cmz2);
            try {
                return bhm2.a(cmz2, this.q.l());
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Getting biome");
                sx sx2 = cet2.a("Coordinates of biome request");
                sx2.a("Location", new brl(this, cmz2));
                throw new oz(cet2);
            }
        }
        return this.q.l().a(cmz2, cff.c);
    }

    public ey t_() {
        return this.q.l();
    }

    protected abstract apb e();

    public void a(atd atd2) {
        this.v.d(true);
    }

    public a f() {
        return null;
    }

    public void g() {
        this.z(new cmz(8, 64, 8));
    }

    public dbk b(cmz cmz2) {
        cmz cmz3 = new cmz(cmz2.a(), this.u(), cmz2.c());
        while (!this.c(cmz3.g())) {
            cmz3 = cmz3.g();
        }
        return this.n(cmz3);
    }

    private boolean D(cmz cmz2) {
        return !this.E(cmz2) && cmz2.a() >= -30000000 && cmz2.c() >= -30000000 && cmz2.a() < 30000000 && cmz2.c() < 30000000;
    }

    private boolean E(cmz cmz2) {
        return cmz2.b() < 0 || cmz2.b() >= 256;
    }

    @Override
    public boolean c(cmz cmz2) {
        return this.n(cmz2).a() == ahk.a;
    }

    public boolean d(cmz cmz2) {
        return this.a(cmz2, true);
    }

    public boolean a(cmz cmz2, boolean bl2) {
        return this.a(cmz2.a() >> 4, cmz2.c() >> 4, bl2);
    }

    public boolean a(cmz cmz2, int n2) {
        return this.a(cmz2, n2, true);
    }

    public boolean a(cmz cmz2, int n2, boolean bl2) {
        return this.a(cmz2.a() - n2, cmz2.b() - n2, cmz2.c() - n2, cmz2.a() + n2, cmz2.b() + n2, cmz2.c() + n2, bl2);
    }

    public boolean a(cmz cmz2, cmz cmz3) {
        return this.a(cmz2, cmz3, true);
    }

    public boolean a(cmz cmz2, cmz cmz3, boolean bl2) {
        return this.a(cmz2.a(), cmz2.b(), cmz2.c(), cmz3.a(), cmz3.b(), cmz3.c(), bl2);
    }

    public boolean a(awx awx2) {
        return this.a(awx2, true);
    }

    public boolean a(awx awx2, boolean bl2) {
        return this.a(awx2.a, awx2.b, awx2.c, awx2.d, awx2.e, awx2.f, bl2);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        if (n6 < 0 || n3 >= 256) {
            return false;
        }
        n4 >>= 4;
        n7 >>= 4;
        for (int i2 = n2 >>= 4; i2 <= (n5 >>= 4); ++i2) {
            for (int i3 = n4; i3 <= n7; ++i3) {
                if (this.a(i2, i3, bl2)) continue;
                return false;
            }
        }
        return true;
    }

    protected abstract boolean a(int var1, int var2, boolean var3);

    public bhm e(cmz cmz2) {
        return this.a(cmz2.a() >> 4, cmz2.c() >> 4);
    }

    public bhm a(int n2, int n3) {
        return this.t.b(n2, n3);
    }

    public boolean a(cmz cmz2, dbk dbk2, int n2) {
        if (this.E(cmz2)) {
            return false;
        }
        if (!this.C && this.v.s() == aaf.g) {
            return false;
        }
        bhm bhm2 = this.e(cmz2);
        bfa bfa2 = dbk2.t();
        dbk dbk3 = bhm2.a(cmz2, dbk2);
        if (dbk3 != null) {
            if (dbk2.c() != dbk3.c() || dbk2.d() != dbk3.d()) {
                this.A.a("checkLight");
                this.v(cmz2);
                this.A.b();
            }
            if ((n2 & 2) != 0 && (!this.C || (n2 & 4) == 0) && bhm2.i()) {
                this.a(cmz2, dbk3, dbk2, n2);
            }
            if (!this.C && (n2 & 1) != 0) {
                this.a(cmz2, dbk3.t());
                if (dbk2.n()) {
                    this.f(cmz2, bfa2);
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(cmz cmz2) {
        return this.a(cmz2, blg.a.s(), 3);
    }

    public boolean b(cmz cmz2, boolean bl2) {
        dbk dbk2 = this.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (dbk2.a() == ahk.a) {
            return false;
        }
        this.b(2001, cmz2, bfa.u(dbk2));
        if (bl2) {
            bfa2.b(this, cmz2, dbk2, 0);
        }
        return this.a(cmz2, blg.a.s(), 3);
    }

    public boolean a(cmz cmz2, dbk dbk2) {
        return this.a(cmz2, dbk2, 3);
    }

    public void a(cmz cmz2, dbk dbk2, dbk dbk3, int n2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(this, cmz2, dbk2, dbk3, n2);
        }
    }

    public void a(cmz cmz2, bfa bfa2) {
        if (this.v.s() != aaf.g) {
            this.b(cmz2, bfa2);
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        int n6;
        if (n4 > n5) {
            n6 = n5;
            n5 = n4;
            n4 = n6;
        }
        if (!this.q.n()) {
            for (n6 = n4; n6 <= n5; ++n6) {
                this.c(bzq.a, new cmz(n2, n6, n3));
            }
        }
        this.a(n2, n4, n3, n2, n5, n3);
    }

    public void b(cmz cmz2, cmz cmz3) {
        this.a(cmz2.a(), cmz2.b(), cmz2.c(), cmz3.a(), cmz3.b(), cmz3.c());
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(n2, n3, n4, n5, n6, n7);
        }
    }

    public void b(cmz cmz2, bfa bfa2) {
        this.c(cmz2.k(), bfa2);
        this.c(cmz2.l(), bfa2);
        this.c(cmz2.h(), bfa2);
        this.c(cmz2.g(), bfa2);
        this.c(cmz2.i(), bfa2);
        this.c(cmz2.j(), bfa2);
    }

    public void a(cmz cmz2, bfa bfa2, bqk bqk2) {
        if (bqk2 != bqk.e) {
            this.c(cmz2.k(), bfa2);
        }
        if (bqk2 != bqk.f) {
            this.c(cmz2.l(), bfa2);
        }
        if (bqk2 != bqk.a) {
            this.c(cmz2.h(), bfa2);
        }
        if (bqk2 != bqk.b) {
            this.c(cmz2.g(), bfa2);
        }
        if (bqk2 != bqk.c) {
            this.c(cmz2.i(), bfa2);
        }
        if (bqk2 != bqk.d) {
            this.c(cmz2.j(), bfa2);
        }
    }

    public void c(cmz cmz2, bfa bfa2) {
        if (this.C) {
            return;
        }
        dbk dbk2 = this.n(cmz2);
        try {
            dbk2.a(this, cmz2, bfa2);
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Exception while updating neighbours");
            sx sx2 = cet2.a("Block being updated");
            sx2.a("Source block type", new aps(this, bfa2));
            sx.a(sx2, cmz2, dbk2);
            throw new oz(cet2);
        }
    }

    public boolean d(cmz cmz2, bfa bfa2) {
        return false;
    }

    public boolean g(cmz cmz2) {
        return this.e(cmz2).d(cmz2);
    }

    public boolean h(cmz cmz2) {
        if (cmz2.b() >= this.u()) {
            return this.g(cmz2);
        }
        cmz cmz3 = new cmz(cmz2.a(), this.u(), cmz2.c());
        if (!this.g(cmz3)) {
            return false;
        }
        cmz3 = cmz3.h();
        while (cmz3.b() > cmz2.b()) {
            dbk dbk2 = this.n(cmz3);
            if (dbk2.c() > 0 && !dbk2.a().d()) {
                return false;
            }
            cmz3 = cmz3.h();
        }
        return true;
    }

    public int i(cmz cmz2) {
        if (cmz2.b() < 0) {
            return 0;
        }
        if (cmz2.b() >= 256) {
            cmz2 = new cmz(cmz2.a(), 255, cmz2.c());
        }
        return this.e(cmz2).a(cmz2, 0);
    }

    public int j(cmz cmz2) {
        return this.c(cmz2, true);
    }

    public int c(cmz cmz2, boolean bl2) {
        if (cmz2.a() < -30000000 || cmz2.c() < -30000000 || cmz2.a() >= 30000000 || cmz2.c() >= 30000000) {
            return 15;
        }
        if (bl2 && this.n(cmz2).f()) {
            int n2 = this.c(cmz2.g(), false);
            int n3 = this.c(cmz2.l(), false);
            int n4 = this.c(cmz2.k(), false);
            int n5 = this.c(cmz2.j(), false);
            int n6 = this.c(cmz2.i(), false);
            if (n3 > n2) {
                n2 = n3;
            }
            if (n4 > n2) {
                n2 = n4;
            }
            if (n5 > n2) {
                n2 = n5;
            }
            if (n6 > n2) {
                n2 = n6;
            }
            return n2;
        }
        if (cmz2.b() < 0) {
            return 0;
        }
        if (cmz2.b() >= 256) {
            cmz2 = new cmz(cmz2.a(), 255, cmz2.c());
        }
        bhm bhm2 = this.e(cmz2);
        return bhm2.a(cmz2, this.J);
    }

    public cmz k(cmz cmz2) {
        return new cmz(cmz2.a(), this.b(cmz2.a(), cmz2.c()), cmz2.c());
    }

    public int b(int n2, int n3) {
        int n4 = n2 < -30000000 || n3 < -30000000 || n2 >= 30000000 || n3 >= 30000000 ? this.u() + 1 : (this.a(n2 >> 4, n3 >> 4, true) ? this.a(n2 >> 4, n3 >> 4).b(n2 & 0xF, n3 & 0xF) : 0);
        return n4;
    }

    public int c(int n2, int n3) {
        if (n2 < -30000000 || n3 < -30000000 || n2 >= 30000000 || n3 >= 30000000) {
            return this.u() + 1;
        }
        if (!this.a(n2 >> 4, n3 >> 4, true)) {
            return 0;
        }
        bhm bhm2 = this.a(n2 >> 4, n3 >> 4);
        return bhm2.w();
    }

    public int a(bzq bzq2, cmz cmz2) {
        if (this.q.n() && bzq2 == bzq.a) {
            return 0;
        }
        if (cmz2.b() < 0) {
            cmz2 = new cmz(cmz2.a(), 0, cmz2.c());
        }
        if (!this.D(cmz2)) {
            return bzq2.c;
        }
        if (!this.d(cmz2)) {
            return bzq2.c;
        }
        if (this.n(cmz2).f()) {
            int n2 = this.b(bzq2, cmz2.g());
            int n3 = this.b(bzq2, cmz2.l());
            int n4 = this.b(bzq2, cmz2.k());
            int n5 = this.b(bzq2, cmz2.j());
            int n6 = this.b(bzq2, cmz2.i());
            if (n3 > n2) {
                n2 = n3;
            }
            if (n4 > n2) {
                n2 = n4;
            }
            if (n5 > n2) {
                n2 = n5;
            }
            if (n6 > n2) {
                n2 = n6;
            }
            return n2;
        }
        bhm bhm2 = this.e(cmz2);
        return bhm2.a(bzq2, cmz2);
    }

    public int b(bzq bzq2, cmz cmz2) {
        if (cmz2.b() < 0) {
            cmz2 = new cmz(cmz2.a(), 0, cmz2.c());
        }
        if (!this.D(cmz2)) {
            return bzq2.c;
        }
        if (!this.d(cmz2)) {
            return bzq2.c;
        }
        bhm bhm2 = this.e(cmz2);
        return bhm2.a(bzq2, cmz2);
    }

    public void a(bzq bzq2, cmz cmz2, int n2) {
        if (!this.D(cmz2)) {
            return;
        }
        if (!this.d(cmz2)) {
            return;
        }
        bhm bhm2 = this.e(cmz2);
        bhm2.a(bzq2, cmz2, n2);
        this.l(cmz2);
    }

    public void l(cmz cmz2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(cmz2);
        }
    }

    @Override
    public int b(cmz cmz2, int n2) {
        int n3 = this.a(bzq.a, cmz2);
        int n4 = this.a(bzq.b, cmz2);
        if (n4 < n2) {
            n4 = n2;
        }
        return n3 << 20 | n4 << 4;
    }

    public float m(cmz cmz2) {
        return this.q.o()[this.j(cmz2)];
    }

    @Override
    public dbk n(cmz cmz2) {
        if (this.E(cmz2)) {
            return blg.a.s();
        }
        bhm bhm2 = this.e(cmz2);
        return bhm2.c(cmz2);
    }

    public boolean h() {
        return this.J < 4;
    }

    public auu a(amj amj2, amj amj3) {
        return this.a(amj2, amj3, false, false, false);
    }

    public auu a(amj amj2, amj amj3, boolean bl2) {
        return this.a(amj2, amj3, bl2, false, false);
    }

    public auu a(amj amj2, amj amj3, boolean bl2, boolean bl3, boolean bl4) {
        auu auu2;
        if (Double.isNaN(amj2.b) || Double.isNaN(amj2.c) || Double.isNaN(amj2.d)) {
            return null;
        }
        if (Double.isNaN(amj3.b) || Double.isNaN(amj3.c) || Double.isNaN(amj3.d)) {
            return null;
        }
        int n2 = cmk.c(amj3.b);
        int n3 = cmk.c(amj3.c);
        int n4 = cmk.c(amj3.d);
        int n5 = cmk.c(amj2.b);
        int n6 = cmk.c(amj2.c);
        int n7 = cmk.c(amj2.d);
        cmz cmz2 = new cmz(n5, n6, n7);
        Object object = this.n(cmz2);
        bfa bfa2 = object.t();
        if ((!bl3 || object.d(this, cmz2) != bfa.y) && bfa2.a((dbk)object, bl2) && (auu2 = object.a(this, cmz2, amj2, amj3)) != null) {
            return auu2;
        }
        object = null;
        int n8 = 200;
        while (n8-- >= 0) {
            bqk bqk2;
            if (Double.isNaN(amj2.b) || Double.isNaN(amj2.c) || Double.isNaN(amj2.d)) {
                return null;
            }
            if (n5 == n2 && n6 == n3 && n7 == n4) {
                return bl4 ? object : null;
            }
            boolean bl5 = true;
            boolean bl6 = true;
            boolean bl7 = true;
            double d2 = 999.0;
            double d3 = 999.0;
            double d4 = 999.0;
            if (n2 > n5) {
                d2 = (double)n5 + 1.0;
            } else if (n2 < n5) {
                d2 = (double)n5 + 0.0;
            } else {
                bl5 = false;
            }
            if (n3 > n6) {
                d3 = (double)n6 + 1.0;
            } else if (n3 < n6) {
                d3 = (double)n6 + 0.0;
            } else {
                bl6 = false;
            }
            if (n4 > n7) {
                d4 = (double)n7 + 1.0;
            } else if (n4 < n7) {
                d4 = (double)n7 + 0.0;
            } else {
                bl7 = false;
            }
            double d5 = 999.0;
            double d6 = 999.0;
            double d7 = 999.0;
            double d8 = amj3.b - amj2.b;
            double d9 = amj3.c - amj2.c;
            double d10 = amj3.d - amj2.d;
            if (bl5) {
                d5 = (d2 - amj2.b) / d8;
            }
            if (bl6) {
                d6 = (d3 - amj2.c) / d9;
            }
            if (bl7) {
                d7 = (d4 - amj2.d) / d10;
            }
            if (d5 == -0.0) {
                d5 = -1.0E-4;
            }
            if (d6 == -0.0) {
                d6 = -1.0E-4;
            }
            if (d7 == -0.0) {
                d7 = -1.0E-4;
            }
            if (d5 < d6 && d5 < d7) {
                bqk2 = n2 > n5 ? bqk.e : bqk.f;
                amj2 = new amj(d2, amj2.c + d9 * d5, amj2.d + d10 * d5);
            } else if (d6 < d7) {
                bqk2 = n3 > n6 ? bqk.a : bqk.b;
                amj2 = new amj(amj2.b + d8 * d6, d3, amj2.d + d10 * d6);
            } else {
                bqk2 = n4 > n7 ? bqk.c : bqk.d;
                amj2 = new amj(amj2.b + d8 * d7, amj2.c + d9 * d7, d4);
            }
            n5 = cmk.c(amj2.b) - (bqk2 == bqk.f ? 1 : 0);
            n6 = cmk.c(amj2.c) - (bqk2 == bqk.b ? 1 : 0);
            n7 = cmk.c(amj2.d) - (bqk2 == bqk.d ? 1 : 0);
            cmz2 = new cmz(n5, n6, n7);
            dbk dbk2 = this.n(cmz2);
            bfa bfa3 = dbk2.t();
            if (bl3 && dbk2.a() != ahk.E && dbk2.d(this, cmz2) == bfa.y) continue;
            if (bfa3.a(dbk2, bl2)) {
                auu auu3 = dbk2.a(this, cmz2, amj2, amj3);
                if (auu3 == null) continue;
                return auu3;
            }
            object = new auu(bmw.a, amj2, bqk2, cmz2);
        }
        return bl4 ? object : null;
    }

    public void a(bdl bdl2, cmz cmz2, bi bi2, csg csg2, float f2, float f3) {
        this.a(bdl2, (double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, bi2, csg2, f2, f3);
    }

    public void a(bdl bdl2, double d2, double d3, double d4, bi bi2, csg csg2, float f2, float f3) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(bdl2, bi2, csg2, d2, d3, d4, f2, f3);
        }
    }

    public void a(double d2, double d3, double d4, bi bi2, csg csg2, float f2, float f3, boolean bl2) {
    }

    public void a(cmz cmz2, bi bi2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(bi2, cmz2);
        }
    }

    public void a(lz lz2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        this.a(lz2.c(), lz2.e(), d2, d3, d4, d5, d6, d7, arrn);
    }

    public void a(lz lz2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        this.a(lz2.c(), lz2.e() | bl2, d2, d3, d4, d5, d6, d7, arrn);
    }

    private void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(n2, bl2, d2, d3, d4, d5, d6, d7, arrn);
        }
    }

    public boolean a(cpk cpk2) {
        this.h.add(cpk2);
        return true;
    }

    public boolean b(cpk cpk2) {
        int n2 = cmk.c(cpk2.aU / 16.0);
        int n3 = cmk.c(cpk2.aW / 16.0);
        boolean bl2 = cpk2.aP;
        if (cpk2 instanceof bdl) {
            bl2 = true;
        }
        if (bl2 || this.a(n2, n3, false)) {
            if (cpk2 instanceof bdl) {
                bdl bdl2 = (bdl)cpk2;
                this.g.add(bdl2);
                this.G();
            }
            this.a(n2, n3).a(cpk2);
            this.c.add(cpk2);
            this.c(cpk2);
            return true;
        }
        return false;
    }

    protected void c(cpk cpk2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(cpk2);
        }
    }

    protected void d(cpk cpk2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).b(cpk2);
        }
    }

    public void e(cpk cpk2) {
        if (cpk2.cq()) {
            cpk2.cl();
        }
        if (cpk2.cp()) {
            cpk2.s_();
        }
        cpk2.ak_();
        if (cpk2 instanceof bdl) {
            this.g.remove(cpk2);
            this.G();
            this.d(cpk2);
        }
    }

    public void f(cpk cpk2) {
        cpk2.a_(false);
        cpk2.ak_();
        if (cpk2 instanceof bdl) {
            this.g.remove(cpk2);
            this.G();
        }
        int n2 = cpk2.bH;
        int n3 = cpk2.bJ;
        if (cpk2.bG && this.a(n2, n3, true)) {
            this.a(n2, n3).b(cpk2);
        }
        this.c.remove(cpk2);
        this.d(cpk2);
    }

    public void a(bde bde2) {
        this.s.add(bde2);
    }

    public void b(bde bde2) {
        this.s.remove(bde2);
    }

    public List a(cpk cpk2, cxt cxt2) {
        int n2;
        ArrayList arrayList = ov.a();
        int n3 = cmk.c(cxt2.a) - 1;
        int n4 = cmk.f(cxt2.d) + 1;
        int n5 = cmk.c(cxt2.b) - 1;
        int n6 = cmk.f(cxt2.e) + 1;
        int n7 = cmk.c(cxt2.c) - 1;
        int n8 = cmk.f(cxt2.f) + 1;
        ajw ajw2 = this.U();
        boolean bl2 = cpk2 != null && cpk2.cE();
        boolean bl3 = cpk2 != null && this.a(ajw2, cpk2);
        dbk dbk2 = blg.b.s();
        bjb bjb2 = bjb.e();
        for (int i2 = n3; i2 < n4; ++i2) {
            for (n2 = n7; n2 < n8; ++n2) {
                int n9 = (i2 == n3 || i2 == n4 - 1 ? 1 : 0) + (n2 == n7 || n2 == n8 - 1 ? 1 : 0);
                if (n9 == 2 || !this.d(bjb2.c(i2, 64, n2))) continue;
                for (int i3 = n5; i3 < n6; ++i3) {
                    if (n9 > 0 && (i3 == n5 || i3 == n6 - 1)) continue;
                    bjb2.c(i2, i3, n2);
                    if (cpk2 != null) {
                        if (bl2 && bl3) {
                            cpk2.u(false);
                        } else if (!bl2 && !bl3) {
                            cpk2.u(true);
                        }
                    }
                    dbk dbk3 = dbk2;
                    if (ajw2.a(bjb2) || !bl3) {
                        dbk3 = this.n(bjb2);
                    }
                    dbk3.a(this, bjb2, cxt2, arrayList, cpk2);
                }
            }
        }
        bjb2.f();
        if (cpk2 != null) {
            List list = this.b(cpk2, cxt2.b(0.25));
            for (n2 = 0; n2 < list.size(); ++n2) {
                cpk cpk3 = (cpk)list.get(n2);
                if (cpk2.s(cpk3)) continue;
                cxt cxt3 = cpk3.ao_();
                if (cxt3 != null && cxt3.b(cxt2)) {
                    arrayList.add(cxt3);
                }
                if ((cxt3 = cpk2.a_(cpk3)) == null || !cxt3.b(cxt2)) continue;
                arrayList.add(cxt3);
            }
        }
        return arrayList;
    }

    public boolean a(ajw ajw2, cpk cpk2) {
        double d2 = ajw2.b();
        double d3 = ajw2.c();
        double d4 = ajw2.d();
        double d5 = ajw2.e();
        if (cpk2.cE()) {
            d2 += 1.0;
            d3 += 1.0;
            d4 -= 1.0;
            d5 -= 1.0;
        } else {
            d2 -= 1.0;
            d3 -= 1.0;
            d4 += 1.0;
            d5 += 1.0;
        }
        return cpk2.aU > d2 && cpk2.aU < d4 && cpk2.aW > d3 && cpk2.aW < d5;
    }

    public List a(cxt cxt2) {
        ArrayList arrayList = ov.a();
        int n2 = cmk.c(cxt2.a) - 1;
        int n3 = cmk.f(cxt2.d) + 1;
        int n4 = cmk.c(cxt2.b) - 1;
        int n5 = cmk.f(cxt2.e) + 1;
        int n6 = cmk.c(cxt2.c) - 1;
        int n7 = cmk.f(cxt2.f) + 1;
        bjb bjb2 = bjb.e();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                int n8 = (i2 == n2 || i2 == n3 - 1 ? 1 : 0) + (i3 == n6 || i3 == n7 - 1 ? 1 : 0);
                if (n8 == 2 || !this.d(bjb2.c(i2, 64, i3))) continue;
                for (int i4 = n4; i4 < n5; ++i4) {
                    if (n8 > 0 && (i4 == n4 || i4 == n5 - 1)) continue;
                    bjb2.c(i2, i4, i3);
                    dbk dbk2 = i2 < -30000000 || i2 >= 30000000 || i3 < -30000000 || i3 >= 30000000 ? blg.h.s() : this.n(bjb2);
                    dbk2.a(this, bjb2, cxt2, arrayList, null);
                }
            }
        }
        bjb2.f();
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(cxt cxt2) {
        ArrayList arrayList = ov.a();
        int n2 = cmk.c(cxt2.a) - 1;
        int n3 = cmk.f(cxt2.d) + 1;
        int n4 = cmk.c(cxt2.b) - 1;
        int n5 = cmk.f(cxt2.e) + 1;
        int n6 = cmk.c(cxt2.c) - 1;
        int n7 = cmk.f(cxt2.f) + 1;
        bjb bjb2 = bjb.e();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n6; i3 < n7; ++i3) {
                    int n8 = (i2 == n2 || i2 == n3 - 1 ? 1 : 0) + (i3 == n6 || i3 == n7 - 1 ? 1 : 0);
                    if (n8 == 2 || !this.d(bjb2.c(i2, 64, i3))) continue;
                    for (int i4 = n4; i4 < n5; ++i4) {
                        if (n8 > 0 && (i4 == n4 || i4 == n5 - 1)) continue;
                        bjb2.c(i2, i4, i3);
                        if (i2 < -30000000 || i2 >= 30000000 || i3 < -30000000 || i3 >= 30000000) {
                            boolean bl2 = true;
                            return bl2;
                        }
                        dbk dbk2 = this.n(bjb2);
                        dbk2.a(this, bjb2, cxt2, arrayList, null);
                        if (arrayList.isEmpty()) continue;
                        boolean bl3 = true;
                        return bl3;
                    }
                }
            }
        }
        finally {
            bjb2.f();
        }
        return false;
    }

    public int a(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (cmk.b(f3 * ((float)Math.PI * 2)) * 2.0f + 0.5f);
        f4 = cmk.a(f4, 0.0f, 1.0f);
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.j(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.h(f2) * 5.0f) / 16.0));
        f4 = 1.0f - f4;
        return (int)(f4 * 11.0f);
    }

    public float b(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (cmk.b(f3 * ((float)Math.PI * 2)) * 2.0f + 0.2f);
        f4 = cmk.a(f4, 0.0f, 1.0f);
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.j(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.h(f2) * 5.0f) / 16.0));
        return f4 * 0.8f + 0.2f;
    }

    public amj a(cpk cpk2, float f2) {
        float f3;
        float f4;
        float f5 = this.c(f2);
        float f6 = cmk.b(f5 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f6 = cmk.a(f6, 0.0f, 1.0f);
        int n2 = cmk.c(cpk2.aU);
        int n3 = cmk.c(cpk2.aV);
        int n4 = cmk.c(cpk2.aW);
        cmz cmz2 = new cmz(n2, n3, n4);
        anr anr2 = this.a(cmz2);
        float f7 = anr2.c(cmz2);
        int n5 = anr2.a(f7);
        float f8 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f9 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f10 = (float)(n5 & 0xFF) / 255.0f;
        f8 *= f6;
        f9 *= f6;
        f10 *= f6;
        float f11 = this.j(f2);
        if (f11 > 0.0f) {
            f4 = (f8 * 0.3f + f9 * 0.59f + f10 * 0.11f) * 0.6f;
            f3 = 1.0f - f11 * 0.75f;
            f8 = f8 * f3 + f4 * (1.0f - f3);
            f9 = f9 * f3 + f4 * (1.0f - f3);
            f10 = f10 * f3 + f4 * (1.0f - f3);
        }
        if ((f4 = this.h(f2)) > 0.0f) {
            f3 = (f8 * 0.3f + f9 * 0.59f + f10 * 0.11f) * 0.2f;
            float f12 = 1.0f - f4 * 0.75f;
            f8 = f8 * f12 + f3 * (1.0f - f12);
            f9 = f9 * f12 + f3 * (1.0f - f12);
            f10 = f10 * f12 + f3 * (1.0f - f12);
        }
        if (this.K > 0) {
            f3 = (float)this.K - f2;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            f8 = f8 * (1.0f - (f3 *= 0.45f)) + 0.8f * f3;
            f9 = f9 * (1.0f - f3) + 0.8f * f3;
            f10 = f10 * (1.0f - f3) + 1.0f * f3;
        }
        return new amj(f8, f9, f10);
    }

    public float c(float f2) {
        return this.q.a(this.v.f(), f2);
    }

    public int i() {
        return this.q.a(this.v.f());
    }

    public float j() {
        return byf.a[this.q.a(this.v.f())];
    }

    public float d(float f2) {
        float f3 = this.c(f2);
        return f3 * ((float)Math.PI * 2);
    }

    public amj e(float f2) {
        float f3;
        float f4;
        float f5 = this.c(f2);
        float f6 = cmk.b(f5 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f6 = cmk.a(f6, 0.0f, 1.0f);
        float f7 = 1.0f;
        float f8 = 1.0f;
        float f9 = 1.0f;
        float f10 = this.j(f2);
        if (f10 > 0.0f) {
            f4 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.6f;
            f3 = 1.0f - f10 * 0.95f;
            f7 = f7 * f3 + f4 * (1.0f - f3);
            f8 = f8 * f3 + f4 * (1.0f - f3);
            f9 = f9 * f3 + f4 * (1.0f - f3);
        }
        f7 *= f6 * 0.9f + 0.1f;
        f8 *= f6 * 0.9f + 0.1f;
        f9 *= f6 * 0.85f + 0.15f;
        f4 = this.h(f2);
        if (f4 > 0.0f) {
            f3 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.2f;
            float f11 = 1.0f - f4 * 0.95f;
            f7 = f7 * f11 + f3 * (1.0f - f11);
            f8 = f8 * f11 + f3 * (1.0f - f11);
            f9 = f9 * f11 + f3 * (1.0f - f11);
        }
        return new amj(f7, f8, f9);
    }

    public amj f(float f2) {
        float f3 = this.c(f2);
        return this.q.b(f3, f2);
    }

    public cmz o(cmz cmz2) {
        return this.e(cmz2).f(cmz2);
    }

    public cmz p(cmz cmz2) {
        cmz cmz3;
        ahk ahk2;
        bhm bhm2 = this.e(cmz2);
        cmz cmz4 = new cmz(cmz2.a(), bhm2.a() + 16, cmz2.c());
        while (!(cmz4.b() < 0 || (ahk2 = bhm2.c(cmz3 = cmz4.h()).a()).c() && ahk2 != ahk.j)) {
            cmz4 = cmz3;
        }
        return cmz4;
    }

    public float g(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (cmk.b(f3 * ((float)Math.PI * 2)) * 2.0f + 0.25f);
        f4 = cmk.a(f4, 0.0f, 1.0f);
        return f4 * f4 * 0.5f;
    }

    public boolean e(cmz cmz2, bfa bfa2) {
        return true;
    }

    public void a(cmz cmz2, bfa bfa2, int n2) {
    }

    public void a(cmz cmz2, bfa bfa2, int n2, int n3) {
    }

    public void b(cmz cmz2, bfa bfa2, int n2, int n3) {
    }

    public void k() {
        int n2;
        Object object;
        int n3;
        this.A.a("entities");
        this.A.a("global");
        for (n3 = 0; n3 < this.h.size(); ++n3) {
            object = (cpk)this.h.get(n3);
            try {
                ++((cpk)object).by;
                ((cpk)object).bb_();
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Ticking entity");
                sx sx2 = cet2.a("Entity being ticked");
                if (object == null) {
                    sx2.a("Entity", "~~NULL~~");
                } else {
                    ((cpk)object).a(sx2);
                }
                throw new oz(cet2);
            }
            if (!((cpk)object).bk) continue;
            this.h.remove(n3--);
        }
        this.A.c("remove");
        this.c.removeAll(this.d);
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            object = (cpk)this.d.get(n3);
            int n4 = ((cpk)object).bH;
            n2 = ((cpk)object).bJ;
            if (!((cpk)object).bG || !this.a(n4, n2, true)) continue;
            this.a(n4, n2).b((cpk)object);
        }
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            this.d((cpk)this.d.get(n3));
        }
        this.d.clear();
        this.l();
        this.A.c("regular");
        for (n3 = 0; n3 < this.c.size(); ++n3) {
            object = (cpk)this.c.get(n3);
            cpk cpk2 = ((cpk)object).cL();
            if (cpk2 != null) {
                if (!cpk2.bk && cpk2.r((cpk)object)) continue;
                ((cpk)object).s_();
            }
            this.A.a("tick");
            if (!((cpk)object).bk && !(object instanceof czt)) {
                try {
                    this.g((cpk)object);
                }
                catch (Throwable throwable) {
                    cet cet3 = cet.a(throwable, "Ticking entity");
                    sx sx3 = cet3.a("Entity being ticked");
                    ((cpk)object).a(sx3);
                    throw new oz(cet3);
                }
            }
            this.A.b();
            this.A.a("remove");
            if (((cpk)object).bk) {
                n2 = ((cpk)object).bH;
                int n5 = ((cpk)object).bJ;
                if (((cpk)object).bG && this.a(n2, n5, true)) {
                    this.a(n2, n5).b((cpk)object);
                }
                this.c.remove(n3--);
                this.d((cpk)object);
            }
            this.A.b();
        }
        this.A.c("blockEntities");
        this.M = true;
        Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            cmz cmz2;
            object = (bql)iterator.next();
            if (!((bql)object).A() && ((bql)object).w() && this.d(cmz2 = ((bql)object).y()) && this.N.a(cmz2)) {
                try {
                    this.A.a(object.getClass().getSimpleName());
                    ((avf)object).a();
                    this.A.b();
                }
                catch (Throwable throwable) {
                    cet cet4 = cet.a(throwable, "Ticking block entity");
                    sx sx4 = cet4.a("Block entity being ticked");
                    ((bql)object).a(sx4);
                    throw new oz(cet4);
                }
            }
            if (!((bql)object).A()) continue;
            iterator.remove();
            this.e.remove(object);
            if (!this.d(((bql)object).y())) continue;
            this.e(((bql)object).y()).e(((bql)object).y());
        }
        this.M = false;
        if (!this.H.isEmpty()) {
            this.f.removeAll(this.H);
            this.e.removeAll(this.H);
            this.H.clear();
        }
        this.A.c("pendingBlockEntities");
        if (!this.G.isEmpty()) {
            for (int i2 = 0; i2 < this.G.size(); ++i2) {
                bql bql2 = (bql)this.G.get(i2);
                if (bql2.A()) continue;
                if (!this.e.contains(bql2)) {
                    this.a(bql2);
                }
                if (!this.d(bql2.y())) continue;
                bhm bhm2 = this.e(bql2.y());
                dbk dbk2 = bhm2.c(bql2.y());
                bhm2.a(bql2.y(), bql2);
                this.a(bql2.y(), dbk2, dbk2, 3);
            }
            this.G.clear();
        }
        this.A.b();
        this.A.b();
    }

    protected void l() {
    }

    public boolean a(bql bql2) {
        boolean bl2 = this.e.add(bql2);
        if (bl2 && bql2 instanceof avf) {
            this.f.add(bql2);
        }
        return bl2;
    }

    public void a(Collection collection) {
        if (this.M) {
            this.G.addAll(collection);
        } else {
            for (bql bql2 : collection) {
                this.a(bql2);
            }
        }
    }

    public void g(cpk cpk2) {
        this.a(cpk2, true);
    }

    public void a(cpk cpk2, boolean bl2) {
        int n2 = cmk.c(cpk2.aU);
        int n3 = cmk.c(cpk2.aW);
        int n4 = 32;
        if (bl2 && !this.a(n2 - 32, 0, n3 - 32, n2 + 32, 0, n3 + 32, true)) {
            return;
        }
        cpk2.br = cpk2.aU;
        cpk2.bs = cpk2.aV;
        cpk2.bt = cpk2.aW;
        cpk2.bc = cpk2.ba;
        cpk2.bd = cpk2.bb;
        if (bl2 && cpk2.bG) {
            ++cpk2.by;
            if (cpk2.cp()) {
                cpk2.af_();
            } else {
                cpk2.bb_();
            }
        }
        this.A.a("chunkCheck");
        if (Double.isNaN(cpk2.aU) || Double.isInfinite(cpk2.aU)) {
            cpk2.aU = cpk2.br;
        }
        if (Double.isNaN(cpk2.aV) || Double.isInfinite(cpk2.aV)) {
            cpk2.aV = cpk2.bs;
        }
        if (Double.isNaN(cpk2.aW) || Double.isInfinite(cpk2.aW)) {
            cpk2.aW = cpk2.bt;
        }
        if (Double.isNaN(cpk2.bb) || Double.isInfinite(cpk2.bb)) {
            cpk2.bb = cpk2.bd;
        }
        if (Double.isNaN(cpk2.ba) || Double.isInfinite(cpk2.ba)) {
            cpk2.ba = cpk2.bc;
        }
        int n5 = cmk.c(cpk2.aU / 16.0);
        int n6 = cmk.c(cpk2.aV / 16.0);
        int n7 = cmk.c(cpk2.aW / 16.0);
        if (!cpk2.bG || cpk2.bH != n5 || cpk2.bI != n6 || cpk2.bJ != n7) {
            if (cpk2.bG && this.a(cpk2.bH, cpk2.bJ, true)) {
                this.a(cpk2.bH, cpk2.bJ).a(cpk2, cpk2.bI);
            }
            if (cpk2.cG() || this.a(n5, n7, true)) {
                this.a(n5, n7).a(cpk2);
            } else {
                cpk2.bG = false;
            }
        }
        this.A.b();
        if (bl2 && cpk2.bG) {
            for (cpk cpk3 : cpk2.cH()) {
                if (cpk3.bk || cpk3.cL() != cpk2) {
                    cpk3.s_();
                    continue;
                }
                this.g(cpk3);
            }
        }
    }

    public boolean c(cxt cxt2) {
        return this.a(cxt2, (cpk)null);
    }

    public boolean a(cxt cxt2, cpk cpk2) {
        List list = this.b(null, cxt2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cpk cpk3 = (cpk)list.get(i2);
            if (cpk3.bk || !cpk3.aN || cpk3 == cpk2 || cpk2 != null && !cpk3.s(cpk2)) continue;
            return false;
        }
        return true;
    }

    public boolean d(cxt cxt2) {
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.b);
        int n5 = cmk.f(cxt2.e);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        bjb bjb2 = bjb.e();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    dbk dbk2 = this.n(bjb2.c(i2, i3, i4));
                    if (dbk2.a() == ahk.a) continue;
                    bjb2.f();
                    return true;
                }
            }
        }
        bjb2.f();
        return false;
    }

    public boolean e(cxt cxt2) {
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.b);
        int n5 = cmk.f(cxt2.e);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        bjb bjb2 = bjb.e();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    dbk dbk2 = this.n(bjb2.c(i2, i3, i4));
                    if (!dbk2.a().d()) continue;
                    bjb2.f();
                    return true;
                }
            }
        }
        bjb2.f();
        return false;
    }

    public boolean f(cxt cxt2) {
        int n2;
        int n3 = cmk.c(cxt2.a);
        int n4 = cmk.f(cxt2.d);
        int n5 = cmk.c(cxt2.b);
        int n6 = cmk.f(cxt2.e);
        int n7 = cmk.c(cxt2.c);
        if (this.a(n3, n5, n7, n4, n6, n2 = cmk.f(cxt2.f), true)) {
            bjb bjb2 = bjb.e();
            for (int i2 = n3; i2 < n4; ++i2) {
                for (int i3 = n5; i3 < n6; ++i3) {
                    for (int i4 = n7; i4 < n2; ++i4) {
                        bfa bfa2 = this.n(bjb2.c(i2, i3, i4)).t();
                        if (bfa2 != blg.ab && bfa2 != blg.k && bfa2 != blg.l) continue;
                        bjb2.f();
                        return true;
                    }
                }
            }
            bjb2.f();
        }
        return false;
    }

    public boolean a(cxt cxt2, ahk ahk2, cpk cpk2) {
        int n2;
        int n3 = cmk.c(cxt2.a);
        int n4 = cmk.f(cxt2.d);
        int n5 = cmk.c(cxt2.b);
        int n6 = cmk.f(cxt2.e);
        int n7 = cmk.c(cxt2.c);
        if (!this.a(n3, n5, n7, n4, n6, n2 = cmk.f(cxt2.f), true)) {
            return false;
        }
        boolean bl2 = false;
        amj amj2 = amj.a;
        bjb bjb2 = bjb.e();
        for (int i2 = n3; i2 < n4; ++i2) {
            for (int i3 = n5; i3 < n6; ++i3) {
                for (int i4 = n7; i4 < n2; ++i4) {
                    double d2;
                    bjb2.c(i2, i3, i4);
                    dbk dbk2 = this.n(bjb2);
                    bfa bfa2 = dbk2.t();
                    if (dbk2.a() != ahk2 || !((double)n6 >= (d2 = (double)((float)(i3 + 1) - en.b((Integer)dbk2.b(en.a)))))) continue;
                    bl2 = true;
                    amj2 = bfa2.a(this, (cmz)bjb2, cpk2, amj2);
                }
            }
        }
        bjb2.f();
        if (amj2.b() > 0.0 && cpk2.A_()) {
            amj2 = amj2.a();
            double d3 = 0.014;
            cpk2.aX += amj2.b * 0.014;
            cpk2.aY += amj2.c * 0.014;
            cpk2.aZ += amj2.d * 0.014;
        }
        return bl2;
    }

    public boolean a(cxt cxt2, ahk ahk2) {
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.b);
        int n5 = cmk.f(cxt2.e);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        bjb bjb2 = bjb.e();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    if (this.n(bjb2.c(i2, i3, i4)).a() != ahk2) continue;
                    bjb2.f();
                    return true;
                }
            }
        }
        bjb2.f();
        return false;
    }

    public boolean b(cxt cxt2, ahk ahk2) {
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.b);
        int n5 = cmk.f(cxt2.e);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        bjb bjb2 = bjb.e();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    dbk dbk2 = this.n(bjb2.c(i2, i3, i4));
                    if (dbk2.a() != ahk2) continue;
                    int n8 = (Integer)dbk2.b(en.a);
                    double d2 = i3 + 1;
                    if (n8 < 8) {
                        d2 = (double)(i3 + 1) - (double)n8 / 8.0;
                    }
                    if (!(d2 >= cxt2.b)) continue;
                    bjb2.f();
                    return true;
                }
            }
        }
        bjb2.f();
        return false;
    }

    public yk a(cpk cpk2, double d2, double d3, double d4, float f2, boolean bl2) {
        return this.a(cpk2, d2, d3, d4, f2, false, bl2);
    }

    public yk a(cpk cpk2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        yk yk2 = new yk(this, cpk2, d2, d3, d4, f2, bl2, bl3);
        yk2.a();
        yk2.a(true);
        return yk2;
    }

    public float a(amj amj2, cxt cxt2) {
        double d2 = 1.0 / ((cxt2.d - cxt2.a) * 2.0 + 1.0);
        double d3 = 1.0 / ((cxt2.e - cxt2.b) * 2.0 + 1.0);
        double d4 = 1.0 / ((cxt2.f - cxt2.c) * 2.0 + 1.0);
        double d5 = (1.0 - Math.floor(1.0 / d2) * d2) / 2.0;
        double d6 = (1.0 - Math.floor(1.0 / d4) * d4) / 2.0;
        if (d2 < 0.0 || d3 < 0.0 || d4 < 0.0) {
            return 0.0f;
        }
        int n2 = 0;
        int n3 = 0;
        float f2 = 0.0f;
        while (f2 <= 1.0f) {
            float f3 = 0.0f;
            while (f3 <= 1.0f) {
                float f4 = 0.0f;
                while (f4 <= 1.0f) {
                    double d7 = cxt2.a + (cxt2.d - cxt2.a) * (double)f2;
                    double d8 = cxt2.b + (cxt2.e - cxt2.b) * (double)f3;
                    double d9 = cxt2.c + (cxt2.f - cxt2.c) * (double)f4;
                    if (this.a(new amj(d7 + d5, d8, d9 + d6), amj2) == null) {
                        ++n2;
                    }
                    ++n3;
                    f4 = (float)((double)f4 + d4);
                }
                f3 = (float)((double)f3 + d3);
            }
            f2 = (float)((double)f2 + d2);
        }
        return (float)n2 / (float)n3;
    }

    public boolean a(bdl bdl2, cmz cmz2, bqk bqk2) {
        if (this.n(cmz2 = cmz2.c(bqk2)).t() == blg.ab) {
            this.a(bdl2, 1009, cmz2, 0);
            this.f(cmz2);
            return true;
        }
        return false;
    }

    public String m() {
        return "All: " + this.c.size();
    }

    public String n() {
        return this.t.b();
    }

    @Override
    public bql q(cmz cmz2) {
        if (this.E(cmz2)) {
            return null;
        }
        bql bql2 = null;
        if (this.M) {
            bql2 = this.F(cmz2);
        }
        if (bql2 == null) {
            bql2 = this.e(cmz2).a(cmz2, bfw.a);
        }
        if (bql2 == null) {
            bql2 = this.F(cmz2);
        }
        return bql2;
    }

    private bql F(cmz cmz2) {
        for (int i2 = 0; i2 < this.G.size(); ++i2) {
            bql bql2 = (bql)this.G.get(i2);
            if (bql2.A() || !bql2.y().equals(cmz2)) continue;
            return bql2;
        }
        return null;
    }

    public void a(cmz cmz2, bql bql2) {
        if (this.E(cmz2)) {
            return;
        }
        if (bql2 != null && !bql2.A()) {
            if (this.M) {
                bql2.c(cmz2);
                Iterator iterator = this.G.iterator();
                while (iterator.hasNext()) {
                    bql bql3 = (bql)iterator.next();
                    if (!bql3.y().equals(cmz2)) continue;
                    bql3.e_();
                    iterator.remove();
                }
                this.G.add(bql2);
            } else {
                this.a(bql2);
                this.e(cmz2).a(cmz2, bql2);
            }
        }
    }

    public void r(cmz cmz2) {
        bql bql2 = this.q(cmz2);
        if (bql2 != null && this.M) {
            bql2.e_();
            this.G.remove(bql2);
        } else {
            if (bql2 != null) {
                this.G.remove(bql2);
                this.e.remove(bql2);
                this.f.remove(bql2);
            }
            this.e(cmz2).e(cmz2);
        }
    }

    public void b(bql bql2) {
        this.H.add(bql2);
    }

    public boolean s(cmz cmz2) {
        cxt cxt2 = this.n(cmz2).d(this, cmz2);
        return cxt2 != bfa.y && cxt2.a() >= 1.0;
    }

    public boolean d(cmz cmz2, boolean bl2) {
        if (this.E(cmz2)) {
            return false;
        }
        bhm bhm2 = this.t.a(cmz2.a() >> 4, cmz2.c() >> 4);
        if (bhm2 == null || bhm2.h()) {
            return bl2;
        }
        dbk dbk2 = this.n(cmz2);
        return dbk2.a().j() && dbk2.h();
    }

    public void o() {
        int n2 = this.a(1.0f);
        if (n2 != this.J) {
            this.J = n2;
        }
    }

    public void a(boolean bl2, boolean bl3) {
        this.D = bl2;
        this.E = bl3;
    }

    public void p() {
        this.r();
    }

    protected void q() {
        if (this.v.n()) {
            this.m = 1.0f;
            if (this.v.l()) {
                this.o = 1.0f;
            }
        }
    }

    protected void r() {
        int n2;
        if (this.q.n()) {
            return;
        }
        if (this.C) {
            return;
        }
        int n3 = this.v.y();
        if (n3 > 0) {
            this.v.g(--n3);
            this.v.e(this.v.l() ? 1 : 2);
            this.v.f(this.v.n() ? 1 : 2);
        }
        if ((n2 = this.v.m()) <= 0) {
            if (this.v.l()) {
                this.v.e(this.p.nextInt(12000) + 3600);
            } else {
                this.v.e(this.p.nextInt(168000) + 12000);
            }
        } else {
            this.v.e(--n2);
            if (n2 <= 0) {
                this.v.a(!this.v.l());
            }
        }
        this.n = this.o;
        this.o = this.v.l() ? (float)((double)this.o + 0.01) : (float)((double)this.o - 0.01);
        this.o = cmk.a(this.o, 0.0f, 1.0f);
        int n4 = this.v.o();
        if (n4 <= 0) {
            if (this.v.n()) {
                this.v.f(this.p.nextInt(12000) + 12000);
            } else {
                this.v.f(this.p.nextInt(168000) + 12000);
            }
        } else {
            this.v.f(--n4);
            if (n4 <= 0) {
                this.v.b(!this.v.n());
            }
        }
        this.l = this.m;
        this.m = this.v.n() ? (float)((double)this.m + 0.01) : (float)((double)this.m - 0.01);
        this.m = cmk.a(this.m, 0.0f, 1.0f);
    }

    protected void a(int n2, int n3, bhm bhm2) {
        bhm2.n();
    }

    protected void s() {
    }

    public void a(cmz cmz2, dbk dbk2, Random random) {
        this.b = true;
        dbk2.t().a(this, cmz2, dbk2, random);
        this.b = false;
    }

    public boolean t(cmz cmz2) {
        return this.e(cmz2, false);
    }

    public boolean u(cmz cmz2) {
        return this.e(cmz2, true);
    }

    public boolean e(cmz cmz2, boolean bl2) {
        dbk dbk2;
        bfa bfa2;
        anr anr2 = this.a(cmz2);
        float f2 = anr2.c(cmz2);
        if (f2 > 0.15f) {
            return false;
        }
        if (cmz2.b() >= 0 && cmz2.b() < 256 && this.b(bzq.b, cmz2) < 10 && ((bfa2 = (dbk2 = this.n(cmz2)).t()) == blg.j || bfa2 == blg.i) && (Integer)dbk2.b(en.a) == 0) {
            boolean bl3;
            if (!bl2) {
                return true;
            }
            boolean bl4 = bl3 = this.G(cmz2.k()) && this.G(cmz2.l()) && this.G(cmz2.i()) && this.G(cmz2.j());
            if (!bl3) {
                return true;
            }
        }
        return false;
    }

    private boolean G(cmz cmz2) {
        return this.n(cmz2).a() == ahk.h;
    }

    public boolean f(cmz cmz2, boolean bl2) {
        dbk dbk2;
        anr anr2 = this.a(cmz2);
        float f2 = anr2.c(cmz2);
        if (f2 > 0.15f) {
            return false;
        }
        if (!bl2) {
            return true;
        }
        return cmz2.b() >= 0 && cmz2.b() < 256 && this.b(bzq.b, cmz2) < 10 && (dbk2 = this.n(cmz2)).a() == ahk.a && blg.aH.a(this, cmz2);
    }

    public boolean v(cmz cmz2) {
        boolean bl2 = false;
        if (!this.q.n()) {
            bl2 |= this.c(bzq.a, cmz2);
        }
        return bl2 |= this.c(bzq.b, cmz2);
    }

    private int a(cmz cmz2, bzq bzq2) {
        if (bzq2 == bzq.a && this.g(cmz2)) {
            return 15;
        }
        dbk dbk2 = this.n(cmz2);
        int n2 = bzq2 == bzq.a ? 0 : dbk2.d();
        int n3 = dbk2.c();
        if (n3 >= 15 && dbk2.d() > 0) {
            n3 = 1;
        }
        if (n3 < 1) {
            n3 = 1;
        }
        if (n3 >= 15) {
            return 0;
        }
        if (n2 >= 14) {
            return n2;
        }
        bjb bjb2 = bjb.e();
        for (bqk bqk2 : bqk.values()) {
            bjb2.d(cmz2).b(bqk2);
            int n4 = this.b(bzq2, (cmz)bjb2) - n3;
            if (n4 > n2) {
                n2 = n4;
            }
            if (n2 < 14) continue;
            return n2;
        }
        bjb2.f();
        return n2;
    }

    public boolean c(bzq bzq2, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        if (!this.a(cmz2, 17, false)) {
            return false;
        }
        int n10 = 0;
        int n11 = 0;
        this.A.a("getBrightness");
        int n12 = this.b(bzq2, cmz2);
        int n13 = this.a(cmz2, bzq2);
        int n14 = cmz2.a();
        int n15 = cmz2.b();
        int n16 = cmz2.c();
        if (n13 > n12) {
            this.F[n11++] = 133152;
        } else if (n13 < n12) {
            this.F[n11++] = 0x20820 | n12 << 18;
            while (n10 < n11) {
                n9 = this.F[n10++];
                n8 = (n9 & 0x3F) - 32 + n14;
                n7 = (n9 >> 6 & 0x3F) - 32 + n15;
                n6 = (n9 >> 12 & 0x3F) - 32 + n16;
                int n17 = n9 >> 18 & 0xF;
                cmz cmz3 = new cmz(n8, n7, n6);
                n5 = this.b(bzq2, cmz3);
                if (n5 != n17) continue;
                this.a(bzq2, cmz3, 0);
                if (n17 <= 0 || (n4 = cmk.a(n8 - n14)) + (n3 = cmk.a(n7 - n15)) + (n2 = cmk.a(n6 - n16)) >= 17) continue;
                bjb bjb2 = bjb.e();
                for (bqk bqk2 : bqk.values()) {
                    int n18 = n8 + bqk2.h();
                    int n19 = n7 + bqk2.i();
                    int n20 = n6 + bqk2.j();
                    bjb2.c(n18, n19, n20);
                    int n21 = Math.max(1, this.n(bjb2).c());
                    n5 = this.b(bzq2, (cmz)bjb2);
                    if (n5 != n17 - n21 || n11 >= this.F.length) continue;
                    this.F[n11++] = n18 - n14 + 32 | n19 - n15 + 32 << 6 | n20 - n16 + 32 << 12 | n17 - n21 << 18;
                }
                bjb2.f();
            }
            n10 = 0;
        }
        this.A.b();
        this.A.a("checkedPosition < toCheckCount");
        while (n10 < n11) {
            boolean bl2;
            n9 = this.F[n10++];
            n8 = (n9 & 0x3F) - 32 + n14;
            n7 = (n9 >> 6 & 0x3F) - 32 + n15;
            n6 = (n9 >> 12 & 0x3F) - 32 + n16;
            cmz cmz4 = new cmz(n8, n7, n6);
            int n22 = this.b(bzq2, cmz4);
            n5 = this.a(cmz4, bzq2);
            if (n5 == n22) continue;
            this.a(bzq2, cmz4, n5);
            if (n5 <= n22) continue;
            n4 = Math.abs(n8 - n14);
            n3 = Math.abs(n7 - n15);
            n2 = Math.abs(n6 - n16);
            boolean bl3 = bl2 = n11 < this.F.length - 6;
            if (n4 + n3 + n2 >= 17 || !bl2) continue;
            if (this.b(bzq2, cmz4.k()) < n5) {
                this.F[n11++] = n8 - 1 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(bzq2, cmz4.l()) < n5) {
                this.F[n11++] = n8 + 1 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(bzq2, cmz4.h()) < n5) {
                this.F[n11++] = n8 - n14 + 32 + (n7 - 1 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(bzq2, cmz4.g()) < n5) {
                this.F[n11++] = n8 - n14 + 32 + (n7 + 1 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(bzq2, cmz4.i()) < n5) {
                this.F[n11++] = n8 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - 1 - n16 + 32 << 12);
            }
            if (this.b(bzq2, cmz4.j()) >= n5) continue;
            this.F[n11++] = n8 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 + 1 - n16 + 32 << 12);
        }
        this.A.b();
        return true;
    }

    public boolean a(boolean bl2) {
        return false;
    }

    public List a(bhm bhm2, boolean bl2) {
        return null;
    }

    public List b(awx awx2, boolean bl2) {
        return null;
    }

    public List b(cpk cpk2, cxt cxt2) {
        return this.a(cpk2, cxt2, auxx.e);
    }

    public List a(cpk cpk2, cxt cxt2, cm cm2) {
        ArrayList arrayList = ov.a();
        int n2 = cmk.c((cxt2.a - 2.0) / 16.0);
        int n3 = cmk.c((cxt2.d + 2.0) / 16.0);
        int n4 = cmk.c((cxt2.c - 2.0) / 16.0);
        int n5 = cmk.c((cxt2.f + 2.0) / 16.0);
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                if (!this.a(i2, i3, true)) continue;
                this.a(i2, i3).a(cpk2, cxt2, (List)arrayList, cm2);
            }
        }
        return arrayList;
    }

    public List a(Class class_, cm cm2) {
        ArrayList arrayList = ov.a();
        for (cpk cpk2 : this.c) {
            if (!class_.isAssignableFrom(cpk2.getClass()) || !cm2.a(cpk2)) continue;
            arrayList.add(cpk2);
        }
        return arrayList;
    }

    public List b(Class class_, cm cm2) {
        ArrayList arrayList = ov.a();
        for (cpk cpk2 : this.g) {
            if (!class_.isAssignableFrom(cpk2.getClass()) || !cm2.a(cpk2)) continue;
            arrayList.add(cpk2);
        }
        return arrayList;
    }

    public List a(Class class_, cxt cxt2) {
        return this.a(class_, cxt2, auxx.e);
    }

    public List a(Class class_, cxt cxt2, cm cm2) {
        int n2 = cmk.c((cxt2.a - 2.0) / 16.0);
        int n3 = cmk.f((cxt2.d + 2.0) / 16.0);
        int n4 = cmk.c((cxt2.c - 2.0) / 16.0);
        int n5 = cmk.f((cxt2.f + 2.0) / 16.0);
        ArrayList arrayList = ov.a();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                if (!this.a(i2, i3, true)) continue;
                this.a(i2, i3).a(class_, cxt2, (List)arrayList, cm2);
            }
        }
        return arrayList;
    }

    public cpk a(Class class_, cxt cxt2, cpk cpk2) {
        List list = this.a(class_, cxt2);
        cpk cpk3 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            cpk cpk4 = (cpk)list.get(i2);
            if (cpk4 == cpk2 || !auxx.e.a(cpk4) || (d3 = cpk2.l(cpk4)) > d2) continue;
            cpk3 = cpk4;
            d2 = d3;
        }
        return cpk3;
    }

    public cpk a(int n2) {
        return (cpk)this.i.a(n2);
    }

    public List t() {
        return this.c;
    }

    public void b(cmz cmz2, bql bql2) {
        if (this.d(cmz2)) {
            this.e(cmz2).g();
        }
    }

    public int a(Class class_) {
        int n2 = 0;
        for (cpk cpk2 : this.c) {
            if (cpk2 instanceof xy && ((xy)cpk2).aE() || !class_.isAssignableFrom(cpk2.getClass())) continue;
            ++n2;
        }
        return n2;
    }

    public void b(Collection collection) {
        this.c.addAll(collection);
        for (cpk cpk2 : collection) {
            this.c(cpk2);
        }
    }

    public void c(Collection collection) {
        this.d.addAll(collection);
    }

    public boolean a(bfa bfa2, cmz cmz2, boolean bl2, bqk bqk2, cpk cpk2, bhl bhl2) {
        cxt cxt2;
        dbk dbk2 = this.n(cmz2);
        cxt cxt3 = cxt2 = bl2 ? null : bfa2.s().d(this, cmz2);
        if (cxt2 != bfa.y && !this.a(cxt2.a(cmz2), cpk2)) {
            return false;
        }
        if (dbk2.a() == ahk.q && bfa2 == blg.cf) {
            return true;
        }
        return dbk2.a().i() && bfa2.a(this, cmz2, bqk2, bhl2);
    }

    public int u() {
        return this.a;
    }

    public void b(int n2) {
        this.a = n2;
    }

    @Override
    public int a(cmz cmz2, bqk bqk2) {
        return this.n(cmz2).b(this, cmz2, bqk2);
    }

    @Override
    public aaf v() {
        return this.v.s();
    }

    public int w(cmz cmz2) {
        int n2 = 0;
        if ((n2 = Math.max(n2, this.a(cmz2.h(), bqk.a))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(cmz2.g(), bqk.b))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(cmz2.i(), bqk.c))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(cmz2.j(), bqk.d))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(cmz2.k(), bqk.e))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(cmz2.l(), bqk.f))) >= 15) {
            return n2;
        }
        return n2;
    }

    public boolean b(cmz cmz2, bqk bqk2) {
        return this.c(cmz2, bqk2) > 0;
    }

    public int c(cmz cmz2, bqk bqk2) {
        dbk dbk2 = this.n(cmz2);
        if (dbk2.l()) {
            return this.w(cmz2);
        }
        return dbk2.a((bnj)this, cmz2, bqk2);
    }

    public boolean x(cmz cmz2) {
        if (this.c(cmz2.h(), bqk.a) > 0) {
            return true;
        }
        if (this.c(cmz2.g(), bqk.b) > 0) {
            return true;
        }
        if (this.c(cmz2.i(), bqk.c) > 0) {
            return true;
        }
        if (this.c(cmz2.j(), bqk.d) > 0) {
            return true;
        }
        if (this.c(cmz2.k(), bqk.e) > 0) {
            return true;
        }
        return this.c(cmz2.l(), bqk.f) > 0;
    }

    public int y(cmz cmz2) {
        int n2 = 0;
        for (bqk bqk2 : bqk.values()) {
            int n3 = this.c(cmz2.c(bqk2), bqk2);
            if (n3 >= 15) {
                return 15;
            }
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    public bdl a(cpk cpk2, double d2) {
        return this.a(cpk2.aU, cpk2.aV, cpk2.aW, d2, false);
    }

    public bdl b(cpk cpk2, double d2) {
        return this.a(cpk2.aU, cpk2.aV, cpk2.aW, d2, true);
    }

    public bdl a(double d2, double d3, double d4, double d5, boolean bl2) {
        double d6 = -1.0;
        bdl bdl2 = null;
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            bdl bdl3 = (bdl)this.g.get(i2);
            if (!auxx.d.a(bdl3) && bl2 || !auxx.e.a(bdl3) && !bl2) continue;
            double d7 = bdl3.i(d2, d3, d4);
            if (!(d5 < 0.0) && !(d7 < d5 * d5) || d6 != -1.0 && !(d7 < d6)) continue;
            d6 = d7;
            bdl2 = bdl3;
        }
        return bdl2;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            bdl bdl2 = (bdl)this.g.get(i2);
            if (!auxx.e.a(bdl2)) continue;
            double d6 = bdl2.i(d2, d3, d4);
            if (!(d5 < 0.0) && !(d6 < d5 * d5)) continue;
            return true;
        }
        return false;
    }

    public bdl a(cpk cpk2, double d2, double d3) {
        return this.a(cpk2.aU, cpk2.aV, cpk2.aW, d2, d3, null, null);
    }

    public bdl a(cmz cmz2, double d2, double d3) {
        return this.a((double)((float)cmz2.a() + 0.5f), (double)((float)cmz2.b() + 0.5f), (double)((float)cmz2.c() + 0.5f), d2, d3, null, null);
    }

    public bdl a(double d2, double d3, double d4, double d5, double d6, bl bl2, cm cm2) {
        double d7 = -1.0;
        bdl bdl2 = null;
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            bdl bdl3 = (bdl)this.g.get(i2);
            if (bdl3.G.a || !bdl3.bj() || bdl3.aL() || cm2 != null && !cm2.a(bdl3)) continue;
            double d8 = bdl3.i(d2, bdl3.aV, d4);
            double d9 = d5;
            if (bdl3.ar_()) {
                d9 *= (double)0.8f;
            }
            if (bdl3.ct()) {
                float f2 = bdl3.am();
                if (f2 < 0.1f) {
                    f2 = 0.1f;
                }
                d9 *= (double)(0.7f * f2);
            }
            if (bl2 != null) {
                d9 *= ((Double)cc.b(bl2.a(bdl3), 1.0)).doubleValue();
            }
            if (!(d6 < 0.0) && !(Math.abs(bdl3.aV - d3) < d6 * d6) || !(d5 < 0.0) && !(d8 < d9 * d9) || d7 != -1.0 && !(d8 < d7)) continue;
            d7 = d8;
            bdl2 = bdl3;
        }
        return bdl2;
    }

    public bdl a(String string) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            bdl bdl2 = (bdl)this.g.get(i2);
            if (!string.equals(bdl2.i_())) continue;
            return bdl2;
        }
        return null;
    }

    public bdl a(UUID uUID) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            bdl bdl2 = (bdl)this.g.get(i2);
            if (!uUID.equals(bdl2.cx())) continue;
            return bdl2;
        }
        return null;
    }

    public void w() {
    }

    public void x() {
        this.u.b();
    }

    public void a(long l2) {
        this.v.a(l2);
    }

    public long y() {
        return this.v.a();
    }

    public long z() {
        return this.v.e();
    }

    public long A() {
        return this.v.f();
    }

    public void b(long l2) {
        this.v.b(l2);
    }

    public cmz B() {
        cmz cmz2 = new cmz(this.v.b(), this.v.c(), this.v.d());
        if (!this.U().a(cmz2)) {
            cmz2 = this.k(new cmz(this.U().f(), 0.0, this.U().g()));
        }
        return cmz2;
    }

    public void z(cmz cmz2) {
        this.v.a(cmz2);
    }

    public void h(cpk cpk2) {
        int n2 = cmk.c(cpk2.aU / 16.0);
        int n3 = cmk.c(cpk2.aW / 16.0);
        int n4 = 2;
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                this.a(n2 + i2, n3 + i3);
            }
        }
        if (!this.c.contains(cpk2)) {
            this.c.add(cpk2);
        }
    }

    public boolean a(bdl bdl2, cmz cmz2) {
        return true;
    }

    public void a(cpk cpk2, byte by2) {
    }

    public apb C() {
        return this.t;
    }

    public void c(cmz cmz2, bfa bfa2, int n2, int n3) {
        this.n(cmz2).a(this, cmz2, n2, n3);
    }

    public ajq D() {
        return this.u;
    }

    public cvn E() {
        return this.v;
    }

    public xx F() {
        return this.v.v();
    }

    public void G() {
    }

    public float h(float f2) {
        return (this.n + (this.o - this.n) * f2) * this.j(f2);
    }

    public void i(float f2) {
        this.n = f2;
        this.o = f2;
    }

    public float j(float f2) {
        return this.l + (this.m - this.l) * f2;
    }

    public void k(float f2) {
        this.l = f2;
        this.m = f2;
    }

    public boolean H() {
        return (double)this.h(1.0f) > 0.9;
    }

    public boolean I() {
        return (double)this.j(1.0f) > 0.2;
    }

    public boolean A(cmz cmz2) {
        if (!this.I()) {
            return false;
        }
        if (!this.g(cmz2)) {
            return false;
        }
        if (this.o(cmz2).b() > cmz2.b()) {
            return false;
        }
        anr anr2 = this.a(cmz2);
        if (anr2.c()) {
            return false;
        }
        if (this.f(cmz2, false)) {
            return false;
        }
        return anr2.d();
    }

    public boolean B(cmz cmz2) {
        anr anr2 = this.a(cmz2);
        return anr2.e();
    }

    public bkj J() {
        return this.x;
    }

    public void a(String string, bh bh2) {
        this.x.a(string, bh2);
    }

    public bh a(Class class_, String string) {
        return this.x.a(class_, string);
    }

    public int b(String string) {
        return this.x.a(string);
    }

    public void a(int n2, cmz cmz2, int n3) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((bde)this.s.get(i2)).a(n2, cmz2, n3);
        }
    }

    public void b(int n2, cmz cmz2, int n3) {
        this.a(null, n2, cmz2, n3);
    }

    public void a(bdl bdl2, int n2, cmz cmz2, int n3) {
        try {
            for (int i2 = 0; i2 < this.s.size(); ++i2) {
                ((bde)this.s.get(i2)).a(bdl2, n2, cmz2, n3);
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Playing level event");
            sx sx2 = cet2.a("Level event being played");
            sx2.a("Block coordinates", sx.a(cmz2));
            sx2.a("Event source", bdl2);
            sx2.a("Event type", n2);
            sx2.a("Event data", n3);
            throw new oz(cet2);
        }
    }

    public int K() {
        return 256;
    }

    public int L() {
        return this.q.n() ? 128 : 256;
    }

    public Random a(int n2, int n3, int n4) {
        long l2 = (long)n2 * 341873128712L + (long)n3 * 132897987541L + this.E().a() + (long)n4;
        this.p.setSeed(l2);
        return this.p;
    }

    @Override
    public boolean M() {
        return false;
    }

    public double N() {
        if (this.v.s() == aaf.c) {
            return 0.0;
        }
        return 63.0;
    }

    public sx a(cet cet2) {
        sx sx2 = cet2.a("Affected level", 1);
        sx2.a("Level name", this.v == null ? "????" : this.v.i());
        sx2.a("All players", new uo(this));
        sx2.a("Chunk stats", new awu(this));
        try {
            this.v.a(sx2);
        }
        catch (Throwable throwable) {
            sx2.a("Level Data Unobtainable", throwable);
        }
        return sx2;
    }

    public void c(int n2, cmz cmz2, int n3) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            bde bde2 = (bde)this.s.get(i2);
            bde2.b(n2, cmz2, n3);
        }
    }

    public Calendar O() {
        if (this.z() % 600L == 0L) {
            this.L.setTimeInMillis(net.minecraft.c.a.av());
        }
        return this.L;
    }

    public void a(double d2, double d3, double d4, double d5, double d6, double d7, bvp bvp2) {
    }

    public bzt P() {
        return this.B;
    }

    public void f(cmz cmz2, bfa bfa2) {
        for (bqk bqk2 : afj.a) {
            cmz cmz3 = cmz2.c(bqk2);
            if (!this.d(cmz3)) continue;
            dbk dbk2 = this.n(cmz3);
            if (blg.cj.p(dbk2)) {
                dbk2.a(this, cmz3, bfa2);
                continue;
            }
            if (!dbk2.l() || !blg.cj.p(dbk2 = this.n(cmz3 = cmz3.c(bqk2)))) continue;
            dbk2.a(this, cmz3, bfa2);
        }
    }

    public bgp C(cmz cmz2) {
        long l2 = 0L;
        float f2 = 0.0f;
        if (this.d(cmz2)) {
            f2 = this.j();
            l2 = this.e(cmz2).x();
        }
        return new bgp(this.Q(), this.A(), l2, f2);
    }

    public ct Q() {
        return this.E().w();
    }

    public int R() {
        return this.J;
    }

    public void c(int n2) {
        this.J = n2;
    }

    public int S() {
        return this.K;
    }

    public void d(int n2) {
        this.K = n2;
    }

    public go T() {
        return this.y;
    }

    public ajw U() {
        return this.N;
    }

    public boolean d(int n2, int n3) {
        cmz cmz2 = this.B();
        int n4 = n2 * 16 + 8 - cmz2.a();
        int n5 = n3 * 16 + 8 - cmz2.c();
        int n6 = 128;
        return n4 >= -128 && n4 <= 128 && n5 >= -128 && n5 <= 128;
    }

    public void a(ds ds2) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    public baz V() {
        return this.z;
    }
}

