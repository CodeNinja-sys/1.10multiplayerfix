/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bam
extends bis {
    public bam() {
    }

    public bam(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 1, 3, false);
    }

    public static bam a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -3, 0, 5, 10, 19, bqk2);
        if (!bam.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bam(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 3, 0, 4, 4, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 5, 0, 3, 7, 18, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 5, 0, 0, 5, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 4, 5, 0, 4, 5, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 4, 2, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 13, 4, 2, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 0, 0, 4, 1, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 0, 15, 4, 1, 18, blg.by.s(), blg.by.s(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 2; ++i3) {
                this.b(iu2, blg.by.s(), i2, -1, i3, awx2);
                this.b(iu2, blg.by.s(), i2, -1, 18 - i3, awx2);
            }
        }
        this.a(iu2, awx2, 0, 1, 1, 0, 4, 1, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 3, 4, 0, 4, 4, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 3, 14, 0, 4, 14, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 1, 17, 0, 4, 17, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 1, 1, 4, 4, 1, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 3, 4, 4, 4, 4, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 3, 14, 4, 4, 14, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 1, 17, 4, 4, 17, blg.bz.s(), blg.bz.s(), false);
        return true;
    }
}

