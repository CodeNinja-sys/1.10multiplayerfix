/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.client.r;
import net.minecraft.h.w;
import net.minecraft.h.y;
import net.minecraft.u.bp;

public class h
extends l {
    private static final bp a = new bp("textures/gui/container/generic_54.png");
    private final y j;
    private final y k;
    private final int l;

    public h(y y2, y y3) {
        super(new w(y2, y3, net.minecraft.client.r.z().j));
        this.j = y2;
        this.k = y3;
        this.t = false;
        int n2 = 222;
        int n3 = 114;
        this.l = y3.e() / 9;
        this.d = 114 + this.l * 18;
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
        this.a_(n4, n5, 0, 0, this.c, this.l * 18 + 17);
        this.a_(n4, n5 + this.l * 18 + 17, 0, 126, this.c, 96);
    }
}

