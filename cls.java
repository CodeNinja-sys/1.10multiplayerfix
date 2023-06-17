/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cls
extends ajt
implements avf,
vk {
    private bhl[] c = new bhl[5];
    private String d;
    private int e = -1;

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new ml("Hopper", new String[]{"Items"}));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.c = new bhl[this.aI_()];
        if (bvp2.b("CustomName", 8)) {
            this.d = bvp2.l("CustomName");
        }
        this.e = bvp2.h("TransferCooldown");
        if (!this.c(bvp2)) {
            bmh bmh2 = bvp2.c("Items", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                byte by2 = bvp3.f("Slot");
                if (by2 < 0 || by2 >= this.c.length) continue;
                this.c[by2] = bhl.a(bvp3);
            }
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        if (!this.d(bvp2)) {
            bmh bmh2 = new bmh();
            for (int i2 = 0; i2 < this.c.length; ++i2) {
                if (this.c[i2] == null) continue;
                bvp bvp3 = new bvp();
                bvp3.a("Slot", (byte)i2);
                this.c[i2].b(bvp3);
                bmh2.a(bvp3);
            }
            bvp2.a("Items", bmh2);
        }
        bvp2.a("TransferCooldown", this.e);
        if (this.j_()) {
            bvp2.a("CustomName", this.d);
        }
        return bvp2;
    }

    @Override
    public int aI_() {
        return this.c.length;
    }

    @Override
    public bhl a(int n2) {
        this.d((bdl)null);
        return this.c[n2];
    }

    @Override
    public bhl a(int n2, int n3) {
        this.d((bdl)null);
        return cjk.a(this.c, n2, n3);
    }

    @Override
    public bhl b(int n2) {
        this.d((bdl)null);
        return cjk.a(this.c, n2);
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.d((bdl)null);
        this.c[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
    }

    @Override
    public String i_() {
        return this.j_() ? this.d : "container.hopper";
    }

    @Override
    public boolean j_() {
        return this.d != null && !this.d.isEmpty();
    }

    public void a(String string) {
        this.d = string;
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(bdl bdl2) {
        if (this.k.q(this.l) != this) {
            return false;
        }
        return !(bdl2.i((double)this.l.a() + 0.5, (double)this.l.b() + 0.5, (double)this.l.c() + 0.5) > 64.0);
    }

    @Override
    public void b(bdl bdl2) {
    }

    @Override
    public void c(bdl bdl2) {
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    @Override
    public void a() {
        if (this.k == null || this.k.C) {
            return;
        }
        --this.e;
        if (!this.p()) {
            this.d(0);
            this.o();
        }
    }

    public boolean o() {
        if (this.k == null || this.k.C) {
            return false;
        }
        if (!this.p() && ao.c(this.x())) {
            boolean bl2 = false;
            if (!this.r()) {
                bl2 = this.t();
            }
            if (!this.s()) {
                boolean bl3 = bl2 = cls.a(this) || bl2;
            }
            if (bl2) {
                this.d(8);
                this.c_();
                return true;
            }
        }
        return false;
    }

    private boolean r() {
        for (bhl bhl2 : this.c) {
            if (bhl2 == null) continue;
            return false;
        }
        return true;
    }

    private boolean s() {
        for (bhl bhl2 : this.c) {
            if (bhl2 != null && bhl2.b == bhl2.b()) continue;
            return false;
        }
        return true;
    }

    private boolean t() {
        tb tb2 = this.u();
        if (tb2 == null) {
            return false;
        }
        bqk bqk2 = ao.b(this.x()).e();
        if (this.a(tb2, bqk2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.aI_(); ++i2) {
            if (this.a(i2) == null) continue;
            bhl bhl2 = this.a(i2).j();
            bhl bhl3 = cls.a(tb2, this.a(i2, 1), bqk2);
            if (bhl3 == null || bhl3.b == 0) {
                tb2.c_();
                return true;
            }
            this.a(i2, bhl2);
        }
        return false;
    }

    private boolean a(tb tb2, bqk bqk2) {
        if (tb2 instanceof azs) {
            int[] arrn;
            azs azs2 = (azs)tb2;
            for (int n2 : arrn = azs2.a(bqk2)) {
                bhl bhl2 = azs2.a(n2);
                if (bhl2 != null && bhl2.b == bhl2.b()) continue;
                return false;
            }
        } else {
            int n3 = tb2.aI_();
            for (int i2 = 0; i2 < n3; ++i2) {
                bhl bhl3 = tb2.a(i2);
                if (bhl3 != null && bhl3.b == bhl3.b()) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean b(tb tb2, bqk bqk2) {
        if (tb2 instanceof azs) {
            int[] arrn;
            azs azs2 = (azs)tb2;
            for (int n2 : arrn = azs2.a(bqk2)) {
                if (azs2.a(n2) == null) continue;
                return false;
            }
        } else {
            int n3 = tb2.aI_();
            for (int i2 = 0; i2 < n3; ++i2) {
                if (tb2.a(i2) == null) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean a(vk vk2) {
        tb tb2 = cls.b(vk2);
        if (tb2 != null) {
            bqk bqk2 = bqk.a;
            if (cls.b(tb2, bqk2)) {
                return false;
            }
            if (tb2 instanceof azs) {
                int[] arrn;
                azs azs2 = (azs)tb2;
                for (int n2 : arrn = azs2.a(bqk2)) {
                    if (!cls.a(vk2, tb2, n2, bqk2)) continue;
                    return true;
                }
            } else {
                int n3 = tb2.aI_();
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (!cls.a(vk2, tb2, i2, bqk2)) continue;
                    return true;
                }
            }
        } else {
            for (er er2 : cls.a(vk2.b_(), vk2.j(), vk2.k(), vk2.l())) {
                if (!cls.a(vk2, er2)) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean a(vk vk2, tb tb2, int n2, bqk bqk2) {
        bhl bhl2 = tb2.a(n2);
        if (bhl2 != null && cls.b(tb2, bhl2, n2, bqk2)) {
            bhl bhl3 = bhl2.j();
            bhl bhl4 = cls.a(vk2, tb2.a(n2, 1), null);
            if (bhl4 == null || bhl4.b == 0) {
                tb2.c_();
                return true;
            }
            tb2.a(n2, bhl3);
        }
        return false;
    }

    public static boolean a(tb tb2, er er2) {
        boolean bl2 = false;
        if (er2 == null) {
            return false;
        }
        bhl bhl2 = er2.h().j();
        bhl bhl3 = cls.a(tb2, bhl2, null);
        if (bhl3 == null || bhl3.b == 0) {
            bl2 = true;
            er2.ak_();
        } else {
            er2.a(bhl3);
        }
        return bl2;
    }

    public static bhl a(tb tb2, bhl bhl2, bqk bqk2) {
        if (tb2 instanceof azs && bqk2 != null) {
            azs azs2 = (azs)tb2;
            int[] arrn = azs2.a(bqk2);
            for (int i2 = 0; i2 < arrn.length && bhl2 != null && bhl2.b > 0; ++i2) {
                bhl2 = cls.c(tb2, bhl2, arrn[i2], bqk2);
            }
        } else {
            int n2 = tb2.aI_();
            for (int i3 = 0; i3 < n2 && bhl2 != null && bhl2.b > 0; ++i3) {
                bhl2 = cls.c(tb2, bhl2, i3, bqk2);
            }
        }
        if (bhl2 != null && bhl2.b == 0) {
            bhl2 = null;
        }
        return bhl2;
    }

    private static boolean a(tb tb2, bhl bhl2, int n2, bqk bqk2) {
        if (!tb2.b(n2, bhl2)) {
            return false;
        }
        return !(tb2 instanceof azs) || ((azs)tb2).a(n2, bhl2, bqk2);
    }

    private static boolean b(tb tb2, bhl bhl2, int n2, bqk bqk2) {
        return !(tb2 instanceof azs) || ((azs)tb2).b(n2, bhl2, bqk2);
    }

    private static bhl c(tb tb2, bhl bhl2, int n2, bqk bqk2) {
        bhl bhl3 = tb2.a(n2);
        if (cls.a(tb2, bhl2, n2, bqk2)) {
            boolean bl2 = false;
            if (bhl3 == null) {
                tb2.a(n2, bhl2);
                bhl2 = null;
                bl2 = true;
            } else if (cls.a(bhl3, bhl2)) {
                int n3 = bhl2.b() - bhl3.b;
                int n4 = Math.min(bhl2.b, n3);
                bhl2.b -= n4;
                bhl3.b += n4;
                boolean bl3 = bl2 = n4 > 0;
            }
            if (bl2) {
                if (tb2 instanceof cls) {
                    cls cls2 = (cls)tb2;
                    if (cls2.q()) {
                        cls2.d(8);
                    }
                    tb2.c_();
                }
                tb2.c_();
            }
        }
        return bhl2;
    }

    private tb u() {
        bqk bqk2 = ao.b(this.x());
        return cls.b(this.b_(), this.j() + (double)bqk2.h(), this.k() + (double)bqk2.i(), this.l() + (double)bqk2.j());
    }

    public static tb b(vk vk2) {
        return cls.b(vk2.b_(), vk2.j(), vk2.k() + 1.0, vk2.l());
    }

    public static List a(iu iu2, double d2, double d3, double d4) {
        return iu2.a(er.class, new cxt(d2 - 0.5, d3, d4 - 0.5, d2 + 0.5, d3 + 1.5, d4 + 0.5), auxx.a);
    }

    public static tb b(iu iu2, double d2, double d3, double d4) {
        Object object;
        int n2;
        int n3;
        tb tb2 = null;
        int n4 = cmk.c(d2);
        cmz cmz2 = new cmz(n4, n3 = cmk.c(d3), n2 = cmk.c(d4));
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2.l() && (object = iu2.q(cmz2)) instanceof tb && (tb2 = (tb)object) instanceof bdm && bfa2 instanceof aqi) {
            tb2 = ((aqi)bfa2).a(iu2, cmz2, true);
        }
        if (tb2 == null && !(object = iu2.a((cpk)null, new cxt(d2 - 0.5, d3 - 0.5, d4 - 0.5, d2 + 0.5, d3 + 0.5, d4 + 0.5), auxx.c)).isEmpty()) {
            tb2 = (tb)object.get(iu2.p.nextInt(object.size()));
        }
        return tb2;
    }

    private static boolean a(bhl bhl2, bhl bhl3) {
        if (bhl2.a() != bhl3.a()) {
            return false;
        }
        if (bhl2.h() != bhl3.h()) {
            return false;
        }
        if (bhl2.b > bhl2.b()) {
            return false;
        }
        return bhl.a(bhl2, bhl3);
    }

    @Override
    public double j() {
        return (double)this.l.a() + 0.5;
    }

    @Override
    public double k() {
        return (double)this.l.b() + 0.5;
    }

    @Override
    public double l() {
        return (double)this.l.c() + 0.5;
    }

    public void d(int n2) {
        this.e = n2;
    }

    public boolean p() {
        return this.e > 0;
    }

    public boolean q() {
        return this.e <= 1;
    }

    @Override
    public String n() {
        return "minecraft:hopper";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        this.d(bdl2);
        return new cfq(cps2, this, bdl2);
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void g() {
        this.d((bdl)null);
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = null;
        }
    }
}

