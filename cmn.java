/*
 * Decompiled with CFR 0.150.
 */
public class cmn
extends bcf {
    private static final bpx a = new bpx("textures/entity/shulker/endergolem.png");
    private int b;

    public cmn(bid bid2, io io2) {
        super(bid2, io2, 0.0f);
        this.a(new qy(this, null));
        this.b = io2.a();
        this.h = 0.0f;
    }

    public void a(aoa aoa2, double d2, double d3, double d4, float f2, float f3) {
        int n2;
        if (this.b != ((io)this.c).a()) {
            this.c = new io();
            this.b = ((io)this.c).a();
        }
        if ((n2 = aoa2.Y()) > 0 && aoa2.ae()) {
            cmz cmz2 = aoa2.Q();
            cmz cmz3 = aoa2.Z();
            double d5 = (double)((float)n2 - f3) / 6.0;
            d5 *= d5;
            double d6 = (double)(cmz2.a() - cmz3.a()) * d5;
            double d7 = (double)(cmz2.b() - cmz3.b()) * d5;
            double d8 = (double)(cmz2.c() - cmz3.c()) * d5;
            super.a(aoa2, d2 - d6, d3 - d7, d4 - d8, f2, f3);
        } else {
            super.a(aoa2, d2, d3, d4, f2, f3);
        }
    }

    public boolean a(aoa aoa2, cct cct2, double d2, double d3, double d4) {
        if (super.a(aoa2, cct2, d2, d3, d4)) {
            return true;
        }
        if (aoa2.Y() > 0 && aoa2.ae()) {
            cmz cmz2 = aoa2.Z();
            cmz cmz3 = aoa2.Q();
            amj amj2 = new amj(cmz3.a(), cmz3.b(), cmz3.c());
            amj amj3 = new amj(cmz2.a(), cmz2.b(), cmz2.c());
            if (cct2.a(new cxt(amj3.b, amj3.c, amj3.d, amj2.b, amj2.c, amj2.d))) {
                return true;
            }
        }
        return false;
    }

    protected bpx a(aoa aoa2) {
        return a;
    }

    protected void a(aoa aoa2, float f2, float f3, float f4) {
        super.a((bga)aoa2, f2, f3, f4);
        switch (aoa2.M()) {
            case a: {
                break;
            }
            case f: {
                cja.c(0.5f, 0.5f, 0.0f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.b(90.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case e: {
                cja.c(-0.5f, 0.5f, 0.0f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.b(-90.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case c: {
                cja.c(0.0f, 0.5f, -0.5f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                break;
            }
            case d: {
                cja.c(0.0f, 0.5f, 0.5f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.b(180.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case b: {
                cja.c(0.0f, 1.0f, 0.0f);
                cja.b(180.0f, 1.0f, 0.0f, 0.0f);
            }
        }
    }

    protected void a(aoa aoa2, float f2) {
        float f3 = 0.999f;
        cja.b(0.999f, 0.999f, 0.999f);
    }

    static /* synthetic */ bpx b() {
        return a;
    }
}

