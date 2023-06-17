/*
 * Decompiled with CFR 0.150.
 */
public class cxe
extends qa {
    private final cpk a;
    private final cpk K;
    private int L;
    private final int M;
    private final float N;
    private final bid O = bxy.B().ad();

    public cxe(iu iu2, cpk cpk2, cpk cpk3, float f2) {
        super(iu2, cpk2.aU, cpk2.aV, cpk2.aW, cpk2.aX, cpk2.aY, cpk2.aZ);
        this.a = cpk2;
        this.K = cpk3;
        this.M = 3;
        this.N = f2;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.L + f2) / (float)this.M;
        f8 *= f8;
        double d2 = this.a.aU;
        double d3 = this.a.aV;
        double d4 = this.a.aW;
        double d5 = this.K.br + (this.K.aU - this.K.br) * (double)f2;
        double d6 = this.K.bs + (this.K.aV - this.K.bs) * (double)f2 + (double)this.N;
        double d7 = this.K.bt + (this.K.aW - this.K.bt) * (double)f2;
        double d8 = d2 + (d5 - d2) * (double)f8;
        double d9 = d3 + (d6 - d3) * (double)f8;
        double d10 = d4 + (d7 - d4) * (double)f8;
        int n2 = this.a(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.e();
        this.O.a(this.a, d8 -= G, d9 -= H, d10 -= I, this.a.ba, f2, false);
    }

    @Override
    public void b() {
        ++this.L;
        if (this.L == this.M) {
            this.h();
        }
    }

    @Override
    public int f() {
        return 3;
    }
}

