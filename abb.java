/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class abb
extends azg {
    public abb() {
        this.d(1);
        this.a(zm.k);
    }

    @Override
    public bhl a(bhl bhl2, iu iu2, bga bga2) {
        bdl bdl2;
        bdl bdl3 = bdl2 = bga2 instanceof bdl ? (bdl)bga2 : null;
        if (bdl2 == null || !bdl2.G.d) {
            --bhl2.b;
        }
        if (!iu2.C) {
            List list = anl.a(bhl2);
            for (cko cko2 : list) {
                bga2.b(new cko(cko2));
            }
        }
        if (bdl2 != null) {
            bdl2.a(bpv.b(this));
        }
        if (bdl2 == null || !bdl2.G.d) {
            if (bhl2.b <= 0) {
                return new bhl(hp.bJ);
            }
            if (bdl2 != null) {
                bdl2.n.c(new bhl(hp.bJ));
            }
        }
        return bhl2;
    }

    @Override
    public int e_(bhl bhl2) {
        return 32;
    }

    @Override
    public cga d_(bhl bhl2) {
        return cga.c;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        bdl2.b(bqp2);
        return new wx(cey.a, bhl2);
    }

    @Override
    public String c(bhl bhl2) {
        return caf.a(anl.c(bhl2).b("potion.effect."));
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        anl.a(bhl2, list, 1.0f);
    }

    @Override
    public boolean a(bhl bhl2) {
        return !anl.a(bhl2).isEmpty();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (hy hy2 : hy.a) {
            list.add(anl.a(new bhl(azg2), hy2));
        }
    }
}

