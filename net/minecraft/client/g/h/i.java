/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.client.g.h.d;
import net.minecraft.g.as;
import net.minecraft.g.c.b;
import net.minecraft.q.n;

class i
implements d {
    i() {
    }

    @Override
    public int a(b b2, n n2, net.minecraft.u.b.b b3, int n3) {
        int n4 = (Integer)b2.a(as.a);
        int n5 = n4 * 32;
        int n6 = 255 - n4 * 8;
        int n7 = n4 * 4;
        return n5 << 16 | n6 << 8 | n7;
    }
}

