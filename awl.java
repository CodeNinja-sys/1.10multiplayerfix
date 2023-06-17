/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class awl
extends cdi {
    @Override
    public void a(pc pc2, List list, Random random) {
        bqk bqk2 = this.e();
        if (bqk2 == bqk.c || bqk2 == bqk.f) {
            this.c((afk)pc2, list, random, 1, 1);
        } else {
            this.b((afk)pc2, list, random, 1, 1);
        }
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
            this.a(iu2, awx2, 4, 1, 1, 4, 3, 3, blg.a.s(), blg.a.s(), false);
        } else {
            this.a(iu2, awx2, 0, 1, 1, 0, 3, 3, blg.a.s(), blg.a.s(), false);
        }
        return true;
    }
}

