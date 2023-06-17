/*
 * Decompiled with CFR 0.150.
 */
public class ark
extends qa {
    private static final bpx a = new bpx("textures/particle/footprint.png");
    private int K;
    private final int L;
    private final bnm M;

    protected ark(bnm bnm2, iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.M = bnm2;
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
        this.L = 200;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9 = ((float)this.K + f2) / (float)this.L;
        if ((f8 = 2.0f - (f9 *= f9) * 2.0f) > 1.0f) {
            f8 = 1.0f;
        }
        cja.f();
        float f10 = 0.125f;
        float f11 = (float)(this.f - G);
        float f12 = (float)(this.g - H);
        float f13 = (float)(this.h - I);
        float f14 = this.b.m(new cmz(this.f, this.g, this.h));
        this.M.a(a);
        cja.l();
        cja.a(bjt.l, afi.j);
        bix2.a(7, bxb.i);
        bix2.b((double)(f11 - 0.125f), (double)f12, (double)(f13 + 0.125f)).a(0.0, 1.0).a(f14, f14, f14, f8 *= 0.2f).d();
        bix2.b((double)(f11 + 0.125f), (double)f12, (double)(f13 + 0.125f)).a(1.0, 1.0).a(f14, f14, f14, f8).d();
        bix2.b((double)(f11 + 0.125f), (double)f12, (double)(f13 - 0.125f)).a(1.0, 0.0).a(f14, f14, f14, f8).d();
        bix2.b((double)(f11 - 0.125f), (double)f12, (double)(f13 - 0.125f)).a(0.0, 0.0).a(f14, f14, f14, f8).d();
        bha.a().b();
        cja.k();
        cja.e();
    }

    @Override
    public void b() {
        ++this.K;
        if (this.K == this.L) {
            this.h();
        }
    }

    @Override
    public int f() {
        return 3;
    }
}

