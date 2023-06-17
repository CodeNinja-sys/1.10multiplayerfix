/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.d;
import net.minecraft.i.i;
import net.minecraft.i.l;
import net.minecraft.q.at;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.f;

public abstract class j {
    protected f a;
    protected k b;
    protected i c;
    protected double d;
    private final net.minecraft.w.b.a.i g;
    private int h;
    private int i;
    public boolean e = false;
    private s j = net.minecraft.u.b.s.a;
    private s k = net.minecraft.u.b.s.a;
    private long l;
    private long m;
    private double n;
    private float o = 0.5f;
    private boolean p;
    private long q;
    protected d f;
    private b r;
    private final l s;

    public j(f f2, k k2) {
        this.a = f2;
        this.b = k2;
        this.g = f2.a(net.minecraft.w.d.b);
        this.s = this.a();
    }

    public j(f f2, k k2, boolean bl2) {
        this.a = f2;
        this.b = k2;
        this.e = bl2;
        this.g = f2.a(net.minecraft.w.d.b);
        this.s = this.a();
    }

    protected abstract l a();

    public void a(double d2) {
        this.d = d2;
    }

    public float g() {
        if (this.e) {
            return 128.0f;
        }
        return (float)this.g.f();
    }

    public boolean h() {
        return this.p;
    }

    public void i() {
        if (this.b.B() - this.q > 20L) {
            if (this.r != null) {
                this.c = null;
                this.c = this.a(this.r);
                this.q = this.b.B();
                this.p = false;
            }
        } else {
            this.p = true;
        }
    }

    public final i a(double d2, double d3, double d4) {
        return this.a(new b(d2, d3, d4));
    }

    public i a(b b2) {
        if (!this.b()) {
            return null;
        }
        if (this.c != null && !this.c.b() && b2.equals(this.r)) {
            return this.c;
        }
        this.r = b2;
        float f2 = this.g();
        this.b.A.a("pathfind");
        b b3 = new b(this.a);
        int n2 = (int)(f2 + 8.0f);
        at at2 = new at(this.b, b3.a(-n2, -n2, -n2), b3.a(n2, n2, n2), 0);
        i i2 = this.s.a((n)at2, this.a, this.r, f2);
        this.b.A.b();
        return i2;
    }

    public i a(net.minecraft.w.n n2) {
        if (!this.b()) {
            return null;
        }
        b b2 = new b(n2);
        if (this.c != null && !this.c.b() && b2.equals(this.r)) {
            return this.c;
        }
        this.r = b2;
        float f2 = this.g();
        this.b.A.a("pathfind");
        b b3 = new b(this.a).b();
        int n3 = (int)(f2 + 16.0f);
        at at2 = new at(this.b, b3.a(-n3, -n3, -n3), b3.a(n3, n3, n3), 0);
        i i2 = this.s.a((n)at2, this.a, n2, f2);
        this.b.A.b();
        return i2;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        return this.a(this.a(d2, d3, d4), d5);
    }

    public boolean a(net.minecraft.w.n n2, double d2) {
        i i2 = this.a(n2);
        return i2 != null && this.a(i2, d2);
    }

    public boolean a(i i2, double d2) {
        if (i2 == null) {
            this.c = null;
            return false;
        }
        if (!i2.a(this.c)) {
            this.c = i2;
        }
        this.d();
        if (this.c.d() == 0) {
            return false;
        }
        this.d = d2;
        s s2 = this.c();
        this.i = this.h;
        this.j = s2;
        return true;
    }

    public i j() {
        return this.c;
    }

    public void k() {
        ++this.h;
        if (this.p) {
            this.i();
        }
        if (!this.l()) {
            Object object;
            s s2;
            if (this.b()) {
                this.bW_();
            } else if (this.c != null && this.c.e() < this.c.d()) {
                s2 = this.c();
                object = this.c.a(this.a, this.c.e());
                if (s2.c > ((s)object).c && !this.a.be && net.minecraft.u.b.n.c(s2.b) == net.minecraft.u.b.n.c(((s)object).b) && net.minecraft.u.b.n.c(s2.d) == net.minecraft.u.b.n.c(((s)object).d)) {
                    this.c.c(this.c.e() + 1);
                }
            }
            if (!this.l() && (s2 = this.c.a(this.a)) != null) {
                object = new b(s2).c();
                a a2 = this.b.n((b)object).c((n)this.b, (b)object);
                s2 = s2.a(0.0, 1.0 - a2.e, 0.0);
                this.a.L().a(s2.b, s2.c, s2.d, this.d);
            }
        }
    }

    protected void bW_() {
        s s2 = this.c();
        int n2 = this.c.d();
        for (int i2 = this.c.e(); i2 < this.c.d(); ++i2) {
            if ((double)this.c.a((int)i2).b == Math.floor(s2.c)) continue;
            n2 = i2;
            break;
        }
        this.o = this.a.bl > 0.75f ? this.a.bl / 2.0f : 0.75f - this.a.bl / 2.0f;
        s s3 = this.c.f();
        if (net.minecraft.u.b.n.e((float)(this.a.aU - (s3.b + 0.5))) < this.o && net.minecraft.u.b.n.e((float)(this.a.aW - (s3.d + 0.5))) < this.o && Math.abs(this.a.aV - s3.c) < 1.0) {
            this.c.c(this.c.e() + 1);
        }
        int n3 = net.minecraft.u.b.n.f(this.a.bl);
        int n4 = net.minecraft.u.b.n.f(this.a.bm);
        int n5 = n3;
        for (int i3 = n2 - 1; i3 >= this.c.e(); --i3) {
            if (!this.a(s2, this.c.a(this.a, i3), n3, n4, n5)) continue;
            this.c.c(i3);
            break;
        }
        this.a(s2);
    }

    protected void a(s s2) {
        if (this.h - this.i > 100) {
            if (s2.g(this.j) < 2.25) {
                this.m();
            }
            this.i = this.h;
            this.j = s2;
        }
        if (this.c != null && !this.c.b()) {
            s s3 = this.c.f();
            if (s3.equals(this.k)) {
                this.l += System.currentTimeMillis() - this.m;
            } else {
                this.k = s3;
                double d2 = s2.f(this.k);
                double d3 = this.n = this.a.ak() > 0.0f ? d2 / (double)this.a.ak() * 1000.0 : 0.0;
            }
            if (this.n > 0.0 && (double)this.l > this.n * 3.0) {
                this.k = net.minecraft.u.b.s.a;
                this.l = 0L;
                this.n = 0.0;
                this.m();
            }
            this.m = System.currentTimeMillis();
        }
    }

    public boolean l() {
        return this.c == null || this.c.b();
    }

    public void m() {
        this.c = null;
    }

    protected abstract s c();

    protected abstract boolean b();

    protected boolean n() {
        return this.a.cm() || this.a.cq();
    }

    protected void d() {
    }

    protected abstract boolean a(s var1, s var2, int var3, int var4, int var5);

    public boolean b(b b2) {
        return this.b.n(b2.c()).e();
    }

    public d o() {
        return this.f;
    }
}

