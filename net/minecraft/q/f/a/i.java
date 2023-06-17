/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import net.minecraft.e.q;
import net.minecraft.u.a.c;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

class i
implements e {
    i() {
    }

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        if (e2.b("Level", 10)) {
            int n3;
            q q2;
            net.minecraft.e.e e3 = e2.o("Level");
            if (e3.b("Entities", 9)) {
                q2 = e3.c("Entities", 10);
                for (n3 = 0; n3 < q2.e(); ++n3) {
                    q2.a(n3, d2.a(c.e, (net.minecraft.e.e)q2.h(n3), n2));
                }
            }
            if (e3.b("TileEntities", 9)) {
                q2 = e3.c("TileEntities", 10);
                for (n3 = 0; n3 < q2.e(); ++n3) {
                    q2.a(n3, d2.a(c.d, (net.minecraft.e.e)q2.h(n3), n2));
                }
            }
        }
        return e2;
    }
}

