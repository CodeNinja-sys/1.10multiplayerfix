/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;

public class g
implements net.minecraft.u.a.g {
    @Override
    public int a() {
        return 110;
    }

    @Override
    public e a(e e2) {
        if ("EntityHorse".equals(e2.l("id")) && !e2.b("SaddleItem", 10) && e2.p("Saddle")) {
            e e3 = new e();
            e3.a("id", "minecraft:saddle");
            e3.a("Count", (byte)1);
            e3.a("Damage", (short)0);
            e2.a("SaddleItem", e3);
            e2.q("Saddle");
        }
        return e2;
    }
}

