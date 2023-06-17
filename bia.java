/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.opengl.GLContext;

final class bia
extends asc {
    @Override
    public void a() {
        cja.c();
        cja.a(519, 0.0f);
        cja.f();
        cja.a(2899, bjr.a(0.2f, 0.2f, 0.2f, 1.0f));
        for (int i2 = 0; i2 < 8; ++i2) {
            cja.b(i2);
            cja.a(16384 + i2, 4608, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
            cja.a(16384 + i2, 4611, bjr.a(0.0f, 0.0f, 1.0f, 0.0f));
            if (i2 == 0) {
                cja.a(16384 + i2, 4609, bjr.a(1.0f, 1.0f, 1.0f, 1.0f));
                cja.a(16384 + i2, 4610, bjr.a(1.0f, 1.0f, 1.0f, 1.0f));
                continue;
            }
            cja.a(16384 + i2, 4609, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
            cja.a(16384 + i2, 4610, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
        }
        cja.h();
        cja.a(1032, 5634);
        cja.i();
        cja.c(513);
        cja.a(true);
        cja.k();
        cja.a(bjt.e, afi.n);
        cja.a(bjt.e, afi.n, bjt.e, afi.n);
        cja.d(32774);
        cja.o();
        cja.c(2917, 2048);
        cja.a(1.0f);
        cja.b(0.0f);
        cja.c(1.0f);
        cja.b(2918, bjr.a(0.0f, 0.0f, 0.0f, 0.0f));
        if (GLContext.a().fk) {
            cja.c(2917, 34140);
        }
        cja.a(0.0f, 0.0f);
        cja.u();
        cja.f(5379);
        cja.b(awb.a);
        cja.a(awb.a, 9216);
        cja.a(awb.a, 9474, bjr.a(1.0f, 0.0f, 0.0f, 0.0f));
        cja.a(awb.a, 9217, bjr.a(1.0f, 0.0f, 0.0f, 0.0f));
        cja.b(awb.b);
        cja.a(awb.b, 9216);
        cja.a(awb.b, 9474, bjr.a(0.0f, 1.0f, 0.0f, 0.0f));
        cja.a(awb.b, 9217, bjr.a(0.0f, 1.0f, 0.0f, 0.0f));
        cja.b(awb.c);
        cja.a(awb.c, 9216);
        cja.a(awb.c, 9474, bjr.a(0.0f, 0.0f, 0.0f, 0.0f));
        cja.a(awb.c, 9217, bjr.a(0.0f, 0.0f, 0.0f, 0.0f));
        cja.b(awb.d);
        cja.a(awb.d, 9216);
        cja.a(awb.d, 9474, bjr.a(0.0f, 0.0f, 0.0f, 0.0f));
        cja.a(awb.d, 9217, bjr.a(0.0f, 0.0f, 0.0f, 0.0f));
        cja.g(0);
        cja.b(3553, 10240, 9729);
        cja.b(3553, 10241, 9986);
        cja.b(3553, 10242, 10497);
        cja.b(3553, 10243, 10497);
        cja.b(3553, 33085, 1000);
        cja.b(3553, 33083, 1000);
        cja.b(3553, 33082, -1000);
        cja.b(3553, 34049, 0.0f);
        cja.a(8960, 8704, 8448);
        cja.b(8960, 8705, bjr.a(0.0f, 0.0f, 0.0f, 0.0f));
        cja.a(8960, 34161, 8448);
        cja.a(8960, 34162, 8448);
        cja.a(8960, 34176, 5890);
        cja.a(8960, 34177, 34168);
        cja.a(8960, 34178, 34166);
        cja.a(8960, 34184, 5890);
        cja.a(8960, 34185, 34168);
        cja.a(8960, 34186, 34166);
        cja.a(8960, 34192, 768);
        cja.a(8960, 34193, 768);
        cja.a(8960, 34194, 770);
        cja.a(8960, 34200, 770);
        cja.a(8960, 34201, 770);
        cja.a(8960, 34202, 770);
        cja.a(8960, 34163, 1.0f);
        cja.a(8960, 3356, 1.0f);
        cja.z();
        cja.j(7425);
        cja.B();
        cja.a(true, true, true, true);
        cja.a(1.0);
        cja.d(1.0f);
        cja.a(0.0f, 0.0f, 1.0f);
        cja.d(1028, 6914);
        cja.d(1029, 6914);
    }

    @Override
    public void b() {
    }
}

