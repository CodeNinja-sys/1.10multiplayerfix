/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.b;
import net.minecraft.w.e.d;
import net.minecraft.w.n;

public class c
extends b {
    public c() {
        this(0.0f, false);
    }

    public c(float f2, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        float f8;
        super.a(f2, f3, f4, f5, f6, f7, n2);
        boolean bl2 = n2 instanceof d && ((d)n2).p();
        float f9 = net.minecraft.u.b.n.a(this.p * (float)Math.PI);
        float f10 = net.minecraft.u.b.n.a((1.0f - (1.0f - this.p) * (1.0f - this.p)) * (float)Math.PI);
        this.d.h = 0.0f;
        this.e.h = 0.0f;
        this.d.g = -(0.1f - f9 * 0.6f);
        this.e.g = 0.1f - f9 * 0.6f;
        this.d.f = f8 = (float)(-Math.PI) / (bl2 ? 1.5f : 2.25f);
        this.e.f = f8;
        this.d.f += f9 * 1.2f - f10 * 0.4f;
        this.e.f += f9 * 1.2f - f10 * 0.4f;
        this.d.h += net.minecraft.u.b.n.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.e.h -= net.minecraft.u.b.n.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.d.f += net.minecraft.u.b.n.a(f4 * 0.067f) * 0.05f;
        this.e.f -= net.minecraft.u.b.n.a(f4 * 0.067f) * 0.05f;
    }
}

