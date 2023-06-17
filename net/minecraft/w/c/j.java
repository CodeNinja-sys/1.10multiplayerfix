/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.a.c;
import net.minecraft.a.f;
import net.minecraft.e.e;
import net.minecraft.e.u;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.b.o;
import net.minecraft.u.b.t;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;
import net.minecraft.w.c.n;
import net.minecraft.w.l;

public class j
extends net.minecraft.w.n {
    private l a;
    private net.minecraft.w.n b;
    private ad c;
    private int d;
    private double e;
    private double f;
    private double g;
    private UUID h;
    private net.minecraft.u.b.b i;
    private UUID j;
    private net.minecraft.u.b.b k;

    public j(k k2) {
        super(k2);
        this.d(0.3125f, 0.3125f);
        this.bv = true;
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.f;
    }

    public j(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(k2);
        this.b(d2, d3, d4, this.ba, this.bb);
        this.aX = d5;
        this.aY = d6;
        this.aZ = d7;
    }

    public j(k k2, l l2, net.minecraft.w.n n2, ae ae2) {
        this(k2);
        this.a = l2;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(l2);
        double d2 = (double)b2.cy_() + 0.5;
        double d3 = (double)b2.k() + 0.5;
        double d4 = (double)b2.l() + 0.5;
        this.b(d2, d3, d4, this.ba, this.bb);
        this.b = n2;
        this.c = ad.b;
        this.a(ae2);
    }

    @Override
    protected void a(e e2) {
        e e3;
        net.minecraft.u.b.b b2;
        if (this.a != null) {
            b2 = new net.minecraft.u.b.b(this.a);
            e3 = u.a(this.a.cM());
            e3.a("X", b2.cy_());
            e3.a("Y", b2.k());
            e3.a("Z", b2.l());
            e2.a("Owner", e3);
        }
        if (this.b != null) {
            b2 = new net.minecraft.u.b.b(this.b);
            e3 = u.a(this.b.cM());
            e3.a("X", b2.cy_());
            e3.a("Y", b2.k());
            e3.a("Z", b2.l());
            e2.a("Target", e3);
        }
        if (this.c != null) {
            e2.a("Dir", this.c.b());
        }
        e2.a("Steps", this.d);
        e2.a("TXD", this.e);
        e2.a("TYD", this.f);
        e2.a("TZD", this.g);
    }

    @Override
    protected void b(e e2) {
        e e3;
        this.d = e2.h("Steps");
        this.e = e2.k("TXD");
        this.f = e2.k("TYD");
        this.g = e2.k("TZD");
        if (e2.b("Dir", 99)) {
            this.c = ad.a(e2.h("Dir"));
        }
        if (e2.b("Owner", 10)) {
            e3 = e2.o("Owner");
            this.h = u.b(e3);
            this.i = new net.minecraft.u.b.b(e3.h("X"), e3.h("Y"), e3.h("Z"));
        }
        if (e2.b("Target", 10)) {
            e3 = e2.o("Target");
            this.j = u.b(e3);
            this.k = new net.minecraft.u.b.b(e3.h("X"), e3.h("Y"), e3.h("Z"));
        }
    }

    @Override
    protected void cb_() {
    }

    private void a(ad ad2) {
        this.c = ad2;
    }

    private void a(ae ae2) {
        net.minecraft.u.b.b b2;
        double d2 = 0.5;
        if (this.b == null) {
            b2 = new net.minecraft.u.b.b(this).c();
        } else {
            d2 = (double)this.b.bm * 0.5;
            b2 = new net.minecraft.u.b.b(this.b.aU, this.b.aV + d2, this.b.aW);
        }
        double d3 = (double)b2.cy_() + 0.5;
        double d4 = (double)b2.k() + d2;
        double d5 = (double)b2.l() + 0.5;
        ad ad2 = null;
        if (b2.f(this.aU, this.aV, this.aW) >= 4.0) {
            net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(this);
            ArrayList arrayList = ov.a();
            if (ae2 != ae.a) {
                if (b3.cy_() < b2.cy_() && this.aQ.c(b3.g())) {
                    arrayList.add(ad.f);
                } else if (b3.cy_() > b2.cy_() && this.aQ.c(b3.f())) {
                    arrayList.add(ad.e);
                }
            }
            if (ae2 != ae.b) {
                if (b3.k() < b2.k() && this.aQ.c(b3.b())) {
                    arrayList.add(ad.b);
                } else if (b3.k() > b2.k() && this.aQ.c(b3.c())) {
                    arrayList.add(ad.a);
                }
            }
            if (ae2 != ae.c) {
                if (b3.l() < b2.l() && this.aQ.c(b3.e())) {
                    arrayList.add(ad.d);
                } else if (b3.l() > b2.l() && this.aQ.c(b3.d())) {
                    arrayList.add(ad.c);
                }
            }
            ad2 = ad.a(this.bx);
            if (arrayList.isEmpty()) {
                for (int i2 = 5; !this.aQ.c(b3.a(ad2)) && i2 > 0; --i2) {
                    ad2 = ad.a(this.bx);
                }
            } else {
                ad2 = (ad)arrayList.get(this.bx.nextInt(arrayList.size()));
            }
            d3 = this.aU + (double)ad2.h();
            d4 = this.aV + (double)ad2.i();
            d5 = this.aW + (double)ad2.j();
        }
        this.a(ad2);
        double d6 = d3 - this.aU;
        double d7 = d4 - this.aV;
        double d8 = d5 - this.aW;
        double d9 = net.minecraft.u.b.n.a(d6 * d6 + d7 * d7 + d8 * d8);
        if (d9 == 0.0) {
            this.e = 0.0;
            this.f = 0.0;
            this.g = 0.0;
        } else {
            this.e = d6 / d9 * 0.15;
            this.f = d7 / d9 * 0.15;
            this.g = d8 / d9 * 0.15;
        }
        this.bO = true;
        this.d = 10 + this.bx.nextInt(5) * 10;
    }

    @Override
    public void cE_() {
        if (!this.aQ.C && this.aQ.R() == net.minecraft.q.l.a) {
            this.aa();
        } else {
            Object object2;
            super.cE_();
            if (!this.aQ.C) {
                if (this.b == null && this.j != null) {
                    for (Object object2 : this.aQ.a(l.class, new a(this.k.a(-2, -2, -2), this.k.a(2, 2, 2)))) {
                        if (!((net.minecraft.w.n)object2).cM().equals(this.j)) continue;
                        this.b = object2;
                        break;
                    }
                    this.j = null;
                }
                if (this.a == null && this.h != null) {
                    for (Object object2 : this.aQ.a(l.class, new a(this.i.a(-2, -2, -2), this.i.a(2, 2, 2)))) {
                        if (!((net.minecraft.w.n)object2).cM().equals(this.h)) continue;
                        this.a = object2;
                        break;
                    }
                    this.h = null;
                }
                if (this.b == null || !this.b.br() || this.b instanceof b && ((b)this.b).a()) {
                    if (!this.ci()) {
                        this.aY -= 0.04;
                    }
                } else {
                    this.e = net.minecraft.u.b.n.a(this.e * 1.025, -1.0, 1.0);
                    this.f = net.minecraft.u.b.n.a(this.f * 1.025, -1.0, 1.0);
                    this.g = net.minecraft.u.b.n.a(this.g * 1.025, -1.0, 1.0);
                    this.aX += (this.e - this.aX) * 0.2;
                    this.aY += (this.f - this.aY) * 0.2;
                    this.aZ += (this.g - this.aZ) * 0.2;
                }
                if ((object2 = n.a(this, true, false, this.a)) != null) {
                    this.a((o)object2);
                }
            }
            this.e(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
            n.a(this, 0.5f);
            if (this.aQ.C) {
                this.aQ.a(aj.R, this.aU - this.aX, this.aV - this.aY + 0.15, this.aW - this.aZ, 0.0, 0.0, 0.0, new int[0]);
            } else if (this.b != null && !this.b.bk) {
                if (this.d > 0) {
                    --this.d;
                    if (this.d == 0) {
                        this.a(this.c == null ? null : this.c.l());
                    }
                }
                if (this.c != null) {
                    object2 = new net.minecraft.u.b.b(this);
                    ae ae2 = this.c.l();
                    if (this.aQ.d(((net.minecraft.u.b.b)object2).a(this.c), false)) {
                        this.a(ae2);
                    } else {
                        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.b);
                        if (ae2 == ae.a && ((t)object2).cy_() == b2.cy_() || ae2 == ae.c && ((t)object2).l() == b2.l() || ae2 == ae.b && ((t)object2).k() == b2.k()) {
                            this.a(ae2);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean cy() {
        return false;
    }

    @Override
    public boolean a(double d2) {
        return d2 < 16384.0;
    }

    @Override
    public float n(float f2) {
        return 1.0f;
    }

    @Override
    public int m(float f2) {
        return 0xF000F0;
    }

    protected void a(o o2) {
        if (o2.d == null) {
            ((v)this.aQ).a(aj.b, this.aU, this.aV, this.aW, 2, 0.2, 0.2, 0.2, 0.0, new int[0]);
            this.a(net.minecraft.a.f.fg, 1.0f, 1.0f);
        } else {
            boolean bl2 = o2.d.a(net.minecraft.u.n.a((net.minecraft.w.n)this, this.a).b(), 4.0f);
            if (bl2) {
                this.a(this.a, o2.d);
                if (o2.d instanceof l) {
                    ((l)o2.d).c(new net.minecraft.d.j(net.minecraft.a.c.y, 200));
                }
            }
        }
        this.aa();
    }

    @Override
    public boolean cg_() {
        return true;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (!this.aQ.C) {
            this.a(net.minecraft.a.f.fh, 1.0f, 1.0f);
            ((v)this.aQ).a(aj.j, this.aU, this.aV, this.aW, 15, 0.2, 0.2, 0.2, 0.0, new int[0]);
            this.aa();
        }
        return true;
    }
}

