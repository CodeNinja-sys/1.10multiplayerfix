/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.b;
import net.minecraft.g.b.e;
import net.minecraft.g.bl;
import net.minecraft.g.c.i;
import net.minecraft.g.cd;
import net.minecraft.g.df;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.v.d;

public abstract class ar
extends bl {
    public static final e a = e.a("variant", df.class);

    public ar() {
        super(h.e);
        net.minecraft.g.c.b b2 = this.O.b();
        if (!this.c()) {
            b2 = b2.a(b, (Comparable)((Object)cd.b));
        }
        this.z(b2.a(a, (Comparable)((Object)df.a)));
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public cg a(net.minecraft.g.c.b b2, Random random, int n2) {
        return cg.a(p.cX);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return new cu(p.cX);
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        net.minecraft.g.c.b b2 = this.v().a(a, (Comparable)((Object)df.a));
        if (!this.c()) {
            b2 = b2.a(b, (Comparable)((Object)((n2 & 8) == 0 ? cd.b : cd.a)));
        }
        return b2;
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        if (!this.c() && b2.a(b) == cd.a) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected i a() {
        return this.c() ? new i(this, a) : new i(this, b, a);
    }

    @Override
    public String b(int n2) {
        return super.p();
    }

    @Override
    public b e() {
        return a;
    }

    @Override
    public Comparable a(cu cu2) {
        return df.a;
    }
}

