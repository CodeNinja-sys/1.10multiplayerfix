/*
 * Decompiled with CFR 0.150.
 */
public class boa
extends buc {
    private static final bpx a = new bpx("textures/entity/experience_orb.png");

    public boa(bid bid2) {
        super(bid2);
        this.h = 0.15f;
        this.i = 0.75f;
    }

    public void a(cvs cvs2, double d2, double d3, double d4, float f2, float f3) {
        if (this.j) {
            return;
        }
        cja.D();
        cja.c((float)d2, (float)d3, (float)d4);
        this.e(cvs2);
        bjr.b();
        int n2 = cvs2.p();
        float f4 = (float)(n2 % 4 * 16 + 0) / 64.0f;
        float f5 = (float)(n2 % 4 * 16 + 16) / 64.0f;
        float f6 = (float)(n2 / 4 * 16 + 0) / 64.0f;
        float f7 = (float)(n2 / 4 * 16 + 16) / 64.0f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        int n3 = cvs2.b(f3);
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        cjg.a(cjg.r, n4, (float)n5);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f11 = 255.0f;
        float f12 = ((float)cvs2.a + f3) / 2.0f;
        n5 = (int)((cmk.a(f12 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        int n6 = 255;
        int n7 = (int)((cmk.a(f12 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        cja.c(0.0f, 0.1f, 0.0f);
        cja.b(180.0f - this.g.e, 0.0f, 1.0f, 0.0f);
        cja.b((float)(this.g.g.as == 2 ? -1 : 1) * -this.g.f, 1.0f, 0.0f, 0.0f);
        float f13 = 0.3f;
        cja.b(0.3f, 0.3f, 0.3f);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.l);
        bix2.b(-0.5, -0.25, 0.0).a(f4, f7).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, -0.25, 0.0).a(f5, f7).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, 0.75, 0.0).a(f5, f6).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(-0.5, 0.75, 0.0).a(f4, f6).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
        bha2.b();
        cja.k();
        cja.B();
        cja.E();
        super.a((cpk)cvs2, d2, d3, d4, f2, f3);
    }

    protected bpx a(cvs cvs2) {
        return a;
    }
}

