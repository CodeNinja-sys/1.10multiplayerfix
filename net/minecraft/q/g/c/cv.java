/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;

public class cv
extends j {
    public cv() {
    }

    public cv(k k2, Random random, int n2, int n3) {
        super(n2, n3);
        dq.b();
        ds ds2 = new ds(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(ds2);
        ds2.a(ds2, this.a, random);
        List list = ds2.f;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            r r2 = (r)list.remove(n4);
            r2.a(ds2, this.a, random);
        }
        this.c();
        this.a(k2, random, 10);
    }
}

