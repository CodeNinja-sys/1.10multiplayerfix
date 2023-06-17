/*
 * Decompiled with CFR 0.150.
 */
public class ayd {
    private final cas[] h;
    private final akq[] i;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public String g;

    public ayd(abd abd2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        this(abd2, n2, n3, f2, f3, f4, n4, n5, n6, f5, abd2.i);
    }

    public ayd(abd abd2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5, boolean bl2) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f2 + (float)n4;
        this.e = f3 + (float)n5;
        this.f = f4 + (float)n6;
        this.h = new cas[8];
        this.i = new akq[6];
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        float f8 = f4 + (float)n6;
        f2 -= f5;
        f3 -= f5;
        f4 -= f5;
        f6 += f5;
        f7 += f5;
        f8 += f5;
        if (bl2) {
            float f9 = f6;
            f6 = f2;
            f2 = f9;
        }
        cas cas2 = new cas(f2, f3, f4, 0.0f, 0.0f);
        cas cas3 = new cas(f6, f3, f4, 0.0f, 8.0f);
        cas cas4 = new cas(f6, f7, f4, 8.0f, 8.0f);
        cas cas5 = new cas(f2, f7, f4, 8.0f, 0.0f);
        cas cas6 = new cas(f2, f3, f8, 0.0f, 0.0f);
        cas cas7 = new cas(f6, f3, f8, 0.0f, 8.0f);
        cas cas8 = new cas(f6, f7, f8, 8.0f, 8.0f);
        cas cas9 = new cas(f2, f7, f8, 8.0f, 0.0f);
        this.h[0] = cas2;
        this.h[1] = cas3;
        this.h[2] = cas4;
        this.h[3] = cas5;
        this.h[4] = cas6;
        this.h[5] = cas7;
        this.h[6] = cas8;
        this.h[7] = cas9;
        this.i[0] = new akq(new cas[]{cas7, cas3, cas4, cas8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n6, n3 + n6 + n5, abd2.a, abd2.b);
        this.i[1] = new akq(new cas[]{cas2, cas6, cas9, cas5}, n2, n3 + n6, n2 + n6, n3 + n6 + n5, abd2.a, abd2.b);
        this.i[2] = new akq(new cas[]{cas7, cas6, cas2, cas3}, n2 + n6, n3, n2 + n6 + n4, n3 + n6, abd2.a, abd2.b);
        this.i[3] = new akq(new cas[]{cas4, cas5, cas9, cas8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n4, n3, abd2.a, abd2.b);
        this.i[4] = new akq(new cas[]{cas3, cas2, cas5, cas4}, n2 + n6, n3 + n6, n2 + n6 + n4, n3 + n6 + n5, abd2.a, abd2.b);
        this.i[5] = new akq(new cas[]{cas6, cas7, cas8, cas9}, n2 + n6 + n4 + n6, n3 + n6, n2 + n6 + n4 + n6 + n4, n3 + n6 + n5, abd2.a, abd2.b);
        if (bl2) {
            for (akq akq2 : this.i) {
                akq2.a();
            }
        }
    }

    public void a(bix bix2, float f2) {
        for (akq akq2 : this.i) {
            akq2.a(bix2, f2);
        }
    }

    public ayd a(String string) {
        this.g = string;
        return this;
    }
}

