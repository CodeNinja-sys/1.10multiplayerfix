/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aia
extends ic {
    private int n;

    public aia() {
    }

    public aia(bqk bqk2, awx awx2, int n2) {
        super(bqk2, awx2);
        this.n = n2 & 1;
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.n == 0) {
            int n2;
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, 10 - n2, 3 - n2, 20 - n2, 12 + n2, 3 - n2, 20, b, b, false);
            }
            this.a(iu2, awx2, 7, 0, 6, 15, 0, 16, b, b, false);
            this.a(iu2, awx2, 6, 0, 6, 6, 3, 20, b, b, false);
            this.a(iu2, awx2, 16, 0, 6, 16, 3, 20, b, b, false);
            this.a(iu2, awx2, 7, 1, 7, 7, 1, 20, b, b, false);
            this.a(iu2, awx2, 15, 1, 7, 15, 1, 20, b, b, false);
            this.a(iu2, awx2, 7, 1, 6, 9, 3, 6, b, b, false);
            this.a(iu2, awx2, 13, 1, 6, 15, 3, 6, b, b, false);
            this.a(iu2, awx2, 8, 1, 7, 9, 1, 7, b, b, false);
            this.a(iu2, awx2, 13, 1, 7, 14, 1, 7, b, b, false);
            this.a(iu2, awx2, 9, 0, 5, 13, 0, 5, b, b, false);
            this.a(iu2, awx2, 10, 0, 7, 12, 0, 7, c, c, false);
            this.a(iu2, awx2, 8, 0, 10, 8, 0, 12, c, c, false);
            this.a(iu2, awx2, 14, 0, 10, 14, 0, 12, c, c, false);
            for (n2 = 18; n2 >= 7; n2 -= 3) {
                this.a(iu2, e, 6, 3, n2, awx2);
                this.a(iu2, e, 16, 3, n2, awx2);
            }
            this.a(iu2, e, 10, 0, 10, awx2);
            this.a(iu2, e, 12, 0, 10, awx2);
            this.a(iu2, e, 10, 0, 12, awx2);
            this.a(iu2, e, 12, 0, 12, awx2);
            this.a(iu2, e, 8, 3, 6, awx2);
            this.a(iu2, e, 14, 3, 6, awx2);
            this.a(iu2, b, 4, 2, 4, awx2);
            this.a(iu2, e, 4, 1, 4, awx2);
            this.a(iu2, b, 4, 0, 4, awx2);
            this.a(iu2, b, 18, 2, 4, awx2);
            this.a(iu2, e, 18, 1, 4, awx2);
            this.a(iu2, b, 18, 0, 4, awx2);
            this.a(iu2, b, 4, 2, 18, awx2);
            this.a(iu2, e, 4, 1, 18, awx2);
            this.a(iu2, b, 4, 0, 18, awx2);
            this.a(iu2, b, 18, 2, 18, awx2);
            this.a(iu2, e, 18, 1, 18, awx2);
            this.a(iu2, b, 18, 0, 18, awx2);
            this.a(iu2, b, 9, 7, 20, awx2);
            this.a(iu2, b, 13, 7, 20, awx2);
            this.a(iu2, awx2, 6, 0, 21, 7, 4, 21, b, b, false);
            this.a(iu2, awx2, 15, 0, 21, 16, 4, 21, b, b, false);
            this.a(iu2, awx2, 11, 2, 16);
        } else if (this.n == 1) {
            int n3;
            this.a(iu2, awx2, 9, 3, 18, 13, 3, 20, b, b, false);
            this.a(iu2, awx2, 9, 0, 18, 9, 2, 18, b, b, false);
            this.a(iu2, awx2, 13, 0, 18, 13, 2, 18, b, b, false);
            int n4 = 9;
            int n5 = 20;
            int n6 = 5;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(iu2, b, n4, 6, 20, awx2);
                this.a(iu2, e, n4, 5, 20, awx2);
                this.a(iu2, b, n4, 4, 20, awx2);
                n4 = 13;
            }
            this.a(iu2, awx2, 7, 3, 7, 15, 3, 14, b, b, false);
            n4 = 10;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(iu2, awx2, n4, 0, 10, n4, 6, 10, b, b, false);
                this.a(iu2, awx2, n4, 0, 12, n4, 6, 12, b, b, false);
                this.a(iu2, e, n4, 0, 10, awx2);
                this.a(iu2, e, n4, 0, 12, awx2);
                this.a(iu2, e, n4, 4, 10, awx2);
                this.a(iu2, e, n4, 4, 12, awx2);
                n4 = 12;
            }
            n4 = 8;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(iu2, awx2, n4, 0, 7, n4, 2, 7, b, b, false);
                this.a(iu2, awx2, n4, 0, 14, n4, 2, 14, b, b, false);
                n4 = 14;
            }
            this.a(iu2, awx2, 8, 3, 8, 8, 3, 13, c, c, false);
            this.a(iu2, awx2, 14, 3, 8, 14, 3, 13, c, c, false);
            this.a(iu2, awx2, 11, 5, 13);
        }
        return true;
    }
}

