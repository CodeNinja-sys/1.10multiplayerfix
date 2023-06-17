/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class daj
extends aue {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean e;

    public daj() {
    }

    public daj(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
        this.a = random.nextBoolean();
        this.b = random.nextBoolean();
        this.c = random.nextBoolean();
        this.e = random.nextInt(3) > 0;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("leftLow", this.a);
        bvp2.a("leftHigh", this.b);
        bvp2.a("rightLow", this.c);
        bvp2.a("rightHigh", this.e);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("leftLow");
        this.b = bvp2.p("leftHigh");
        this.c = bvp2.p("rightLow");
        this.e = bvp2.p("rightHigh");
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        int n2 = 3;
        int n3 = 5;
        bqk bqk2 = this.e();
        if (bqk2 == bqk.e || bqk2 == bqk.c) {
            n2 = 8 - n2;
            n3 = 8 - n3;
        }
        this.a((afk)pc2, list, random, 5, 1);
        if (this.a) {
            this.b((afk)pc2, list, random, n2, 1);
        }
        if (this.b) {
            this.b((afk)pc2, list, random, n3, 7);
        }
        if (this.c) {
            this.c((afk)pc2, list, random, n2, 1);
        }
        if (this.e) {
            this.c((afk)pc2, list, random, n3, 7);
        }
    }

    public static daj a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -4, -3, 0, 10, 9, 11, bqk2);
        if (!daj.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new daj(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 9, 8, 10, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 4, 3, 0);
        if (this.a) {
            this.a(iu2, awx2, 0, 3, 1, 0, 5, 3, blg.a.s(), blg.a.s(), false);
        }
        if (this.c) {
            this.a(iu2, awx2, 9, 3, 1, 9, 5, 3, blg.a.s(), blg.a.s(), false);
        }
        if (this.b) {
            this.a(iu2, awx2, 0, 5, 7, 0, 7, 9, blg.a.s(), blg.a.s(), false);
        }
        if (this.e) {
            this.a(iu2, awx2, 9, 5, 7, 9, 7, 9, blg.a.s(), blg.a.s(), false);
        }
        this.a(iu2, awx2, 5, 1, 10, 7, 3, 10, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 2, 1, 8, 2, 6, false, random, bbj.c());
        this.a(iu2, awx2, 4, 1, 5, 4, 4, 9, false, random, bbj.c());
        this.a(iu2, awx2, 8, 1, 5, 8, 4, 9, false, random, bbj.c());
        this.a(iu2, awx2, 1, 4, 7, 3, 4, 9, false, random, bbj.c());
        this.a(iu2, awx2, 1, 3, 5, 3, 3, 6, false, random, bbj.c());
        this.a(iu2, awx2, 1, 3, 4, 3, 3, 4, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 1, 4, 6, 3, 4, 6, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 5, 1, 7, 7, 1, 8, false, random, bbj.c());
        this.a(iu2, awx2, 5, 1, 9, 7, 1, 9, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 5, 2, 7, 7, 2, 7, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 4, 5, 7, 4, 5, 9, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 8, 5, 7, 8, 5, 9, blg.U.s(), blg.U.s(), false);
        this.a(iu2, awx2, 5, 5, 7, 7, 5, 9, blg.T.s(), blg.T.s(), false);
        this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.d)), 6, 5, 6, awx2);
        return true;
    }
}

