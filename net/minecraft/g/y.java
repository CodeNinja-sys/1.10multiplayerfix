/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.g.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.cv;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.aj;
import net.minecraft.u.bu;
import net.minecraft.v.d;

public class y
extends ap {
    private static final Map g = sz.c();
    private final boolean h;

    private boolean a(k k2, net.minecraft.u.b.b b2, boolean bl2) {
        if (!g.containsKey(k2)) {
            g.put(k2, ov.a());
        }
        List list = (List)g.get(k2);
        if (bl2) {
            list.add(new cv(b2, k2.B()));
        }
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cv cv2 = (cv)list.get(i2);
            if (!cv2.a.equals(b2) || ++n2 < 8) continue;
            return true;
        }
        return false;
    }

    protected y(boolean bl2) {
        this.h = bl2;
        this.b(true);
        this.a((d)null);
    }

    @Override
    public int a(k k2) {
        return 2;
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.h) {
            for (ad ad2 : ad.values()) {
                k2.b(b2.a(ad2), this);
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.h) {
            for (ad ad2 : ad.values()) {
                k2.b(b2.a(ad2), this);
            }
        }
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return this.h && b2.a(a) != ad2 ? 15 : 0;
    }

    private boolean f(k k2, net.minecraft.u.b.b b2, b b3) {
        ad ad2 = ((ad)((Object)b3.a(a))).e();
        return k2.b(b2.a(ad2), ad2);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        boolean bl2 = this.f(k2, b2, b3);
        List list = (List)g.get(k2);
        while (list != null && !list.isEmpty() && k2.B() - ((cv)list.get((int)0)).b > 60L) {
            list.remove(0);
        }
        if (this.h) {
            if (bl2) {
                k2.a(b2, p.aE.v().a(a, (Comparable)((Object)((ad)((Object)b3.a(a))))), 3);
                if (this.a(k2, b2, true)) {
                    k2.a(null, b2, net.minecraft.a.f.eR, bu.e, 0.5f, 2.6f + (k2.p.nextFloat() - k2.p.nextFloat()) * 0.8f);
                    for (int i2 = 0; i2 < 5; ++i2) {
                        double d2 = (double)b2.cy_() + random.nextDouble() * 0.6 + 0.2;
                        double d3 = (double)b2.k() + random.nextDouble() * 0.6 + 0.2;
                        double d4 = (double)b2.l() + random.nextDouble() * 0.6 + 0.2;
                        k2.a(aj.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                    }
                    k2.a(b2, k2.n(b2).c(), 160);
                }
            }
        } else if (!bl2 && !this.a(k2, b2, false)) {
            k2.a(b2, p.aF.v().a(a, (Comparable)((Object)((ad)((Object)b3.a(a))))), 3);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.d(k2, b3, b2) && this.h == this.f(k2, b3, b2)) {
            k2.a(b3, (cn)this, this.a(k2));
        }
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2 == ad.a ? b2.a(n2, b3, ad2) : 0;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(p.aF);
    }

    @Override
    public boolean f(b b2) {
        return true;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        if (this.h) {
            double d2 = (double)b3.cy_() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            double d3 = (double)b3.k() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
            double d4 = (double)b3.l() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            ad ad2 = (ad)((Object)b2.a(a));
            if (ad2.l().d()) {
                ad ad3 = ad2.e();
                double d5 = 0.27;
                d2 += 0.27 * (double)ad3.h();
                d3 += 0.22;
                d4 += 0.27 * (double)ad3.j();
            }
            k2.a(aj.E, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(p.aF);
    }

    @Override
    public boolean a(cn cn2) {
        return cn2 == p.aE || cn2 == p.aF;
    }
}

