/*
 * Decompiled with CFR 0.150.
 */
public class bre {
    protected final fr a;
    protected final iu b;
    protected int c;
    protected int d;
    protected int e;
    public adr[] f;

    public bre(iu iu2, int n2, fr fr2, akt akt2) {
        this.a = fr2;
        this.b = iu2;
        this.a(n2);
        this.a(akt2);
    }

    protected void a(akt akt2) {
        int n2 = this.d * this.c * this.e;
        this.f = new adr[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < this.d; ++i2) {
            for (int i3 = 0; i3 < this.c; ++i3) {
                for (int i4 = 0; i4 < this.e; ++i4) {
                    int n4 = (i4 * this.c + i3) * this.d + i2;
                    this.f[n4] = akt2.a(this.b, this.a, n3++);
                    this.f[n4].a(i2 * 16, i3 * 16, i4 * 16);
                }
            }
        }
    }

    public void a() {
        for (adr adr2 : this.f) {
            adr2.i();
        }
    }

    protected void a(int n2) {
        int n3;
        this.d = n3 = n2 * 2 + 1;
        this.c = 16;
        this.e = n3;
    }

    public void a(double d2, double d3) {
        int n2 = cmk.c(d2) - 8;
        int n3 = cmk.c(d3) - 8;
        int n4 = this.d * 16;
        for (int i2 = 0; i2 < this.d; ++i2) {
            int n5 = this.a(n2, n4, i2);
            for (int i3 = 0; i3 < this.e; ++i3) {
                int n6 = this.a(n3, n4, i3);
                for (int i4 = 0; i4 < this.c; ++i4) {
                    int n7 = i4 * 16;
                    adr adr2 = this.f[(i3 * this.c + i4) * this.d + i2];
                    adr2.a(n5, n7, n6);
                }
            }
        }
    }

    private int a(int n2, int n3, int n4) {
        int n5 = n4 * 16;
        int n6 = n5 - n2 + n3 / 2;
        if (n6 < 0) {
            n6 -= n3 - 1;
        }
        return n5 - n6 / n3 * n3;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        int n8 = cmk.a(n2, 16);
        int n9 = cmk.a(n3, 16);
        int n10 = cmk.a(n4, 16);
        int n11 = cmk.a(n5, 16);
        int n12 = cmk.a(n6, 16);
        int n13 = cmk.a(n7, 16);
        for (int i2 = n8; i2 <= n11; ++i2) {
            int n14 = i2 % this.d;
            if (n14 < 0) {
                n14 += this.d;
            }
            for (int i3 = n9; i3 <= n12; ++i3) {
                int n15 = i3 % this.c;
                if (n15 < 0) {
                    n15 += this.c;
                }
                for (int i4 = n10; i4 <= n13; ++i4) {
                    int n16 = i4 % this.e;
                    if (n16 < 0) {
                        n16 += this.e;
                    }
                    int n17 = (n16 * this.c + n15) * this.d + n14;
                    adr adr2 = this.f[n17];
                    adr2.a(bl2);
                }
            }
        }
    }

    protected adr a(cmz cmz2) {
        int n2 = cmk.a(cmz2.a(), 16);
        int n3 = cmk.a(cmz2.b(), 16);
        int n4 = cmk.a(cmz2.c(), 16);
        if (n3 < 0 || n3 >= this.c) {
            return null;
        }
        if ((n2 %= this.d) < 0) {
            n2 += this.d;
        }
        if ((n4 %= this.e) < 0) {
            n4 += this.e;
        }
        int n5 = (n4 * this.c + n3) * this.d + n2;
        return this.f[n5];
    }
}

