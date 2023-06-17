/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ayt
extends bis {
    public ayt() {
    }

    public ayt(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.c((ud)pc2, list, random, 6, 2, false);
    }

    public static ayt a(List list, Random random, int n2, int n3, int n4, int n5, bqk bqk2) {
        awx awx2 = awx.a(n2, n3, n4, -2, 0, 0, 7, 11, 7, bqk2);
        if (!ayt.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new ayt(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 0, 0, 6, 1, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 6, 10, 6, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 1, 8, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 2, 0, 6, 8, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 1, 0, 8, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 2, 1, 6, 8, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 2, 6, 5, 8, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 3, 2, 0, 5, 4, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 6, 3, 2, 6, 5, 2, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 6, 3, 4, 6, 5, 4, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, blg.by.s(), 5, 2, 5, awx2);
        this.a(iu2, awx2, 4, 2, 5, 4, 3, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 3, 2, 5, 3, 4, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 2, 5, 2, 5, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 2, 5, 1, 6, 5, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 7, 1, 5, 7, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 8, 2, 6, 8, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 2, 6, 0, 4, 8, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 0, 4, 5, 0, blg.bz.s(), blg.bz.s(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(iu2, blg.by.s(), i2, -1, i3, awx2);
            }
        }
        return true;
    }
}

