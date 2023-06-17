/*
 * Decompiled with CFR 0.150.
 */
class bzi
implements cak {
    final /* synthetic */ bic a;

    bzi(bic bic2) {
        this.a = bic2;
    }

    @Override
    public float a(bhl bhl2, iu iu2, bga bga2) {
        if (bga2 == null) {
            return 0.0f;
        }
        return bga2.bt() == bhl2 && bga2 instanceof bdl && ((bdl)bga2).M != null ? 1.0f : 0.0f;
    }
}

