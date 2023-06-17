/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.bq;
import net.minecraft.w.l;

public class du
extends cn {
    public static final net.minecraft.g.b.e c = net.minecraft.g.b.e.a("axis", ae.class);

    protected du(h h2) {
        super(h2, h2.p());
    }

    protected du(h h2, e e2) {
        super(h2, e2);
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case b: 
            case d: {
                switch ((ae)((Object)b2.a(c))) {
                    case a: {
                        return b2.a(c, (Comparable)((Object)ae.c));
                    }
                    case c: {
                        return b2.a(c, (Comparable)((Object)ae.a));
                    }
                }
                return b2;
            }
        }
        return b2;
    }

    @Override
    public b a(int n2) {
        ae ae2 = ae.b;
        int n3 = n2 & 0xC;
        if (n3 == 4) {
            ae2 = ae.a;
        } else if (n3 == 8) {
            ae2 = ae.c;
        }
        return this.v().a(c, (Comparable)((Object)ae2));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        ae ae2 = (ae)((Object)b2.a(c));
        if (ae2 == ae.a) {
            n2 |= 4;
        } else if (ae2 == ae.c) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, c);
    }

    @Override
    protected cu j(b b2) {
        return new cu(cg.a(this));
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return super.a(k2, b2, ad2, f2, f3, f4, n2, l2).a(c, (Comparable)((Object)ad2.l()));
    }
}

