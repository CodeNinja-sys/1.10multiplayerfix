/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.a.f;
import net.minecraft.client.c.j;
import net.minecraft.u.bu;

public class n
extends j {
    private final net.minecraft.w.f.f m;
    private float n = 0.0f;

    public n(net.minecraft.w.f.f f2) {
        super(net.minecraft.a.f.dB, bu.g);
        this.m = f2;
        this.j = true;
        this.k = 0;
    }

    @Override
    public void a() {
        if (this.m.bk) {
            this.a = true;
        } else {
            this.g = (float)this.m.aU;
            this.h = (float)this.m.aV;
            this.i = (float)this.m.aW;
            float f2 = net.minecraft.u.b.n.a(this.m.aX * this.m.aX + this.m.aZ * this.m.aZ);
            if ((double)f2 >= 0.01) {
                this.n = net.minecraft.u.b.n.a(this.n + 0.0025f, 0.0f, 1.0f);
                this.e = 0.0f + net.minecraft.u.b.n.a(f2, 0.0f, 0.5f) * 0.7f;
            } else {
                this.n = 0.0f;
                this.e = 0.0f;
            }
        }
    }
}

