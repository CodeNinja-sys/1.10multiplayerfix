/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;

public class bm
extends j {
    public bm() {
    }

    public bm(k k2, Random random, int n2, int n3) {
        super(n2, n3);
        cc cc2 = new cc(random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(cc2);
        cc2.a(cc2, this.a, random);
        List list = cc2.f;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            r r2 = (r)list.remove(n4);
            r2.a(cc2, this.a, random);
        }
        this.c();
        this.a(k2, random, 48, 70);
    }
}

