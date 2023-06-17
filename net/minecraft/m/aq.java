/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import java.util.Random;
import net.minecraft.a.f;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dk;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.b.n;
import net.minecraft.u.b.q;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f.j;

public class aq
extends cg {
    public aq() {
        this.a(d.c);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        double d2;
        double d3;
        net.minecraft.u.b.b b4;
        if (ad2 == ad.a) {
            return ab.c;
        }
        boolean bl2 = k2.n(b3).c().b(k2, b3);
        net.minecraft.u.b.b b5 = b4 = bl2 ? b3 : b3.a(ad2);
        if (!b2.a(b4, ad2, cu2)) {
            return ab.c;
        }
        net.minecraft.u.b.b b6 = b4.b();
        boolean bl3 = !k2.c(b4) && !k2.n(b4).c().b(k2, b4);
        if (bl3 |= !k2.c(b6) && !k2.n(b6).c().b(k2, b6)) {
            return ab.c;
        }
        double d4 = b4.cy_();
        List list = k2.b(null, new a(d4, d3 = (double)b4.k(), d2 = (double)b4.l(), d4 + 1.0, d3 + 2.0, d2 + 1.0));
        if (!list.isEmpty()) {
            return ab.c;
        }
        if (!k2.C) {
            k2.f(b4);
            k2.f(b6);
            j j2 = new j(k2, d4 + 0.5, d3, d2 + 0.5);
            float f5 = (float)n.d((n.g(b2.ba - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            j2.b(d4 + 0.5, d3, d2 + 0.5, f5, 0.0f);
            this.a(j2, k2.p);
            dk.a(k2, b2, cu2, j2);
            k2.a(j2);
            k2.a(null, j2.aU, j2.aV, j2.aW, net.minecraft.a.f.m, bu.e, 0.75f, 0.8f);
        }
        --cu2.b;
        return ab.a;
    }

    private void a(j j2, Random random) {
        q q2 = j2.q();
        float f2 = random.nextFloat() * 5.0f;
        float f3 = random.nextFloat() * 20.0f - 10.0f;
        q q3 = new q(q2.b() + f2, q2.c() + f3, q2.d());
        j2.a(q3);
        q2 = j2.r();
        f2 = random.nextFloat() * 10.0f - 5.0f;
        q3 = new q(q2.b(), q2.c() + f2, q2.d());
        j2.b(q3);
    }
}

