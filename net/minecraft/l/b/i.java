/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l.b;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.b.b;
import net.minecraft.b.d;
import net.minecraft.l.b.g;
import net.minecraft.m.cu;
import net.minecraft.o.j;
import net.minecraft.o.k;
import net.minecraft.u.b.n;

class i
implements g {
    i() {
    }

    @Override
    public void a(d d2, Random random) {
        j j2 = (j)j.b.a(random);
        int n2 = n.a(random, j2.d(), j2.a());
        cu cu2 = w.cn.a(new k(j2, n2));
        int n3 = 2 + random.nextInt(5 + n2 * 10) + 3 * n2;
        if (j2.e()) {
            n3 *= 2;
        }
        if (n3 > 64) {
            n3 = 64;
        }
        d2.add(new b(new cu(w.aS), new cu(w.bY, n3), cu2));
    }
}

