/*
 * Decompiled with CFR 0.150.
 */
public class cqd
extends qa {
    private static final bpx a = new bpx("textures/entity/explosion.png");
    private static final ava K = new ava().a(bxb.m).a(bxb.o).a(bxb.n).a(bxb.p).a(bxb.q).a(bxb.r);
    private int L;
    private final int M;
    private final bnm N;
    private final float O;

    protected cqd(bnm bnm2, iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f2;
        this.N = bnm2;
        this.M = 6 + this.q.nextInt(4);
        this.z = f2 = this.q.nextFloat() * 0.6f + 0.4f;
        this.A = f2;
        this.B = f2;
        this.O = 1.0f - (float)d5 * 0.5f;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2 = (int)(((float)this.L + f2) * 15.0f / (float)this.M);
        if (n2 > 15) {
            return;
        }
        this.N.a(a);
        float f8 = (float)(n2 % 4) / 4.0f;
        float f9 = f8 + 0.24975f;
        float f10 = (float)(n2 / 4) / 4.0f;
        float f11 = f10 + 0.24975f;
        float f12 = 2.0f * this.O;
        float f13 = (float)(this.c + (this.f - this.c) * (double)f2 - G);
        float f14 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f15 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.f();
        bjr.a();
        bix2.a(7, K);
        bix2.b((double)(f13 - f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 - f5 * f12 - f7 * f12)).a(f9, f11).a(this.z, this.A, this.B, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        bix2.b((double)(f13 - f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 - f5 * f12 + f7 * f12)).a(f9, f10).a(this.z, this.A, this.B, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        bix2.b((double)(f13 + f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 + f5 * f12 + f7 * f12)).a(f8, f10).a(this.z, this.A, this.B, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        bix2.b((double)(f13 + f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 + f5 * f12 - f7 * f12)).a(f8, f11).a(this.z, this.A, this.B, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        bha.a().b();
        cja.e();
    }

    @Override
    public int a(float f2) {
        return 61680;
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
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

