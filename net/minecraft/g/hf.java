/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.ai;
import net.minecraft.g.bb;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.c;
import net.minecraft.v.d;

public class hf
extends ai {
    public static final net.minecraft.g.b.e f = net.minecraft.g.b.e.a("color", cd.class);

    public hf() {
        super(net.minecraft.g.a.h.s, false);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(f, (Comparable)((Object)cd.a)));
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public int k(b b2) {
        return ((cd)((Object)b2.a(f))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (int i2 = 0; i2 < cd.values().length; ++i2) {
            list.add(new cu(cg2, 1, i2));
        }
    }

    @Override
    public e g(b b2) {
        return ((cd)((Object)b2.a(f))).e();
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.d;
    }

    @Override
    public b a(int n2) {
        return this.v().a(f, (Comparable)((Object)cd.b(n2)));
    }

    @Override
    public int b(b b2) {
        return ((cd)((Object)b2.a(f))).b();
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case c: {
                return b2.a(a, (Boolean)b2.a(c)).a(b, (Boolean)b2.a(d)).a(c, (Boolean)b2.a(a)).a(d, (Boolean)b2.a(b));
            }
            case d: {
                return b2.a(a, (Boolean)b2.a(b)).a(b, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(a));
            }
            case b: {
                return b2.a(a, (Boolean)b2.a(d)).a(b, (Boolean)b2.a(a)).a(c, (Boolean)b2.a(b)).a(d, (Boolean)b2.a(c));
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        switch (bi2) {
            case b: {
                return b2.a(a, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(a));
            }
            case c: {
                return b2.a(b, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(b));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a, b, d, c, f);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            bb.c(k2, b2);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            bb.c(k2, b2);
        }
    }
}

