/*
 * Decompiled with CFR 0.150.
 */
public class cbt
implements akc {
    @Override
    public int a() {
        return 147;
    }

    @Override
    public bvp a(bvp bvp2) {
        if ("ArmorStand".equals(bvp2.l("id")) && bvp2.p("Silent") && !bvp2.p("Marker")) {
            bvp2.q("Silent");
        }
        return bvp2;
    }
}

