/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.u.a.g;
import net.minecraft.w.e.af;

public class s
implements g {
    private static final Random a = new Random();

    @Override
    public int a() {
        return 502;
    }

    @Override
    public e a(e e2) {
        if ("Zombie".equals(e2.l("id")) && e2.p("IsVillager")) {
            if (!e2.b("ZombieType", 99)) {
                af af2 = null;
                if (e2.b("VillagerProfession", 99)) {
                    try {
                        af2 = af.a(e2.h("VillagerProfession") + 1);
                    }
                    catch (RuntimeException runtimeException) {
                        // empty catch block
                    }
                }
                if (af2 == null) {
                    af2 = af.a(a.nextInt(5) + 1);
                }
                e2.a("ZombieType", af2.a());
            }
            e2.q("IsVillager");
        }
        return e2;
    }
}

