/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cau
implements akc {
    private static final Random a = new Random();

    @Override
    public int a() {
        return 502;
    }

    @Override
    public bvp a(bvp bvp2) {
        if ("Zombie".equals(bvp2.l("id")) && bvp2.p("IsVillager")) {
            if (!bvp2.b("ZombieType", 99)) {
                cnf cnf2 = null;
                if (bvp2.b("VillagerProfession", 99)) {
                    try {
                        cnf2 = cnf.a(bvp2.h("VillagerProfession") + 1);
                    }
                    catch (RuntimeException runtimeException) {
                        // empty catch block
                    }
                }
                if (cnf2 == null) {
                    cnf2 = cnf.a(a.nextInt(5) + 1);
                }
                bvp2.a("ZombieType", cnf2.a());
            }
            bvp2.q("IsVillager");
        }
        return bvp2;
    }
}

