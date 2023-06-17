/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cts
extends ced {
    public cts() {
    }

    public cts(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
    }

    public static cts a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 9, 7, 11, bqk2);
        if (!cts.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new cts(yj2, n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 7 - 1, 0);
        }
        dbk dbk2 = this.a(blg.e.s());
        dbk dbk3 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk4 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.d)));
        dbk dbk5 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.e)));
        dbk dbk6 = this.a(blg.f.s());
        dbk dbk7 = this.a(blg.r.s());
        dbk dbk8 = this.a(blg.aO.s());
        this.a(iu2, awx2, 1, 1, 1, 7, 4, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 2, 1, 6, 8, 4, 10, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 2, 0, 6, 8, 0, 10, blg.d.s(), blg.d.s(), false);
        this.a(iu2, dbk2, 6, 0, 6, awx2);
        this.a(iu2, awx2, 2, 1, 6, 2, 1, 10, dbk8, dbk8, false);
        this.a(iu2, awx2, 8, 1, 6, 8, 1, 10, dbk8, dbk8, false);
        this.a(iu2, awx2, 3, 1, 10, 7, 1, 10, dbk8, dbk8, false);
        this.a(iu2, awx2, 1, 0, 1, 7, 0, 4, dbk6, dbk6, false);
        this.a(iu2, awx2, 0, 0, 0, 0, 3, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 8, 0, 0, 8, 3, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 0, 7, 1, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 5, 7, 1, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 2, 0, 7, 3, 0, dbk6, dbk6, false);
        this.a(iu2, awx2, 1, 2, 5, 7, 3, 5, dbk6, dbk6, false);
        this.a(iu2, awx2, 0, 4, 1, 8, 4, 1, dbk6, dbk6, false);
        this.a(iu2, awx2, 0, 4, 4, 8, 4, 4, dbk6, dbk6, false);
        this.a(iu2, awx2, 0, 5, 2, 8, 5, 3, dbk6, dbk6, false);
        this.a(iu2, dbk6, 0, 4, 2, awx2);
        this.a(iu2, dbk6, 0, 4, 3, awx2);
        this.a(iu2, dbk6, 8, 4, 2, awx2);
        this.a(iu2, dbk6, 8, 4, 3, awx2);
        dbk dbk9 = dbk3;
        dbk dbk10 = dbk4;
        dbk dbk11 = dbk5;
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(iu2, dbk9, n2, 4 + n3, n3, awx2);
                this.a(iu2, dbk10, n2, 4 + n3, 5 - n3, awx2);
            }
        }
        this.a(iu2, dbk7, 0, 2, 1, awx2);
        this.a(iu2, dbk7, 0, 2, 4, awx2);
        this.a(iu2, dbk7, 8, 2, 1, awx2);
        this.a(iu2, dbk7, 8, 2, 4, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 3, awx2);
        this.a(iu2, blg.bj.s(), 8, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 8, 2, 3, awx2);
        this.a(iu2, blg.bj.s(), 2, 2, 5, awx2);
        this.a(iu2, blg.bj.s(), 3, 2, 5, awx2);
        this.a(iu2, blg.bj.s(), 5, 2, 0, awx2);
        this.a(iu2, blg.bj.s(), 6, 2, 5, awx2);
        this.a(iu2, dbk8, 2, 1, 3, awx2);
        this.a(iu2, blg.aB.s(), 2, 2, 3, awx2);
        this.a(iu2, dbk6, 1, 1, 4, awx2);
        this.a(iu2, dbk9, 2, 1, 4, awx2);
        this.a(iu2, dbk11, 1, 1, 3, awx2);
        this.a(iu2, awx2, 5, 0, 1, 7, 0, 3, blg.T.s(), blg.T.s(), false);
        this.a(iu2, blg.T.s(), 6, 1, 1, awx2);
        this.a(iu2, blg.T.s(), 6, 1, 2, awx2);
        this.a(iu2, blg.a.s(), 2, 1, 0, awx2);
        this.a(iu2, blg.a.s(), 2, 2, 0, awx2);
        this.a(iu2, bqk.c, 2, 3, 1, awx2);
        this.a(iu2, awx2, random, 2, 1, 0, bqk.c);
        if (this.a(iu2, 2, 0, -1, awx2).a() == ahk.a && this.a(iu2, 2, -1, -1, awx2).a() != ahk.a) {
            this.a(iu2, dbk9, 2, 0, -1, awx2);
            if (this.a(iu2, 2, -1, -1, awx2).t() == blg.da) {
                this.a(iu2, blg.c.s(), 2, -1, -1, awx2);
            }
        }
        this.a(iu2, blg.a.s(), 6, 1, 5, awx2);
        this.a(iu2, blg.a.s(), 6, 2, 5, awx2);
        this.a(iu2, bqk.d, 6, 3, 4, awx2);
        this.a(iu2, awx2, random, 6, 1, 5, bqk.d);
        for (n3 = 0; n3 < 5; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(iu2, n2, 7, n3, awx2);
                this.b(iu2, dbk2, n2, -1, n3, awx2);
            }
        }
        this.a(iu2, awx2, 4, 1, 2, 2);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        if (n2 == 0) {
            return 4;
        }
        return super.c(n2, n3);
    }
}

