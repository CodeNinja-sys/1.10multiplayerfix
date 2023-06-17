/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.u.a.c;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

class b
implements e {
    b() {
    }

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        if ("MinecartCommandBlock".equals(e2.l("id"))) {
            e2.a("id", "Control");
            d2.a(c.d, e2, n2);
            e2.a("id", "MinecartCommandBlock");
        }
        return e2;
    }
}

