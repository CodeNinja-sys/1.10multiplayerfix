/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bnd
extends ic {
    public bnd() {
    }

    public bnd(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 2, 2, 1);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        cgd cgd2 = this.k.b[bqk.f.b()];
        cgd cgd3 = this.k;
        cgd cgd4 = cgd3.b[bqk.b.b()];
        cgd cgd5 = cgd2.b[bqk.b.b()];
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 8, 0, cgd2.c[bqk.a.b()]);
            this.a(iu2, awx2, 0, 0, cgd3.c[bqk.a.b()]);
        }
        if (cgd4.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 8, 1, 7, 8, 6, a);
        }
        if (cgd5.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 8, 8, 1, 14, 8, 6, a);
        }
        for (int i2 = 1; i2 <= 7; ++i2) {
            dbk dbk2 = b;
            if (i2 == 2 || i2 == 6) {
                dbk2 = a;
            }
            this.a(iu2, awx2, 0, i2, 0, 0, i2, 7, dbk2, dbk2, false);
            this.a(iu2, awx2, 15, i2, 0, 15, i2, 7, dbk2, dbk2, false);
            this.a(iu2, awx2, 1, i2, 0, 15, i2, 0, dbk2, dbk2, false);
            this.a(iu2, awx2, 1, i2, 7, 14, i2, 7, dbk2, dbk2, false);
        }
        this.a(iu2, awx2, 2, 1, 3, 2, 7, 4, b, b, false);
        this.a(iu2, awx2, 3, 1, 2, 4, 7, 2, b, b, false);
        this.a(iu2, awx2, 3, 1, 5, 4, 7, 5, b, b, false);
        this.a(iu2, awx2, 13, 1, 3, 13, 7, 4, b, b, false);
        this.a(iu2, awx2, 11, 1, 2, 12, 7, 2, b, b, false);
        this.a(iu2, awx2, 11, 1, 5, 12, 7, 5, b, b, false);
        this.a(iu2, awx2, 5, 1, 3, 5, 3, 4, b, b, false);
        this.a(iu2, awx2, 10, 1, 3, 10, 3, 4, b, b, false);
        this.a(iu2, awx2, 5, 7, 2, 10, 7, 5, b, b, false);
        this.a(iu2, awx2, 5, 5, 2, 5, 7, 2, b, b, false);
        this.a(iu2, awx2, 10, 5, 2, 10, 7, 2, b, b, false);
        this.a(iu2, awx2, 5, 5, 5, 5, 7, 5, b, b, false);
        this.a(iu2, awx2, 10, 5, 5, 10, 7, 5, b, b, false);
        this.a(iu2, b, 6, 6, 2, awx2);
        this.a(iu2, b, 9, 6, 2, awx2);
        this.a(iu2, b, 6, 6, 5, awx2);
        this.a(iu2, b, 9, 6, 5, awx2);
        this.a(iu2, awx2, 5, 4, 3, 6, 4, 4, b, b, false);
        this.a(iu2, awx2, 9, 4, 3, 10, 4, 4, b, b, false);
        this.a(iu2, e, 5, 4, 2, awx2);
        this.a(iu2, e, 5, 4, 5, awx2);
        this.a(iu2, e, 10, 4, 2, awx2);
        this.a(iu2, e, 10, 4, 5, awx2);
        if (cgd3.c[bqk.d.b()]) {
            this.a(iu2, awx2, 3, 1, 0, 4, 2, 0, false);
        }
        if (cgd3.c[bqk.c.b()]) {
            this.a(iu2, awx2, 3, 1, 7, 4, 2, 7, false);
        }
        if (cgd3.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 1, 3, 0, 2, 4, false);
        }
        if (cgd2.c[bqk.d.b()]) {
            this.a(iu2, awx2, 11, 1, 0, 12, 2, 0, false);
        }
        if (cgd2.c[bqk.c.b()]) {
            this.a(iu2, awx2, 11, 1, 7, 12, 2, 7, false);
        }
        if (cgd2.c[bqk.f.b()]) {
            this.a(iu2, awx2, 15, 1, 3, 15, 2, 4, false);
        }
        if (cgd4.c[bqk.d.b()]) {
            this.a(iu2, awx2, 3, 5, 0, 4, 6, 0, false);
        }
        if (cgd4.c[bqk.c.b()]) {
            this.a(iu2, awx2, 3, 5, 7, 4, 6, 7, false);
        }
        if (cgd4.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 5, 3, 0, 6, 4, false);
        }
        if (cgd5.c[bqk.d.b()]) {
            this.a(iu2, awx2, 11, 5, 0, 12, 6, 0, false);
        }
        if (cgd5.c[bqk.c.b()]) {
            this.a(iu2, awx2, 11, 5, 7, 12, 6, 7, false);
        }
        if (cgd5.c[bqk.f.b()]) {
            this.a(iu2, awx2, 15, 5, 3, 15, 6, 4, false);
        }
        return true;
    }
}

