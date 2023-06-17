/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a.ao;
import net.minecraft.q.g.a.as;
import net.minecraft.q.g.a.v;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.e.n;

public class m
extends q {
    private final boolean a;
    private final ao b = new ao();
    private final as c = new as(4);

    public m(boolean bl2, ab ab2) {
        super(ab2);
        this.a = bl2;
        if (bl2) {
            this.u = net.minecraft.a.p.aJ.v();
        }
        this.y.clear();
        this.y.add(new am(net.minecraft.w.h.am.class, 10, 2, 3));
        this.y.add(new am(n.class, 1, 1, 2));
    }

    @Override
    public float c() {
        return 0.07f;
    }

    @Override
    public void a(k k2, Random random, b b2) {
        if (this.a) {
            int n2;
            int n3;
            int n4;
            for (n4 = 0; n4 < 3; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                this.b.a(k2, random, k2.k(b2.a(n3, 0, n2)));
            }
            for (n4 = 0; n4 < 2; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                this.c.a(k2, random, k2.k(b2.a(n3, 0, n2)));
            }
        }
        super.a(k2, random, b2);
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return new v(false);
    }
}

