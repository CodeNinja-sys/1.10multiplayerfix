/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class arh
extends aue {
    public arh() {
    }

    public arh(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((afk)pc2, list, random, 1, 1);
    }

    public static arh a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -7, 0, 5, 11, 8, bqk2);
        if (!arh.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new arh(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 4, 10, 7, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 1, 7, 0);
        this.a(iu2, random, awx2, bui.a, 1, 1, 7);
        dbk dbk2 = blg.aw.s().a(qi.a, (Comparable)((Object)bqk.d));
        for (int i2 = 0; i2 < 6; ++i2) {
            this.a(iu2, dbk2, 1, 6 - i2, 1 + i2, awx2);
            this.a(iu2, dbk2, 2, 6 - i2, 1 + i2, awx2);
            this.a(iu2, dbk2, 3, 6 - i2, 1 + i2, awx2);
            if (i2 >= 5) continue;
            this.a(iu2, blg.bf.s(), 1, 5 - i2, 1 + i2, awx2);
            this.a(iu2, blg.bf.s(), 2, 5 - i2, 1 + i2, awx2);
            this.a(iu2, blg.bf.s(), 3, 5 - i2, 1 + i2, awx2);
        }
        return true;
    }
}

