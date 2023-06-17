/*
 * Decompiled with CFR 0.150.
 */
public class bfr
extends qa {
    private int a;
    private final int K;

    protected bfr(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.K = 8;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void b() {
        for (int i2 = 0; i2 < 6; ++i2) {
            double d2 = this.f + (this.q.nextDouble() - this.q.nextDouble()) * 4.0;
            double d3 = this.g + (this.q.nextDouble() - this.q.nextDouble()) * 4.0;
            double d4 = this.h + (this.q.nextDouble() - this.q.nextDouble()) * 4.0;
            this.b.a(lz.b, d2, d3, d4, (double)((float)this.a / (float)this.K), 0.0, 0.0, new int[0]);
        }
        ++this.a;
        if (this.a == this.K) {
            this.h();
        }
    }

    @Override
    public int f() {
        return 1;
    }
}

