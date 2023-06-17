/*
 * Decompiled with CFR 0.150.
 */
final class gq
implements cui {
    gq() {
    }

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        if ("MinecartSpawner".equals(bvp2.l("id"))) {
            bvp2.a("id", "MobSpawner");
            bzs2.a(bst.d, bvp2, n2);
            bvp2.a("id", "MinecartSpawner");
        }
        return bvp2;
    }
}

