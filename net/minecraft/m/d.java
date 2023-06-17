/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ew;
import net.minecraft.g.fk;
import net.minecraft.g.fw;
import net.minecraft.g.ga;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;

public class d
extends cg {
    private final cn a;

    public d(cn cn2) {
        this.a = cn2;
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (ad2 != ad.b) {
            return ab.c;
        }
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        if (!cn2.b(k2, b3)) {
            b3 = b3.a(ad2);
        }
        if (b2.a(b3, ad2, cu2) && this.a.a_(k2, b3)) {
            ad ad3 = ad.a(b2.ba);
            int n2 = ad3.h();
            int n3 = ad3.j();
            boolean bl2 = n2 < 0 && f4 < 0.5f || n2 > 0 && f4 > 0.5f || n3 < 0 && f2 > 0.5f || n3 > 0 && f2 < 0.5f;
            d.a(k2, b3, ad3, this.a, bl2);
            fk fk2 = this.a.w();
            k2.a(b2, b3, fk2.e(), bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f);
            --cu2.b;
            return ab.a;
        }
        return ab.c;
    }

    public static void a(k k2, net.minecraft.u.b.b b2, ad ad2, cn cn2, boolean bl2) {
        boolean bl3;
        net.minecraft.u.b.b b3 = b2.a(ad2.f());
        net.minecraft.u.b.b b4 = b2.a(ad2.g());
        int n2 = (k2.n(b4).o() ? 1 : 0) + (k2.n(b4.b()).o() ? 1 : 0);
        int n3 = (k2.n(b3).o() ? 1 : 0) + (k2.n(b3.b()).o() ? 1 : 0);
        boolean bl4 = k2.n(b4).c() == cn2 || k2.n(b4.b()).c() == cn2;
        boolean bl5 = bl3 = k2.n(b3).c() == cn2 || k2.n(b3.b()).c() == cn2;
        if ((!bl4 || bl3) && n3 <= n2) {
            if (bl3 && !bl4 || n3 < n2) {
                bl2 = false;
            }
        } else {
            bl2 = true;
        }
        net.minecraft.u.b.b b5 = b2.b();
        boolean bl6 = k2.x(b2) || k2.x(b5);
        b b6 = cn2.v().a(ga.a, (Comparable)((Object)ad2)).a(ga.c, (Comparable)((Object)(bl2 ? fw.b : fw.a))).a(ga.d, Boolean.valueOf(bl6)).a(ga.b, Boolean.valueOf(bl6));
        k2.a(b2, b6.a(ga.e, (Comparable)((Object)ew.b)), 2);
        k2.a(b5, b6.a(ga.e, (Comparable)((Object)ew.a)), 2);
        k2.b(b2, cn2);
        k2.b(b5, cn2);
    }
}

