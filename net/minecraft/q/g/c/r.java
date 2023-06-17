/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.ae;
import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.en;
import net.minecraft.g.ew;
import net.minecraft.g.ga;
import net.minecraft.q.au;
import net.minecraft.q.g.c.cb;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.g;
import net.minecraft.u.bi;
import net.minecraft.u.bp;
import net.minecraft.u.bq;

public abstract class r {
    protected dc b;
    private ad a;
    private bi d;
    private bq e;
    protected int c;

    public r() {
    }

    protected r(int n2) {
        this.c = n2;
    }

    public final e e() {
        e e2 = new e();
        e2.a("id", da.a(this));
        e2.a("BB", this.b.g());
        ad ad2 = this.i();
        e2.a("O", ad2 == null ? -1 : ad2.c());
        e2.a("GD", this.c);
        this.a(e2);
        return e2;
    }

    protected abstract void a(e var1);

    public void a(k k2, e e2) {
        int n2;
        if (e2.e("BB")) {
            this.b = new dc(e2.n("BB"));
        }
        this.a((n2 = e2.h("O")) == -1 ? null : ad.b(n2));
        this.c = e2.h("GD");
        this.b(e2);
    }

    protected abstract void b(e var1);

    public void a(r r2, List list, Random random) {
    }

    public abstract boolean a(k var1, Random var2, dc var3);

    public dc f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public static r a(List list, dc dc2) {
        for (r r2 : list) {
            if (r2.f() == null || !r2.f().a(dc2)) continue;
            return r2;
        }
        return null;
    }

    public net.minecraft.u.b.b h() {
        return new net.minecraft.u.b.b(this.b.f());
    }

    protected boolean a(k k2, dc dc2) {
        int n2;
        int n3;
        int n4 = Math.max(this.b.a - 1, dc2.a);
        int n5 = Math.max(this.b.b - 1, dc2.b);
        int n6 = Math.max(this.b.c - 1, dc2.c);
        int n7 = Math.min(this.b.d + 1, dc2.d);
        int n8 = Math.min(this.b.e + 1, dc2.e);
        int n9 = Math.min(this.b.f + 1, dc2.f);
        g g2 = new g();
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n6; n2 <= n9; ++n2) {
                if (k2.n(g2.b(n3, n5, n2)).d().d()) {
                    return true;
                }
                if (!k2.n(g2.b(n3, n8, n2)).d().d()) continue;
                return true;
            }
        }
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (k2.n(g2.b(n3, n2, n6)).d().d()) {
                    return true;
                }
                if (!k2.n(g2.b(n3, n2, n9)).d().d()) continue;
                return true;
            }
        }
        for (n3 = n6; n3 <= n9; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (k2.n(g2.b(n4, n2, n3)).d().d()) {
                    return true;
                }
                if (!k2.n(g2.b(n7, n2, n3)).d().d()) continue;
                return true;
            }
        }
        return false;
    }

    protected int a(int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 == null) {
            return n2;
        }
        switch (ad2) {
            case c: 
            case d: {
                return this.b.a + n2;
            }
            case e: {
                return this.b.d - n3;
            }
            case f: {
                return this.b.a + n3;
            }
        }
        return n2;
    }

    protected int a(int n2) {
        return this.i() == null ? n2 : n2 + this.b.b;
    }

    protected int b(int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 == null) {
            return n3;
        }
        switch (ad2) {
            case c: {
                return this.b.f - n3;
            }
            case d: {
                return this.b.c + n3;
            }
            case e: 
            case f: {
                return this.b.c + n2;
            }
        }
        return n3;
    }

    protected void a(k k2, b b2, int n2, int n3, int n4, dc dc2) {
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (dc2.a(b3)) {
            if (this.d != bi.a) {
                b2 = b2.a(this.d);
            }
            if (this.e != bq.a) {
                b2 = b2.a(this.e);
            }
            k2.a(b3, b2, 2);
        }
    }

    protected b a(k k2, int n2, int n3, int n4, dc dc2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n7, n6 = this.a(n3), n5 = this.b(n2, n4));
        return !dc2.a(b2) ? p.a.v() : k2.n(b2);
    }

    protected int b(k k2, int n2, int n3, int n4, dc dc2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n7, n6 = this.a(n3 + 1), n5 = this.b(n2, n4));
        return !dc2.a(b2) ? au.a.c : k2.b(au.a, b2);
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    this.a(k2, p.a.v(), i3, i2, i4, dc2);
                }
            }
        }
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, int n7, b b2, b b3, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(k2, i3, i2, i4, dc2).d() == h.a) continue;
                    if (i2 != n3 && i2 != n6 && i3 != n2 && i3 != n5 && i4 != n4 && i4 != n7) {
                        this.a(k2, b3, i3, i2, i4, dc2);
                        continue;
                    }
                    this.a(k2, b2, i3, i2, i4, dc2);
                }
            }
        }
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, Random random, cb cb2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(k2, i3, i2, i4, dc2).d() == h.a) continue;
                    cb2.a(random, i3, i2, i4, i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7);
                    this.a(k2, cb2.a(), i3, i2, i4, dc2);
                }
            }
        }
    }

    protected void a(k k2, dc dc2, Random random, float f2, int n2, int n3, int n4, int n5, int n6, int n7, b b2, b b3, boolean bl2, int n8) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (!(random.nextFloat() <= f2) || bl2 && this.a(k2, i3, i2, i4, dc2).d() == h.a || n8 > 0 && this.b(k2, i3, i2, i4, dc2) >= n8) continue;
                    if (i2 != n3 && i2 != n6 && i3 != n2 && i3 != n5 && i4 != n4 && i4 != n7) {
                        this.a(k2, b3, i3, i2, i4, dc2);
                        continue;
                    }
                    this.a(k2, b2, i3, i2, i4, dc2);
                }
            }
        }
    }

    protected void a(k k2, dc dc2, Random random, float f2, int n2, int n3, int n4, b b2) {
        if (random.nextFloat() < f2) {
            this.a(k2, b2, n2, n3, n4, dc2);
        }
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, int n7, b b2, boolean bl2) {
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = n7 - n4 + 1;
        float f5 = (float)n2 + f2 / 2.0f;
        float f6 = (float)n4 + f4 / 2.0f;
        for (int i2 = n3; i2 <= n6; ++i2) {
            float f7 = (float)(i2 - n3) / f3;
            for (int i3 = n2; i3 <= n5; ++i3) {
                float f8 = ((float)i3 - f5) / (f2 * 0.5f);
                for (int i4 = n4; i4 <= n7; ++i4) {
                    float f9;
                    float f10 = ((float)i4 - f6) / (f4 * 0.5f);
                    if (bl2 && this.a(k2, i3, i2, i4, dc2).d() == h.a || !((f9 = f8 * f8 + f7 * f7 + f10 * f10) <= 1.05f)) continue;
                    this.a(k2, b2, i3, i2, i4, dc2);
                }
            }
        }
    }

    protected void c(k k2, int n2, int n3, int n4, dc dc2) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (dc2.a(b2)) {
            while (!k2.c(b2) && b2.k() < 255) {
                k2.a(b2, p.a.v(), 2);
                b2 = b2.b();
            }
        }
    }

    protected void b(k k2, b b2, int n2, int n3, int n4, dc dc2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        if (dc2.a(new net.minecraft.u.b.b(n7, n6 = this.a(n3), n5 = this.b(n2, n4)))) {
            while ((k2.c(new net.minecraft.u.b.b(n7, n6, n5)) || k2.n(new net.minecraft.u.b.b(n7, n6, n5)).d().d()) && n6 > 1) {
                k2.a(new net.minecraft.u.b.b(n7, n6, n5), b2, 2);
                --n6;
            }
        }
    }

    protected boolean a(k k2, dc dc2, Random random, int n2, int n3, int n4, bp bp2) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (dc2.a(b2) && k2.n(b2).c() != p.ae) {
            b b3 = p.ae.v();
            k2.a(b2, p.ae.f(k2, b2, b3), 2);
            ap ap2 = k2.q(b2);
            if (ap2 instanceof u) {
                ((u)ap2).a(bp2, random.nextLong());
            }
            return true;
        }
        return false;
    }

    protected boolean a(k k2, dc dc2, Random random, int n2, int n3, int n4, ad ad2, bp bp2) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (dc2.a(b2) && k2.n(b2).c() != p.z) {
            this.a(k2, p.z.v().a(en.a, (Comparable)((Object)ad2)), n2, n3, n4, dc2);
            ap ap2 = k2.q(b2);
            if (ap2 instanceof ae) {
                ((ae)ap2).a(bp2, random.nextLong());
            }
            return true;
        }
        return false;
    }

    protected void a(k k2, dc dc2, Random random, int n2, int n3, int n4, ad ad2, ga ga2) {
        this.a(k2, ga2.v().a(ga.a, (Comparable)((Object)ad2)), n2, n3, n4, dc2);
        this.a(k2, ga2.v().a(ga.a, (Comparable)((Object)ad2)).a(ga.e, (Comparable)((Object)ew.a)), n2, n3 + 1, n4, dc2);
    }

    public void a(int n2, int n3, int n4) {
        this.b.a(n2, n3, n4);
    }

    public ad i() {
        return this.a;
    }

    public void a(ad ad2) {
        this.a = ad2;
        if (ad2 == null) {
            this.e = bq.a;
            this.d = bi.a;
        } else {
            switch (ad2) {
                case d: {
                    this.d = bi.b;
                    this.e = bq.a;
                    break;
                }
                case e: {
                    this.d = bi.b;
                    this.e = bq.b;
                    break;
                }
                case f: {
                    this.d = bi.a;
                    this.e = bq.b;
                    break;
                }
                default: {
                    this.d = bi.a;
                    this.e = bq.a;
                }
            }
        }
    }
}

