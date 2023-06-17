/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.bg;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.du;
import net.minecraft.g.fk;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public abstract class an
extends du {
    public static final e b = e.a("axis", bg.class);

    public an() {
        super(h.d);
        this.a(net.minecraft.v.d.b);
        this.c(2.0f);
        this.a(fk.a);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2 = 4;
        int n3 = 5;
        if (k2.a(b2.a(-5, -5, -5), b2.a(5, 5, 5))) {
            for (net.minecraft.u.b.b b4 : net.minecraft.u.b.b.a(b2.a(-4, -4, -4), b2.a(4, 4, 4))) {
                b b5 = k2.n(b4);
                if (b5.d() != h.j || ((Boolean)b5.a(bm.c)).booleanValue()) continue;
                k2.a(b4, b5.a(bm.c, Boolean.valueOf(true)), 4);
            }
        }
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.a(n2).a(b, (Comparable)((Object)bg.a(ad2.l())));
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case b: 
            case d: {
                switch ((bg)((Object)b2.a(b))) {
                    case a: {
                        return b2.a(b, (Comparable)((Object)bg.c));
                    }
                    case c: {
                        return b2.a(b, (Comparable)((Object)bg.a));
                    }
                }
                return b2;
            }
        }
        return b2;
    }
}

