/*
 * Decompiled with CFR 0.150.
 */
import java.util.BitSet;

class dgo {
    private final float[] b = new float[4];
    private final int[] c = new int[4];
    final /* synthetic */ ccs a;

    public dgo(ccs ccs2) {
        this.a = ccs2;
    }

    public void a(bnj bnj2, dbk dbk2, cmz cmz2, bqk bqk2, float[] arrf, BitSet bitSet) {
        int n2;
        float f2;
        int n3;
        float f3;
        int n4;
        float f4;
        int n5;
        float f5;
        bjb bjb2;
        cmz cmz3 = bitSet.get(0) ? cmz2.c(bqk2) : cmz2;
        bjb bjb3 = bjb.e();
        arz arz2 = arz.a(bqk2);
        bjb bjb4 = bjb.c(cmz3).b(arz.a(arz2)[0]);
        bjb bjb5 = bjb.c(cmz3).b(arz.a(arz2)[1]);
        bjb bjb6 = bjb.c(cmz3).b(arz.a(arz2)[2]);
        bjb bjb7 = bjb.c(cmz3).b(arz.a(arz2)[3]);
        int n6 = dbk2.a(bnj2, (cmz)bjb4);
        int n7 = dbk2.a(bnj2, (cmz)bjb5);
        int n8 = dbk2.a(bnj2, (cmz)bjb6);
        int n9 = dbk2.a(bnj2, (cmz)bjb7);
        float f6 = bnj2.n(bjb4).j();
        float f7 = bnj2.n(bjb5).j();
        float f8 = bnj2.n(bjb6).j();
        float f9 = bnj2.n(bjb7).j();
        boolean bl2 = bnj2.n(bjb3.d(bjb4).b(bqk2)).e();
        boolean bl3 = bnj2.n(bjb3.d(bjb5).b(bqk2)).e();
        boolean bl4 = bnj2.n(bjb3.d(bjb6).b(bqk2)).e();
        boolean bl5 = bnj2.n(bjb3.d(bjb7).b(bqk2)).e();
        if (bl4 || bl2) {
            bjb2 = bjb3.d(bjb4).b(arz.a(arz2)[2]);
            f5 = bnj2.n(bjb2).j();
            n5 = dbk2.a(bnj2, (cmz)bjb2);
        } else {
            f5 = f6;
            n5 = n6;
        }
        if (bl5 || bl2) {
            bjb2 = bjb3.d(bjb4).b(arz.a(arz2)[3]);
            f4 = bnj2.n(bjb2).j();
            n4 = dbk2.a(bnj2, (cmz)bjb2);
        } else {
            f4 = f6;
            n4 = n6;
        }
        if (bl4 || bl3) {
            bjb2 = bjb3.d(bjb5).b(arz.a(arz2)[2]);
            f3 = bnj2.n(bjb2).j();
            n3 = dbk2.a(bnj2, (cmz)bjb2);
        } else {
            f3 = f7;
            n3 = n7;
        }
        if (bl5 || bl3) {
            bjb2 = bjb3.d(bjb5).b(arz.a(arz2)[3]);
            f2 = bnj2.n(bjb2).j();
            n2 = dbk2.a(bnj2, (cmz)bjb2);
        } else {
            f2 = f7;
            n2 = n7;
        }
        int n10 = dbk2.a(bnj2, cmz2);
        if (bitSet.get(0) || !bnj2.n(cmz2.c(bqk2)).p()) {
            n10 = dbk2.a(bnj2, cmz2.c(bqk2));
        }
        float f10 = bitSet.get(0) ? bnj2.n(cmz3).j() : bnj2.n(cmz2).j();
        bmi bmi2 = bmi.a(bqk2);
        bjb3.f();
        bjb4.f();
        bjb5.f();
        bjb6.f();
        bjb7.f();
        if (!bitSet.get(1) || !arz.b(arz2)) {
            float f11 = (f9 + f6 + f4 + f10) * 0.25f;
            float f12 = (f8 + f6 + f5 + f10) * 0.25f;
            float f13 = (f8 + f7 + f3 + f10) * 0.25f;
            float f14 = (f9 + f7 + f2 + f10) * 0.25f;
            this.c[bmi.a((bmi)bmi2)] = this.a(n9, n6, n4, n10);
            this.c[bmi.b((bmi)bmi2)] = this.a(n8, n6, n5, n10);
            this.c[bmi.c((bmi)bmi2)] = this.a(n8, n7, n3, n10);
            this.c[bmi.d((bmi)bmi2)] = this.a(n9, n7, n2, n10);
            this.b[bmi.a((bmi)bmi2)] = f11;
            this.b[bmi.b((bmi)bmi2)] = f12;
            this.b[bmi.c((bmi)bmi2)] = f13;
            this.b[bmi.d((bmi)bmi2)] = f14;
        } else {
            float f15 = (f9 + f6 + f4 + f10) * 0.25f;
            float f16 = (f8 + f6 + f5 + f10) * 0.25f;
            float f17 = (f8 + f7 + f3 + f10) * 0.25f;
            float f18 = (f9 + f7 + f2 + f10) * 0.25f;
            float f19 = arrf[bhs.a(arz.c(arz2)[0])] * arrf[bhs.a(arz.c(arz2)[1])];
            float f20 = arrf[bhs.a(arz.c(arz2)[2])] * arrf[bhs.a(arz.c(arz2)[3])];
            float f21 = arrf[bhs.a(arz.c(arz2)[4])] * arrf[bhs.a(arz.c(arz2)[5])];
            float f22 = arrf[bhs.a(arz.c(arz2)[6])] * arrf[bhs.a(arz.c(arz2)[7])];
            float f23 = arrf[bhs.a(arz.d(arz2)[0])] * arrf[bhs.a(arz.d(arz2)[1])];
            float f24 = arrf[bhs.a(arz.d(arz2)[2])] * arrf[bhs.a(arz.d(arz2)[3])];
            float f25 = arrf[bhs.a(arz.d(arz2)[4])] * arrf[bhs.a(arz.d(arz2)[5])];
            float f26 = arrf[bhs.a(arz.d(arz2)[6])] * arrf[bhs.a(arz.d(arz2)[7])];
            float f27 = arrf[bhs.a(arz.e(arz2)[0])] * arrf[bhs.a(arz.e(arz2)[1])];
            float f28 = arrf[bhs.a(arz.e(arz2)[2])] * arrf[bhs.a(arz.e(arz2)[3])];
            float f29 = arrf[bhs.a(arz.e(arz2)[4])] * arrf[bhs.a(arz.e(arz2)[5])];
            float f30 = arrf[bhs.a(arz.e(arz2)[6])] * arrf[bhs.a(arz.e(arz2)[7])];
            float f31 = arrf[bhs.a(arz.f(arz2)[0])] * arrf[bhs.a(arz.f(arz2)[1])];
            float f32 = arrf[bhs.a(arz.f(arz2)[2])] * arrf[bhs.a(arz.f(arz2)[3])];
            float f33 = arrf[bhs.a(arz.f(arz2)[4])] * arrf[bhs.a(arz.f(arz2)[5])];
            float f34 = arrf[bhs.a(arz.f(arz2)[6])] * arrf[bhs.a(arz.f(arz2)[7])];
            this.b[bmi.a((bmi)bmi2)] = f15 * f19 + f16 * f20 + f17 * f21 + f18 * f22;
            this.b[bmi.b((bmi)bmi2)] = f15 * f23 + f16 * f24 + f17 * f25 + f18 * f26;
            this.b[bmi.c((bmi)bmi2)] = f15 * f27 + f16 * f28 + f17 * f29 + f18 * f30;
            this.b[bmi.d((bmi)bmi2)] = f15 * f31 + f16 * f32 + f17 * f33 + f18 * f34;
            int n11 = this.a(n9, n6, n4, n10);
            int n12 = this.a(n8, n6, n5, n10);
            int n13 = this.a(n8, n7, n3, n10);
            int n14 = this.a(n9, n7, n2, n10);
            this.c[bmi.a((bmi)bmi2)] = this.a(n11, n12, n13, n14, f19, f20, f21, f22);
            this.c[bmi.b((bmi)bmi2)] = this.a(n11, n12, n13, n14, f23, f24, f25, f26);
            this.c[bmi.c((bmi)bmi2)] = this.a(n11, n12, n13, n14, f27, f28, f29, f30);
            this.c[bmi.d((bmi)bmi2)] = this.a(n11, n12, n13, n14, f31, f32, f33, f34);
        }
    }

    private int a(int n2, int n3, int n4, int n5) {
        if (n2 == 0) {
            n2 = n5;
        }
        if (n3 == 0) {
            n3 = n5;
        }
        if (n4 == 0) {
            n4 = n5;
        }
        return n2 + n3 + n4 + n5 >> 2 & 0xFF00FF;
    }

    private int a(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5) {
        int n6 = (int)((float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4 + (float)(n5 >> 16 & 0xFF) * f5) & 0xFF;
        int n7 = (int)((float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4 + (float)(n5 & 0xFF) * f5) & 0xFF;
        return n6 << 16 | n7;
    }

    static /* synthetic */ int[] a(dgo dgo2) {
        return dgo2.c;
    }

    static /* synthetic */ float[] b(dgo dgo2) {
        return dgo2.b;
    }
}

