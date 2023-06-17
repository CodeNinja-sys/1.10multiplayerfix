/*
 * Decompiled with CFR 0.150.
 */
public class cur
extends axg {
    abd[] a = new abd[8];
    abd b;

    public cur() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n2 = 0;
            int n3 = i2;
            if (i2 == 2) {
                n2 = 24;
                n3 = 10;
            } else if (i2 == 3) {
                n2 = 24;
                n3 = 19;
            }
            this.a[i2] = new abd(this, n2, n3);
            this.a[i2].a(-4.0f, 16 + i2, -4.0f, 8, 1, 8);
        }
        this.b = new abd(this, 0, 16);
        this.b.a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4) {
        clw clw2 = (clw)bga2;
        float f5 = clw2.c + (clw2.b - clw2.c) * f4;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].d = (float)(-(4 - i2)) * f5 * 1.7f;
        }
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.b.a(f7);
        for (abd abd2 : this.a) {
            abd2.a(f7);
        }
    }
}

