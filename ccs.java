/*
 * Decompiled with CFR 0.150.
 */
import java.util.BitSet;
import java.util.List;

public class ccs {
    private final gt a;

    public ccs(gt gt2) {
        this.a = gt2;
    }

    public boolean a(bnj bnj2, bpi bpi2, dbk dbk2, cmz cmz2, bix bix2, boolean bl2) {
        return this.a(bnj2, bpi2, dbk2, cmz2, bix2, bl2, cmk.a(cmz2));
    }

    public boolean a(bnj bnj2, bpi bpi2, dbk dbk2, cmz cmz2, bix bix2, boolean bl2, long l2) {
        boolean bl3 = bxy.A() && dbk2.d() == 0 && bpi2.a();
        try {
            if (bl3) {
                return this.b(bnj2, bpi2, dbk2, cmz2, bix2, bl2, l2);
            }
            return this.c(bnj2, bpi2, dbk2, cmz2, bix2, bl2, l2);
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Tesselating block model");
            sx sx2 = cet2.a("Block model being tesselated");
            sx.a(sx2, cmz2, dbk2);
            sx2.a("Using AO", bl3);
            throw new oz(cet2);
        }
    }

    public boolean b(bnj bnj2, bpi bpi2, dbk dbk2, cmz cmz2, bix bix2, boolean bl2, long l2) {
        boolean bl3 = false;
        float[] arrf = new float[bqk.values().length * 2];
        BitSet bitSet = new BitSet(3);
        dgo dgo2 = new dgo(this);
        for (bqk bqk2 : bqk.values()) {
            List list = bpi2.a(dbk2, bqk2, l2);
            if (list.isEmpty() || bl2 && !dbk2.c(bnj2, cmz2, bqk2)) continue;
            this.a(bnj2, dbk2, cmz2, bix2, list, arrf, bitSet, dgo2);
            bl3 = true;
        }
        List list = bpi2.a(dbk2, null, l2);
        if (!list.isEmpty()) {
            this.a(bnj2, dbk2, cmz2, bix2, list, arrf, bitSet, dgo2);
            bl3 = true;
        }
        return bl3;
    }

    public boolean c(bnj bnj2, bpi bpi2, dbk dbk2, cmz cmz2, bix bix2, boolean bl2, long l2) {
        boolean bl3 = false;
        BitSet bitSet = new BitSet(3);
        for (bqk bqk2 : bqk.values()) {
            List list = bpi2.a(dbk2, bqk2, l2);
            if (list.isEmpty() || bl2 && !dbk2.c(bnj2, cmz2, bqk2)) continue;
            int n2 = dbk2.a(bnj2, cmz2.c(bqk2));
            this.a(bnj2, dbk2, cmz2, n2, false, bix2, list, bitSet);
            bl3 = true;
        }
        List list = bpi2.a(dbk2, null, l2);
        if (!list.isEmpty()) {
            this.a(bnj2, dbk2, cmz2, -1, true, bix2, list, bitSet);
            bl3 = true;
        }
        return bl3;
    }

    private void a(bnj bnj2, dbk dbk2, cmz cmz2, bix bix2, List list, float[] arrf, BitSet bitSet, dgo dgo2) {
        double d2 = cmz2.a();
        double d3 = cmz2.b();
        double d4 = cmz2.c();
        bfa bfa2 = dbk2.t();
        bjp bjp2 = bfa2.aA_();
        if (bjp2 != bjp.a) {
            long l2 = cmk.a(cmz2);
            d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (bjp2 == bjp.c) {
                d3 += ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            crz crz2 = (crz)list.get(i2);
            this.a(dbk2, crz2.b(), crz2.e(), arrf, bitSet);
            dgo2.a(bnj2, dbk2, cmz2, crz2.e(), arrf, bitSet);
            bix2.a(crz2.b());
            bix2.a(dgo.a(dgo2)[0], dgo.a(dgo2)[1], dgo.a(dgo2)[2], dgo.a(dgo2)[3]);
            if (crz2.c()) {
                int n3 = this.a.a(dbk2, bnj2, cmz2, crz2.d());
                if (cwz.a) {
                    n3 = anq.c(n3);
                }
                float f2 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n3 & 0xFF) / 255.0f;
                bix2.a(dgo.b(dgo2)[0] * f2, dgo.b(dgo2)[0] * f3, dgo.b(dgo2)[0] * f4, 4);
                bix2.a(dgo.b(dgo2)[1] * f2, dgo.b(dgo2)[1] * f3, dgo.b(dgo2)[1] * f4, 3);
                bix2.a(dgo.b(dgo2)[2] * f2, dgo.b(dgo2)[2] * f3, dgo.b(dgo2)[2] * f4, 2);
                bix2.a(dgo.b(dgo2)[3] * f2, dgo.b(dgo2)[3] * f3, dgo.b(dgo2)[3] * f4, 1);
            } else {
                bix2.a(dgo.b(dgo2)[0], dgo.b(dgo2)[0], dgo.b(dgo2)[0], 4);
                bix2.a(dgo.b(dgo2)[1], dgo.b(dgo2)[1], dgo.b(dgo2)[1], 3);
                bix2.a(dgo.b(dgo2)[2], dgo.b(dgo2)[2], dgo.b(dgo2)[2], 2);
                bix2.a(dgo.b(dgo2)[3], dgo.b(dgo2)[3], dgo.b(dgo2)[3], 1);
            }
            bix2.a(d2, d3, d4);
        }
    }

    private void a(dbk dbk2, int[] arrn, bqk bqk2, float[] arrf, BitSet bitSet) {
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
            arrf[bqk.e.b()] = f3;
            arrf[bqk.f.b()] = f6;
            arrf[bqk.a.b()] = f4;
            arrf[bqk.b.b()] = f7;
            arrf[bqk.c.b()] = f5;
            arrf[bqk.d.b()] = f8;
            arrf[bqk.e.b() + bqk.values().length] = 1.0f - f3;
            arrf[bqk.f.b() + bqk.values().length] = 1.0f - f6;
            arrf[bqk.a.b() + bqk.values().length] = 1.0f - f4;
            arrf[bqk.b.b() + bqk.values().length] = 1.0f - f7;
            arrf[bqk.c.b() + bqk.values().length] = 1.0f - f5;
            arrf[bqk.d.b() + bqk.values().length] = 1.0f - f8;
        }
        float f11 = 1.0E-4f;
        f2 = 0.9999f;
        switch (bqk2) {
            case a: {
                bitSet.set(1, f3 >= 1.0E-4f || f5 >= 1.0E-4f || f6 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f4 < 1.0E-4f || dbk2.h()) && f4 == f7);
                break;
            }
            case b: {
                bitSet.set(1, f3 >= 1.0E-4f || f5 >= 1.0E-4f || f6 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f7 > 0.9999f || dbk2.h()) && f4 == f7);
                break;
            }
            case c: {
                bitSet.set(1, f3 >= 1.0E-4f || f4 >= 1.0E-4f || f6 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f5 < 1.0E-4f || dbk2.h()) && f5 == f8);
                break;
            }
            case d: {
                bitSet.set(1, f3 >= 1.0E-4f || f4 >= 1.0E-4f || f6 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f8 > 0.9999f || dbk2.h()) && f5 == f8);
                break;
            }
            case e: {
                bitSet.set(1, f4 >= 1.0E-4f || f5 >= 1.0E-4f || f7 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f3 < 1.0E-4f || dbk2.h()) && f3 == f6);
                break;
            }
            case f: {
                bitSet.set(1, f4 >= 1.0E-4f || f5 >= 1.0E-4f || f7 <= 0.9999f || f8 <= 0.9999f);
                bitSet.set(0, (f6 > 0.9999f || dbk2.h()) && f3 == f6);
            }
        }
    }

    private void a(bnj bnj2, dbk dbk2, cmz cmz2, int n2, boolean bl2, bix bix2, List list, BitSet bitSet) {
        int n3;
        int n4;
        double d2 = cmz2.a();
        double d3 = cmz2.b();
        double d4 = cmz2.c();
        bfa bfa2 = dbk2.t();
        bjp bjp2 = bfa2.aA_();
        if (bjp2 != bjp.a) {
            n4 = cmz2.a();
            n3 = cmz2.c();
            long l2 = (long)(n4 * 3129871) ^ (long)n3 * 116129781L;
            l2 = l2 * l2 * 42317861L + l2 * 11L;
            d2 += ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d4 += ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (bjp2 == bjp.c) {
                d3 += ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        n3 = list.size();
        for (n4 = 0; n4 < n3; ++n4) {
            crz crz2 = (crz)list.get(n4);
            if (bl2) {
                this.a(dbk2, crz2.b(), crz2.e(), null, bitSet);
                cmz cmz3 = bitSet.get(0) ? cmz2.c(crz2.e()) : cmz2;
                n2 = dbk2.a(bnj2, cmz3);
            }
            bix2.a(crz2.b());
            bix2.a(n2, n2, n2, n2);
            if (crz2.c()) {
                int n5 = this.a.a(dbk2, bnj2, cmz2, crz2.d());
                if (cwz.a) {
                    n5 = anq.c(n5);
                }
                float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n5 & 0xFF) / 255.0f;
                bix2.a(f2, f3, f4, 4);
                bix2.a(f2, f3, f4, 3);
                bix2.a(f2, f3, f4, 2);
                bix2.a(f2, f3, f4, 1);
            }
            bix2.a(d2, d3, d4);
        }
    }

    public void a(bpi bpi2, float f2, float f3, float f4, float f5) {
        this.a(null, bpi2, f2, f3, f4, f5);
    }

    public void a(dbk dbk2, bpi bpi2, float f2, float f3, float f4, float f5) {
        for (bqk bqk2 : bqk.values()) {
            this.a(f2, f3, f4, f5, bpi2.a(dbk2, bqk2, 0L));
        }
        this.a(f2, f3, f4, f5, bpi2.a(dbk2, null, 0L));
    }

    public void a(bpi bpi2, dbk dbk2, float f2, boolean bl2) {
        bfa bfa2 = dbk2.t();
        cja.b(90.0f, 0.0f, 1.0f, 0.0f);
        int n2 = this.a.a(dbk2, null, null, 0);
        if (cwz.a) {
            n2 = anq.c(n2);
        }
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        if (!bl2) {
            cja.c(f2, f2, f2, 1.0f);
        }
        this.a(dbk2, bpi2, f2, f3, f4, f5);
    }

    private void a(float f2, float f3, float f4, float f5, List list) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            crz crz2 = (crz)list.get(i2);
            bix2.a(7, bxb.b);
            bix2.a(crz2.b());
            if (crz2.c()) {
                bix2.d(f3 * f2, f4 * f2, f5 * f2);
            } else {
                bix2.d(f2, f2, f2);
            }
            cjx cjx2 = crz2.e().n();
            bix2.b(cjx2.a(), cjx2.b(), cjx2.c());
            bha2.b();
        }
    }
}

