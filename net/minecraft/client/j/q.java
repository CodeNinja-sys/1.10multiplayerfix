/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.aw;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class q
extends aw {
    public boolean a;
    private final w h = new w(this).b(64, 128);
    private final w i;

    public q(float f2) {
        super(f2, 0.0f, 64, 128);
        this.h.a(0.0f, -2.0f, 0.0f);
        this.h.a(0, 0).a(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.g.a(this.h);
        this.i = new w(this).b(64, 128);
        this.i.a(-5.0f, -10.03125f, -5.0f);
        this.i.a(0, 64).a(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.b.a(this.i);
        w w2 = new w(this).b(64, 128);
        w2.a(1.75f, -4.0f, 2.0f);
        w2.a(0, 76).a(0.0f, 0.0f, 0.0f, 7, 4, 7);
        w2.f = -0.05235988f;
        w2.h = 0.02617994f;
        this.i.a(w2);
        w w3 = new w(this).b(64, 128);
        w3.a(1.75f, -4.0f, 2.0f);
        w3.a(0, 87).a(0.0f, 0.0f, 0.0f, 4, 4, 4);
        w3.f = -0.10471976f;
        w3.h = 0.05235988f;
        w2.a(w3);
        w w4 = new w(this).b(64, 128);
        w4.a(1.75f, -2.0f, 2.0f);
        w4.a(0, 95).a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        w4.f = -0.20943952f;
        w4.h = 0.10471976f;
        w3.a(w4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        this.g.o = 0.0f;
        this.g.p = 0.0f;
        this.g.q = 0.0f;
        float f8 = 0.01f * (float)(n2.ca() % 10);
        this.g.f = net.minecraft.u.b.n.a((float)n2.by * f8) * 4.5f * ((float)Math.PI / 180);
        this.g.g = 0.0f;
        this.g.h = net.minecraft.u.b.n.b((float)n2.by * f8) * 2.5f * ((float)Math.PI / 180);
        if (this.a) {
            this.g.f = -0.9f;
            this.g.q = -0.09375f;
            this.g.p = 0.1875f;
        }
    }
}

