/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fr;
import net.minecraft.g.fy;
import net.minecraft.g.ib;
import net.minecraft.h.y;
import net.minecraft.m.ar;
import net.minecraft.m.ca;
import net.minecraft.m.cu;
import net.minecraft.q.al;
import net.minecraft.q.am;
import net.minecraft.q.v;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.az;
import net.minecraft.x.d.b.bm;
import net.minecraft.x.d.b.bx;

public class k {
    public net.minecraft.q.k a;
    public g b;
    private am c = am.a;
    private boolean d;
    private int e;
    private net.minecraft.u.b.b f = net.minecraft.u.b.b.c;
    private int g;
    private boolean h;
    private net.minecraft.u.b.b i = net.minecraft.u.b.b.c;
    private int j;
    private int k = -1;

    public k(net.minecraft.q.k k2) {
        this.a = k2;
    }

    public void a(am am2) {
        this.c = am2;
        am2.a(this.b.J);
        this.b.t();
        this.b.b.av().a(new bm(az.b, this.b));
        this.a.H();
    }

    public am a() {
        return this.c;
    }

    public boolean b() {
        return this.c.e();
    }

    public boolean c() {
        return this.c.d();
    }

    public void b(am am2) {
        if (this.c == am.a) {
            this.c = am2;
        }
        this.a(this.c);
    }

    public void d() {
        ++this.g;
        if (this.h) {
            int n2 = this.g - this.j;
            b b2 = this.a.n(this.i);
            cn cn2 = b2.c();
            if (b2.d() == net.minecraft.g.a.h.a) {
                this.h = false;
            } else {
                float f2 = b2.a(this.b, this.b.aQ, this.i) * (float)(n2 + 1);
                int n3 = (int)(f2 * 10.0f);
                if (n3 != this.k) {
                    this.a.c(this.b.ca(), this.i, n3);
                    this.k = n3;
                }
                if (f2 >= 1.0f) {
                    this.h = false;
                    this.b(this.i);
                }
            }
        } else if (this.d) {
            b b3 = this.a.n(this.f);
            cn cn3 = b3.c();
            if (b3.d() == net.minecraft.g.a.h.a) {
                this.a.c(this.b.ca(), this.f, -1);
                this.k = -1;
                this.d = false;
            } else {
                int n4 = this.g - this.e;
                float f3 = b3.a(this.b, this.b.aQ, this.i) * (float)(n4 + 1);
                int n5 = (int)(f3 * 10.0f);
                if (n5 != this.k) {
                    this.a.c(this.b.ca(), this.f, n5);
                    this.k = n5;
                }
            }
        }
    }

    public void a(net.minecraft.u.b.b b2, ad ad2) {
        if (this.c()) {
            if (!this.a.a(null, b2, ad2)) {
                this.b(b2);
            }
        } else {
            b b3 = this.a.n(b2);
            cn cn2 = b3.c();
            if (this.c.c()) {
                if (this.c == am.e) {
                    return;
                }
                if (!this.b.ar()) {
                    cu cu2 = this.b.bC();
                    if (cu2 == null) {
                        return;
                    }
                    if (!cu2.a(cn2)) {
                        return;
                    }
                }
            }
            this.a.a(null, b2, ad2);
            this.e = this.g;
            float f2 = 1.0f;
            if (b3.d() != net.minecraft.g.a.h.a) {
                cn2.a(this.a, b2, this.b);
                f2 = b3.a(this.b, this.b.aQ, b2);
            }
            if (b3.d() != net.minecraft.g.a.h.a && f2 >= 1.0f) {
                this.b(b2);
            } else {
                this.d = true;
                this.f = b2;
                int n2 = (int)(f2 * 10.0f);
                this.a.c(this.b.ca(), b2, n2);
                this.k = n2;
            }
        }
    }

    public void a(net.minecraft.u.b.b b2) {
        if (b2.equals(this.f)) {
            int n2 = this.g - this.e;
            b b3 = this.a.n(b2);
            if (b3.d() != net.minecraft.g.a.h.a) {
                float f2 = b3.a(this.b, this.b.aQ, b2) * (float)(n2 + 1);
                if (f2 >= 0.7f) {
                    this.d = false;
                    this.a.c(this.b.ca(), b2, -1);
                    this.b(b2);
                } else if (!this.h) {
                    this.d = false;
                    this.h = true;
                    this.i = b2;
                    this.j = this.e;
                }
            }
        }
    }

    public void e() {
        this.d = false;
        this.a.c(this.b.ca(), this.f, -1);
    }

    private boolean c(net.minecraft.u.b.b b2) {
        b b3 = this.a.n(b2);
        b3.c().a(this.a, b2, b3, this.b);
        boolean bl2 = this.a.f(b2);
        if (bl2) {
            b3.c().a_(this.a, b2, b3);
        }
        return bl2;
    }

    public boolean b(net.minecraft.u.b.b b2) {
        if (this.c.d() && this.b.bC() != null && this.b.bC().a() instanceof ca) {
            return false;
        }
        b b3 = this.a.n(b2);
        ap ap2 = this.a.q(b2);
        cn cn2 = b3.c();
        if ((cn2 instanceof fr || cn2 instanceof fy) && !this.b.aN()) {
            this.a.a(b2, b3, b3, 3);
            return false;
        }
        if (this.c.c()) {
            if (this.c == am.e) {
                return false;
            }
            if (!this.b.ar()) {
                cu cu2 = this.b.bC();
                if (cu2 == null) {
                    return false;
                }
                if (!cu2.a(cn2)) {
                    return false;
                }
            }
        }
        this.a.a(this.b, 2001, b2, cn.p(b3));
        boolean bl2 = this.c(b2);
        if (this.c()) {
            this.b.a.a(new bx(this.a, b2));
        } else {
            cu cu3 = this.b.bC();
            cu cu4 = cu3 == null ? null : cu3.j();
            boolean bl3 = this.b.b(b3);
            if (cu3 != null) {
                cu3.a(this.a, b3, b2, this.b);
                if (cu3.b == 0) {
                    this.b.a(ah.a, null);
                }
            }
            if (bl2 && bl3) {
                b3.c().a(this.a, this.b, b2, b3, ap2, cu4);
            }
        }
        return bl2;
    }

    public ab a(net.minecraft.w.a.b b2, net.minecraft.q.k k2, cu cu2, ah ah2) {
        if (this.c == am.e) {
            return ab.b;
        }
        if (b2.aL().a(cu2.a())) {
            return ab.b;
        }
        int n2 = cu2.b;
        int n3 = cu2.h();
        a a2 = cu2.a(k2, b2, ah2);
        cu cu3 = (cu)a2.b();
        if (cu3 == cu2 && cu3.b == n2 && cu3.l() <= 0 && cu3.h() == n3) {
            return a2.a();
        }
        b2.a(ah2, cu3);
        if (this.c()) {
            cu3.b = n2;
            if (cu3.d()) {
                cu3.b(n3);
            }
        }
        if (cu3.b == 0) {
            b2.a(ah2, null);
        }
        if (!b2.B()) {
            ((g)b2).a(b2.r);
        }
        return a2.a();
    }

    public ab a(net.minecraft.w.a.b b2, net.minecraft.q.k k2, cu cu2, ah ah2, net.minecraft.u.b.b b3, ad ad2, float f2, float f3, float f4) {
        Object object;
        if (this.c == am.e) {
            ap ap2 = k2.q(b3);
            if (ap2 instanceof al) {
                cn cn2 = k2.n(b3).c();
                al al2 = (al)((Object)ap2);
                if (al2 instanceof u && cn2 instanceof ib) {
                    al2 = ((ib)cn2).c(k2, b3);
                }
                if (al2 != null) {
                    b2.a(al2);
                    return ab.a;
                }
            } else if (ap2 instanceof y) {
                b2.a((y)((Object)ap2));
                return ab.a;
            }
            return ab.b;
        }
        if ((!b2.G() || b2.bC() == null && b2.bD() == null) && (object = k2.n(b3)).c().a(k2, b3, (b)object, b2, ah2, cu2, ad2, f2, f3, f4)) {
            return ab.a;
        }
        if (cu2 == null) {
            return ab.b;
        }
        if (b2.aL().a(cu2.a())) {
            return ab.b;
        }
        if (cu2.a() instanceof ar && !b2.aN() && ((object = ((ar)cu2.a()).e()) instanceof fr || object instanceof fy)) {
            return ab.c;
        }
        if (this.c()) {
            int n2 = cu2.h();
            int n3 = cu2.b;
            ab ab2 = cu2.a(b2, k2, b3, ah2, ad2, f2, f3, f4);
            cu2.b(n2);
            cu2.b = n3;
            return ab2;
        }
        return cu2.a(b2, k2, b3, ah2, ad2, f2, f3, f4);
    }

    public void a(v v2) {
        this.a = v2;
    }
}

