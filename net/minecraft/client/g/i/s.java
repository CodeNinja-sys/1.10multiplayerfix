/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.y;
import net.minecraft.u.bp;
import net.minecraft.w.c.j;
import net.minecraft.w.n;

public class s
extends aa {
    private static final bp a = new bp("textures/entity/shulker/spark.png");
    private final y b = new y();

    public s(f f2) {
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

    public void a(j j2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        float f4 = this.a(j2.bc, j2.ba, f3);
        float f5 = j2.bd + (j2.bb - j2.bd) * f3;
        float f6 = (float)j2.by + f3;
        bd.c((float)d2, (float)d3 + 0.15f, (float)d4);
        bd.b(net.minecraft.u.b.n.a(f6 * 0.1f) * 180.0f, 0.0f, 1.0f, 0.0f);
        bd.b(net.minecraft.u.b.n.b(f6 * 0.1f) * 180.0f, 1.0f, 0.0f, 0.0f);
        bd.b(net.minecraft.u.b.n.a(f6 * 0.15f) * 360.0f, 0.0f, 0.0f, 1.0f);
        float f7 = 0.03125f;
        bd.A();
        bd.b(-1.0f, -1.0f, 1.0f);
        this.e(j2);
        this.b.a(j2, 0.0f, 0.0f, 0.0f, f4, f5, 0.03125f);
        bd.l();
        bd.c(1.0f, 1.0f, 1.0f, 0.5f);
        bd.b(1.5f, 1.5f, 1.5f);
        this.b.a(j2, 0.0f, 0.0f, 0.0f, f4, f5, 0.03125f);
        bd.k();
        bd.E();
        super.a((n)j2, d2, d3, d4, f2, f3);
    }

    protected bp a(j j2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((j)n2);
    }
}

