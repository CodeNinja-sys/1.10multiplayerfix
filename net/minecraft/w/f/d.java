/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.ib;
import net.minecraft.h.aq;
import net.minecraft.h.w;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.n;
import net.minecraft.w.a.a;
import net.minecraft.w.f.m;
import net.minecraft.w.f.v;

public class d
extends v {
    public d(k k2) {
        super(k2);
    }

    public d(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(net.minecraft.u.a.a a2) {
        v.b(a2, "MinecartChest");
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        if (this.aQ.G().b("doEntityDrops")) {
            this.a(cg.a(p.ae), 1, 0.0f);
        }
    }

    @Override
    public int e() {
        return 27;
    }

    @Override
    public m a() {
        return m.b;
    }

    @Override
    public b c() {
        return p.ae.v().a(ib.a, (Comparable)((Object)ad.c));
    }

    @Override
    public int cC_() {
        return 8;
    }

    @Override
    public String h() {
        return "minecraft:chest";
    }

    @Override
    public aq a(a a2, net.minecraft.w.a.b b2) {
        this.e(b2);
        return new w(a2, this, b2);
    }
}

