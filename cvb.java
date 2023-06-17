/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cvb
extends ic {
    public cvb() {
    }

    public cvb(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 1, 2, 1);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 0, 0, this.k.c[bqk.a.b()]);
        }
        cgd cgd2 = this.k.b[bqk.b.b()];
        if (cgd2.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 8, 1, 6, 8, 6, a);
        }
        this.a(iu2, awx2, 0, 4, 0, 0, 4, 7, b, b, false);
        this.a(iu2, awx2, 7, 4, 0, 7, 4, 7, b, b, false);
        this.a(iu2, awx2, 1, 4, 0, 6, 4, 0, b, b, false);
        this.a(iu2, awx2, 1, 4, 7, 6, 4, 7, b, b, false);
        this.a(iu2, awx2, 2, 4, 1, 2, 4, 2, b, b, false);
        this.a(iu2, awx2, 1, 4, 2, 1, 4, 2, b, b, false);
        this.a(iu2, awx2, 5, 4, 1, 5, 4, 2, b, b, false);
        this.a(iu2, awx2, 6, 4, 2, 6, 4, 2, b, b, false);
        this.a(iu2, awx2, 2, 4, 5, 2, 4, 6, b, b, false);
        this.a(iu2, awx2, 1, 4, 5, 1, 4, 5, b, b, false);
        this.a(iu2, awx2, 5, 4, 5, 5, 4, 6, b, b, false);
        this.a(iu2, awx2, 6, 4, 5, 6, 4, 5, b, b, false);
        cgd cgd3 = this.k;
        for (int i2 = 1; i2 <= 5; i2 += 4) {
            int n2 = 0;
            if (cgd3.c[bqk.d.b()]) {
                this.a(iu2, awx2, 2, i2, n2, 2, i2 + 2, n2, b, b, false);
                this.a(iu2, awx2, 5, i2, n2, 5, i2 + 2, n2, b, b, false);
                this.a(iu2, awx2, 3, i2 + 2, n2, 4, i2 + 2, n2, b, b, false);
            } else {
                this.a(iu2, awx2, 0, i2, n2, 7, i2 + 2, n2, b, b, false);
                this.a(iu2, awx2, 0, i2 + 1, n2, 7, i2 + 1, n2, a, a, false);
            }
            n2 = 7;
            if (cgd3.c[bqk.c.b()]) {
                this.a(iu2, awx2, 2, i2, n2, 2, i2 + 2, n2, b, b, false);
                this.a(iu2, awx2, 5, i2, n2, 5, i2 + 2, n2, b, b, false);
                this.a(iu2, awx2, 3, i2 + 2, n2, 4, i2 + 2, n2, b, b, false);
            } else {
                this.a(iu2, awx2, 0, i2, n2, 7, i2 + 2, n2, b, b, false);
                this.a(iu2, awx2, 0, i2 + 1, n2, 7, i2 + 1, n2, a, a, false);
            }
            int n3 = 0;
            if (cgd3.c[bqk.e.b()]) {
                this.a(iu2, awx2, n3, i2, 2, n3, i2 + 2, 2, b, b, false);
                this.a(iu2, awx2, n3, i2, 5, n3, i2 + 2, 5, b, b, false);
                this.a(iu2, awx2, n3, i2 + 2, 3, n3, i2 + 2, 4, b, b, false);
            } else {
                this.a(iu2, awx2, n3, i2, 0, n3, i2 + 2, 7, b, b, false);
                this.a(iu2, awx2, n3, i2 + 1, 0, n3, i2 + 1, 7, a, a, false);
            }
            n3 = 7;
            if (cgd3.c[bqk.f.b()]) {
                this.a(iu2, awx2, n3, i2, 2, n3, i2 + 2, 2, b, b, false);
                this.a(iu2, awx2, n3, i2, 5, n3, i2 + 2, 5, b, b, false);
                this.a(iu2, awx2, n3, i2 + 2, 3, n3, i2 + 2, 4, b, b, false);
            } else {
                this.a(iu2, awx2, n3, i2, 0, n3, i2 + 2, 7, b, b, false);
                this.a(iu2, awx2, n3, i2 + 1, 0, n3, i2 + 1, 7, a, a, false);
            }
            cgd3 = cgd2;
        }
        return true;
    }
}

