/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import io.netty.b.bi;
import net.minecraft.a.p;
import net.minecraft.client.c.e;
import net.minecraft.client.i.d;
import net.minecraft.client.l.g;
import net.minecraft.client.r;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.g.fr;
import net.minecraft.g.fy;
import net.minecraft.h.ae;
import net.minecraft.m.ar;
import net.minecraft.m.ca;
import net.minecraft.m.cu;
import net.minecraft.q.am;
import net.minecraft.q.k;
import net.minecraft.r.f;
import net.minecraft.u.a;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.u.bu;
import net.minecraft.w.h.al;
import net.minecraft.w.n;
import net.minecraft.x.d.a.ab;
import net.minecraft.x.d.a.ac;
import net.minecraft.x.d.a.af;
import net.minecraft.x.d.a.ag;
import net.minecraft.x.d.a.ai;
import net.minecraft.x.d.a.j;
import net.minecraft.x.d.a.m;
import net.minecraft.x.d.a.q;

public class l {
    private final r a;
    private final g b;
    private net.minecraft.u.b.b c = new net.minecraft.u.b.b(-1, -1, -1);
    private cu d;
    private float e;
    private float f;
    private int g;
    private boolean h;
    private am i = am.b;
    private int j;

    public l(r r2, g g2) {
        this.a = r2;
        this.b = g2;
    }

    public static void a(r r2, l l2, net.minecraft.u.b.b b2, ad ad2) {
        if (!r2.h.a(r2.j, b2, ad2)) {
            l2.a(b2);
        }
    }

    public void a(net.minecraft.w.a.b b2) {
        this.i.a(b2.J);
    }

    public boolean a() {
        return this.i == am.e;
    }

    public void a(am am2) {
        this.i = am2;
        this.i.a(this.a.j.J);
    }

    public void b(net.minecraft.w.a.b b2) {
        b2.ba = -180.0f;
    }

    public boolean b() {
        return this.i.e();
    }

    public boolean a(net.minecraft.u.b.b b2) {
        cu cu2;
        Object object;
        if (this.i.c()) {
            if (this.i == am.e) {
                return false;
            }
            if (!this.a.j.ar()) {
                object = this.a.j.bC();
                if (object == null) {
                    return false;
                }
                if (!((cu)object).a(this.a.h.n(b2).c())) {
                    return false;
                }
            }
        }
        if (this.i.d() && this.a.j.bC() != null && this.a.j.bC().a() instanceof ca) {
            return false;
        }
        object = this.a.h;
        b b3 = ((k)object).n(b2);
        cn cn2 = b3.c();
        if ((cn2 instanceof fr || cn2 instanceof fy) && !this.a.j.aN()) {
            return false;
        }
        if (b3.d() == net.minecraft.g.a.h.a) {
            return false;
        }
        ((k)object).b(2001, b2, cn.p(b3));
        cn2.a((k)object, b2, b3, this.a.j);
        boolean bl2 = ((k)object).a(b2, p.a.v(), 11);
        if (bl2) {
            cn2.a_((k)object, b2, b3);
        }
        this.c = new net.minecraft.u.b.b(this.c.cy_(), -1, this.c.l());
        if (!this.i.d() && (cu2 = this.a.j.bC()) != null) {
            cu2.a((k)object, b3, b2, this.a.j);
            if (cu2.b == 0) {
                this.a.j.a(ah.a, null);
            }
        }
        return bl2;
    }

    public boolean a(net.minecraft.u.b.b b2, ad ad2) {
        Object object;
        if (this.i.c()) {
            if (this.i == am.e) {
                return false;
            }
            if (!this.a.j.ar()) {
                object = this.a.j.bC();
                if (object == null) {
                    return false;
                }
                if (!((cu)object).a(this.a.h.n(b2).c())) {
                    return false;
                }
            }
        }
        if (!this.a.h.V().a(b2)) {
            return false;
        }
        if (this.i.d()) {
            this.b.a(new ab(net.minecraft.x.d.a.ae.a, b2, ad2));
            l.a(this.a, this, b2, ad2);
            this.g = 5;
        } else if (!this.h || !this.b(b2)) {
            boolean bl2;
            if (this.h) {
                this.b.a(new ab(net.minecraft.x.d.a.ae.b, this.c, ad2));
            }
            this.b.a(new ab(net.minecraft.x.d.a.ae.a, b2, ad2));
            object = this.a.h.n(b2);
            boolean bl3 = bl2 = object.d() != net.minecraft.g.a.h.a;
            if (bl2 && this.e == 0.0f) {
                object.c().a((k)this.a.h, b2, this.a.j);
            }
            if (bl2 && object.a(this.a.j, this.a.j.aQ, b2) >= 1.0f) {
                this.a(b2);
            } else {
                this.h = true;
                this.c = b2;
                this.d = this.a.j.bC();
                this.e = 0.0f;
                this.f = 0.0f;
                this.a.h.c(this.a.j.ca(), this.c, (int)(this.e * 10.0f) - 1);
            }
        }
        return true;
    }

    public void c() {
        if (this.h) {
            this.b.a(new ab(net.minecraft.x.d.a.ae.b, this.c, ad.a));
            this.h = false;
            this.e = 0.0f;
            this.a.h.c(this.a.j.ca(), this.c, -1);
            this.a.j.aJ();
        }
    }

    public boolean b(net.minecraft.u.b.b b2, ad ad2) {
        this.n();
        if (this.g > 0) {
            --this.g;
            return true;
        }
        if (this.i.d() && this.a.h.V().a(b2)) {
            this.g = 5;
            this.b.a(new ab(net.minecraft.x.d.a.ae.a, b2, ad2));
            l.a(this.a, this, b2, ad2);
            return true;
        }
        if (this.b(b2)) {
            b b3 = this.a.h.n(b2);
            cn cn2 = b3.c();
            if (b3.d() == net.minecraft.g.a.h.a) {
                this.h = false;
                return false;
            }
            this.e += b3.a(this.a.j, this.a.j.aQ, b2);
            if (this.f % 4.0f == 0.0f) {
                fk fk2 = cn2.w();
                this.a.U().a(new e(fk2.f(), bu.g, (fk2.a() + 1.0f) / 8.0f, fk2.b() * 0.5f, b2));
            }
            this.f += 1.0f;
            if (this.e >= 1.0f) {
                this.h = false;
                this.b.a(new ab(net.minecraft.x.d.a.ae.c, b2, ad2));
                this.a(b2);
                this.e = 0.0f;
                this.f = 0.0f;
                this.g = 5;
            }
            this.a.h.c(this.a.j.ca(), this.c, (int)(this.e * 10.0f) - 1);
            return true;
        }
        return this.a(b2, ad2);
    }

    public float d() {
        return this.i.d() ? 5.0f : 4.5f;
    }

    public void e() {
        this.n();
        if (this.b.b().e()) {
            this.b.b().a();
        } else {
            this.b.b().j();
        }
    }

    private boolean b(net.minecraft.u.b.b b2) {
        boolean bl2;
        cu cu2 = this.a.j.bC();
        boolean bl3 = bl2 = this.d == null && cu2 == null;
        if (this.d != null && cu2 != null) {
            boolean bl4 = bl2 = cu2.a() == this.d.a() && cu.a(cu2, this.d) && (cu2.d() || cu2.h() == this.d.h());
        }
        return b2.equals(this.c) && bl2;
    }

    private void n() {
        int n2 = this.a.j.q.d;
        if (n2 != this.j) {
            this.j = n2;
            this.b.a(new q(this.j));
        }
    }

    public net.minecraft.u.ab a(net.minecraft.client.h.d d2, d d3, cu cu2, net.minecraft.u.b.b b2, ad ad2, s s2, ah ah2) {
        Object object;
        this.n();
        float f2 = (float)(s2.b - (double)b2.cy_());
        float f3 = (float)(s2.c - (double)b2.k());
        float f4 = (float)(s2.d - (double)b2.l());
        boolean bl2 = false;
        if (!this.a.h.V().a(b2)) {
            return net.minecraft.u.ab.c;
        }
        if (this.i != am.e) {
            ar ar2;
            object = d3.n(b2);
            if ((!d2.G() || d2.bC() == null && d2.bD() == null) && object.c().a(d3, b2, (b)object, d2, ah2, cu2, ad2, f2, f3, f4)) {
                bl2 = true;
            }
            if (!bl2 && cu2 != null && cu2.a() instanceof ar && !(ar2 = (ar)cu2.a()).a(d3, b2, ad2, d2, cu2)) {
                return net.minecraft.u.ab.c;
            }
        }
        this.b.a(new ac(b2, ad2, ah2, f2, f3, f4));
        if (!bl2 && this.i != am.e) {
            if (cu2 == null) {
                return net.minecraft.u.ab.b;
            }
            if (d2.aL().a(cu2.a())) {
                return net.minecraft.u.ab.b;
            }
            if (cu2.a() instanceof ar && !d2.aN() && ((object = ((ar)cu2.a()).e()) instanceof fr || object instanceof fy)) {
                return net.minecraft.u.ab.c;
            }
            if (this.i.d()) {
                int n2 = cu2.h();
                int n3 = cu2.b;
                net.minecraft.u.ab ab2 = cu2.a(d2, d3, b2, ah2, ad2, f2, f3, f4);
                cu2.b(n2);
                cu2.b = n3;
                return ab2;
            }
            return cu2.a(d2, d3, b2, ah2, ad2, f2, f3, f4);
        }
        return net.minecraft.u.ab.a;
    }

    public net.minecraft.u.ab a(net.minecraft.w.a.b b2, k k2, cu cu2, ah ah2) {
        if (this.i == am.e) {
            return net.minecraft.u.ab.b;
        }
        this.n();
        this.b.a(new ag(ah2));
        if (b2.aL().a(cu2.a())) {
            return net.minecraft.u.ab.b;
        }
        int n2 = cu2.b;
        a a2 = cu2.a(k2, b2, ah2);
        cu cu3 = (cu)a2.b();
        if (cu3 != cu2 || cu3.b != n2) {
            b2.a(ah2, cu3);
            if (cu3.b == 0) {
                b2.a(ah2, null);
            }
        }
        return a2.a();
    }

    public net.minecraft.client.h.d a(k k2, f f2) {
        return new net.minecraft.client.h.d(this.a, k2, this.b, f2);
    }

    public void a(net.minecraft.w.a.b b2, n n2) {
        this.n();
        this.b.a(new m(n2));
        if (this.i != am.e) {
            b2.c(n2);
            b2.aJ();
        }
    }

    public net.minecraft.u.ab a(net.minecraft.w.a.b b2, n n2, cu cu2, ah ah2) {
        this.n();
        this.b.a(new m(n2, ah2));
        return this.i == am.e ? net.minecraft.u.ab.b : b2.a(n2, cu2, ah2);
    }

    public net.minecraft.u.ab a(net.minecraft.w.a.b b2, n n2, o o2, cu cu2, ah ah2) {
        this.n();
        s s2 = new s(o2.c.b - n2.aU, o2.c.c - n2.aV, o2.c.d - n2.aW);
        this.b.a(new m(n2, ah2, s2));
        return this.i == am.e ? net.minecraft.u.ab.b : n2.a(b2, s2, cu2, ah2);
    }

    public cu a(int n2, int n3, int n4, ae ae2, net.minecraft.w.a.b b2) {
        short s2 = b2.s.a(b2.q);
        cu cu2 = b2.s.a(n3, n4, ae2, b2);
        this.b.a(new af(n2, n3, n4, ae2, cu2, s2));
        return cu2;
    }

    public void a(int n2, int n3) {
        this.b.a(new ai(n2, n3));
    }

    public void a(cu cu2, int n2) {
        if (this.i.d()) {
            this.b.a(new net.minecraft.x.d.a.r(n2, cu2));
        }
    }

    public void a(cu cu2) {
        if (this.i.d() && cu2 != null) {
            this.b.a(new net.minecraft.x.d.a.r(-1, cu2));
        }
    }

    public void c(net.minecraft.w.a.b b2) {
        this.n();
        this.b.a(new ab(net.minecraft.x.d.a.ae.f, net.minecraft.u.b.b.c, ad.a));
        b2.bU();
    }

    public boolean f() {
        return this.i.e();
    }

    public boolean g() {
        return !this.i.d();
    }

    public boolean h() {
        return this.i.d();
    }

    public boolean i() {
        return this.i.d();
    }

    public boolean j() {
        return this.a.j.cz() && this.a.j.df() instanceof al;
    }

    public boolean k() {
        return this.i == am.e;
    }

    public am l() {
        return this.i;
    }

    public boolean m() {
        return this.h;
    }

    public void a(int n2) {
        this.b.a(new j("MC|PickItem", new net.minecraft.x.a(bi.a()).d(n2)));
    }
}

