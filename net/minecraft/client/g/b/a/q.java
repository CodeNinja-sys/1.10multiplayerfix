/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.b.a.h;
import net.minecraft.client.g.bd;
import net.minecraft.u.b.n;
import org.lwjgl.util.e.e;

public class q {
    public static final q a = new q();
    public static float b;
    public static float c;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static float h;
    public static float i;
    public static float j;
    public final h k;
    public final h l;
    public final h m;
    public final h n;
    public final h o;
    public final h p;
    public final h q;
    public final h r;
    private static /* synthetic */ int[] s;

    private q() {
        this(net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a, net.minecraft.client.g.b.a.h.a);
    }

    public q(q q2) {
        this.k = q2.k;
        this.l = q2.l;
        this.m = q2.m;
        this.n = q2.n;
        this.o = q2.o;
        this.p = q2.p;
        this.q = q2.q;
        this.r = q2.r;
    }

    public q(h h2, h h3, h h4, h h5, h h6, h h7, h h8, h h9) {
        this.k = h2;
        this.l = h3;
        this.m = h4;
        this.n = h5;
        this.o = h6;
        this.p = h7;
        this.q = h8;
        this.r = h9;
    }

    public void a(ao ao2) {
        net.minecraft.client.g.b.a.q.a(this.b(ao2), false);
    }

    public static void a(h h2, boolean bl2) {
        if (h2 != net.minecraft.client.g.b.a.h.a) {
            int n2 = bl2 ? -1 : 1;
            bd.c((float)n2 * (b + h2.c.a), c + h2.c.b, d + h2.c.c);
            float f2 = e + h2.b.a;
            float f3 = f + h2.b.b;
            float f4 = g + h2.b.c;
            if (bl2) {
                f3 = -f3;
                f4 = -f4;
            }
            bd.a(net.minecraft.client.g.b.a.q.a(f2, f3, f4));
            bd.b(h + h2.d.a, i + h2.d.b, j + h2.d.c);
        }
    }

    private static e a(float f2, float f3, float f4) {
        float f5 = f2 * ((float)Math.PI / 180);
        float f6 = f3 * ((float)Math.PI / 180);
        float f7 = f4 * ((float)Math.PI / 180);
        float f8 = net.minecraft.u.b.n.a(0.5f * f5);
        float f9 = net.minecraft.u.b.n.b(0.5f * f5);
        float f10 = net.minecraft.u.b.n.a(0.5f * f6);
        float f11 = net.minecraft.u.b.n.b(0.5f * f6);
        float f12 = net.minecraft.u.b.n.a(0.5f * f7);
        float f13 = net.minecraft.u.b.n.b(0.5f * f7);
        return new e(f8 * f11 * f13 + f9 * f10 * f12, f9 * f10 * f13 - f8 * f11 * f12, f8 * f10 * f13 + f9 * f11 * f12, f9 * f11 * f13 - f8 * f10 * f12);
    }

    public h b(ao ao2) {
        switch (net.minecraft.client.g.b.a.q.a()[ao2.ordinal()]) {
            case 2: {
                return this.k;
            }
            case 3: {
                return this.l;
            }
            case 4: {
                return this.m;
            }
            case 5: {
                return this.n;
            }
            case 6: {
                return this.o;
            }
            case 7: {
                return this.p;
            }
            case 8: {
                return this.q;
            }
            case 9: {
                return this.r;
            }
        }
        return net.minecraft.client.g.b.a.h.a;
    }

    public boolean c(ao ao2) {
        return this.b(ao2) != net.minecraft.client.g.b.a.h.a;
    }

    static /* synthetic */ int[] a() {
        if (s != null) {
            return s;
        }
        int[] arrn = new int[ao.values().length];
        try {
            arrn[ao.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.i.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ao.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        s = arrn;
        return arrn;
    }
}

