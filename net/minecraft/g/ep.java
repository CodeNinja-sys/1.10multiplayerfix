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
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class ep
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", net.minecraft.g.b.class);

    public ep() {
        super(h.d);
        this.z(this.O.b().a(a, (Comparable)((Object)net.minecraft.g.b.a)));
        this.a(d.b);
    }

    @Override
    public int k(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (net.minecraft.g.b b2 : net.minecraft.g.b.values()) {
            list.add(new cu(cg2, 1, b2.b()));
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)net.minecraft.g.b.a(n2)));
    }

    @Override
    public e g(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).c();
    }

    @Override
    public int b(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

