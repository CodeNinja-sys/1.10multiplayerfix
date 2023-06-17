/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.f;
import net.minecraft.e.q;
import net.minecraft.f.ap;
import net.minecraft.f.i;
import net.minecraft.g.aq;
import net.minecraft.g.cn;
import net.minecraft.g.ib;
import net.minecraft.h.v;
import net.minecraft.h.w;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.a.b.e;
import net.minecraft.u.a.c;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.u.bu;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class u
extends i
implements y,
aw {
    private cu[] o = new cu[27];
    public boolean c;
    public u d;
    public u e;
    public u f;
    public u g;
    public float h;
    public float i;
    public int j;
    private int p;
    private aq q;
    private String r;

    public u() {
    }

    public u(aq aq2) {
        this.q = aq2;
    }

    @Override
    public int e() {
        return 27;
    }

    @Override
    public cu a(int n2) {
        this.a((b)null);
        return this.o[n2];
    }

    @Override
    public cu a(int n2, int n3) {
        this.a((b)null);
        cu cu2 = v.a(this.o, n2, n3);
        if (cu2 != null) {
            this.C();
        }
        return cu2;
    }

    @Override
    public cu b(int n2) {
        this.a((b)null);
        return v.a(this.o, n2);
    }

    @Override
    public void a(int n2, cu cu2) {
        this.a((b)null);
        this.o[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
        this.C();
    }

    @Override
    public String X() {
        return this.bO_() ? this.r : "container.chest";
    }

    @Override
    public boolean bO_() {
        return this.r != null && !this.r.isEmpty();
    }

    public void a(String string) {
        this.r = string;
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.d, (net.minecraft.u.a.e)new e("Chest", new String[]{"Items"}));
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.o = new cu[this.e()];
        if (e2.b("CustomName", 8)) {
            this.r = e2.l("CustomName");
        }
        if (!this.c(e2)) {
            q q2 = e2.c("Items", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                net.minecraft.e.e e3 = q2.b(i2);
                int n2 = e3.f("Slot") & 0xFF;
                if (n2 < 0 || n2 >= this.o.length) continue;
                this.o[n2] = cu.a(e3);
            }
        }
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        if (!this.d(e2)) {
            q q2 = new q();
            for (int i2 = 0; i2 < this.o.length; ++i2) {
                if (this.o[i2] == null) continue;
                net.minecraft.e.e e3 = new net.minecraft.e.e();
                e3.a("Slot", (byte)i2);
                this.o[i2].b(e3);
                q2.a(e3);
            }
            e2.a("Items", q2);
        }
        if (this.bO_()) {
            e2.a("CustomName", this.r);
        }
        return e2;
    }

    @Override
    public int g() {
        return 64;
    }

    @Override
    public boolean a_(b b2) {
        return this.k.q(this.l) != this ? false : b2.h((double)this.l.cy_() + 0.5, (double)this.l.k() + 0.5, (double)this.l.l() + 0.5) <= 64.0;
    }

    @Override
    public void bN_() {
        super.bN_();
        this.c = false;
    }

    private void a(u u2, ad ad2) {
        if (u2.F()) {
            this.c = false;
        } else if (this.c) {
            switch (ad2) {
                case c: {
                    if (this.d == u2) break;
                    this.c = false;
                    break;
                }
                case d: {
                    if (this.g == u2) break;
                    this.c = false;
                    break;
                }
                case f: {
                    if (this.e == u2) break;
                    this.c = false;
                    break;
                }
                case e: {
                    if (this.f == u2) break;
                    this.c = false;
                }
            }
        }
    }

    public void k() {
        if (!this.c) {
            this.c = true;
            this.f = this.a(ad.e);
            this.e = this.a(ad.f);
            this.d = this.a(ad.c);
            this.g = this.a(ad.d);
        }
    }

    protected u a(ad ad2) {
        ap ap2;
        net.minecraft.u.b.b b2 = this.l.a(ad2);
        if (this.a(b2) && (ap2 = this.k.q(b2)) instanceof u) {
            u u2 = (u)ap2;
            u2.a(this, ad2.e());
            return u2;
        }
        return null;
    }

    private boolean a(net.minecraft.u.b.b b2) {
        if (this.k == null) {
            return false;
        }
        cn cn2 = this.k.n(b2).c();
        return cn2 instanceof ib && ((ib)cn2).g == this.n();
    }

    @Override
    public void a() {
        float f2;
        this.k();
        int n2 = this.l.cy_();
        int n3 = this.l.k();
        int n4 = this.l.l();
        ++this.p;
        if (!this.k.C && this.j != 0 && (this.p + n2 + n3 + n4) % 200 == 0) {
            this.j = 0;
            f2 = 5.0f;
            for (b b2 : this.k.a(b.class, new net.minecraft.u.b.a((float)n2 - 5.0f, (float)n3 - 5.0f, (float)n4 - 5.0f, (float)(n2 + 1) + 5.0f, (float)(n3 + 1) + 5.0f, (float)(n4 + 1) + 5.0f))) {
                y y2;
                if (!(b2.s instanceof w) || (y2 = ((w)b2.s).b()) != this && (!(y2 instanceof net.minecraft.h.f) || !((net.minecraft.h.f)y2).a(this))) continue;
                ++this.j;
            }
        }
        this.i = this.h;
        f2 = 0.1f;
        if (this.j > 0 && this.h == 0.0f && this.d == null && this.f == null) {
            double d2 = (double)n2 + 0.5;
            double d3 = (double)n4 + 0.5;
            if (this.g != null) {
                d3 += 0.5;
            }
            if (this.e != null) {
                d2 += 0.5;
            }
            this.k.a(null, d2, (double)n3 + 0.5, d3, net.minecraft.a.f.X, bu.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
        }
        if (this.j == 0 && this.h > 0.0f || this.j > 0 && this.h < 1.0f) {
            float f3 = this.h;
            this.h = this.j > 0 ? (this.h += 0.1f) : (this.h -= 0.1f);
            if (this.h > 1.0f) {
                this.h = 1.0f;
            }
            float f4 = 0.5f;
            if (this.h < 0.5f && f3 >= 0.5f && this.d == null && this.f == null) {
                double d4 = (double)n2 + 0.5;
                double d5 = (double)n4 + 0.5;
                if (this.g != null) {
                    d5 += 0.5;
                }
                if (this.e != null) {
                    d4 += 0.5;
                }
                this.k.a(null, d4, (double)n3 + 0.5, d5, net.minecraft.a.f.V, bu.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
            }
            if (this.h < 0.0f) {
                this.h = 0.0f;
            }
        }
    }

    @Override
    public boolean c(int n2, int n3) {
        if (n2 == 1) {
            this.j = n3;
            return true;
        }
        return super.c(n2, n3);
    }

    @Override
    public void b(b b2) {
        if (!b2.a()) {
            if (this.j < 0) {
                this.j = 0;
            }
            ++this.j;
            this.k.c(this.l, this.E(), 1, this.j);
            this.k.b(this.l, this.E());
            this.k.b(this.l.c(), this.E());
        }
    }

    @Override
    public void c(b b2) {
        if (!b2.a() && this.E() instanceof ib) {
            --this.j;
            this.k.c(this.l, this.E(), 1, this.j);
            this.k.b(this.l, this.E());
            this.k.b(this.l.c(), this.E());
        }
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    @Override
    public void bP_() {
        super.bP_();
        this.bN_();
        this.k();
    }

    public aq n() {
        if (this.q == null) {
            if (this.k == null || !(this.E() instanceof ib)) {
                return aq.a;
            }
            this.q = ((ib)this.E()).g;
        }
        return this.q;
    }

    @Override
    public String h() {
        return "minecraft:chest";
    }

    @Override
    public net.minecraft.h.aq a(a a2, b b2) {
        this.a(b2);
        return new w(a2, this, b2);
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void j() {
        this.a((b)null);
        for (int i2 = 0; i2 < this.o.length; ++i2) {
            this.o[i2] = null;
        }
    }
}

