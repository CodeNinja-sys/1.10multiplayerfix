/*
 * Decompiled with CFR 0.150.
 */
class we
implements cak {
    final /* synthetic */ azd a;

    we(azd azd2) {
        this.a = azd2;
    }

    @Override
    public float a(bhl bhl2, iu iu2, bga bga2) {
        if (bga2 == null) {
            return 0.0f;
        }
        bhl bhl3 = bga2.bG();
        if (bhl3 == null || bhl3.a() != hp.f) {
            return 0.0f;
        }
        return (float)(bhl2.l() - bga2.bH()) / 20.0f;
    }
}

