/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.u.a.c;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

class y
implements e {
    y() {
    }

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        if ("MinecartSpawner".equals(e2.l("id"))) {
            e2.a("id", "MobSpawner");
            d2.a(c.d, e2, n2);
            e2.a("id", "MinecartSpawner");
        }
        return e2;
    }
}

