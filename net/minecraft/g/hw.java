/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.bb;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.q;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.c;
import net.minecraft.v.d;

public class hw
extends q {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("color", cd.class);

    public hw(h h2) {
        super(h2, false);
        this.z(this.O.b().a(a, (Comparable)((Object)cd.a)));
        this.a(d.b);
    }

    @Override
    public int k(b b2) {
        return ((cd)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (cd cd2 : cd.values()) {
            list.add(new cu(cg2, 1, cd2.b()));
        }
    }

    @Override
    public e g(b b2) {
        return ((cd)((Object)b2.a(a))).e();
    }

    @Override
    public c bR_() {
        return c.d;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected boolean bQ_() {
        return true;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)cd.b(n2)));
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            bb.c(k2, b2);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            bb.c(k2, b2);
        }
    }

    @Override
    public int b(b b2) {
        return ((cd)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

