/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.h.ac;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.bp;
import net.minecraft.w.a.a;

public class i
extends l {
    private static final bp a = new bp("textures/gui/container/crafting_table.png");

    public i(a a2, k k2) {
        this(a2, k2, net.minecraft.u.b.b.c);
    }

    public i(a a2, k k2, b b2) {
        super(new ac(a2, k2, b2));
    }

    @Override
    protected void b(int n2, int n3) {
        this.u.a(net.minecraft.client.f.u.a("container.crafting", new Object[0]), 28, 6, 0x404040);
        this.u.a(net.minecraft.client.f.u.a("container.inventory", new Object[0]), 8, this.d - 96 + 2, 0x404040);
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

