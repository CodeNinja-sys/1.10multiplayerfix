/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class xf
extends bis {
    public xf() {
    }

    public xf(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        int n2 = 1;
        bqk bqk2 = this.e();
        if (bqk2 == bqk.e || bqk2 == bqk.c) {
            n2 = 5;
        }
        this.b((ud)pc2, list, random, 0, n2, random.nextInt(8) > 0);
        this.c((ud)pc2, list, random, 0, n2, random.nextInt(8) > 0);
    }

    public static xf a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -3, 0, 0, 9, 7, 9, bqk2);
        if (!xf.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new xf(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 0, 0, 8, 1, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 8, 5, 8, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 6, 0, 8, 6, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 2, 5, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 2, 0, 8, 5, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 3, 0, 1, 4, 0, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 7, 3, 0, 7, 4, 0, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 2, 4, 8, 2, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 1, 4, 2, 2, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 6, 1, 4, 7, 2, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 3, 8, 8, 3, 8, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 3, 6, 0, 3, 7, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 8, 3, 6, 8, 3, 7, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 3, 4, 0, 5, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 8, 3, 4, 8, 5, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 3, 5, 2, 5, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 3, 5, 7, 5, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 4, 5, 1, 5, 5, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 7, 4, 5, 7, 5, 5, blg.bz.s(), blg.bz.s(), false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 8; ++i3) {
                this.b(iu2, blg.by.s(), i3, -1, i2, awx2);
            }
        }
        return true;
    }
}

