/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.b.h;
import net.minecraft.u.b.s;
import net.minecraft.u.r;
import net.minecraft.w.f.t;
import net.minecraft.w.f.z;
import net.minecraft.w.h.c;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;
import net.minecraft.x.d.a.aj;

public class ab
extends n {
    private static final g a = net.minecraft.x.a.o.a(ab.class, net.minecraft.x.a.q.b);
    private static final g b = net.minecraft.x.a.o.a(ab.class, net.minecraft.x.a.q.b);
    private static final g c = net.minecraft.x.a.o.a(ab.class, net.minecraft.x.a.q.c);
    private static final g d = net.minecraft.x.a.o.a(ab.class, net.minecraft.x.a.q.b);
    private static final g[] e = new g[]{net.minecraft.x.a.o.a(ab.class, net.minecraft.x.a.q.h), net.minecraft.x.a.o.a(ab.class, net.minecraft.x.a.q.h)};
    private final float[] f = new float[2];
    private float g;
    private float h;
    private float i;
    private int j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private double t;
    private float u;
    private z v;
    private z w;
    private double x;
    private static /* synthetic */ int[] y;

    public ab(k k2) {
        super(k2);
        this.aN = true;
        this.d(1.375f, 0.5625f);
    }

    public ab(k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected void cb_() {
        this.bE.a(a, 0);
        this.bE.a(b, 1);
        this.bE.a(c, Float.valueOf(0.0f));
        this.bE.a(d, net.minecraft.w.f.t.a.ordinal());
        g[] arrg = e;
        int n2 = e.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            g g2 = arrg[i2];
            this.bE.a(g2, false);
        }
    }

    @Override
    public a o(n n2) {
        return n2.cT();
    }

    @Override
    public a cj() {
        return this.cT();
    }

    @Override
    public boolean bM() {
        return true;
    }

    @Override
    public double cs() {
        return -0.1;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (!this.aQ.C && !this.bk) {
            boolean bl2;
            if (n2 instanceof net.minecraft.u.q && n2.j() != null && this.A(n2.j())) {
                return false;
            }
            this.d(-this.l());
            this.c(10);
            this.a(this.g() + f2 * 10.0f);
            this.bN();
            boolean bl3 = bl2 = n2.j() instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)n2.j()).J.d;
            if (bl2 || this.g() > 40.0f) {
                if (!bl2 && this.aQ.G().b("doEntityDrops")) {
                    this.a(this.a(), 1, 0.0f);
                }
                this.aa();
            }
            return true;
        }
        return true;
    }

    @Override
    public void d(n n2) {
        if (n2 instanceof ab) {
            if (n2.cT().b < this.cT().e) {
                super.d(n2);
            }
        } else if (n2.cT().b <= this.cT().b) {
            super.d(n2);
        }
    }

    public cg a() {
        switch (ab.p()[this.n().ordinal()]) {
            default: {
                return net.minecraft.a.w.aG;
            }
            case 2: {
                return net.minecraft.a.w.aH;
            }
            case 3: {
                return net.minecraft.a.w.aI;
            }
            case 4: {
                return net.minecraft.a.w.aJ;
            }
            case 5: {
                return net.minecraft.a.w.aK;
            }
            case 6: 
        }
        return net.minecraft.a.w.aL;
    }

    @Override
    public void bs() {
        this.d(-this.l());
        this.c(10);
        this.a(this.g() * 11.0f);
    }

    @Override
    public boolean cg_() {
        return !this.bk;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.k = d2;
        this.l = d3;
        this.m = d4;
        this.n = f2;
        this.o = f3;
        this.j = 10;
    }

    @Override
    public ad cR() {
        return this.cl_().f();
    }

    @Override
    public void cE_() {
        this.w = this.v;
        this.v = this.r();
        this.h = this.v != z.b && this.v != z.c ? 0.0f : (this.h += 1.0f);
        if (!this.aQ.C && this.h >= 60.0f) {
            this.ct();
        }
        if (this.i() > 0) {
            this.c(this.i() - 1);
        }
        if (this.g() > 0.0f) {
            this.a(this.g() - 1.0f);
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        super.cE_();
        this.q();
        if (this.de()) {
            if (this.db().size() == 0 || !(this.db().get(0) instanceof net.minecraft.w.a.b)) {
                this.a(false, false);
            }
            this.v();
            if (this.aQ.C) {
                this.w();
                this.aQ.a(new aj(this.b(0), this.b(1)));
            }
            this.b(this.aX, this.aY, this.aZ);
        } else {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
        }
        for (int i2 = 0; i2 <= 1; ++i2) {
            this.f[i2] = this.b(i2) ? (float)((double)this.f[i2] + 0.01) : 0.0f;
        }
        this.cg();
        List list = this.aQ.a((n)this, this.cT().b((double)0.2f, -0.01f, 0.2f), net.minecraft.u.r.a(this));
        if (!list.isEmpty()) {
            boolean bl2 = !this.aQ.C && !(this.da() instanceof net.minecraft.w.a.b);
            for (int i3 = 0; i3 < list.size(); ++i3) {
                n n2 = (n)list.get(i3);
                if (n2.A(this)) continue;
                if (bl2 && this.db().size() < 2 && !n2.cz() && n2.bl < this.bl && n2 instanceof l && !(n2 instanceof c) && !(n2 instanceof net.minecraft.w.a.b)) {
                    n2.r(this);
                    continue;
                }
                this.d(n2);
            }
        }
    }

    private void q() {
        if (this.j > 0 && !this.de()) {
            double d2 = this.aU + (this.k - this.aU) / (double)this.j;
            double d3 = this.aV + (this.l - this.aV) / (double)this.j;
            double d4 = this.aW + (this.m - this.aW) / (double)this.j;
            double d5 = net.minecraft.u.b.n.g(this.n - (double)this.ba);
            this.ba = (float)((double)this.ba + d5 / (double)this.j);
            this.bb = (float)((double)this.bb + (this.o - (double)this.bb) / (double)this.j);
            --this.j;
            this.e(d2, d3, d4);
            this.e(this.ba, this.bb);
        }
    }

    public void a(boolean bl2, boolean bl3) {
        this.bE.b(e[0], bl2);
        this.bE.b(e[1], bl3);
    }

    public float a(int n2, float f2) {
        return this.b(n2) ? (float)net.minecraft.u.b.n.b((double)this.f[n2] - 0.01, (double)this.f[n2], (double)f2) : 0.0f;
    }

    private z r() {
        z z2 = this.t();
        if (z2 != null) {
            this.t = this.cT().e;
            return z2;
        }
        if (this.s()) {
            return z.a;
        }
        float f2 = this.f();
        if (f2 > 0.0f) {
            this.u = f2;
            return z.d;
        }
        return z.e;
    }

    public float c() {
        a a2 = this.cT();
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.e);
        int n5 = net.minecraft.u.b.n.f(a2.e - this.x);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        h h2 = net.minecraft.u.b.h.m();
        try {
            float f2;
            block4: for (int i2 = n4; i2 < n5; ++i2) {
                float f3 = 0.0f;
                int n8 = n2;
                while (true) {
                    if (n8 >= n3) {
                        float f4;
                        if (!(f3 < 1.0f)) continue block4;
                        float f5 = f4 = (float)h2.k() + f3;
                        return f5;
                    }
                    for (int i3 = n6; i3 < n7; ++i3) {
                        h2.d(n8, i2, i3);
                        b b2 = this.aQ.n(h2);
                        if (b2.d() == net.minecraft.g.a.h.h) {
                            f3 = Math.max(f3, ab.a(b2, this.aQ, h2));
                        }
                        if (f3 >= 1.0f) continue block4;
                    }
                    ++n8;
                }
            }
            float f6 = f2 = (float)(n5 + 1);
            return f6;
        }
        finally {
            h2.n();
        }
    }

    public float f() {
        a a2 = this.cT();
        a a3 = new a(a2.a, a2.b - 0.001, a2.c, a2.d, a2.b, a2.f);
        int n2 = net.minecraft.u.b.n.c(a3.a) - 1;
        int n3 = net.minecraft.u.b.n.f(a3.d) + 1;
        int n4 = net.minecraft.u.b.n.c(a3.b) - 1;
        int n5 = net.minecraft.u.b.n.f(a3.e) + 1;
        int n6 = net.minecraft.u.b.n.c(a3.c) - 1;
        int n7 = net.minecraft.u.b.n.f(a3.f) + 1;
        ArrayList arrayList = ov.a();
        float f2 = 0.0f;
        int n8 = 0;
        h h2 = net.minecraft.u.b.h.m();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n6; i3 < n7; ++i3) {
                    int n9 = (i2 != n2 && i2 != n3 - 1 ? 0 : 1) + (i3 != n6 && i3 != n7 - 1 ? 0 : 1);
                    if (n9 == 2) continue;
                    for (int i4 = n4; i4 < n5; ++i4) {
                        if (n9 > 0 && (i4 == n4 || i4 == n5 - 1)) continue;
                        h2.d(i2, i4, i3);
                        b b2 = this.aQ.n(h2);
                        b2.a(this.aQ, h2, a3, arrayList, this);
                        if (!arrayList.isEmpty()) {
                            f2 += b2.c().N;
                            ++n8;
                        }
                        arrayList.clear();
                    }
                }
            }
        }
        finally {
            h2.n();
        }
        return f2 / (float)n8;
    }

    private boolean s() {
        a a2 = this.cT();
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.b);
        int n5 = net.minecraft.u.b.n.f(a2.b + 0.001);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        boolean bl2 = false;
        this.t = Double.MIN_VALUE;
        h h2 = net.minecraft.u.b.h.m();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n4; i3 < n5; ++i3) {
                    for (int i4 = n6; i4 < n7; ++i4) {
                        h2.d(i2, i3, i4);
                        b b2 = this.aQ.n(h2);
                        if (b2.d() != net.minecraft.g.a.h.h) continue;
                        float f2 = ab.b(b2, this.aQ, h2);
                        this.t = Math.max((double)f2, this.t);
                        bl2 |= a2.b < (double)f2;
                    }
                }
            }
        }
        finally {
            h2.n();
        }
        return bl2;
    }

    private z t() {
        a a2 = this.cT();
        double d2 = a2.e + 0.001;
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.f(a2.d);
        int n4 = net.minecraft.u.b.n.c(a2.e);
        int n5 = net.minecraft.u.b.n.f(d2);
        int n6 = net.minecraft.u.b.n.c(a2.c);
        int n7 = net.minecraft.u.b.n.f(a2.f);
        boolean bl2 = false;
        h h2 = net.minecraft.u.b.h.m();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n4; i3 < n5; ++i3) {
                    for (int i4 = n6; i4 < n7; ++i4) {
                        h2.d(i2, i3, i4);
                        b b2 = this.aQ.n(h2);
                        if (b2.d() != net.minecraft.g.a.h.h || !(d2 < (double)ab.b(b2, this.aQ, h2))) continue;
                        if ((Integer)b2.a(ee.a) != 0) {
                            z z2;
                            z z3 = z2 = z.c;
                            return z3;
                        }
                        bl2 = true;
                    }
                }
            }
        }
        finally {
            h2.n();
        }
        return bl2 ? z.b : null;
    }

    public static float a(b b2, net.minecraft.q.n n2, net.minecraft.u.b.b b3) {
        int n3 = (Integer)b2.a(ee.a);
        return (n3 & 7) == 0 && n2.n(b3.b()).d() == net.minecraft.g.a.h.h ? 1.0f : 1.0f - ee.b(n3);
    }

    public static float b(b b2, net.minecraft.q.n n2, net.minecraft.u.b.b b3) {
        return (float)b3.k() + ab.a(b2, n2, b3);
    }

    private void v() {
        double d2 = -0.04f;
        double d3 = this.ci() ? 0.0 : (double)-0.04f;
        double d4 = 0.0;
        this.g = 0.05f;
        if (this.w == z.e && this.v != z.e && this.v != z.d) {
            this.t = this.cT().b + (double)this.bm;
            this.e(this.aU, (double)(this.c() - this.bm) + 0.101, this.aW);
            this.aY = 0.0;
            this.x = 0.0;
            this.v = z.a;
        } else {
            if (this.v == z.a) {
                d4 = (this.t - this.cT().b) / (double)this.bm;
                this.g = 0.9f;
            } else if (this.v == z.c) {
                d3 = -7.0E-4;
                this.g = 0.9f;
            } else if (this.v == z.b) {
                d4 = 0.01f;
                this.g = 0.45f;
            } else if (this.v == z.e) {
                this.g = 0.9f;
            } else if (this.v == z.d) {
                this.g = this.u;
                if (this.da() instanceof net.minecraft.w.a.b) {
                    this.u /= 2.0f;
                }
            }
            this.aX *= (double)this.g;
            this.aZ *= (double)this.g;
            this.i *= this.g;
            this.aY += d3;
            if (d4 > 0.0) {
                double d5 = 0.65;
                this.aY += d4 * 0.06153846016296973;
                double d6 = 0.75;
                this.aY *= 0.75;
            }
        }
    }

    private void w() {
        if (this.cA()) {
            float f2 = 0.0f;
            if (this.p) {
                this.i += -1.0f;
            }
            if (this.q) {
                this.i += 1.0f;
            }
            if (this.q != this.p && !this.r && !this.s) {
                f2 += 0.005f;
            }
            this.ba += this.i;
            if (this.r) {
                f2 += 0.04f;
            }
            if (this.s) {
                f2 -= 0.005f;
            }
            this.aX += (double)(net.minecraft.u.b.n.a(-this.ba * ((float)Math.PI / 180)) * f2);
            this.aZ += (double)(net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180)) * f2);
            this.a(this.q || this.r, this.p || this.r);
        }
    }

    @Override
    public void p(n n2) {
        if (this.A(n2)) {
            float f2 = 0.0f;
            float f3 = (float)((this.bk ? (double)0.01f : this.cs()) + n2.Y());
            if (this.db().size() > 1) {
                int n3 = this.db().indexOf(n2);
                f2 = n3 == 0 ? 0.2f : -0.6f;
                if (n2 instanceof y) {
                    f2 = (float)((double)f2 + 0.2);
                }
            }
            s s2 = new s(f2, 0.0, 0.0).b(-this.ba * ((float)Math.PI / 180) - 1.5707964f);
            n2.e(this.aU + s2.b, this.aV + (double)f3, this.aW + s2.d);
            n2.ba += this.i;
            n2.k(n2.bO() + this.i);
            this.b(n2);
            if (n2 instanceof y && this.db().size() > 1) {
                int n4 = n2.ca() % 2 == 0 ? 90 : 270;
                n2.l(((y)n2).ak + (float)n4);
                n2.k(n2.bO() + (float)n4);
            }
        }
    }

    protected void b(n n2) {
        n2.l(this.ba);
        float f2 = net.minecraft.u.b.n.g(n2.ba - this.ba);
        float f3 = net.minecraft.u.b.n.a(f2, -105.0f, 105.0f);
        n2.bc += f3 - f2;
        n2.ba += f3 - f2;
        n2.k(n2.ba);
    }

    @Override
    public void q(n n2) {
        this.b(n2);
    }

    @Override
    protected void a(e e2) {
        e2.a("Type", this.n().a());
    }

    @Override
    protected void b(e e2) {
        if (e2.b("Type", 8)) {
            this.a(net.minecraft.w.f.t.a(e2.l("Type")));
        }
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, cu cu2, ah ah2) {
        if (!this.aQ.C && !b2.G() && this.h < 60.0f) {
            b2.r(this);
        }
        return true;
    }

    @Override
    protected void a(double d2, boolean bl2, b b2, net.minecraft.u.b.b b3) {
        this.x = this.aY;
        if (!this.cz()) {
            if (bl2) {
                if (this.bq > 3.0f) {
                    if (this.v != z.d) {
                        this.bq = 0.0f;
                        return;
                    }
                    this.c(this.bq, 1.0f);
                    if (!this.aQ.C && !this.bk) {
                        this.aa();
                        if (this.aQ.G().b("doEntityDrops")) {
                            int n2;
                            for (n2 = 0; n2 < 3; ++n2) {
                                this.a(new cu(cg.a(net.minecraft.a.p.f), 1, this.n().b()), 0.0f);
                            }
                            for (n2 = 0; n2 < 2; ++n2) {
                                this.a(net.minecraft.a.w.A, 1, 0.0f);
                            }
                        }
                    }
                }
                this.bq = 0.0f;
            } else if (this.aQ.n(new net.minecraft.u.b.b(this).c()).d() != net.minecraft.g.a.h.h && d2 < 0.0) {
                this.bq = (float)((double)this.bq - d2);
            }
        }
    }

    public boolean b(int n2) {
        return (Boolean)this.bE.a(e[n2]) != false && this.da() != null;
    }

    public void a(float f2) {
        this.bE.b(c, Float.valueOf(f2));
    }

    public float g() {
        return ((Float)this.bE.a(c)).floatValue();
    }

    public void c(int n2) {
        this.bE.b(a, n2);
    }

    public int i() {
        return (Integer)this.bE.a(a);
    }

    public void d(int n2) {
        this.bE.b(b, n2);
    }

    public int l() {
        return (Integer)this.bE.a(b);
    }

    public void a(t t2) {
        this.bE.b(d, t2.ordinal());
    }

    public t n() {
        return net.minecraft.w.f.t.a((Integer)this.bE.a(d));
    }

    @Override
    protected boolean v(n n2) {
        return this.db().size() < 2;
    }

    @Override
    public n da() {
        List list = this.db();
        return list.isEmpty() ? null : (n)list.get(0);
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.p = bl2;
        this.q = bl3;
        this.r = bl4;
        this.s = bl5;
    }

    static /* synthetic */ int[] p() {
        if (y != null) {
            return y;
        }
        int[] arrn = new int[net.minecraft.w.f.t.values().length];
        try {
            arrn[net.minecraft.w.f.t.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.w.f.t.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.w.f.t.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.w.f.t.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.w.f.t.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.w.f.t.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        y = arrn;
        return arrn;
    }
}

