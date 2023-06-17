/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import net.minecraft.e.e;
import net.minecraft.q.b.i;
import net.minecraft.q.b.q;
import net.minecraft.q.f.a.a;
import net.minecraft.q.f.a.g;
import net.minecraft.q.f.b;

public class m {
    public static a a(e e2) {
        int n2 = e2.h("xPos");
        int n3 = e2.h("zPos");
        a a2 = new a(n2, n3);
        a2.g = e2.m("Blocks");
        a2.f = new g(e2.m("Data"), 7);
        a2.e = new g(e2.m("SkyLight"), 7);
        a2.d = new g(e2.m("BlockLight"), 7);
        a2.c = e2.m("HeightMap");
        a2.b = e2.p("TerrainPopulated");
        a2.h = e2.c("Entities", 10);
        a2.i = e2.c("TileEntities", 10);
        a2.j = e2.c("TileTicks", 10);
        try {
            a2.a = e2.i("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            a2.a = e2.h("LastUpdate");
        }
        return a2;
    }

    public static void a(a a2, e e2, i i2) {
        e2.a("xPos", a2.k);
        e2.a("zPos", a2.l);
        e2.a("LastUpdate", a2.a);
        int[] arrn = new int[a2.c.length];
        for (int i3 = 0; i3 < a2.c.length; ++i3) {
            arrn[i3] = a2.c[i3];
        }
        e2.a("HeightMap", arrn);
        e2.a("TerrainPopulated", a2.b);
        net.minecraft.e.q q2 = new net.minecraft.e.q();
        for (int i4 = 0; i4 < 8; ++i4) {
            int n2;
            boolean bl2 = true;
            for (int i5 = 0; i5 < 16 && bl2; ++i5) {
                block3: for (int i6 = 0; i6 < 16 && bl2; ++i6) {
                    for (int i7 = 0; i7 < 16; ++i7) {
                        int n3 = i5 << 11 | i7 << 7 | i6 + (i4 << 4);
                        n2 = a2.g[n3];
                        if (n2 == 0) continue;
                        bl2 = false;
                        continue block3;
                    }
                }
            }
            if (bl2) continue;
            byte[] arrby = new byte[4096];
            b b2 = new b();
            b b3 = new b();
            b b4 = new b();
            for (n2 = 0; n2 < 16; ++n2) {
                for (int i8 = 0; i8 < 16; ++i8) {
                    for (int i9 = 0; i9 < 16; ++i9) {
                        int n4 = n2 << 11 | i9 << 7 | i8 + (i4 << 4);
                        byte by2 = a2.g[n4];
                        arrby[i8 << 8 | i9 << 4 | n2] = (byte)(by2 & 0xFF);
                        b2.a(n2, i8, i9, a2.f.a(n2, i8 + (i4 << 4), i9));
                        b3.a(n2, i8, i9, a2.e.a(n2, i8 + (i4 << 4), i9));
                        b4.a(n2, i8, i9, a2.d.a(n2, i8 + (i4 << 4), i9));
                    }
                }
            }
            e e3 = new e();
            e3.a("Y", (byte)(i4 & 0xFF));
            e3.a("Blocks", arrby);
            e3.a("Data", b2.a());
            e3.a("SkyLight", b3.a());
            e3.a("BlockLight", b4.a());
            q2.a(e3);
        }
        e2.a("Sections", q2);
        byte[] arrby = new byte[256];
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g();
        for (int i10 = 0; i10 < 16; ++i10) {
            for (int i11 = 0; i11 < 16; ++i11) {
                g2.b(a2.k << 4 | i10, 0, a2.l << 4 | i11);
                arrby[i11 << 4 | i10] = (byte)(q.a(i2.a(g2, net.minecraft.a.i.b)) & 0xFF);
            }
        }
        e2.a("Biomes", arrby);
        e2.a("Entities", a2.h);
        e2.a("TileEntities", a2.i);
        if (a2.j != null) {
            e2.a("TileTicks", a2.j);
        }
    }
}

