/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.an;
import net.minecraft.g.bg;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.ap;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;
import net.minecraft.u.b.n;

public class ar
extends q {
    private Random k;
    private k l;
    private net.minecraft.u.b.b m = net.minecraft.u.b.b.c;
    int a;
    int b;
    double c = 0.618;
    double d = 0.381;
    double e = 1.0;
    double f = 1.0;
    int g = 1;
    int h = 12;
    int i = 4;
    List j;

    public ar(boolean bl2) {
        super(bl2);
    }

    void b() {
        int n2;
        int n3;
        this.b = (int)((double)this.a * this.c);
        if (this.b >= this.a) {
            this.b = this.a - 1;
        }
        if ((n3 = (int)(1.382 + Math.pow(this.f * (double)this.a / 13.0, 2.0))) < 1) {
            n3 = 1;
        }
        int n4 = this.m.k() + this.b;
        this.j = ov.a();
        this.j.add(new ap(this.m.a(n2), n4));
        for (n2 = this.a - this.i; n2 >= 0; --n2) {
            float f2 = this.a(n2);
            if (!(f2 >= 0.0f)) continue;
            for (int i2 = 0; i2 < n3; ++i2) {
                net.minecraft.u.b.b b2;
                double d2;
                double d3;
                double d4 = this.e * (double)f2 * ((double)this.k.nextFloat() + 0.328);
                double d5 = d4 * Math.sin(d3 = (double)(this.k.nextFloat() * 2.0f) * Math.PI) + 0.5;
                net.minecraft.u.b.b b3 = this.m.a(d5, (double)(n2 - 1), d2 = d4 * Math.cos(d3) + 0.5);
                if (this.a(b3, b2 = b3.a(this.i)) != -1) continue;
                int n5 = this.m.cy_() - b3.cy_();
                int n6 = this.m.l() - b3.l();
                double d6 = (double)b3.k() - Math.sqrt(n5 * n5 + n6 * n6) * this.d;
                int n7 = d6 > (double)n4 ? n4 : (int)d6;
                net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(this.m.cy_(), n7, this.m.l());
                if (this.a(b4, b3) != -1) continue;
                this.j.add(new ap(b3, b4.k()));
            }
        }
    }

    void a(net.minecraft.u.b.b b2, float f2, b b3) {
        int n2 = (int)((double)f2 + 0.618);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                net.minecraft.u.b.b b4;
                h h2;
                if (!(Math.pow((double)Math.abs(i2) + 0.5, 2.0) + Math.pow((double)Math.abs(i3) + 0.5, 2.0) <= (double)(f2 * f2)) || (h2 = this.l.n(b4 = b2.a(i2, 0, i3)).d()) != net.minecraft.g.a.h.a && h2 != net.minecraft.g.a.h.j) continue;
                this.a(this.l, b4, b3);
            }
        }
    }

    float a(int n2) {
        if ((float)n2 < (float)this.a * 0.3f) {
            return -1.0f;
        }
        float f2 = (float)this.a / 2.0f;
        float f3 = f2 - (float)n2;
        float f4 = n.c(f2 * f2 - f3 * f3);
        if (f3 == 0.0f) {
            f4 = f2;
        } else if (Math.abs(f3) >= f2) {
            return 0.0f;
        }
        return f4 * 0.5f;
    }

    float b(int n2) {
        return n2 >= 0 && n2 < this.i ? (n2 != 0 && n2 != this.i - 1 ? 3.0f : 2.0f) : -1.0f;
    }

    void a(net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.a(b2.a(i2), this.b(i2), p.t.v().a(bm.c, Boolean.valueOf(false)));
        }
    }

    void a(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3, cn cn2) {
        net.minecraft.u.b.b b4 = b3.a(-b2.cy_(), -b2.k(), -b2.l());
        int n2 = this.b(b4);
        float f2 = (float)b4.cy_() / (float)n2;
        float f3 = (float)b4.k() / (float)n2;
        float f4 = (float)b4.l() / (float)n2;
        for (int i2 = 0; i2 <= n2; ++i2) {
            net.minecraft.u.b.b b5 = b2.a(0.5f + (float)i2 * f2, 0.5f + (float)i2 * f3, 0.5f + (float)i2 * f4);
            bg bg2 = this.b(b2, b5);
            this.a(this.l, b5, cn2.v().a(an.b, (Comparable)((Object)bg2)));
        }
    }

    private int b(net.minecraft.u.b.b b2) {
        int n2 = n.a(b2.cy_());
        int n3 = n.a(b2.k());
        int n4 = n.a(b2.l());
        return n4 > n2 && n4 > n3 ? n4 : (n3 > n2 ? n3 : n2);
    }

    private bg b(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        int n2;
        bg bg2 = bg.b;
        int n3 = Math.abs(b3.cy_() - b2.cy_());
        int n4 = Math.max(n3, n2 = Math.abs(b3.l() - b2.l()));
        if (n4 > 0) {
            if (n3 == n4) {
                bg2 = bg.a;
            } else if (n2 == n4) {
                bg2 = bg.c;
            }
        }
        return bg2;
    }

    void c() {
        for (ap ap2 : this.j) {
            this.a(ap2);
        }
    }

    boolean c(int n2) {
        return (double)n2 >= (double)this.a * 0.2;
    }

    void d() {
        net.minecraft.u.b.b b2 = this.m;
        net.minecraft.u.b.b b3 = this.m.a(this.b);
        cn cn2 = p.r;
        this.a(b2, b3, cn2);
        if (this.g == 2) {
            this.a(b2.g(), b3.g(), cn2);
            this.a(b2.g().e(), b3.g().e(), cn2);
            this.a(b2.e(), b3.e(), cn2);
        }
    }

    void e() {
        for (ap ap2 : this.j) {
            int n2 = ap2.a();
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.m.cy_(), n2, this.m.l());
            if (b2.equals(ap2) || !this.c(n2 - this.m.k())) continue;
            this.a(b2, (net.minecraft.u.b.b)ap2, p.r);
        }
    }

    int a(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        net.minecraft.u.b.b b4 = b3.a(-b2.cy_(), -b2.k(), -b2.l());
        int n2 = this.b(b4);
        float f2 = (float)b4.cy_() / (float)n2;
        float f3 = (float)b4.k() / (float)n2;
        float f4 = (float)b4.l() / (float)n2;
        if (n2 == 0) {
            return -1;
        }
        for (int i2 = 0; i2 <= n2; ++i2) {
            net.minecraft.u.b.b b5 = b2.a(0.5f + (float)i2 * f2, 0.5f + (float)i2 * f3, 0.5f + (float)i2 * f4);
            if (this.a(this.l.n(b5).c())) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public void a() {
        this.i = 5;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        this.l = k2;
        this.m = b2;
        this.k = new Random(random.nextLong());
        if (this.a == 0) {
            this.a = 5 + this.k.nextInt(this.h);
        }
        if (!this.f()) {
            return false;
        }
        this.b();
        this.c();
        this.d();
        this.e();
        return true;
    }

    private boolean f() {
        cn cn2 = this.l.n(this.m.c()).c();
        if (cn2 != p.d && cn2 != p.c && cn2 != p.ak) {
            return false;
        }
        int n2 = this.a(this.m, this.m.a(this.a - 1));
        if (n2 == -1) {
            return true;
        }
        if (n2 < 6) {
            return false;
        }
        this.a = n2;
        return true;
    }
}

