/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bij
extends ic {
    public bij() {
    }

    public bij(bqk bqk2, awx awx2) {
        super(bqk2, awx2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        this.a(iu2, awx2, 2, -1, 2, 11, -1, 11, b, b, false);
        this.a(iu2, awx2, 0, -1, 0, 1, -1, 11, a, a, false);
        this.a(iu2, awx2, 12, -1, 0, 13, -1, 11, a, a, false);
        this.a(iu2, awx2, 2, -1, 0, 11, -1, 1, a, a, false);
        this.a(iu2, awx2, 2, -1, 12, 11, -1, 13, a, a, false);
        this.a(iu2, awx2, 0, 0, 0, 0, 0, 13, b, b, false);
        this.a(iu2, awx2, 13, 0, 0, 13, 0, 13, b, b, false);
        this.a(iu2, awx2, 1, 0, 0, 12, 0, 0, b, b, false);
        this.a(iu2, awx2, 1, 0, 13, 12, 0, 13, b, b, false);
        for (n2 = 2; n2 <= 11; n2 += 3) {
            this.a(iu2, e, 0, 0, n2, awx2);
            this.a(iu2, e, 13, 0, n2, awx2);
            this.a(iu2, e, n2, 0, 0, awx2);
        }
        this.a(iu2, awx2, 2, 0, 3, 4, 0, 9, b, b, false);
        this.a(iu2, awx2, 9, 0, 3, 11, 0, 9, b, b, false);
        this.a(iu2, awx2, 4, 0, 9, 9, 0, 11, b, b, false);
        this.a(iu2, b, 5, 0, 8, awx2);
        this.a(iu2, b, 8, 0, 8, awx2);
        this.a(iu2, b, 10, 0, 10, awx2);
        this.a(iu2, b, 3, 0, 10, awx2);
        this.a(iu2, awx2, 3, 0, 3, 3, 0, 7, c, c, false);
        this.a(iu2, awx2, 10, 0, 3, 10, 0, 7, c, c, false);
        this.a(iu2, awx2, 6, 0, 10, 7, 0, 10, c, c, false);
        n2 = 3;
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 2; i3 <= 8; i3 += 3) {
                this.a(iu2, awx2, n2, 0, i3, n2, 2, i3, b, b, false);
            }
            n2 = 10;
        }
        this.a(iu2, awx2, 5, 0, 10, 5, 2, 10, b, b, false);
        this.a(iu2, awx2, 8, 0, 10, 8, 2, 10, b, b, false);
        this.a(iu2, awx2, 6, -1, 7, 7, -1, 8, c, c, false);
        this.a(iu2, awx2, 6, -1, 3, 7, -1, 4, false);
        this.a(iu2, awx2, 6, 1, 6);
        return true;
    }
}

