/*
 * Decompiled with CFR 0.150.
 */
public class cuf
extends qa {
    private bga a;

    protected cuf(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
        this.y = 0.0f;
        this.w = 30;
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public void b() {
        super.b();
        if (this.a == null) {
            bym bym2 = new bym(this.b);
            bym2.aP();
            this.a = bym2;
        }
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.a == null) {
            return;
        }
        bid bid2 = bxy.B().ad();
        bid2.a(qa.G, qa.H, qa.I);
        float f8 = 0.42553192f;
        float f9 = ((float)this.v + f2) / (float)this.w;
        cja.a(true);
        cja.l();
        cja.j();
        cja.a(bjt.l, afi.j);
        float f10 = 240.0f;
        cjg.a(cjg.r, 240.0f, 240.0f);
        cja.D();
        float f11 = 0.05f + 0.5f * cmk.a(f9 * (float)Math.PI);
        cja.c(1.0f, 1.0f, 1.0f, f11);
        cja.c(0.0f, 1.8f, 0.0f);
        cja.b(180.0f - cpk2.ba, 0.0f, 1.0f, 0.0f);
        cja.b(60.0f - 150.0f * f9 - cpk2.bb, 1.0f, 0.0f, 0.0f);
        cja.c(0.0f, -0.4f, -1.5f);
        cja.b(0.42553192f, 0.42553192f, 0.42553192f);
        this.a.ba = 0.0f;
        this.a.aj = 0.0f;
        this.a.bc = 0.0f;
        this.a.ak = 0.0f;
        bid2.a(this.a, 0.0, 0.0, 0.0, 0.0f, f2, false);
        cja.E();
        cja.j();
    }
}

