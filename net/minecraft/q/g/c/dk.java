/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.aw;
import net.minecraft.q.g.c.bg;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;

public class dk
extends j {
    private boolean c;

    public dk() {
    }

    public dk(k k2, Random random, int n2, int n3, int n4) {
        super(n2, n3);
        int n5;
        List list = aw.a(random, n4);
        ak ak2 = new ak(k2.k(), 0, random, (n2 << 4) + 2, (n3 << 4) + 2, list, n4);
        this.a.add(ak2);
        ak2.a(ak2, this.a, random);
        List list2 = ak2.h;
        List list3 = ak2.g;
        while (!list2.isEmpty() || !list3.isEmpty()) {
            r r2;
            if (list2.isEmpty()) {
                n5 = random.nextInt(list3.size());
                r2 = (r)list3.remove(n5);
                r2.a(ak2, this.a, random);
                continue;
            }
            n5 = random.nextInt(list2.size());
            r2 = (r)list2.remove(n5);
            r2.a(ak2, this.a, random);
        }
        this.c();
        n5 = 0;
        for (r r2 : this.a) {
            if (r2 instanceof bg) continue;
            ++n5;
        }
        this.c = n5 > 2;
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("Valid", this.c);
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.c = e2.p("Valid");
    }
}

