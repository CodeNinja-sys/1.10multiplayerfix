/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.u.a.g;

public class a
implements g {
    @Override
    public int a() {
        return 147;
    }

    @Override
    public e a(e e2) {
        if ("ArmorStand".equals(e2.l("id")) && e2.p("Silent") && !e2.p("Marker")) {
            e2.q("Silent");
        }
        return e2;
    }
}

