/*
 * Decompiled with CFR 0.150.
 */
final class bjo
implements cui {
    bjo() {
    }

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        if ("MobSpawner".equals(bvp2.l("id"))) {
            if (bvp2.b("SpawnPotentials", 9)) {
                bmh bmh2 = bvp2.c("SpawnPotentials", 10);
                for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                    bvp bvp3 = bmh2.b(i2);
                    bvp3.a("Entity", bzs2.a(bst.e, bvp3.o("Entity"), n2));
                }
            }
            bvp2.a("SpawnData", bzs2.a(bst.e, bvp2.o("SpawnData"), n2));
        }
        return bvp2;
    }
}

