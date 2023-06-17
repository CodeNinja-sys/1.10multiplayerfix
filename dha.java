/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.util.e.d;
import org.lwjgl.util.e.l;
import org.lwjgl.util.e.m;

public class dha {
    private static final float a = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
    private static final float b = 1.0f / (float)Math.cos(0.7853981852531433) - 1.0f;
    private static final ay[] c = new ay[avo.values().length * bqk.values().length];
    private static final ay d = new cmh();
    private static final ay e = new byd();
    private static final ay f = new bwk();
    private static final ay g = new os();

    public crz a(l l2, l l3, cvf cvf2, ars ars2, bqk bqk2, avo avo2, hu hu2, boolean bl2, boolean bl3) {
        bnx bnx2 = cvf2.e;
        if (bl2) {
            bnx2 = this.a(cvf2.e, bqk2, avo2);
        }
        int[] arrn = this.a(bnx2, ars2, bqk2, this.a(l2, l3), avo2, hu2, bl3);
        bqk bqk3 = dha.a(arrn);
        if (hu2 == null) {
            this.a(arrn, bqk3);
        }
        return new crz(arrn, cvf2.c, bqk3, ars2);
    }

    private bnx a(bnx bnx2, bqk bqk2, avo avo2) {
        return c[dha.a(avo2, bqk2)].a(bnx2);
    }

    private int[] a(bnx bnx2, ars ars2, bqk bqk2, float[] arrf, avo avo2, hu hu2, boolean bl2) {
        int[] arrn = new int[28];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(arrn, i2, bqk2, bnx2, arrf, ars2, avo2, hu2, bl2);
        }
        return arrn;
    }

    private int a(bqk bqk2) {
        float f2 = this.b(bqk2);
        int n2 = cmk.a((int)(f2 * 255.0f), 0, 255);
        return 0xFF000000 | n2 << 16 | n2 << 8 | n2;
    }

    private float b(bqk bqk2) {
        switch (bqk2) {
            case a: {
                return 0.5f;
            }
            case b: {
                return 1.0f;
            }
            case c: 
            case d: {
                return 0.8f;
            }
            case e: 
            case f: {
                return 0.6f;
            }
        }
        return 1.0f;
    }

    private float[] a(l l2, l l3) {
        float[] arrf = new float[bqk.values().length];
        arrf[bwl.f] = l2.a / 16.0f;
        arrf[bwl.e] = l2.b / 16.0f;
        arrf[bwl.d] = l2.c / 16.0f;
        arrf[bwl.c] = l3.a / 16.0f;
        arrf[bwl.b] = l3.b / 16.0f;
        arrf[bwl.a] = l3.c / 16.0f;
        return arrf;
    }

    private void a(int[] arrn, int n2, bqk bqk2, bnx bnx2, float[] arrf, ars ars2, avo avo2, hu hu2, boolean bl2) {
        bqk bqk3 = avo2.a(bqk2);
        int n3 = bl2 ? this.a(bqk3) : -1;
        bje bje2 = cqu.a(bqk2).a(n2);
        l l2 = new l(arrf[bje2.a], arrf[bje2.b], arrf[bje2.c]);
        this.a(l2, hu2);
        int n4 = this.a(l2, bqk2, n2, avo2);
        this.a(arrn, n4, n2, l2, n3, ars2, bnx2);
    }

    private void a(int[] arrn, int n2, int n3, l l2, int n4, ars ars2, bnx bnx2) {
        int n5 = n2 * 7;
        arrn[n5] = Float.floatToRawIntBits(l2.a);
        arrn[n5 + 1] = Float.floatToRawIntBits(l2.b);
        arrn[n5 + 2] = Float.floatToRawIntBits(l2.c);
        arrn[n5 + 3] = n4;
        arrn[n5 + 4] = Float.floatToRawIntBits(ars2.a((double)bnx2.a(n3)));
        arrn[n5 + 4 + 1] = Float.floatToRawIntBits(ars2.b((double)bnx2.b(n3)));
    }

    private void a(l l2, hu hu2) {
        if (hu2 == null) {
            return;
        }
        d d2 = this.a();
        l l3 = new l(0.0f, 0.0f, 0.0f);
        switch (hu2.b) {
            case a: {
                org.lwjgl.util.e.d.a(hu2.c * ((float)Math.PI / 180), new l(1.0f, 0.0f, 0.0f), d2, d2);
                l3.a(0.0f, 1.0f, 1.0f);
                break;
            }
            case b: {
                org.lwjgl.util.e.d.a(hu2.c * ((float)Math.PI / 180), new l(0.0f, 1.0f, 0.0f), d2, d2);
                l3.a(1.0f, 0.0f, 1.0f);
                break;
            }
            case c: {
                org.lwjgl.util.e.d.a(hu2.c * ((float)Math.PI / 180), new l(0.0f, 0.0f, 1.0f), d2, d2);
                l3.a(1.0f, 1.0f, 0.0f);
            }
        }
        if (hu2.d) {
            if (Math.abs(hu2.c) == 22.5f) {
                l3.a(a);
            } else {
                l3.a(b);
            }
            l.a(l3, new l(1.0f, 1.0f, 1.0f), l3);
        } else {
            l3.a(1.0f, 1.0f, 1.0f);
        }
        this.a(l2, new l(hu2.a), d2, l3);
    }

    public int a(l l2, bqk bqk2, int n2, avo avo2) {
        if (avo2 == avo.a) {
            return n2;
        }
        this.a(l2, new l(0.5f, 0.5f, 0.5f), avo2.a(), new l(1.0f, 1.0f, 1.0f));
        return avo2.a(bqk2, n2);
    }

    private void a(l l2, l l3, d d2, l l4) {
        m m2 = new m(l2.a - l3.a, l2.b - l3.b, l2.c - l3.c, 1.0f);
        org.lwjgl.util.e.d.a(d2, m2, m2);
        m2.a *= l4.a;
        m2.b *= l4.b;
        m2.c *= l4.c;
        l2.a(m2.a + l3.a, m2.b + l3.b, m2.c + l3.c);
    }

    private d a() {
        d d2 = new d();
        d2.a();
        return d2;
    }

    public static bqk a(int[] arrn) {
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
        bqk bqk2 = null;
        float f3 = 0.0f;
        for (bqk bqk3 : bqk.values()) {
            cjx cjx2 = bqk3.n();
            l l8 = new l(cjx2.a(), cjx2.b(), cjx2.c());
            float f4 = l.a(l7, l8);
            if (!(f4 >= 0.0f) || !(f4 > f3)) continue;
            f3 = f4;
            bqk2 = bqk3;
        }
        if (bqk2 == null) {
            return bqk.b;
        }
        return bqk2;
    }

    private void a(int[] arrn, bqk bqk2) {
        float f2;
        int n2;
        int[] arrn2 = new int[arrn.length];
        System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
        float[] arrf = new float[bqk.values().length];
        arrf[bwl.f] = 999.0f;
        arrf[bwl.e] = 999.0f;
        arrf[bwl.d] = 999.0f;
        arrf[bwl.c] = -999.0f;
        arrf[bwl.b] = -999.0f;
        arrf[bwl.a] = -999.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            n2 = 7 * i2;
            float f3 = Float.intBitsToFloat(arrn2[n2]);
            float f4 = Float.intBitsToFloat(arrn2[n2 + 1]);
            f2 = Float.intBitsToFloat(arrn2[n2 + 2]);
            if (f3 < arrf[bwl.f]) {
                arrf[bwl.f] = f3;
            }
            if (f4 < arrf[bwl.e]) {
                arrf[bwl.e] = f4;
            }
            if (f2 < arrf[bwl.d]) {
                arrf[bwl.d] = f2;
            }
            if (f3 > arrf[bwl.c]) {
                arrf[bwl.c] = f3;
            }
            if (f4 > arrf[bwl.b]) {
                arrf[bwl.b] = f4;
            }
            if (!(f2 > arrf[bwl.a])) continue;
            arrf[bwl.a] = f2;
        }
        cqu cqu2 = cqu.a(bqk2);
        for (n2 = 0; n2 < 4; ++n2) {
            int n3 = 7 * n2;
            bje bje2 = cqu2.a(n2);
            f2 = arrf[bje2.a];
            float f5 = arrf[bje2.b];
            float f6 = arrf[bje2.c];
            arrn[n3] = Float.floatToRawIntBits(f2);
            arrn[n3 + 1] = Float.floatToRawIntBits(f5);
            arrn[n3 + 2] = Float.floatToRawIntBits(f6);
            for (int i3 = 0; i3 < 4; ++i3) {
                int n4 = 7 * i3;
                float f7 = Float.intBitsToFloat(arrn2[n4]);
                float f8 = Float.intBitsToFloat(arrn2[n4 + 1]);
                float f9 = Float.intBitsToFloat(arrn2[n4 + 2]);
                if (!cmk.a(f2, f7) || !cmk.a(f5, f8) || !cmk.a(f6, f9)) continue;
                arrn[n3 + 4] = arrn2[n4 + 4];
                arrn[n3 + 4 + 1] = arrn2[n4 + 4 + 1];
            }
        }
    }

    private static void a(avo avo2, bqk bqk2, ay ay2) {
        dha.c[dha.a((avo)avo2, (bqk)bqk2)] = ay2;
    }

    private static int a(avo avo2, bqk bqk2) {
        return avo.values().length * bqk2.ordinal() + avo2.ordinal();
    }

    static {
        dha.a(avo.a, bqk.a, d);
        dha.a(avo.a, bqk.f, d);
        dha.a(avo.a, bqk.c, d);
        dha.a(avo.a, bqk.d, d);
        dha.a(avo.a, bqk.b, d);
        dha.a(avo.a, bqk.e, d);
        dha.a(avo.b, bqk.f, d);
        dha.a(avo.b, bqk.c, d);
        dha.a(avo.b, bqk.d, d);
        dha.a(avo.b, bqk.e, d);
        dha.a(avo.c, bqk.f, d);
        dha.a(avo.c, bqk.c, d);
        dha.a(avo.c, bqk.d, d);
        dha.a(avo.c, bqk.e, d);
        dha.a(avo.d, bqk.f, d);
        dha.a(avo.d, bqk.c, d);
        dha.a(avo.d, bqk.d, d);
        dha.a(avo.d, bqk.e, d);
        dha.a(avo.e, bqk.a, d);
        dha.a(avo.e, bqk.d, d);
        dha.a(avo.f, bqk.a, d);
        dha.a(avo.g, bqk.a, d);
        dha.a(avo.g, bqk.c, d);
        dha.a(avo.h, bqk.a, d);
        dha.a(avo.i, bqk.a, d);
        dha.a(avo.i, bqk.b, d);
        dha.a(avo.m, bqk.d, d);
        dha.a(avo.m, bqk.b, d);
        dha.a(avo.n, bqk.b, d);
        dha.a(avo.o, bqk.c, d);
        dha.a(avo.o, bqk.b, d);
        dha.a(avo.p, bqk.b, d);
        dha.a(avo.d, bqk.b, e);
        dha.a(avo.b, bqk.a, e);
        dha.a(avo.e, bqk.e, e);
        dha.a(avo.f, bqk.e, e);
        dha.a(avo.g, bqk.e, e);
        dha.a(avo.h, bqk.c, e);
        dha.a(avo.h, bqk.d, e);
        dha.a(avo.h, bqk.e, e);
        dha.a(avo.j, bqk.b, e);
        dha.a(avo.l, bqk.a, e);
        dha.a(avo.m, bqk.f, e);
        dha.a(avo.n, bqk.f, e);
        dha.a(avo.n, bqk.c, e);
        dha.a(avo.n, bqk.d, e);
        dha.a(avo.o, bqk.f, e);
        dha.a(avo.p, bqk.f, e);
        dha.a(avo.c, bqk.a, f);
        dha.a(avo.c, bqk.b, f);
        dha.a(avo.e, bqk.c, f);
        dha.a(avo.e, bqk.b, f);
        dha.a(avo.f, bqk.b, f);
        dha.a(avo.g, bqk.d, f);
        dha.a(avo.g, bqk.b, f);
        dha.a(avo.h, bqk.b, f);
        dha.a(avo.i, bqk.f, f);
        dha.a(avo.i, bqk.c, f);
        dha.a(avo.i, bqk.d, f);
        dha.a(avo.i, bqk.e, f);
        dha.a(avo.j, bqk.f, f);
        dha.a(avo.j, bqk.c, f);
        dha.a(avo.j, bqk.d, f);
        dha.a(avo.j, bqk.e, f);
        dha.a(avo.k, bqk.a, f);
        dha.a(avo.k, bqk.f, f);
        dha.a(avo.k, bqk.c, f);
        dha.a(avo.k, bqk.d, f);
        dha.a(avo.k, bqk.b, f);
        dha.a(avo.k, bqk.e, f);
        dha.a(avo.l, bqk.f, f);
        dha.a(avo.l, bqk.c, f);
        dha.a(avo.l, bqk.d, f);
        dha.a(avo.l, bqk.e, f);
        dha.a(avo.m, bqk.a, f);
        dha.a(avo.m, bqk.c, f);
        dha.a(avo.n, bqk.a, f);
        dha.a(avo.o, bqk.a, f);
        dha.a(avo.o, bqk.d, f);
        dha.a(avo.p, bqk.a, f);
        dha.a(avo.b, bqk.b, g);
        dha.a(avo.d, bqk.a, g);
        dha.a(avo.e, bqk.f, g);
        dha.a(avo.f, bqk.f, g);
        dha.a(avo.f, bqk.c, g);
        dha.a(avo.f, bqk.d, g);
        dha.a(avo.g, bqk.f, g);
        dha.a(avo.h, bqk.f, g);
        dha.a(avo.m, bqk.e, g);
        dha.a(avo.j, bqk.a, g);
        dha.a(avo.l, bqk.b, g);
        dha.a(avo.n, bqk.e, g);
        dha.a(avo.o, bqk.e, g);
        dha.a(avo.p, bqk.c, g);
        dha.a(avo.p, bqk.d, g);
        dha.a(avo.p, bqk.e, g);
    }
}

