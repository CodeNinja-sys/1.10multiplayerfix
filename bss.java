/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bss
extends ic {
    public bss() {
    }

    public bss(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 2, 1, 1);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        cgd cgd2 = this.k.b[bqk.f.b()];
        cgd cgd3 = this.k;
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 8, 0, cgd2.c[bqk.a.b()]);
            this.a(iu2, awx2, 0, 0, cgd3.c[bqk.a.b()]);
        }
        if (cgd3.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 4, 1, 7, 4, 6, a);
        }
        if (cgd2.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 8, 4, 1, 14, 4, 6, a);
        }
        this.a(iu2, awx2, 0, 3, 0, 0, 3, 7, b, b, false);
        this.a(iu2, awx2, 15, 3, 0, 15, 3, 7, b, b, false);
        this.a(iu2, awx2, 1, 3, 0, 15, 3, 0, b, b, false);
        this.a(iu2, awx2, 1, 3, 7, 14, 3, 7, b, b, false);
        this.a(iu2, awx2, 0, 2, 0, 0, 2, 7, a, a, false);
        this.a(iu2, awx2, 15, 2, 0, 15, 2, 7, a, a, false);
        this.a(iu2, awx2, 1, 2, 0, 15, 2, 0, a, a, false);
        this.a(iu2, awx2, 1, 2, 7, 14, 2, 7, a, a, false);
        this.a(iu2, awx2, 0, 1, 0, 0, 1, 7, b, b, false);
        this.a(iu2, awx2, 15, 1, 0, 15, 1, 7, b, b, false);
        this.a(iu2, awx2, 1, 1, 0, 15, 1, 0, b, b, false);
        this.a(iu2, awx2, 1, 1, 7, 14, 1, 7, b, b, false);
        this.a(iu2, awx2, 5, 1, 0, 10, 1, 4, b, b, false);
        this.a(iu2, awx2, 6, 2, 0, 9, 2, 3, a, a, false);
        this.a(iu2, awx2, 5, 3, 0, 10, 3, 4, b, b, false);
        this.a(iu2, e, 6, 2, 3, awx2);
        this.a(iu2, e, 9, 2, 3, awx2);
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
        return true;
    }
}

