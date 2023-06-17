/*
 * Decompiled with CFR 0.150.
 */
public class akq {
    public cas[] a;
    public int b;
    private boolean c;

    public akq(cas[] arrcas) {
        this.a = arrcas;
        this.b = arrcas.length;
    }

    public akq(cas[] arrcas, int n2, int n3, int n4, int n5, float f2, float f3) {
        this(arrcas);
        float f4 = 0.0f / f2;
        float f5 = 0.0f / f3;
        arrcas[0] = arrcas[0].a((float)n4 / f2 - f4, (float)n3 / f3 + f5);
        arrcas[1] = arrcas[1].a((float)n2 / f2 + f4, (float)n3 / f3 + f5);
        arrcas[2] = arrcas[2].a((float)n2 / f2 + f4, (float)n5 / f3 - f5);
        arrcas[3] = arrcas[3].a((float)n4 / f2 - f4, (float)n5 / f3 - f5);
    }

    public void a() {
        cas[] arrcas = new cas[this.a.length];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            arrcas[i2] = this.a[this.a.length - i2 - 1];
        }
        this.a = arrcas;
    }

    public void a(bix bix2, float f2) {
        amj amj2 = this.a[1].a.a(this.a[0].a);
        amj amj3 = this.a[1].a.a(this.a[2].a);
        amj amj4 = amj3.c(amj2).a();
        float f3 = (float)amj4.b;
        float f4 = (float)amj4.c;
        float f5 = (float)amj4.d;
        if (this.c) {
            f3 = -f3;
            f4 = -f4;
            f5 = -f5;
        }
        bix2.a(7, bxb.c);
        for (int i2 = 0; i2 < 4; ++i2) {
            cas cas2 = this.a[i2];
            bix2.b(cas2.a.b * (double)f2, cas2.a.c * (double)f2, cas2.a.d * (double)f2).a(cas2.b, cas2.c).c(f3, f4, f5).d();
        }
        bha.a().b();
    }
}

