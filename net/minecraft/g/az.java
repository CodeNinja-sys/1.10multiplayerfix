/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.ck;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.w.l;

public class az
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", ck.class);
    private final cn b;
    private static /* synthetic */ int[] e;

    public az(h h2, e e2, cn cn2) {
        super(h2, e2);
        this.z(this.O.b().a(a, (Comparable)((Object)ck.l)));
        this.b = cn2;
    }

    @Override
    public int a(Random random) {
        return Math.max(0, random.nextInt(10) - 7);
    }

    @Override
    public e g(b b2) {
        switch ((ck)((Object)b2.a(a))) {
            case m: {
                return net.minecraft.g.a.e.e;
            }
            case k: {
                return net.minecraft.g.a.e.d;
            }
            case j: {
                return net.minecraft.g.a.e.d;
            }
        }
        return super.g(b2);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(this.b);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this.b);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v();
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ck.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((ck)((Object)b2.a(a))).b();
    }

    @Override
    public b a(b b2, bq bq2) {
        block0 : switch (bq2) {
            case c: {
                switch ((ck)((Object)b2.a(a))) {
                    case j: {
                        break;
                    }
                    case a: {
                        return b2.a(a, (Comparable)((Object)ck.i));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)ck.h));
                    }
                    case c: {
                        return b2.a(a, (Comparable)((Object)ck.g));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)ck.f));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)ck.d));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)ck.c));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)ck.b));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)ck.a));
                    }
                    default: {
                        return b2;
                    }
                }
            }
            case d: {
                switch ((ck)((Object)b2.a(a))) {
                    case j: {
                        break;
                    }
                    case a: {
                        return b2.a(a, (Comparable)((Object)ck.g));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)ck.d));
                    }
                    case c: {
                        return b2.a(a, (Comparable)((Object)ck.a));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)ck.h));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)ck.b));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)ck.i));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)ck.f));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)ck.c));
                    }
                    default: {
                        return b2;
                    }
                }
            }
            case b: {
                switch ((ck)((Object)b2.a(a))) {
                    case j: {
                        break block0;
                    }
                    case a: {
                        return b2.a(a, (Comparable)((Object)ck.c));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)ck.f));
                    }
                    case c: {
                        return b2.a(a, (Comparable)((Object)ck.i));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)ck.b));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)ck.h));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)ck.a));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)ck.d));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)ck.g));
                    }
                }
                return b2;
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        ck ck2 = (ck)((Object)b2.a(a));
        block0 : switch (az.g()[bi2.ordinal()]) {
            case 2: {
                switch (ck2) {
                    case a: {
                        return b2.a(a, (Comparable)((Object)ck.g));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)ck.h));
                    }
                    case c: {
                        return b2.a(a, (Comparable)((Object)ck.i));
                    }
                    default: {
                        return super.a(b2, bi2);
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)ck.a));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)ck.b));
                    }
                    case i: 
                }
                return b2.a(a, (Comparable)((Object)ck.c));
            }
            case 3: {
                switch (ck2) {
                    case a: {
                        return b2.a(a, (Comparable)((Object)ck.c));
                    }
                    default: {
                        break block0;
                    }
                    case c: {
                        return b2.a(a, (Comparable)((Object)ck.a));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)ck.f));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)ck.d));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)ck.i));
                    }
                    case i: 
                }
                return b2.a(a, (Comparable)((Object)ck.g));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    static /* synthetic */ int[] g() {
        if (e != null) {
            return e;
        }
        int[] arrn = new int[bi.values().length];
        try {
            arrn[bi.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bi.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bi.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        e = arrn;
        return arrn;
    }
}

