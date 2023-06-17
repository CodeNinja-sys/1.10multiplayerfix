/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cwf
extends azg {
    private final cns a;

    public cwf(cns cns2) {
        this.a = cns2;
        this.k = 1;
        this.a(zm.e);
        this.b("boat." + cns2.a());
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        Object object;
        float f2 = 1.0f;
        float f3 = bdl2.bd + (bdl2.bb - bdl2.bd) * 1.0f;
        float f4 = bdl2.bc + (bdl2.ba - bdl2.bc) * 1.0f;
        double d2 = bdl2.aR + (bdl2.aU - bdl2.aR) * 1.0;
        double d3 = bdl2.aS + (bdl2.aV - bdl2.aS) * 1.0 + (double)bdl2.A();
        double d4 = bdl2.aT + (bdl2.aW - bdl2.aT) * 1.0;
        amj amj2 = new amj(d2, d3, d4);
        float f5 = cmk.b(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = cmk.a(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f7 = -cmk.b(-f3 * ((float)Math.PI / 180));
        float f8 = cmk.a(-f3 * ((float)Math.PI / 180));
        float f9 = f6 * f7;
        float f10 = f8;
        float f11 = f5 * f7;
        double d5 = 5.0;
        amj amj3 = amj2.b((double)f9 * 5.0, (double)f10 * 5.0, (double)f11 * 5.0);
        auu auu2 = iu2.a(amj2, amj3, true);
        if (auu2 == null) {
            return new wx(cey.b, bhl2);
        }
        amj amj4 = bdl2.l(1.0f);
        boolean bl2 = false;
        List list = iu2.b((cpk)bdl2, bdl2.cD().a(amj4.b * 5.0, amj4.c * 5.0, amj4.d * 5.0).b(1.0));
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cpk cpk2 = (cpk)list.get(i2);
            if (!cpk2.bc_() || !((cxt)(object = cpk2.cD().b(cpk2.ap_()))).a(amj2)) continue;
            bl2 = true;
        }
        if (bl2) {
            return new wx(cey.b, bhl2);
        }
        if (auu2.a == bmw.b) {
            bfa bfa2 = iu2.n(auu2.a()).t();
            boolean bl3 = bfa2 == blg.j || bfa2 == blg.i;
            object = new cor(iu2, auu2.c.b, bl3 ? auu2.c.c - 0.12 : auu2.c.c, auu2.c.d);
            ((cor)object).a(this.a);
            ((cor)object).ba = bdl2.ba;
            if (!iu2.a((cpk)object, ((cpk)object).cD().b(-0.1)).isEmpty()) {
                return new wx(cey.c, bhl2);
            }
            if (!iu2.C) {
                iu2.b((cpk)object);
            }
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            bdl2.a(bpv.b(this));
            return new wx(cey.a, bhl2);
        }
        return new wx(cey.b, bhl2);
    }
}

