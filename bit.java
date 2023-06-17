/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bit
extends agu {
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private static final byb i = new byb(null);

    public bit() {
    }

    public bit(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 12, 10, 15);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("placedMainChest", this.e);
        bvp2.a("placedHiddenChest", this.f);
        bvp2.a("placedTrap1", this.g);
        bvp2.a("placedTrap2", this.h);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.e = bvp2.p("placedMainChest");
        this.f = bvp2.p("placedHiddenChest");
        this.g = bvp2.p("placedTrap1");
        this.h = bvp2.p("placedTrap2");
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        if (!this.a(iu2, awx2, 0)) {
            return false;
        }
        this.a(iu2, awx2, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, i);
        this.a(iu2, awx2, 2, 1, 2, 9, 2, 2, false, random, i);
        this.a(iu2, awx2, 2, 1, 12, 9, 2, 12, false, random, i);
        this.a(iu2, awx2, 2, 1, 3, 2, 2, 11, false, random, i);
        this.a(iu2, awx2, 9, 1, 3, 9, 2, 11, false, random, i);
        this.a(iu2, awx2, 1, 3, 1, 10, 6, 1, false, random, i);
        this.a(iu2, awx2, 1, 3, 13, 10, 6, 13, false, random, i);
        this.a(iu2, awx2, 1, 3, 2, 1, 6, 12, false, random, i);
        this.a(iu2, awx2, 10, 3, 2, 10, 6, 12, false, random, i);
        this.a(iu2, awx2, 2, 3, 2, 9, 3, 12, false, random, i);
        this.a(iu2, awx2, 2, 6, 2, 9, 6, 12, false, random, i);
        this.a(iu2, awx2, 3, 7, 3, 8, 7, 11, false, random, i);
        this.a(iu2, awx2, 4, 8, 4, 7, 8, 10, false, random, i);
        this.a(iu2, awx2, 3, 1, 3, 8, 2, 11);
        this.a(iu2, awx2, 4, 3, 6, 7, 3, 9);
        this.a(iu2, awx2, 2, 4, 2, 9, 5, 12);
        this.a(iu2, awx2, 4, 6, 5, 7, 6, 9);
        this.a(iu2, awx2, 5, 7, 6, 6, 7, 8);
        this.a(iu2, awx2, 5, 1, 2, 6, 2, 2);
        this.a(iu2, awx2, 5, 2, 12, 6, 2, 12);
        this.a(iu2, awx2, 5, 5, 1, 6, 5, 1);
        this.a(iu2, awx2, 5, 5, 13, 6, 5, 13);
        this.a(iu2, blg.a.s(), 1, 5, 5, awx2);
        this.a(iu2, blg.a.s(), 10, 5, 5, awx2);
        this.a(iu2, blg.a.s(), 1, 5, 9, awx2);
        this.a(iu2, blg.a.s(), 10, 5, 9, awx2);
        for (n3 = 0; n3 <= 14; n3 += 14) {
            this.a(iu2, awx2, 2, 4, n3, 2, 5, n3, false, random, i);
            this.a(iu2, awx2, 4, 4, n3, 4, 5, n3, false, random, i);
            this.a(iu2, awx2, 7, 4, n3, 7, 5, n3, false, random, i);
            this.a(iu2, awx2, 9, 4, n3, 9, 5, n3, false, random, i);
        }
        this.a(iu2, awx2, 5, 6, 0, 6, 6, 0, false, random, i);
        for (n3 = 0; n3 <= 11; n3 += 11) {
            for (int i2 = 2; i2 <= 12; i2 += 2) {
                this.a(iu2, awx2, n3, 4, i2, n3, 5, i2, false, random, i);
            }
            this.a(iu2, awx2, n3, 6, 5, n3, 6, 5, false, random, i);
            this.a(iu2, awx2, n3, 6, 9, n3, 6, 9, false, random, i);
        }
        this.a(iu2, awx2, 2, 7, 2, 2, 9, 2, false, random, i);
        this.a(iu2, awx2, 9, 7, 2, 9, 9, 2, false, random, i);
        this.a(iu2, awx2, 2, 7, 12, 2, 9, 12, false, random, i);
        this.a(iu2, awx2, 9, 7, 12, 9, 9, 12, false, random, i);
        this.a(iu2, awx2, 4, 9, 4, 4, 9, 4, false, random, i);
        this.a(iu2, awx2, 7, 9, 4, 7, 9, 4, false, random, i);
        this.a(iu2, awx2, 4, 9, 10, 4, 9, 10, false, random, i);
        this.a(iu2, awx2, 7, 9, 10, 7, 9, 10, false, random, i);
        this.a(iu2, awx2, 5, 9, 7, 6, 9, 7, false, random, i);
        dbk dbk2 = blg.aw.s().a(qi.a, (Comparable)((Object)bqk.f));
        dbk dbk3 = blg.aw.s().a(qi.a, (Comparable)((Object)bqk.e));
        dbk dbk4 = blg.aw.s().a(qi.a, (Comparable)((Object)bqk.d));
        dbk dbk5 = blg.aw.s().a(qi.a, (Comparable)((Object)bqk.c));
        this.a(iu2, dbk5, 5, 9, 6, awx2);
        this.a(iu2, dbk5, 6, 9, 6, awx2);
        this.a(iu2, dbk4, 5, 9, 8, awx2);
        this.a(iu2, dbk4, 6, 9, 8, awx2);
        this.a(iu2, dbk5, 4, 0, 0, awx2);
        this.a(iu2, dbk5, 5, 0, 0, awx2);
        this.a(iu2, dbk5, 6, 0, 0, awx2);
        this.a(iu2, dbk5, 7, 0, 0, awx2);
        this.a(iu2, dbk5, 4, 1, 8, awx2);
        this.a(iu2, dbk5, 4, 2, 9, awx2);
        this.a(iu2, dbk5, 4, 3, 10, awx2);
        this.a(iu2, dbk5, 7, 1, 8, awx2);
        this.a(iu2, dbk5, 7, 2, 9, awx2);
        this.a(iu2, dbk5, 7, 3, 10, awx2);
        this.a(iu2, awx2, 4, 1, 9, 4, 1, 9, false, random, i);
        this.a(iu2, awx2, 7, 1, 9, 7, 1, 9, false, random, i);
        this.a(iu2, awx2, 4, 1, 10, 7, 2, 10, false, random, i);
        this.a(iu2, awx2, 5, 4, 5, 6, 4, 5, false, random, i);
        this.a(iu2, dbk2, 4, 4, 5, awx2);
        this.a(iu2, dbk3, 7, 4, 5, awx2);
        for (n2 = 0; n2 < 4; ++n2) {
            this.a(iu2, dbk4, 5, 0 - n2, 6 + n2, awx2);
            this.a(iu2, dbk4, 6, 0 - n2, 6 + n2, awx2);
            this.a(iu2, awx2, 5, 0 - n2, 7 + n2, 6, 0 - n2, 9 + n2);
        }
        this.a(iu2, awx2, 1, -3, 12, 10, -1, 13);
        this.a(iu2, awx2, 1, -3, 1, 3, -1, 13);
        this.a(iu2, awx2, 1, -3, 1, 9, -1, 5);
        for (n2 = 1; n2 <= 13; n2 += 2) {
            this.a(iu2, awx2, 1, -3, n2, 1, -2, n2, false, random, i);
        }
        for (n2 = 2; n2 <= 12; n2 += 2) {
            this.a(iu2, awx2, 1, -1, n2, 3, -1, n2, false, random, i);
        }
        this.a(iu2, awx2, 2, -2, 1, 5, -2, 1, false, random, i);
        this.a(iu2, awx2, 7, -2, 1, 9, -2, 1, false, random, i);
        this.a(iu2, awx2, 6, -3, 1, 6, -3, 1, false, random, i);
        this.a(iu2, awx2, 6, -1, 1, 6, -1, 1, false, random, i);
        this.a(iu2, blg.bR.s().a(cr.a, (Comparable)((Object)bqk.f)).a(cr.c, Boolean.valueOf(true)), 1, -3, 8, awx2);
        this.a(iu2, blg.bR.s().a(cr.a, (Comparable)((Object)bqk.e)).a(cr.c, Boolean.valueOf(true)), 4, -3, 8, awx2);
        this.a(iu2, blg.bS.s().a(uk.b, Boolean.valueOf(true)), 2, -3, 8, awx2);
        this.a(iu2, blg.bS.s().a(uk.b, Boolean.valueOf(true)), 3, -3, 8, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 7, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 6, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 5, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 4, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 3, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 2, awx2);
        this.a(iu2, blg.af.s(), 5, -3, 1, awx2);
        this.a(iu2, blg.af.s(), 4, -3, 1, awx2);
        this.a(iu2, blg.Y.s(), 3, -3, 1, awx2);
        if (!this.g) {
            this.g = this.a(iu2, awx2, random, 3, -2, 1, bqk.c, bvm.m);
        }
        this.a(iu2, blg.bn.s().a(ju.d, Boolean.valueOf(true)), 3, -2, 2, awx2);
        this.a(iu2, blg.bR.s().a(cr.a, (Comparable)((Object)bqk.c)).a(cr.c, Boolean.valueOf(true)), 7, -3, 1, awx2);
        this.a(iu2, blg.bR.s().a(cr.a, (Comparable)((Object)bqk.d)).a(cr.c, Boolean.valueOf(true)), 7, -3, 5, awx2);
        this.a(iu2, blg.bS.s().a(uk.b, Boolean.valueOf(true)), 7, -3, 2, awx2);
        this.a(iu2, blg.bS.s().a(uk.b, Boolean.valueOf(true)), 7, -3, 3, awx2);
        this.a(iu2, blg.bS.s().a(uk.b, Boolean.valueOf(true)), 7, -3, 4, awx2);
        this.a(iu2, blg.af.s(), 8, -3, 6, awx2);
        this.a(iu2, blg.af.s(), 9, -3, 6, awx2);
        this.a(iu2, blg.af.s(), 9, -3, 5, awx2);
        this.a(iu2, blg.Y.s(), 9, -3, 4, awx2);
        this.a(iu2, blg.af.s(), 9, -2, 4, awx2);
        if (!this.h) {
            this.h = this.a(iu2, awx2, random, 9, -2, 3, bqk.e, bvm.m);
        }
        this.a(iu2, blg.bn.s().a(ju.c, Boolean.valueOf(true)), 8, -1, 3, awx2);
        this.a(iu2, blg.bn.s().a(ju.c, Boolean.valueOf(true)), 8, -2, 3, awx2);
        if (!this.e) {
            this.e = this.a(iu2, awx2, random, 8, -3, 3, bvm.l);
        }
        this.a(iu2, blg.Y.s(), 9, -3, 2, awx2);
        this.a(iu2, blg.Y.s(), 8, -3, 1, awx2);
        this.a(iu2, blg.Y.s(), 4, -3, 5, awx2);
        this.a(iu2, blg.Y.s(), 5, -2, 5, awx2);
        this.a(iu2, blg.Y.s(), 5, -1, 5, awx2);
        this.a(iu2, blg.Y.s(), 6, -3, 5, awx2);
        this.a(iu2, blg.Y.s(), 7, -2, 5, awx2);
        this.a(iu2, blg.Y.s(), 7, -1, 5, awx2);
        this.a(iu2, blg.Y.s(), 8, -3, 5, awx2);
        this.a(iu2, awx2, 9, -1, 1, 9, -1, 5, false, random, i);
        this.a(iu2, awx2, 8, -3, 8, 10, -1, 10);
        this.a(iu2, blg.bf.a(bbt.e), 8, -2, 11, awx2);
        this.a(iu2, blg.bf.a(bbt.e), 9, -2, 11, awx2);
        this.a(iu2, blg.bf.a(bbt.e), 10, -2, 11, awx2);
        dbk dbk6 = blg.ay.s().a(cex.a, (Comparable)((Object)bta.e));
        this.a(iu2, dbk6, 8, -2, 12, awx2);
        this.a(iu2, dbk6, 9, -2, 12, awx2);
        this.a(iu2, dbk6, 10, -2, 12, awx2);
        this.a(iu2, awx2, 8, -3, 8, 8, -3, 10, false, random, i);
        this.a(iu2, awx2, 10, -3, 8, 10, -3, 10, false, random, i);
        this.a(iu2, blg.Y.s(), 10, -2, 9, awx2);
        this.a(iu2, blg.af.s(), 8, -2, 9, awx2);
        this.a(iu2, blg.af.s(), 8, -2, 10, awx2);
        this.a(iu2, blg.af.s(), 10, -1, 9, awx2);
        this.a(iu2, blg.F.s().a(ath.o, (Comparable)((Object)bqk.b)), 9, -2, 8, awx2);
        this.a(iu2, blg.F.s().a(ath.o, (Comparable)((Object)bqk.e)), 10, -2, 8, awx2);
        this.a(iu2, blg.F.s().a(ath.o, (Comparable)((Object)bqk.e)), 10, -1, 8, awx2);
        this.a(iu2, blg.bb.s().a(xc.j, (Comparable)((Object)bqk.c)), 10, -2, 10, awx2);
        if (!this.f) {
            this.f = this.a(iu2, awx2, random, 9, -3, 10, bvm.l);
        }
        return true;
    }
}

