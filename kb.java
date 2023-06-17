/*
 * Decompiled with CFR 0.150.
 */
public class kb
implements akc {
    @Override
    public int a() {
        return 113;
    }

    @Override
    public bvp a(bvp bvp2) {
        bmh bmh2;
        if (bvp2.b("HandDropChances", 9) && (bmh2 = bvp2.c("HandDropChances", 5)).b() == 2 && bmh2.f(0) == 0.0f && bmh2.f(1) == 0.0f) {
            bvp2.q("HandDropChances");
        }
        if (bvp2.b("ArmorDropChances", 9) && (bmh2 = bvp2.c("ArmorDropChances", 5)).b() == 4 && bmh2.f(0) == 0.0f && bmh2.f(1) == 0.0f && bmh2.f(2) == 0.0f && bmh2.f(3) == 0.0f) {
            bvp2.q("ArmorDropChances");
        }
        return bvp2;
    }
}

