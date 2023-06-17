/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.b.a;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.n;

public class fb
extends cn {
    public fb() {
        super(h.G);
        this.a(d.c);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, n n2) {
        n2.am();
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.H;
    }

    @Override
    protected boolean bQ_() {
        return true;
    }

    @Override
    public c bR_() {
        return c.c;
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (!k2.C && cu2 != null && cu2.a() == net.minecraft.a.w.bl) {
            b2.a(o.a(this));
            fb.a(k2, b3, new cu(cg.a(this), 1));
        } else {
            super.a(k2, b2, b3, b4, ap2, cu2);
        }
    }
}

