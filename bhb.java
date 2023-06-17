/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bhb
extends ic {
    public bhb() {
    }

    public bhb(bqk bqk2, cgd cgd2, Random random) {
        super(1, bqk2, cgd2, 1, 1, 1);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.k.a / 25 > 0) {
            this.a(iu2, awx2, 0, 0, this.k.c[bqk.a.b()]);
        }
        if (this.k.b[bqk.b.b()] == null) {
            this.a(iu2, awx2, 1, 4, 1, 6, 4, 6, a);
        }
        for (int i2 = 1; i2 <= 6; ++i2) {
            for (int i3 = 1; i3 <= 6; ++i3) {
                if (random.nextInt(3) == 0) continue;
                int n2 = 2 + (random.nextInt(4) == 0 ? 0 : 1);
                this.a(iu2, awx2, i2, n2, i3, i2, 3, i3, blg.v.a(1), blg.v.a(1), false);
            }
        }
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
        return true;
    }
}

