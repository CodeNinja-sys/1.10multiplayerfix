/*
 * Decompiled with CFR 0.150.
 */
public class aid
implements akc {
    @Override
    public int a() {
        return 110;
    }

    @Override
    public bvp a(bvp bvp2) {
        if ("EntityHorse".equals(bvp2.l("id")) && !bvp2.b("SaddleItem", 10) && bvp2.p("Saddle")) {
            bvp bvp3 = new bvp();
            bvp3.a("id", "minecraft:saddle");
            bvp3.a("Count", (byte)1);
            bvp3.a("Damage", (short)0);
            bvp2.a("SaddleItem", bvp3);
            bvp2.q("Saddle");
        }
        return bvp2;
    }
}

