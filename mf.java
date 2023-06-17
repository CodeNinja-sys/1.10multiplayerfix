/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class mf
extends aue {
    private boolean a;

    public mf() {
    }

    public mf(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Mob", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Mob");
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        if (pc2 != null) {
            ((afk)pc2).b = this;
        }
    }

    public static mf a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -4, -1, 0, 11, 8, 16, bqk2);
        if (!mf.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new mf(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        this.a(iu2, awx2, 0, 0, 0, 10, 7, 15, false, random, bbj.c());
        this.a(iu2, random, awx2, bui.c, 4, 1, 0);
        int n3 = 6;
        this.a(iu2, awx2, 1, n3, 1, 1, n3, 14, false, random, bbj.c());
        this.a(iu2, awx2, 9, n3, 1, 9, n3, 14, false, random, bbj.c());
        this.a(iu2, awx2, 2, n3, 1, 8, n3, 2, false, random, bbj.c());
        this.a(iu2, awx2, 2, n3, 14, 8, n3, 14, false, random, bbj.c());
        this.a(iu2, awx2, 1, 1, 1, 2, 1, 4, false, random, bbj.c());
        this.a(iu2, awx2, 8, 1, 1, 9, 1, 4, false, random, bbj.c());
        this.a(iu2, awx2, 1, 1, 1, 1, 1, 3, blg.k.s(), blg.k.s(), false);
        this.a(iu2, awx2, 9, 1, 1, 9, 1, 3, blg.k.s(), blg.k.s(), false);
        this.a(iu2, awx2, 3, 1, 8, 7, 1, 12, false, random, bbj.c());
        this.a(iu2, awx2, 4, 1, 9, 6, 1, 11, blg.k.s(), blg.k.s(), false);
        for (n2 = 3; n2 < 14; n2 += 2) {
            this.a(iu2, awx2, 0, 3, n2, 0, 4, n2, blg.bi.s(), blg.bi.s(), false);
            this.a(iu2, awx2, 10, 3, n2, 10, 4, n2, blg.bi.s(), blg.bi.s(), false);
        }
        for (n2 = 2; n2 < 9; n2 += 2) {
            this.a(iu2, awx2, n2, 3, 15, n2, 4, 15, blg.bi.s(), blg.bi.s(), false);
        }
        dbk dbk2 = blg.bv.s().a(qi.a, (Comparable)((Object)bqk.c));
        this.a(iu2, awx2, 4, 1, 5, 6, 1, 7, false, random, bbj.c());
        this.a(iu2, awx2, 4, 2, 6, 6, 2, 7, false, random, bbj.c());
        this.a(iu2, awx2, 4, 3, 7, 6, 3, 7, false, random, bbj.c());
        for (int i2 = 4; i2 <= 6; ++i2) {
            this.a(iu2, dbk2, i2, 1, 4, awx2);
            this.a(iu2, dbk2, i2, 2, 5, awx2);
            this.a(iu2, dbk2, i2, 3, 6, awx2);
        }
        dbk dbk3 = blg.bG.s().a(crk.a, (Comparable)((Object)bqk.c));
        dbk dbk4 = blg.bG.s().a(crk.a, (Comparable)((Object)bqk.d));
        dbk dbk5 = blg.bG.s().a(crk.a, (Comparable)((Object)bqk.f));
        dbk dbk6 = blg.bG.s().a(crk.a, (Comparable)((Object)bqk.e));
        boolean bl2 = true;
        boolean[] arrbl = new boolean[12];
        for (int i3 = 0; i3 < arrbl.length; ++i3) {
            arrbl[i3] = random.nextFloat() > 0.9f;
            bl2 &= arrbl[i3];
        }
        this.a(iu2, dbk3.a(crk.b, Boolean.valueOf(arrbl[0])), 4, 3, 8, awx2);
        this.a(iu2, dbk3.a(crk.b, Boolean.valueOf(arrbl[1])), 5, 3, 8, awx2);
        this.a(iu2, dbk3.a(crk.b, Boolean.valueOf(arrbl[2])), 6, 3, 8, awx2);
        this.a(iu2, dbk4.a(crk.b, Boolean.valueOf(arrbl[3])), 4, 3, 12, awx2);
        this.a(iu2, dbk4.a(crk.b, Boolean.valueOf(arrbl[4])), 5, 3, 12, awx2);
        this.a(iu2, dbk4.a(crk.b, Boolean.valueOf(arrbl[5])), 6, 3, 12, awx2);
        this.a(iu2, dbk5.a(crk.b, Boolean.valueOf(arrbl[6])), 3, 3, 9, awx2);
        this.a(iu2, dbk5.a(crk.b, Boolean.valueOf(arrbl[7])), 3, 3, 10, awx2);
        this.a(iu2, dbk5.a(crk.b, Boolean.valueOf(arrbl[8])), 3, 3, 11, awx2);
        this.a(iu2, dbk6.a(crk.b, Boolean.valueOf(arrbl[9])), 7, 3, 9, awx2);
        this.a(iu2, dbk6.a(crk.b, Boolean.valueOf(arrbl[10])), 7, 3, 10, awx2);
        this.a(iu2, dbk6.a(crk.b, Boolean.valueOf(arrbl[11])), 7, 3, 11, awx2);
        if (bl2) {
            dbk dbk7 = blg.bF.s();
            this.a(iu2, dbk7, 4, 3, 9, awx2);
            this.a(iu2, dbk7, 5, 3, 9, awx2);
            this.a(iu2, dbk7, 6, 3, 9, awx2);
            this.a(iu2, dbk7, 4, 3, 10, awx2);
            this.a(iu2, dbk7, 5, 3, 10, awx2);
            this.a(iu2, dbk7, 6, 3, 10, awx2);
            this.a(iu2, dbk7, 4, 3, 11, awx2);
            this.a(iu2, dbk7, 5, 3, 11, awx2);
            this.a(iu2, dbk7, 6, 3, 11, awx2);
        }
        if (!this.a) {
            n3 = this.a(3);
            cmz cmz2 = new cmz(this.a(5, 6), n3, this.b(5, 6));
            if (awx2.a(cmz2)) {
                this.a = true;
                iu2.a(cmz2, blg.ac.s(), 2);
                bql bql2 = iu2.q(cmz2);
                if (bql2 instanceof ze) {
                    ((ze)bql2).d().a("Silverfish");
                }
            }
        }
        return true;
    }
}

