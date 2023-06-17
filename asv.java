/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class asv
extends bis {
    private boolean a;

    public asv() {
    }

    public asv(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = random.nextInt(3) == 0;
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Chest");
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Chest", this.a);
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.b((ud)pc2, list, random, 0, 1, true);
    }

    public static asv a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, bqk2);
        if (!asv.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new asv(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 0, 0, 4, 1, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 4, 5, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 4, 2, 0, 4, 5, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 4, 3, 1, 4, 4, 1, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 3, 3, 4, 4, 3, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 0, 5, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 4, 3, 5, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 3, 4, 1, 4, 4, blg.bz.s(), blg.by.s(), false);
        this.a(iu2, awx2, 3, 3, 4, 3, 4, 4, blg.bz.s(), blg.by.s(), false);
        if (this.a && awx2.a(new cmz(this.a(3, 3), this.a(2), this.b(3, 3)))) {
            this.a = false;
            this.a(iu2, awx2, random, 3, 2, 3, bvm.g);
        }
        this.a(iu2, awx2, 0, 6, 0, 4, 6, 4, blg.by.s(), blg.by.s(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(iu2, blg.by.s(), i2, -1, i3, awx2);
            }
        }
        return true;
    }
}

