/*
 * Decompiled with CFR 0.150.
 */
public class bwn
extends qa {
    private final cpk a;
    private int K;
    private final int L;
    private final lz M;

    public bwn(iu iu2, cpk cpk2, lz lz2) {
        super(iu2, cpk2.aU, cpk2.cD().b + (double)(cpk2.bm / 2.0f), cpk2.aW, cpk2.aX, cpk2.aY, cpk2.aZ);
        this.a = cpk2;
        this.L = 3;
        this.M = lz2;
        this.b();
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void b() {
        for (int i2 = 0; i2 < 16; ++i2) {
            double d2;
            double d3;
            double d4 = this.q.nextFloat() * 2.0f - 1.0f;
            if (d4 * d4 + (d3 = (double)(this.q.nextFloat() * 2.0f - 1.0f)) * d3 + (d2 = (double)(this.q.nextFloat() * 2.0f - 1.0f)) * d2 > 1.0) continue;
            double d5 = this.a.aU + d4 * (double)this.a.bl / 4.0;
            double d6 = this.a.cD().b + (double)(this.a.bm / 2.0f) + d3 * (double)this.a.bm / 4.0;
            double d7 = this.a.aW + d2 * (double)this.a.bl / 4.0;
            this.b.a(this.M, false, d5, d6, d7, d4, d3 + 0.2, d2, new int[0]);
        }
        ++this.K;
        if (this.K >= this.L) {
            this.h();
        }
    }

    @Override
    public int f() {
        return 3;
    }
}

