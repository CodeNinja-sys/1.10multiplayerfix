/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bmp
extends aue {
    private boolean a;

    public bmp() {
    }

    public bmp(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
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
    public void a(pc pc2, List list, Random random) {
        this.a((afk)pc2, list, random, 1, 1);
    }

    public static bmp a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, bqk2);
        if (!bmp.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bmp(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 4, 4, 6, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 1, 1, 0);
        this.a(iu2, random, awx2, bui.a, 1, 1, 6);
        this.a(iu2, awx2, 3, 1, 2, 3, 1, 4, blg.bf.s(), blg.bf.s(), false);
        this.a(iu2, blg.U.a(cev.f.b()), 3, 1, 1, awx2);
        this.a(iu2, blg.U.a(cev.f.b()), 3, 1, 5, awx2);
        this.a(iu2, blg.U.a(cev.f.b()), 3, 2, 2, awx2);
        this.a(iu2, blg.U.a(cev.f.b()), 3, 2, 4, awx2);
        for (int i2 = 2; i2 <= 4; ++i2) {
            this.a(iu2, blg.U.a(cev.f.b()), 2, 1, i2, awx2);
        }
        if (!this.a && awx2.a(new cmz(this.a(3, 3), this.a(2), this.b(3, 3)))) {
            this.a = true;
            this.a(iu2, awx2, random, 3, 2, 3, bvm.j);
        }
        return true;
    }
}

