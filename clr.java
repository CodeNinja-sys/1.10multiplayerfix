/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class clr
implements czo {
    private final wq a;

    public clr(wq wq2) {
        this.a = wq2;
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int n2 = bga2.bp();
        if (n2 <= 0) {
            return;
        }
        bib bib2 = new bib(bga2.aQ, bga2.aU, bga2.aV, bga2.aW);
        Random random = new Random(bga2.bW());
        bjr.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            cja.D();
            abd abd2 = this.a.c().a(random);
            ayd ayd2 = (ayd)abd2.l.get(random.nextInt(abd2.l.size()));
            abd2.c(0.0625f);
            float f9 = random.nextFloat();
            float f10 = random.nextFloat();
            float f11 = random.nextFloat();
            float f12 = (ayd2.a + (ayd2.d - ayd2.a) * f9) / 16.0f;
            float f13 = (ayd2.b + (ayd2.e - ayd2.b) * f10) / 16.0f;
            float f14 = (ayd2.c + (ayd2.f - ayd2.c) * f11) / 16.0f;
            cja.c(f12, f13, f14);
            f9 = f9 * 2.0f - 1.0f;
            f10 = f10 * 2.0f - 1.0f;
            f11 = f11 * 2.0f - 1.0f;
            float f15 = cmk.c((f9 *= -1.0f) * f9 + (f11 *= -1.0f) * f11);
            bib2.ba = (float)(Math.atan2(f9, f11) * 57.2957763671875);
            bib2.bb = (float)(Math.atan2(f10 *= -1.0f, f15) * 57.2957763671875);
            bib2.bc = bib2.ba;
            bib2.bd = bib2.bb;
            double d2 = 0.0;
            double d3 = 0.0;
            double d4 = 0.0;
            this.a.g().a(bib2, 0.0, 0.0, 0.0, 0.0f, f4, false);
            cja.E();
        }
        bjr.b();
    }

    @Override
    public boolean a() {
        return false;
    }
}

