/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.client.g.h.j;
import net.minecraft.m.cu;
import net.minecraft.m.dk;
import net.minecraft.w.h;
import net.minecraft.w.q;

class p
implements j {
    p() {
    }

    @Override
    public int a(cu cu2, int n2) {
        q q2 = (q)h.a.get(dk.h(cu2));
        return q2 == null ? -1 : (n2 == 0 ? q2.b : q2.c);
    }
}

