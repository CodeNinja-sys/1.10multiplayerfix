/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.bd;
import net.minecraft.client.j.w;
import net.minecraft.u.ai;
import net.minecraft.w.f.j;
import net.minecraft.w.n;

public class am
extends bd {
    public w k;
    public w l;
    public w m;
    public w n;

    public am() {
        this(0.0f);
    }

    public am(float f2) {
        super(f2, 64, 64);
        this.a = new w(this, 0, 0);
        this.a.a(-1.0f, -7.0f, -1.0f, 2, 7, 2, f2);
        this.a.a(0.0f, 0.0f, 0.0f);
        this.c = new w(this, 0, 26);
        this.c.a(-6.0f, 0.0f, -1.5f, 12, 3, 3, f2);
        this.c.a(0.0f, 0.0f, 0.0f);
        this.d = new w(this, 24, 0);
        this.d.a(-2.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.d.a(-5.0f, 2.0f, 0.0f);
        this.e = new w(this, 32, 16);
        this.e.i = true;
        this.e.a(0.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.e.a(5.0f, 2.0f, 0.0f);
        this.f = new w(this, 8, 0);
        this.f.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, f2);
        this.f.a(-1.9f, 12.0f, 0.0f);
        this.g = new w(this, 40, 16);
        this.g.i = true;
        this.g.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, f2);
        this.g.a(1.9f, 12.0f, 0.0f);
        this.k = new w(this, 16, 0);
        this.k.a(-3.0f, 3.0f, -1.0f, 2, 7, 2, f2);
        this.k.a(0.0f, 0.0f, 0.0f);
        this.k.j = true;
        this.l = new w(this, 48, 16);
        this.l.a(1.0f, 3.0f, -1.0f, 2, 7, 2, f2);
        this.l.a(0.0f, 0.0f, 0.0f);
        this.m = new w(this, 0, 48);
        this.m.a(-4.0f, 10.0f, -1.0f, 8, 2, 2, f2);
        this.m.a(0.0f, 0.0f, 0.0f);
        this.n = new w(this, 0, 32);
        this.n.a(-6.0f, 11.0f, -6.0f, 12, 1, 12, f2);
        this.n.a(0.0f, 12.0f, 0.0f);
        this.b.j = false;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        if (n2 instanceof j) {
            j j2 = (j)n2;
            this.e.j = j2.c();
            this.d.j = j2.c();
            this.n.j = !j2.i();
            this.g.a(1.9f, 12.0f, 0.0f);
            this.f.a(-1.9f, 12.0f, 0.0f);
            this.k.f = (float)Math.PI / 180 * j2.r().b();
            this.k.g = (float)Math.PI / 180 * j2.r().c();
            this.k.h = (float)Math.PI / 180 * j2.r().d();
            this.l.f = (float)Math.PI / 180 * j2.r().b();
            this.l.g = (float)Math.PI / 180 * j2.r().c();
            this.l.h = (float)Math.PI / 180 * j2.r().d();
            this.m.f = (float)Math.PI / 180 * j2.r().b();
            this.m.g = (float)Math.PI / 180 * j2.r().c();
            this.m.h = (float)Math.PI / 180 * j2.r().d();
            this.n.f = 0.0f;
            this.n.g = (float)Math.PI / 180 * -n2.ba;
            this.n.h = 0.0f;
        }
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(n2, f2, f3, f4, f5, f6, f7);
        net.minecraft.client.g.bd.D();
        if (this.r) {
            float f8 = 2.0f;
            net.minecraft.client.g.bd.b(0.5f, 0.5f, 0.5f);
            net.minecraft.client.g.bd.c(0.0f, 24.0f * f7, 0.0f);
            this.k.a(f7);
            this.l.a(f7);
            this.m.a(f7);
            this.n.a(f7);
        } else {
            if (n2.G()) {
                net.minecraft.client.g.bd.c(0.0f, 0.2f, 0.0f);
            }
            this.k.a(f7);
            this.l.a(f7);
            this.m.a(f7);
            this.n.a(f7);
        }
        net.minecraft.client.g.bd.E();
    }

    @Override
    public void a(float f2, ai ai2) {
        w w2 = this.a(ai2);
        boolean bl2 = w2.j;
        w2.j = true;
        super.a(f2, ai2);
        w2.j = bl2;
    }
}

