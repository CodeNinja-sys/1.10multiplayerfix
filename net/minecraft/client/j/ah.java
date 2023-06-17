/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.b;
import net.minecraft.client.j.w;
import net.minecraft.client.j.z;
import net.minecraft.m.cu;
import net.minecraft.u.ai;
import net.minecraft.u.b.n;
import net.minecraft.w.e.ay;
import net.minecraft.w.l;

public class ah
extends b {
    public ah() {
        this(0.0f, false);
    }

    public ah(float f2, boolean bl2) {
        super(f2, 0.0f, 64, 32);
        if (!bl2) {
            this.d = new w(this, 40, 16);
            this.d.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
            this.d.a(-5.0f, 2.0f, 0.0f);
            this.e = new w(this, 40, 16);
            this.e.i = true;
            this.e.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
            this.e.a(5.0f, 2.0f, 0.0f);
            this.f = new w(this, 0, 16);
            this.f.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
            this.f.a(-2.0f, 12.0f, 0.0f);
            this.g = new w(this, 0, 16);
            this.g.i = true;
            this.g.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
            this.g.a(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        this.i = z.a;
        this.h = z.a;
        cu cu2 = l2.c(net.minecraft.u.ah.a);
        if (cu2 != null && cu2.a() == net.minecraft.a.w.f && ((ay)l2).q()) {
            if (l2.aH() == ai.b) {
                this.i = z.d;
            } else {
                this.h = z.d;
            }
        }
        super.a(l2, f2, f3, f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, net.minecraft.w.n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        cu cu2 = ((l)n2).bC();
        ay ay2 = (ay)n2;
        if (ay2.q() && (cu2 == null || cu2.a() != net.minecraft.a.w.f)) {
            float f8 = n.a(this.p * (float)Math.PI);
            float f9 = n.a((1.0f - (1.0f - this.p) * (1.0f - this.p)) * (float)Math.PI);
            this.d.h = 0.0f;
            this.e.h = 0.0f;
            this.d.g = -(0.1f - f8 * 0.6f);
            this.e.g = 0.1f - f8 * 0.6f;
            this.d.f = -1.5707964f;
            this.e.f = -1.5707964f;
            this.d.f -= f8 * 1.2f - f9 * 0.4f;
            this.e.f -= f8 * 1.2f - f9 * 0.4f;
            this.d.h += n.b(f4 * 0.09f) * 0.05f + 0.05f;
            this.e.h -= n.b(f4 * 0.09f) * 0.05f + 0.05f;
            this.d.f += n.a(f4 * 0.067f) * 0.05f;
            this.e.f -= n.a(f4 * 0.067f) * 0.05f;
        }
    }

    @Override
    public void a(float f2, ai ai2) {
        float f3 = ai2 == ai.b ? 1.0f : -1.0f;
        w w2 = this.a(ai2);
        w2.c += f3;
        w2.c(f2);
        w2.c -= f3;
    }
}

