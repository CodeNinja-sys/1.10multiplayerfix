/*
 * Decompiled with CFR 0.150.
 */
public class lx {
    public static dfi a(bvp bvp2) {
        int n2 = bvp2.h("xPos");
        int n3 = bvp2.h("zPos");
        dfi dfi2 = new dfi(n2, n3);
        dfi2.g = bvp2.m("Blocks");
        dfi2.f = new cwr(bvp2.m("Data"), 7);
        dfi2.e = new cwr(bvp2.m("SkyLight"), 7);
        dfi2.d = new cwr(bvp2.m("BlockLight"), 7);
        dfi2.c = bvp2.m("HeightMap");
        dfi2.b = bvp2.p("TerrainPopulated");
        dfi2.h = bvp2.c("Entities", 10);
        dfi2.i = bvp2.c("TileEntities", 10);
        dfi2.j = bvp2.c("TileTicks", 10);
        try {
            dfi2.a = bvp2.i("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            dfi2.a = bvp2.h("LastUpdate");
        }
        return dfi2;
    }

    public static void a(dfi dfi2, bvp bvp2, ey ey2) {
        int n2;
        bvp2.a("xPos", dfi2.k);
        bvp2.a("zPos", dfi2.l);
        bvp2.a("LastUpdate", dfi2.a);
        int[] arrn = new int[dfi2.c.length];
        for (int i2 = 0; i2 < dfi2.c.length; ++i2) {
            arrn[i2] = dfi2.c[i2];
        }
        bvp2.a("HeightMap", arrn);
        bvp2.a("TerrainPopulated", dfi2.b);
        bmh bmh2 = new bmh();
        for (int i3 = 0; i3 < 8; ++i3) {
            int n3;
            boolean bl2 = true;
            for (n2 = 0; n2 < 16 && bl2; ++n2) {
                block3: for (int i4 = 0; i4 < 16 && bl2; ++i4) {
                    for (int i5 = 0; i5 < 16; ++i5) {
                        int n4 = n2 << 11 | i5 << 7 | i4 + (i3 << 4);
                        n3 = dfi2.g[n4];
                        if (n3 == 0) continue;
                        bl2 = false;
                        continue block3;
                    }
                }
            }
            if (bl2) continue;
            byte[] arrby = new byte[4096];
            ama ama2 = new ama();
            ama ama3 = new ama();
            ama ama4 = new ama();
            for (n3 = 0; n3 < 16; ++n3) {
                for (int i6 = 0; i6 < 16; ++i6) {
                    for (int i7 = 0; i7 < 16; ++i7) {
                        int n5 = n3 << 11 | i7 << 7 | i6 + (i3 << 4);
                        byte by2 = dfi2.g[n5];
                        arrby[i6 << 8 | i7 << 4 | n3] = (byte)(by2 & 0xFF);
                        ama2.a(n3, i6, i7, dfi2.f.a(n3, i6 + (i3 << 4), i7));
                        ama3.a(n3, i6, i7, dfi2.e.a(n3, i6 + (i3 << 4), i7));
                        ama4.a(n3, i6, i7, dfi2.d.a(n3, i6 + (i3 << 4), i7));
                    }
                }
            }
            bvp bvp3 = new bvp();
            bvp3.a("Y", (byte)(i3 & 0xFF));
            bvp3.a("Blocks", arrby);
            bvp3.a("Data", ama2.a());
            bvp3.a("SkyLight", ama3.a());
            bvp3.a("BlockLight", ama4.a());
            bmh2.a(bvp3);
        }
        bvp2.a("Sections", bmh2);
        byte[] arrby = new byte[256];
        pj pj2 = new pj();
        for (n2 = 0; n2 < 16; ++n2) {
            for (int i8 = 0; i8 < 16; ++i8) {
                pj2.a(dfi2.k << 4 | n2, 0, dfi2.l << 4 | i8);
                arrby[i8 << 4 | n2] = (byte)(anr.a(ey2.a(pj2, cff.b)) & 0xFF);
            }
        }
        bvp2.a("Biomes", arrby);
        bvp2.a("Entities", dfi2.h);
        bvp2.a("TileEntities", dfi2.i);
        if (dfi2.j != null) {
            bvp2.a("TileTicks", dfi2.j);
        }
    }
}

