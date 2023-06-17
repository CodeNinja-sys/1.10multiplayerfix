/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class y
extends ap {
    public w a;

    public y() {
        this.t = 64;
        this.u = 32;
        this.a = new w(this);
        this.a.a(0, 0).a(-4.0f, -4.0f, -1.0f, 8, 8, 2, 0.0f);
        this.a.a(0, 10).a(-1.0f, -4.0f, -4.0f, 2, 8, 8, 0.0f);
        this.a.a(20, 0).a(-4.0f, -1.0f, -4.0f, 8, 2, 8, 0.0f);
        this.a.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
    }
}

