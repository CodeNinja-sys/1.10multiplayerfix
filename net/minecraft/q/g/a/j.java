/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.f.y;
import net.minecraft.g.a.h;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.b;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class j
extends aj {
    private static final d a = c.c();
    private static final String[] b = new String[]{"Skeleton", "Zombie", "Zombie", "Spider"};

    @Override
    public boolean a(k k2, Random random, b b2) {
        b b3;
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
                    b3 = b2.a(n4, n3, n2);
                    h h2 = k2.n(b3).d();
                    boolean bl2 = h2.a();
                    if (n3 == -1 && !bl2) {
                        return false;
                    }
                    if (n3 == 4 && !bl2) {
                        return false;
                    }
                    if (n4 != n7 && n4 != n8 && n2 != n12 && n2 != n13 || n3 != 0 || !k2.c(b3) || !k2.c(b3.b())) continue;
                    ++n14;
                }
            }
        }
        if (n14 >= 1 && n14 <= 5) {
            for (n4 = n7; n4 <= n8; ++n4) {
                for (n3 = 3; n3 >= -1; --n3) {
                    for (n2 = n12; n2 <= n13; ++n2) {
                        b3 = b2.a(n4, n3, n2);
                        if (n4 != n7 && n3 != -1 && n2 != n12 && n4 != n8 && n3 != 4 && n2 != n13) {
                            if (k2.n(b3).c() == p.ae) continue;
                            k2.f(b3);
                            continue;
                        }
                        if (b3.k() >= 0 && !k2.n(b3.c()).d().a()) {
                            k2.f(b3);
                            continue;
                        }
                        if (!k2.n(b3).d().a() || k2.n(b3).c() == p.ae) continue;
                        if (n3 == -1 && random.nextInt(4) != 0) {
                            k2.a(b3, p.Y.v(), 2);
                            continue;
                        }
                        k2.a(b3, p.e.v(), 2);
                    }
                }
            }
            block6: for (n4 = 0; n4 < 2; ++n4) {
                for (n3 = 0; n3 < 3; ++n3) {
                    Object object2;
                    int n15;
                    int n16;
                    n2 = b2.cy_() + random.nextInt(n6 * 2 + 1) - n6;
                    b b4 = new b(n2, n16 = b2.k(), n15 = b2.l() + random.nextInt(n11 * 2 + 1) - n11);
                    if (!k2.c(b4)) continue;
                    int n17 = 0;
                    for (Object object2 : ag.a) {
                        if (!k2.n(b4.a((ad)object2)).d().a()) continue;
                        ++n17;
                    }
                    if (n17 != true) continue;
                    k2.a(b4, p.ae.f(k2, b4, p.ae.v()), 2);
                    object2 = k2.q(b4);
                    if (!(object2 instanceof u)) continue block6;
                    ((u)object2).a(net.minecraft.q.a.a.j.d, random.nextLong());
                    continue block6;
                }
            }
            k2.a(b2, p.ac.v(), 2);
            ap ap2 = k2.q(b2);
            if (ap2 instanceof y) {
                ((y)ap2).b().a(this.a(random));
            } else {
                a.b("Failed to fetch mob spawner entity at ({}, {}, {})", b2.cy_(), b2.k(), b2.l());
            }
            return true;
        }
        return false;
    }

    private String a(Random random) {
        return b[random.nextInt(b.length)];
    }
}

