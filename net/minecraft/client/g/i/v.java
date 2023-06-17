/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.y;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.e;
import net.minecraft.u.bp;

public class v
extends n {
    private static final bp a = new bp("textures/entity/wither/wither_invulnerable.png");
    private static final bp b = new bp("textures/entity/wither/wither.png");

    public v(f f2) {
        super(f2, new e(0.0f), 1.0f);
        this.a(new y(this));
    }

    protected bp a(net.minecraft.w.d.e e2) {
        int n2 = e2.p();
        return n2 > 0 && (n2 > 80 || n2 / 5 % 2 != 1) ? a : b;
    }

    protected void a(net.minecraft.w.d.e e2, float f2) {
        float f3 = 2.0f;
        int n2 = e2.p();
        if (n2 > 0) {
            f3 -= ((float)n2 - f2) / 220.0f * 0.5f;
        }
        bd.b(f3, f3, f3);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.w.d.e)n2);
    }
}

