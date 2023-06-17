/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.List;

public class fs
extends azg {
    public fs() {
        this.a(zm.k);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        List list = iu2.a(gw.class, bdl2.cD().b(2.0), (cm)new avu(this));
        if (!list.isEmpty()) {
            gw gw2 = (gw)list.get(0);
            gw2.c(gw2.f() - 0.5f);
            iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.J, csg.g, 1.0f, 1.0f);
            return new wx(cey.a, this.a(bhl2, bdl2, new bhl(hp.bK)));
        }
        auu auu2 = this.a(iu2, bdl2, true);
        if (auu2 == null) {
            return new wx(cey.b, bhl2);
        }
        if (auu2.a == bmw.b) {
            cmz cmz2 = auu2.a();
            if (!iu2.a(bdl2, cmz2) || !bdl2.a(cmz2.c(auu2.b), auu2.b, bhl2)) {
                return new wx(cey.b, bhl2);
            }
            if (iu2.n(cmz2).a() == ahk.h) {
                iu2.a(bdl2, bdl2.aU, bdl2.aV, bdl2.aW, dah.I, csg.g, 1.0f, 1.0f);
                return new wx(cey.a, this.a(bhl2, bdl2, new bhl(hp.bG)));
            }
        }
        return new wx(cey.b, bhl2);
    }

    protected bhl a(bhl bhl2, bdl bdl2, bhl bhl3) {
        --bhl2.b;
        bdl2.a(bpv.b(this));
        if (bhl2.b <= 0) {
            return bhl3;
        }
        if (!bdl2.n.c(bhl3)) {
            bdl2.a(bhl3, false);
        }
        return bhl2;
    }
}

