/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cog
extends ic {
    public cog() {
    }

    public cog(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 1, 2, 2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        dbk dbk2;
        int n2;
        cgd cgd2 = this.k.b[bqk.c.b()];
        cgd cgd3 = this.k;
        cgd cgd4 = cgd2.b[bqk.b.b()];
        cgd cgd5 = cgd3.b[bqk.b.b()];
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 0, 8, cgd2.c[bqk.a.b()]);
            this.a(iu2, awx2, 0, 0, cgd3.c[bqk.a.b()]);
        }
        if (cgd5.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 8, 1, 6, 8, 7, a);
        }
        if (cgd4.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 8, 8, 6, 8, 14, a);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            dbk2 = b;
            if (n2 == 2 || n2 == 6) {
                dbk2 = a;
            }
            this.a(iu2, awx2, 0, n2, 0, 0, n2, 15, dbk2, dbk2, false);
            this.a(iu2, awx2, 7, n2, 0, 7, n2, 15, dbk2, dbk2, false);
            this.a(iu2, awx2, 1, n2, 0, 6, n2, 0, dbk2, dbk2, false);
            this.a(iu2, awx2, 1, n2, 15, 6, n2, 15, dbk2, dbk2, false);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            dbk2 = c;
            if (n2 == 2 || n2 == 6) {
                dbk2 = e;
            }
            this.a(iu2, awx2, 3, n2, 7, 4, n2, 8, dbk2, dbk2, false);
        }
        if (cgd3.c[bqk.d.b()]) {
            this.a(iu2, awx2, 3, 1, 0, 4, 2, 0, false);
        }
        if (cgd3.c[bqk.f.b()]) {
            this.a(iu2, awx2, 7, 1, 3, 7, 2, 4, false);
        }
        if (cgd3.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 1, 3, 0, 2, 4, false);
        }
        if (cgd2.c[bqk.c.b()]) {
            this.a(iu2, awx2, 3, 1, 15, 4, 2, 15, false);
        }
        if (cgd2.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 1, 11, 0, 2, 12, false);
        }
        if (cgd2.c[bqk.f.b()]) {
            this.a(iu2, awx2, 7, 1, 11, 7, 2, 12, false);
        }
        if (cgd5.c[bqk.d.b()]) {
            this.a(iu2, awx2, 3, 5, 0, 4, 6, 0, false);
        }
        if (cgd5.c[bqk.f.b()]) {
            this.a(iu2, awx2, 7, 5, 3, 7, 6, 4, false);
            this.a(iu2, awx2, 5, 4, 2, 6, 4, 5, b, b, false);
            this.a(iu2, awx2, 6, 1, 2, 6, 3, 2, b, b, false);
            this.a(iu2, awx2, 6, 1, 5, 6, 3, 5, b, b, false);
        }
        if (cgd5.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 5, 3, 0, 6, 4, false);
            this.a(iu2, awx2, 1, 4, 2, 2, 4, 5, b, b, false);
            this.a(iu2, awx2, 1, 1, 2, 1, 3, 2, b, b, false);
            this.a(iu2, awx2, 1, 1, 5, 1, 3, 5, b, b, false);
        }
        if (cgd4.c[bqk.c.b()]) {
            this.a(iu2, awx2, 3, 5, 15, 4, 6, 15, false);
        }
        if (cgd4.c[bqk.e.b()]) {
            this.a(iu2, awx2, 0, 5, 11, 0, 6, 12, false);
            this.a(iu2, awx2, 1, 4, 10, 2, 4, 13, b, b, false);
            this.a(iu2, awx2, 1, 1, 10, 1, 3, 10, b, b, false);
            this.a(iu2, awx2, 1, 1, 13, 1, 3, 13, b, b, false);
        }
        if (cgd4.c[bqk.f.b()]) {
            this.a(iu2, awx2, 7, 5, 11, 7, 6, 12, false);
            this.a(iu2, awx2, 5, 4, 10, 6, 4, 13, b, b, false);
            this.a(iu2, awx2, 6, 1, 10, 6, 3, 10, b, b, false);
            this.a(iu2, awx2, 6, 1, 13, 6, 3, 13, b, b, false);
        }
        return true;
    }
}

