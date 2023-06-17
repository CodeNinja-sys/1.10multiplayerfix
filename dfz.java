/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class dfz
extends bis {
    public dfz() {
    }

    public dfz(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((ud)pc2, list, random, 1, 0, true);
    }

    public static dfz a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, bqk2);
        if (!dfz.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new dfz(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.a(iu2, awx2, 0, 0, 0, 4, 1, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 4, 5, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 2, 0, 0, 5, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 4, 2, 0, 4, 5, 4, blg.by.s(), blg.by.s(), false);
        this.a(iu2, awx2, 0, 3, 1, 0, 4, 1, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 3, 3, 0, 4, 3, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 3, 1, 4, 4, 1, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 4, 3, 3, 4, 4, 3, blg.bz.s(), blg.bz.s(), false);
        this.a(iu2, awx2, 0, 6, 0, 4, 6, 4, blg.by.s(), blg.by.s(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(iu2, blg.by.s(), i2, -1, i3, awx2);
            }
        }
        return true;
    }
}

