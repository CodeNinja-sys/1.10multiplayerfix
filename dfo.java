/*
 * Decompiled with CFR 0.150.
 */
public class dfo
extends buc {
    private static final bpx b = new bpx("textures/entity/minecart.png");
    protected axg a = new coh();

    public dfo(bid bid2) {
        super(bid2);
        this.h = 0.5f;
    }

    public void a(cef cef2, double d2, double d3, double d4, float f2, float f3) {
        dbk dbk2;
        cja.D();
        this.e(cef2);
        long l2 = (long)cef2.bW() * 493286711L;
        l2 = l2 * l2 * 4392167121L + l2 * 98761L;
        float f4 = (((float)(l2 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l2 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f6 = (((float)(l2 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        cja.c(f4, f5, f6);
        double d5 = cef2.br + (cef2.aU - cef2.br) * (double)f3;
        double d6 = cef2.bs + (cef2.aV - cef2.bs) * (double)f3;
        double d7 = cef2.bt + (cef2.aW - cef2.bt) * (double)f3;
        double d8 = 0.3f;
        amj amj2 = cef2.f(d5, d6, d7);
        float f7 = cef2.bd + (cef2.bb - cef2.bd) * f3;
        if (amj2 != null) {
            amj amj3 = cef2.a(d5, d6, d7, (double)0.3f);
            amj amj4 = cef2.a(d5, d6, d7, (double)-0.3f);
            if (amj3 == null) {
                amj3 = amj2;
            }
            if (amj4 == null) {
                amj4 = amj2;
            }
            d2 += amj2.b - d5;
            d3 += (amj3.c + amj4.c) / 2.0 - d6;
            d4 += amj2.d - d7;
            amj amj5 = amj4.b(-amj3.b, -amj3.c, -amj3.d);
            if (amj5.b() != 0.0) {
                amj5 = amj5.a();
                f2 = (float)(Math.atan2(amj5.d, amj5.b) * 180.0 / Math.PI);
                f7 = (float)(Math.atan(amj5.c) * 73.0);
            }
        }
        cja.c((float)d2, (float)d3 + 0.375f, (float)d4);
        cja.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        cja.b(-f7, 0.0f, 0.0f, 1.0f);
        float f8 = (float)cef2.C() - f3;
        float f9 = cef2.B() - f3;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f8 > 0.0f) {
            cja.b(cmk.a(f8) * f8 * f9 / 10.0f * (float)cef2.E(), 1.0f, 0.0f, 0.0f);
        }
        int n2 = cef2.I();
        if (this.j) {
            cja.g();
            cja.e(this.d(cef2));
        }
        if ((dbk2 = cef2.H()).i() != cpb.a) {
            cja.D();
            this.a(dam.g);
            float f10 = 0.75f;
            cja.b(0.75f, 0.75f, 0.75f);
            cja.c(-0.5f, (float)(n2 - 8) / 16.0f, 0.5f);
            this.a(cef2, f3, dbk2);
            cja.E();
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.e(cef2);
        }
        cja.b(-1.0f, -1.0f, 1.0f);
        this.a.a(cef2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        cja.E();
        if (this.j) {
            cja.m();
            cja.h();
        }
        super.a((cpk)cef2, d2, d3, d4, f2, f3);
    }

    protected bpx a(cef cef2) {
        return b;
    }

    protected void a(cef cef2, float f2, dbk dbk2) {
        cja.D();
        bxy.B().ac().a(dbk2, cef2.a(f2));
        cja.E();
    }
}

