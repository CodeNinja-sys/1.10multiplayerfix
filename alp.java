/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class alp
extends aue {
    public alp() {
    }

    public alp(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((afk)pc2, list, random, 1, 1);
    }

    public static alp a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -1, 0, 9, 5, 11, bqk2);
        if (!alp.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new alp(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 8, 4, 10, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 1, 1, 0);
        this.a(iu2, awx2, 1, 1, 10, 3, 3, 10, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 4, 1, 1, 4, 3, 1, false, random, bbj.c());
        this.a(iu2, awx2, 4, 1, 3, 4, 3, 3, false, random, bbj.c());
        this.a(iu2, awx2, 4, 1, 7, 4, 3, 7, false, random, bbj.c());
        this.a(iu2, awx2, 4, 1, 9, 4, 3, 9, false, random, bbj.c());
        this.a(iu2, awx2, 4, 1, 4, 4, 3, 6, blg.bi.s(), blg.bi.s(), false);
        this.a(iu2, awx2, 5, 1, 5, 7, 3, 5, blg.bi.s(), blg.bi.s(), false);
        this.a(iu2, blg.bi.s(), 4, 3, 2, awx2);
        this.a(iu2, blg.bi.s(), 4, 3, 8, awx2);
        dbk dbk2 = blg.aA.s().a(xt.a, (Comparable)((Object)bqk.e));
        dbk dbk3 = blg.aA.s().a(xt.a, (Comparable)((Object)bqk.e)).a(xt.e, (Comparable)((Object)em.a));
        this.a(iu2, dbk2, 4, 1, 2, awx2);
        this.a(iu2, dbk3, 4, 2, 2, awx2);
        this.a(iu2, dbk2, 4, 1, 8, awx2);
        this.a(iu2, dbk3, 4, 2, 8, awx2);
        return true;
    }
}

