/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.client.k.b.q;
import net.minecraft.client.r;
import net.minecraft.h.y;
import net.minecraft.u.bp;
import net.minecraft.w.h.al;

public class n
extends l {
    private static final bp a = new bp("textures/gui/container/horse.png");
    private final y j;
    private final y k;
    private final al l;
    private float m;
    private float v;

    public n(y y2, y y3, al al2) {
        super(new net.minecraft.h.n(y2, y3, al2, net.minecraft.client.r.z().j));
        this.j = y2;
        this.k = y3;
        this.l = al2;
        this.t = false;
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
        if (this.l.dp()) {
            this.a_(n4 + 79, n5 + 17, 0, this.d, 90, 54);
        }
        if (this.l.p().j()) {
            this.a_(n4 + 7, n5 + 35, 0, this.d + 54, 18, 18);
        }
        net.minecraft.client.k.b.q.a(n4 + 51, n5 + 60, 17, (float)(n4 + 51) - this.m, (float)(n5 + 75 - 50) - this.v, this.l);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m = n2;
        this.v = n3;
        super.a(n2, n3, f2);
    }
}

