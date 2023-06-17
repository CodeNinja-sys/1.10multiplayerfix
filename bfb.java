/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bfb
extends ced {
    public bfb() {
    }

    public bfb(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
    }

    public static bfb a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 5, 12, 9, bqk2);
        if (!bfb.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bfb(yj2, n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 12 - 1, 0);
        }
        dbk dbk2 = blg.e.s();
        dbk dbk3 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk4 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.e)));
        dbk dbk5 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.f)));
        this.a(iu2, awx2, 1, 1, 1, 3, 3, 7, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 5, 1, 3, 9, 3, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 0, 0, 3, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 1, 0, 3, 10, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 1, 1, 0, 10, 3, dbk2, dbk2, false);
        this.a(iu2, awx2, 4, 1, 1, 4, 10, 3, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 0, 4, 0, 4, 7, dbk2, dbk2, false);
        this.a(iu2, awx2, 4, 0, 4, 4, 4, 7, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 1, 8, 3, 4, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 5, 4, 3, 10, 4, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 5, 5, 3, 5, 7, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 9, 0, 4, 9, 4, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 4, 0, 4, 4, 4, dbk2, dbk2, false);
        this.a(iu2, dbk2, 0, 11, 2, awx2);
        this.a(iu2, dbk2, 4, 11, 2, awx2);
        this.a(iu2, dbk2, 2, 11, 0, awx2);
        this.a(iu2, dbk2, 2, 11, 4, awx2);
        this.a(iu2, dbk2, 1, 1, 6, awx2);
        this.a(iu2, dbk2, 1, 1, 7, awx2);
        this.a(iu2, dbk2, 2, 1, 7, awx2);
        this.a(iu2, dbk2, 3, 1, 6, awx2);
        this.a(iu2, dbk2, 3, 1, 7, awx2);
        this.a(iu2, dbk3, 1, 1, 5, awx2);
        this.a(iu2, dbk3, 2, 1, 6, awx2);
        this.a(iu2, dbk3, 3, 1, 5, awx2);
        this.a(iu2, dbk4, 1, 2, 7, awx2);
        this.a(iu2, dbk5, 3, 2, 7, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 3, 2, awx2);
        this.a(iu2, blg.bj.s(), 4, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 4, 3, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 6, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 7, 2, awx2);
        this.a(iu2, blg.bj.s(), 4, 6, 2, awx2);
        this.a(iu2, blg.bj.s(), 4, 7, 2, awx2);
        this.a(iu2, blg.bj.s(), 2, 6, 0, awx2);
        this.a(iu2, blg.bj.s(), 2, 7, 0, awx2);
        this.a(iu2, blg.bj.s(), 2, 6, 4, awx2);
        this.a(iu2, blg.bj.s(), 2, 7, 4, awx2);
        this.a(iu2, blg.bj.s(), 0, 3, 6, awx2);
        this.a(iu2, blg.bj.s(), 4, 3, 6, awx2);
        this.a(iu2, blg.bj.s(), 2, 3, 8, awx2);
        this.a(iu2, bqk.d, 2, 4, 7, awx2);
        this.a(iu2, bqk.f, 1, 4, 6, awx2);
        this.a(iu2, bqk.e, 3, 4, 6, awx2);
        this.a(iu2, bqk.c, 2, 4, 5, awx2);
        dbk dbk6 = blg.au.s().a(def.a, (Comparable)((Object)bqk.e));
        for (n2 = 1; n2 <= 9; ++n2) {
            this.a(iu2, dbk6, 3, n2, 3, awx2);
        }
        this.a(iu2, blg.a.s(), 2, 1, 0, awx2);
        this.a(iu2, blg.a.s(), 2, 2, 0, awx2);
        this.a(iu2, awx2, random, 2, 1, 0, bqk.c);
        if (this.a(iu2, 2, 0, -1, awx2).a() == ahk.a && this.a(iu2, 2, -1, -1, awx2).a() != ahk.a) {
            this.a(iu2, dbk3, 2, 0, -1, awx2);
            if (this.a(iu2, 2, -1, -1, awx2).t() == blg.da) {
                this.a(iu2, blg.c.s(), 2, -1, -1, awx2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (int i2 = 0; i2 < 5; ++i2) {
                this.c(iu2, i2, 12, n2, awx2);
                this.b(iu2, dbk2, i2, -1, n2, awx2);
            }
        }
        this.a(iu2, awx2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 2;
    }
}

