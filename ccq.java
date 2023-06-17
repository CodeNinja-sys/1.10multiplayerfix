/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ccq
extends ced {
    private boolean a;

    public ccq() {
    }

    public ccq(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
    }

    public static ccq a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 10, 6, 7, bqk2);
        if (!ccq.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new ccq(yj2, n5, random, awx2, bqk2);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Chest", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Chest");
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 6 - 1, 0);
        }
        dbk dbk2 = blg.e.s();
        dbk dbk3 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk4 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.e)));
        dbk dbk5 = this.a(blg.f.s());
        dbk dbk6 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk7 = this.a(blg.r.s());
        dbk dbk8 = this.a(blg.aO.s());
        this.a(iu2, awx2, 0, 1, 0, 9, 4, 6, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 0, 0, 9, 0, 6, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 4, 0, 9, 4, 6, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 5, 0, 9, 5, 6, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 1, 5, 1, 8, 5, 5, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 1, 0, 2, 3, 0, dbk5, dbk5, false);
        this.a(iu2, awx2, 0, 1, 0, 0, 4, 0, dbk7, dbk7, false);
        this.a(iu2, awx2, 3, 1, 0, 3, 4, 0, dbk7, dbk7, false);
        this.a(iu2, awx2, 0, 1, 6, 0, 4, 6, dbk7, dbk7, false);
        this.a(iu2, dbk5, 3, 3, 1, awx2);
        this.a(iu2, awx2, 3, 1, 2, 3, 3, 2, dbk5, dbk5, false);
        this.a(iu2, awx2, 4, 1, 3, 5, 3, 3, dbk5, dbk5, false);
        this.a(iu2, awx2, 0, 1, 1, 0, 3, 5, dbk5, dbk5, false);
        this.a(iu2, awx2, 1, 1, 6, 5, 3, 6, dbk5, dbk5, false);
        this.a(iu2, awx2, 5, 1, 0, 5, 3, 0, dbk8, dbk8, false);
        this.a(iu2, awx2, 9, 1, 0, 9, 3, 0, dbk8, dbk8, false);
        this.a(iu2, awx2, 6, 1, 4, 9, 4, 6, dbk2, dbk2, false);
        this.a(iu2, blg.k.s(), 7, 1, 5, awx2);
        this.a(iu2, blg.k.s(), 8, 1, 5, awx2);
        this.a(iu2, blg.bi.s(), 9, 2, 5, awx2);
        this.a(iu2, blg.bi.s(), 9, 2, 4, awx2);
        this.a(iu2, awx2, 7, 2, 4, 8, 2, 5, blg.a.s(), blg.a.s(), false);
        this.a(iu2, dbk2, 6, 1, 3, awx2);
        this.a(iu2, blg.al.s(), 6, 2, 3, awx2);
        this.a(iu2, blg.al.s(), 6, 3, 3, awx2);
        this.a(iu2, blg.T.s(), 8, 1, 1, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 4, awx2);
        this.a(iu2, blg.bj.s(), 2, 2, 6, awx2);
        this.a(iu2, blg.bj.s(), 4, 2, 6, awx2);
        this.a(iu2, dbk8, 2, 1, 4, awx2);
        this.a(iu2, blg.aB.s(), 2, 2, 4, awx2);
        this.a(iu2, dbk5, 1, 1, 5, awx2);
        this.a(iu2, dbk3, 2, 1, 5, awx2);
        this.a(iu2, dbk4, 1, 1, 4, awx2);
        if (!this.a && awx2.a(new cmz(this.a(5, 5), this.a(1), this.b(5, 5)))) {
            this.a = true;
            this.a(iu2, awx2, random, 5, 1, 5, bvm.e);
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            if (this.a(iu2, n2, 0, -1, awx2).a() != ahk.a || this.a(iu2, n2, -1, -1, awx2).a() == ahk.a) continue;
            this.a(iu2, dbk6, n2, 0, -1, awx2);
            if (this.a(iu2, n2, -1, -1, awx2).t() != blg.da) continue;
            this.a(iu2, blg.c.s(), n2, -1, -1, awx2);
        }
        for (n2 = 0; n2 < 7; ++n2) {
            for (int i2 = 0; i2 < 10; ++i2) {
                this.c(iu2, i2, 6, n2, awx2);
                this.b(iu2, dbk2, i2, -1, n2, awx2);
            }
        }
        this.a(iu2, awx2, 7, 1, 1, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 3;
    }
}

