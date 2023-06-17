/*
 * Decompiled with CFR 0.150.
 */
public class bt
extends qa {
    private final int a;
    private final int K;
    private final float L;
    private float M;
    private float N;
    private float O;
    private boolean P;

    public bt(iu iu2, double d2, double d3, double d4, int n2, int n3, float f2) {
        super(iu2, d2, d3, d4);
        this.a = n2;
        this.K = n3;
        this.L = f2;
    }

    public void a(int n2) {
        float f2 = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        float f3 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        float f4 = (float)((n2 & 0xFF) >> 0) / 255.0f;
        float f5 = 1.0f;
        this.a(f2 * 1.0f, f3 * 1.0f, f4 * 1.0f);
    }

    public void b(int n2) {
        this.M = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        this.N = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        this.O = (float)((n2 & 0xFF) >> 0) / 255.0f;
        this.P = true;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        if (this.v++ >= this.w) {
            this.h();
        }
        if (this.v > this.w / 2) {
            this.d(1.0f - ((float)this.v - (float)(this.w / 2)) / (float)this.w);
            if (this.P) {
                this.z += (this.M - this.z) * 0.2f;
                this.A += (this.N - this.A) * 0.2f;
                this.B += (this.O - this.B) * 0.2f;
            }
        }
        this.d(this.a + (this.K - 1 - this.v * this.K / this.w));
        this.j += (double)this.L;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.91f;
        this.j *= (double)0.91f;
        this.k *= (double)0.91f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }

    @Override
    public int a(float f2) {
        return 0xF000F0;
    }
}

