/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.a.c;
import net.minecraft.a.w;
import net.minecraft.d.j;
import net.minecraft.e.e;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.w.c.f;
import net.minecraft.w.l;

public class h
extends f {
    private int f = 200;

    public h(k k2) {
        super(k2);
    }

    public h(k k2, l l2) {
        super(k2, l2);
    }

    public h(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.aQ.C && !this.a) {
            this.aQ.a(aj.o, this.aU, this.aV, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected cu a() {
        return new cu(w.h);
    }

    @Override
    protected void a(l l2) {
        super.a(l2);
        j j2 = new j(net.minecraft.a.c.x, this.f, 0);
        l2.c(j2);
    }

    public static void b(a a2) {
        net.minecraft.w.c.f.a(a2, "SpectralArrow");
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.e("Duration")) {
            this.f = e2.h("Duration");
        }
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("Duration", this.f);
    }
}

