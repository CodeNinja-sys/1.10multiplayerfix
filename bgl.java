/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bgl
extends aue {
    private boolean a;

    public bgl() {
    }

    public bgl(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
        this.a = awx2.d() > 6;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Tall", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Tall");
    }

    public static bgl a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -4, -1, 0, 14, 11, 15, bqk2);
        if (!(bgl.a(awx2) && pc.a(list, awx2) == null || bgl.a(awx2 = awx.a(n2, n3, n4, -4, -1, 0, 14, 6, 15, bqk2)) && pc.a(list, awx2) == null)) {
            return null;
        }
        return new bgl(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.a(iu2, awx2)) {
            return false;
        }
        int n3 = 11;
        if (!this.a) {
            n3 = 6;
        }
        this.a(iu2, awx2, 0, 0, 0, 13, n3 - 1, 14, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 4, 1, 0);
        this.a(iu2, awx2, random, 0.07f, 2, 1, 1, 11, 4, 13, blg.G.s(), blg.G.s(), false, 0);
        boolean bl2 = true;
        int n4 = 12;
        for (n2 = 1; n2 <= 13; ++n2) {
            if ((n2 - 1) % 4 == 0) {
                this.a(iu2, awx2, 1, 1, n2, 1, 4, n2, blg.f.s(), blg.f.s(), false);
                this.a(iu2, awx2, 12, 1, n2, 12, 4, n2, blg.f.s(), blg.f.s(), false);
                this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.f)), 2, 3, n2, awx2);
                this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.e)), 11, 3, n2, awx2);
                if (!this.a) continue;
                this.a(iu2, awx2, 1, 6, n2, 1, 9, n2, blg.f.s(), blg.f.s(), false);
                this.a(iu2, awx2, 12, 6, n2, 12, 9, n2, blg.f.s(), blg.f.s(), false);
                continue;
            }
            this.a(iu2, awx2, 1, 1, n2, 1, 4, n2, blg.X.s(), blg.X.s(), false);
            this.a(iu2, awx2, 12, 1, n2, 12, 4, n2, blg.X.s(), blg.X.s(), false);
            if (!this.a) continue;
            this.a(iu2, awx2, 1, 6, n2, 1, 9, n2, blg.X.s(), blg.X.s(), false);
            this.a(iu2, awx2, 12, 6, n2, 12, 9, n2, blg.X.s(), blg.X.s(), false);
        }
        for (n2 = 3; n2 < 12; n2 += 2) {
            this.a(iu2, awx2, 3, 1, n2, 4, 3, n2, blg.X.s(), blg.X.s(), false);
            this.a(iu2, awx2, 6, 1, n2, 7, 3, n2, blg.X.s(), blg.X.s(), false);
            this.a(iu2, awx2, 9, 1, n2, 10, 3, n2, blg.X.s(), blg.X.s(), false);
        }
        if (this.a) {
            this.a(iu2, awx2, 1, 5, 1, 3, 5, 13, blg.f.s(), blg.f.s(), false);
            this.a(iu2, awx2, 10, 5, 1, 12, 5, 13, blg.f.s(), blg.f.s(), false);
            this.a(iu2, awx2, 4, 5, 1, 9, 5, 2, blg.f.s(), blg.f.s(), false);
            this.a(iu2, awx2, 4, 5, 12, 9, 5, 13, blg.f.s(), blg.f.s(), false);
            this.a(iu2, blg.f.s(), 9, 5, 11, awx2);
            this.a(iu2, blg.f.s(), 8, 5, 11, awx2);
            this.a(iu2, blg.f.s(), 9, 5, 10, awx2);
            this.a(iu2, awx2, 3, 6, 2, 3, 6, 12, blg.aO.s(), blg.aO.s(), false);
            this.a(iu2, awx2, 10, 6, 2, 10, 6, 10, blg.aO.s(), blg.aO.s(), false);
            this.a(iu2, awx2, 4, 6, 2, 9, 6, 2, blg.aO.s(), blg.aO.s(), false);
            this.a(iu2, awx2, 4, 6, 12, 8, 6, 12, blg.aO.s(), blg.aO.s(), false);
            this.a(iu2, blg.aO.s(), 9, 6, 11, awx2);
            this.a(iu2, blg.aO.s(), 8, 6, 11, awx2);
            this.a(iu2, blg.aO.s(), 9, 6, 10, awx2);
            dbk dbk2 = blg.au.s().a(def.a, (Comparable)((Object)bqk.d));
            this.a(iu2, dbk2, 10, 1, 13, awx2);
            this.a(iu2, dbk2, 10, 2, 13, awx2);
            this.a(iu2, dbk2, 10, 3, 13, awx2);
            this.a(iu2, dbk2, 10, 4, 13, awx2);
            this.a(iu2, dbk2, 10, 5, 13, awx2);
            this.a(iu2, dbk2, 10, 6, 13, awx2);
            this.a(iu2, dbk2, 10, 7, 13, awx2);
            int n5 = 7;
            int n6 = 7;
            this.a(iu2, blg.aO.s(), 6, 9, 7, awx2);
            this.a(iu2, blg.aO.s(), 7, 9, 7, awx2);
            this.a(iu2, blg.aO.s(), 6, 8, 7, awx2);
            this.a(iu2, blg.aO.s(), 7, 8, 7, awx2);
            this.a(iu2, blg.aO.s(), 6, 7, 7, awx2);
            this.a(iu2, blg.aO.s(), 7, 7, 7, awx2);
            this.a(iu2, blg.aO.s(), 5, 7, 7, awx2);
            this.a(iu2, blg.aO.s(), 8, 7, 7, awx2);
            this.a(iu2, blg.aO.s(), 6, 7, 6, awx2);
            this.a(iu2, blg.aO.s(), 6, 7, 8, awx2);
            this.a(iu2, blg.aO.s(), 7, 7, 6, awx2);
            this.a(iu2, blg.aO.s(), 7, 7, 8, awx2);
            dbk dbk3 = blg.aa.s().a(vl.a, (Comparable)((Object)bqk.b));
            this.a(iu2, dbk3, 5, 8, 7, awx2);
            this.a(iu2, dbk3, 8, 8, 7, awx2);
            this.a(iu2, dbk3, 6, 8, 6, awx2);
            this.a(iu2, dbk3, 6, 8, 8, awx2);
            this.a(iu2, dbk3, 7, 8, 6, awx2);
            this.a(iu2, dbk3, 7, 8, 8, awx2);
        }
        this.a(iu2, awx2, random, 3, 3, 5, bvm.h);
        if (this.a) {
            this.a(iu2, blg.a.s(), 12, 9, 1, awx2);
            this.a(iu2, awx2, random, 12, 8, 1, bvm.h);
        }
        return true;
    }
}

