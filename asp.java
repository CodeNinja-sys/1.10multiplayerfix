/*
 * Decompiled with CFR 0.150.
 */
final class asp
implements cui {
    asp() {
    }

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        bvp bvp3;
        if ("Villager".equals(bvp2.l("id")) && bvp2.b("Offers", 10) && (bvp3 = bvp2.o("Offers")).b("Recipes", 9)) {
            bmh bmh2 = bvp3.c("Recipes", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp4 = bmh2.b(i2);
                ccz.a(bzs2, bvp4, n2, "buy");
                ccz.a(bzs2, bvp4, n2, "buyB");
                ccz.a(bzs2, bvp4, n2, "sell");
                bmh2.a(i2, bvp4);
            }
        }
        return bvp2;
    }
}

