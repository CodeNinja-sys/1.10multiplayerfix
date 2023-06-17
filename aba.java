/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class aba
extends aue {
    private boolean a;
    private boolean b;

    public aba() {
    }

    public aba(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
        this.a = random.nextInt(2) == 0;
        this.b = random.nextInt(2) == 0;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Left", this.a);
        bvp2.a("Right", this.b);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Left");
        this.b = bvp2.p("Right");
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((afk)pc2, list, random, 1, 1);
        if (this.a) {
            this.b((afk)pc2, list, random, 1, 2);
        }
        if (this.b) {
            this.c((afk)pc2, list, random, 1, 2);
        }
    }

    public static aba a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, bqk2);
        if (!aba.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new aba(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 4, 4, 6, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 1, 1, 0);
        this.a(iu2, random, awx2, bui.a, 1, 1, 6);
        dbk dbk2 = blg.aa.s().a(vl.a, (Comparable)((Object)bqk.f));
        dbk dbk3 = blg.aa.s().a(vl.a, (Comparable)((Object)bqk.e));
        this.a(iu2, awx2, random, 0.1f, 1, 2, 1, dbk2);
        this.a(iu2, awx2, random, 0.1f, 3, 2, 1, dbk3);
        this.a(iu2, awx2, random, 0.1f, 1, 2, 5, dbk2);
        this.a(iu2, awx2, random, 0.1f, 3, 2, 5, dbk3);
        if (this.a) {
            this.a(iu2, awx2, 0, 1, 2, 0, 3, 4, blg.a.s(), blg.a.s(), false);
        }
        if (this.b) {
            this.a(iu2, awx2, 4, 1, 2, 4, 3, 4, blg.a.s(), blg.a.s(), false);
        }
        return true;
    }
}

