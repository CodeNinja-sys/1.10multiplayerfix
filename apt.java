/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class apt
extends bis {
    public apt() {
    }

    public apt(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    protected apt(Random random, int n2, int n3) {
        super(0);
        this.a(afj.a.a(random));
        this.l = this.e().l() == ctv.c ? new awx(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1) : new awx(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 8, 3, false);
        this.b((ud)pc2, list, random, 3, 8, false);
        this.c((ud)pc2, list, random, 3, 8, false);
    }

    public static apt a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -8, -3, 0, 19, 10, 19, bqk2);
        if (!apt.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new apt(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        this.a(iu2, awx2, 7, 3, 0, 11, 4, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 3, 7, 18, 4, 11, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 8, 5, 0, 10, 7, 18, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 5, 8, 18, 7, 10, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 7, 5, 0, 7, 5, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 7, 5, 11, 7, 5, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 11, 5, 0, 11, 5, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 11, 5, 11, 11, 5, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 5, 7, 7, 5, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 11, 5, 7, 18, 5, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 5, 11, 7, 5, 11, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 11, 5, 11, 18, 5, 11, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 7, 2, 0, 11, 2, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 7, 2, 13, 11, 2, 18, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 7, 0, 0, 11, 1, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 7, 0, 15, 11, 1, 18, blg.by.s(), blg.by.s(), false);
        for (n3 = 7; n3 <= 11; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(iu2, blg.by.s(), n3, -1, n2, awx2);
                this.b(iu2, blg.by.s(), n3, -1, 18 - n2, awx2);
            }
        }
        this.a(iu2, awx2, 0, 2, 7, 5, 2, 11, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 13, 2, 7, 18, 2, 11, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 0, 7, 3, 1, 11, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 15, 0, 7, 18, 1, 11, blg.by.s(), blg.by.s(), false);
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 7; n2 <= 11; ++n2) {
                this.b(iu2, blg.by.s(), n3, -1, n2, awx2);
                this.b(iu2, blg.by.s(), 18 - n3, -1, n2, awx2);
            }
        }
        return true;
    }
}

