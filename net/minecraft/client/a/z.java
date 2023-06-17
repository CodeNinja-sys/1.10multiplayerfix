/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.bi;
import net.minecraft.q.k;

public class z
extends bi {
    public z(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, 176, 8, -5.0E-4f);
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.y *= 0.75f;
        this.x = 60 + this.r.nextInt(12);
        this.b(15916745);
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }
}

