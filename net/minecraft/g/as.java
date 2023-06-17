/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.ap;
import net.minecraft.g.b.f;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.fi;
import net.minecraft.g.ft;
import net.minecraft.g.z;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class as
extends ft
implements fi {
    public static final g a = g.a("age", 0, 7);
    public static final f b = ap.a;
    private final cn e;
    protected static final a[] c = new a[]{new a(0.375, 0.0, 0.375, 0.625, 0.125, 0.625), new a(0.375, 0.0, 0.375, 0.625, 0.25, 0.625), new a(0.375, 0.0, 0.375, 0.625, 0.375, 0.625), new a(0.375, 0.0, 0.375, 0.625, 0.5, 0.625), new a(0.375, 0.0, 0.375, 0.625, 0.625, 0.625), new a(0.375, 0.0, 0.375, 0.625, 0.75, 0.625), new a(0.375, 0.0, 0.375, 0.625, 0.875, 0.625), new a(0.375, 0.0, 0.375, 0.625, 1.0, 0.625)};

    protected as(cn cn2) {
        this.z(this.O.b().a(a, Integer.valueOf(0)).a(b, (Comparable)((Object)ad.b)));
        this.e = cn2;
        this.b(true);
        this.a((d)null);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return c[(Integer)b2.a(a)];
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        int n3 = (Integer)b2.a(a);
        b2 = b2.a(b, (Comparable)((Object)ad.b));
        for (ad ad2 : ag.a) {
            if (n2.n(b3.a(ad2)).c() != this.e || n3 != 7) continue;
            b2 = b2.a(b, (Comparable)((Object)ad2));
            break;
        }
        return b2;
    }

    @Override
    protected boolean i(b b2) {
        return b2.c() == p.ak;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        float f2;
        super.a(k2, b2, b3, random);
        if (k2.j(b2.b()) >= 9 && random.nextInt((int)(25.0f / (f2 = net.minecraft.g.z.a(this, k2, b2))) + 1) == 0) {
            int n2 = (Integer)b3.a(a);
            if (n2 < 7) {
                b3 = b3.a(a, Integer.valueOf(n2 + 1));
                k2.a(b2, b3, 2);
            } else {
                Object object2;
                for (Object object2 : ag.a) {
                    if (k2.n(b2.a((ad)object2)).c() != this.e) continue;
                    return;
                }
                b2 = b2.a(ag.a.a(random));
                object2 = k2.n(b2.c()).c();
                if (k2.n((net.minecraft.u.b.b)b2).c().L == h.a && (object2 == p.ak || object2 == p.d || object2 == p.c)) {
                    k2.b(b2, this.e.v());
                }
            }
        }
    }

    public void d(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2 = (Integer)b3.a(a) + net.minecraft.u.b.n.a(k2.p, 2, 5);
        k2.a(b2, b3.a(a, Integer.valueOf(Math.min(7, n2))), 2);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        cg cg2;
        super.a(k2, b2, b3, f2, n2);
        if (!k2.C && (cg2 = this.e()) != null) {
            int n3 = (Integer)b3.a(a);
            for (int i2 = 0; i2 < 3; ++i2) {
                if (k2.p.nextInt(15) > n3) continue;
                as.a(k2, b2, new cu(cg2));
            }
        }
    }

    protected cg e() {
        return this.e == p.aU ? net.minecraft.a.w.bn : (this.e == p.bk ? net.minecraft.a.w.bo : null);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        cg cg2 = this.e();
        return cg2 == null ? null : new cu(cg2);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return (Integer)b3.a(a) != 7;
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
        return this.v().a(a, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }
}

