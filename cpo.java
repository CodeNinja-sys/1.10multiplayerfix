/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cpo
extends agu {
    private boolean e;

    public cpo() {
    }

    public cpo(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 7, 9);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Witch", this.e);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.e = bvp2.p("Witch");
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        int n4;
        if (!this.a(iu2, awx2, 0)) {
            return false;
        }
        this.a(iu2, awx2, 1, 1, 1, 5, 1, 7, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 1, 4, 2, 5, 4, 7, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 2, 1, 0, 4, 1, 0, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 2, 2, 2, 3, 3, 2, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 1, 2, 3, 1, 3, 6, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 5, 2, 3, 5, 3, 6, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 2, 2, 7, 4, 3, 7, blg.f.a(zg.b.b()), blg.f.a(zg.b.b()), false);
        this.a(iu2, awx2, 1, 0, 2, 1, 3, 2, blg.r.s(), blg.r.s(), false);
        this.a(iu2, awx2, 5, 0, 2, 5, 3, 2, blg.r.s(), blg.r.s(), false);
        this.a(iu2, awx2, 1, 0, 7, 1, 3, 7, blg.r.s(), blg.r.s(), false);
        this.a(iu2, awx2, 5, 0, 7, 5, 3, 7, blg.r.s(), blg.r.s(), false);
        this.a(iu2, blg.aO.s(), 2, 3, 2, awx2);
        this.a(iu2, blg.aO.s(), 3, 3, 7, awx2);
        this.a(iu2, blg.a.s(), 1, 3, 4, awx2);
        this.a(iu2, blg.a.s(), 5, 3, 4, awx2);
        this.a(iu2, blg.a.s(), 5, 3, 5, awx2);
        this.a(iu2, blg.ca.s().a(acw.b, (Comparable)((Object)tx.r)), 1, 3, 5, awx2);
        this.a(iu2, blg.ai.s(), 3, 2, 6, awx2);
        this.a(iu2, blg.bE.s(), 4, 2, 6, awx2);
        this.a(iu2, blg.aO.s(), 1, 2, 1, awx2);
        this.a(iu2, blg.aO.s(), 5, 2, 1, awx2);
        dbk dbk2 = blg.bU.s().a(qi.a, (Comparable)((Object)bqk.c));
        dbk dbk3 = blg.bU.s().a(qi.a, (Comparable)((Object)bqk.f));
        dbk dbk4 = blg.bU.s().a(qi.a, (Comparable)((Object)bqk.e));
        dbk dbk5 = blg.bU.s().a(qi.a, (Comparable)((Object)bqk.d));
        this.a(iu2, awx2, 0, 4, 1, 6, 4, 1, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 4, 2, 0, 4, 7, dbk3, dbk3, false);
        this.a(iu2, awx2, 6, 4, 2, 6, 4, 7, dbk4, dbk4, false);
        this.a(iu2, awx2, 0, 4, 8, 6, 4, 8, dbk5, dbk5, false);
        for (n4 = 2; n4 <= 7; n4 += 5) {
            for (n3 = 1; n3 <= 5; n3 += 4) {
                this.b(iu2, blg.r.s(), n3, -1, n4, awx2);
            }
        }
        if (!this.e && awx2.a(new cmz(n4 = this.a(2, 5), n3 = this.a(2), n2 = this.b(2, 5)))) {
            this.e = true;
            byl byl2 = new byl(iu2);
            byl2.a_((double)n4 + 0.5, n3, (double)n2 + 0.5, 0.0f, 0.0f);
            byl2.a(iu2.C(new cmz(n4, n3, n2)), null);
            iu2.b(byl2);
        }
        return true;
    }
}

