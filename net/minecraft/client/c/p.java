/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.a.f;
import net.minecraft.client.c.j;
import net.minecraft.client.c.x;
import net.minecraft.u.bu;
import net.minecraft.w.e.g;

public class p
extends j {
    private final g m;

    public p(g g2) {
        super(net.minecraft.a.f.ci, bu.f);
        this.m = g2;
        this.l = x.a;
        this.j = true;
        this.k = 0;
    }

    @Override
    public void a() {
        if (!this.m.bk && this.m.s()) {
            this.g = (float)this.m.aU;
            this.h = (float)this.m.aV;
            this.i = (float)this.m.aW;
            float f2 = this.m.s(0.0f);
            this.e = 0.0f + 1.0f * f2 * f2;
            this.f = 0.7f + 0.5f * f2;
        } else {
            this.a = true;
        }
    }
}

