/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.t;
import net.minecraft.client.j.w;
import net.minecraft.w.h.ad;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class j
extends t {
    private float i;

    public j() {
        super(12, 0.0f);
        this.a = new w(this, 0, 0);
        this.a.a(-3.0f, -4.0f, -6.0f, 6, 6, 8, 0.0f);
        this.a.a(0.0f, 6.0f, -8.0f);
        this.b = new w(this, 28, 8);
        this.b.a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 0.0f);
        this.b.a(0.0f, 5.0f, 2.0f);
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        super.a(l2, f2, f3, f4);
        this.a.d = 6.0f + ((ad)l2).q(f4) * 9.0f;
        this.i = ((ad)l2).s(f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.f = this.i;
    }
}

