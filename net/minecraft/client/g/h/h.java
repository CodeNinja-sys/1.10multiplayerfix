/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.client.g.h.d;
import net.minecraft.g.m;
import net.minecraft.q.b;
import net.minecraft.q.b.s;
import net.minecraft.q.n;

class h
implements d {
    h() {
    }

    @Override
    public int a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3, int n3) {
        net.minecraft.g.b b4 = (net.minecraft.g.b)((Object)b2.a(m.a));
        return b4 == net.minecraft.g.b.b ? b.a() : (b4 == net.minecraft.g.b.c ? b.b() : (n2 != null && b3 != null ? s.b(n2, b3) : b.c()));
    }
}

