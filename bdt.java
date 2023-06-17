/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.yd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class bdt
extends alo {
    private static final bpx b = new bpx("textures/misc/vignette.png");
    private static final bpx c = new bpx("textures/gui/widgets.png");
    private static final bpx d = new bpx("textures/misc/pumpkinblur.png");
    private final Random e = new Random();
    private final bxy f;
    private final bth g;
    private final crd h;
    private int i;
    private String j = "";
    private int k;
    private boolean l;
    public float a = 1.0f;
    private int m;
    private bhl r;
    private final cmq s;
    private final ddr t;
    private final czg u;
    private final bxc v;
    private final zw w;
    private int x;
    private String y = "";
    private String z = "";
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private long F;
    private long G;

    public bdt(bxy bxy2) {
        this.f = bxy2;
        this.g = bxy2.ae();
        this.s = new cmq(bxy2);
        this.u = new czg(bxy2);
        this.h = new crd(bxy2);
        this.v = new bxc(bxy2, this);
        this.w = new zw(bxy2);
        this.t = new ddr(bxy2);
        this.a();
    }

    public void a() {
        this.A = 10;
        this.B = 70;
        this.C = 20;
    }

    public void a(float f2) {
        bhi bhi2;
        int n2;
        int n3;
        float f3;
        float f4;
        cnt cnt2 = new cnt(this.f);
        int n4 = cnt2.a();
        int n5 = cnt2.b();
        deb deb2 = this.e();
        this.f.o.h();
        cja.l();
        if (bxy.z()) {
            this.b(this.f.h.a(f2), cnt2);
        } else {
            cja.j();
            cja.a(bjt.l, afi.j, bjt.e, afi.n);
        }
        bhl bhl2 = this.f.h.n.g(3);
        if (this.f.u.as == 0 && bhl2 != null && bhl2.a() == azg.a(blg.aU)) {
            this.f(cnt2);
        }
        if (!this.f.h.b(ake.i) && (f4 = this.f.h.k + (this.f.h.j - this.f.h.k) * f2) > 0.0f) {
            this.c(f4, cnt2);
        }
        if (this.f.c.a()) {
            this.u.a(cnt2, f2);
        } else {
            this.a(cnt2, f2);
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.P().a(p);
        cja.l();
        this.a(f2, cnt2);
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        this.f.B.a("bossHealth");
        this.w.a();
        this.f.B.b();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.P().a(p);
        if (this.f.c.b()) {
            this.d(cnt2);
        }
        this.e(cnt2);
        cja.k();
        if (this.f.h.au() > 0) {
            this.f.B.a("sleep");
            cja.i();
            cja.c();
            int n6 = this.f.h.au();
            f3 = (float)n6 / 100.0f;
            if (f3 > 1.0f) {
                f3 = 1.0f - (float)(n6 - 100) / 10.0f;
            }
            n3 = (int)(220.0f * f3) << 24 | 0x101020;
            bdt.a(0, 0, n4, n5, n3);
            cja.d();
            cja.j();
            this.f.B.b();
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        int n7 = n4 / 2 - 91;
        if (this.f.h.L()) {
            this.a(cnt2, n7);
        } else if (this.f.c.f()) {
            this.b(cnt2, n7);
        }
        if (this.f.u.E && !this.f.c.a()) {
            this.b(cnt2);
        } else if (this.f.h.aL()) {
            this.u.a(cnt2);
        }
        if (this.f.w()) {
            this.c(cnt2);
        }
        this.a(cnt2);
        if (this.f.u.at) {
            this.s.a(cnt2);
        }
        if (this.k > 0) {
            this.f.B.a("overlayMessage");
            f3 = (float)this.k - f2;
            n3 = (int)(f3 * 255.0f / 20.0f);
            if (n3 > 255) {
                n3 = 255;
            }
            if (n3 > 8) {
                cja.D();
                cja.c((float)(n4 / 2), (float)(n5 - 68), 0.0f);
                cja.l();
                cja.a(bjt.l, afi.j, bjt.e, afi.n);
                int n8 = 0xFFFFFF;
                if (this.l) {
                    n8 = cmk.c(f3 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                }
                deb2.a(this.j, -deb2.a(this.j) / 2, -4, n8 + (n3 << 24 & 0xFF000000));
                cja.k();
                cja.E();
            }
            this.f.B.b();
        }
        this.t.a(cnt2);
        if (this.x > 0) {
            this.f.B.a("titleAndSubtitle");
            f3 = (float)this.x - f2;
            n3 = 255;
            if (this.x > this.C + this.B) {
                float f5 = (float)(this.A + this.B + this.C) - f3;
                n3 = (int)(f5 * 255.0f / (float)this.A);
            }
            if (this.x <= this.C) {
                n3 = (int)(f3 * 255.0f / (float)this.C);
            }
            if ((n3 = cmk.a(n3, 0, 255)) > 8) {
                cja.D();
                cja.c((float)(n4 / 2), (float)(n5 / 2), 0.0f);
                cja.l();
                cja.a(bjt.l, afi.j, bjt.e, afi.n);
                cja.D();
                cja.b(4.0f, 4.0f, 4.0f);
                int n9 = n3 << 24 & 0xFF000000;
                deb2.a(this.y, (float)(-deb2.a(this.y) / 2), -10.0f, 0xFFFFFF | n9, true);
                cja.E();
                cja.D();
                cja.b(2.0f, 2.0f, 2.0f);
                deb2.a(this.z, (float)(-deb2.a(this.z) / 2), 5.0f, 0xFFFFFF | n9, true);
                cja.E();
                cja.k();
                cja.E();
            }
            this.f.B.b();
        }
        bzt bzt2 = this.f.f.P();
        bhi bhi3 = null;
        ef ef2 = bzt2.g(this.f.h.i_());
        if (ef2 != null && (n2 = ef2.l().a()) >= 0) {
            bhi3 = bzt2.a(3 + n2);
        }
        bhi bhi4 = bhi2 = bhi3 != null ? bhi3 : bzt2.a(1);
        if (bhi2 != null) {
            this.a(bhi2, cnt2);
        }
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c();
        cja.D();
        cja.c(0.0f, (float)(n5 - 48), 0.0f);
        this.f.B.a("chat");
        this.h.a(this.i);
        this.f.B.b();
        cja.E();
        bhi2 = bzt2.a(0);
        if (this.f.u.ag.e() && (!this.f.F() || this.f.h.a.c().size() > 1 || bhi2 != null)) {
            this.v.a(true);
            this.v.a(n4, bzt2, bhi2);
        } else {
            this.v.a(false);
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.f();
        cja.d();
    }

    private void a(float f2, cnt cnt2) {
        cmx cmx2 = this.f.u;
        if (cmx2.as != 0) {
            return;
        }
        if (this.f.c.a() && this.f.i == null) {
            auu auu2 = this.f.t;
            if (auu2 == null || auu2.a != bmw.b) {
                return;
            }
            cmz cmz2 = auu2.a();
            if (!this.f.f.n(cmz2).t().l() || !(this.f.f.q(cmz2) instanceof tb)) {
                return;
            }
        }
        int n2 = cnt2.a();
        int n3 = cnt2.b();
        if (cmx2.at && !cmx2.ar && !this.f.h.aP() && !cmx2.w) {
            cja.D();
            cja.c((float)(n2 / 2), (float)(n3 / 2), this.q);
            cpk cpk2 = this.f.ab();
            cja.b(cpk2.bd + (cpk2.bb - cpk2.bd) * f2, -1.0f, 0.0f, 0.0f);
            cja.b(cpk2.bc + (cpk2.ba - cpk2.bc) * f2, 0.0f, 1.0f, 0.0f);
            cja.b(-1.0f, -1.0f, -1.0f);
            cjg.m(10);
            cja.E();
        } else {
            float f3;
            cja.a(bjt.i, afi.k, bjt.e, afi.n);
            cja.d();
            this.c(n2 / 2 - 7, n3 / 2 - 7, 0, 0, 16, 16);
            if (this.f.u.N == 1 && (f3 = this.f.h.j(0.0f)) < 1.0f) {
                int n4 = n3 / 2 - 7 + 16;
                int n5 = n2 / 2 - 7;
                int n6 = (int)(f3 * 17.0f);
                this.c(n5, n4, 36, 94, 16, 4);
                this.c(n5, n4, 52, 94, n6, 4);
            }
        }
    }

    protected void a(cnt cnt2) {
        Collection collection = this.f.h.bf();
        if (collection.isEmpty()) {
            return;
        }
        this.f.P().a(ab.a);
        cja.l();
        int n2 = 0;
        int n3 = 0;
        for (cko cko2 : yd.d().a().a(collection)) {
            bfv bfv2 = cko2.a();
            if (!bfv2.c() || !cko2.e()) continue;
            int n4 = cnt2.a();
            int n5 = 1;
            int n6 = bfv2.d();
            if (bfv2.h()) {
                n4 -= 25 * ++n2;
            } else {
                n4 -= 25 * ++n3;
                n5 += 26;
            }
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            float f2 = 1.0f;
            if (cko2.d()) {
                this.c(n4, n5, 165, 166, 24, 24);
            } else {
                this.c(n4, n5, 141, 166, 24, 24);
                if (cko2.b() <= 200) {
                    int n7 = 10 - cko2.b() / 20;
                    f2 = cmk.a((float)cko2.b() / 10.0f / 5.0f * 0.5f, 0.0f, 0.5f) + cmk.b((float)cko2.b() * (float)Math.PI / 5.0f) * cmk.a((float)n7 / 10.0f * 0.25f, 0.0f, 0.25f);
                }
            }
            cja.c(1.0f, 1.0f, 1.0f, f2);
            this.c(n4 + 3, n5 + 3, n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
        }
    }

    protected void a(cnt cnt2, float f2) {
        float f3;
        int n2;
        int n3;
        int n4;
        if (!(this.f.ab() instanceof bdl)) {
            return;
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.P().a(c);
        bdl bdl2 = (bdl)this.f.ab();
        bhl bhl2 = bdl2.bu();
        s s2 = bdl2.aK().a();
        int n5 = cnt2.a() / 2;
        float f4 = this.q;
        int n6 = 182;
        int n7 = 91;
        this.q = -90.0f;
        this.c(n5 - 91, cnt2.b() - 22, 0, 0, 182, 22);
        this.c(n5 - 91 - 1 + bdl2.n.d * 20, cnt2.b() - 22 - 1, 0, 22, 24, 22);
        if (bhl2 != null) {
            if (s2 == s.a) {
                this.c(n5 - 91 - 29, cnt2.b() - 23, 24, 22, 29, 24);
            } else {
                this.c(n5 + 91, cnt2.b() - 23, 53, 22, 29, 24);
            }
        }
        this.q = f4;
        cja.A();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        bjr.c();
        for (n4 = 0; n4 < 9; ++n4) {
            n3 = n5 - 90 + n4 * 20 + 2;
            n2 = cnt2.b() - 16 - 3;
            this.a(n3, n2, f2, bdl2, bdl2.n.a[n4]);
        }
        if (bhl2 != null) {
            n4 = cnt2.b() - 16 - 3;
            if (s2 == s.a) {
                this.a(n5 - 91 - 26, n4, f2, bdl2, bhl2);
            } else {
                this.a(n5 + 91 + 10, n4, f2, bdl2, bhl2);
            }
        }
        if (this.f.u.N == 2 && (f3 = this.f.h.j(0.0f)) < 1.0f) {
            n3 = cnt2.b() - 20;
            n2 = n5 + 91 + 6;
            if (s2 == s.b) {
                n2 = n5 - 91 - 22;
            }
            this.f.P().a(alo.p);
            int n8 = (int)(f3 * 19.0f);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.c(n2, n3, 0, 94, 18, 18);
            this.c(n2, n3 + 18 - n8, 18, 112 - n8, 18, n8);
        }
        bjr.a();
        cja.B();
        cja.k();
    }

    public void a(cnt cnt2, int n2) {
        this.f.B.a("jumpBar");
        this.f.P().a(alo.p);
        float f2 = this.f.h.M();
        int n3 = 182;
        int n4 = (int)(f2 * 183.0f);
        int n5 = cnt2.b() - 32 + 3;
        this.c(n2, n5, 0, 84, 182, 5);
        if (n4 > 0) {
            this.c(n2, n5, 0, 89, n4, 5);
        }
        this.f.B.b();
    }

    public void b(cnt cnt2, int n2) {
        int n3;
        int n4;
        this.f.B.a("expBar");
        this.f.P().a(alo.p);
        int n5 = this.f.h.aD();
        if (n5 > 0) {
            int n6 = 182;
            n4 = (int)(this.f.h.J * 183.0f);
            n3 = cnt2.b() - 32 + 3;
            this.c(n2, n3, 0, 64, 182, 5);
            if (n4 > 0) {
                this.c(n2, n3, 0, 69, n4, 5);
            }
        }
        this.f.B.b();
        if (this.f.h.H > 0) {
            this.f.B.a("expLevel");
            String string = "" + this.f.h.H;
            n4 = (cnt2.a() - this.e().a(string)) / 2;
            n3 = cnt2.b() - 31 - 4;
            this.e().a(string, n4 + 1, n3, 0);
            this.e().a(string, n4 - 1, n3, 0);
            this.e().a(string, n4, n3 + 1, 0);
            this.e().a(string, n4, n3 - 1, 0);
            this.e().a(string, n4, n3, 8453920);
            this.f.B.b();
        }
    }

    public void b(cnt cnt2) {
        this.f.B.a("selectedItemName");
        if (this.m > 0 && this.r != null) {
            int n2;
            String string = this.r.q();
            if (this.r.s()) {
                string = (Object)((Object)aug.u) + string;
            }
            int n3 = (cnt2.a() - this.e().a(string)) / 2;
            int n4 = cnt2.b() - 59;
            if (!this.f.c.b()) {
                n4 += 14;
            }
            if ((n2 = (int)((float)this.m * 256.0f / 10.0f)) > 255) {
                n2 = 255;
            }
            if (n2 > 0) {
                cja.D();
                cja.l();
                cja.a(bjt.l, afi.j, bjt.e, afi.n);
                this.e().a(string, (float)n3, (float)n4, 0xFFFFFF + (n2 << 24));
                cja.k();
                cja.E();
            }
        }
        this.f.B.b();
    }

    public void c(cnt cnt2) {
        this.f.B.a("demo");
        String string = this.f.f.z() >= 120500L ? bf.a("demo.demoExpired", new Object[0]) : bf.a("demo.remainingTime", aco.a((int)(120500L - this.f.f.z())));
        int n2 = this.e().a(string);
        this.e().a(string, (float)(cnt2.a() - n2 - 10), 5.0f, 0xFFFFFF);
        this.f.B.b();
    }

    private void a(bhi bhi2, cnt cnt2) {
        bzt bzt2 = bhi2.a();
        Collection collection = bzt2.i(bhi2);
        ArrayList arrayList = ov.a(mq.c((Iterable)collection, new cnl(this)));
        collection = arrayList.size() > 15 ? ov.a(mq.d((Iterable)arrayList, collection.size() - 15)) : arrayList;
        int n2 = this.e().a(bhi2.d());
        for (czu czu2 : collection) {
            ef ef2 = bzt2.g(czu2.d());
            String string = ef.a(ef2, czu2.d()) + ": " + (Object)((Object)aug.m) + czu2.b();
            n2 = Math.max(n2, this.e().a(string));
        }
        int n3 = collection.size() * this.e().a;
        int n4 = cnt2.b() / 2 + n3 / 3;
        int n5 = 3;
        int n6 = cnt2.a() - n2 - 3;
        int n7 = 0;
        for (czu czu3 : collection) {
            ef ef3 = bzt2.g(czu3.d());
            String string = ef.a(ef3, czu3.d());
            String string2 = (Object)((Object)aug.m) + "" + czu3.b();
            int n8 = n6;
            int n9 = n4 - ++n7 * this.e().a;
            int n10 = cnt2.a() - 3 + 2;
            bdt.a(n8 - 2, n9, n10, n9 + this.e().a, 0x50000000);
            this.e().a(string, n8, n9, 0x20FFFFFF);
            this.e().a(string2, n10 - this.e().a(string2), n9, 0x20FFFFFF);
            if (n7 != collection.size()) continue;
            String string3 = bhi2.d();
            bdt.a(n8 - 2, n9 - this.e().a - 1, n10, n9 - 1, 0x60000000);
            bdt.a(n8 - 2, n9 - 1, n10, n9, 0x50000000);
            this.e().a(string3, n8 + n2 / 2 - this.e().a(string3) / 2, n9 - this.e().a, 0x20FFFFFF);
        }
    }

    private void d(cnt cnt2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        boolean bl2;
        if (!(this.f.ab() instanceof bdl)) {
            return;
        }
        bdl bdl2 = (bdl)this.f.ab();
        int n8 = cmk.f(bdl2.bh());
        boolean bl3 = bl2 = this.G > (long)this.i && (this.G - (long)this.i) / 3L % 2L == 1L;
        if (n8 < this.D && bdl2.bB > 0) {
            this.F = bxy.K();
            this.G = this.i + 20;
        } else if (n8 > this.D && bdl2.bB > 0) {
            this.F = bxy.K();
            this.G = this.i + 10;
        }
        if (bxy.K() - this.F > 1000L) {
            this.D = n8;
            this.E = n8;
            this.F = bxy.K();
        }
        this.D = n8;
        int n9 = this.E;
        this.e.setSeed(this.i * 312871);
        cdl cdl2 = bdl2.aE();
        int n10 = cdl2.a();
        cp cp2 = bdl2.a(cgz.a);
        int n11 = cnt2.a() / 2 - 91;
        int n12 = cnt2.a() / 2 + 91;
        int n13 = cnt2.b() - 39;
        float f2 = (float)cp2.e();
        int n14 = cmk.f(bdl2.aO());
        int n15 = cmk.f((f2 + (float)n14) / 2.0f / 10.0f);
        int n16 = Math.max(10 - (n15 - 2), 3);
        int n17 = n13 - (n15 - 1) * n16 - 10;
        int n18 = n13 - 10;
        int n19 = n14;
        int n20 = bdl2.bl();
        int n21 = -1;
        if (bdl2.b(ake.j)) {
            n21 = this.i % cmk.f(f2 + 5.0f);
        }
        this.f.B.a("armor");
        for (n7 = 0; n7 < 10; ++n7) {
            if (n20 <= 0) continue;
            n6 = n11 + n7 * 8;
            if (n7 * 2 + 1 < n20) {
                this.c(n6, n17, 34, 9, 9, 9);
            }
            if (n7 * 2 + 1 == n20) {
                this.c(n6, n17, 25, 9, 9, 9);
            }
            if (n7 * 2 + 1 <= n20) continue;
            this.c(n6, n17, 16, 9, 9, 9);
        }
        this.f.B.c("health");
        for (n7 = cmk.f((f2 + (float)n14) / 2.0f) - 1; n7 >= 0; --n7) {
            n6 = 16;
            if (bdl2.b(ake.s)) {
                n6 += 36;
            } else if (bdl2.b(ake.t)) {
                n6 += 72;
            }
            n5 = 0;
            if (bl2) {
                n5 = 1;
            }
            n4 = cmk.f((float)(n7 + 1) / 10.0f) - 1;
            n3 = n11 + n7 % 10 * 8;
            n2 = n13 - n4 * n16;
            if (n8 <= 4) {
                n2 += this.e.nextInt(2);
            }
            if (n19 <= 0 && n7 == n21) {
                n2 -= 2;
            }
            int n22 = 0;
            if (bdl2.aQ.E().r()) {
                n22 = 5;
            }
            this.c(n3, n2, 16 + n5 * 9, 9 * n22, 9, 9);
            if (bl2) {
                if (n7 * 2 + 1 < n9) {
                    this.c(n3, n2, n6 + 54, 9 * n22, 9, 9);
                }
                if (n7 * 2 + 1 == n9) {
                    this.c(n3, n2, n6 + 63, 9 * n22, 9, 9);
                }
            }
            if (n19 > 0) {
                if (n19 == n14 && n14 % 2 == 1) {
                    this.c(n3, n2, n6 + 153, 9 * n22, 9, 9);
                    --n19;
                    continue;
                }
                this.c(n3, n2, n6 + 144, 9 * n22, 9, 9);
                n19 -= 2;
                continue;
            }
            if (n7 * 2 + 1 < n8) {
                this.c(n3, n2, n6 + 36, 9 * n22, 9, 9);
            }
            if (n7 * 2 + 1 != n8) continue;
            this.c(n3, n2, n6 + 45, 9 * n22, 9, 9);
        }
        cpk cpk2 = bdl2.cL();
        if (cpk2 == null) {
            this.f.B.c("food");
            for (n6 = 0; n6 < 10; ++n6) {
                n5 = n13;
                n4 = 16;
                n3 = 0;
                if (bdl2.b(ake.q)) {
                    n4 += 36;
                    n3 = 13;
                }
                if (bdl2.aE().c() <= 0.0f && this.i % (n10 * 3 + 1) == 0) {
                    n5 += this.e.nextInt(3) - 1;
                }
                n2 = n12 - n6 * 8 - 9;
                this.c(n2, n5, 16 + n3 * 9, 27, 9, 9);
                if (n6 * 2 + 1 < n10) {
                    this.c(n2, n5, n4 + 36, 27, 9, 9);
                }
                if (n6 * 2 + 1 != n10) continue;
                this.c(n2, n5, n4 + 45, 27, 9, 9);
            }
        }
        this.f.B.c("air");
        if (bdl2.a(ahk.h)) {
            n6 = this.f.h.cu();
            n5 = cmk.f((double)(n6 - 2) * 10.0 / 300.0);
            n4 = cmk.f((double)n6 * 10.0 / 300.0) - n5;
            for (n3 = 0; n3 < n5 + n4; ++n3) {
                if (n3 < n5) {
                    this.c(n12 - n3 * 8 - 9, n18, 16, 18, 9, 9);
                    continue;
                }
                this.c(n12 - n3 * 8 - 9, n18, 25, 18, 9, 9);
            }
        }
        this.f.B.b();
    }

    private void e(cnt cnt2) {
        if (!(this.f.ab() instanceof bdl)) {
            return;
        }
        bdl bdl2 = (bdl)this.f.ab();
        cpk cpk2 = bdl2.cL();
        if (cpk2 instanceof bga) {
            this.f.B.c("mountHealth");
            bga bga2 = (bga)cpk2;
            int n2 = (int)Math.ceil(bga2.bh());
            float f2 = bga2.bo();
            int n3 = (int)(f2 + 0.5f) / 2;
            if (n3 > 30) {
                n3 = 30;
            }
            int n4 = cnt2.b() - 39;
            int n5 = cnt2.a() / 2 + 91;
            int n6 = n4;
            int n7 = 0;
            boolean bl2 = false;
            while (n3 > 0) {
                int n8 = Math.min(n3, 10);
                n3 -= n8;
                for (int i2 = 0; i2 < n8; ++i2) {
                    int n9 = 52;
                    int n10 = 0;
                    int n11 = n5 - i2 * 8 - 9;
                    this.c(n11, n6, 52 + n10 * 9, 9, 9, 9);
                    if (i2 * 2 + 1 + n7 < n2) {
                        this.c(n11, n6, 88, 9, 9, 9);
                    }
                    if (i2 * 2 + 1 + n7 != n2) continue;
                    this.c(n11, n6, 97, 9, 9, 9);
                }
                n6 -= 10;
                n7 += 20;
            }
        }
    }

    private void f(cnt cnt2) {
        cja.i();
        cja.a(false);
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.c();
        this.f.P().a(d);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b(0.0, (double)cnt2.b(), -90.0).a(0.0, 1.0).d();
        bix2.b((double)cnt2.a(), (double)cnt2.b(), -90.0).a(1.0, 1.0).d();
        bix2.b((double)cnt2.a(), 0.0, -90.0).a(1.0, 0.0).d();
        bix2.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        bha2.b();
        cja.a(true);
        cja.j();
        cja.d();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void b(float f2, cnt cnt2) {
        f2 = 1.0f - f2;
        f2 = cmk.a(f2, 0.0f, 1.0f);
        ajw ajw2 = this.f.f.U();
        float f3 = (float)ajw2.a(this.f.h);
        double d2 = Math.min(ajw2.o() * (double)ajw2.p() * 1000.0, Math.abs(ajw2.j() - ajw2.h()));
        double d3 = Math.max((double)ajw2.q(), d2);
        f3 = (double)f3 < d3 ? 1.0f - (float)((double)f3 / d3) : 0.0f;
        this.a = (float)((double)this.a + (double)(f2 - this.a) * 0.01);
        cja.i();
        cja.a(false);
        cja.a(bjt.o, afi.k, bjt.e, afi.n);
        if (f3 > 0.0f) {
            cja.c(0.0f, f3, f3, 1.0f);
        } else {
            cja.c(this.a, this.a, this.a, 1.0f);
        }
        this.f.P().a(b);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b(0.0, (double)cnt2.b(), -90.0).a(0.0, 1.0).d();
        bix2.b((double)cnt2.a(), (double)cnt2.b(), -90.0).a(1.0, 1.0).d();
        bix2.b((double)cnt2.a(), 0.0, -90.0).a(1.0, 0.0).d();
        bix2.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        bha2.b();
        cja.a(true);
        cja.j();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
    }

    private void c(float f2, cnt cnt2) {
        if (f2 < 1.0f) {
            f2 *= f2;
            f2 *= f2;
            f2 = f2 * 0.8f + 0.2f;
        }
        cja.c();
        cja.i();
        cja.a(false);
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c(1.0f, 1.0f, 1.0f, f2);
        this.f.P().a(dam.g);
        ars ars2 = this.f.ac().a().a(blg.aY.s());
        float f3 = ars2.e();
        float f4 = ars2.g();
        float f5 = ars2.f();
        float f6 = ars2.h();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b(0.0, (double)cnt2.b(), -90.0).a(f3, f6).d();
        bix2.b((double)cnt2.a(), (double)cnt2.b(), -90.0).a(f5, f6).d();
        bix2.b((double)cnt2.a(), 0.0, -90.0).a(f5, f4).d();
        bix2.b(0.0, 0.0, -90.0).a(f3, f4).d();
        bha2.b();
        cja.a(true);
        cja.j();
        cja.d();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(int n2, int n3, float f2, bdl bdl2, bhl bhl2) {
        if (bhl2 == null) {
            return;
        }
        float f3 = (float)bhl2.c - f2;
        if (f3 > 0.0f) {
            cja.D();
            float f4 = 1.0f + f3 / 5.0f;
            cja.c((float)(n2 + 8), (float)(n3 + 12), 0.0f);
            cja.b(1.0f / f4, (f4 + 1.0f) / 2.0f, 1.0f);
            cja.c((float)(-(n2 + 8)), (float)(-(n3 + 12)), 0.0f);
        }
        this.g.a(bdl2, bhl2, n2, n3);
        if (f3 > 0.0f) {
            cja.E();
        }
        this.g.a(this.f.k, bhl2, n2, n3);
    }

    public void b() {
        if (this.k > 0) {
            --this.k;
        }
        if (this.x > 0) {
            --this.x;
            if (this.x <= 0) {
                this.y = "";
                this.z = "";
            }
        }
        ++this.i;
        if (this.f.h != null) {
            bhl bhl2 = this.f.h.n.h();
            if (bhl2 == null) {
                this.m = 0;
            } else if (this.r == null || bhl2.a() != this.r.a() || !bhl.a(bhl2, this.r) || !bhl2.d() && bhl2.h() != this.r.h()) {
                this.m = 40;
            } else if (this.m > 0) {
                --this.m;
            }
            this.r = bhl2;
        }
    }

    public void a(String string) {
        this.a(bf.a("record.nowPlaying", string), true);
    }

    public void a(String string, boolean bl2) {
        this.j = string;
        this.k = 60;
        this.l = bl2;
    }

    public void a(String string, String string2, int n2, int n3, int n4) {
        if (string == null && string2 == null && n2 < 0 && n3 < 0 && n4 < 0) {
            this.y = "";
            this.z = "";
            this.x = 0;
            return;
        }
        if (string != null) {
            this.y = string;
            this.x = this.A + this.B + this.C;
            return;
        }
        if (string2 != null) {
            this.z = string2;
            return;
        }
        if (n2 >= 0) {
            this.A = n2;
        }
        if (n3 >= 0) {
            this.B = n3;
        }
        if (n4 >= 0) {
            this.C = n4;
        }
        if (this.x > 0) {
            this.x = this.A + this.B + this.C;
        }
    }

    public void a(cbg cbg2, boolean bl2) {
        this.a(cbg2.i(), bl2);
    }

    public crd c() {
        return this.h;
    }

    public int d() {
        return this.i;
    }

    public deb e() {
        return this.f.k;
    }

    public czg f() {
        return this.u;
    }

    public bxc g() {
        return this.v;
    }

    public void h() {
        this.v.a();
        this.w.b();
    }

    public zw i() {
        return this.w;
    }
}

