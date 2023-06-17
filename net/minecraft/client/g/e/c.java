/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import net.minecraft.client.g.ar;
import net.minecraft.client.g.e.q;
import net.minecraft.client.g.e.u;
import net.minecraft.client.g.v;
import net.minecraft.q.k;

public class c
extends q {
    private final int d = v.a(net.minecraft.u.c.values().length);

    public c(k k2, ar ar2, int n2) {
        super(k2, ar2, n2);
    }

    public int a(net.minecraft.u.c c2, u u2) {
        return !u2.c(c2) ? this.d + c2.ordinal() : -1;
    }

    @Override
    public void a() {
        super.a();
        v.a(this.d, net.minecraft.u.c.values().length);
    }
}

