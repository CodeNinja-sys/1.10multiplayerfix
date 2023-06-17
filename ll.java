/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ll
extends to {
    private static final d a = c.c();
    private static final String[] b = new String[]{"Skeleton", "Zombie", "Zombie", "Spider"};

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        cmz cmz3;
        int n2;
        int n3;
        int n4;
        int n5 = 3;
        int n6 = random.nextInt(2) + 2;
        int n7 = -n6 - 1;
        int n8 = n6 + 1;
        int n9 = -1;
        int n10 = 4;
        int n11 = random.nextInt(2) + 2;
        int n12 = -n11 - 1;
        int n13 = n11 + 1;
        int n14 = 0;
        for (n4 = n7; n4 <= n8; ++n4) {
            for (n3 = -1; n3 <= 4; ++n3) {
                for (n2 = n12; n2 <= n13; ++n2) {
                    cmz3 = cmz2.e(n4, n3, n2);
                    ahk ahk2 = iu2.n(cmz3).a();
                    boolean bl2 = ahk2.a();
                    if (n3 == -1 && !bl2) {
                        return false;
                    }
                    if (n3 == 4 && !bl2) {
                        return false;
                    }
                    if (n4 != n7 && n4 != n8 && n2 != n12 && n2 != n13 || n3 != 0 || !iu2.c(cmz3) || !iu2.c(cmz3.g())) continue;
                    ++n14;
                }
            }
        }
        if (n14 < 1 || n14 > 5) {
            return false;
        }
        for (n4 = n7; n4 <= n8; ++n4) {
            for (n3 = 3; n3 >= -1; --n3) {
                for (n2 = n12; n2 <= n13; ++n2) {
                    cmz3 = cmz2.e(n4, n3, n2);
                    if (n4 == n7 || n3 == -1 || n2 == n12 || n4 == n8 || n3 == 4 || n2 == n13) {
                        if (cmz3.b() >= 0 && !iu2.n(cmz3.h()).a().a()) {
                            iu2.f(cmz3);
                            continue;
                        }
                        if (!iu2.n(cmz3).a().a() || iu2.n(cmz3).t() == blg.ae) continue;
                        if (n3 == -1 && random.nextInt(4) != 0) {
                            iu2.a(cmz3, blg.Y.s(), 2);
                            continue;
                        }
                        iu2.a(cmz3, blg.e.s(), 2);
                        continue;
                    }
                    if (iu2.n(cmz3).t() == blg.ae) continue;
                    iu2.f(cmz3);
                }
            }
        }
        block6: for (n4 = 0; n4 < 2; ++n4) {
            for (n3 = 0; n3 < 3; ++n3) {
                int n15;
                int n16;
                n2 = cmz2.a() + random.nextInt(n6 * 2 + 1) - n6;
                cmz cmz4 = new cmz(n2, n16 = cmz2.b(), n15 = cmz2.c() + random.nextInt(n11 * 2 + 1) - n11);
                if (!iu2.c(cmz4)) continue;
                int n17 = 0;
                for (bqk bqk2 : afj.a) {
                    if (!iu2.n(cmz4.c(bqk2)).a().a()) continue;
                    ++n17;
                }
                if (n17 != 1) continue;
                iu2.a(cmz4, blg.ae.f(iu2, cmz4, blg.ae.s()), 2);
                bql bql2 = iu2.q(cmz4);
                if (!(bql2 instanceof bdm)) continue block6;
                ((bdm)bql2).a(bvm.d, random.nextLong());
                continue block6;
            }
        }
        iu2.a(cmz2, blg.ac.s(), 2);
        bql bql3 = iu2.q(cmz2);
        if (bql3 instanceof ze) {
            ((ze)bql3).d().a(this.a(random));
        } else {
            a.b("Failed to fetch mob spawner entity at ({}, {}, {})", cmz2.a(), cmz2.b(), cmz2.c());
        }
        return true;
    }

    private String a(Random random) {
        return b[random.nextInt(b.length)];
    }
}

