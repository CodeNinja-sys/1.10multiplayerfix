/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.o;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.e.av;

public class e
extends n {
    private static final bp a = new bp("textures/entity/slime/slime.png");

    public e(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
        this.a(new o(this));
    }

    public void a(av av2, double d2, double d3, double d4, float f2, float f3) {
        this.d = 0.25f * (float)av2.c();
        super.a(av2, d2, d3, d4, f2, f3);
    }

    protected void a(av av2, float f2) {
        float f3 = 0.999f;
        bd.b(0.999f, 0.999f, 0.999f);
        float f4 = av2.c();
        float f5 = (av2.c + (av2.b - av2.c) * f2) / (f4 * 0.5f + 1.0f);
        float f6 = 1.0f / (f5 + 1.0f);
        bd.b(f6 * f4, 1.0f / f6 * f4, f6 * f4);
    }

    protected bp a(av av2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((av)n2);
    }
}

