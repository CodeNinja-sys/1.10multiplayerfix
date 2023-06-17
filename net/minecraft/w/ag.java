/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.g.a.h;
import net.minecraft.w.e.aw;
import net.minecraft.w.h.c;
import net.minecraft.w.h.q;
import net.minecraft.w.h.y;

public enum ag {
    a(aw.class, 70, net.minecraft.g.a.h.a, false, false),
    b(y.class, 10, net.minecraft.g.a.h.a, true, true),
    c(q.class, 15, net.minecraft.g.a.h.a, true, false),
    d(c.class, 5, net.minecraft.g.a.h.h, true, false);

    private final Class e;
    private final int f;
    private final h g;
    private final boolean h;
    private final boolean i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ag(h h2, boolean bl2, boolean bl3) {
        void var7_5;
        void var6_4;
        this.e = h2;
        this.f = bl2 ? 1 : 0;
        this.g = (h)bl3;
        this.h = var6_4;
        this.i = var7_5;
    }

    public Class a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.i;
    }
}

