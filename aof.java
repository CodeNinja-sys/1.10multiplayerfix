/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class aof
extends bis {
    public aof() {
    }

    public aof(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 2, 0, false);
        this.b((ud)pc2, list, random, 0, 2, false);
        this.c((ud)pc2, list, random, 0, 2, false);
    }

    public static aof a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -2, 0, 0, 7, 9, 7, bqk2);
        if (!aof.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new aof(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 0, 0, 6, 1, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 6, 7, 6, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 1, 6, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 6, 1, 6, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 2, 0, 6, 6, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 5, 2, 6, 6, 6, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 0, 6, 1, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 5, 0, 6, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 2, 0, 6, 6, 1, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 2, 5, 6, 6, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 6, 0, 4, 6, 0, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 0, 4, 5, 0, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 2, 6, 6, 4, 6, 6, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 2, 5, 6, 4, 5, 6, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 6, 2, 0, 6, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 5, 2, 0, 5, 4, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 6, 6, 2, 6, 6, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 6, 5, 2, 6, 5, 4, blg.bz.s(), blg.bz.s(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(iu2, blg.by.s(), i2, -1, i3, awx2);
            }
        }
        return true;
    }
}

