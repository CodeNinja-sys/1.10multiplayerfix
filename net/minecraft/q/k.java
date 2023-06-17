/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

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
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.j.r;
import net.minecraft.m.cu;
import net.minecraft.p.b;
import net.minecraft.q.a.a.c;
import net.minecraft.q.a.d;
import net.minecraft.q.a.h;
import net.minecraft.q.a.u;
import net.minecraft.q.ab;
import net.minecraft.q.ag;
import net.minecraft.q.aj;
import net.minecraft.q.au;
import net.minecraft.q.av;
import net.minecraft.q.b.i;
import net.minecraft.q.b.q;
import net.minecraft.q.e;
import net.minecraft.q.f.a;
import net.minecraft.q.f.f;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.j;
import net.minecraft.q.l;
import net.minecraft.q.n;
import net.minecraft.q.o;
import net.minecraft.q.t;
import net.minecraft.q.y;
import net.minecraft.q.z;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.u.ax;
import net.minecraft.u.b.s;
import net.minecraft.u.bo;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.g;

public abstract class k
implements n {
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
    protected final ax i = new ax();
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
    public final e q;
    protected net.minecraft.i.c r = new net.minecraft.i.c();
    protected List s = ov.a(this.r);
    protected f t;
    protected final u u;
    protected d v;
    protected boolean w;
    protected h x;
    protected net.minecraft.b.e y;
    protected c z;
    public final b A;
    private final Calendar L = Calendar.getInstance();
    protected r B = new r();
    public final boolean C;
    protected boolean D = true;
    protected boolean E = true;
    private boolean M;
    private final net.minecraft.q.c.d N;
    int[] F = new int[32768];

    protected k(u u2, d d2, e e2, b b2, boolean bl2) {
        this.u = u2;
        this.A = b2;
        this.v = d2;
        this.q = e2;
        this.C = bl2;
        this.N = e2.p();
    }

    public k j() {
        return this;
    }

    @Override
    public q a(net.minecraft.u.b.b b2) {
        if (this.d(b2)) {
            net.minecraft.q.f.k k2 = this.e(b2);
            try {
                return k2.a(b2, this.q.l());
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Getting biome");
                net.minecraft.k.i i2 = a2.a("Coordinates of biome request");
                i2.a("Location", new av(this, b2));
                throw new bo(a2);
            }
        }
        return this.q.l().a(b2, net.minecraft.a.i.c);
    }

    public i k() {
        return this.q.l();
    }

    protected abstract f b();

    public void a(aj aj2) {
        this.v.f(true);
    }

    public net.minecraft.c.a l() {
        return null;
    }

    public void m() {
        this.z(new net.minecraft.u.b.b(8, 64, 8));
    }

    public net.minecraft.g.c.b b(net.minecraft.u.b.b b2) {
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(b2.cy_(), this.x(), b2.l());
        while (!this.c(b3.b())) {
            b3 = b3.b();
        }
        return this.n(b3);
    }

    private boolean D(net.minecraft.u.b.b b2) {
        return !this.E(b2) && b2.cy_() >= -30000000 && b2.l() >= -30000000 && b2.cy_() < 30000000 && b2.l() < 30000000;
    }

    private boolean E(net.minecraft.u.b.b b2) {
        return b2.k() < 0 || b2.k() >= 256;
    }

    @Override
    public boolean c(net.minecraft.u.b.b b2) {
        return this.n(b2).d() == net.minecraft.g.a.h.a;
    }

    public boolean d(net.minecraft.u.b.b b2) {
        return this.a(b2, true);
    }

    public boolean a(net.minecraft.u.b.b b2, boolean bl2) {
        return this.a(b2.cy_() >> 4, b2.l() >> 4, bl2);
    }

    public boolean a(net.minecraft.u.b.b b2, int n2) {
        return this.a(b2, n2, true);
    }

    public boolean a(net.minecraft.u.b.b b2, int n2, boolean bl2) {
        return this.a(b2.cy_() - n2, b2.k() - n2, b2.l() - n2, b2.cy_() + n2, b2.k() + n2, b2.l() + n2, bl2);
    }

    public boolean a(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        return this.a(b2, b3, true);
    }

    public boolean a(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3, boolean bl2) {
        return this.a(b2.cy_(), b2.k(), b2.l(), b3.cy_(), b3.k(), b3.l(), bl2);
    }

    public boolean a(dc dc2) {
        return this.a(dc2, true);
    }

    public boolean a(dc dc2, boolean bl2) {
        return this.a(dc2.a, dc2.b, dc2.c, dc2.d, dc2.e, dc2.f, bl2);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        if (n6 >= 0 && n3 < 256) {
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
        return false;
    }

    protected abstract boolean a(int var1, int var2, boolean var3);

    public net.minecraft.q.f.k e(net.minecraft.u.b.b b2) {
        return this.a(b2.cy_() >> 4, b2.l() >> 4);
    }

    public net.minecraft.q.f.k a(int n2, int n3) {
        return this.t.d(n2, n3);
    }

    public boolean a(net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, int n2) {
        if (this.E(b2)) {
            return false;
        }
        if (!this.C && this.v.t() == ab.g) {
            return false;
        }
        net.minecraft.q.f.k k2 = this.e(b2);
        cn cn2 = b3.c();
        net.minecraft.g.c.b b4 = k2.a(b2, b3);
        if (b4 == null) {
            return false;
        }
        if (b3.f() != b4.f() || b3.g() != b4.g()) {
            this.A.a("checkLight");
            this.v(b2);
            this.A.b();
        }
        if ((n2 & 2) != 0 && (!this.C || (n2 & 4) == 0) && k2.i()) {
            this.a(b2, b4, b3, n2);
        }
        if (!this.C && (n2 & 1) != 0) {
            this.a(b2, b4.c());
            if (b3.q()) {
                this.f(b2, cn2);
            }
        }
        return true;
    }

    public boolean f(net.minecraft.u.b.b b2) {
        return this.a(b2, net.minecraft.a.p.a.v(), 3);
    }

    public boolean b(net.minecraft.u.b.b b2, boolean bl2) {
        net.minecraft.g.c.b b3 = this.n(b2);
        cn cn2 = b3.c();
        if (b3.d() == net.minecraft.g.a.h.a) {
            return false;
        }
        this.b(2001, b2, cn.p(b3));
        if (bl2) {
            cn2.b(this, b2, b3, 0);
        }
        return this.a(b2, net.minecraft.a.p.a.v(), 3);
    }

    public boolean b(net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return this.a(b2, b3, 3);
    }

    public void a(net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.g.c.b b4, int n2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(this, b2, b3, b4, n2);
        }
    }

    public void a(net.minecraft.u.b.b b2, cn cn2) {
        if (this.v.t() != ab.g) {
            this.b(b2, cn2);
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
                this.c(au.a, new net.minecraft.u.b.b(n2, n6, n3));
            }
        }
        this.b(n2, n4, n3, n2, n5, n3);
    }

    public void b(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        this.b(b2.cy_(), b2.k(), b2.l(), b3.cy_(), b3.k(), b3.l());
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(n2, n3, n4, n5, n6, n7);
        }
    }

    public void b(net.minecraft.u.b.b b2, cn cn2) {
        this.c(b2.f(), cn2);
        this.c(b2.g(), cn2);
        this.c(b2.c(), cn2);
        this.c(b2.b(), cn2);
        this.c(b2.d(), cn2);
        this.c(b2.e(), cn2);
    }

    public void a(net.minecraft.u.b.b b2, cn cn2, ad ad2) {
        if (ad2 != ad.e) {
            this.c(b2.f(), cn2);
        }
        if (ad2 != ad.f) {
            this.c(b2.g(), cn2);
        }
        if (ad2 != ad.a) {
            this.c(b2.c(), cn2);
        }
        if (ad2 != ad.b) {
            this.c(b2.b(), cn2);
        }
        if (ad2 != ad.c) {
            this.c(b2.d(), cn2);
        }
        if (ad2 != ad.d) {
            this.c(b2.e(), cn2);
        }
    }

    public void c(net.minecraft.u.b.b b2, cn cn2) {
        if (!this.C) {
            net.minecraft.g.c.b b3 = this.n(b2);
            try {
                b3.a(this, b2, cn2);
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Exception while updating neighbours");
                net.minecraft.k.i i2 = a2.a("Block being updated");
                i2.a("Source block type", new net.minecraft.q.i(this, cn2));
                net.minecraft.k.i.a(i2, b2, b3);
                throw new bo(a2);
            }
        }
    }

    public boolean d(net.minecraft.u.b.b b2, cn cn2) {
        return false;
    }

    public boolean g(net.minecraft.u.b.b b2) {
        return this.e(b2).c(b2);
    }

    public boolean h(net.minecraft.u.b.b b2) {
        if (b2.k() >= this.x()) {
            return this.g(b2);
        }
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(b2.cy_(), this.x(), b2.l());
        if (!this.g(b3)) {
            return false;
        }
        b3 = b3.c();
        while (b3.k() > b2.k()) {
            net.minecraft.g.c.b b4 = this.n(b3);
            if (b4.f() > 0 && !b4.d().d()) {
                return false;
            }
            b3 = b3.c();
        }
        return true;
    }

    public int i(net.minecraft.u.b.b b2) {
        if (b2.k() < 0) {
            return 0;
        }
        if (b2.k() >= 256) {
            b2 = new net.minecraft.u.b.b(b2.cy_(), 255, b2.l());
        }
        return this.e(b2).a(b2, 0);
    }

    public int j(net.minecraft.u.b.b b2) {
        return this.c(b2, true);
    }

    public int c(net.minecraft.u.b.b b2, boolean bl2) {
        if (b2.cy_() >= -30000000 && b2.l() >= -30000000 && b2.cy_() < 30000000 && b2.l() < 30000000) {
            if (bl2 && this.n(b2).i()) {
                int n2 = this.c(b2.b(), false);
                int n3 = this.c(b2.g(), false);
                int n4 = this.c(b2.f(), false);
                int n5 = this.c(b2.e(), false);
                int n6 = this.c(b2.d(), false);
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
            if (b2.k() < 0) {
                return 0;
            }
            if (b2.k() >= 256) {
                b2 = new net.minecraft.u.b.b(b2.cy_(), 255, b2.l());
            }
            net.minecraft.q.f.k k2 = this.e(b2);
            return k2.a(b2, this.J);
        }
        return 15;
    }

    public net.minecraft.u.b.b k(net.minecraft.u.b.b b2) {
        return new net.minecraft.u.b.b(b2.cy_(), this.b(b2.cy_(), b2.l()), b2.l());
    }

    public int b(int n2, int n3) {
        int n4 = n2 >= -30000000 && n3 >= -30000000 && n2 < 30000000 && n3 < 30000000 ? (this.a(n2 >> 4, n3 >> 4, true) ? this.a(n2 >> 4, n3 >> 4).b(n2 & 0xF, n3 & 0xF) : 0) : this.x() + 1;
        return n4;
    }

    public int c(int n2, int n3) {
        if (n2 >= -30000000 && n3 >= -30000000 && n2 < 30000000 && n3 < 30000000) {
            if (!this.a(n2 >> 4, n3 >> 4, true)) {
                return 0;
            }
            net.minecraft.q.f.k k2 = this.a(n2 >> 4, n3 >> 4);
            return k2.w();
        }
        return this.x() + 1;
    }

    public int a(au au2, net.minecraft.u.b.b b2) {
        if (this.q.n() && au2 == au.a) {
            return 0;
        }
        if (b2.k() < 0) {
            b2 = new net.minecraft.u.b.b(b2.cy_(), 0, b2.l());
        }
        if (!this.D(b2)) {
            return au2.c;
        }
        if (!this.d(b2)) {
            return au2.c;
        }
        if (this.n(b2).i()) {
            int n2 = this.b(au2, b2.b());
            int n3 = this.b(au2, b2.g());
            int n4 = this.b(au2, b2.f());
            int n5 = this.b(au2, b2.e());
            int n6 = this.b(au2, b2.d());
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
        net.minecraft.q.f.k k2 = this.e(b2);
        return k2.a(au2, b2);
    }

    public int b(au au2, net.minecraft.u.b.b b2) {
        if (b2.k() < 0) {
            b2 = new net.minecraft.u.b.b(b2.cy_(), 0, b2.l());
        }
        if (!this.D(b2)) {
            return au2.c;
        }
        if (!this.d(b2)) {
            return au2.c;
        }
        net.minecraft.q.f.k k2 = this.e(b2);
        return k2.a(au2, b2);
    }

    public void a(au au2, net.minecraft.u.b.b b2, int n2) {
        if (this.D(b2) && this.d(b2)) {
            net.minecraft.q.f.k k2 = this.e(b2);
            k2.a(au2, b2, n2);
            this.l(b2);
        }
    }

    public void l(net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(b2);
        }
    }

    @Override
    public int b(net.minecraft.u.b.b b2, int n2) {
        int n3 = this.a(au.a, b2);
        int n4 = this.a(au.b, b2);
        if (n4 < n2) {
            n4 = n2;
        }
        return n3 << 20 | n4 << 4;
    }

    public float m(net.minecraft.u.b.b b2) {
        return this.q.o()[this.j(b2)];
    }

    @Override
    public net.minecraft.g.c.b n(net.minecraft.u.b.b b2) {
        if (this.E(b2)) {
            return net.minecraft.a.p.a.v();
        }
        net.minecraft.q.f.k k2 = this.e(b2);
        return k2.a(b2);
    }

    public boolean n() {
        return this.J < 4;
    }

    public net.minecraft.u.b.o a(s s2, s s3) {
        return this.a(s2, s3, false, false, false);
    }

    public net.minecraft.u.b.o a(s s2, s s3, boolean bl2) {
        return this.a(s2, s3, bl2, false, false);
    }

    public net.minecraft.u.b.o a(s s2, s s3, boolean bl2, boolean bl3, boolean bl4) {
        if (!(Double.isNaN(s2.b) || Double.isNaN(s2.c) || Double.isNaN(s2.d))) {
            if (!(Double.isNaN(s3.b) || Double.isNaN(s3.c) || Double.isNaN(s3.d))) {
                net.minecraft.u.b.o o2;
                int n2 = net.minecraft.u.b.n.c(s3.b);
                int n3 = net.minecraft.u.b.n.c(s3.c);
                int n4 = net.minecraft.u.b.n.c(s3.d);
                int n5 = net.minecraft.u.b.n.c(s2.b);
                int n6 = net.minecraft.u.b.n.c(s2.c);
                int n7 = net.minecraft.u.b.n.c(s2.d);
                net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n5, n6, n7);
                net.minecraft.g.c.b b3 = this.n(b2);
                cn cn2 = b3.c();
                if ((!bl3 || b3.d(this, b2) != cn.y) && cn2.a(b3, bl2) && (o2 = b3.a(this, b2, s2, s3)) != null) {
                    return o2;
                }
                o2 = null;
                int n8 = 200;
                while (n8-- >= 0) {
                    ad ad2;
                    if (Double.isNaN(s2.b) || Double.isNaN(s2.c) || Double.isNaN(s2.d)) {
                        return null;
                    }
                    if (n5 == n2 && n6 == n3 && n7 == n4) {
                        return bl4 ? o2 : null;
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
                    double d8 = s3.b - s2.b;
                    double d9 = s3.c - s2.c;
                    double d10 = s3.d - s2.d;
                    if (bl5) {
                        d5 = (d2 - s2.b) / d8;
                    }
                    if (bl6) {
                        d6 = (d3 - s2.c) / d9;
                    }
                    if (bl7) {
                        d7 = (d4 - s2.d) / d10;
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
                        ad2 = n2 > n5 ? ad.e : ad.f;
                        s2 = new s(d2, s2.c + d9 * d5, s2.d + d10 * d5);
                    } else if (d6 < d7) {
                        ad2 = n3 > n6 ? ad.a : ad.b;
                        s2 = new s(s2.b + d8 * d6, d3, s2.d + d10 * d6);
                    } else {
                        ad2 = n4 > n7 ? ad.c : ad.d;
                        s2 = new s(s2.b + d8 * d7, s2.c + d9 * d7, d4);
                    }
                    n5 = net.minecraft.u.b.n.c(s2.b) - (ad2 == ad.f ? 1 : 0);
                    n6 = net.minecraft.u.b.n.c(s2.c) - (ad2 == ad.b ? 1 : 0);
                    n7 = net.minecraft.u.b.n.c(s2.d) - (ad2 == ad.d ? 1 : 0);
                    b2 = new net.minecraft.u.b.b(n5, n6, n7);
                    net.minecraft.g.c.b b4 = this.n(b2);
                    cn cn3 = b4.c();
                    if (bl3 && b4.d() != net.minecraft.g.a.h.E && b4.d(this, b2) == cn.y) continue;
                    if (cn3.a(b4, bl2)) {
                        net.minecraft.u.b.o o3 = b4.a(this, b2, s2, s3);
                        if (o3 == null) continue;
                        return o3;
                    }
                    o2 = new net.minecraft.u.b.o(net.minecraft.u.b.p.a, s2, ad2, b2);
                }
                return bl4 ? o2 : null;
            }
            return null;
        }
        return null;
    }

    public void a(net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, bv bv2, bu bu2, float f2, float f3) {
        this.a(b2, (double)b3.cy_() + 0.5, (double)b3.k() + 0.5, (double)b3.l() + 0.5, bv2, bu2, f2, f3);
    }

    public void a(net.minecraft.w.a.b b2, double d2, double d3, double d4, bv bv2, bu bu2, float f2, float f3) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(b2, bv2, bu2, d2, d3, d4, f2, f3);
        }
    }

    public void a(double d2, double d3, double d4, bv bv2, bu bu2, float f2, float f3, boolean bl2) {
    }

    public void a(net.minecraft.u.b.b b2, bv bv2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(bv2, b2);
        }
    }

    public void a(net.minecraft.u.aj aj2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        this.a(aj2.c(), aj2.e(), d2, d3, d4, d5, d6, d7, arrn);
    }

    public void a(net.minecraft.u.aj aj2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        this.a(aj2.c(), aj2.e() | bl2, d2, d3, d4, d5, d6, d7, arrn);
    }

    private void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(n2, bl2, d2, d3, d4, d5, d6, d7, arrn);
        }
    }

    public boolean e(net.minecraft.w.n n2) {
        this.h.add(n2);
        return true;
    }

    public boolean a(net.minecraft.w.n n2) {
        int n3 = net.minecraft.u.b.n.c(n2.aU / 16.0);
        int n4 = net.minecraft.u.b.n.c(n2.aW / 16.0);
        boolean bl2 = n2.aP;
        if (n2 instanceof net.minecraft.w.a.b) {
            bl2 = true;
        }
        if (!bl2 && !this.a(n3, n4, false)) {
            return false;
        }
        if (n2 instanceof net.minecraft.w.a.b) {
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)n2;
            this.g.add(b2);
            this.H();
        }
        this.a(n3, n4).a(n2);
        this.c.add(n2);
        this.c(n2);
        return true;
    }

    protected void c(net.minecraft.w.n n2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(n2);
        }
    }

    protected void d(net.minecraft.w.n n2) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).b(n2);
        }
    }

    public void b(net.minecraft.w.n n2) {
        if (n2.cA()) {
            n2.ct();
        }
        if (n2.cz()) {
            n2.o();
        }
        n2.aa();
        if (n2 instanceof net.minecraft.w.a.b) {
            this.g.remove(n2);
            this.H();
            this.d(n2);
        }
    }

    public void f(net.minecraft.w.n n2) {
        n2.j(false);
        n2.aa();
        if (n2 instanceof net.minecraft.w.a.b) {
            this.g.remove(n2);
            this.H();
        }
        int n3 = n2.bH;
        int n4 = n2.bJ;
        if (n2.bG && this.a(n3, n4, true)) {
            this.a(n3, n4).b(n2);
        }
        this.c.remove(n2);
        this.d(n2);
    }

    public void a(ag ag2) {
        this.s.add(ag2);
    }

    public void b(ag ag2) {
        this.s.remove(ag2);
    }

    public List a(net.minecraft.w.n n2, net.minecraft.u.b.a a2) {
        int n3;
        ArrayList arrayList = ov.a();
        int n4 = net.minecraft.u.b.n.c(a2.a) - 1;
        int n5 = net.minecraft.u.b.n.f(a2.d) + 1;
        int n6 = net.minecraft.u.b.n.c(a2.b) - 1;
        int n7 = net.minecraft.u.b.n.f(a2.e) + 1;
        int n8 = net.minecraft.u.b.n.c(a2.c) - 1;
        int n9 = net.minecraft.u.b.n.f(a2.f) + 1;
        net.minecraft.q.c.d d2 = this.V();
        boolean bl2 = n2 != null && n2.cV();
        boolean bl3 = n2 != null && this.a(d2, n2);
        net.minecraft.g.c.b b2 = net.minecraft.a.p.b.v();
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (int i2 = n4; i2 < n5; ++i2) {
            for (n3 = n8; n3 < n9; ++n3) {
                int n10 = (i2 != n4 && i2 != n5 - 1 ? 0 : 1) + (n3 != n8 && n3 != n9 - 1 ? 0 : 1);
                if (n10 == 2 || !this.d(h2.d(i2, 64, n3))) continue;
                for (int i3 = n6; i3 < n7; ++i3) {
                    if (n10 > 0 && (i3 == n6 || i3 == n7 - 1)) continue;
                    h2.d(i2, i3, n3);
                    if (n2 != null) {
                        if (bl2 && bl3) {
                            n2.r(false);
                        } else if (!bl2 && !bl3) {
                            n2.r(true);
                        }
                    }
                    net.minecraft.g.c.b b3 = b2;
                    if (d2.a(h2) || !bl3) {
                        b3 = this.n(h2);
                    }
                    b3.a(this, h2, a2, arrayList, n2);
                }
            }
        }
        h2.n();
        if (n2 != null) {
            List list = this.b(n2, a2.b(0.25));
            for (n3 = 0; n3 < list.size(); ++n3) {
                net.minecraft.w.n n11 = (net.minecraft.w.n)list.get(n3);
                if (n2.B(n11)) continue;
                net.minecraft.u.b.a a3 = n11.cj();
                if (a3 != null && a3.b(a2)) {
                    arrayList.add(a3);
                }
                if ((a3 = n2.o(n11)) == null || !a3.b(a2)) continue;
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public boolean a(net.minecraft.q.c.d d2, net.minecraft.w.n n2) {
        double d3 = d2.d();
        double d4 = d2.e();
        double d5 = d2.f();
        double d6 = d2.g();
        if (n2.cV()) {
            d3 += 1.0;
            d4 += 1.0;
            d5 -= 1.0;
            d6 -= 1.0;
        } else {
            d3 -= 1.0;
            d4 -= 1.0;
            d5 += 1.0;
            d6 += 1.0;
        }
        return n2.aU > d3 && n2.aU < d5 && n2.aW > d4 && n2.aW < d6;
    }

    public List a(net.minecraft.u.b.a a2) {
        ArrayList arrayList = ov.a();
        int n2 = net.minecraft.u.b.n.c(a2.a) - 1;
        int n3 = net.minecraft.u.b.n.f(a2.d) + 1;
        int n4 = net.minecraft.u.b.n.c(a2.b) - 1;
        int n5 = net.minecraft.u.b.n.f(a2.e) + 1;
        int n6 = net.minecraft.u.b.n.c(a2.c) - 1;
        int n7 = net.minecraft.u.b.n.f(a2.f) + 1;
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                int n8 = (i2 != n2 && i2 != n3 - 1 ? 0 : 1) + (i3 != n6 && i3 != n7 - 1 ? 0 : 1);
                if (n8 == 2 || !this.d(h2.d(i2, 64, i3))) continue;
                for (int i4 = n4; i4 < n5; ++i4) {
                    if (n8 > 0 && (i4 == n4 || i4 == n5 - 1)) continue;
                    h2.d(i2, i4, i3);
                    net.minecraft.g.c.b b2 = i2 >= -30000000 && i2 < 30000000 && i3 >= -30000000 && i3 < 30000000 ? this.n(h2) : net.minecraft.a.p.h.v();
                    b2.a(this, h2, a2, arrayList, null);
                }
            }
        }
        h2.n();
        return arrayList;
    }

    public boolean b(net.minecraft.u.b.a a2) {
        ArrayList arrayList = ov.a();
        int n2 = net.minecraft.u.b.n.c(a2.a) - 1;
        int n3 = net.minecraft.u.b.n.f(a2.d) + 1;
        int n4 = net.minecraft.u.b.n.c(a2.b) - 1;
        int n5 = net.minecraft.u.b.n.f(a2.e) + 1;
        int n6 = net.minecraft.u.b.n.c(a2.c) - 1;
        int n7 = net.minecraft.u.b.n.f(a2.f) + 1;
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n6; i3 < n7; ++i3) {
                    int n8 = (i2 != n2 && i2 != n3 - 1 ? 0 : 1) + (i3 != n6 && i3 != n7 - 1 ? 0 : 1);
                    if (n8 == 2 || !this.d(h2.d(i2, 64, i3))) continue;
                    for (int i4 = n4; i4 < n5; ++i4) {
                        boolean bl2;
                        if (n8 > 0 && (i4 == n4 || i4 == n5 - 1)) continue;
                        h2.d(i2, i4, i3);
                        if (i2 < -30000000 || i2 >= 30000000 || i3 < -30000000 || i3 >= 30000000) {
                            boolean bl3;
                            boolean bl4 = bl3 = true;
                            return bl4;
                        }
                        net.minecraft.g.c.b b2 = this.n(h2);
                        b2.a(this, h2, a2, arrayList, null);
                        if (arrayList.isEmpty()) continue;
                        boolean bl5 = bl2 = true;
                        return bl5;
                    }
                }
            }
            return false;
        }
        finally {
            h2.n();
        }
    }

    public int a(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (net.minecraft.u.b.n.b(f3 * ((float)Math.PI * 2)) * 2.0f + 0.5f);
        f4 = net.minecraft.u.b.n.a(f4, 0.0f, 1.0f);
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.j(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.h(f2) * 5.0f) / 16.0));
        f4 = 1.0f - f4;
        return (int)(f4 * 11.0f);
    }

    public float b(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (net.minecraft.u.b.n.b(f3 * ((float)Math.PI * 2)) * 2.0f + 0.2f);
        f4 = net.minecraft.u.b.n.a(f4, 0.0f, 1.0f);
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.j(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.h(f2) * 5.0f) / 16.0));
        return f4 * 0.8f + 0.2f;
    }

    public s a(net.minecraft.w.n n2, float f2) {
        float f3;
        float f4;
        float f5 = this.c(f2);
        float f6 = net.minecraft.u.b.n.b(f5 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f6 = net.minecraft.u.b.n.a(f6, 0.0f, 1.0f);
        int n3 = net.minecraft.u.b.n.c(n2.aU);
        int n4 = net.minecraft.u.b.n.c(n2.aV);
        int n5 = net.minecraft.u.b.n.c(n2.aW);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n3, n4, n5);
        q q2 = this.a(b2);
        float f7 = q2.c(b2);
        int n6 = q2.a(f7);
        float f8 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f9 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f10 = (float)(n6 & 0xFF) / 255.0f;
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
        return new s(f8, f9, f10);
    }

    public float c(float f2) {
        return this.q.a(this.v.f(), f2);
    }

    public int o() {
        return this.q.a(this.v.f());
    }

    public float p() {
        return net.minecraft.q.e.a[this.q.a(this.v.f())];
    }

    public float d(float f2) {
        float f3 = this.c(f2);
        return f3 * ((float)Math.PI * 2);
    }

    public s e(float f2) {
        float f3;
        float f4;
        float f5 = this.c(f2);
        float f6 = net.minecraft.u.b.n.b(f5 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f6 = net.minecraft.u.b.n.a(f6, 0.0f, 1.0f);
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
        return new s(f7, f8, f9);
    }

    public s f(float f2) {
        float f3 = this.c(f2);
        return this.q.b(f3, f2);
    }

    public net.minecraft.u.b.b o(net.minecraft.u.b.b b2) {
        return this.e(b2).f(b2);
    }

    public net.minecraft.u.b.b p(net.minecraft.u.b.b b2) {
        net.minecraft.q.f.k k2 = this.e(b2);
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(b2.cy_(), k2.g() + 16, b2.l());
        while (b3.k() >= 0) {
            net.minecraft.u.b.b b4 = b3.c();
            net.minecraft.g.a.h h2 = k2.a(b4).d();
            if (h2.c() && h2 != net.minecraft.g.a.h.j) break;
            b3 = b4;
        }
        return b3;
    }

    public float g(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (net.minecraft.u.b.n.b(f3 * ((float)Math.PI * 2)) * 2.0f + 0.25f);
        f4 = net.minecraft.u.b.n.a(f4, 0.0f, 1.0f);
        return f4 * f4 * 0.5f;
    }

    public boolean e(net.minecraft.u.b.b b2, cn cn2) {
        return true;
    }

    public void a(net.minecraft.u.b.b b2, cn cn2, int n2) {
    }

    public void a(net.minecraft.u.b.b b2, cn cn2, int n2, int n3) {
    }

    public void b(net.minecraft.u.b.b b2, cn cn2, int n2, int n3) {
    }

    public void q() {
        int n2;
        Object object;
        int n3;
        this.A.a("entities");
        this.A.a("global");
        for (n3 = 0; n3 < this.h.size(); ++n3) {
            object = (net.minecraft.w.n)this.h.get(n3);
            try {
                ++((net.minecraft.w.n)object).by;
                ((net.minecraft.w.n)object).cE_();
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Ticking entity");
                net.minecraft.k.i i2 = a2.a("Entity being ticked");
                if (object == null) {
                    i2.a("Entity", "~~NULL~~");
                } else {
                    ((net.minecraft.w.n)object).a(i2);
                }
                throw new bo(a2);
            }
            if (!((net.minecraft.w.n)object).bk) continue;
            this.h.remove(n3--);
        }
        this.A.c("remove");
        this.c.removeAll(this.d);
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            object = (net.minecraft.w.n)this.d.get(n3);
            int n4 = ((net.minecraft.w.n)object).bH;
            n2 = ((net.minecraft.w.n)object).bJ;
            if (!((net.minecraft.w.n)object).bG || !this.a(n4, n2, true)) continue;
            this.a(n4, n2).b((net.minecraft.w.n)object);
        }
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            this.d((net.minecraft.w.n)this.d.get(n3));
        }
        this.d.clear();
        this.r();
        this.A.c("regular");
        for (n3 = 0; n3 < this.c.size(); ++n3) {
            object = (net.minecraft.w.n)this.c.get(n3);
            net.minecraft.w.n n5 = ((net.minecraft.w.n)object).df();
            if (n5 != null) {
                if (!n5.bk && n5.A((net.minecraft.w.n)object)) continue;
                ((net.minecraft.w.n)object).o();
            }
            this.A.a("tick");
            if (!((net.minecraft.w.n)object).bk && !(object instanceof g)) {
                try {
                    this.g((net.minecraft.w.n)object);
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a3 = net.minecraft.k.a.a(throwable, "Ticking entity");
                    net.minecraft.k.i i3 = a3.a("Entity being ticked");
                    ((net.minecraft.w.n)object).a(i3);
                    throw new bo(a3);
                }
            }
            this.A.b();
            this.A.a("remove");
            if (((net.minecraft.w.n)object).bk) {
                n2 = ((net.minecraft.w.n)object).bH;
                int n6 = ((net.minecraft.w.n)object).bJ;
                if (((net.minecraft.w.n)object).bG && this.a(n2, n6, true)) {
                    this.a(n2, n6).b((net.minecraft.w.n)object);
                }
                this.c.remove(n3--);
                this.d((net.minecraft.w.n)object);
            }
            this.A.b();
        }
        this.A.c("blockEntities");
        this.M = true;
        Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            net.minecraft.u.b.b b2;
            object = (ap)iterator.next();
            if (!((ap)object).F() && ((ap)object).B() && this.d(b2 = ((ap)object).D()) && this.N.a(b2)) {
                try {
                    this.A.a(object.getClass().getSimpleName());
                    ((aw)object).a();
                    this.A.b();
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a4 = net.minecraft.k.a.a(throwable, "Ticking block entity");
                    net.minecraft.k.i i4 = a4.a("Block entity being ticked");
                    ((ap)object).a(i4);
                    throw new bo(a4);
                }
            }
            if (!((ap)object).F()) continue;
            iterator.remove();
            this.e.remove(object);
            if (!this.d(((ap)object).D())) continue;
            this.e(((ap)object).D()).d(((ap)object).D());
        }
        this.M = false;
        if (!this.H.isEmpty()) {
            this.f.removeAll(this.H);
            this.e.removeAll(this.H);
            this.H.clear();
        }
        this.A.c("pendingBlockEntities");
        if (!this.G.isEmpty()) {
            for (int i5 = 0; i5 < this.G.size(); ++i5) {
                ap ap2 = (ap)this.G.get(i5);
                if (ap2.F()) continue;
                if (!this.e.contains(ap2)) {
                    this.a(ap2);
                }
                if (!this.d(ap2.D())) continue;
                net.minecraft.q.f.k k2 = this.e(ap2.D());
                net.minecraft.g.c.b b3 = k2.a(ap2.D());
                k2.a(ap2.D(), ap2);
                this.a(ap2.D(), b3, b3, 3);
            }
            this.G.clear();
        }
        this.A.b();
        this.A.b();
    }

    protected void r() {
    }

    public boolean a(ap ap2) {
        boolean bl2 = this.e.add(ap2);
        if (bl2 && ap2 instanceof aw) {
            this.f.add(ap2);
        }
        return bl2;
    }

    public void a(Collection collection) {
        if (this.M) {
            this.G.addAll(collection);
        } else {
            for (ap ap2 : collection) {
                this.a(ap2);
            }
        }
    }

    public void g(net.minecraft.w.n n2) {
        this.a(n2, true);
    }

    public void a(net.minecraft.w.n n2, boolean bl2) {
        int n3 = net.minecraft.u.b.n.c(n2.aU);
        int n4 = net.minecraft.u.b.n.c(n2.aW);
        int n5 = 32;
        if (!bl2 || this.a(n3 - 32, 0, n4 - 32, n3 + 32, 0, n4 + 32, true)) {
            n2.br = n2.aU;
            n2.bs = n2.aV;
            n2.bt = n2.aW;
            n2.bc = n2.ba;
            n2.bd = n2.bb;
            if (bl2 && n2.bG) {
                ++n2.by;
                if (n2.cz()) {
                    n2.J();
                } else {
                    n2.cE_();
                }
            }
            this.A.a("chunkCheck");
            if (Double.isNaN(n2.aU) || Double.isInfinite(n2.aU)) {
                n2.aU = n2.br;
            }
            if (Double.isNaN(n2.aV) || Double.isInfinite(n2.aV)) {
                n2.aV = n2.bs;
            }
            if (Double.isNaN(n2.aW) || Double.isInfinite(n2.aW)) {
                n2.aW = n2.bt;
            }
            if (Double.isNaN(n2.bb) || Double.isInfinite(n2.bb)) {
                n2.bb = n2.bd;
            }
            if (Double.isNaN(n2.ba) || Double.isInfinite(n2.ba)) {
                n2.ba = n2.bc;
            }
            int n6 = net.minecraft.u.b.n.c(n2.aU / 16.0);
            int n7 = net.minecraft.u.b.n.c(n2.aV / 16.0);
            int n8 = net.minecraft.u.b.n.c(n2.aW / 16.0);
            if (!n2.bG || n2.bH != n6 || n2.bI != n7 || n2.bJ != n8) {
                if (n2.bG && this.a(n2.bH, n2.bJ, true)) {
                    this.a(n2.bH, n2.bJ).a(n2, n2.bI);
                }
                if (!n2.cZ() && !this.a(n6, n8, true)) {
                    n2.bG = false;
                } else {
                    this.a(n6, n8).a(n2);
                }
            }
            this.A.b();
            if (bl2 && n2.bG) {
                for (net.minecraft.w.n n9 : n2.db()) {
                    if (!n9.bk && n9.df() == n2) {
                        this.g(n9);
                        continue;
                    }
                    n9.o();
                }
            }
        }
    }

    public boolean c(net.minecraft.u.b.a a2) {
        return this.a(a2, (net.minecraft.w.n)null);
    }

    public boolean a(net.minecraft.u.b.a a2, net.minecraft.w.n n2) {
        List list = this.b(null, a2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            net.minecraft.w.n n3 = (net.minecraft.w.n)list.get(i2);
            if (n3.bk || !n3.aN || n3 == n2 || n2 != null && !n3.B(n2)) continue;
            return false;
        }
        return true;
    }

    public boolean d(net.minecraft.u.b.a a2) {
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.b);
        int n5 = net.minecraft.u.b.n.f(a2.e);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    net.minecraft.g.c.b b2 = this.n(h2.d(i2, i3, i4));
                    if (b2.d() == net.minecraft.g.a.h.a) continue;
                    h2.n();
                    return true;
                }
            }
        }
        h2.n();
        return false;
    }

    public boolean e(net.minecraft.u.b.a a2) {
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.b);
        int n5 = net.minecraft.u.b.n.f(a2.e);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    net.minecraft.g.c.b b2 = this.n(h2.d(i2, i3, i4));
                    if (!b2.d().d()) continue;
                    h2.n();
                    return true;
                }
            }
        }
        h2.n();
        return false;
    }

    public boolean f(net.minecraft.u.b.a a2) {
        int n2;
        int n3 = net.minecraft.u.b.n.c(a2.a);
        int n4 = net.minecraft.u.b.n.f(a2.d);
        int n5 = net.minecraft.u.b.n.c(a2.b);
        int n6 = net.minecraft.u.b.n.f(a2.e);
        int n7 = net.minecraft.u.b.n.c(a2.c);
        if (this.a(n3, n5, n7, n4, n6, n2 = net.minecraft.u.b.n.f(a2.f), true)) {
            net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
            for (int i2 = n3; i2 < n4; ++i2) {
                for (int i3 = n5; i3 < n6; ++i3) {
                    for (int i4 = n7; i4 < n2; ++i4) {
                        cn cn2 = this.n(h2.d(i2, i3, i4)).c();
                        if (cn2 != net.minecraft.a.p.ab && cn2 != net.minecraft.a.p.k && cn2 != net.minecraft.a.p.l) continue;
                        h2.n();
                        return true;
                    }
                }
            }
            h2.n();
        }
        return false;
    }

    public boolean a(net.minecraft.u.b.a a2, net.minecraft.g.a.h h2, net.minecraft.w.n n2) {
        int n3;
        int n4 = net.minecraft.u.b.n.c(a2.a);
        int n5 = net.minecraft.u.b.n.f(a2.d);
        int n6 = net.minecraft.u.b.n.c(a2.b);
        int n7 = net.minecraft.u.b.n.f(a2.e);
        int n8 = net.minecraft.u.b.n.c(a2.c);
        if (!this.a(n4, n6, n8, n5, n7, n3 = net.minecraft.u.b.n.f(a2.f), true)) {
            return false;
        }
        boolean bl2 = false;
        s s2 = net.minecraft.u.b.s.a;
        net.minecraft.u.b.h h3 = net.minecraft.u.b.h.m();
        for (int i2 = n4; i2 < n5; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                for (int i4 = n8; i4 < n3; ++i4) {
                    double d2;
                    h3.d(i2, i3, i4);
                    net.minecraft.g.c.b b2 = this.n(h3);
                    cn cn2 = b2.c();
                    if (b2.d() != h2 || !((double)n7 >= (d2 = (double)((float)(i3 + 1) - ee.b((Integer)b2.a(ee.a)))))) continue;
                    bl2 = true;
                    s2 = cn2.a(this, (net.minecraft.u.b.b)h3, n2, s2);
                }
            }
        }
        h3.n();
        if (s2.b() > 0.0 && n2.ay()) {
            s2 = s2.a();
            double d3 = 0.014;
            n2.aX += s2.b * 0.014;
            n2.aY += s2.c * 0.014;
            n2.aZ += s2.d * 0.014;
        }
        return bl2;
    }

    public boolean a(net.minecraft.u.b.a a2, net.minecraft.g.a.h h2) {
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.b);
        int n5 = net.minecraft.u.b.n.f(a2.e);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        net.minecraft.u.b.h h3 = net.minecraft.u.b.h.m();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    if (this.n(h3.d(i2, i3, i4)).d() != h2) continue;
                    h3.n();
                    return true;
                }
            }
        }
        h3.n();
        return false;
    }

    public boolean b(net.minecraft.u.b.a a2, net.minecraft.g.a.h h2) {
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.b);
        int n5 = net.minecraft.u.b.n.f(a2.e);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        net.minecraft.u.b.h h3 = net.minecraft.u.b.h.m();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    net.minecraft.g.c.b b2 = this.n(h3.d(i2, i3, i4));
                    if (b2.d() != h2) continue;
                    int n8 = (Integer)b2.a(ee.a);
                    double d2 = i3 + 1;
                    if (n8 < 8) {
                        d2 = (double)(i3 + 1) - (double)n8 / 8.0;
                    }
                    if (!(d2 >= a2.b)) continue;
                    h3.n();
                    return true;
                }
            }
        }
        h3.n();
        return false;
    }

    public t a(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, boolean bl2) {
        return this.a(n2, d2, d3, d4, f2, false, bl2);
    }

    public t a(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        t t2 = new t(this, n2, d2, d3, d4, f2, bl2, bl3);
        t2.a();
        t2.a(true);
        return t2;
    }

    public float a(s s2, net.minecraft.u.b.a a2) {
        double d2 = 1.0 / ((a2.d - a2.a) * 2.0 + 1.0);
        double d3 = 1.0 / ((a2.e - a2.b) * 2.0 + 1.0);
        double d4 = 1.0 / ((a2.f - a2.c) * 2.0 + 1.0);
        double d5 = (1.0 - Math.floor(1.0 / d2) * d2) / 2.0;
        double d6 = (1.0 - Math.floor(1.0 / d4) * d4) / 2.0;
        if (d2 >= 0.0 && d3 >= 0.0 && d4 >= 0.0) {
            int n2 = 0;
            int n3 = 0;
            float f2 = 0.0f;
            while (f2 <= 1.0f) {
                float f3 = 0.0f;
                while (f3 <= 1.0f) {
                    float f4 = 0.0f;
                    while (f4 <= 1.0f) {
                        double d7 = a2.a + (a2.d - a2.a) * (double)f2;
                        double d8 = a2.b + (a2.e - a2.b) * (double)f3;
                        double d9 = a2.c + (a2.f - a2.c) * (double)f4;
                        if (this.a(new s(d7 + d5, d8, d9 + d6), s2) == null) {
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
        return 0.0f;
    }

    public boolean a(net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, ad ad2) {
        if (this.n(b3 = b3.a(ad2)).c() == net.minecraft.a.p.ab) {
            this.a(b2, 1009, b3, 0);
            this.f(b3);
            return true;
        }
        return false;
    }

    public String s() {
        return "All: " + this.c.size();
    }

    public String t() {
        return this.t.b();
    }

    @Override
    public ap q(net.minecraft.u.b.b b2) {
        if (this.E(b2)) {
            return null;
        }
        ap ap2 = null;
        if (this.M) {
            ap2 = this.F(b2);
        }
        if (ap2 == null) {
            ap2 = this.e(b2).a(b2, net.minecraft.q.f.a.a);
        }
        if (ap2 == null) {
            ap2 = this.F(b2);
        }
        return ap2;
    }

    private ap F(net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < this.G.size(); ++i2) {
            ap ap2 = (ap)this.G.get(i2);
            if (ap2.F() || !ap2.D().equals(b2)) continue;
            return ap2;
        }
        return null;
    }

    public void a(net.minecraft.u.b.b b2, ap ap2) {
        if (!this.E(b2) && ap2 != null && !ap2.F()) {
            if (this.M) {
                ap2.c(b2);
                Iterator iterator = this.G.iterator();
                while (iterator.hasNext()) {
                    ap ap3 = (ap)iterator.next();
                    if (!ap3.D().equals(b2)) continue;
                    ap3.bP_();
                    iterator.remove();
                }
                this.G.add(ap2);
            } else {
                this.a(ap2);
                this.e(b2).a(b2, ap2);
            }
        }
    }

    public void r(net.minecraft.u.b.b b2) {
        ap ap2 = this.q(b2);
        if (ap2 != null && this.M) {
            ap2.bP_();
            this.G.remove(ap2);
        } else {
            if (ap2 != null) {
                this.G.remove(ap2);
                this.e.remove(ap2);
                this.f.remove(ap2);
            }
            this.e(b2).d(b2);
        }
    }

    public void b(ap ap2) {
        this.H.add(ap2);
    }

    public boolean s(net.minecraft.u.b.b b2) {
        net.minecraft.u.b.a a2 = this.n(b2).d(this, b2);
        return a2 != cn.y && a2.a() >= 1.0;
    }

    public boolean d(net.minecraft.u.b.b b2, boolean bl2) {
        if (this.E(b2)) {
            return false;
        }
        net.minecraft.q.f.k k2 = this.t.b(b2.cy_() >> 4, b2.l() >> 4);
        if (k2 != null && !k2.f()) {
            net.minecraft.g.c.b b3 = this.n(b2);
            return b3.d().j() && b3.k();
        }
        return bl2;
    }

    public void u() {
        int n2 = this.a(1.0f);
        if (n2 != this.J) {
            this.J = n2;
        }
    }

    public void a(boolean bl2, boolean bl3) {
        this.D = bl2;
        this.E = bl3;
    }

    public void a() {
        this.f();
        if (net.minecraft.client.r.I == null) {
            net.minecraft.client.r.I = new net.minecraft.l.k();
            net.minecraft.client.r.I.a(this);
        }
        if (net.minecraft.client.r.I != null && net.minecraft.client.r.I.j == null) {
            net.minecraft.client.r.I.a(this);
        }
    }

    protected void v() {
        if (this.v.o()) {
            this.m = 1.0f;
            if (this.v.m()) {
                this.o = 1.0f;
            }
        }
    }

    protected void f() {
        if (!this.q.n() && !this.C) {
            int n2;
            int n3 = this.v.l();
            if (n3 > 0) {
                this.v.e(--n3);
                this.v.f(this.v.m() ? 1 : 2);
                this.v.g(this.v.o() ? 1 : 2);
            }
            if ((n2 = this.v.n()) <= 0) {
                if (this.v.m()) {
                    this.v.f(this.p.nextInt(12000) + 3600);
                } else {
                    this.v.f(this.p.nextInt(168000) + 12000);
                }
            } else {
                this.v.f(--n2);
                if (n2 <= 0) {
                    this.v.a(!this.v.m());
                }
            }
            this.n = this.o;
            this.o = this.v.m() ? (float)((double)this.o + 0.01) : (float)((double)this.o - 0.01);
            this.o = net.minecraft.u.b.n.a(this.o, 0.0f, 1.0f);
            int n4 = this.v.p();
            if (n4 <= 0) {
                if (this.v.o()) {
                    this.v.g(this.p.nextInt(12000) + 12000);
                } else {
                    this.v.g(this.p.nextInt(168000) + 12000);
                }
            } else {
                this.v.g(--n4);
                if (n4 <= 0) {
                    this.v.b(!this.v.o());
                }
            }
            this.l = this.m;
            this.m = this.v.o() ? (float)((double)this.m + 0.01) : (float)((double)this.m - 0.01);
            this.m = net.minecraft.u.b.n.a(this.m, 0.0f, 1.0f);
        }
    }

    protected void a(int n2, int n3, net.minecraft.q.f.k k2) {
        k2.n();
    }

    protected void d() {
    }

    public void a(net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, Random random) {
        this.b = true;
        b3.c().a(this, b2, b3, random);
        this.b = false;
    }

    public boolean t(net.minecraft.u.b.b b2) {
        return this.e(b2, false);
    }

    public boolean u(net.minecraft.u.b.b b2) {
        return this.e(b2, true);
    }

    public boolean e(net.minecraft.u.b.b b2, boolean bl2) {
        net.minecraft.g.c.b b3;
        cn cn2;
        q q2 = this.a(b2);
        float f2 = q2.c(b2);
        if (f2 > 0.15f) {
            return false;
        }
        if (b2.k() >= 0 && b2.k() < 256 && this.b(au.b, b2) < 10 && ((cn2 = (b3 = this.n(b2)).c()) == net.minecraft.a.p.j || cn2 == net.minecraft.a.p.i) && (Integer)b3.a(ee.a) == 0) {
            boolean bl3;
            if (!bl2) {
                return true;
            }
            boolean bl4 = bl3 = this.G(b2.f()) && this.G(b2.g()) && this.G(b2.d()) && this.G(b2.e());
            if (!bl3) {
                return true;
            }
        }
        return false;
    }

    private boolean G(net.minecraft.u.b.b b2) {
        return this.n(b2).d() == net.minecraft.g.a.h.h;
    }

    public boolean f(net.minecraft.u.b.b b2, boolean bl2) {
        net.minecraft.g.c.b b3;
        q q2 = this.a(b2);
        float f2 = q2.c(b2);
        if (f2 > 0.15f) {
            return false;
        }
        if (!bl2) {
            return true;
        }
        return b2.k() >= 0 && b2.k() < 256 && this.b(au.b, b2) < 10 && (b3 = this.n(b2)).d() == net.minecraft.g.a.h.a && net.minecraft.a.p.aH.a_(this, b2);
    }

    public boolean v(net.minecraft.u.b.b b2) {
        boolean bl2 = false;
        if (!this.q.n()) {
            bl2 |= this.c(au.a, b2);
        }
        return bl2 |= this.c(au.b, b2);
    }

    private int a(net.minecraft.u.b.b b2, au au2) {
        if (au2 == au.a && this.g(b2)) {
            return 15;
        }
        net.minecraft.g.c.b b3 = this.n(b2);
        int n2 = au2 == au.a ? 0 : b3.g();
        int n3 = b3.f();
        if (n3 >= 15 && b3.g() > 0) {
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
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (ad ad2 : ad.values()) {
            h2.g(b2).c(ad2);
            int n4 = this.b(au2, (net.minecraft.u.b.b)h2) - n3;
            if (n4 > n2) {
                n2 = n4;
            }
            if (n2 < 14) continue;
            return n2;
        }
        h2.n();
        return n2;
    }

    public boolean c(au au2, net.minecraft.u.b.b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        if (!this.a(b2, 17, false)) {
            return false;
        }
        int n10 = 0;
        int n11 = 0;
        this.A.a("getBrightness");
        int n12 = this.b(au2, b2);
        int n13 = this.a(b2, au2);
        int n14 = b2.cy_();
        int n15 = b2.k();
        int n16 = b2.l();
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
                net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(n8, n7, n6);
                n5 = this.b(au2, b3);
                if (n5 != n17) continue;
                this.a(au2, b3, 0);
                if (n17 <= 0 || (n4 = net.minecraft.u.b.n.a(n8 - n14)) + (n3 = net.minecraft.u.b.n.a(n7 - n15)) + (n2 = net.minecraft.u.b.n.a(n6 - n16)) >= 17) continue;
                net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
                for (ad ad2 : ad.values()) {
                    int n18 = n8 + ad2.h();
                    int n19 = n7 + ad2.i();
                    int n20 = n6 + ad2.j();
                    h2.d(n18, n19, n20);
                    int n21 = Math.max(1, this.n(h2).f());
                    n5 = this.b(au2, (net.minecraft.u.b.b)h2);
                    if (n5 != n17 - n21 || n11 >= this.F.length) continue;
                    this.F[n11++] = n18 - n14 + 32 | n19 - n15 + 32 << 6 | n20 - n16 + 32 << 12 | n17 - n21 << 18;
                }
                h2.n();
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
            net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(n8, n7, n6);
            int n22 = this.b(au2, b4);
            n5 = this.a(b4, au2);
            if (n5 == n22) continue;
            this.a(au2, b4, n5);
            if (n5 <= n22) continue;
            n4 = Math.abs(n8 - n14);
            n3 = Math.abs(n7 - n15);
            n2 = Math.abs(n6 - n16);
            boolean bl3 = bl2 = n11 < this.F.length - 6;
            if (n4 + n3 + n2 >= 17 || !bl2) continue;
            if (this.b(au2, b4.f()) < n5) {
                this.F[n11++] = n8 - 1 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(au2, b4.g()) < n5) {
                this.F[n11++] = n8 + 1 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(au2, b4.c()) < n5) {
                this.F[n11++] = n8 - n14 + 32 + (n7 - 1 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(au2, b4.b()) < n5) {
                this.F[n11++] = n8 - n14 + 32 + (n7 + 1 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(au2, b4.d()) < n5) {
                this.F[n11++] = n8 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - 1 - n16 + 32 << 12);
            }
            if (this.b(au2, b4.e()) >= n5) continue;
            this.F[n11++] = n8 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 + 1 - n16 + 32 << 12);
        }
        this.A.b();
        return true;
    }

    public boolean a(boolean bl2) {
        return false;
    }

    public List a(net.minecraft.q.f.k k2, boolean bl2) {
        return null;
    }

    public List b(dc dc2, boolean bl2) {
        return null;
    }

    public List b(net.minecraft.w.n n2, net.minecraft.u.b.a a2) {
        return this.a(n2, a2, net.minecraft.u.r.e);
    }

    public List a(net.minecraft.w.n n2, net.minecraft.u.b.a a2, cm cm2) {
        ArrayList arrayList = ov.a();
        int n3 = net.minecraft.u.b.n.c((a2.a - 2.0) / 16.0);
        int n4 = net.minecraft.u.b.n.c((a2.d + 2.0) / 16.0);
        int n5 = net.minecraft.u.b.n.c((a2.c - 2.0) / 16.0);
        int n6 = net.minecraft.u.b.n.c((a2.f + 2.0) / 16.0);
        for (int i2 = n3; i2 <= n4; ++i2) {
            for (int i3 = n5; i3 <= n6; ++i3) {
                if (!this.a(i2, i3, true)) continue;
                this.a(i2, i3).a(n2, a2, (List)arrayList, cm2);
            }
        }
        return arrayList;
    }

    public List a(Class class_, cm cm2) {
        ArrayList arrayList = ov.a();
        for (net.minecraft.w.n n2 : this.c) {
            if (!class_.isAssignableFrom(n2.getClass()) || !cm2.a(n2)) continue;
            arrayList.add(n2);
        }
        return arrayList;
    }

    public List b(Class class_, cm cm2) {
        ArrayList arrayList = ov.a();
        for (net.minecraft.w.n n2 : this.g) {
            if (!class_.isAssignableFrom(n2.getClass()) || !cm2.a(n2)) continue;
            arrayList.add(n2);
        }
        return arrayList;
    }

    public List a(Class class_, net.minecraft.u.b.a a2) {
        return this.a(class_, a2, net.minecraft.u.r.e);
    }

    public List a(Class class_, net.minecraft.u.b.a a2, cm cm2) {
        int n2 = net.minecraft.u.b.n.c((a2.a - 2.0) / 16.0);
        int n3 = net.minecraft.u.b.n.f((a2.d + 2.0) / 16.0);
        int n4 = net.minecraft.u.b.n.c((a2.c - 2.0) / 16.0);
        int n5 = net.minecraft.u.b.n.f((a2.f + 2.0) / 16.0);
        ArrayList arrayList = ov.a();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                if (!this.a(i2, i3, true)) continue;
                this.a(i2, i3).a(class_, a2, (List)arrayList, cm2);
            }
        }
        return arrayList;
    }

    public net.minecraft.w.n a(Class class_, net.minecraft.u.b.a a2, net.minecraft.w.n n2) {
        List list = this.a(class_, a2);
        net.minecraft.w.n n3 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            net.minecraft.w.n n4 = (net.minecraft.w.n)list.get(i2);
            if (n4 == n2 || !net.minecraft.u.r.e.a(n4) || !((d3 = n2.n(n4)) <= d2)) continue;
            n3 = n4;
            d2 = d3;
        }
        return n3;
    }

    public net.minecraft.w.n a(int n2) {
        return (net.minecraft.w.n)this.i.a(n2);
    }

    public List w() {
        return this.c;
    }

    public void b(net.minecraft.u.b.b b2, ap ap2) {
        if (this.d(b2)) {
            this.e(b2).e();
        }
    }

    public int a(Class class_) {
        int n2 = 0;
        for (net.minecraft.w.n n3 : this.c) {
            if (n3 instanceof net.minecraft.w.f && ((net.minecraft.w.f)n3).aM() || !class_.isAssignableFrom(n3.getClass())) continue;
            ++n2;
        }
        return n2;
    }

    public void b(Collection collection) {
        this.c.addAll(collection);
        for (net.minecraft.w.n n2 : collection) {
            this.c(n2);
        }
    }

    public void c(Collection collection) {
        this.d.addAll(collection);
    }

    public boolean a(cn cn2, net.minecraft.u.b.b b2, boolean bl2, ad ad2, net.minecraft.w.n n2, cu cu2) {
        net.minecraft.u.b.a a2;
        net.minecraft.g.c.b b3 = this.n(b2);
        net.minecraft.u.b.a a3 = a2 = bl2 ? null : cn2.v().d(this, b2);
        return a2 != cn.y && !this.a(a2.a(b2), n2) ? false : (b3.d() == net.minecraft.g.a.h.q && cn2 == net.minecraft.a.p.cf ? true : b3.d().i() && cn2.a(this, b2, ad2, cu2));
    }

    public int x() {
        return this.a;
    }

    public void c(int n2) {
        this.a = n2;
    }

    @Override
    public int a(net.minecraft.u.b.b b2, ad ad2) {
        return this.n(b2).b(this, b2, ad2);
    }

    @Override
    public ab y() {
        return this.v.t();
    }

    public int w(net.minecraft.u.b.b b2) {
        int n2 = 0;
        if ((n2 = Math.max(n2, this.a(b2.c(), ad.a))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(b2.b(), ad.b))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(b2.d(), ad.c))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(b2.e(), ad.d))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.a(b2.f(), ad.e))) >= 15) {
            return n2;
        }
        return (n2 = Math.max(n2, this.a(b2.g(), ad.f))) >= 15 ? n2 : n2;
    }

    public boolean b(net.minecraft.u.b.b b2, ad ad2) {
        return this.c(b2, ad2) > 0;
    }

    public int c(net.minecraft.u.b.b b2, ad ad2) {
        net.minecraft.g.c.b b3 = this.n(b2);
        return b3.o() ? this.w(b2) : b3.a((n)this, b2, ad2);
    }

    public boolean x(net.minecraft.u.b.b b2) {
        return this.c(b2.c(), ad.a) > 0 ? true : (this.c(b2.b(), ad.b) > 0 ? true : (this.c(b2.d(), ad.c) > 0 ? true : (this.c(b2.e(), ad.d) > 0 ? true : (this.c(b2.f(), ad.e) > 0 ? true : this.c(b2.g(), ad.f) > 0))));
    }

    public int y(net.minecraft.u.b.b b2) {
        int n2 = 0;
        for (ad ad2 : ad.values()) {
            int n3 = this.c(b2.a(ad2), ad2);
            if (n3 >= 15) {
                return 15;
            }
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    public net.minecraft.w.a.b a(net.minecraft.w.n n2, double d2) {
        return this.a(n2.aU, n2.aV, n2.aW, d2, false);
    }

    public net.minecraft.w.a.b b(net.minecraft.w.n n2, double d2) {
        return this.a(n2.aU, n2.aV, n2.aW, d2, true);
    }

    public net.minecraft.w.a.b a(double d2, double d3, double d4, double d5, boolean bl2) {
        double d6 = -1.0;
        net.minecraft.w.a.b b2 = null;
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.w.a.b b3 = (net.minecraft.w.a.b)this.g.get(i2);
            if (!net.minecraft.u.r.d.a(b3) && bl2 || !net.minecraft.u.r.e.a(b3) && !bl2) continue;
            double d7 = b3.h(d2, d3, d4);
            if (!(d5 < 0.0) && !(d7 < d5 * d5) || d6 != -1.0 && !(d7 < d6)) continue;
            d6 = d7;
            b2 = b3;
        }
        return b2;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)this.g.get(i2);
            if (!net.minecraft.u.r.e.a(b2)) continue;
            double d6 = b2.h(d2, d3, d4);
            if (!(d5 < 0.0) && !(d6 < d5 * d5)) continue;
            return true;
        }
        return false;
    }

    public net.minecraft.w.a.b a(net.minecraft.w.n n2, double d2, double d3) {
        return this.a(n2.aU, n2.aV, n2.aW, d2, d3, null, null);
    }

    public net.minecraft.w.a.b a(net.minecraft.u.b.b b2, double d2, double d3) {
        return this.a((double)((float)b2.cy_() + 0.5f), (double)((float)b2.k() + 0.5f), (double)((float)b2.l() + 0.5f), d2, d3, null, null);
    }

    public net.minecraft.w.a.b a(double d2, double d3, double d4, double d5, double d6, bl bl2, cm cm2) {
        double d7 = -1.0;
        net.minecraft.w.a.b b2 = null;
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.w.a.b b3 = (net.minecraft.w.a.b)this.g.get(i2);
            if (b3.J.a || !b3.br() || b3.a() || cm2 != null && !cm2.a(b3)) continue;
            double d8 = b3.h(d2, b3.aV, d4);
            double d9 = d5;
            if (b3.G()) {
                d9 = d5 * (double)0.8f;
            }
            if (b3.cD()) {
                float f2 = b3.W();
                if (f2 < 0.1f) {
                    f2 = 0.1f;
                }
                d9 *= (double)(0.7f * f2);
            }
            if (bl2 != null) {
                d9 *= ((Double)cc.b((Double)bl2.a(b3), 1.0)).doubleValue();
            }
            if (!(d6 < 0.0) && !(Math.abs(b3.aV - d3) < d6 * d6) || !(d5 < 0.0) && !(d8 < d9 * d9) || d7 != -1.0 && !(d8 < d7)) continue;
            d7 = d8;
            b2 = b3;
        }
        return b2;
    }

    public net.minecraft.w.a.b a(String string) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)this.g.get(i2);
            if (!string.equals(b2.X())) continue;
            return b2;
        }
        return null;
    }

    public net.minecraft.w.a.b a(UUID uUID) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)this.g.get(i2);
            if (!uUID.equals(b2.cM())) continue;
            return b2;
        }
        return null;
    }

    public void e() {
    }

    public void z() {
        this.u.b();
    }

    public void b(long l2) {
        this.v.a(l2);
    }

    public long A() {
        return this.v.a();
    }

    public long B() {
        return this.v.e();
    }

    public long C() {
        return this.v.f();
    }

    public void a(long l2) {
        this.v.b(l2);
    }

    public net.minecraft.u.b.b D() {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.v.b(), this.v.c(), this.v.d());
        if (!this.V().a(b2)) {
            b2 = this.k(new net.minecraft.u.b.b(this.V().a(), 0.0, this.V().b()));
        }
        return b2;
    }

    public void z(net.minecraft.u.b.b b2) {
        this.v.a(b2);
    }

    public void h(net.minecraft.w.n n2) {
        int n3 = net.minecraft.u.b.n.c(n2.aU / 16.0);
        int n4 = net.minecraft.u.b.n.c(n2.aW / 16.0);
        int n5 = 2;
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                this.a(n3 + i2, n4 + i3);
            }
        }
        if (!this.c.contains(n2)) {
            this.c.add(n2);
        }
    }

    public boolean a(net.minecraft.w.a.b b2, net.minecraft.u.b.b b3) {
        return true;
    }

    public void a(net.minecraft.w.n n2, byte by2) {
    }

    public f i() {
        return this.t;
    }

    public void c(net.minecraft.u.b.b b2, cn cn2, int n2, int n3) {
        this.n(b2).a(this, b2, n2, n3);
    }

    public u E() {
        return this.u;
    }

    public d F() {
        return this.v;
    }

    public j G() {
        return this.v.x();
    }

    public void H() {
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

    public boolean I() {
        return (double)this.h(1.0f) > 0.9;
    }

    public boolean J() {
        return (double)this.j(1.0f) > 0.2;
    }

    public boolean A(net.minecraft.u.b.b b2) {
        if (!this.J()) {
            return false;
        }
        if (!this.g(b2)) {
            return false;
        }
        if (this.o(b2).k() > b2.k()) {
            return false;
        }
        q q2 = this.a(b2);
        return q2.f() ? false : (this.f(b2, false) ? false : q2.g());
    }

    public boolean B(net.minecraft.u.b.b b2) {
        q q2 = this.a(b2);
        return q2.h();
    }

    public h K() {
        return this.x;
    }

    public void a(String string, net.minecraft.q.f f2) {
        this.x.a(string, f2);
    }

    public net.minecraft.q.f a(Class class_, String string) {
        return this.x.a(class_, string);
    }

    public int b(String string) {
        return this.x.a(string);
    }

    public void a(int n2, net.minecraft.u.b.b b2, int n3) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ((ag)this.s.get(i2)).a(n2, b2, n3);
        }
    }

    public void b(int n2, net.minecraft.u.b.b b2, int n3) {
        this.a(null, n2, b2, n3);
    }

    public void a(net.minecraft.w.a.b b2, int n2, net.minecraft.u.b.b b3, int n3) {
        try {
            for (int i2 = 0; i2 < this.s.size(); ++i2) {
                ((ag)this.s.get(i2)).a(b2, n2, b3, n3);
            }
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Playing level event");
            net.minecraft.k.i i3 = a2.a("Level event being played");
            i3.a("Block coordinates", net.minecraft.k.i.a(b3));
            i3.a("Event source", b2);
            i3.a("Event type", n2);
            i3.a("Event data", n3);
            throw new bo(a2);
        }
    }

    public int L() {
        return 256;
    }

    public int M() {
        return this.q.n() ? 128 : 256;
    }

    public Random b(int n2, int n3, int n4) {
        long l2 = (long)n2 * 341873128712L + (long)n3 * 132897987541L + this.F().a() + (long)n4;
        this.p.setSeed(l2);
        return this.p;
    }

    @Override
    public boolean N() {
        return false;
    }

    public double O() {
        return this.v.t() == ab.c ? 0.0 : 63.0;
    }

    public net.minecraft.k.i a(net.minecraft.k.a a2) {
        net.minecraft.k.i i2 = a2.a("Affected level", 1);
        i2.a("Level name", this.v == null ? "????" : this.v.i());
        i2.a("All players", new y(this));
        i2.a("Chunk stats", new o(this));
        try {
            this.v.a(i2);
        }
        catch (Throwable throwable) {
            i2.a("Level Data Unobtainable", throwable);
        }
        return i2;
    }

    public void c(int n2, net.minecraft.u.b.b b2, int n3) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            ag ag2 = (ag)this.s.get(i2);
            ag2.b(n2, b2, n3);
        }
    }

    public Calendar P() {
        if (this.B() % 600L == 0L) {
            this.L.setTimeInMillis(net.minecraft.c.a.aI());
        }
        return this.L;
    }

    public void a(double d2, double d3, double d4, double d5, double d6, double d7, net.minecraft.e.e e2) {
    }

    public r Q() {
        return this.B;
    }

    public void f(net.minecraft.u.b.b b2, cn cn2) {
        for (ad ad2 : net.minecraft.u.ag.a) {
            net.minecraft.u.b.b b3 = b2.a(ad2);
            if (!this.d(b3)) continue;
            net.minecraft.g.c.b b4 = this.n(b3);
            if (net.minecraft.a.p.cj.C(b4)) {
                b4.a(this, b3, cn2);
                continue;
            }
            if (!b4.o() || !net.minecraft.a.p.cj.C(b4 = this.n(b3 = b3.a(ad2)))) continue;
            b4.a(this, b3, cn2);
        }
    }

    public z C(net.minecraft.u.b.b b2) {
        long l2 = 0L;
        float f2 = 0.0f;
        if (this.d(b2)) {
            f2 = this.p();
            l2 = this.e(b2).x();
        }
        return new z(this.R(), this.C(), l2, f2);
    }

    public l R() {
        return this.F().H();
    }

    public int S() {
        return this.J;
    }

    public void d(int n2) {
        this.J = n2;
    }

    public int T() {
        return this.K;
    }

    public void e(int n2) {
        this.K = n2;
    }

    public net.minecraft.b.e U() {
        return this.y;
    }

    public net.minecraft.q.c.d V() {
        return this.N;
    }

    public boolean d(int n2, int n3) {
        net.minecraft.u.b.b b2 = this.D();
        int n4 = n2 * 16 + 8 - b2.cy_();
        int n5 = n3 * 16 + 8 - b2.l();
        int n6 = 128;
        return n4 >= -128 && n4 <= 128 && n5 >= -128 && n5 <= 128;
    }

    public void a(net.minecraft.x.p p2) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    public c W() {
        return this.z;
    }
}

