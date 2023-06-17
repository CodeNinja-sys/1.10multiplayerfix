/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.b.cg;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.e.u;
import net.minecraft.q.d.b;
import net.minecraft.q.k;
import net.minecraft.q.m;
import net.minecraft.w.d.a;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class ad
extends n {
    private static final g b = o.a(ad.class, q.k);
    private static final g c = o.a(ad.class, q.h);
    public int a;

    public ad(k k2) {
        super(k2);
        this.aN = true;
        this.d(2.0f, 2.0f);
        this.a = this.bx.nextInt(100000);
    }

    public ad(k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected void cb_() {
        this.cc().a(b, cg.f());
        this.cc().a(c, true);
    }

    @Override
    public void cE_() {
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        ++this.a;
        if (!this.aQ.C) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
            if (this.aQ.q instanceof m && this.aQ.n(b2).c() != p.ab) {
                this.aQ.b(b2, p.ab.v());
            }
        }
    }

    @Override
    protected void a(e e2) {
        if (this.a() != null) {
            e2.a("BeamTarget", u.a(this.a()));
        }
        e2.a("ShowBottom", this.c());
    }

    @Override
    protected void b(e e2) {
        if (e2.b("BeamTarget", 10)) {
            this.a(u.c(e2.o("BeamTarget")));
        }
        if (e2.b("ShowBottom", 1)) {
            this.a(e2.p("ShowBottom"));
        }
    }

    @Override
    public boolean cg_() {
        return true;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (n2.j() instanceof a) {
            return false;
        }
        if (!this.bk && !this.aQ.C) {
            this.aa();
            if (!this.aQ.C) {
                this.aQ.a(null, this.aU, this.aV, this.aW, 6.0f, true);
                this.a(n2);
            }
        }
        return true;
    }

    @Override
    public void aY() {
        this.a(net.minecraft.u.n.m);
        super.aY();
    }

    private void a(net.minecraft.u.n n2) {
        m m2;
        b b2;
        if (this.aQ.q instanceof m && (b2 = (m2 = (m)this.aQ.q).s()) != null) {
            b2.a(this, n2);
        }
    }

    public void a(net.minecraft.u.b.b b2) {
        this.cc().b(b, cg.c(b2));
    }

    public net.minecraft.u.b.b a() {
        return (net.minecraft.u.b.b)((cg)this.cc().a(b)).d();
    }

    public void a(boolean bl2) {
        this.cc().b(c, bl2);
    }

    public boolean c() {
        return (Boolean)this.cc().a(c);
    }

    @Override
    public boolean a(double d2) {
        return super.a(d2) || this.a() != null;
    }
}

