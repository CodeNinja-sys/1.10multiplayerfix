/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bfs
extends bis {
    private boolean a;

    public bfs() {
    }

    public bfs(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Mob");
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Mob", this.a);
    }

    public static bfs a(List list, Random random, int n2, int n3, int n4, int n5, bqk bqk2) {
        awx awx2 = awx.a(n2, n3, n4, -2, 0, 0, 7, 8, 9, bqk2);
        if (!bfs.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bfs(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        cmz cmz2;
        this.a(iu2, awx2, 0, 2, 0, 6, 7, 7, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 0, 0, 5, 1, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 2, 1, 5, 2, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 3, 2, 5, 3, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 4, 3, 5, 4, 7, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 2, 0, 1, 4, 2, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 2, 0, 5, 4, 2, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 5, 2, 1, 5, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 5, 2, 5, 5, 3, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 5, 3, 0, 5, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 5, 3, 6, 5, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 1, 5, 8, 5, 5, 8, blg.by.s(), blg.by.s(), false);
        this.a(iu2, blg.bz.s(), 1, 6, 3, awx2);
        this.a(iu2, blg.bz.s(), 5, 6, 3, awx2);
        this.a(iu2, awx2, 0, 6, 3, 0, 6, 8, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 6, 6, 3, 6, 6, 8, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 1, 6, 8, 5, 7, 8, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 2, 8, 8, 4, 8, 8, blg.bz.s(), blg.bz.s(), false);
        if (!this.a && awx2.a(cmz2 = new cmz(this.a(3, 5), this.a(5), this.b(3, 5)))) {
            this.a = true;
            iu2.a(cmz2, blg.ac.s(), 2);
            bql bql2 = iu2.q(cmz2);
            if (bql2 instanceof ze) {
                ((ze)bql2).d().a("Blaze");
            }
        }
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(iu2, blg.by.s(), i2, -1, i3, awx2);
            }
        }
        return true;
    }
}

