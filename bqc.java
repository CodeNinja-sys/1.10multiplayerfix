/*
 * Decompiled with CFR 0.150.
 */
final class bqc
implements cui {
    bqc() {
    }

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        if (bvp2.b("Level", 10)) {
            int n3;
            bmh bmh2;
            bvp bvp3 = bvp2.o("Level");
            if (bvp3.b("Entities", 9)) {
                bmh2 = bvp3.c("Entities", 10);
                for (n3 = 0; n3 < bmh2.b(); ++n3) {
                    bmh2.a(n3, bzs2.a(bst.e, (bvp)bmh2.h(n3), n2));
                }
            }
            if (bvp3.b("TileEntities", 9)) {
                bmh2 = bvp3.c("TileEntities", 10);
                for (n3 = 0; n3 < bmh2.b(); ++n3) {
                    bmh2.a(n3, bzs2.a(bst.d, (bvp)bmh2.h(n3), n2));
                }
            }
        }
        return bvp2;
    }
}

