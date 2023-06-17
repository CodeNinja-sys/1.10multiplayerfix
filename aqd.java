/*
 * Decompiled with CFR 0.150.
 */
public class aqd
extends bt {
    private boolean a;
    private boolean K;
    private final atx L;
    private float M;
    private float N;
    private float O;
    private boolean P;

    public aqd(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, atx atx2) {
        super(iu2, d2, d3, d4, 160, 8, -0.004f);
        this.i = d5;
        this.j = d6;
        this.k = d7;
        this.L = atx2;
        this.x *= 0.75f;
        this.w = 48 + this.q.nextInt(12);
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public void b(boolean bl2) {
        this.K = bl2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!this.K || this.v < this.w / 3 || (this.v + this.w) / 3 % 2 == 0) {
            super.a(bix2, cpk2, f2, f3, f4, f5, f6, f7);
        }
    }

    @Override
    public void b() {
        super.b();
        if (this.a && this.v < this.w / 2 && (this.v + this.w) % 2 == 0) {
            aqd aqd2 = new aqd(this.b, this.f, this.g, this.h, 0.0, 0.0, 0.0, this.L);
            aqd2.d(0.99f);
            aqd2.a(this.z, this.A, this.B);
            aqd2.v = aqd2.w / 2;
            if (this.P) {
                aqd2.P = true;
                aqd2.M = this.M;
                aqd2.N = this.N;
                aqd2.O = this.O;
            }
            aqd2.K = this.K;
            this.L.a(aqd2);
        }
    }
}

