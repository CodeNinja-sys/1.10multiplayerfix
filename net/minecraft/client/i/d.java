/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import com.a.a.d.aad;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.a.an;
import net.minecraft.client.i.c;
import net.minecraft.client.i.e;
import net.minecraft.client.i.g;
import net.minecraft.client.i.h;
import net.minecraft.client.i.p;
import net.minecraft.client.r;
import net.minecraft.g.cn;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.m.cu;
import net.minecraft.p.b;
import net.minecraft.q.a.z;
import net.minecraft.q.am;
import net.minecraft.q.au;
import net.minecraft.q.f.f;
import net.minecraft.q.f.k;
import net.minecraft.q.l;
import net.minecraft.q.w;
import net.minecraft.u.aj;
import net.minecraft.u.b.m;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.n;

public class d
extends net.minecraft.q.k {
    private final net.minecraft.client.l.g G;
    private e H;
    private final Set I = aad.a();
    private final Set J = aad.a();
    private final r K = net.minecraft.client.r.z();
    private final Set L = aad.a();
    private int M = this.p.nextInt(12000);
    protected Set a = aad.a();

    public d(net.minecraft.client.l.g g2, net.minecraft.q.aj aj2, int n2, l l2, b b2) {
        super(new z(), new net.minecraft.q.a.d(aj2, "MpServer"), net.minecraft.q.w.a(n2).d(), b2, true);
        this.G = g2;
        this.F().a(l2);
        this.z(new net.minecraft.u.b.b(8, 64, 8));
        this.q.a(this);
        this.t = this.b();
        this.x = new net.minecraft.q.a.l();
        this.u();
        this.v();
    }

    @Override
    public void a() {
        super.a();
        this.b(this.B() + 1L);
        if (this.G().b("doDaylightCycle")) {
            this.a(this.C() + 1L);
        }
        this.A.a("reEntryProcessing");
        for (int i2 = 0; i2 < 10 && !this.J.isEmpty(); ++i2) {
            n n2 = (n)this.J.iterator().next();
            this.J.remove(n2);
            if (this.c.contains(n2)) continue;
            this.a(n2);
        }
        this.A.c("chunkCache");
        this.H.a();
        this.A.c("blocks");
        this.d();
        this.A.b();
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    protected f b() {
        this.H = new e(this);
        return this.H;
    }

    @Override
    protected boolean a(int n2, int n3, boolean bl2) {
        return bl2 || !this.h().d(n2, n3).f();
    }

    protected void c() {
        this.a.clear();
        int n2 = this.K.w.d;
        this.A.a("buildList");
        int n3 = net.minecraft.u.b.n.c(this.K.j.aU / 16.0);
        int n4 = net.minecraft.u.b.n.c(this.K.j.aW / 16.0);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                this.a.add(new m(i2 + n3, i3 + n4));
            }
        }
        this.A.b();
    }

    @Override
    protected void d() {
        this.c();
        if (this.M > 0) {
            --this.M;
        }
        this.L.retainAll(this.a);
        if (this.L.size() == this.a.size()) {
            this.L.clear();
        }
        int n2 = 0;
        for (m m2 : this.a) {
            if (this.L.contains(m2)) continue;
            int n3 = m2.a * 16;
            int n4 = m2.b * 16;
            this.A.a("getChunk");
            k k2 = this.a(m2.a, m2.b);
            this.a(n3, n4, k2);
            this.A.b();
            this.L.add(m2);
            if (++n2 < 10) continue;
            return;
        }
    }

    public void b(int n2, int n3, boolean bl2) {
        if (bl2) {
            this.H.c(n2, n3);
        } else {
            this.H.a(n2, n3);
            this.b(n2 * 16, 0, n3 * 16, n2 * 16 + 15, 256, n3 * 16 + 15);
        }
    }

    @Override
    public boolean a(n n2) {
        boolean bl2 = super.a(n2);
        this.I.add(n2);
        if (bl2) {
            if (n2 instanceof net.minecraft.w.f.f) {
                this.K.U().a(new net.minecraft.client.c.n((net.minecraft.w.f.f)n2));
            }
        } else {
            this.J.add(n2);
        }
        return bl2;
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        this.I.remove(n2);
    }

    @Override
    protected void c(n n2) {
        super.c(n2);
        if (this.J.contains(n2)) {
            this.J.remove(n2);
        }
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        if (this.I.contains(n2)) {
            if (n2.br()) {
                this.J.add(n2);
            } else {
                this.I.remove(n2);
            }
        }
    }

    public void a(int n2, n n3) {
        n n4 = this.a(n2);
        if (n4 != null) {
            this.b(n4);
        }
        this.I.add(n3);
        n3.j(n2);
        if (!this.a(n3)) {
            this.J.add(n3);
        }
        this.i.a(n2, n3);
    }

    @Override
    public n a(int n2) {
        return n2 == this.K.j.ca() ? this.K.j : super.a(n2);
    }

    public n b(int n2) {
        n n3 = (n)this.i.d(n2);
        if (n3 != null) {
            this.I.remove(n3);
            this.b(n3);
        }
        return n3;
    }

    public boolean a(net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        int n2 = b2.cy_();
        int n3 = b2.k();
        int n4 = b2.l();
        this.a(n2, n3, n4, n2, n3, n4);
        return super.a(b2, b3, 3);
    }

    @Override
    public void e() {
        this.G.b().a(new net.minecraft.u.d.k("Quitting"));
    }

    @Override
    protected void f() {
    }

    @Override
    protected void a(int n2, int n3, k k2) {
        super.a(n2, n3, k2);
        if (this.M == 0) {
            this.j = this.j * 3 + 1013904223;
            int n4 = this.j >> 2;
            int n5 = n4 & 0xF;
            int n6 = n4 >> 8 & 0xF;
            int n7 = n4 >> 16 & 0xFF;
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n5 + n2, n7, n6 + n3);
            net.minecraft.g.c.b b3 = k2.a(b2);
            n5 += n2;
            n6 += n3;
            if (b3.d() == net.minecraft.g.a.h.a && this.i(b2) <= this.p.nextInt(8) && this.b(au.a, b2) <= 0 && this.K.j != null && this.K.j.h((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5) > 4.0) {
                this.a((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5, net.minecraft.a.f.a, bu.i, 0.7f, 0.8f + this.p.nextFloat() * 0.2f, false);
                this.M = this.p.nextInt(12000) + 6000;
            }
        }
    }

    public void a(int n2, int n3, int n4) {
        int n5 = 32;
        Random random = new Random();
        cu cu2 = this.K.j.bC();
        boolean bl2 = this.K.d.l() == am.c && cu2 != null && cn.a(cu2.a()) == net.minecraft.a.p.cv;
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g();
        for (int i2 = 0; i2 < 667; ++i2) {
            this.a(n2, n3, n4, 16, random, bl2, g2);
            this.a(n2, n3, n4, 32, random, bl2, g2);
        }
    }

    public void a(int n2, int n3, int n4, int n5, Random random, boolean bl2, net.minecraft.u.b.g g2) {
        int n6 = n2 + this.p.nextInt(n5) - this.p.nextInt(n5);
        int n7 = n3 + this.p.nextInt(n5) - this.p.nextInt(n5);
        int n8 = n4 + this.p.nextInt(n5) - this.p.nextInt(n5);
        g2.b(n6, n7, n8);
        net.minecraft.g.c.b b2 = this.n(g2);
        b2.c().a(b2, (net.minecraft.q.k)this, (net.minecraft.u.b.b)g2, random);
        if (bl2 && b2.c() == net.minecraft.a.p.cv) {
            this.a(aj.J, (double)((float)n6 + 0.5f), (double)((float)n7 + 0.5f), (double)((float)n8 + 0.5f), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    public void g() {
        int n2;
        n n3;
        int n4;
        this.c.removeAll(this.d);
        for (n4 = 0; n4 < this.d.size(); ++n4) {
            n3 = (n)this.d.get(n4);
            int n5 = n3.bH;
            n2 = n3.bJ;
            if (!n3.bG || !this.a(n5, n2, true)) continue;
            this.a(n5, n2).b(n3);
        }
        for (n4 = 0; n4 < this.d.size(); ++n4) {
            this.d((n)this.d.get(n4));
        }
        this.d.clear();
        for (n4 = 0; n4 < this.c.size(); ++n4) {
            n3 = (n)this.c.get(n4);
            n n6 = n3.df();
            if (n6 != null) {
                if (!n6.bk && n6.A(n3)) continue;
                n3.o();
            }
            if (!n3.bk) continue;
            n2 = n3.bH;
            int n7 = n3.bJ;
            if (n3.bG && this.a(n2, n7, true)) {
                this.a(n2, n7).b(n3);
            }
            this.c.remove(n4--);
            this.d(n3);
        }
    }

    @Override
    public i a(a a2) {
        i i2 = super.a(a2);
        i2.a("Forced entities", new p(this));
        i2.a("Retry entities", new g(this));
        i2.a("Server brand", new c(this));
        i2.a("Server type", new h(this));
        return i2;
    }

    @Override
    public void a(net.minecraft.w.a.b b2, double d2, double d3, double d4, bv bv2, bu bu2, float f2, float f3) {
        if (b2 == this.K.j) {
            this.a(d2, d3, d4, bv2, bu2, f2, f3, false);
        }
    }

    public void a(net.minecraft.u.b.b b2, bv bv2, bu bu2, float f2, float f3, boolean bl2) {
        this.a((double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5, bv2, bu2, f2, f3, bl2);
    }

    @Override
    public void a(double d2, double d3, double d4, bv bv2, bu bu2, float f2, float f3, boolean bl2) {
        double d5 = this.K.Z().h(d2, d3, d4);
        net.minecraft.client.c.e e2 = new net.minecraft.client.c.e(bv2, bu2, f2, f3, (float)d2, (float)d3, (float)d4);
        if (bl2 && d5 > 100.0) {
            double d6 = Math.sqrt(d5) / 40.0;
            this.K.U().a(e2, (int)(d6 * 20.0));
        } else {
            this.K.U().a(e2);
        }
    }

    @Override
    public void a(double d2, double d3, double d4, double d5, double d6, double d7, net.minecraft.e.e e2) {
        this.K.l.a(new an(this, d2, d3, d4, d5, d6, d7, this.K.l, e2));
    }

    @Override
    public void a(net.minecraft.x.p p2) {
        this.G.a(p2);
    }

    public void a(net.minecraft.j.r r2) {
        this.B = r2;
    }

    @Override
    public void a(long l2) {
        if (l2 < 0L) {
            l2 = -l2;
            this.G().a("doDaylightCycle", "false");
        } else {
            this.G().a("doDaylightCycle", "true");
        }
        super.a(l2);
    }

    public e h() {
        return (e)super.i();
    }

    @Override
    public /* synthetic */ f i() {
        return this.h();
    }

    static /* synthetic */ Set a(d d2) {
        return d2.I;
    }

    static /* synthetic */ Set b(d d2) {
        return d2.J;
    }

    static /* synthetic */ r c(d d2) {
        return d2.K;
    }
}

