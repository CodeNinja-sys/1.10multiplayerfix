/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.bo;
import net.minecraft.client.g.e.c;
import net.minecraft.client.g.e.q;

public class au
extends bo {
    @Override
    public void a(net.minecraft.u.c c2) {
        if (this.b) {
            for (q q2 : this.a) {
                c c3 = (c)q2;
                bd.D();
                this.a(q2);
                bd.p(c3.a(c2, c3.h()));
                bd.E();
            }
            bd.F();
            this.a.clear();
        }
    }
}

