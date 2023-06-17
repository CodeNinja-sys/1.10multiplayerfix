/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.client.j.z;
import net.minecraft.u.ai;
import net.minecraft.u.b.n;
import net.minecraft.w.l;

public class b
extends ap {
    public w a;
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    public w g;
    public z h = z.a;
    public z i = z.a;
    public boolean j;
    private static /* synthetic */ int[] k;

    public b() {
        this(0.0f);
    }

    public b(float f2) {
        this(f2, 0.0f, 64, 32);
    }

    public b(float f2, float f3, int n2, int n3) {
        this.t = n2;
        this.u = n3;
        this.a = new w(this, 0, 0);
        this.a.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2);
        this.a.a(0.0f, 0.0f + f3, 0.0f);
        this.b = new w(this, 32, 0);
        this.b.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 + 0.5f);
        this.b.a(0.0f, 0.0f + f3, 0.0f);
        this.c = new w(this, 16, 16);
        this.c.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.c.a(0.0f, 0.0f + f3, 0.0f);
        this.d = new w(this, 40, 16);
        this.d.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.d.a(-5.0f, 2.0f + f3, 0.0f);
        this.e = new w(this, 40, 16);
        this.e.i = true;
        this.e.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.e.a(5.0f, 2.0f + f3, 0.0f);
        this.f = new w(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.f.a(-1.9f, 12.0f + f3, 0.0f);
        this.g = new w(this, 0, 16);
        this.g.i = true;
        this.g.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.g.a(1.9f, 12.0f + f3, 0.0f);
    }

    @Override
    public void a(net.minecraft.w.n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        bd.D();
        if (this.r) {
            float f8 = 2.0f;
            bd.b(0.75f, 0.75f, 0.75f);
            bd.c(0.0f, 16.0f * f7, 0.0f);
            this.a.a(f7);
            bd.E();
            bd.D();
            bd.b(0.5f, 0.5f, 0.5f);
            bd.c(0.0f, 24.0f * f7, 0.0f);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.a(f7);
            this.b.a(f7);
        } else {
            if (n2.G()) {
                bd.c(0.0f, 0.2f, 0.0f);
            }
            this.a.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.a(f7);
            this.b.a(f7);
        }
        bd.E();
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, net.minecraft.w.n n2) {
        boolean bl2 = n2 instanceof l && ((l)n2).bX() > 4;
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = bl2 ? -0.7853982f : f6 * ((float)Math.PI / 180);
        this.c.g = 0.0f;
        this.d.e = 0.0f;
        this.d.c = -5.0f;
        this.e.e = 0.0f;
        this.e.c = 5.0f;
        float f8 = 1.0f;
        if (bl2) {
            f8 = (float)(n2.aX * n2.aX + n2.aY * n2.aY + n2.aZ * n2.aZ);
            f8 /= 0.2f;
            f8 = f8 * f8 * f8;
        }
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        this.d.f = n.b(f2 * 0.6662f + (float)Math.PI) * 2.0f * f3 * 0.5f / f8;
        this.e.f = n.b(f2 * 0.6662f) * 2.0f * f3 * 0.5f / f8;
        this.d.h = 0.0f;
        this.e.h = 0.0f;
        this.f.f = n.b(f2 * 0.6662f) * 1.4f * f3 / f8;
        this.g.f = n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3 / f8;
        this.f.g = 0.0f;
        this.g.g = 0.0f;
        this.f.h = 0.0f;
        this.g.h = 0.0f;
        if (this.q) {
            this.d.f += -0.62831855f;
            this.e.f += -0.62831855f;
            this.f.f = -1.4137167f;
            this.f.g = 0.31415927f;
            this.f.h = 0.07853982f;
            this.g.f = -1.4137167f;
            this.g.g = -0.31415927f;
            this.g.h = -0.07853982f;
        }
        this.d.g = 0.0f;
        this.d.h = 0.0f;
        switch (net.minecraft.client.j.b.a()[this.h.ordinal()]) {
            case 1: {
                this.e.g = 0.0f;
                break;
            }
            case 3: {
                this.e.f = this.e.f * 0.5f - 0.9424779f;
                this.e.g = 0.5235988f;
                break;
            }
            case 2: {
                this.e.f = this.e.f * 0.5f - 0.31415927f;
                this.e.g = 0.0f;
            }
        }
        switch (net.minecraft.client.j.b.a()[this.i.ordinal()]) {
            case 1: {
                this.d.g = 0.0f;
                break;
            }
            case 3: {
                this.d.f = this.d.f * 0.5f - 0.9424779f;
                this.d.g = -0.5235988f;
                break;
            }
            case 2: {
                this.d.f = this.d.f * 0.5f - 0.31415927f;
                this.d.g = 0.0f;
            }
        }
        if (this.p > 0.0f) {
            ai ai2 = this.a(n2);
            w w2 = this.a(ai2);
            float f9 = this.p;
            this.c.g = n.a(n.c(f9) * ((float)Math.PI * 2)) * 0.2f;
            if (ai2 == ai.a) {
                this.c.g *= -1.0f;
            }
            this.d.e = n.a(this.c.g) * 5.0f;
            this.d.c = -n.b(this.c.g) * 5.0f;
            this.e.e = -n.a(this.c.g) * 5.0f;
            this.e.c = n.b(this.c.g) * 5.0f;
            this.d.g += this.c.g;
            this.e.g += this.c.g;
            this.e.f += this.c.g;
            f9 = 1.0f - this.p;
            f9 *= f9;
            f9 *= f9;
            f9 = 1.0f - f9;
            float f10 = n.a(f9 * (float)Math.PI);
            float f11 = n.a(this.p * (float)Math.PI) * -(this.a.f - 0.7f) * 0.75f;
            w2.f = (float)((double)w2.f - ((double)f10 * 1.2 + (double)f11));
            w2.g += this.c.g * 2.0f;
            w2.h += n.a(this.p * (float)Math.PI) * -0.4f;
        }
        if (this.j) {
            this.c.f = 0.5f;
            this.d.f += 0.4f;
            this.e.f += 0.4f;
            this.f.e = 4.0f;
            this.g.e = 4.0f;
            this.f.d = 9.0f;
            this.g.d = 9.0f;
            this.a.d = 1.0f;
        } else {
            this.c.f = 0.0f;
            this.f.e = 0.1f;
            this.g.e = 0.1f;
            this.f.d = 12.0f;
            this.g.d = 12.0f;
            this.a.d = 0.0f;
        }
        this.d.h += n.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.e.h -= n.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.d.f += n.a(f4 * 0.067f) * 0.05f;
        this.e.f -= n.a(f4 * 0.067f) * 0.05f;
        if (this.i == z.d) {
            this.d.g = -0.1f + this.a.g;
            this.e.g = 0.1f + this.a.g + 0.4f;
            this.d.f = -1.5707964f + this.a.f;
            this.e.f = -1.5707964f + this.a.f;
        } else if (this.h == z.d) {
            this.d.g = -0.1f + this.a.g - 0.4f;
            this.e.g = 0.1f + this.a.g;
            this.d.f = -1.5707964f + this.a.f;
            this.e.f = -1.5707964f + this.a.f;
        }
        net.minecraft.client.j.b.a(this.a, this.b);
    }

    @Override
    public void a(ap ap2) {
        super.a(ap2);
        if (ap2 instanceof b) {
            b b2 = (b)ap2;
            this.h = b2.h;
            this.i = b2.i;
            this.j = b2.j;
        }
    }

    public void a(boolean bl2) {
        this.a.j = bl2;
        this.b.j = bl2;
        this.c.j = bl2;
        this.d.j = bl2;
        this.e.j = bl2;
        this.f.j = bl2;
        this.g.j = bl2;
    }

    public void a(float f2, ai ai2) {
        this.a(ai2).c(f2);
    }

    protected w a(ai ai2) {
        return ai2 == ai.a ? this.e : this.d;
    }

    protected ai a(net.minecraft.w.n n2) {
        return n2 instanceof l ? ((l)n2).aH() : ai.b;
    }

    static /* synthetic */ int[] a() {
        if (k != null) {
            return k;
        }
        int[] arrn = new int[z.values().length];
        try {
            arrn[z.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[z.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[z.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[z.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        k = arrn;
        return arrn;
    }
}

