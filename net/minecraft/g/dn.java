/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.fn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class dn
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", fn.class);
    private static /* synthetic */ int[] d;

    public dn() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)fn.a)));
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        if (n2 == fn.c.b()) {
            switch (ad2.l()) {
                case c: {
                    return this.v().a(a, (Comparable)((Object)fn.e));
                }
                case a: {
                    return this.v().a(a, (Comparable)((Object)fn.d));
                }
                case b: {
                    return this.v().a(a, (Comparable)((Object)fn.c));
                }
            }
        }
        return n2 == fn.b.b() ? this.v().a(a, (Comparable)((Object)fn.b)) : this.v().a(a, (Comparable)((Object)fn.a));
    }

    @Override
    public int k(b b2) {
        fn fn2 = (fn)((Object)b2.a(a));
        return fn2 != fn.d && fn2 != fn.e ? fn2.b() : fn.c.b();
    }

    @Override
    protected cu j(b b2) {
        fn fn2 = (fn)((Object)b2.a(a));
        return fn2 != fn.d && fn2 != fn.e ? super.j(b2) : new cu(cg.a(this), 1, fn.c.b());
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, fn.a.b()));
        list.add(new cu(cg2, 1, fn.b.b()));
        list.add(new cu(cg2, 1, fn.c.b()));
    }

    @Override
    public e g(b b2) {
        return e.p;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)fn.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((fn)((Object)b2.a(a))).b();
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (dn.j()[bq2.ordinal()]) {
            case 2: 
            case 4: {
                switch ((fn)((Object)b2.a(a))) {
                    case d: {
                        return b2.a(a, (Comparable)((Object)fn.e));
                    }
                    case e: {
                        return b2.a(a, (Comparable)((Object)fn.d));
                    }
                }
                return b2;
            }
        }
        return b2;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    static /* synthetic */ int[] j() {
        if (d != null) {
            return d;
        }
        int[] arrn = new int[bq.values().length];
        try {
            arrn[bq.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        d = arrn;
        return arrn;
    }
}

