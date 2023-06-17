/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.a.f;
import net.minecraft.client.c.j;
import net.minecraft.client.h.d;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;

public class i
extends j {
    private final d m;
    private int n;

    public i(d d2) {
        super(net.minecraft.a.f.aK, bu.h);
        this.m = d2;
        this.j = true;
        this.k = 0;
        this.e = 0.1f;
    }

    @Override
    public void a() {
        ++this.n;
        if (!this.m.bk && (this.n <= 20 || this.m.bW())) {
            this.g = (float)this.m.aU;
            this.h = (float)this.m.aV;
            this.i = (float)this.m.aW;
            float f2 = net.minecraft.u.b.n.a(this.m.aX * this.m.aX + this.m.aZ * this.m.aZ + this.m.aY * this.m.aY);
            float f3 = f2 / 2.0f;
            this.e = (double)f2 >= 0.01 ? net.minecraft.u.b.n.a(f3 * f3, 0.0f, 1.0f) : 0.0f;
            if (this.n < 20) {
                this.e = 0.0f;
            } else if (this.n < 40) {
                this.e = (float)((double)this.e * ((double)(this.n - 20) / 20.0));
            }
            float f4 = 0.8f;
            this.f = this.e > 0.8f ? 1.0f + (this.e - 0.8f) : 1.0f;
        } else {
            this.a = true;
        }
    }
}

