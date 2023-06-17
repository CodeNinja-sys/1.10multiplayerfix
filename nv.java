/*
 * Decompiled with CFR 0.150.
 */
public class nv
extends r {
    private float i;
    private float j;

    public nv(bdl bdl2) {
        super(bdl2.o);
        this.A = true;
    }

    @Override
    public void d() {
        if (this.u.c.h()) {
            this.u.a(new ans(this.u.h));
        }
    }

    @Override
    public void cH_() {
        this.y.clear();
        if (this.u.c.h()) {
            this.u.a(new ans(this.u.h));
        } else {
            super.cH_();
        }
    }

    @Override
    protected void a(int n2, int n3) {
        this.B.a(bf.a("container.crafting", new Object[0]), 97, 8, 0x404040);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        this.i = n2;
        this.j = n3;
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(a);
        int n4 = this.e;
        int n5 = this.f;
        this.c(n4, n5, 0, 0, this.b, this.c);
        nv.a(n4 + 51, n5 + 75, 30, (float)(n4 + 51) - this.i, (float)(n5 + 75 - 50) - this.j, this.u.h);
    }

    public static void a(int n2, int n3, int n4, float f2, float f3, bga bga2) {
        cja.g();
        cja.D();
        cja.c((float)n2, (float)n3, 50.0f);
        cja.b((float)(-n4), (float)n4, (float)n4);
        cja.b(180.0f, 0.0f, 0.0f, 1.0f);
        float f4 = bga2.ah;
        float f5 = bga2.ba;
        float f6 = bga2.bb;
        float f7 = bga2.ak;
        float f8 = bga2.aj;
        cja.b(135.0f, 0.0f, 1.0f, 0.0f);
        bjr.b();
        cja.b(-135.0f, 0.0f, 1.0f, 0.0f);
        cja.b(-((float)Math.atan(f3 / 40.0f)) * 20.0f, 1.0f, 0.0f, 0.0f);
        bga2.ah = (float)Math.atan(f2 / 40.0f) * 20.0f;
        bga2.ba = (float)Math.atan(f2 / 40.0f) * 40.0f;
        bga2.bb = -((float)Math.atan(f3 / 40.0f)) * 20.0f;
        bga2.aj = bga2.ba;
        bga2.ak = bga2.ba;
        cja.c(0.0f, 0.0f, 0.0f);
        bid bid2 = bxy.B().ad();
        bid2.a(180.0f);
        bid2.a(false);
        bid2.a(bga2, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
        bid2.a(true);
        bga2.ah = f4;
        bga2.ba = f5;
        bga2.bb = f6;
        bga2.ak = f7;
        bga2.aj = f8;
        cja.E();
        bjr.a();
        cja.B();
        cja.g(cjg.r);
        cja.w();
        cja.g(cjg.q);
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 0) {
            this.u.a(new aeg(this, this.u.h.E()));
        }
        if (cwv2.j == 1) {
            this.u.a(new bjs(this, this.u.h.E()));
        }
    }
}

