/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ap
extends ic {
    public ap() {
    }

    public ap(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 1, 1, 2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        cgd cgd2 = this.k.b[bqk.c.b()];
        cgd cgd3 = this.k;
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 0, 8, cgd2.c[bqk.a.b()]);
            this.a(iu2, awx2, 0, 0, cgd3.c[bqk.a.b()]);
        }
        if (cgd3.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 4, 1, 6, 4, 7, a);
        }
        if (cgd2.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 4, 8, 6, 4, 14, a);
        }
        this.a(iu2, awx2, 0, 3, 0, 0, 3, 15, b, b, false);
        this.a(iu2, awx2, 7, 3, 0, 7, 3, 15, b, b, false);
        this.a(iu2, awx2, 1, 3, 0, 7, 3, 0, b, b, false);
        this.a(iu2, awx2, 1, 3, 15, 6, 3, 15, b, b, false);
        this.a(iu2, awx2, 0, 2, 0, 0, 2, 15, a, a, false);
        this.a(iu2, awx2, 7, 2, 0, 7, 2, 15, a, a, false);
        this.a(iu2, awx2, 1, 2, 0, 7, 2, 0, a, a, false);
        this.a(iu2, awx2, 1, 2, 15, 6, 2, 15, a, a, false);
        this.a(iu2, awx2, 0, 1, 0, 0, 1, 15, b, b, false);
        this.a(iu2, awx2, 7, 1, 0, 7, 1, 15, b, b, false);
        this.a(iu2, awx2, 1, 1, 0, 7, 1, 0, b, b, false);
        this.a(iu2, awx2, 1, 1, 15, 6, 1, 15, b, b, false);
        this.a(iu2, awx2, 1, 1, 1, 1, 1, 2, b, b, false);
        this.a(iu2, awx2, 6, 1, 1, 6, 1, 2, b, b, false);
        this.a(iu2, awx2, 1, 3, 1, 1, 3, 2, b, b, false);
        this.a(iu2, awx2, 6, 3, 1, 6, 3, 2, b, b, false);
        this.a(iu2, awx2, 1, 1, 13, 1, 1, 14, b, b, false);
        this.a(iu2, awx2, 6, 1, 13, 6, 1, 14, b, b, false);
        this.a(iu2, awx2, 1, 3, 13, 1, 3, 14, b, b, false);
        this.a(iu2, awx2, 6, 3, 13, 6, 3, 14, b, b, false);
        this.a(iu2, awx2, 2, 1, 6, 2, 3, 6, b, b, false);
        this.a(iu2, awx2, 5, 1, 6, 5, 3, 6, b, b, false);
        this.a(iu2, awx2, 2, 1, 9, 2, 3, 9, b, b, false);
        this.a(iu2, awx2, 5, 1, 9, 5, 3, 9, b, b, false);
        this.a(iu2, awx2, 3, 2, 6, 4, 2, 6, b, b, false);
        this.a(iu2, awx2, 3, 2, 9, 4, 2, 9, b, b, false);
        this.a(iu2, awx2, 2, 2, 7, 2, 2, 8, b, b, false);
        this.a(iu2, awx2, 5, 2, 7, 5, 2, 8, b, b, false);
        this.a(iu2, e, 2, 2, 5, awx2);
        this.a(iu2, e, 5, 2, 5, awx2);
        this.a(iu2, e, 2, 2, 10, awx2);
        this.a(iu2, e, 5, 2, 10, awx2);
        this.a(iu2, b, 2, 3, 5, awx2);
        this.a(iu2, b, 5, 3, 5, awx2);
        this.a(iu2, b, 2, 3, 10, awx2);
        this.a(iu2, b, 5, 3, 10, awx2);
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
        return true;
    }
}

