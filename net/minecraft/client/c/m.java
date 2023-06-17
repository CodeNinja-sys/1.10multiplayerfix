/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.a.f;
import net.minecraft.client.c.j;
import net.minecraft.client.c.x;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;

public class m
extends j {
    private final b m;
    private final net.minecraft.w.f.f n;

    public m(b b2, net.minecraft.w.f.f f2) {
        super(net.minecraft.a.f.dA, bu.g);
        this.m = b2;
        this.n = f2;
        this.l = x.a;
        this.j = true;
        this.k = 0;
    }

    @Override
    public void a() {
        if (!this.n.bk && this.m.cz() && this.m.df() == this.n) {
            float f2 = net.minecraft.u.b.n.a(this.n.aX * this.n.aX + this.n.aZ * this.n.aZ);
            this.e = (double)f2 >= 0.01 ? 0.0f + net.minecraft.u.b.n.a(f2, 0.0f, 1.0f) * 0.75f : 0.0f;
        } else {
            this.a = true;
        }
    }
}

