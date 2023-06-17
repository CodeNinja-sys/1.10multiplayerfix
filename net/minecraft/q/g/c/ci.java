/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.a;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.av;
import net.minecraft.q.g.c.br;
import net.minecraft.q.g.c.cd;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.q;
import net.minecraft.q.g.c.r;
import net.minecraft.u.ad;

public class ci {
    public static void a() {
        da.a(av.class, "MSCorridor");
        da.a(a.class, "MSCrossing");
        da.a(cd.class, "MSRoom");
        da.a(br.class, "MSStairs");
    }

    private static q a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5, aj aj2) {
        int n6 = random.nextInt(100);
        if (n6 >= 80) {
            dc dc2 = a.a(list, random, n2, n3, n4, ad2);
            if (dc2 != null) {
                return new a(n5, random, dc2, ad2, aj2);
            }
        } else if (n6 >= 70) {
            dc dc3 = br.a(list, random, n2, n3, n4, ad2);
            if (dc3 != null) {
                return new br(n5, random, dc3, ad2, aj2);
            }
        } else {
            dc dc4 = av.a(list, random, n2, n3, n4, ad2);
            if (dc4 != null) {
                return new av(n5, random, dc4, ad2, aj2);
            }
        }
        return null;
    }

    private static q b(r r2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        if (n5 > 8) {
            return null;
        }
        if (Math.abs(n2 - r2.f().a) <= 80 && Math.abs(n4 - r2.f().c) <= 80) {
            aj aj2 = ((q)r2).a;
            q q2 = ci.a(list, random, n2, n3, n4, ad2, n5 + 1, aj2);
            if (q2 != null) {
                list.add(q2);
                q2.a(r2, list, random);
            }
            return q2;
        }
        return null;
    }

    static /* synthetic */ q a(r r2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        return ci.b(r2, list, random, n2, n3, n4, ad2, n5);
    }
}

