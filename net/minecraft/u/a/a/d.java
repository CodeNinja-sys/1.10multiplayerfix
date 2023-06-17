/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.b;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.u.a.g;

public class d
implements g {
    @Override
    public int a() {
        return 100;
    }

    @Override
    public e a(e e2) {
        q q2;
        q q3 = e2.c("Equipment", 10);
        if (q3.e() > 0 && !e2.b("HandItems", 10)) {
            q2 = new q();
            q2.a(q3.h(0));
            q2.a(new e());
            e2.a("HandItems", q2);
        }
        if (q3.e() > 1 && !e2.b("ArmorItem", 10)) {
            q2 = new q();
            q2.a(q3.b(1));
            q2.a(q3.b(2));
            q2.a(q3.b(3));
            q2.a(q3.b(4));
            e2.a("ArmorItems", q2);
        }
        e2.q("Equipment");
        if (e2.b("DropChances", 9)) {
            q q4;
            q2 = e2.c("DropChances", 5);
            if (!e2.b("HandDropChances", 10)) {
                q4 = new q();
                q4.a(new b(q2.f(0)));
                q4.a(new b(0.0f));
                e2.a("HandDropChances", q4);
            }
            if (!e2.b("ArmorDropChances", 10)) {
                q4 = new q();
                q4.a(new b(q2.f(1)));
                q4.a(new b(q2.f(2)));
                q4.a(new b(q2.f(3)));
                q4.a(new b(q2.f(4)));
                e2.a("ArmorDropChances", q4);
            }
            e2.q("DropChances");
        }
        return e2;
    }
}

