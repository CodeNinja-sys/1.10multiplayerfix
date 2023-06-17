/*
 * Decompiled with CFR 0.150.
 */
public class zz {
    public final int a;
    public final int b;

    public zz(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public zz(cmz cmz2) {
        this.a = cmz2.a() >> 4;
        this.b = cmz2.c() >> 4;
    }

    public static long a(int n2, int n3) {
        return (long)n2 & 0xFFFFFFFFL | ((long)n3 & 0xFFFFFFFFL) << 32;
    }

    public int hashCode() {
        int n2 = 1664525 * this.a + 1013904223;
        int n3 = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
        return n2 ^ n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof zz) {
            zz zz2 = (zz)object;
            return this.a == zz2.a && this.b == zz2.b;
        }
        return false;
    }

    public double a(cpk cpk2) {
        double d2 = this.a * 16 + 8;
        double d3 = this.b * 16 + 8;
        double d4 = d2 - cpk2.aU;
        double d5 = d3 - cpk2.aW;
        return d4 * d4 + d5 * d5;
    }

    public int a() {
        return (this.a << 4) + 8;
    }

    public int b() {
        return (this.b << 4) + 8;
    }

    public int c() {
        return this.a << 4;
    }

    public int d() {
        return this.b << 4;
    }

    public int e() {
        return (this.a << 4) + 15;
    }

    public int f() {
        return (this.b << 4) + 15;
    }

    public cmz a(int n2, int n3, int n4) {
        return new cmz((this.a << 4) + n2, n3, (this.b << 4) + n4);
    }

    public cmz a(int n2) {
        return new cmz(this.a(), n2, this.b());
    }

    public String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}

