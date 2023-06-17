/*
 * Decompiled with CFR 0.150.
 */
public class cjq
implements akc {
    @Override
    public int a() {
        return 111;
    }

    @Override
    public bvp a(bvp bvp2) {
        String string = bvp2.l("id");
        boolean bl2 = "Painting".equals(string);
        boolean bl3 = "ItemFrame".equals(string);
        if ((bl2 || bl3) && !bvp2.b("Facing", 99)) {
            bqk bqk2;
            if (bvp2.b("Direction", 99)) {
                bqk2 = bqk.b(bvp2.f("Direction"));
                bvp2.a("TileX", bvp2.h("TileX") + bqk2.h());
                bvp2.a("TileY", bvp2.h("TileY") + bqk2.i());
                bvp2.a("TileZ", bvp2.h("TileZ") + bqk2.j());
                bvp2.q("Direction");
                if (bl3 && bvp2.b("ItemRotation", 99)) {
                    bvp2.a("ItemRotation", (byte)(bvp2.f("ItemRotation") * 2));
                }
            } else {
                bqk2 = bqk.b(bvp2.f("Dir"));
                bvp2.q("Dir");
            }
            bvp2.a("Facing", (byte)bqk2.c());
        }
        return bvp2;
    }
}

