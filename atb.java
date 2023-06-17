/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class atb
extends ic {
    private int n;

    public atb() {
    }

    public atb(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 1, 1, 1);
        this.n = random.nextInt(3);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        boolean bl2;
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 0, 0, this.k.c[bqk.a.b()]);
        }
        if (this.k.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 4, 1, 6, 4, 6, a);
        }
        boolean bl3 = bl2 = this.n != 0 && random.nextBoolean() && !this.k.c[bqk.a.b()] && !this.k.c[bqk.b.b()] && this.k.c() > 1;
        if (this.n == 0) {
            this.a(iu2, awx2, 0, 1, 0, 2, 1, 2, b, b, false);
            this.a(iu2, awx2, 0, 3, 0, 2, 3, 2, b, b, false);
            this.a(iu2, awx2, 0, 2, 0, 0, 2, 2, a, a, false);
            this.a(iu2, awx2, 1, 2, 0, 2, 2, 0, a, a, false);
            this.a(iu2, e, 1, 2, 1, awx2);
            this.a(iu2, awx2, 5, 1, 0, 7, 1, 2, b, b, false);
            this.a(iu2, awx2, 5, 3, 0, 7, 3, 2, b, b, false);
            this.a(iu2, awx2, 7, 2, 0, 7, 2, 2, a, a, false);
            this.a(iu2, awx2, 5, 2, 0, 6, 2, 0, a, a, false);
            this.a(iu2, e, 6, 2, 1, awx2);
            this.a(iu2, awx2, 0, 1, 5, 2, 1, 7, b, b, false);
            this.a(iu2, awx2, 0, 3, 5, 2, 3, 7, b, b, false);
            this.a(iu2, awx2, 0, 2, 5, 0, 2, 7, a, a, false);
            this.a(iu2, awx2, 1, 2, 7, 2, 2, 7, a, a, false);
            this.a(iu2, e, 1, 2, 6, awx2);
            this.a(iu2, awx2, 5, 1, 5, 7, 1, 7, b, b, false);
            this.a(iu2, awx2, 5, 3, 5, 7, 3, 7, b, b, false);
            this.a(iu2, awx2, 7, 2, 5, 7, 2, 7, a, a, false);
            this.a(iu2, awx2, 5, 2, 7, 6, 2, 7, a, a, false);
            this.a(iu2, e, 6, 2, 6, awx2);
            if (this.k.c[bqk.d.b()]) {
                this.a(iu2, awx2, 3, 3, 0, 4, 3, 0, b, b, false);
            } else {
                this.a(iu2, awx2, 3, 3, 0, 4, 3, 1, b, b, false);
                this.a(iu2, awx2, 3, 2, 0, 4, 2, 0, a, a, false);
                this.a(iu2, awx2, 3, 1, 0, 4, 1, 1, b, b, false);
            }
            if (this.k.c[bqk.c.b()]) {
                this.a(iu2, awx2, 3, 3, 7, 4, 3, 7, b, b, false);
            } else {
                this.a(iu2, awx2, 3, 3, 6, 4, 3, 7, b, b, false);
                this.a(iu2, awx2, 3, 2, 7, 4, 2, 7, a, a, false);
                this.a(iu2, awx2, 3, 1, 6, 4, 1, 7, b, b, false);
            }
            if (this.k.c[bqk.e.b()]) {
                this.a(iu2, awx2, 0, 3, 3, 0, 3, 4, b, b, false);
            } else {
                this.a(iu2, awx2, 0, 3, 3, 1, 3, 4, b, b, false);
                this.a(iu2, awx2, 0, 2, 3, 0, 2, 4, a, a, false);
                this.a(iu2, awx2, 0, 1, 3, 1, 1, 4, b, b, false);
            }
            if (this.k.c[bqk.f.b()]) {
                this.a(iu2, awx2, 7, 3, 3, 7, 3, 4, b, b, false);
            } else {
                this.a(iu2, awx2, 6, 3, 3, 7, 3, 4, b, b, false);
                this.a(iu2, awx2, 7, 2, 3, 7, 2, 4, a, a, false);
                this.a(iu2, awx2, 6, 1, 3, 7, 1, 4, b, b, false);
            }
        } else if (this.n == 1) {
            this.a(iu2, awx2, 2, 1, 2, 2, 3, 2, b, b, false);
            this.a(iu2, awx2, 2, 1, 5, 2, 3, 5, b, b, false);
            this.a(iu2, awx2, 5, 1, 5, 5, 3, 5, b, b, false);
            this.a(iu2, awx2, 5, 1, 2, 5, 3, 2, b, b, false);
            this.a(iu2, e, 2, 2, 2, awx2);
            this.a(iu2, e, 2, 2, 5, awx2);
            this.a(iu2, e, 5, 2, 5, awx2);
            this.a(iu2, e, 5, 2, 2, awx2);
            this.a(iu2, awx2, 0, 1, 0, 1, 3, 0, b, b, false);
            this.a(iu2, awx2, 0, 1, 1, 0, 3, 1, b, b, false);
            this.a(iu2, awx2, 0, 1, 7, 1, 3, 7, b, b, false);
            this.a(iu2, awx2, 0, 1, 6, 0, 3, 6, b, b, false);
            this.a(iu2, awx2, 6, 1, 7, 7, 3, 7, b, b, false);
            this.a(iu2, awx2, 7, 1, 6, 7, 3, 6, b, b, false);
            this.a(iu2, awx2, 6, 1, 0, 7, 3, 0, b, b, false);
            this.a(iu2, awx2, 7, 1, 1, 7, 3, 1, b, b, false);
            this.a(iu2, a, 1, 2, 0, awx2);
            this.a(iu2, a, 0, 2, 1, awx2);
            this.a(iu2, a, 1, 2, 7, awx2);
            this.a(iu2, a, 0, 2, 6, awx2);
            this.a(iu2, a, 6, 2, 7, awx2);
            this.a(iu2, a, 7, 2, 6, awx2);
            this.a(iu2, a, 6, 2, 0, awx2);
            this.a(iu2, a, 7, 2, 1, awx2);
            if (!this.k.c[bqk.d.b()]) {
                this.a(iu2, awx2, 1, 3, 0, 6, 3, 0, b, b, false);
                this.a(iu2, awx2, 1, 2, 0, 6, 2, 0, a, a, false);
                this.a(iu2, awx2, 1, 1, 0, 6, 1, 0, b, b, false);
            }
            if (!this.k.c[bqk.c.b()]) {
                this.a(iu2, awx2, 1, 3, 7, 6, 3, 7, b, b, false);
                this.a(iu2, awx2, 1, 2, 7, 6, 2, 7, a, a, false);
                this.a(iu2, awx2, 1, 1, 7, 6, 1, 7, b, b, false);
            }
            if (!this.k.c[bqk.e.b()]) {
                this.a(iu2, awx2, 0, 3, 1, 0, 3, 6, b, b, false);
                this.a(iu2, awx2, 0, 2, 1, 0, 2, 6, a, a, false);
                this.a(iu2, awx2, 0, 1, 1, 0, 1, 6, b, b, false);
            }
            if (!this.k.c[bqk.f.b()]) {
                this.a(iu2, awx2, 7, 3, 1, 7, 3, 6, b, b, false);
                this.a(iu2, awx2, 7, 2, 1, 7, 2, 6, a, a, false);
                this.a(iu2, awx2, 7, 1, 1, 7, 1, 6, b, b, false);
            }
        } else if (this.n == 2) {
            this.a(iu2, awx2, 0, 1, 0, 0, 1, 7, b, b, false);
            this.a(iu2, awx2, 7, 1, 0, 7, 1, 7, b, b, false);
            this.a(iu2, awx2, 1, 1, 0, 6, 1, 0, b, b, false);
            this.a(iu2, awx2, 1, 1, 7, 6, 1, 7, b, b, false);
            this.a(iu2, awx2, 0, 2, 0, 0, 2, 7, c, c, false);
            this.a(iu2, awx2, 7, 2, 0, 7, 2, 7, c, c, false);
            this.a(iu2, awx2, 1, 2, 0, 6, 2, 0, c, c, false);
            this.a(iu2, awx2, 1, 2, 7, 6, 2, 7, c, c, false);
            this.a(iu2, awx2, 0, 3, 0, 0, 3, 7, b, b, false);
            this.a(iu2, awx2, 7, 3, 0, 7, 3, 7, b, b, false);
            this.a(iu2, awx2, 1, 3, 0, 6, 3, 0, b, b, false);
            this.a(iu2, awx2, 1, 3, 7, 6, 3, 7, b, b, false);
            this.a(iu2, awx2, 0, 1, 3, 0, 2, 4, c, c, false);
            this.a(iu2, awx2, 7, 1, 3, 7, 2, 4, c, c, false);
            this.a(iu2, awx2, 3, 1, 0, 4, 2, 0, c, c, false);
            this.a(iu2, awx2, 3, 1, 7, 4, 2, 7, c, c, false);
            if (this.k.c[bqk.d.b()]) {
                this.a(iu2, awx2, 3, 1, 0, 4, 2, 0, false);
            }
            if (this.k.c[bqk.c.b()]) {
                this.a(iu2, awx2, 3, 1, 7, 4, 2, 7, false);
            }
            if (this.k.c[bqk.e.b()]) {
                this.a(iu2, awx2, 0, 1, 3, 0, 2, 4, false);
            }
            if (this.k.c[bqk.f.b()]) {
                this.a(iu2, awx2, 7, 1, 3, 7, 2, 4, false);
            }
        }
        if (bl2) {
            this.a(iu2, awx2, 3, 1, 3, 4, 1, 4, b, b, false);
            this.a(iu2, awx2, 3, 2, 3, 4, 2, 4, a, a, false);
            this.a(iu2, awx2, 3, 3, 3, 4, 3, 4, b, b, false);
        }
        return true;
    }
}

