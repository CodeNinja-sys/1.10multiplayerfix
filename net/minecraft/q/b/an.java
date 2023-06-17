/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.g.t;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a.af;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.aw;
import net.minecraft.q.g.a.i;
import net.minecraft.q.g.a.r;
import net.minecraft.q.g.a.x;
import net.minecraft.q.k;
import net.minecraft.w.h.ah;
import net.minecraft.w.h.u;

public class an
extends q {
    private final boolean a;
    private static final b b = net.minecraft.a.p.r.v().a(net.minecraft.g.s.a, (Comparable)((Object)net.minecraft.g.b.d));
    private static final b c = net.minecraft.a.p.t.v().a(net.minecraft.g.m.a, (Comparable)((Object)net.minecraft.g.b.d)).a(bm.c, Boolean.valueOf(false));
    private static final b B = net.minecraft.a.p.t.v().a(net.minecraft.g.m.a, (Comparable)((Object)net.minecraft.g.b.a)).a(bm.c, Boolean.valueOf(false));

    public an(boolean bl2, ab ab2) {
        super(ab2);
        this.a = bl2;
        this.w.A = bl2 ? 2 : 50;
        this.w.D = 25;
        this.w.C = 4;
        if (!bl2) {
            this.x.add(new am(u.class, 2, 1, 1));
        }
        this.y.add(new am(ah.class, 10, 4, 4));
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return random.nextInt(10) == 0 ? r : (random.nextInt(2) == 0 ? new af(b, B) : (!this.a && random.nextInt(3) == 0 ? new net.minecraft.q.g.a.k(false, 10, 20, b, c) : new x(false, 4 + random.nextInt(7), b, c, true)));
    }

    @Override
    public aj b(Random random) {
        return random.nextInt(4) == 0 ? new r(net.minecraft.g.t.c) : new r(net.minecraft.g.t.b);
    }

    @Override
    public void a(k k2, Random random, net.minecraft.u.b.b b2) {
        super.a(k2, random, b2);
        int n2 = random.nextInt(16) + 8;
        int n3 = random.nextInt(16) + 8;
        int n4 = random.nextInt(k2.k(b2.a(n2, 0, n3)).k() * 2);
        new i().a(k2, random, b2.a(n2, n4, n3));
        aw aw2 = new aw();
        for (n3 = 0; n3 < 50; ++n3) {
            n4 = random.nextInt(16) + 8;
            int n5 = 128;
            int n6 = random.nextInt(16) + 8;
            aw2.a(k2, random, b2.a(n4, 128, n6));
        }
    }
}

