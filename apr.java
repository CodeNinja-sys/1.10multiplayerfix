/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class apr
extends aue {
    private boolean a;

    public apr() {
    }

    public apr(int n2, Random random, int n3, int n4) {
        super(n2);
        this.a = true;
        this.a(afj.a.a(random));
        this.d = bui.a;
        this.l = this.e().l() == ctv.c ? new awx(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1) : new awx(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
    }

    public apr(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a = false;
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Source", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Source");
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        if (this.a) {
            bbj.a(daj.class);
        }
        this.a((afk)pc2, list, random, 1, 1);
    }

    public static apr a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -7, 0, 5, 11, 5, bqk2);
        if (!apr.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new apr(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 4, 10, 4, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 1, 7, 0);
        this.a(iu2, random, awx2, bui.a, 1, 1, 4);
        this.a(iu2, blg.bf.s(), 2, 6, 1, awx2);
        this.a(iu2, blg.bf.s(), 1, 5, 1, awx2);
        this.a(iu2, blg.U.a(cev.a.b()), 1, 6, 1, awx2);
        this.a(iu2, blg.bf.s(), 1, 5, 2, awx2);
        this.a(iu2, blg.bf.s(), 1, 4, 3, awx2);
        this.a(iu2, blg.U.a(cev.a.b()), 1, 5, 3, awx2);
        this.a(iu2, blg.bf.s(), 2, 4, 3, awx2);
        this.a(iu2, blg.bf.s(), 3, 3, 3, awx2);
        this.a(iu2, blg.U.a(cev.a.b()), 3, 4, 3, awx2);
        this.a(iu2, blg.bf.s(), 3, 3, 2, awx2);
        this.a(iu2, blg.bf.s(), 3, 2, 1, awx2);
        this.a(iu2, blg.U.a(cev.a.b()), 3, 3, 1, awx2);
        this.a(iu2, blg.bf.s(), 2, 2, 1, awx2);
        this.a(iu2, blg.bf.s(), 1, 1, 1, awx2);
        this.a(iu2, blg.U.a(cev.a.b()), 1, 2, 1, awx2);
        this.a(iu2, blg.bf.s(), 1, 1, 2, awx2);
        this.a(iu2, blg.U.a(cev.a.b()), 1, 1, 3, awx2);
        return true;
    }
}

