/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.util.BitSet;
import java.util.List;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.b;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.t;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.cc;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.h.g;
import net.minecraft.client.r;
import net.minecraft.g.fo;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.bo;

public class cn {
    private final g a;
    private static /* synthetic */ int[] b;

    public cn(g g2) {
        this.a = g2;
    }

    public boolean a(n n2, aq aq2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, net.minecraft.client.g.g g2, boolean bl2) {
        return this.a(n2, aq2, b2, b3, g2, bl2, net.minecraft.u.b.n.a(b3));
    }

    public boolean a(n n2, aq aq2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, net.minecraft.client.g.g g2, boolean bl2, long l2) {
        boolean bl3 = r.y() && b2.g() == 0 && aq2.a();
        try {
            return bl3 ? this.b(n2, aq2, b2, b3, g2, bl2, l2) : this.c(n2, aq2, b2, b3, g2, bl2, l2);
        }
        catch (Throwable throwable) {
            a a2 = net.minecraft.k.a.a(throwable, "Tesselating block model");
            i i2 = a2.a("Block model being tesselated");
            i.a(i2, b3, b2);
            i2.a("Using AO", bl3);
            throw new bo(a2);
        }
    }

    public boolean b(n n2, aq aq2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, net.minecraft.client.g.g g2, boolean bl2, long l2) {
        boolean bl3 = false;
        float[] arrf = new float[ad.values().length * 2];
        BitSet bitSet = new BitSet(3);
        b b4 = new b(this);
        for (ad object2 : ad.values()) {
            List list = aq2.a(b2, object2, l2);
            if (list.isEmpty() || bl2 && !b2.c(n2, b3, object2)) continue;
            this.a(n2, b2, b3, g2, list, arrf, bitSet, b4);
            bl3 = true;
        }
        List list = aq2.a(b2, null, l2);
        if (!list.isEmpty()) {
            this.a(n2, b2, b3, g2, list, arrf, bitSet, b4);
            bl3 = true;
        }
        return bl3;
    }

    public boolean c(n n2, aq aq2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, net.minecraft.client.g.g g2, boolean bl2, long l2) {
        boolean bl3 = false;
        BitSet bitSet = new BitSet(3);
        for (ad object2 : ad.values()) {
            List list = aq2.a(b2, object2, l2);
            if (list.isEmpty() || bl2 && !b2.c(n2, b3, object2)) continue;
            int n3 = b2.a(n2, b3.a(object2));
            this.a(n2, b2, b3, n3, false, g2, list, bitSet);
            bl3 = true;
        }
        List list = aq2.a(b2, null, l2);
        if (!list.isEmpty()) {
            this.a(n2, b2, b3, -1, true, g2, list, bitSet);
            bl3 = true;
        }
        return bl3;
    }

    private void a(n n2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, net.minecraft.client.g.g g2, List list, float[] arrf, BitSet bitSet, b b4) {
        double d2 = b3.cy_();
        double d3 = b3.k();
        double d4 = b3.l();
        net.minecraft.g.cn cn2 = b2.c();
        fo fo2 = cn2.bS_();
        if (fo2 != fo.a) {
            long l2 = net.minecraft.u.b.n.a(b3);
            d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (fo2 == fo.c) {
                d3 += ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            t t2 = (t)list.get(i2);
            this.a(b2, t2.b(), t2.e(), arrf, bitSet);
            b4.a(n2, b2, b3, t2.e(), arrf, bitSet);
            g2.a(t2.b());
            g2.a(net.minecraft.client.g.b.a(b4)[0], net.minecraft.client.g.b.a(b4)[1], net.minecraft.client.g.b.a(b4)[2], net.minecraft.client.g.b.a(b4)[3]);
            if (t2.c()) {
                int n4 = this.a.a(b2, n2, b3, t2.d());
                if (cc.a) {
                    n4 = p.c(n4);
                }
                float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n4 & 0xFF) / 255.0f;
                g2.a(net.minecraft.client.g.b.b(b4)[0] * f2, net.minecraft.client.g.b.b(b4)[0] * f3, net.minecraft.client.g.b.b(b4)[0] * f4, 4);
                g2.a(net.minecraft.client.g.b.b(b4)[1] * f2, net.minecraft.client.g.b.b(b4)[1] * f3, net.minecraft.client.g.b.b(b4)[1] * f4, 3);
                g2.a(net.minecraft.client.g.b.b(b4)[2] * f2, net.minecraft.client.g.b.b(b4)[2] * f3, net.minecraft.client.g.b.b(b4)[2] * f4, 2);
                g2.a(net.minecraft.client.g.b.b(b4)[3] * f2, net.minecraft.client.g.b.b(b4)[3] * f3, net.minecraft.client.g.b.b(b4)[3] * f4, 1);
            } else {
                g2.a(net.minecraft.client.g.b.b(b4)[0], net.minecraft.client.g.b.b(b4)[0], net.minecraft.client.g.b.b(b4)[0], 4);
                g2.a(net.minecraft.client.g.b.b(b4)[1], net.minecraft.client.g.b.b(b4)[1], net.minecraft.client.g.b.b(b4)[1], 3);
                g2.a(net.minecraft.client.g.b.b(b4)[2], net.minecraft.client.g.b.b(b4)[2], net.minecraft.client.g.b.b(b4)[2], 2);
                g2.a(net.minecraft.client.g.b.b(b4)[3], net.minecraft.client.g.b.b(b4)[3], net.minecraft.client.g.b.b(b4)[3], 1);
            }
            g2.a(d2, d3, d4);
        }
    }

    private void a(net.minecraft.g.c.b b2, int[] arrn, ad ad2, float[] arrf, BitSet bitSet) {
        float f2;
        float f3 = 32.0f;
        float f4 = 32.0f;
        float f5 = 32.0f;
        float f6 = -32.0f;
        float f7 = -32.0f;
        float f8 = -32.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            f2 = Float.intBitsToFloat(arrn[i2 * 7]);
            float f9 = Float.intBitsToFloat(arrn[i2 * 7 + 1]);
            float f10 = Float.intBitsToFloat(arrn[i2 * 7 + 2]);
            f3 = Math.min(f3, f2);
            f4 = Math.min(f4, f9);
            f5 = Math.min(f5, f10);
            f6 = Math.max(f6, f2);
            f7 = Math.max(f7, f9);
            f8 = Math.max(f8, f10);
        }
        if (arrf != null) {
            arrf[ad.e.b()] = f3;
            arrf[ad.f.b()] = f6;
            arrf[ad.a.b()] = f4;
            arrf[ad.b.b()] = f7;
            arrf[ad.c.b()] = f5;
            arrf[ad.d.b()] = f8;
            arrf[ad.e.b() + ad.values().length] = 1.0f - f3;
            arrf[ad.f.b() + ad.values().length] = 1.0f - f6;
            arrf[ad.a.b() + ad.values().length] = 1.0f - f4;
            arrf[ad.b.b() + ad.values().length] = 1.0f - f7;
            arrf[ad.c.b() + ad.values().length] = 1.0f - f5;
            arrf[ad.d.b() + ad.values().length] = 1.0f - f8;
        }
        float f11 = 1.0E-4f;
        f2 = 0.9999f;
        switch (cn.a()[ad2.ordinal()]) {
            case 1: {
                bitSet.set(1, f3 >= 1.0E-4f || f5 >= 1.0E-4f || f6 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f4 < 1.0E-4f || b2.k()) && f4 == f7);
                break;
            }
            case 2: {
                bitSet.set(1, f3 >= 1.0E-4f || f5 >= 1.0E-4f || f6 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f7 > 0.9999f || b2.k()) && f4 == f7);
                break;
            }
            case 3: {
                bitSet.set(1, f3 >= 1.0E-4f || f4 >= 1.0E-4f || f6 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f5 < 1.0E-4f || b2.k()) && f5 == f8);
                break;
            }
            case 4: {
                bitSet.set(1, f3 >= 1.0E-4f || f4 >= 1.0E-4f || f6 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f8 > 0.9999f || b2.k()) && f5 == f8);
                break;
            }
            case 5: {
                bitSet.set(1, f4 >= 1.0E-4f || f5 >= 1.0E-4f || f7 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f3 < 1.0E-4f || b2.k()) && f3 == f6);
                break;
            }
            case 6: {
                bitSet.set(1, f4 >= 1.0E-4f || f5 >= 1.0E-4f || f7 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f6 > 0.9999f || b2.k()) && f3 == f6);
            }
        }
    }

    private void a(n n2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, int n3, boolean bl2, net.minecraft.client.g.g g2, List list, BitSet bitSet) {
        int n4;
        int n5;
        double d2 = b3.cy_();
        double d3 = b3.k();
        double d4 = b3.l();
        net.minecraft.g.cn cn2 = b2.c();
        fo fo2 = cn2.bS_();
        if (fo2 != fo.a) {
            n5 = b3.cy_();
            n4 = b3.l();
            long l2 = (long)(n5 * 3129871) ^ (long)n4 * 116129781L;
            l2 = l2 * l2 * 42317861L + l2 * 11L;
            d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (fo2 == fo.c) {
                d3 += ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        n4 = list.size();
        for (n5 = 0; n5 < n4; ++n5) {
            t t2 = (t)list.get(n5);
            if (bl2) {
                this.a(b2, t2.b(), t2.e(), null, bitSet);
                net.minecraft.u.b.b b4 = bitSet.get(0) ? b3.a(t2.e()) : b3;
                n3 = b2.a(n2, b4);
            }
            g2.a(t2.b());
            g2.a(n3, n3, n3, n3);
            if (t2.c()) {
                int n6 = this.a.a(b2, n2, b3, t2.d());
                if (cc.a) {
                    n6 = p.c(n6);
                }
                float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n6 & 0xFF) / 255.0f;
                g2.a(f2, f3, f4, 4);
                g2.a(f2, f3, f4, 3);
                g2.a(f2, f3, f4, 2);
                g2.a(f2, f3, f4, 1);
            }
            g2.a(d2, d3, d4);
        }
    }

    public void a(aq aq2, float f2, float f3, float f4, float f5) {
        this.a(null, aq2, f2, f3, f4, f5);
    }

    public void a(net.minecraft.g.c.b b2, aq aq2, float f2, float f3, float f4, float f5) {
        for (ad ad2 : ad.values()) {
            this.a(f2, f3, f4, f5, aq2.a(b2, ad2, 0L));
        }
        this.a(f2, f3, f4, f5, aq2.a(b2, null, 0L));
    }

    public void a(aq aq2, net.minecraft.g.c.b b2, float f2, boolean bl2) {
        net.minecraft.g.cn cn2 = b2.c();
        bd.b(90.0f, 0.0f, 1.0f, 0.0f);
        int n2 = this.a.a(b2, null, null, 0);
        if (cc.a) {
            n2 = p.c(n2);
        }
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        if (!bl2) {
            bd.c(f2, f2, f2, 1.0f);
        }
        this.a(b2, aq2, f2, f3, f4, f5);
    }

    private void a(float f2, float f3, float f4, float f5, List list) {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            t t2 = (t)list.get(i2);
            g2.a(7, net.minecraft.client.g.d.b.b);
            g2.a(t2.b());
            if (t2.c()) {
                g2.d(f3 * f2, f4 * f2, f5 * f2);
            } else {
                g2.d(f2, f2, f2);
            }
            net.minecraft.u.b.t t3 = t2.e().n();
            g2.b(t3.cy_(), t3.k(), t3.l());
            ci2.b();
        }
    }

    static /* synthetic */ int[] a() {
        if (b != null) {
            return b;
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
        b = arrn;
        return arrn;
    }
}

