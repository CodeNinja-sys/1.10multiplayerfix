/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class atg
implements czo {
    public void a(brd brd2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (brd2.y <= 0) {
            return;
        }
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bjr.a();
        float f9 = ((float)brd2.y + f4) / 200.0f;
        float f10 = 0.0f;
        if (f9 > 0.8f) {
            f10 = (f9 - 0.8f) / 0.2f;
        }
        Random random = new Random(432L);
        cja.w();
        cja.j(7425);
        cja.l();
        cja.a(bjt.l, afi.e);
        cja.c();
        cja.p();
        cja.a(false);
        cja.D();
        cja.c(0.0f, -1.0f, -2.0f);
        int n2 = 0;
        while ((float)n2 < (f9 + f9 * f9) / 2.0f * 60.0f) {
            cja.b(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
            cja.b(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
            cja.b(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
            cja.b(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
            cja.b(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
            cja.b(random.nextFloat() * 360.0f + f9 * 90.0f, 0.0f, 0.0f, 1.0f);
            float f11 = random.nextFloat() * 20.0f + 5.0f + f10 * 10.0f;
            float f12 = random.nextFloat() * 2.0f + 1.0f + f10 * 2.0f;
            bix2.a(6, bxb.f);
            bix2.b(0.0, 0.0, 0.0).b(255, 255, 255, (int)(255.0f * (1.0f - f10))).d();
            bix2.b(-0.866 * (double)f12, (double)f11, (double)(-0.5f * f12)).b(255, 0, 255, 0).d();
            bix2.b(0.866 * (double)f12, (double)f11, (double)(-0.5f * f12)).b(255, 0, 255, 0).d();
            bix2.b(0.0, (double)f11, (double)(1.0f * f12)).b(255, 0, 255, 0).d();
            bix2.b(-0.866 * (double)f12, (double)f11, (double)(-0.5f * f12)).b(255, 0, 255, 0).d();
            bha2.b();
            ++n2;
        }
        cja.E();
        cja.a(true);
        cja.q();
        cja.k();
        cja.j(7424);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.v();
        cja.d();
        bjr.b();
    }

    @Override
    public boolean a() {
        return false;
    }
}

