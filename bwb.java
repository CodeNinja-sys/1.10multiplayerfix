/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bwb
extends aue {
    private int a;

    public bwb() {
    }

    public bwb(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = bqk2 == bqk.c || bqk2 == bqk.d ? awx2.e() : awx2.c();
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Steps", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.h("Steps");
    }

    public static awx a(List list, Random random, int n2, int n3, int n4, bqk bqk2) {
        int n5 = 3;
        awx awx2 = awx.a(n2, n3, n4, -1, -1, 0, 5, 5, 4, bqk2);
        pc pc2 = pc.a(list, awx2);
        if (pc2 == null) {
            return null;
        }
        if (pc2.b().b == awx2.b) {
            for (int i2 = 3; i2 >= 1; --i2) {
                awx2 = awx.a(n2, n3, n4, -1, -1, 0, 5, 5, i2 - 1, bqk2);
                if (pc2.b().a(awx2)) continue;
                return awx.a(n2, n3, n4, -1, -1, 0, 5, 5, i2, bqk2);
            }
        }
        return null;
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.a(iu2, blg.bf.s(), 0, 0, i2, awx2);
            this.a(iu2, blg.bf.s(), 1, 0, i2, awx2);
            this.a(iu2, blg.bf.s(), 2, 0, i2, awx2);
            this.a(iu2, blg.bf.s(), 3, 0, i2, awx2);
            this.a(iu2, blg.bf.s(), 4, 0, i2, awx2);
            for (int i3 = 1; i3 <= 3; ++i3) {
                this.a(iu2, blg.bf.s(), 0, i3, i2, awx2);
                this.a(iu2, blg.a.s(), 1, i3, i2, awx2);
                this.a(iu2, blg.a.s(), 2, i3, i2, awx2);
                this.a(iu2, blg.a.s(), 3, i3, i2, awx2);
                this.a(iu2, blg.bf.s(), 4, i3, i2, awx2);
            }
            this.a(iu2, blg.bf.s(), 0, 4, i2, awx2);
            this.a(iu2, blg.bf.s(), 1, 4, i2, awx2);
            this.a(iu2, blg.bf.s(), 2, 4, i2, awx2);
            this.a(iu2, blg.bf.s(), 3, 4, i2, awx2);
            this.a(iu2, blg.bf.s(), 4, 4, i2, awx2);
        }
        return true;
    }
}

