/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.b;
import net.minecraft.client.j.w;
import net.minecraft.u.ai;
import net.minecraft.w.n;

public class f
extends b {
    public w k;
    public w l;
    public w m;
    public w n;
    public w o;
    private final w v;
    private final w w;
    private final boolean x;

    public f(float f2, boolean bl2) {
        super(f2, 0.0f, 64, 64);
        this.x = bl2;
        this.w = new w(this, 24, 0);
        this.w.a(-3.0f, -6.0f, -1.0f, 6, 6, 1, f2);
        this.v = new w(this, 0, 0);
        this.v.b(64, 32);
        this.v.a(-5.0f, 0.0f, -1.0f, 10, 16, 1, f2);
        if (bl2) {
            this.e = new w(this, 32, 48);
            this.e.a(-1.0f, -2.0f, -2.0f, 3, 12, 4, f2);
            this.e.a(5.0f, 2.5f, 0.0f);
            this.d = new w(this, 40, 16);
            this.d.a(-2.0f, -2.0f, -2.0f, 3, 12, 4, f2);
            this.d.a(-5.0f, 2.5f, 0.0f);
            this.k = new w(this, 48, 48);
            this.k.a(-1.0f, -2.0f, -2.0f, 3, 12, 4, f2 + 0.25f);
            this.k.a(5.0f, 2.5f, 0.0f);
            this.l = new w(this, 40, 32);
            this.l.a(-2.0f, -2.0f, -2.0f, 3, 12, 4, f2 + 0.25f);
            this.l.a(-5.0f, 2.5f, 10.0f);
        } else {
            this.e = new w(this, 32, 48);
            this.e.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.e.a(5.0f, 2.0f, 0.0f);
            this.k = new w(this, 48, 48);
            this.k.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
            this.k.a(5.0f, 2.0f, 0.0f);
            this.l = new w(this, 40, 32);
            this.l.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
            this.l.a(-5.0f, 2.0f, 10.0f);
        }
        this.g = new w(this, 16, 48);
        this.g.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.g.a(1.9f, 12.0f, 0.0f);
        this.m = new w(this, 0, 48);
        this.m.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
        this.m.a(1.9f, 12.0f, 0.0f);
        this.n = new w(this, 0, 32);
        this.n.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
        this.n.a(-1.9f, 12.0f, 0.0f);
        this.o = new w(this, 16, 32);
        this.o.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2 + 0.25f);
        this.o.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(n2, f2, f3, f4, f5, f6, f7);
        bd.D();
        if (this.r) {
            float f8 = 2.0f;
            bd.b(0.5f, 0.5f, 0.5f);
            bd.c(0.0f, 24.0f * f7, 0.0f);
            this.m.a(f7);
            this.n.a(f7);
            this.k.a(f7);
            this.l.a(f7);
            this.o.a(f7);
        } else {
            if (n2.G()) {
                bd.c(0.0f, 0.2f, 0.0f);
            }
            this.m.a(f7);
            this.n.a(f7);
            this.k.a(f7);
            this.l.a(f7);
            this.o.a(f7);
        }
        bd.E();
    }

    public void a(float f2) {
        net.minecraft.client.j.f.a(this.a, this.w);
        this.w.c = 0.0f;
        this.w.d = 0.0f;
        this.w.a(f2);
    }

    public void b(float f2) {
        this.v.a(f2);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        net.minecraft.client.j.f.a(this.g, this.m);
        net.minecraft.client.j.f.a(this.f, this.n);
        net.minecraft.client.j.f.a(this.e, this.k);
        net.minecraft.client.j.f.a(this.d, this.l);
        net.minecraft.client.j.f.a(this.c, this.o);
        this.v.d = n2.G() ? 2.0f : 0.0f;
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        this.k.j = bl2;
        this.l.j = bl2;
        this.m.j = bl2;
        this.n.j = bl2;
        this.o.j = bl2;
        this.v.j = bl2;
        this.w.j = bl2;
    }

    @Override
    public void a(float f2, ai ai2) {
        w w2 = this.a(ai2);
        if (this.x) {
            float f3 = 0.5f * (float)(ai2 == ai.b ? 1 : -1);
            w2.c += f3;
            w2.c(f2);
            w2.c -= f3;
        } else {
            w2.c(f2);
        }
    }
}

