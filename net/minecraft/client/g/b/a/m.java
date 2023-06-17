/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.client.g.ab;
import net.minecraft.client.g.b.a.ac;
import net.minecraft.client.g.b.a.aw;
import net.minecraft.client.g.b.a.az;
import net.minecraft.client.g.b.a.b;
import net.minecraft.client.g.b.a.i;
import net.minecraft.client.g.b.a.k;
import net.minecraft.client.g.b.a.t;
import net.minecraft.client.g.b.a.w;
import net.minecraft.client.g.b.a.x;
import net.minecraft.client.g.b.a.y;
import net.minecraft.client.g.bh;
import net.minecraft.client.g.cr;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.n;
import org.lwjgl.util.e.d;
import org.lwjgl.util.e.l;

public class m {
    private static final float a = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
    private static final float b = 1.0f / (float)Math.cos(0.7853981633974483) - 1.0f;
    private static final i[] c = new i[y.values().length * ad.values().length];
    private static final i d = new az();
    private static final i e = new w();
    private static final i f = new k();
    private static final i g = new x();
    private static /* synthetic */ int[] h;
    private static /* synthetic */ int[] i;

    static {
        m.a(y.a, ad.a, d);
        m.a(y.a, ad.f, d);
        m.a(y.a, ad.c, d);
        m.a(y.a, ad.d, d);
        m.a(y.a, ad.b, d);
        m.a(y.a, ad.e, d);
        m.a(y.b, ad.f, d);
        m.a(y.b, ad.c, d);
        m.a(y.b, ad.d, d);
        m.a(y.b, ad.e, d);
        m.a(y.c, ad.f, d);
        m.a(y.c, ad.c, d);
        m.a(y.c, ad.d, d);
        m.a(y.c, ad.e, d);
        m.a(y.d, ad.f, d);
        m.a(y.d, ad.c, d);
        m.a(y.d, ad.d, d);
        m.a(y.d, ad.e, d);
        m.a(y.e, ad.a, d);
        m.a(y.e, ad.d, d);
        m.a(y.f, ad.a, d);
        m.a(y.g, ad.a, d);
        m.a(y.g, ad.c, d);
        m.a(y.h, ad.a, d);
        m.a(y.i, ad.a, d);
        m.a(y.i, ad.b, d);
        m.a(y.m, ad.d, d);
        m.a(y.m, ad.b, d);
        m.a(y.n, ad.b, d);
        m.a(y.o, ad.c, d);
        m.a(y.o, ad.b, d);
        m.a(y.p, ad.b, d);
        m.a(y.d, ad.b, e);
        m.a(y.b, ad.a, e);
        m.a(y.e, ad.e, e);
        m.a(y.f, ad.e, e);
        m.a(y.g, ad.e, e);
        m.a(y.h, ad.c, e);
        m.a(y.h, ad.d, e);
        m.a(y.h, ad.e, e);
        m.a(y.j, ad.b, e);
        m.a(y.l, ad.a, e);
        m.a(y.m, ad.f, e);
        m.a(y.n, ad.f, e);
        m.a(y.n, ad.c, e);
        m.a(y.n, ad.d, e);
        m.a(y.o, ad.f, e);
        m.a(y.p, ad.f, e);
        m.a(y.c, ad.a, f);
        m.a(y.c, ad.b, f);
        m.a(y.e, ad.c, f);
        m.a(y.e, ad.b, f);
        m.a(y.f, ad.b, f);
        m.a(y.g, ad.d, f);
        m.a(y.g, ad.b, f);
        m.a(y.h, ad.b, f);
        m.a(y.i, ad.f, f);
        m.a(y.i, ad.c, f);
        m.a(y.i, ad.d, f);
        m.a(y.i, ad.e, f);
        m.a(y.j, ad.f, f);
        m.a(y.j, ad.c, f);
        m.a(y.j, ad.d, f);
        m.a(y.j, ad.e, f);
        m.a(y.k, ad.a, f);
        m.a(y.k, ad.f, f);
        m.a(y.k, ad.c, f);
        m.a(y.k, ad.d, f);
        m.a(y.k, ad.b, f);
        m.a(y.k, ad.e, f);
        m.a(y.l, ad.f, f);
        m.a(y.l, ad.c, f);
        m.a(y.l, ad.d, f);
        m.a(y.l, ad.e, f);
        m.a(y.m, ad.a, f);
        m.a(y.m, ad.c, f);
        m.a(y.n, ad.a, f);
        m.a(y.o, ad.a, f);
        m.a(y.o, ad.d, f);
        m.a(y.p, ad.a, f);
        m.a(y.b, ad.b, g);
        m.a(y.d, ad.a, g);
        m.a(y.e, ad.f, g);
        m.a(y.f, ad.f, g);
        m.a(y.f, ad.c, g);
        m.a(y.f, ad.d, g);
        m.a(y.g, ad.f, g);
        m.a(y.h, ad.f, g);
        m.a(y.m, ad.e, g);
        m.a(y.j, ad.a, g);
        m.a(y.l, ad.b, g);
        m.a(y.n, ad.e, g);
        m.a(y.o, ad.e, g);
        m.a(y.p, ad.c, g);
        m.a(y.p, ad.d, g);
        m.a(y.p, ad.e, g);
    }

    public t a(l l2, l l3, b b2, net.minecraft.client.g.a.d d2, ad ad2, y y2, ac ac2, boolean bl2, boolean bl3) {
        aw aw2 = b2.e;
        if (bl2) {
            aw2 = this.a(b2.e, ad2, y2);
        }
        int[] arrn = this.a(aw2, d2, ad2, this.a(l2, l3), y2, ac2, bl3);
        ad ad3 = m.a(arrn);
        if (ac2 == null) {
            this.a(arrn, ad3);
        }
        return new t(arrn, b2.c, ad3, d2);
    }

    private aw a(aw aw2, ad ad2, y y2) {
        return c[m.a(y2, ad2)].a(aw2);
    }

    private int[] a(aw aw2, net.minecraft.client.g.a.d d2, ad ad2, float[] arrf, y y2, ac ac2, boolean bl2) {
        int[] arrn = new int[28];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(arrn, i2, ad2, aw2, arrf, d2, y2, ac2, bl2);
        }
        return arrn;
    }

    private int a(ad ad2) {
        float f2 = this.b(ad2);
        int n2 = n.a((int)(f2 * 255.0f), 0, 255);
        return 0xFF000000 | n2 << 16 | n2 << 8 | n2;
    }

    private float b(ad ad2) {
        switch (m.a()[ad2.ordinal()]) {
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3: 
            case 4: {
                return 0.8f;
            }
            case 5: 
            case 6: {
                return 0.6f;
            }
        }
        return 1.0f;
    }

    private float[] a(l l2, l l3) {
        float[] arrf = new float[ad.values().length];
        arrf[ab.f] = l2.a / 16.0f;
        arrf[ab.e] = l2.b / 16.0f;
        arrf[ab.d] = l2.c / 16.0f;
        arrf[ab.c] = l3.a / 16.0f;
        arrf[ab.b] = l3.b / 16.0f;
        arrf[ab.a] = l3.c / 16.0f;
        return arrf;
    }

    private void a(int[] arrn, int n2, ad ad2, aw aw2, float[] arrf, net.minecraft.client.g.a.d d2, y y2, ac ac2, boolean bl2) {
        ad ad3 = y2.a(ad2);
        int n3 = bl2 ? this.a(ad3) : -1;
        cr cr2 = bh.a(ad2).a(n2);
        l l2 = new l(arrf[cr2.a], arrf[cr2.b], arrf[cr2.c]);
        this.a(l2, ac2);
        int n4 = this.a(l2, ad2, n2, y2);
        this.a(arrn, n4, n2, l2, n3, d2, aw2);
    }

    private void a(int[] arrn, int n2, int n3, l l2, int n4, net.minecraft.client.g.a.d d2, aw aw2) {
        int n5 = n2 * 7;
        arrn[n5] = Float.floatToRawIntBits(l2.a);
        arrn[n5 + 1] = Float.floatToRawIntBits(l2.b);
        arrn[n5 + 2] = Float.floatToRawIntBits(l2.c);
        arrn[n5 + 3] = n4;
        arrn[n5 + 4] = Float.floatToRawIntBits(d2.a((double)aw2.a(n3)));
        arrn[n5 + 4 + 1] = Float.floatToRawIntBits(d2.b((double)aw2.b(n3)));
    }

    private void a(l l2, ac ac2) {
        if (ac2 != null) {
            d d2 = this.c();
            l l3 = new l(0.0f, 0.0f, 0.0f);
            switch (m.b()[ac2.b.ordinal()]) {
                case 1: {
                    org.lwjgl.util.e.d.a(ac2.c * ((float)Math.PI / 180), new l(1.0f, 0.0f, 0.0f), d2, d2);
                    l3.a(0.0f, 1.0f, 1.0f);
                    break;
                }
                case 2: {
                    org.lwjgl.util.e.d.a(ac2.c * ((float)Math.PI / 180), new l(0.0f, 1.0f, 0.0f), d2, d2);
                    l3.a(1.0f, 0.0f, 1.0f);
                    break;
                }
                case 3: {
                    org.lwjgl.util.e.d.a(ac2.c * ((float)Math.PI / 180), new l(0.0f, 0.0f, 1.0f), d2, d2);
                    l3.a(1.0f, 1.0f, 0.0f);
                }
            }
            if (ac2.d) {
                if (Math.abs(ac2.c) == 22.5f) {
                    l3.a(a);
                } else {
                    l3.a(b);
                }
                l.a(l3, new l(1.0f, 1.0f, 1.0f), l3);
            } else {
                l3.a(1.0f, 1.0f, 1.0f);
            }
            this.a(l2, new l(ac2.a), d2, l3);
        }
    }

    public int a(l l2, ad ad2, int n2, y y2) {
        if (y2 == y.a) {
            return n2;
        }
        this.a(l2, new l(0.5f, 0.5f, 0.5f), y2.a(), new l(1.0f, 1.0f, 1.0f));
        return y2.a(ad2, n2);
    }

    private void a(l l2, l l3, d d2, l l4) {
        org.lwjgl.util.e.m m2 = new org.lwjgl.util.e.m(l2.a - l3.a, l2.b - l3.b, l2.c - l3.c, 1.0f);
        org.lwjgl.util.e.d.a(d2, m2, m2);
        m2.a *= l4.a;
        m2.b *= l4.b;
        m2.c *= l4.c;
        l2.a(m2.a + l3.a, m2.b + l3.b, m2.c + l3.c);
    }

    private d c() {
        d d2 = new d();
        d2.a();
        return d2;
    }

    public static ad a(int[] arrn) {
        l l2 = new l(Float.intBitsToFloat(arrn[0]), Float.intBitsToFloat(arrn[1]), Float.intBitsToFloat(arrn[2]));
        l l3 = new l(Float.intBitsToFloat(arrn[7]), Float.intBitsToFloat(arrn[8]), Float.intBitsToFloat(arrn[9]));
        l l4 = new l(Float.intBitsToFloat(arrn[14]), Float.intBitsToFloat(arrn[15]), Float.intBitsToFloat(arrn[16]));
        l l5 = new l();
        l l6 = new l();
        l l7 = new l();
        l.b(l2, l3, l5);
        l.b(l4, l3, l6);
        l.c(l6, l5, l7);
        float f2 = (float)Math.sqrt(l7.a * l7.a + l7.b * l7.b + l7.c * l7.c);
        l7.a /= f2;
        l7.b /= f2;
        l7.c /= f2;
        ad ad2 = null;
        float f3 = 0.0f;
        for (ad ad3 : ad.values()) {
            net.minecraft.u.b.t t2 = ad3.n();
            l l8 = new l(t2.cy_(), t2.k(), t2.l());
            float f4 = l.a(l7, l8);
            if (!(f4 >= 0.0f) || !(f4 > f3)) continue;
            f3 = f4;
            ad2 = ad3;
        }
        if (ad2 == null) {
            return ad.b;
        }
        return ad2;
    }

    private void a(int[] arrn, ad ad2) {
        float f2;
        int n2;
        int[] arrn2 = new int[arrn.length];
        System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
        float[] arrf = new float[ad.values().length];
        arrf[ab.f] = 999.0f;
        arrf[ab.e] = 999.0f;
        arrf[ab.d] = 999.0f;
        arrf[ab.c] = -999.0f;
        arrf[ab.b] = -999.0f;
        arrf[ab.a] = -999.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            n2 = 7 * i2;
            float f3 = Float.intBitsToFloat(arrn2[n2]);
            float f4 = Float.intBitsToFloat(arrn2[n2 + 1]);
            f2 = Float.intBitsToFloat(arrn2[n2 + 2]);
            if (f3 < arrf[ab.f]) {
                arrf[ab.f] = f3;
            }
            if (f4 < arrf[ab.e]) {
                arrf[ab.e] = f4;
            }
            if (f2 < arrf[ab.d]) {
                arrf[ab.d] = f2;
            }
            if (f3 > arrf[ab.c]) {
                arrf[ab.c] = f3;
            }
            if (f4 > arrf[ab.b]) {
                arrf[ab.b] = f4;
            }
            if (!(f2 > arrf[ab.a])) continue;
            arrf[ab.a] = f2;
        }
        bh bh2 = bh.a(ad2);
        for (n2 = 0; n2 < 4; ++n2) {
            int n3 = 7 * n2;
            cr cr2 = bh2.a(n2);
            f2 = arrf[cr2.a];
            float f5 = arrf[cr2.b];
            float f6 = arrf[cr2.c];
            arrn[n3] = Float.floatToRawIntBits(f2);
            arrn[n3 + 1] = Float.floatToRawIntBits(f5);
            arrn[n3 + 2] = Float.floatToRawIntBits(f6);
            for (int i3 = 0; i3 < 4; ++i3) {
                int n4 = 7 * i3;
                float f7 = Float.intBitsToFloat(arrn2[n4]);
                float f8 = Float.intBitsToFloat(arrn2[n4 + 1]);
                float f9 = Float.intBitsToFloat(arrn2[n4 + 2]);
                if (!n.a(f2, f7) || !n.a(f5, f8) || !n.a(f6, f9)) continue;
                arrn[n3 + 4] = arrn2[n4 + 4];
                arrn[n3 + 4 + 1] = arrn2[n4 + 4 + 1];
            }
        }
    }

    private static void a(y y2, ad ad2, i i2) {
        m.c[m.a((y)y2, (ad)ad2)] = i2;
    }

    private static int a(y y2, ad ad2) {
        return y.values().length * ad2.ordinal() + y2.ordinal();
    }

    static /* synthetic */ int[] a() {
        if (h != null) {
            return h;
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
        h = arrn;
        return arrn;
    }

    static /* synthetic */ int[] b() {
        if (i != null) {
            return i;
        }
        int[] arrn = new int[ae.values().length];
        try {
            arrn[ae.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ae.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ae.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        i = arrn;
        return arrn;
    }
}

