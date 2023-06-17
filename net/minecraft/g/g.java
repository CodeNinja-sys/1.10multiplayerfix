/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.f;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.gf;
import net.minecraft.g.ia;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class g
extends cn {
    public static final e a = net.minecraft.g.b.e.a("facing", ia.class);
    public static final c b = net.minecraft.g.b.c.b("powered");
    protected static final a c = new a(0.3125, 0.2f, 0.625, 0.6875, 0.8f, 1.0);
    protected static final a d = new a(0.3125, 0.2f, 0.0, 0.6875, 0.8f, 0.375);
    protected static final a e = new a(0.625, 0.2f, 0.3125, 1.0, 0.8f, 0.6875);
    protected static final a f = new a(0.0, 0.2f, 0.3125, 0.375, 0.8f, 0.6875);
    protected static final a g = new a(0.25, 0.0, 0.25, 0.75, 0.6f, 0.75);
    protected static final a h = new a(0.25, 0.4f, 0.25, 0.75, 1.0, 0.75);
    private static /* synthetic */ int[] i;
    private static /* synthetic */ int[] j;

    protected g() {
        super(net.minecraft.g.a.h.q);
        this.z(this.O.b().a(a, (Comparable)((Object)ia.e)).a(b, Boolean.valueOf(false)));
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return net.minecraft.g.g.b(k2, b2, ad2.e());
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        for (ad ad2 : ad.values()) {
            if (!net.minecraft.g.g.b(k2, b2, ad2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return gf.b(k2, b2, ad2);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        b b3 = this.v().a(b, Boolean.valueOf(false));
        if (net.minecraft.g.g.b(k2, b2, ad2.e())) {
            return b3.a(a, (Comparable)((Object)ia.a(ad2, l2.cl_())));
        }
        for (ad ad3 : ag.a) {
            if (ad3 == ad2 || !net.minecraft.g.g.b(k2, b2, ad3.e())) continue;
            return b3.a(a, (Comparable)((Object)ia.a(ad3, l2.cl_())));
        }
        if (k2.n(b2.c()).t()) {
            return b3.a(a, (Comparable)((Object)ia.a(ad.b, l2.cl_())));
        }
        return b3;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (this.e(k2, b3, b2) && !net.minecraft.g.g.b(k2, b3, ((ia)((Object)b2.a(a))).c().e())) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
    }

    private boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.a_(k2, b2)) {
            return true;
        }
        this.b(k2, b2, b3, 0);
        k2.f(b2);
        return false;
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch (net.minecraft.g.g.b()[((ia)((Object)b2.a(a))).ordinal()]) {
            default: {
                return f;
            }
            case 3: {
                return e;
            }
            case 4: {
                return d;
            }
            case 5: {
                return c;
            }
            case 6: 
            case 7: {
                return g;
            }
            case 1: 
            case 8: 
        }
        return h;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        b3 = b3.b(b);
        k2.a(b2, b3, 3);
        float f5 = (Boolean)b3.a(b) != false ? 0.6f : 0.5f;
        k2.a(null, b2, net.minecraft.a.f.dl, bu.e, 0.3f, f5);
        k2.b(b2, this);
        ad ad3 = ((ia)((Object)b3.a(a))).c();
        k2.b(b2.a(ad3.e()), this);
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        if (((Boolean)b3.a(b)).booleanValue()) {
            k2.b(b2, this);
            ad ad2 = ((ia)((Object)b3.a(a))).c();
            k2.b(b2.a(ad2.e()), this);
        }
        super.a(k2, b2, b3);
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(b) != false ? 15 : 0;
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(b) == false ? 0 : (((ia)((Object)b2.a(a))).c() == ad2 ? 15 : 0);
    }

    @Override
    public boolean f(b b2) {
        return true;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ia.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ia)((Object)b2.a(a))).b();
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (net.minecraft.g.g.c()[bq2.ordinal()]) {
            case 3: {
                switch (net.minecraft.g.g.b()[((ia)((Object)b2.a(a))).ordinal()]) {
                    case 2: {
                        return b2.a(a, (Comparable)((Object)ia.c));
                    }
                    case 3: {
                        return b2.a(a, (Comparable)((Object)ia.b));
                    }
                    case 4: {
                        return b2.a(a, (Comparable)((Object)ia.e));
                    }
                    case 5: {
                        return b2.a(a, (Comparable)((Object)ia.d));
                    }
                }
                return b2;
            }
            case 4: {
                switch (net.minecraft.g.g.b()[((ia)((Object)b2.a(a))).ordinal()]) {
                    case 2: {
                        return b2.a(a, (Comparable)((Object)ia.e));
                    }
                    case 3: {
                        return b2.a(a, (Comparable)((Object)ia.d));
                    }
                    case 4: {
                        return b2.a(a, (Comparable)((Object)ia.b));
                    }
                    case 5: {
                        return b2.a(a, (Comparable)((Object)ia.c));
                    }
                    case 6: {
                        return b2.a(a, (Comparable)((Object)ia.g));
                    }
                    case 7: {
                        return b2.a(a, (Comparable)((Object)ia.f));
                    }
                    case 1: {
                        return b2.a(a, (Comparable)((Object)ia.h));
                    }
                    case 8: {
                        return b2.a(a, (Comparable)((Object)ia.a));
                    }
                }
            }
            case 2: {
                switch (net.minecraft.g.g.b()[((ia)((Object)b2.a(a))).ordinal()]) {
                    case 2: {
                        return b2.a(a, (Comparable)((Object)ia.d));
                    }
                    case 3: {
                        return b2.a(a, (Comparable)((Object)ia.e));
                    }
                    case 4: {
                        return b2.a(a, (Comparable)((Object)ia.c));
                    }
                    case 5: {
                        return b2.a(a, (Comparable)((Object)ia.b));
                    }
                    case 6: {
                        return b2.a(a, (Comparable)((Object)ia.g));
                    }
                    case 7: {
                        return b2.a(a, (Comparable)((Object)ia.f));
                    }
                    case 1: {
                        return b2.a(a, (Comparable)((Object)ia.h));
                    }
                    case 8: {
                        return b2.a(a, (Comparable)((Object)ia.a));
                    }
                }
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a(((ia)((Object)b2.a(a))).c()));
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }

    static /* synthetic */ int[] b() {
        if (i != null) {
            return i;
        }
        int[] arrn = new int[ia.values().length];
        try {
            arrn[ia.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ia.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        i = arrn;
        return arrn;
    }

    static /* synthetic */ int[] c() {
        if (j != null) {
            return j;
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
        j = arrn;
        return arrn;
    }
}

