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
import net.minecraft.g.dk;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public class fe
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", dk.class);
    public static final int b = dk.a.b();
    public static final int c = dk.b.b();
    public static final int d = dk.c.b();

    public fe() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)dk.a)));
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.p()) + "." + dk.a.c() + ".name");
    }

    @Override
    public e g(b b2) {
        return b2.a(a) == dk.a ? e.y : e.G;
    }

    @Override
    public int k(b b2) {
        return ((dk)((Object)b2.a(a))).b();
    }

    @Override
    public int b(b b2) {
        return ((dk)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)dk.a(n2)));
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, b));
        list.add(new cu(cg2, 1, c));
        list.add(new cu(cg2, 1, d));
    }
}

