/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.ew;
import net.minecraft.g.ga;
import net.minecraft.g.gf;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dr;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

abstract class am
extends r {
    protected dr a = dr.a;
    private static /* synthetic */ int[] d;
    private static /* synthetic */ int[] e;

    public am() {
    }

    protected am(int n2) {
        super(n2);
    }

    @Override
    protected void a(e e2) {
        e2.a("EntryDoor", this.a.name());
    }

    @Override
    protected void b(e e2) {
        this.a = dr.valueOf(e2.l("EntryDoor"));
    }

    protected void a(k k2, Random random, dc dc2, dr dr2, int n2, int n3, int n4) {
        switch (am.a()[dr2.ordinal()]) {
            case 1: {
                this.a(k2, dc2, n2, n3, n4, n2 + 3 - 1, n3 + 3 - 1, n4, p.a.v(), p.a.v(), false);
                break;
            }
            case 2: {
                this.a(k2, p.bf.v(), n2, n3, n4, dc2);
                this.a(k2, p.bf.v(), n2, n3 + 1, n4, dc2);
                this.a(k2, p.bf.v(), n2, n3 + 2, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 1, n3 + 2, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 2, n3 + 2, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 2, n3 + 1, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 2, n3, n4, dc2);
                this.a(k2, p.ao.v(), n2 + 1, n3, n4, dc2);
                this.a(k2, p.ao.v().a(ga.e, (Comparable)((Object)ew.a)), n2 + 1, n3 + 1, n4, dc2);
                break;
            }
            case 3: {
                this.a(k2, p.a.v(), n2 + 1, n3, n4, dc2);
                this.a(k2, p.a.v(), n2 + 1, n3 + 1, n4, dc2);
                this.a(k2, p.bi.v(), n2, n3, n4, dc2);
                this.a(k2, p.bi.v(), n2, n3 + 1, n4, dc2);
                this.a(k2, p.bi.v(), n2, n3 + 2, n4, dc2);
                this.a(k2, p.bi.v(), n2 + 1, n3 + 2, n4, dc2);
                this.a(k2, p.bi.v(), n2 + 2, n3 + 2, n4, dc2);
                this.a(k2, p.bi.v(), n2 + 2, n3 + 1, n4, dc2);
                this.a(k2, p.bi.v(), n2 + 2, n3, n4, dc2);
                break;
            }
            case 4: {
                this.a(k2, p.bf.v(), n2, n3, n4, dc2);
                this.a(k2, p.bf.v(), n2, n3 + 1, n4, dc2);
                this.a(k2, p.bf.v(), n2, n3 + 2, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 1, n3 + 2, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 2, n3 + 2, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 2, n3 + 1, n4, dc2);
                this.a(k2, p.bf.v(), n2 + 2, n3, n4, dc2);
                this.a(k2, p.aA.v(), n2 + 1, n3, n4, dc2);
                this.a(k2, p.aA.v().a(ga.e, (Comparable)((Object)ew.a)), n2 + 1, n3 + 1, n4, dc2);
                this.a(k2, p.aG.v().a(gf.o, (Comparable)((Object)ad.c)), n2 + 2, n3 + 1, n4 + 1, dc2);
                this.a(k2, p.aG.v().a(gf.o, (Comparable)((Object)ad.d)), n2 + 2, n3 + 1, n4 - 1, dc2);
            }
        }
    }

    protected dr a(Random random) {
        int n2 = random.nextInt(5);
        switch (n2) {
            default: {
                return dr.a;
            }
            case 2: {
                return dr.b;
            }
            case 3: {
                return dr.c;
            }
            case 4: 
        }
        return dr.d;
    }

    protected r a(ds ds2, List list, Random random, int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (am.b()[ad2.ordinal()]) {
                case 3: {
                    return dq.a(ds2, list, random, this.b.a + n2, this.b.b + n3, this.b.c - 1, ad2, this.g());
                }
                case 4: {
                    return dq.a(ds2, list, random, this.b.a + n2, this.b.b + n3, this.b.f + 1, ad2, this.g());
                }
                case 5: {
                    return dq.a(ds2, list, random, this.b.a - 1, this.b.b + n3, this.b.c + n2, ad2, this.g());
                }
                case 6: {
                    return dq.a(ds2, list, random, this.b.d + 1, this.b.b + n3, this.b.c + n2, ad2, this.g());
                }
            }
        }
        return null;
    }

    protected r b(ds ds2, List list, Random random, int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (am.b()[ad2.ordinal()]) {
                case 3: {
                    return dq.a(ds2, list, random, this.b.a - 1, this.b.b + n2, this.b.c + n3, ad.e, this.g());
                }
                case 4: {
                    return dq.a(ds2, list, random, this.b.a - 1, this.b.b + n2, this.b.c + n3, ad.e, this.g());
                }
                case 5: {
                    return dq.a(ds2, list, random, this.b.a + n3, this.b.b + n2, this.b.c - 1, ad.c, this.g());
                }
                case 6: {
                    return dq.a(ds2, list, random, this.b.a + n3, this.b.b + n2, this.b.c - 1, ad.c, this.g());
                }
            }
        }
        return null;
    }

    protected r c(ds ds2, List list, Random random, int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (am.b()[ad2.ordinal()]) {
                case 3: {
                    return dq.a(ds2, list, random, this.b.d + 1, this.b.b + n2, this.b.c + n3, ad.f, this.g());
                }
                case 4: {
                    return dq.a(ds2, list, random, this.b.d + 1, this.b.b + n2, this.b.c + n3, ad.f, this.g());
                }
                case 5: {
                    return dq.a(ds2, list, random, this.b.a + n3, this.b.b + n2, this.b.f + 1, ad.d, this.g());
                }
                case 6: {
                    return dq.a(ds2, list, random, this.b.a + n3, this.b.b + n2, this.b.f + 1, ad.d, this.g());
                }
            }
        }
        return null;
    }

    protected static boolean a(dc dc2) {
        return dc2 != null && dc2.b > 10;
    }

    static /* synthetic */ int[] a() {
        if (d != null) {
            return d;
        }
        int[] arrn = new int[dr.values().length];
        try {
            arrn[dr.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[dr.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[dr.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[dr.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        d = arrn;
        return arrn;
    }

    static /* synthetic */ int[] b() {
        if (e != null) {
            return e;
        }
        int[] arrn = new int[ad.values().length];
        try {
            arrn[ad.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        e = arrn;
        return arrn;
    }
}

