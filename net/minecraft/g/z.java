/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.am;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.fi;
import net.minecraft.g.fk;
import net.minecraft.g.ft;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class z
extends ft
implements fi {
    public static final g a = g.a("age", 0, 7);
    private static final a[] b = new a[]{new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.625, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.75, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.875, 1.0), new a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};

    protected z() {
        this.z(this.O.b().a(this.d(), Integer.valueOf(0)));
        this.b(true);
        this.a((d)null);
        this.c(0.0f);
        this.a(fk.c);
        this.r();
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b[(Integer)b2.a(this.d())];
    }

    @Override
    protected boolean i(b b2) {
        return b2.c() == p.ak;
    }

    protected g d() {
        return a;
    }

    public int e() {
        return 7;
    }

    protected int l(b b2) {
        return (Integer)b2.a(this.d());
    }

    public b b(int n2) {
        return this.v().a(this.d(), Integer.valueOf(n2));
    }

    public boolean m(b b2) {
        return (Integer)b2.a(this.d()) >= this.e();
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        float f2;
        int n2;
        super.a(k2, b2, b3, random);
        if (k2.j(b2.b()) >= 9 && (n2 = this.l(b3)) < this.e() && random.nextInt((int)(25.0f / (f2 = net.minecraft.g.z.a(this, k2, b2))) + 1) == 0) {
            k2.a(b2, this.b(n2 + 1), 2);
        }
    }

    public void d(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2;
        int n3 = this.l(b3) + this.b(k2);
        if (n3 > (n2 = this.e())) {
            n3 = n2;
        }
        k2.a(b2, this.b(n3), 2);
    }

    protected int b(k k2) {
        return net.minecraft.u.b.n.a(k2.p, 2, 5);
    }

    protected static float a(cn cn2, k k2, net.minecraft.u.b.b b2) {
        boolean bl2;
        Object object;
        float f2 = 1.0f;
        net.minecraft.u.b.b b3 = b2.c();
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                float f3 = 0.0f;
                object = k2.n(b3.a(i2, 0, i3));
                if (object.c() == p.ak) {
                    f3 = 1.0f;
                    if ((Integer)object.a(am.a) > 0) {
                        f3 = 3.0f;
                    }
                }
                if (i2 != 0 || i3 != 0) {
                    f3 /= 4.0f;
                }
                f2 += f3;
            }
        }
        net.minecraft.u.b.b b4 = b2.d();
        net.minecraft.u.b.b b5 = b2.e();
        net.minecraft.u.b.b b6 = b2.f();
        object = b2.g();
        boolean bl3 = cn2 == k2.n(b6).c() || cn2 == k2.n((net.minecraft.u.b.b)object).c();
        boolean bl4 = bl2 = cn2 == k2.n(b4).c() || cn2 == k2.n(b5).c();
        if (bl3 && bl2) {
            f2 /= 2.0f;
        } else {
            boolean bl5;
            boolean bl6 = bl5 = cn2 == k2.n(b6.d()).c() || cn2 == k2.n(((net.minecraft.u.b.b)object).d()).c() || cn2 == k2.n(((net.minecraft.u.b.b)object).e()).c() || cn2 == k2.n(b6.e()).c();
            if (bl5) {
                f2 /= 2.0f;
            }
        }
        return f2;
    }

    @Override
    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        return (k2.i(b2) >= 8 || k2.g(b2)) && this.i(k2.n(b2.c()));
    }

    protected cg f() {
        return net.minecraft.a.w.P;
    }

    protected cg g() {
        return net.minecraft.a.w.Q;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        int n3;
        super.a(k2, b2, b3, f2, 0);
        if (!k2.C && (n3 = this.l(b3)) >= this.e()) {
            int n4 = 3 + n2;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (k2.p.nextInt(2 * this.e()) > n3) continue;
                net.minecraft.g.z.a(k2, b2, new cu(this.f()));
            }
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return this.m(b2) ? this.g() : this.f();
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this.f());
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return !this.m(b3);
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return true;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        this.d(k2, b2, b3);
    }

    @Override
    public b a(int n2) {
        return this.b(n2);
    }

    @Override
    public int b(b b2) {
        return this.l(b2);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

