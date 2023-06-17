/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dq
extends ic {
    public dq() {
    }

    public dq(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 2, 2, 2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 1, 8, 0, 14, 8, 14, a);
        int n2 = 7;
        dbk dbk2 = b;
        this.a(iu2, awx2, 0, 7, 0, 0, 7, 15, dbk2, dbk2, false);
        this.a(iu2, awx2, 15, 7, 0, 15, 7, 15, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 7, 0, 15, 7, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 7, 15, 14, 7, 15, dbk2, dbk2, false);
        for (n2 = 1; n2 <= 6; ++n2) {
            dbk2 = b;
            if (n2 == 2 || n2 == 6) {
                dbk2 = a;
            }
            for (int i2 = 0; i2 <= 15; i2 += 15) {
                this.a(iu2, awx2, i2, n2, 0, i2, n2, 1, dbk2, dbk2, false);
                this.a(iu2, awx2, i2, n2, 6, i2, n2, 9, dbk2, dbk2, false);
                this.a(iu2, awx2, i2, n2, 14, i2, n2, 15, dbk2, dbk2, false);
            }
            this.a(iu2, awx2, 1, n2, 0, 1, n2, 0, dbk2, dbk2, false);
            this.a(iu2, awx2, 6, n2, 0, 9, n2, 0, dbk2, dbk2, false);
            this.a(iu2, awx2, 14, n2, 0, 14, n2, 0, dbk2, dbk2, false);
            this.a(iu2, awx2, 1, n2, 15, 14, n2, 15, dbk2, dbk2, false);
        }
        this.a(iu2, awx2, 6, 3, 6, 9, 6, 9, c, c, false);
        this.a(iu2, awx2, 7, 4, 7, 8, 5, 8, blg.R.s(), blg.R.s(), false);
        for (n2 = 3; n2 <= 6; n2 += 3) {
            for (int i3 = 6; i3 <= 9; i3 += 3) {
                this.a(iu2, e, i3, n2, 6, awx2);
                this.a(iu2, e, i3, n2, 9, awx2);
            }
        }
        this.a(iu2, awx2, 5, 1, 6, 5, 2, 6, b, b, false);
        this.a(iu2, awx2, 5, 1, 9, 5, 2, 9, b, b, false);
        this.a(iu2, awx2, 10, 1, 6, 10, 2, 6, b, b, false);
        this.a(iu2, awx2, 10, 1, 9, 10, 2, 9, b, b, false);
        this.a(iu2, awx2, 6, 1, 5, 6, 2, 5, b, b, false);
        this.a(iu2, awx2, 9, 1, 5, 9, 2, 5, b, b, false);
        this.a(iu2, awx2, 6, 1, 10, 6, 2, 10, b, b, false);
        this.a(iu2, awx2, 9, 1, 10, 9, 2, 10, b, b, false);
        this.a(iu2, awx2, 5, 2, 5, 5, 6, 5, b, b, false);
        this.a(iu2, awx2, 5, 2, 10, 5, 6, 10, b, b, false);
        this.a(iu2, awx2, 10, 2, 5, 10, 6, 5, b, b, false);
        this.a(iu2, awx2, 10, 2, 10, 10, 6, 10, b, b, false);
        this.a(iu2, awx2, 5, 7, 1, 5, 7, 6, b, b, false);
        this.a(iu2, awx2, 10, 7, 1, 10, 7, 6, b, b, false);
        this.a(iu2, awx2, 5, 7, 9, 5, 7, 14, b, b, false);
        this.a(iu2, awx2, 10, 7, 9, 10, 7, 14, b, b, false);
        this.a(iu2, awx2, 1, 7, 5, 6, 7, 5, b, b, false);
        this.a(iu2, awx2, 1, 7, 10, 6, 7, 10, b, b, false);
        this.a(iu2, awx2, 9, 7, 5, 14, 7, 5, b, b, false);
        this.a(iu2, awx2, 9, 7, 10, 14, 7, 10, b, b, false);
        this.a(iu2, awx2, 2, 1, 2, 2, 1, 3, b, b, false);
        this.a(iu2, awx2, 3, 1, 2, 3, 1, 2, b, b, false);
        this.a(iu2, awx2, 13, 1, 2, 13, 1, 3, b, b, false);
        this.a(iu2, awx2, 12, 1, 2, 12, 1, 2, b, b, false);
        this.a(iu2, awx2, 2, 1, 12, 2, 1, 13, b, b, false);
        this.a(iu2, awx2, 3, 1, 13, 3, 1, 13, b, b, false);
        this.a(iu2, awx2, 13, 1, 12, 13, 1, 13, b, b, false);
        this.a(iu2, awx2, 12, 1, 13, 12, 1, 13, b, b, false);
        return true;
    }
}

