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
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class bw
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("color", cd.class);

    public bw(h h2) {
        super(h2);
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
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)cd.b(n2)));
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

