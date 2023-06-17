/*
 * Decompiled with CFR 0.150.
 */
public class aur
extends aeu {
    public aur(int n2, float f2) {
        super(n2, f2, false);
    }

    @Override
    public bhl a(bhl bhl2, iu iu2, bga bga2) {
        bhl bhl3 = super.a(bhl2, iu2, bga2);
        if (!iu2.C) {
            double d2 = bga2.aU;
            double d3 = bga2.aV;
            double d4 = bga2.aW;
            for (int i2 = 0; i2 < 16; ++i2) {
                double d5 = bga2.aU + (bga2.aW().nextDouble() - 0.5) * 16.0;
                double d6 = cmk.a(bga2.aV + (double)(bga2.aW().nextInt(16) - 8), 0.0, (double)(iu2.L() - 1));
                double d7 = bga2.aW + (bga2.aW().nextDouble() - 0.5) * 16.0;
                if (bga2.cp()) {
                    bga2.s_();
                }
                if (!bga2.g(d5, d6, d7)) continue;
                iu2.a(null, d2, d3, d4, dah.af, csg.h, 1.0f, 1.0f);
                bga2.a(dah.af, 1.0f, 1.0f);
                break;
            }
            if (bga2 instanceof bdl) {
                ((bdl)bga2).aS().a((azg)this, 20);
            }
        }
        return bhl3;
    }
}

