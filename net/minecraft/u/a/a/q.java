/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.u.a.g;

public class q
implements g {
    @Override
    public int a() {
        return 107;
    }

    @Override
    public e a(e e2) {
        Object object;
        if (!"MobSpawner".equals(e2.l("id"))) {
            return e2;
        }
        if (e2.b("EntityId", 8)) {
            object = e2.l("EntityId");
            e e3 = e2.o("SpawnData");
            e3.a("id", (String)(((String)object).isEmpty() ? "Pig" : object));
            e2.a("SpawnData", e3);
            e2.q("EntityId");
        }
        if (e2.b("SpawnPotentials", 9)) {
            object = e2.c("SpawnPotentials", 10);
            for (int i2 = 0; i2 < ((net.minecraft.e.q)object).e(); ++i2) {
                e e4 = ((net.minecraft.e.q)object).b(i2);
                if (!e4.b("Type", 8)) continue;
                e e5 = e4.o("Properties");
                e5.a("id", e4.l("Type"));
                e4.a("Entity", e5);
                e4.q("Type");
                e4.q("Properties");
            }
        }
        return e2;
    }
}

