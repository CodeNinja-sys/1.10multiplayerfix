/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bo;
import net.minecraft.client.g.d.c;
import net.minecraft.client.g.e.q;

public class cg
extends bo {
    @Override
    public void a(net.minecraft.u.c c2) {
        if (this.b) {
            for (q q2 : this.a) {
                c c3 = q2.b(c2.ordinal());
                bd.D();
                this.a(q2);
                q2.g();
                c3.a();
                this.a();
                c3.a(7);
                bd.E();
            }
            ay.g(ay.R, 0);
            bd.F();
            this.a.clear();
        }
    }

    private void a() {
        bd.d(3, 5126, 28, 0);
        bd.e(4, 5121, 28, 12);
        bd.c(2, 5126, 28, 16);
        ay.l(ay.r);
        bd.c(2, 5122, 28, 24);
        ay.l(ay.q);
    }
}

