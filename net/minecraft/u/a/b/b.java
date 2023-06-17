/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.b;

import net.minecraft.u.a.c;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

public class b
implements e {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        net.minecraft.e.e e3 = e2.o("tag");
        if (e3.b("EntityTag", 10)) {
            boolean bl2;
            String string;
            net.minecraft.e.e e4 = e3.o("EntityTag");
            String string2 = e2.l("id");
            if ("minecraft:armor_stand".equals(string2)) {
                string = "ArmorStand";
            } else {
                if (!"minecraft:spawn_egg".equals(string2)) {
                    return e2;
                }
                string = e4.l("id");
            }
            if (string == null) {
                a.f("Unable to resolve Entity for ItemInstance: {}", string2);
                bl2 = false;
            } else {
                bl2 = !e4.b("id", 8);
                e4.a("id", string);
            }
            d2.a(c.e, e4, n2);
            if (bl2) {
                e4.q("id");
            }
        }
        return e2;
    }
}

