/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bpz
extends axg {
    abd a;
    abd[] b = new abd[9];

    public bpz() {
        int n2 = -16;
        this.a = new abd(this, 0, 0);
        this.a.a(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.a.d += 8.0f;
        Random random = new Random(1660L);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new abd(this, 0, 0);
            float f2 = (((float)(i2 % 3) - (float)(i2 / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f3 = ((float)(i2 / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n3 = random.nextInt(7) + 8;
            this.b[i2].a(-1.0f, 0.0f, -1.0f, 2, n3, 2);
            this.b[i2].c = f2;
            this.b[i2].e = f3;
            this.b[i2].d = 15.0f;
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2].f = 0.2f * cmk.a(f4 * 0.3f + (float)i2) + 0.4f;
        }
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        cja.D();
        cja.c(0.0f, 0.6f, 0.0f);
        this.a.a(f7);
        for (abd abd2 : this.b) {
            abd2.a(f7);
        }
        cja.E();
    }
}

