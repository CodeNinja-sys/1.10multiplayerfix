/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.ar;
import net.minecraft.u.bp;
import net.minecraft.w.c.b;
import net.minecraft.w.n;

public class q
extends aa {
    private static final bp a = new bp("textures/entity/wither/wither_invulnerable.png");
    private static final bp b = new bp("textures/entity/wither/wither.png");
    private final ar g = new ar();

    public q(f f2) {
        super(f2);
    }

    private float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void a(b b2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        bd.q();
        float f4 = this.a(b2.bc, b2.ba, f3);
        float f5 = b2.bd + (b2.bb - b2.bd) * f3;
        bd.c((float)d2, (float)d3, (float)d4);
        float f6 = 0.0625f;
        bd.A();
        bd.b(-1.0f, -1.0f, 1.0f);
        bd.d();
        this.e(b2);
        if (this.f) {
            bd.g();
            bd.e(this.c(b2));
        }
        this.g.a(b2, 0.0f, 0.0f, 0.0f, f4, f5, 0.0625f);
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.E();
        super.a((n)b2, d2, d3, d4, f2, f3);
    }

    protected bp a(b b2) {
        return b2.c() ? a : b;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((b)n2);
    }
}

