/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.an;
import net.minecraft.g.bg;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.gq;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class es
extends an {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", net.minecraft.g.b.class, new gq());
    private static /* synthetic */ int[] d;
    private static /* synthetic */ int[] e;

    public es() {
        this.z(this.O.b().a(a, (Comparable)((Object)net.minecraft.g.b.e)).a(b, (Comparable)((Object)bg.b)));
    }

    @Override
    public e g(b b2) {
        net.minecraft.g.b b3 = (net.minecraft.g.b)((Object)b2.a(a));
        switch (es.k()[((bg)((Object)b2.a(b))).ordinal()]) {
            default: {
                switch (es.j()[b3.ordinal()]) {
                    default: {
                        return net.minecraft.g.a.e.m;
                    }
                    case 6: 
                }
                return net.minecraft.g.b.f.c();
            }
            case 2: 
        }
        return b3.c();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, net.minecraft.g.b.e.b() - 4));
        list.add(new cu(cg2, 1, net.minecraft.g.b.f.b() - 4));
    }

    @Override
    public b a(int n2) {
        b b2 = this.v().a(a, (Comparable)((Object)net.minecraft.g.b.a((n2 & 3) + 4)));
        switch (n2 & 0xC) {
            case 0: {
                b2 = b2.a(b, (Comparable)((Object)bg.b));
                break;
            }
            case 4: {
                b2 = b2.a(b, (Comparable)((Object)bg.a));
                break;
            }
            case 8: {
                b2 = b2.a(b, (Comparable)((Object)bg.c));
                break;
            }
            default: {
                b2 = b2.a(b, (Comparable)((Object)bg.d));
            }
        }
        return b2;
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((net.minecraft.g.b)((Object)b2.a(a))).b() - 4;
        switch (es.k()[((bg)((Object)b2.a(b))).ordinal()]) {
            case 1: {
                n2 |= 4;
                break;
            }
            case 3: {
                n2 |= 8;
                break;
            }
            case 4: {
                n2 |= 0xC;
            }
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }

    @Override
    protected cu j(b b2) {
        return new cu(cg.a(this), 1, ((net.minecraft.g.b)((Object)b2.a(a))).b() - 4);
    }

    @Override
    public int k(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b() - 4;
    }

    static /* synthetic */ int[] j() {
        if (d != null) {
            return d;
        }
        int[] arrn = new int[net.minecraft.g.b.values().length];
        try {
            arrn[net.minecraft.g.b.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        d = arrn;
        return arrn;
    }

    static /* synthetic */ int[] k() {
        if (e != null) {
            return e;
        }
        int[] arrn = new int[bg.values().length];
        try {
            arrn[bg.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bg.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bg.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bg.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        e = arrn;
        return arrn;
    }
}

