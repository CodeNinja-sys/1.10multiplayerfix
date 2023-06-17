/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public final class cen {
    public static auu a(cpk cpk2, boolean bl2, boolean bl3, cpk cpk3) {
        double d2 = cpk2.aU;
        double d3 = cpk2.aV;
        double d4 = cpk2.aW;
        double d5 = cpk2.aX;
        double d6 = cpk2.aY;
        double d7 = cpk2.aZ;
        iu iu2 = cpk2.aQ;
        amj amj2 = new amj(d2, d3, d4);
        amj amj3 = new amj(d2 + d5, d3 + d6, d4 + d7);
        auu auu2 = iu2.a(amj2, amj3, false, true, false);
        if (bl2) {
            if (auu2 != null) {
                amj3 = new amj(auu2.c.b, auu2.c.c, auu2.c.d);
            }
            cpk cpk4 = null;
            List list = iu2.b(cpk2, cpk2.cD().a(d5, d6, d7).b(1.0));
            double d8 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d9;
                cxt cxt2;
                auu auu3;
                cpk cpk5 = (cpk)list.get(i2);
                if (!cpk5.bc_() || !bl3 && cpk5.g_(cpk3) || cpk5.bv || (auu3 = (cxt2 = cpk5.cD().b(0.3f)).b(amj2, amj3)) == null || !((d9 = amj2.g(auu3.c)) < d8) && d8 != 0.0) continue;
                cpk4 = cpk5;
                d8 = d9;
            }
            if (cpk4 != null) {
                auu2 = new auu(cpk4);
            }
        }
        return auu2;
    }

    public static final void a(cpk cpk2, float f2) {
        double d2 = cpk2.aX;
        double d3 = cpk2.aY;
        double d4 = cpk2.aZ;
        float f3 = cmk.a(d2 * d2 + d4 * d4);
        cpk2.ba = (float)(cmk.b(d4, d2) * 57.2957763671875) + 90.0f;
        cpk2.bb = (float)(cmk.b((double)f3, d3) * 57.2957763671875) - 90.0f;
        while (cpk2.bb - cpk2.bd < -180.0f) {
            cpk2.bd -= 360.0f;
        }
        while (cpk2.bb - cpk2.bd >= 180.0f) {
            cpk2.bd += 360.0f;
        }
        while (cpk2.ba - cpk2.bc < -180.0f) {
            cpk2.bc -= 360.0f;
        }
        while (cpk2.ba - cpk2.bc >= 180.0f) {
            cpk2.bc += 360.0f;
        }
        cpk2.bb = cpk2.bd + (cpk2.bb - cpk2.bd) * f2;
        cpk2.ba = cpk2.bc + (cpk2.ba - cpk2.bc) * f2;
    }
}

