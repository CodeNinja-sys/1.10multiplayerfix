/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class bdk {
    double a;
    double b;

    bdk() {
    }

    bdk(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    double a(bdk bdk2) {
        double d2 = this.a - bdk2.a;
        double d3 = this.b - bdk2.b;
        return Math.sqrt(d2 * d2 + d3 * d3);
    }

    void a() {
        double d2 = this.b();
        this.a /= d2;
        this.b /= d2;
    }

    float b() {
        return cmk.a(this.a * this.a + this.b * this.b);
    }

    public void b(bdk bdk2) {
        this.a -= bdk2.a;
        this.b -= bdk2.b;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        boolean bl2 = false;
        if (this.a < d2) {
            this.a = d2;
            bl2 = true;
        } else if (this.a > d4) {
            this.a = d4;
            bl2 = true;
        }
        if (this.b < d3) {
            this.b = d3;
            bl2 = true;
        } else if (this.b > d5) {
            this.b = d5;
            bl2 = true;
        }
        return bl2;
    }

    public int a(iu iu2) {
        cmz cmz2 = new cmz(this.a, 256.0, this.b);
        while (cmz2.b() > 0) {
            if (iu2.n(cmz2 = cmz2.h()).a() == ahk.a) continue;
            return cmz2.b() + 1;
        }
        return 257;
    }

    public boolean b(iu iu2) {
        cmz cmz2 = new cmz(this.a, 256.0, this.b);
        while (cmz2.b() > 0) {
            ahk ahk2 = iu2.n(cmz2 = cmz2.h()).a();
            if (ahk2 == ahk.a) continue;
            return !ahk2.d() && ahk2 != ahk.o;
        }
        return false;
    }

    public void a(Random random, double d2, double d3, double d4, double d5) {
        this.a = cmk.a(random, d2, d4);
        this.b = cmk.a(random, d3, d5);
    }
}

