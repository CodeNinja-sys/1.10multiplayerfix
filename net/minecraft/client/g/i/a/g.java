/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.j;
import net.minecraft.client.j.v;
import net.minecraft.u.bp;
import net.minecraft.w.h.l;

public class g
implements s {
    private static final bp a = new bp("textures/entity/pig/pig_saddle.png");
    private final j b;
    private final v c = new v(0.5f);

    public g(j j2) {
        this.b = j2;
    }

    public void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (l2.p()) {
            this.b.a(a);
            this.c.a(this.b.f());
            this.c.a(l2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

