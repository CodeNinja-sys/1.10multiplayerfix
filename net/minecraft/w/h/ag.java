/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.e.q;
import net.minecraft.u.a.b;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

class ag
implements e {
    ag() {
    }

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        net.minecraft.e.e e3;
        if ("Villager".equals(e2.l("id")) && e2.b("Offers", 10) && (e3 = e2.o("Offers")).b("Recipes", 9)) {
            q q2 = e3.c("Recipes", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                net.minecraft.e.e e4 = q2.b(i2);
                b.a(d2, e4, n2, "buy");
                b.a(d2, e4, n2, "buyB");
                b.a(d2, e4, n2, "sell");
                q2.a(i2, e4);
            }
        }
        return e2;
    }
}

