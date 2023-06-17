/*
 * Decompiled with CFR 0.150.
 */
import java.util.Calendar;

public class ng
extends kh {
    private static final bpx a = new bpx("textures/entity/chest/trapped_double.png");
    private static final bpx d = new bpx("textures/entity/chest/christmas_double.png");
    private static final bpx e = new bpx("textures/entity/chest/normal_double.png");
    private static final bpx f = new bpx("textures/entity/chest/trapped.png");
    private static final bpx g = new bpx("textures/entity/chest/christmas.png");
    private static final bpx h = new bpx("textures/entity/chest/normal.png");
    private final bcd i = new bcd();
    private final bcd j = new dei();
    private boolean k;

    public ng() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.k = true;
        }
    }

    public void a(bdm bdm2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        int n3;
        Object object;
        cja.j();
        cja.c(515);
        cja.a(true);
        if (bdm2.w()) {
            object = bdm2.z();
            n3 = bdm2.x();
            if (object instanceof aqi && n3 == 0) {
                ((aqi)object).e(bdm2.b_(), bdm2.y(), bdm2.b_().n(bdm2.y()));
                n3 = bdm2.x();
            }
            bdm2.k();
        } else {
            n3 = 0;
        }
        if (bdm2.d != null || bdm2.f != null) {
            return;
        }
        if (bdm2.e != null || bdm2.g != null) {
            object = this.j;
            if (n2 >= 0) {
                this.a(b[n2]);
                cja.l(5890);
                cja.D();
                cja.b(8.0f, 4.0f, 1.0f);
                cja.c(0.0625f, 0.0625f, 0.0625f);
                cja.l(5888);
            } else if (this.k) {
                this.a(d);
            } else if (bdm2.o() == asr.b) {
                this.a(a);
            } else {
                this.a(e);
            }
        } else {
            object = this.i;
            if (n2 >= 0) {
                this.a(b[n2]);
                cja.l(5890);
                cja.D();
                cja.b(4.0f, 4.0f, 1.0f);
                cja.c(0.0625f, 0.0625f, 0.0625f);
                cja.l(5888);
            } else if (this.k) {
                this.a(g);
            } else if (bdm2.o() == asr.b) {
                this.a(f);
            } else {
                this.a(h);
            }
        }
        cja.D();
        cja.A();
        if (n2 < 0) {
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        cja.c((float)d2, (float)d3 + 1.0f, (float)d4 + 1.0f);
        cja.b(1.0f, -1.0f, -1.0f);
        cja.c(0.5f, 0.5f, 0.5f);
        int n4 = 0;
        if (n3 == 2) {
            n4 = 180;
        }
        if (n3 == 3) {
            n4 = 0;
        }
        if (n3 == 4) {
            n4 = 90;
        }
        if (n3 == 5) {
            n4 = -90;
        }
        if (n3 == 2 && bdm2.e != null) {
            cja.c(1.0f, 0.0f, 0.0f);
        }
        if (n3 == 5 && bdm2.g != null) {
            cja.c(0.0f, 0.0f, -1.0f);
        }
        cja.b((float)n4, 0.0f, 1.0f, 0.0f);
        cja.c(-0.5f, -0.5f, -0.5f);
        float f4 = bdm2.i + (bdm2.h - bdm2.i) * f2;
        if (bdm2.d != null && (f3 = bdm2.d.i + (bdm2.d.h - bdm2.d.i) * f2) > f4) {
            f4 = f3;
        }
        if (bdm2.f != null && (f3 = bdm2.f.i + (bdm2.f.h - bdm2.f.i) * f2) > f4) {
            f4 = f3;
        }
        f4 = 1.0f - f4;
        f4 = 1.0f - f4 * f4 * f4;
        object.a.f = -(f4 * 1.5707964f);
        ((bcd)object).a();
        cja.B();
        cja.E();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        if (n2 >= 0) {
            cja.l(5890);
            cja.E();
            cja.l(5888);
        }
    }
}

