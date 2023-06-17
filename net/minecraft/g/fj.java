/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.r;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class fj
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("type", r.class);

    public fj() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)r.a)));
        this.a(d.b);
    }

    @Override
    public int k(b b2) {
        return ((r)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (r r2 : r.values()) {
            list.add(new cu(cg2, 1, r2.b()));
        }
    }

    @Override
    public e g(b b2) {
        return e.d;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)r.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((r)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

