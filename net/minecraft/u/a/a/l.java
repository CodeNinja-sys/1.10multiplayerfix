/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.u.a.g;

public class l
implements g {
    @Override
    public int a() {
        return 113;
    }

    @Override
    public e a(e e2) {
        q q2;
        if (e2.b("HandDropChances", 9) && (q2 = e2.c("HandDropChances", 5)).e() == 2 && q2.f(0) == 0.0f && q2.f(1) == 0.0f) {
            e2.q("HandDropChances");
        }
        if (e2.b("ArmorDropChances", 9) && (q2 = e2.c("ArmorDropChances", 5)).e() == 4 && q2.f(0) == 0.0f && q2.f(1) == 0.0f && q2.f(2) == 0.0f && q2.f(3) == 0.0f) {
            e2.q("ArmorDropChances");
        }
        return e2;
    }
}

