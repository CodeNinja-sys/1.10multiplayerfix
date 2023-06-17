/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import net.minecraft.client.k.a.j;
import net.minecraft.client.k.av;
import net.minecraft.client.r;
import net.minecraft.r.k;
import net.minecraft.r.o;

class a
extends av {
    final /* synthetic */ j a;

    public a(j j2, r r2) {
        this.a = j2;
        super(r2, j2.p, j2.q, 32, j2.q - 64, 10);
        this.b(false);
    }

    @Override
    protected int a() {
        return net.minecraft.r.o.c.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected int c() {
        return this.a() * 10;
    }

    @Override
    protected void d() {
        this.a.m();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        k k2 = (k)net.minecraft.r.o.c.get(n2);
        this.a.b(net.minecraft.client.k.a.j.b(this.a), k2.e().c(), n3 + 2, n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = k2.a(net.minecraft.client.k.a.j.a(this.a).a(k2));
        this.a.b(net.minecraft.client.k.a.j.b(this.a), string, n3 + 2 + 213 - net.minecraft.client.k.a.j.b(this.a).a(string), n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
    }
}

