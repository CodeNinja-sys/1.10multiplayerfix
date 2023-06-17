/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.b;
import net.minecraft.w.f.j;
import net.minecraft.w.n;

public class bd
extends b {
    public bd() {
        this(0.0f);
    }

    public bd(float f2) {
        this(f2, 64, 32);
    }

    protected bd(float f2, int n2, int n3) {
        super(f2, 0.0f, n2, n3);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        if (n2 instanceof j) {
            j j2 = (j)n2;
            this.a.f = (float)Math.PI / 180 * j2.q().b();
            this.a.g = (float)Math.PI / 180 * j2.q().c();
            this.a.h = (float)Math.PI / 180 * j2.q().d();
            this.a.a(0.0f, 1.0f, 0.0f);
            this.c.f = (float)Math.PI / 180 * j2.r().b();
            this.c.g = (float)Math.PI / 180 * j2.r().c();
            this.c.h = (float)Math.PI / 180 * j2.r().d();
            this.e.f = (float)Math.PI / 180 * j2.s().b();
            this.e.g = (float)Math.PI / 180 * j2.s().c();
            this.e.h = (float)Math.PI / 180 * j2.s().d();
            this.d.f = (float)Math.PI / 180 * j2.t().b();
            this.d.g = (float)Math.PI / 180 * j2.t().c();
            this.d.h = (float)Math.PI / 180 * j2.t().d();
            this.g.f = (float)Math.PI / 180 * j2.v().b();
            this.g.g = (float)Math.PI / 180 * j2.v().c();
            this.g.h = (float)Math.PI / 180 * j2.v().d();
            this.g.a(1.9f, 11.0f, 0.0f);
            this.f.f = (float)Math.PI / 180 * j2.w().b();
            this.f.g = (float)Math.PI / 180 * j2.w().c();
            this.f.h = (float)Math.PI / 180 * j2.w().d();
            this.f.a(-1.9f, 11.0f, 0.0f);
            bd.a(this.a, this.b);
        }
    }
}

