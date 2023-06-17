/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.ev;
import net.minecraft.g.hy;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class go
extends cn {
    public static final e a = e.a("type", ev.class);

    public go() {
        super(h.e, hy.b.d());
        this.z(this.O.b().a(a, (Comparable)((Object)ev.a)));
        this.a(d.b);
    }

    @Override
    public int k(b b2) {
        return ((ev)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (ev ev2 : ev.values()) {
            list.add(new cu(cg2, 1, ev2.b()));
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ev.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((ev)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

