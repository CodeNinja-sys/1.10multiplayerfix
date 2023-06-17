/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.h.a;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.u.b.s;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class g
extends ap {
    private final w a;
    private final w b = new w(this, 22, 0);

    public g() {
        this.b.a(-10.0f, 0.0f, 0.0f, 10, 20, 2, 1.0f);
        this.a = new w(this, 22, 0);
        this.a.i = true;
        this.a.a(0.0f, 0.0f, 0.0f, 10, 20, 2, 1.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        bd.B();
        bd.q();
        this.b.a(f7);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        float f8 = 0.2617994f;
        float f9 = -0.2617994f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        if (n2 instanceof l && ((l)n2).bW()) {
            float f12 = 1.0f;
            if (n2.aY < 0.0) {
                s s2 = new s(n2.aX, n2.aY, n2.aZ).a();
                f12 = 1.0f - (float)Math.pow(-s2.c, 1.5);
            }
            f8 = f12 * 0.34906584f + (1.0f - f12) * f8;
            f9 = f12 * -1.5707964f + (1.0f - f12) * f9;
        } else if (n2.G()) {
            f8 = 0.69813174f;
            f9 = -0.7853982f;
            f10 = 3.0f;
            f11 = 0.08726646f;
        }
        this.b.c = 5.0f;
        this.b.d = f10;
        if (n2 instanceof a) {
            a a2 = (a)n2;
            a2.a = (float)((double)a2.a + (double)(f8 - a2.a) * 0.1);
            a2.b = (float)((double)a2.b + (double)(f11 - a2.b) * 0.1);
            a2.c = (float)((double)a2.c + (double)(f9 - a2.c) * 0.1);
            this.b.f = a2.a;
            this.b.g = a2.b;
            this.b.h = a2.c;
        } else {
            this.b.f = f8;
            this.b.h = f9;
            this.b.g = f11;
        }
        this.a.c = -this.b.c;
        this.a.g = -this.b.g;
        this.a.d = this.b.d;
        this.a.f = this.b.f;
        this.a.h = -this.b.h;
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        super.a(l2, f2, f3, f4);
    }
}

