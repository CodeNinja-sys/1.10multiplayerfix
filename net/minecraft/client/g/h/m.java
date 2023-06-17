/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.client.g.h.d;
import net.minecraft.g.bh;
import net.minecraft.g.c.b;
import net.minecraft.g.gm;
import net.minecraft.q.b.s;
import net.minecraft.q.n;

class m
implements d {
    m() {
    }

    @Override
    public int a(b b2, n n2, net.minecraft.u.b.b b3, int n3) {
        gm gm2 = (gm)((Object)b2.a(bh.a));
        return n2 == null || b3 == null || gm2 != gm.c && gm2 != gm.d ? -1 : s.a(n2, b3);
    }
}

