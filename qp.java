/*
 * Decompiled with CFR 0.150.
 */
public class qp
implements akc {
    @Override
    public int a() {
        return 107;
    }

    @Override
    public bvp a(bvp bvp2) {
        Object object;
        if (!"MobSpawner".equals(bvp2.l("id"))) {
            return bvp2;
        }
        if (bvp2.b("EntityId", 8)) {
            object = bvp2.l("EntityId");
            bvp bvp3 = bvp2.o("SpawnData");
            bvp3.a("id", (String)(((String)object).isEmpty() ? "Pig" : object));
            bvp2.a("SpawnData", bvp3);
            bvp2.q("EntityId");
        }
        if (bvp2.b("SpawnPotentials", 9)) {
            object = bvp2.c("SpawnPotentials", 10);
            for (int i2 = 0; i2 < ((bmh)object).b(); ++i2) {
                bvp bvp4 = ((bmh)object).b(i2);
                if (!bvp4.b("Type", 8)) continue;
                bvp bvp5 = bvp4.o("Properties");
                bvp5.a("id", bvp4.l("Type"));
                bvp4.a("Entity", bvp5);
                bvp4.q("Type");
                bvp4.q("Properties");
            }
        }
        return bvp2;
    }
}

