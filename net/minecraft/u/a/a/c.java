/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.u.a.g;
import net.minecraft.u.bp;

public class c
implements g {
    private static final bp a = new bp("cooked_fished");

    @Override
    public int a() {
        return 502;
    }

    @Override
    public e a(e e2) {
        if (e2.b("id", 8) && a.equals(new bp(e2.l("id")))) {
            e2.a("id", "minecraft:cooked_fish");
        }
        return e2;
    }
}

