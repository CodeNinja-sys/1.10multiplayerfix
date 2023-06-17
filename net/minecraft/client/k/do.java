/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.client.r;
import net.minecraft.h.al;
import net.minecraft.h.y;
import net.minecraft.u.bp;
import net.minecraft.w.a.a;

public class do
extends l {
    private static final bp a = new bp("textures/gui/container/hopper.png");
    private final y j;
    private final y k;

    public do(a a2, y y2) {
        super(new al(a2, y2, net.minecraft.client.r.z().j));
        this.j = a2;
        this.k = y2;
        this.t = false;
        this.d = 133;
    }

    @Override
    protected void b(int n2, int n3) {
        this.u.a(this.k.aK().c(), 8, 6, 0x404040);
        this.u.a(this.j.aK().c(), 8, this.d - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(a);
        int n4 = (this.p - this.c) / 2;
        int n5 = (this.q - this.d) / 2;
        this.a_(n4, n5, 0, 0, this.c, this.d);
    }
}

