/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ra
extends bis {
    public ra() {
    }

    public ra(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 5, 3, true);
    }

    public static ra a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, bqk2);
        if (!ra.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new ra(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        this.a(iu2, awx2, 0, 3, 0, 12, 4, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 5, 0, 12, 13, 12, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 5, 0, 1, 12, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 11, 5, 0, 12, 12, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 11, 4, 12, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 8, 5, 11, 10, 12, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 9, 11, 7, 12, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 0, 4, 12, 1, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 8, 5, 0, 10, 12, 1, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 9, 0, 7, 12, 1, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 11, 2, 10, 12, 10, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 8, 0, 7, 8, 0, blg.bz.s(), blg.bz.s(), false);
        for (n3 = 1; n3 <= 11; n3 += 2) {
            this.a(iu2, awx2, n3, 10, 0, n3, 11, 0, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, n3, 10, 12, n3, 11, 12, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, 0, 10, n3, 0, 11, n3, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, 12, 10, n3, 12, 11, n3, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, blg.by.s(), n3, 13, 0, awx2);
            this.a(iu2, blg.by.s(), n3, 13, 12, awx2);
            this.a(iu2, blg.by.s(), 0, 13, n3, awx2);
            this.a(iu2, blg.by.s(), 12, 13, n3, awx2);
            this.a(iu2, blg.bz.s(), n3 + 1, 13, 0, awx2);
            this.a(iu2, blg.bz.s(), n3 + 1, 13, 12, awx2);
            this.a(iu2, blg.bz.s(), 0, 13, n3 + 1, awx2);
            this.a(iu2, blg.bz.s(), 12, 13, n3 + 1, awx2);
        }
        this.a(iu2, blg.bz.s(), 0, 13, 0, awx2);
        this.a(iu2, blg.bz.s(), 0, 13, 12, awx2);
        this.a(iu2, blg.bz.s(), 0, 13, 0, awx2);
        this.a(iu2, blg.bz.s(), 12, 13, 0, awx2);
        for (n3 = 3; n3 <= 9; n3 += 2) {
            this.a(iu2, awx2, 1, 7, n3, 1, 8, n3, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, 11, 7, n3, 11, 8, n3, blg.bz.s(), blg.bz.s(), false);
        }
        this.a(iu2, awx2, 4, 2, 0, 8, 2, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 4, 12, 2, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 4, 0, 0, 8, 1, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 4, 0, 9, 8, 1, 12, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 0, 4, 3, 1, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 9, 0, 4, 12, 1, 8, blg.by.s(), blg.by.s(), false);
        for (n3 = 4; n3 <= 8; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(iu2, blg.by.s(), n3, -1, n2, awx2);
                this.b(iu2, blg.by.s(), n3, -1, 12 - n2, awx2);
            }
        }
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 4; n2 <= 8; ++n2) {
                this.b(iu2, blg.by.s(), n3, -1, n2, awx2);
                this.b(iu2, blg.by.s(), 12 - n3, -1, n2, awx2);
            }
        }
        this.a(iu2, awx2, 5, 5, 5, 7, 5, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 1, 6, 6, 4, 6, blg.a.s(), blg.a.s(), false);
        this.a(iu2, blg.by.s(), 6, 0, 6, awx2);
        dbk dbk2 = blg.k.s();
        this.a(iu2, dbk2, 6, 5, 6, awx2);
        cmz cmz2 = new cmz(this.a(6, 6), this.a(5), this.b(6, 6));
        if (awx2.a(cmz2)) {
            iu2.a(cmz2, dbk2, random);
        }
        return true;
    }
}

