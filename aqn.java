/*
 * Decompiled with CFR 0.150.
 */
public class aqn {
    public final int a;
    public final int b;
    public final int c;
    private final int n;
    public int d = -1;
    public float e;
    public float f;
    public float g;
    public aqn h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public cfh m = cfh.a;

    public aqn(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.n = aqn.b(n2, n3, n4);
    }

    public aqn a(int n2, int n3, int n4) {
        aqn aqn2 = new aqn(n2, n3, n4);
        aqn2.d = this.d;
        aqn2.e = this.e;
        aqn2.f = this.f;
        aqn2.g = this.g;
        aqn2.h = this.h;
        aqn2.i = this.i;
        aqn2.j = this.j;
        aqn2.k = this.k;
        aqn2.l = this.l;
        aqn2.m = this.m;
        return aqn2;
    }

    public static int b(int n2, int n3, int n4) {
        return n3 & 0xFF | (n2 & 0x7FFF) << 8 | (n4 & 0x7FFF) << 24 | (n2 < 0 ? Integer.MIN_VALUE : 0) | (n4 < 0 ? 32768 : 0);
    }

    public float a(aqn aqn2) {
        float f2 = aqn2.a - this.a;
        float f3 = aqn2.b - this.b;
        float f4 = aqn2.c - this.c;
        return cmk.c(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public float b(aqn aqn2) {
        float f2 = aqn2.a - this.a;
        float f3 = aqn2.b - this.b;
        float f4 = aqn2.c - this.c;
        return f2 * f2 + f3 * f3 + f4 * f4;
    }

    public float c(aqn aqn2) {
        float f2 = Math.abs(aqn2.a - this.a);
        float f3 = Math.abs(aqn2.b - this.b);
        float f4 = Math.abs(aqn2.c - this.c);
        return f2 + f3 + f4;
    }

    public boolean equals(Object object) {
        if (object instanceof aqn) {
            aqn aqn2 = (aqn)object;
            return this.n == aqn2.n && this.a == aqn2.a && this.b == aqn2.b && this.c == aqn2.c;
        }
        return false;
    }

    public int hashCode() {
        return this.n;
    }

    public boolean a() {
        return this.d >= 0;
    }

    public String toString() {
        return this.a + ", " + this.b + ", " + this.c;
    }

    public static aqn a(si si2) {
        aqn aqn2 = new aqn(si2.K(), si2.K(), si2.K());
        aqn2.j = si2.O();
        aqn2.k = si2.O();
        aqn2.l = si2.O();
        aqn2.i = si2.D();
        aqn2.m = cfh.values()[si2.K()];
        aqn2.g = si2.O();
        return aqn2;
    }
}

