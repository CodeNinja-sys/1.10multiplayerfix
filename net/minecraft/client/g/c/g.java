/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.g.d;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.o;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.av;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.f.ad;

public class g
extends aa {
    private static final bp a = new bp("textures/entity/endercrystal/endercrystal.png");
    private final ap b = new av(0.0f, true);
    private final ap g = new av(0.0f, false);

    public g(f f2) {
        super(f2);
        this.d = 0.5f;
    }

    public void a(ad ad2, double d2, double d3, double d4, float f2, float f3) {
        float f4 = (float)ad2.a + f3;
        bd.D();
        bd.c((float)d2, (float)d3, (float)d4);
        this.a(a);
        float f5 = n.a(f4 * 0.2f) / 2.0f + 0.5f;
        f5 = f5 * f5 + f5;
        if (this.f) {
            bd.g();
            bd.e(this.c(ad2));
        }
        if (ad2.c()) {
            this.b.a(ad2, 0.0f, f4 * 3.0f, f5 * 0.2f, 0.0f, 0.0f, 0.0625f);
        } else {
            this.g.a(ad2, 0.0f, f4 * 3.0f, f5 * 0.2f, 0.0f, 0.0f, 0.0625f);
        }
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.E();
        b b2 = ad2.a();
        if (b2 != null) {
            this.a(o.a);
            float f6 = (float)b2.cy_() + 0.5f;
            float f7 = (float)b2.k() + 0.5f;
            float f8 = (float)b2.l() + 0.5f;
            double d5 = (double)f6 - ad2.aU;
            double d6 = (double)f7 - ad2.aV;
            double d7 = (double)f8 - ad2.aW;
            o.a(d2 + d5, d3 - 0.3 + (double)(f5 * 0.4f) + d6, d4 + d7, f3, f6, f7, f8, ad2.a, ad2.aU, ad2.aV, ad2.aW);
        }
        super.a((net.minecraft.w.n)ad2, d2, d3, d4, f2, f3);
    }

    protected bp a(ad ad2) {
        return a;
    }

    public boolean a(ad ad2, d d2, double d3, double d4, double d5) {
        return super.a((net.minecraft.w.n)ad2, d2, d3, d4, d5) || ad2.a() != null;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ad)n2);
    }
}

