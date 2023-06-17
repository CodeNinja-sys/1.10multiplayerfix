/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class sw
extends ced {
    public sw() {
    }

    public sw(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
    }

    public static sw a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 9, 9, 6, bqk2);
        if (!sw.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new sw(yj2, n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 9 - 1, 0);
        }
        dbk dbk2 = this.a(blg.e.s());
        dbk dbk3 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk4 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.d)));
        dbk dbk5 = this.a(blg.ad.s().a(qi.a, (Comparable)((Object)bqk.f)));
        dbk dbk6 = this.a(blg.f.s());
        dbk dbk7 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk8 = this.a(blg.aO.s());
        this.a(iu2, awx2, 1, 1, 1, 7, 5, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 0, 0, 8, 0, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 5, 0, 8, 5, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 6, 1, 8, 6, 4, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 7, 2, 8, 7, 3, dbk2, dbk2, false);
        for (int i2 = -1; i2 <= 2; ++i2) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(iu2, dbk3, n2, 6 + i2, i2, awx2);
                this.a(iu2, dbk4, n2, 6 + i2, 5 - i2, awx2);
            }
        }
        this.a(iu2, awx2, 0, 1, 0, 0, 1, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 1, 5, 8, 1, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 8, 1, 0, 8, 1, 4, dbk2, dbk2, false);
        this.a(iu2, awx2, 2, 1, 0, 7, 1, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 2, 0, 0, 4, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 2, 5, 0, 4, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 8, 2, 5, 8, 4, 5, dbk2, dbk2, false);
        this.a(iu2, awx2, 8, 2, 0, 8, 4, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 2, 1, 0, 4, 4, dbk6, dbk6, false);
        this.a(iu2, awx2, 1, 2, 5, 7, 4, 5, dbk6, dbk6, false);
        this.a(iu2, awx2, 8, 2, 1, 8, 4, 4, dbk6, dbk6, false);
        this.a(iu2, awx2, 1, 2, 0, 7, 4, 0, dbk6, dbk6, false);
        this.a(iu2, blg.bj.s(), 4, 2, 0, awx2);
        this.a(iu2, blg.bj.s(), 5, 2, 0, awx2);
        this.a(iu2, blg.bj.s(), 6, 2, 0, awx2);
        this.a(iu2, blg.bj.s(), 4, 3, 0, awx2);
        this.a(iu2, blg.bj.s(), 5, 3, 0, awx2);
        this.a(iu2, blg.bj.s(), 6, 3, 0, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 2, 3, awx2);
        this.a(iu2, blg.bj.s(), 0, 3, 2, awx2);
        this.a(iu2, blg.bj.s(), 0, 3, 3, awx2);
        this.a(iu2, blg.bj.s(), 8, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 8, 2, 3, awx2);
        this.a(iu2, blg.bj.s(), 8, 3, 2, awx2);
        this.a(iu2, blg.bj.s(), 8, 3, 3, awx2);
        this.a(iu2, blg.bj.s(), 2, 2, 5, awx2);
        this.a(iu2, blg.bj.s(), 3, 2, 5, awx2);
        this.a(iu2, blg.bj.s(), 5, 2, 5, awx2);
        this.a(iu2, blg.bj.s(), 6, 2, 5, awx2);
        this.a(iu2, awx2, 1, 4, 1, 7, 4, 1, dbk6, dbk6, false);
        this.a(iu2, awx2, 1, 4, 4, 7, 4, 4, dbk6, dbk6, false);
        this.a(iu2, awx2, 1, 3, 4, 7, 3, 4, blg.X.s(), blg.X.s(), false);
        this.a(iu2, dbk6, 7, 1, 4, awx2);
        this.a(iu2, dbk5, 7, 1, 3, awx2);
        dbk dbk9 = dbk3;
        this.a(iu2, dbk9, 6, 1, 4, awx2);
        this.a(iu2, dbk9, 5, 1, 4, awx2);
        this.a(iu2, dbk9, 4, 1, 4, awx2);
        this.a(iu2, dbk9, 3, 1, 4, awx2);
        this.a(iu2, dbk8, 6, 1, 3, awx2);
        this.a(iu2, blg.aB.s(), 6, 2, 3, awx2);
        this.a(iu2, dbk8, 4, 1, 3, awx2);
        this.a(iu2, blg.aB.s(), 4, 2, 3, awx2);
        this.a(iu2, blg.ai.s(), 7, 1, 1, awx2);
        this.a(iu2, blg.a.s(), 1, 1, 0, awx2);
        this.a(iu2, blg.a.s(), 1, 2, 0, awx2);
        this.a(iu2, awx2, random, 1, 1, 0, bqk.c);
        if (this.a(iu2, 1, 0, -1, awx2).a() == ahk.a && this.a(iu2, 1, -1, -1, awx2).a() != ahk.a) {
            this.a(iu2, dbk7, 1, 0, -1, awx2);
            if (this.a(iu2, 1, -1, -1, awx2).t() == blg.da) {
                this.a(iu2, blg.c.s(), 1, -1, -1, awx2);
            }
        }
        for (n2 = 0; n2 < 6; ++n2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                this.c(iu2, i3, 9, n2, awx2);
                this.b(iu2, dbk2, i3, -1, n2, awx2);
            }
        }
        this.a(iu2, awx2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 1;
    }
}

