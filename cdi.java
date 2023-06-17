/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cdi
extends aue {
    public cdi() {
    }

    public cdi(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        bqk bqk2 = this.e();
        if (bqk2 == bqk.c || bqk2 == bqk.f) {
            this.b((afk)pc2, list, random, 1, 1);
        } else {
            this.c((afk)pc2, list, random, 1, 1);
        }
    }

    public static cdi a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -1, 0, 5, 5, 5, bqk2);
        if (!cdi.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new cdi(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 4, 4, 4, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 1, 1, 0);
        bqk bqk2 = this.e();
        if (bqk2 == bqk.c || bqk2 == bqk.f) {
            this.a(iu2, awx2, 0, 1, 1, 0, 3, 3, blg.a.s(), blg.a.s(), false);
        } else {
            this.a(iu2, awx2, 4, 1, 1, 4, 3, 3, blg.a.s(), blg.a.s(), false);
        }
        return true;
    }
}

