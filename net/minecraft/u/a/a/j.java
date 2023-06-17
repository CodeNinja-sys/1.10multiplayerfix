/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.u.a.g;
import net.minecraft.u.ad;

public class j
implements g {
    @Override
    public int a() {
        return 111;
    }

    @Override
    public e a(e e2) {
        String string = e2.l("id");
        boolean bl2 = "Painting".equals(string);
        boolean bl3 = "ItemFrame".equals(string);
        if ((bl2 || bl3) && !e2.b("Facing", 99)) {
            ad ad2;
            if (e2.b("Direction", 99)) {
                ad2 = ad.b(e2.f("Direction"));
                e2.a("TileX", e2.h("TileX") + ad2.h());
                e2.a("TileY", e2.h("TileY") + ad2.i());
                e2.a("TileZ", e2.h("TileZ") + ad2.j());
                e2.q("Direction");
                if (bl3 && e2.b("ItemRotation", 99)) {
                    e2.a("ItemRotation", (byte)(e2.f("ItemRotation") * 2));
                }
            } else {
                ad2 = ad.b(e2.f("Dir"));
                e2.q("Dir");
            }
            e2.a("Facing", (byte)ad2.c());
        }
        return e2;
    }
}

