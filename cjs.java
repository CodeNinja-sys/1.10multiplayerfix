/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cjs
extends bis {
    public cjs() {
    }

    public cjs(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 1, 0, true);
    }

    public static cjs a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -7, 0, 5, 14, 10, bqk2);
        if (!cjs.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new cjs(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        dbk dbk2 = blg.bA.s().a(qi.a, (Comparable)((Object)bqk.d));
        for (int i2 = 0; i2 <= 9; ++i2) {
            int n2 = Math.max(1, 7 - i2);
            int n3 = Math.min(Math.max(n2 + 5, 14 - i2), 13);
            int n4 = i2;
            this.a(iu2, awx2, 0, 0, n4, 4, n2, n4, blg.by.s(), blg.by.s(), false);
            this.a(iu2, awx2, 1, n2 + 1, n4, 3, n3 - 1, n4, blg.a.s(), blg.a.s(), false);
            if (i2 <= 6) {
                this.a(iu2, dbk2, 1, n2 + 1, n4, awx2);
                this.a(iu2, dbk2, 2, n2 + 1, n4, awx2);
                this.a(iu2, dbk2, 3, n2 + 1, n4, awx2);
            }
            this.a(iu2, awx2, 0, n3, n4, 4, n3, n4, blg.by.s(), blg.by.s(), false);
            this.a(iu2, awx2, 0, n2 + 1, n4, 0, n3 - 1, n4, blg.by.s(), blg.by.s(), false);
            this.a(iu2, awx2, 4, n2 + 1, n4, 4, n3 - 1, n4, blg.by.s(), blg.by.s(), false);
            if ((i2 & 1) == 0) {
                this.a(iu2, awx2, 0, n2 + 2, n4, 0, n2 + 3, n4, blg.bz.s(), blg.bz.s(), false);
                this.a(iu2, awx2, 4, n2 + 2, n4, 4, n2 + 3, n4, blg.bz.s(), blg.bz.s(), false);
            }
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(iu2, blg.by.s(), i3, -1, n4, awx2);
            }
        }
        return true;
    }
}

