/*
 * Decompiled with CFR 0.150.
 */
public class can
extends abb {
    @Override
    public String c(bhl bhl2) {
        return caf.a(anl.c(bhl2).b("splash_potion.effect."));
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.gh, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
        if (!iu2.C) {
            tp tp2 = new tp(iu2, bdl2, bhl2);
            tp2.a(bdl2, bdl2.bb, bdl2.ba, -20.0f, 0.5f, 1.0f);
            iu2.b(tp2);
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }
}

