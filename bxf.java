/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bxf
extends bis {
    public bxf() {
    }

    public bxf(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 5, 3, true);
        this.a((ud)pc2, list, random, 5, 11, true);
    }

    public static bxf a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, bqk2);
        if (!bxf.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bxf(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        int n4;
        int n5;
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
        for (n5 = 1; n5 <= 11; n5 += 2) {
            this.a(iu2, awx2, n5, 10, 0, n5, 11, 0, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, n5, 10, 12, n5, 11, 12, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, 0, 10, n5, 0, 11, n5, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, 12, 10, n5, 12, 11, n5, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, blg.by.s(), n5, 13, 0, awx2);
            this.a(iu2, blg.by.s(), n5, 13, 12, awx2);
            this.a(iu2, blg.by.s(), 0, 13, n5, awx2);
            this.a(iu2, blg.by.s(), 12, 13, n5, awx2);
            this.a(iu2, blg.bz.s(), n5 + 1, 13, 0, awx2);
            this.a(iu2, blg.bz.s(), n5 + 1, 13, 12, awx2);
            this.a(iu2, blg.bz.s(), 0, 13, n5 + 1, awx2);
            this.a(iu2, blg.bz.s(), 12, 13, n5 + 1, awx2);
        }
        this.a(iu2, blg.bz.s(), 0, 13, 0, awx2);
        this.a(iu2, blg.bz.s(), 0, 13, 12, awx2);
        this.a(iu2, blg.bz.s(), 0, 13, 0, awx2);
        this.a(iu2, blg.bz.s(), 12, 13, 0, awx2);
        for (n5 = 3; n5 <= 9; n5 += 2) {
            this.a(iu2, awx2, 1, 7, n5, 1, 8, n5, blg.bz.s(), blg.bz.s(), false);
            this.a(iu2, awx2, 11, 7, n5, 11, 8, n5, blg.bz.s(), blg.bz.s(), false);
        }
        dbk dbk2 = blg.bA.s().a(qi.a, (Comparable)((Object)bqk.c));
        for (n4 = 0; n4 <= 6; ++n4) {
            int n6 = n4 + 4;
            for (n3 = 5; n3 <= 7; ++n3) {
                this.a(iu2, dbk2, n3, 5 + n4, n6, awx2);
            }
            if (n6 >= 5 && n6 <= 8) {
                this.a(iu2, awx2, 5, 5, n6, 7, n4 + 4, n6, blg.by.s(), blg.by.s(), false);
            } else if (n6 >= 9 && n6 <= 10) {
                this.a(iu2, awx2, 5, 8, n6, 7, n4 + 4, n6, blg.by.s(), blg.by.s(), false);
            }
            if (n4 < 1) continue;
            this.a(iu2, awx2, 5, 6 + n4, n6, 7, 9 + n4, n6, blg.a.s(), blg.a.s(), false);
        }
        for (n4 = 5; n4 <= 7; ++n4) {
            this.a(iu2, dbk2, n4, 12, 11, awx2);
        }
        this.a(iu2, awx2, 5, 6, 7, 5, 7, 7, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 7, 6, 7, 7, 7, 7, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 5, 13, 12, 7, 13, 12, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 2, 5, 2, 3, 5, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 9, 3, 5, 10, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 4, 2, 5, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 9, 5, 2, 10, 5, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 9, 5, 9, 10, 5, 10, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 10, 5, 4, 10, 5, 8, blg.by.s(), blg.by.s(), false);
        dbk dbk3 = dbk2.a(qi.a, (Comparable)((Object)bqk.f));
        dbk dbk4 = dbk2.a(qi.a, (Comparable)((Object)bqk.e));
        this.a(iu2, dbk4, 4, 5, 2, awx2);
        this.a(iu2, dbk4, 4, 5, 3, awx2);
        this.a(iu2, dbk4, 4, 5, 9, awx2);
        this.a(iu2, dbk4, 4, 5, 10, awx2);
        this.a(iu2, dbk3, 8, 5, 2, awx2);
        this.a(iu2, dbk3, 8, 5, 3, awx2);
        this.a(iu2, dbk3, 8, 5, 9, awx2);
        this.a(iu2, dbk3, 8, 5, 10, awx2);
        this.a(iu2, awx2, 3, 4, 4, 4, 4, 8, blg.aW.s(), blg.aW.s(), false);
        this.a(iu2, awx2, 8, 4, 4, 9, 4, 8, blg.aW.s(), blg.aW.s(), false);
        this.a(iu2, awx2, 3, 5, 4, 4, 5, 8, blg.bB.s(), blg.bB.s(), false);
        this.a(iu2, awx2, 8, 5, 4, 9, 5, 8, blg.bB.s(), blg.bB.s(), false);
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
        return true;
    }
}

