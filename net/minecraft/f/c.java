/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.e.q;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

class c
implements e {
    c() {
    }

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        if ("MobSpawner".equals(e2.l("id"))) {
            if (e2.b("SpawnPotentials", 9)) {
                q q2 = e2.c("SpawnPotentials", 10);
                for (int i2 = 0; i2 < q2.e(); ++i2) {
                    net.minecraft.e.e e3 = q2.b(i2);
                    e3.a("Entity", d2.a(net.minecraft.u.a.c.e, e3.o("Entity"), n2));
                }
            }
            e2.a("SpawnData", d2.a(net.minecraft.u.a.c.e, e2.o("SpawnData"), n2));
        }
        return e2;
    }
}

