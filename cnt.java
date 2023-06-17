/*
 * Decompiled with CFR 0.150.
 */
public class cnt {
    private final double a;
    private final double b;
    private int c;
    private int d;
    private int e;

    public cnt(bxy bxy2) {
        this.c = bxy2.d;
        this.d = bxy2.e;
        this.e = 1;
        boolean bl2 = bxy2.g();
        int n2 = bxy2.u.aC;
        if (n2 == 0) {
            n2 = 1000;
        }
        while (this.e < n2 && this.c / (this.e + 1) >= 320 && this.d / (this.e + 1) >= 240) {
            ++this.e;
        }
        if (bl2 && this.e % 2 != 0 && this.e != 1) {
            --this.e;
        }
        this.a = (double)this.c / (double)this.e;
        this.b = (double)this.d / (double)this.e;
        this.c = cmk.f(this.a);
        this.d = cmk.f(this.b);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public double c() {
        return this.a;
    }

    public double d() {
        return this.b;
    }

    public int e() {
        return this.e;
    }
}

