/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.aw;
import net.minecraft.client.g.i.f;
import net.minecraft.u.bp;
import net.minecraft.w.c.i;
import net.minecraft.w.n;

public class d
extends aw {
    public static final bp a = new bp("textures/entity/projectiles/arrow.png");
    public static final bp b = new bp("textures/entity/projectiles/tipped_arrow.png");

    public d(f f2) {
        super(f2);
    }

    protected bp a(i i2) {
        return i2.g() > 0 ? b : a;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((i)n2);
    }
}

