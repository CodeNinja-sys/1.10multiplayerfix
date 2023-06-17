/*
 * Decompiled with CFR 0.150.
 */
public class asl
extends kh {
    private static final bpx a = new bpx("textures/entity/enchanting_table_book.png");
    private final td d = new td();

    public void a(app app2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        cja.D();
        cja.c((float)d2 + 0.5f, (float)d3 + 0.75f, (float)d4 + 0.5f);
        float f4 = (float)app2.a + f2;
        cja.c(0.0f, 0.1f + cmk.a(f4 * 0.1f) * 0.01f, 0.0f);
        for (f3 = app2.h - app2.i; f3 >= (float)Math.PI; f3 -= (float)Math.PI * 2) {
        }
        while (f3 < (float)(-Math.PI)) {
            f3 += (float)Math.PI * 2;
        }
        float f5 = app2.i + f3 * f2;
        cja.b(-f5 * 57.295776f, 0.0f, 1.0f, 0.0f);
        cja.b(80.0f, 0.0f, 0.0f, 1.0f);
        this.a(a);
        float f6 = app2.c + (app2.b - app2.c) * f2 + 0.25f;
        float f7 = app2.c + (app2.b - app2.c) * f2 + 0.75f;
        f6 = (f6 - (float)cmk.b((double)f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)cmk.b((double)f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = app2.g + (app2.f - app2.g) * f2;
        cja.p();
        this.d.a(null, f4, f6, f7, f8, 0.0f, 0.0625f);
        cja.E();
    }
}

