/*
 * Decompiled with CFR 0.150.
 */
public class boj {
    float a;
    private double f;
    public int b;
    public float c;
    public float d = 1.0f;
    public float e;
    private long g;
    private long h;
    private long i;
    private double j = 1.0;

    public boj(float f2) {
        this.a = f2;
        this.g = bxy.K();
        this.h = System.nanoTime() / 1000000L;
    }

    public void a() {
        long l2 = bxy.K();
        long l3 = l2 - this.g;
        long l4 = System.nanoTime() / 1000000L;
        double d2 = (double)l4 / 1000.0;
        if (l3 > 1000L || l3 < 0L) {
            this.f = d2;
        } else {
            this.i += l3;
            if (this.i > 1000L) {
                long l5 = l4 - this.h;
                double d3 = (double)this.i / (double)l5;
                this.j += (d3 - this.j) * (double)0.2f;
                this.h = l4;
                this.i = 0L;
            }
            if (this.i < 0L) {
                this.h = l4;
            }
        }
        this.g = l2;
        double d4 = (d2 - this.f) * this.j;
        this.f = d2;
        d4 = cmk.a(d4, 0.0, 1.0);
        this.e = (float)((double)this.e + d4 * (double)this.d * (double)this.a);
        this.b = (int)this.e;
        this.e -= (float)this.b;
        if (this.b > 10) {
            this.b = 10;
        }
        this.c = this.e;
    }
}

