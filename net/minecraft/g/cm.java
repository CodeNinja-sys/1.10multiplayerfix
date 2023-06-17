/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.b.c;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.gh;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.d.b.a;

public class cm
extends gh {
    public static final c a = net.minecraft.g.b.c.b("locked");
    public static final g b = g.a("delay", 1, 4);

    protected cm(boolean bl2) {
        super(bl2);
        this.z(this.O.b().a(j, (Comparable)((Object)ad.c)).a(b, Integer.valueOf(1)).a(a, Boolean.valueOf(false)));
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a("item.diode.name");
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return b2.a(a, Boolean.valueOf(this.a(n2, b3, b2)));
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(j, (Comparable)((Object)bq2.a((ad)((Object)b2.a(j)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(j))));
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (!b4.J.e) {
            return false;
        }
        k2.a(b2, b3.b(b), 3);
        return true;
    }

    @Override
    protected int l(b b2) {
        return (Integer)b2.a(b) * 2;
    }

    @Override
    protected b m(b b2) {
        Integer n2 = (Integer)b2.a(b);
        Boolean bl2 = (Boolean)b2.a(a);
        ad ad2 = (ad)((Object)b2.a(j));
        return p.bc.v().a(j, (Comparable)((Object)ad2)).a(b, n2).a(a, bl2);
    }

    @Override
    protected b n(b b2) {
        Integer n2 = (Integer)b2.a(b);
        Boolean bl2 = (Boolean)b2.a(a);
        ad ad2 = (ad)((Object)b2.a(j));
        return p.bb.v().a(j, (Comparable)((Object)ad2)).a(b, n2).a(a, bl2);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.bi;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.bi);
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2, b b3) {
        return this.c(n2, b2, b3) > 0;
    }

    @Override
    protected boolean o(b b2) {
        return cm.B(b2);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        if (this.d) {
            ad ad2 = (ad)((Object)b2.a(j));
            double d2 = (double)((float)b3.cy_() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d3 = (double)((float)b3.k() + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d4 = (double)((float)b3.l() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            float f2 = -5.0f;
            if (random.nextBoolean()) {
                f2 = (Integer)b2.a(b) * 2 - 1;
            }
            double d5 = (f2 /= 16.0f) * (float)ad2.h();
            double d6 = f2 * (float)ad2.j();
            k2.a(aj.E, d2 + d5, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        super.a(k2, b2, b3);
        this.h(k2, b2, b3);
    }

    @Override
    public b a(int n2) {
        return this.v().a(j, (Comparable)((Object)ad.b(n2))).a(a, Boolean.valueOf(false)).a(b, Integer.valueOf(1 + (n2 >> 2)));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(j))).c();
        return n2 |= (Integer)b2.a(b) - 1 << 2;
    }

    @Override
    protected i a() {
        return new i(this, j, b, a);
    }
}

