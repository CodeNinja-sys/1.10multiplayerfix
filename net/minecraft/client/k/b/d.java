/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.h.y;
import net.minecraft.u.bp;
import net.minecraft.w.a.a;

public class d
extends l {
    private static final bp j = new bp("textures/gui/container/dispenser.png");
    private final a k;
    public y a;

    public d(a a2, y y2) {
        super(new net.minecraft.h.l(a2, y2));
        this.k = a2;
        this.a = y2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.a.aK().c();
        this.u.a(string, this.c / 2 - this.u.a(string) / 2, 6, 0x404040);
        this.u.a(this.k.aK().c(), 8, this.d - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(j);
        int n4 = (this.p - this.c) / 2;
        int n5 = (this.q - this.d) / 2;
        this.a_(n4, n5, 0, 0, this.c, this.d);
    }
}

