/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.util.e.e;

public class dfk {
    public static final dfk a = new dfk();
    public static float b;
    public static float c;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static float h;
    public static float i;
    public static float j;
    public final cll k;
    public final cll l;
    public final cll m;
    public final cll n;
    public final cll o;
    public final cll p;
    public final cll q;
    public final cll r;

    private dfk() {
        this(cll.a, cll.a, cll.a, cll.a, cll.a, cll.a, cll.a, cll.a);
    }

    public dfk(dfk dfk2) {
        this.k = dfk2.k;
        this.l = dfk2.l;
        this.m = dfk2.m;
        this.n = dfk2.n;
        this.o = dfk2.o;
        this.p = dfk2.p;
        this.q = dfk2.q;
        this.r = dfk2.r;
    }

    public dfk(cll cll2, cll cll3, cll cll4, cll cll5, cll cll6, cll cll7, cll cll8, cll cll9) {
        this.k = cll2;
        this.l = cll3;
        this.m = cll4;
        this.n = cll5;
        this.o = cll6;
        this.p = cll7;
        this.q = cll8;
        this.r = cll9;
    }

    public void a(cua cua2) {
        dfk.a(this.b(cua2), false);
    }

    public static void a(cll cll2, boolean bl2) {
        if (cll2 == cll.a) {
            return;
        }
        int n2 = bl2 ? -1 : 1;
        cja.c((float)n2 * (b + cll2.c.a), c + cll2.c.b, d + cll2.c.c);
        float f2 = e + cll2.b.a;
        float f3 = f + cll2.b.b;
        float f4 = g + cll2.b.c;
        if (bl2) {
            f3 = -f3;
            f4 = -f4;
        }
        cja.a(dfk.a(f2, f3, f4));
        cja.b(h + cll2.d.a, i + cll2.d.b, j + cll2.d.c);
    }

    private static e a(float f2, float f3, float f4) {
        float f5 = f2 * ((float)Math.PI / 180);
        float f6 = f3 * ((float)Math.PI / 180);
        float f7 = f4 * ((float)Math.PI / 180);
        float f8 = cmk.a(0.5f * f5);
        float f9 = cmk.b(0.5f * f5);
        float f10 = cmk.a(0.5f * f6);
        float f11 = cmk.b(0.5f * f6);
        float f12 = cmk.a(0.5f * f7);
        float f13 = cmk.b(0.5f * f7);
        return new e(f8 * f11 * f13 + f9 * f10 * f12, f9 * f10 * f13 - f8 * f11 * f12, f8 * f10 * f13 + f9 * f11 * f12, f9 * f11 * f13 - f8 * f10 * f12);
    }

    public cll b(cua cua2) {
        switch (cua2) {
            case b: {
                return this.k;
            }
            case c: {
                return this.l;
            }
            case d: {
                return this.m;
            }
            case e: {
                return this.n;
            }
            case f: {
                return this.o;
            }
            case g: {
                return this.p;
            }
            case h: {
                return this.q;
            }
            case i: {
                return this.r;
            }
        }
        return cll.a;
    }

    public boolean c(cua cua2) {
        return this.b(cua2) != cll.a;
    }
}

