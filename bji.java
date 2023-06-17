/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bji
extends ced {
    private boolean a;
    private int b;

    public bji() {
    }

    public bji(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = random.nextBoolean();
        this.b = random.nextInt(3);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("T", this.b);
        bvp2.a("C", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.b = bvp2.h("T");
        this.a = bvp2.p("C");
    }

    public static bji a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 4, 6, 5, bqk2);
        if (!bji.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bji(yj2, n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 6 - 1, 0);
        }
        dbk dbk2 = this.a(blg.e.s());
        dbk dbk3 = this.a(blg.f.s());
        dbk dbk4 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk5 = this.a(blg.r.s());
        dbk dbk6 = this.a(blg.aO.s());
        this.a(iu2, awx2, 1, 1, 1, 3, 5, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 0, 0, 3, 0, 4, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 1, 2, 0, 3, blg.d.s(), blg.d.s(), false);
        if (this.a) {
            this.a(iu2, awx2, 1, 4, 1, 2, 4, 3, dbk5, dbk5, false);
        } else {
            this.a(iu2, awx2, 1, 5, 1, 2, 5, 3, dbk5, dbk5, false);
        }
        this.a(iu2, dbk5, 1, 4, 0, awx2);
        this.a(iu2, dbk5, 2, 4, 0, awx2);
        this.a(iu2, dbk5, 1, 4, 4, awx2);
        this.a(iu2, dbk5, 2, 4, 4, awx2);
        this.a(iu2, dbk5, 0, 4, 1, awx2);
        this.a(iu2, dbk5, 0, 4, 2, awx2);
        this.a(iu2, dbk5, 0, 4, 3, awx2);
        this.a(iu2, dbk5, 3, 4, 1, awx2);
        this.a(iu2, dbk5, 3, 4, 2, awx2);
        this.a(iu2, dbk5, 3, 4, 3, awx2);
        this.a(iu2, awx2, 0, 1, 0, 0, 3, 0, dbk5, dbk5, false);
        this.a(iu2, awx2, 3, 1, 0, 3, 3, 0, dbk5, dbk5, false);
        this.a(iu2, awx2, 0, 1, 4, 0, 3, 4, dbk5, dbk5, false);
        this.a(iu2, awx2, 3, 1, 4, 3, 3, 4, dbk5, dbk5, false);
        this.a(iu2, awx2, 0, 1, 1, 0, 3, 3, dbk3, dbk3, false);
        this.a(iu2, awx2, 3, 1, 1, 3, 3, 3, dbk3, dbk3, false);
        this.a(iu2, awx2, 1, 1, 0, 2, 3, 0, dbk3, dbk3, false);
        this.a(iu2, awx2, 1, 1, 4, 2, 3, 4, dbk3, dbk3, false);
        this.a(iu2, blg.bj.s(), 0, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 3, 2, 2, awx2);
        if (this.b > 0) {
            this.a(iu2, dbk6, this.b, 1, 3, awx2);
            this.a(iu2, blg.aB.s(), this.b, 2, 3, awx2);
        }
        this.a(iu2, blg.a.s(), 1, 1, 0, awx2);
        this.a(iu2, blg.a.s(), 1, 2, 0, awx2);
        this.a(iu2, awx2, random, 1, 1, 0, bqk.c);
        if (this.a(iu2, 1, 0, -1, awx2).a() == ahk.a && this.a(iu2, 1, -1, -1, awx2).a() != ahk.a) {
            this.a(iu2, dbk4, 1, 0, -1, awx2);
            if (this.a(iu2, 1, -1, -1, awx2).t() == blg.da) {
                this.a(iu2, blg.c.s(), 1, -1, -1, awx2);
            }
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                this.c(iu2, i3, 6, i2, awx2);
                this.b(iu2, dbk2, i3, -1, i2, awx2);
            }
        }
        this.a(iu2, awx2, 1, 1, 2, 1);
        return true;
    }
}

