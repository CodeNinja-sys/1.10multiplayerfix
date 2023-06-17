/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.yd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import net.minecraft.client.b.a;
import net.minecraft.client.f.u;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.t;
import net.minecraft.client.k.al;
import net.minecraft.client.k.an;
import net.minecraft.client.k.ay;
import net.minecraft.client.k.b.l;
import net.minecraft.client.k.bs;
import net.minecraft.client.k.cd;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.cz;
import net.minecraft.client.k.de;
import net.minecraft.client.k.g;
import net.minecraft.client.r;
import net.minecraft.d.c;
import net.minecraft.g.a.h;
import net.minecraft.h.y;
import net.minecraft.j.d;
import net.minecraft.j.j;
import net.minecraft.j.p;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.ai;
import net.minecraft.u.bp;
import net.minecraft.u.bw;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.w.b.a.i;
import net.minecraft.w.n;

public class z
extends de {
    private static final bp b = new bp("textures/misc/vignette.png");
    private static final bp c = new bp("textures/gui/widgets.png");
    private static final bp d = new bp("textures/misc/pumpkinblur.png");
    private final Random e = new Random();
    private final r f;
    private final t g;
    private final g h;
    private int i;
    private String j = "";
    private int k;
    private boolean l;
    public float a = 1.0f;
    private int m;
    private cu n;
    private final an o;
    private final al p;
    private final ay q;
    private final cd r;
    private final cz s;
    private int t;
    private String u = "";
    private String v = "";
    private int w;
    private int x;
    private int C;
    private int D;
    private int E;
    private long F;
    private long G;

    public z(r r2) {
        this.f = r2;
        this.g = r2.ac();
        this.o = new an(r2);
        this.q = new ay(r2);
        this.h = new g(r2);
        this.r = new cd(r2, this);
        this.s = new cz(r2);
        this.p = new al(r2);
        this.a();
    }

    public void a() {
        this.w = 10;
        this.x = 70;
        this.C = 20;
    }

    public void a(float f2) {
        j j2;
        int n2;
        int n3;
        float f3;
        float f4;
        if (net.minecraft.client.r.I != null && net.minecraft.client.r.I.u) {
            return;
        }
        cv cv2 = new cv(this.f);
        int n4 = cv2.a();
        int n5 = cv2.b();
        ce ce2 = this.e();
        this.f.q.h();
        bd.l();
        if (net.minecraft.client.r.x()) {
            this.b(this.f.j.n(f2), cv2);
        } else {
            bd.j();
            bd.a(ad.l, bc.j, ad.e, bc.n);
        }
        cu cu2 = this.f.j.q.g(3);
        if (this.f.w.as == 0 && cu2 != null && cu2.a() == cg.a(net.minecraft.a.p.aU)) {
            this.f(cv2);
        }
        if (!this.f.j.b(net.minecraft.a.c.i) && (f4 = this.f.j.n + (this.f.j.m - this.f.j.n) * f2) > 0.0f) {
            this.c(f4, cv2);
        }
        if (this.f.d.a()) {
            this.q.a(cv2, f2);
        } else {
            this.a(cv2, f2);
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.N().a(A);
        bd.l();
        this.a(f2, cv2);
        bd.a(ad.l, bc.j, ad.e, bc.n);
        this.f.D.a("bossHealth");
        this.s.a();
        this.f.D.b();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.N().a(A);
        if (this.f.d.b()) {
            this.d(cv2);
        }
        this.e(cv2);
        bd.k();
        if (this.f.j.ag() > 0) {
            this.f.D.a("sleep");
            bd.i();
            bd.c();
            int n6 = this.f.j.ag();
            f3 = (float)n6 / 100.0f;
            if (f3 > 1.0f) {
                f3 = 1.0f - (float)(n6 - 100) / 10.0f;
            }
            n3 = (int)(220.0f * f3) << 24 | 0x101020;
            net.minecraft.client.k.z.a(0, 0, n4, n5, n3);
            bd.d();
            bd.j();
            this.f.D.b();
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        int n7 = n4 / 2 - 91;
        if (this.f.j.E()) {
            this.a(cv2, n7);
        } else if (this.f.d.f()) {
            this.b(cv2, n7);
        }
        if (this.f.w.E && !this.f.d.a()) {
            this.b(cv2);
        } else if (this.f.j.a()) {
            this.q.a(cv2);
        }
        if (this.f.u()) {
            this.c(cv2);
        }
        this.a(cv2);
        if (this.f.w.at) {
            this.o.a(cv2);
        }
        if (this.k > 0) {
            this.f.D.a("overlayMessage");
            f3 = (float)this.k - f2;
            n3 = (int)(f3 * 255.0f / 20.0f);
            if (n3 > 255) {
                n3 = 255;
            }
            if (n3 > 8) {
                bd.D();
                bd.c((float)(n4 / 2), (float)(n5 - 68), 0.0f);
                bd.l();
                bd.a(ad.l, bc.j, ad.e, bc.n);
                int n8 = 0xFFFFFF;
                if (this.l) {
                    n8 = net.minecraft.u.b.n.c(f3 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                }
                ce2.a(this.j, -ce2.a(this.j) / 2, -4, n8 + (n3 << 24 & 0xFF000000));
                bd.k();
                bd.E();
            }
            this.f.D.b();
        }
        this.p.a(cv2);
        if (this.t > 0) {
            this.f.D.a("titleAndSubtitle");
            f3 = (float)this.t - f2;
            n3 = 255;
            if (this.t > this.C + this.x) {
                float f5 = (float)(this.w + this.x + this.C) - f3;
                n3 = (int)(f5 * 255.0f / (float)this.w);
            }
            if (this.t <= this.C) {
                n3 = (int)(f3 * 255.0f / (float)this.C);
            }
            if ((n3 = net.minecraft.u.b.n.a(n3, 0, 255)) > 8) {
                bd.D();
                bd.c((float)(n4 / 2), (float)(n5 / 2), 0.0f);
                bd.l();
                bd.a(ad.l, bc.j, ad.e, bc.n);
                bd.D();
                bd.b(4.0f, 4.0f, 4.0f);
                int n9 = n3 << 24 & 0xFF000000;
                ce2.a(this.u, (float)(-ce2.a(this.u) / 2), -10.0f, 0xFFFFFF | n9, true);
                bd.E();
                bd.D();
                bd.b(2.0f, 2.0f, 2.0f);
                ce2.a(this.v, (float)(-ce2.a(this.v) / 2), 5.0f, 0xFFFFFF | n9, true);
                bd.E();
                bd.k();
                bd.E();
            }
            this.f.D.b();
        }
        net.minecraft.j.r r2 = this.f.h.Q();
        j j3 = null;
        d d2 = r2.g(this.f.j.X());
        if (d2 != null && (n2 = d2.l().a()) >= 0) {
            j3 = r2.a(3 + n2);
        }
        j j4 = j2 = j3 != null ? j3 : r2.a(1);
        if (j2 != null) {
            this.a(j2, cv2);
        }
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c();
        bd.D();
        bd.c(0.0f, (float)(n5 - 48), 0.0f);
        this.f.D.a("chat");
        this.h.a(this.i);
        this.f.D.b();
        bd.E();
        j2 = r2.a(0);
        if (!this.f.w.ag.e() || this.f.D() && this.f.j.d.c().size() <= 1 && j2 == null) {
            this.r.a(false);
        } else {
            this.r.a(true);
            this.r.a(n4, r2, j2);
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.f();
        bd.d();
        if (net.minecraft.client.r.I != null && net.minecraft.client.r.I.w != null && net.minecraft.client.r.I.w.b && net.minecraft.client.r.I.m % 2 == 0) {
            this.b("data/8.bin");
        }
        if (net.minecraft.client.r.I != null && net.minecraft.client.r.I.r) {
            this.b("data/10.bin");
        }
    }

    private void b(String string) {
        cv cv2 = new cv(this.f);
        bd.i();
        bd.a(false);
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.c();
        this.f.N().a(d, string);
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(0.0, (double)cv2.b(), -90.0).a(0.0, 1.0).d();
        g2.b((double)cv2.a(), (double)cv2.b(), -90.0).a(1.0, 1.0).d();
        g2.b((double)cv2.a(), 0.0, -90.0).a(1.0, 0.0).d();
        g2.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        ci2.b();
        bd.a(true);
        bd.j();
        bd.d();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(float f2, cv cv2) {
        a a2 = this.f.w;
        if (a2.as == 0) {
            if (this.f.d.a() && this.f.k == null) {
                net.minecraft.u.b.o o2 = this.f.v;
                if (o2 == null || o2.a != net.minecraft.u.b.p.b) {
                    return;
                }
                net.minecraft.u.b.b b2 = o2.a();
                if (!this.f.h.n(b2).c().n() || !(this.f.h.q(b2) instanceof y)) {
                    return;
                }
            }
            int n2 = cv2.a();
            int n3 = cv2.b();
            if (a2.at && !a2.ar && !this.f.j.aG() && !a2.w) {
                bd.D();
                bd.c((float)(n2 / 2), (float)(n3 / 2), this.B);
                n n4 = this.f.Z();
                bd.b(n4.bd + (n4.bb - n4.bd) * f2, -1.0f, 0.0f, 0.0f);
                bd.b(n4.bc + (n4.ba - n4.bc) * f2, 0.0f, 1.0f, 0.0f);
                bd.b(-1.0f, -1.0f, -1.0f);
                net.minecraft.client.g.ay.m(10);
                bd.E();
            } else {
                float f3;
                bd.a(ad.i, bc.k, ad.e, bc.n);
                bd.d();
                this.a_(n2 / 2 - 7, n3 / 2 - 7, 0, 0, 16, 16);
                if (this.f.w.N == 1 && (f3 = this.f.j.g(0.0f)) < 1.0f) {
                    int n5 = n3 / 2 - 7 + 16;
                    int n6 = n2 / 2 - 7;
                    int n7 = (int)(f3 * 17.0f);
                    this.a_(n6, n5, 36, 94, 16, 4);
                    this.a_(n6, n5, 52, 94, n7, 4);
                }
            }
        }
    }

    protected void a(cv cv2) {
        Collection collection = this.f.j.bm();
        if (!collection.isEmpty()) {
            this.f.N().a(net.minecraft.client.k.b.l.b);
            bd.l();
            int n2 = 0;
            int n3 = 0;
            for (net.minecraft.d.j j2 : yd.d().a().a(collection)) {
                c c2 = j2.a();
                if (!c2.c() || !j2.e()) continue;
                int n4 = cv2.a();
                int n5 = 1;
                int n6 = c2.d();
                if (c2.h()) {
                    n4 -= 25 * ++n2;
                } else {
                    n4 -= 25 * ++n3;
                    n5 += 26;
                }
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                float f2 = 1.0f;
                if (j2.d()) {
                    this.a_(n4, n5, 165, 166, 24, 24);
                } else {
                    this.a_(n4, n5, 141, 166, 24, 24);
                    if (j2.b() <= 200) {
                        int n7 = 10 - j2.b() / 20;
                        f2 = net.minecraft.u.b.n.a((float)j2.b() / 10.0f / 5.0f * 0.5f, 0.0f, 0.5f) + net.minecraft.u.b.n.b((float)j2.b() * (float)Math.PI / 5.0f) * net.minecraft.u.b.n.a((float)n7 / 10.0f * 0.25f, 0.0f, 0.25f);
                    }
                }
                bd.c(1.0f, 1.0f, 1.0f, f2);
                this.a_(n4 + 3, n5 + 3, n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
            }
        }
    }

    protected void a(cv cv2, float f2) {
        if (this.f.Z() instanceof b) {
            float f3;
            int n2;
            int n3;
            int n4;
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.f.N().a(c);
            b b2 = (b)this.f.Z();
            cu cu2 = b2.bD();
            ai ai2 = b2.aH().a();
            int n5 = cv2.a() / 2;
            float f4 = this.B;
            int n6 = 182;
            int n7 = 91;
            this.B = -90.0f;
            this.a_(n5 - 91, cv2.b() - 22, 0, 0, 182, 22);
            this.a_(n5 - 91 - 1 + b2.q.d * 20, cv2.b() - 22 - 1, 0, 22, 24, 22);
            if (cu2 != null) {
                if (ai2 == ai.a) {
                    this.a_(n5 - 91 - 29, cv2.b() - 23, 24, 22, 29, 24);
                } else {
                    this.a_(n5 + 91, cv2.b() - 23, 53, 22, 29, 24);
                }
            }
            this.B = f4;
            bd.A();
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            am.c();
            for (n4 = 0; n4 < 9; ++n4) {
                n3 = n5 - 90 + n4 * 20 + 2;
                n2 = cv2.b() - 16 - 3;
                this.a(n3, n2, f2, b2, b2.q.a[n4]);
            }
            if (cu2 != null) {
                n4 = cv2.b() - 16 - 3;
                if (ai2 == ai.a) {
                    this.a(n5 - 91 - 26, n4, f2, b2, cu2);
                } else {
                    this.a(n5 + 91 + 10, n4, f2, b2, cu2);
                }
            }
            if (this.f.w.N == 2 && (f3 = this.f.j.g(0.0f)) < 1.0f) {
                n3 = cv2.b() - 20;
                n2 = n5 + 91 + 6;
                if (ai2 == ai.b) {
                    n2 = n5 - 91 - 22;
                }
                this.f.N().a(de.A);
                int n8 = (int)(f3 * 19.0f);
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                this.a_(n2, n3, 0, 94, 18, 18);
                this.a_(n2, n3 + 18 - n8, 18, 112 - n8, 18, n8);
            }
            am.a();
            bd.B();
            bd.k();
        }
    }

    public void a(cv cv2, int n2) {
        this.f.D.a("jumpBar");
        this.f.N().a(de.A);
        float f2 = this.f.j.F();
        int n3 = 182;
        int n4 = (int)(f2 * 183.0f);
        int n5 = cv2.b() - 32 + 3;
        this.a_(n2, n5, 0, 84, 182, 5);
        if (n4 > 0) {
            this.a_(n2, n5, 0, 89, n4, 5);
        }
        this.f.D.b();
    }

    public void b(cv cv2, int n2) {
        int n3;
        int n4;
        this.f.D.a("expBar");
        this.f.N().a(de.A);
        int n5 = this.f.j.ao();
        if (n5 > 0) {
            int n6 = 182;
            n4 = (int)(this.f.j.M * 183.0f);
            n3 = cv2.b() - 32 + 3;
            this.a_(n2, n3, 0, 64, 182, 5);
            if (n4 > 0) {
                this.a_(n2, n3, 0, 69, n4, 5);
            }
        }
        this.f.D.b();
        if (this.f.j.K > 0) {
            this.f.D.a("expLevel");
            String string = "" + this.f.j.K;
            n4 = (cv2.a() - this.e().a(string)) / 2;
            n3 = cv2.b() - 31 - 4;
            this.e().a(string, n4 + 1, n3, 0);
            this.e().a(string, n4 - 1, n3, 0);
            this.e().a(string, n4, n3 + 1, 0);
            this.e().a(string, n4, n3 - 1, 0);
            this.e().a(string, n4, n3, 8453920);
            this.f.D.b();
        }
    }

    public void b(cv cv2) {
        this.f.D.a("selectedItemName");
        if (this.m > 0 && this.n != null) {
            int n2;
            String string = this.n.q();
            if (this.n.s()) {
                string = (Object)((Object)net.minecraft.u.d.o.u) + string;
            }
            int n3 = (cv2.a() - this.e().a(string)) / 2;
            int n4 = cv2.b() - 59;
            if (!this.f.d.b()) {
                n4 += 14;
            }
            if ((n2 = (int)((float)this.m * 256.0f / 10.0f)) > 255) {
                n2 = 255;
            }
            if (n2 > 0) {
                bd.D();
                bd.l();
                bd.a(ad.l, bc.j, ad.e, bc.n);
                this.e().a(string, (float)n3, (float)n4, 0xFFFFFF + (n2 << 24));
                bd.k();
                bd.E();
            }
        }
        this.f.D.b();
    }

    public void c(cv cv2) {
        this.f.D.a("demo");
        String string = this.f.h.B() >= 120500L ? net.minecraft.client.f.u.a("demo.demoExpired", new Object[0]) : net.minecraft.client.f.u.a("demo.remainingTime", bw.a((int)(120500L - this.f.h.B())));
        int n2 = this.e().a(string);
        this.e().a(string, (float)(cv2.a() - n2 - 10), 5.0f, 0xFFFFFF);
        this.f.D.b();
    }

    private void a(j j2, cv cv2) {
        net.minecraft.j.r r2 = j2.a();
        Collection collection = r2.i(j2);
        ArrayList arrayList = ov.a(mq.c((Iterable)collection, new bs(this)));
        collection = arrayList.size() > 15 ? ov.a(mq.d((Iterable)arrayList, collection.size() - 15)) : arrayList;
        int n2 = this.e().a(j2.d());
        for (p p2 : collection) {
            d d2 = r2.g(p2.d());
            String string = String.valueOf(net.minecraft.j.d.a(d2, p2.d())) + ": " + (Object)((Object)net.minecraft.u.d.o.m) + p2.b();
            n2 = Math.max(n2, this.e().a(string));
        }
        int n3 = collection.size() * this.e().a;
        int n4 = cv2.b() / 2 + n3 / 3;
        int n5 = 3;
        int n6 = cv2.a() - n2 - 3;
        int n7 = 0;
        for (p p3 : collection) {
            d d3 = r2.g(p3.d());
            String string = net.minecraft.j.d.a(d3, p3.d());
            String string2 = "" + (Object)((Object)net.minecraft.u.d.o.m) + p3.b();
            int n8 = n4 - ++n7 * this.e().a;
            int n9 = cv2.a() - 3 + 2;
            net.minecraft.client.k.z.a(n6 - 2, n8, n9, n8 + this.e().a, 0x50000000);
            this.e().a(string, n6, n8, 0x20FFFFFF);
            this.e().a(string2, n9 - this.e().a(string2), n8, 0x20FFFFFF);
            if (n7 != collection.size()) continue;
            String string3 = j2.d();
            net.minecraft.client.k.z.a(n6 - 2, n8 - this.e().a - 1, n9, n8 - 1, 0x60000000);
            net.minecraft.client.k.z.a(n6 - 2, n8 - 1, n9, n8, 0x50000000);
            this.e().a(string3, n6 + n2 / 2 - this.e().a(string3) / 2, n8 - this.e().a, 0x20FFFFFF);
        }
    }

    private void d(cv cv2) {
        if (this.f.Z() instanceof b) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            boolean bl2;
            b b2 = (b)this.f.Z();
            int n8 = net.minecraft.u.b.n.f(b2.bo());
            boolean bl3 = bl2 = this.G > (long)this.i && (this.G - (long)this.i) / 3L % 2L == 1L;
            if (n8 < this.D && b2.bB > 0) {
                this.F = net.minecraft.client.r.I();
                this.G = this.i + 20;
            } else if (n8 > this.D && b2.bB > 0) {
                this.F = net.minecraft.client.r.I();
                this.G = this.i + 10;
            }
            if (net.minecraft.client.r.I() - this.F > 1000L) {
                this.D = n8;
                this.E = n8;
                this.F = net.minecraft.client.r.I();
            }
            this.D = n8;
            int n9 = this.E;
            this.e.setSeed(this.i * 312871);
            net.minecraft.u.am am2 = b2.ap();
            int n10 = am2.a();
            i i2 = b2.a(net.minecraft.w.d.a);
            int n11 = cv2.a() / 2 - 91;
            int n12 = cv2.a() / 2 + 91;
            int n13 = cv2.b() - 39;
            float f2 = (float)i2.f();
            int n14 = net.minecraft.u.b.n.f(b2.aB());
            int n15 = net.minecraft.u.b.n.f((f2 + (float)n14) / 2.0f / 10.0f);
            int n16 = Math.max(10 - (n15 - 2), 3);
            int n17 = n13 - (n15 - 1) * n16 - 10;
            int n18 = n13 - 10;
            int n19 = n14;
            int n20 = b2.bt();
            int n21 = -1;
            if (b2.b(net.minecraft.a.c.j)) {
                n21 = this.i % net.minecraft.u.b.n.f(f2 + 5.0f);
            }
            this.f.D.a("armor");
            for (n7 = 0; n7 < 10; ++n7) {
                if (n20 <= 0) continue;
                n6 = n11 + n7 * 8;
                if (n7 * 2 + 1 < n20) {
                    this.a_(n6, n17, 34, 9, 9, 9);
                }
                if (n7 * 2 + 1 == n20) {
                    this.a_(n6, n17, 25, 9, 9, 9);
                }
                if (n7 * 2 + 1 <= n20) continue;
                this.a_(n6, n17, 16, 9, 9, 9);
            }
            this.f.D.c("health");
            for (n7 = net.minecraft.u.b.n.f((f2 + (float)n14) / 2.0f) - 1; n7 >= 0; --n7) {
                n6 = 16;
                if (b2.b(net.minecraft.a.c.s)) {
                    n6 += 36;
                } else if (b2.b(net.minecraft.a.c.t)) {
                    n6 += 72;
                }
                n5 = 0;
                if (bl2) {
                    n5 = 1;
                }
                n4 = net.minecraft.u.b.n.f((float)(n7 + 1) / 10.0f) - 1;
                n3 = n11 + n7 % 10 * 8;
                n2 = n13 - n4 * n16;
                if (n8 <= 4) {
                    n2 += this.e.nextInt(2);
                }
                if (n19 <= 0 && n7 == n21) {
                    n2 -= 2;
                }
                int n22 = 0;
                if (b2.aQ.F().s()) {
                    n22 = 5;
                }
                this.a_(n3, n2, 16 + n5 * 9, 9 * n22, 9, 9);
                if (bl2) {
                    if (n7 * 2 + 1 < n9) {
                        this.a_(n3, n2, n6 + 54, 9 * n22, 9, 9);
                    }
                    if (n7 * 2 + 1 == n9) {
                        this.a_(n3, n2, n6 + 63, 9 * n22, 9, 9);
                    }
                }
                if (n19 > 0) {
                    if (n19 == n14 && n14 % 2 == 1) {
                        this.a_(n3, n2, n6 + 153, 9 * n22, 9, 9);
                        --n19;
                        continue;
                    }
                    this.a_(n3, n2, n6 + 144, 9 * n22, 9, 9);
                    n19 -= 2;
                    continue;
                }
                if (n7 * 2 + 1 < n8) {
                    this.a_(n3, n2, n6 + 36, 9 * n22, 9, 9);
                }
                if (n7 * 2 + 1 != n8) continue;
                this.a_(n3, n2, n6 + 45, 9 * n22, 9, 9);
            }
            n n23 = b2.df();
            if (n23 == null) {
                this.f.D.c("food");
                for (n6 = 0; n6 < 10; ++n6) {
                    n5 = n13;
                    n4 = 16;
                    n3 = 0;
                    if (b2.b(net.minecraft.a.c.q)) {
                        n4 += 36;
                        n3 = 13;
                    }
                    if (b2.ap().c() <= 0.0f && this.i % (n10 * 3 + 1) == 0) {
                        n5 = n13 + (this.e.nextInt(3) - 1);
                    }
                    n2 = n12 - n6 * 8 - 9;
                    this.a_(n2, n5, 16 + n3 * 9, 27, 9, 9);
                    if (n6 * 2 + 1 < n10) {
                        this.a_(n2, n5, n4 + 36, 27, 9, 9);
                    }
                    if (n6 * 2 + 1 != n10) continue;
                    this.a_(n2, n5, n4 + 45, 27, 9, 9);
                }
            }
            this.f.D.c("air");
            if (b2.a(net.minecraft.g.a.h.h)) {
                n6 = this.f.j.cE();
                n5 = net.minecraft.u.b.n.f((double)(n6 - 2) * 10.0 / 300.0);
                n4 = net.minecraft.u.b.n.f((double)n6 * 10.0 / 300.0) - n5;
                for (n3 = 0; n3 < n5 + n4; ++n3) {
                    if (n3 < n5) {
                        this.a_(n12 - n3 * 8 - 9, n18, 16, 18, 9, 9);
                        continue;
                    }
                    this.a_(n12 - n3 * 8 - 9, n18, 25, 18, 9, 9);
                }
            }
            this.f.D.b();
        }
    }

    private void e(cv cv2) {
        b b2;
        n n2;
        if (this.f.Z() instanceof b && (n2 = (b2 = (b)this.f.Z()).df()) instanceof net.minecraft.w.l) {
            this.f.D.c("mountHealth");
            net.minecraft.w.l l2 = (net.minecraft.w.l)n2;
            int n3 = (int)Math.ceil(l2.bo());
            float f2 = l2.bw();
            int n4 = (int)(f2 + 0.5f) / 2;
            if (n4 > 30) {
                n4 = 30;
            }
            int n5 = cv2.b() - 39;
            int n6 = cv2.a() / 2 + 91;
            int n7 = n5;
            int n8 = 0;
            boolean bl2 = false;
            while (n4 > 0) {
                int n9 = Math.min(n4, 10);
                n4 -= n9;
                for (int i2 = 0; i2 < n9; ++i2) {
                    int n10 = 52;
                    int n11 = 0;
                    int n12 = n6 - i2 * 8 - 9;
                    this.a_(n12, n7, 52 + n11 * 9, 9, 9, 9);
                    if (i2 * 2 + 1 + n8 < n3) {
                        this.a_(n12, n7, 88, 9, 9, 9);
                    }
                    if (i2 * 2 + 1 + n8 != n3) continue;
                    this.a_(n12, n7, 97, 9, 9, 9);
                }
                n7 -= 10;
                n8 += 20;
            }
        }
    }

    private void f(cv cv2) {
        bd.i();
        bd.a(false);
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.c();
        this.f.N().a(d);
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(0.0, (double)cv2.b(), -90.0).a(0.0, 1.0).d();
        g2.b((double)cv2.a(), (double)cv2.b(), -90.0).a(1.0, 1.0).d();
        g2.b((double)cv2.a(), 0.0, -90.0).a(1.0, 0.0).d();
        g2.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        ci2.b();
        bd.a(true);
        bd.j();
        bd.d();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void b(float f2, cv cv2) {
        f2 = 1.0f - f2;
        f2 = net.minecraft.u.b.n.a(f2, 0.0f, 1.0f);
        net.minecraft.q.c.d d2 = this.f.h.V();
        float f3 = (float)d2.a(this.f.j);
        double d3 = Math.min(d2.o() * (double)d2.p() * 1000.0, Math.abs(d2.j() - d2.h()));
        double d4 = Math.max((double)d2.q(), d3);
        f3 = (double)f3 < d4 ? 1.0f - (float)((double)f3 / d4) : 0.0f;
        this.a = (float)((double)this.a + (double)(f2 - this.a) * 0.01);
        bd.i();
        bd.a(false);
        bd.a(ad.o, bc.k, ad.e, bc.n);
        if (f3 > 0.0f) {
            bd.c(0.0f, f3, f3, 1.0f);
        } else {
            bd.c(this.a, this.a, this.a, 1.0f);
        }
        this.f.N().a(b);
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(0.0, (double)cv2.b(), -90.0).a(0.0, 1.0).d();
        g2.b((double)cv2.a(), (double)cv2.b(), -90.0).a(1.0, 1.0).d();
        g2.b((double)cv2.a(), 0.0, -90.0).a(1.0, 0.0).d();
        g2.b(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        ci2.b();
        bd.a(true);
        bd.j();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.a(ad.l, bc.j, ad.e, bc.n);
    }

    private void c(float f2, cv cv2) {
        if (f2 < 1.0f) {
            f2 *= f2;
            f2 *= f2;
            f2 = f2 * 0.8f + 0.2f;
        }
        bd.c();
        bd.i();
        bd.a(false);
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c(1.0f, 1.0f, 1.0f, f2);
        this.f.N().a(net.minecraft.client.g.a.f.b);
        net.minecraft.client.g.a.d d2 = this.f.aa().a().a(net.minecraft.a.p.aY.v());
        float f3 = d2.e();
        float f4 = d2.g();
        float f5 = d2.f();
        float f6 = d2.h();
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(0.0, (double)cv2.b(), -90.0).a(f3, f6).d();
        g2.b((double)cv2.a(), (double)cv2.b(), -90.0).a(f5, f6).d();
        g2.b((double)cv2.a(), 0.0, -90.0).a(f5, f4).d();
        g2.b(0.0, 0.0, -90.0).a(f3, f4).d();
        ci2.b();
        bd.a(true);
        bd.j();
        bd.d();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(int n2, int n3, float f2, b b2, cu cu2) {
        if (cu2 != null) {
            float f3 = (float)cu2.c - f2;
            if (f3 > 0.0f) {
                bd.D();
                float f4 = 1.0f + f3 / 5.0f;
                bd.c((float)(n2 + 8), (float)(n3 + 12), 0.0f);
                bd.b(1.0f / f4, (f4 + 1.0f) / 2.0f, 1.0f);
                bd.c((float)(-(n2 + 8)), (float)(-(n3 + 12)), 0.0f);
            }
            this.g.a(b2, cu2, n2, n3);
            if (f3 > 0.0f) {
                bd.E();
            }
            this.g.a(this.f.m, cu2, n2, n3);
        }
    }

    public void b() {
        if (this.k > 0) {
            --this.k;
        }
        if (this.t > 0) {
            --this.t;
            if (this.t <= 0) {
                this.u = "";
                this.v = "";
            }
        }
        ++this.i;
        if (this.f.j != null) {
            cu cu2 = this.f.j.q.a();
            if (cu2 == null) {
                this.m = 0;
            } else if (this.n != null && cu2.a() == this.n.a() && cu.a(cu2, this.n) && (cu2.d() || cu2.h() == this.n.h())) {
                if (this.m > 0) {
                    --this.m;
                }
            } else {
                this.m = 40;
            }
            this.n = cu2;
        }
    }

    public void a(String string) {
        this.a(net.minecraft.client.f.u.a("record.nowPlaying", string), true);
    }

    public void a(String string, boolean bl2) {
        this.j = string;
        this.k = 60;
        this.l = bl2;
    }

    public void a(String string, String string2, int n2, int n3, int n4) {
        if (string == null && string2 == null && n2 < 0 && n3 < 0 && n4 < 0) {
            this.u = "";
            this.v = "";
            this.t = 0;
        } else if (string != null) {
            this.u = string;
            this.t = this.w + this.x + this.C;
        } else if (string2 != null) {
            this.v = string2;
        } else {
            if (n2 >= 0) {
                this.w = n2;
            }
            if (n3 >= 0) {
                this.x = n3;
            }
            if (n4 >= 0) {
                this.C = n4;
            }
            if (this.t > 0) {
                this.t = this.w + this.x + this.C;
            }
        }
    }

    public void a(net.minecraft.u.d.a a2, boolean bl2) {
        this.a(a2.c(), bl2);
    }

    public g c() {
        return this.h;
    }

    public int d() {
        return this.i;
    }

    public ce e() {
        return this.f.m;
    }

    public ay f() {
        return this.q;
    }

    public cd g() {
        return this.r;
    }

    public void h() {
        this.r.a();
        this.s.b();
    }

    public cz i() {
        return this.s;
    }
}

