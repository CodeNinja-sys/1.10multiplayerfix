/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.d.aad;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.g.ar;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.d;
import net.minecraft.client.g.c.o;
import net.minecraft.client.g.e.m;
import net.minecraft.client.g.e.p;
import net.minecraft.client.g.e.s;
import net.minecraft.client.g.e.u;
import net.minecraft.client.g.g;
import net.minecraft.client.g.j;
import net.minecraft.client.g.v;
import net.minecraft.client.r;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.at;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.c;

public class q {
    private k d;
    private final ar e;
    public static int a;
    public u b = u.a;
    private final ReentrantLock f = new ReentrantLock();
    private final ReentrantLock g = new ReentrantLock();
    private net.minecraft.client.g.e.g h;
    private final Set i = aad.a();
    private final int j;
    private final FloatBuffer k = v.e(16);
    private final net.minecraft.client.g.d.c[] l = new net.minecraft.client.g.d.c[net.minecraft.u.c.values().length];
    public a c;
    private int m = -1;
    private boolean n = true;
    private net.minecraft.u.b.g o = new net.minecraft.u.b.g(-1, -1, -1);
    private net.minecraft.u.b.g[] p = new net.minecraft.u.b.g[6];
    private boolean q;
    private n r;

    public q(k k2, ar ar2, int n2) {
        int n3;
        for (n3 = 0; n3 < this.p.length; ++n3) {
            this.p[n3] = new net.minecraft.u.b.g();
        }
        this.d = k2;
        this.e = ar2;
        this.j = n2;
        if (ay.f()) {
            for (n3 = 0; n3 < net.minecraft.u.c.values().length; ++n3) {
                this.l[n3] = new net.minecraft.client.g.d.c(net.minecraft.client.g.d.b.a);
            }
        }
    }

    public boolean a(int n2) {
        if (this.m == n2) {
            return false;
        }
        this.m = n2;
        return true;
    }

    public net.minecraft.client.g.d.c b(int n2) {
        return this.l[n2];
    }

    public void a(int n2, int n3, int n4) {
        if (n2 != this.o.cy_() || n3 != this.o.k() || n4 != this.o.l()) {
            this.i();
            this.o.b(n2, n3, n4);
            this.c = new a(n2, n3, n4, n2 + 16, n3 + 16, n4 + 16);
            for (ad ad2 : ad.values()) {
                this.p[ad2.ordinal()].e(this.o).b(ad2, 16);
            }
            this.p();
        }
    }

    public void a(float f2, float f3, float f4, net.minecraft.client.g.e.g g2) {
        u u2 = g2.c();
        if (u2.c() != null && !u2.c(net.minecraft.u.c.d)) {
            this.a(g2.d().a(net.minecraft.u.c.d), this.o);
            g2.d().a(net.minecraft.u.c.d).a(u2.c());
            this.a(net.minecraft.u.c.d, f2, f3, f4, g2.d().a(net.minecraft.u.c.d), u2);
        }
    }

    public void b(float f2, float f3, float f4, net.minecraft.client.g.e.g g2) {
        Object object;
        Object object2;
        u u2 = new u();
        boolean bl2 = true;
        net.minecraft.u.b.g g3 = this.o;
        net.minecraft.u.b.b b2 = g3.a(15, 15, 15);
        g2.f().lock();
        try {
            if (g2.a() != net.minecraft.client.g.e.m.b) {
                return;
            }
            g2.a(u2);
        }
        finally {
            g2.f().unlock();
        }
        p p2 = new p();
        HashSet hashSet = aad.a();
        if (!this.r.N()) {
            ++a;
            object2 = new boolean[net.minecraft.u.c.values().length];
            object = net.minecraft.client.r.z().aa();
            for (net.minecraft.u.b.g object3 : net.minecraft.u.b.b.b(g3, b2)) {
                o o2;
                Object object4;
                b b3 = this.r.n(object3);
                cn cn2 = b3.c();
                if (b3.s()) {
                    p2.a(object3);
                }
                if (cn2.n() && (object4 = this.r.q(new net.minecraft.u.b.b(object3))) != null && (o2 = net.minecraft.client.g.c.d.a.a((ap)object4)) != null) {
                    u2.a((ap)object4);
                    if (o2.a((ap)object4)) {
                        hashSet.add(object4);
                    }
                }
                object4 = cn2.bR_();
                int n2 = object4.ordinal();
                if (cn2.v().l() == ac.a) continue;
                g g4 = g2.d().a(n2);
                if (!u2.d((c)((Object)object4))) {
                    u2.b((c)((Object)object4));
                    this.a(g4, g3);
                }
                Object object5 = object2;
                int n3 = n2;
                object5[n3] = object5[n3] | ((j)object).a(b3, (net.minecraft.u.b.b)object3, this.r, g4);
            }
            for (c c2 : net.minecraft.u.c.values()) {
                if (object2[c2.ordinal()] != false) {
                    u2.a(c2);
                }
                if (!u2.d(c2)) continue;
                this.a(c2, f2, f3, f4, g2.d().a(c2), u2);
            }
        }
        u2.a(p2.a());
        this.f.lock();
        try {
            object2 = aad.b((Iterable)hashSet);
            object = aad.b((Iterable)this.i);
            object2.removeAll(this.i);
            object.removeAll(hashSet);
            this.i.clear();
            this.i.addAll(hashSet);
            this.e.a((Collection)object, (Collection)object2);
        }
        finally {
            this.f.unlock();
        }
    }

    protected void b() {
        this.f.lock();
        try {
            if (this.h != null && this.h.a() != net.minecraft.client.g.e.m.d) {
                this.h.e();
                this.h = null;
            }
        }
        finally {
            this.f.unlock();
        }
    }

    public ReentrantLock c() {
        return this.f;
    }

    public net.minecraft.client.g.e.g d() {
        net.minecraft.client.g.e.g g2;
        this.f.lock();
        try {
            this.b();
            this.h = new net.minecraft.client.g.e.g(this, s.a, this.f());
            this.o();
            g2 = this.h;
        }
        finally {
            this.f.unlock();
        }
        return g2;
    }

    private void o() {
        boolean bl2 = true;
        this.r = new at(this.d, this.o.a(-1, -1, -1), this.o.a(16, 16, 16), 1);
    }

    public net.minecraft.client.g.e.g e() {
        net.minecraft.client.g.e.g g2;
        this.f.lock();
        try {
            if (this.h == null || this.h.a() != net.minecraft.client.g.e.m.a) {
                net.minecraft.client.g.e.g g3;
                if (this.h != null && this.h.a() != net.minecraft.client.g.e.m.d) {
                    this.h.e();
                    this.h = null;
                }
                this.h = new net.minecraft.client.g.e.g(this, s.b, this.f());
                this.h.a(this.b);
                net.minecraft.client.g.e.g g4 = g3 = this.h;
                return g4;
            }
            g2 = null;
        }
        finally {
            this.f.unlock();
        }
        return g2;
    }

    protected double f() {
        net.minecraft.client.h.d d2 = net.minecraft.client.r.z().j;
        double d3 = this.c.a + 8.0 - d2.aU;
        double d4 = this.c.b + 8.0 - d2.aV;
        double d5 = this.c.c + 8.0 - d2.aW;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    private void a(g g2, net.minecraft.u.b.b b2) {
        g2.a(7, net.minecraft.client.g.d.b.a);
        g2.c((double)(-b2.cy_()), (double)(-b2.k()), (double)(-b2.l()));
    }

    private void a(c c2, float f2, float f3, float f4, g g2, u u2) {
        if (c2 == net.minecraft.u.c.d && !u2.c(c2)) {
            g2.a(f2, f3, f4);
            u2.a(g2.a());
        }
        g2.e();
    }

    private void p() {
        bd.D();
        bd.C();
        float f2 = 1.000001f;
        bd.c(-8.0f, -8.0f, -8.0f);
        bd.b(1.000001f, 1.000001f, 1.000001f);
        bd.c(8.0f, 8.0f, 8.0f);
        bd.c(2982, this.k);
        bd.E();
    }

    public void g() {
        bd.a(this.k);
    }

    public u h() {
        return this.b;
    }

    public void a(u u2) {
        this.g.lock();
        try {
            this.b = u2;
        }
        finally {
            this.g.unlock();
        }
    }

    public void i() {
        this.b();
        this.b = u.a;
    }

    public void a() {
        this.i();
        this.d = null;
        for (int i2 = 0; i2 < net.minecraft.u.c.values().length; ++i2) {
            if (this.l[i2] == null) continue;
            this.l[i2].c();
        }
    }

    public net.minecraft.u.b.b j() {
        return this.o;
    }

    public void a(boolean bl2) {
        if (this.n) {
            bl2 |= this.q;
        }
        this.n = true;
        this.q = bl2;
    }

    public void k() {
        this.n = false;
        this.q = false;
    }

    public boolean l() {
        return this.n;
    }

    public boolean m() {
        return this.n && this.q;
    }

    public net.minecraft.u.b.b a(ad ad2) {
        return this.p[ad2.ordinal()];
    }

    public k n() {
        return this.d;
    }
}

