/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.a.c;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.d;
import net.minecraft.client.g.cc;
import net.minecraft.client.k.ce;
import net.minecraft.f.ap;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.u.d.a;
import net.minecraft.w.n;

public abstract class o {
    protected static final bp[] b = new bp[]{new bp("textures/blocks/destroy_stage_0.png"), new bp("textures/blocks/destroy_stage_1.png"), new bp("textures/blocks/destroy_stage_2.png"), new bp("textures/blocks/destroy_stage_3.png"), new bp("textures/blocks/destroy_stage_4.png"), new bp("textures/blocks/destroy_stage_5.png"), new bp("textures/blocks/destroy_stage_6.png"), new bp("textures/blocks/destroy_stage_7.png"), new bp("textures/blocks/destroy_stage_8.png"), new bp("textures/blocks/destroy_stage_9.png")};
    protected d c;

    public void a(ap ap2, double d2, double d3, double d4, float f2, int n2) {
        a a2 = ap2.aK();
        if (a2 != null && this.c.j != null && ap2.D().equals(this.c.j.a())) {
            this.a(true);
            this.a(ap2, a2.d(), d2, d3, d4, 12);
            this.a(false);
        }
    }

    protected void a(boolean bl2) {
        bd.g(ay.r);
        if (bl2) {
            bd.w();
        } else {
            bd.v();
        }
        bd.g(ay.q);
    }

    protected void a(bp bp2) {
        c c2 = this.c.e;
        if (c2 != null) {
            c2.a(bp2);
        }
    }

    protected k c() {
        return this.c.f;
    }

    public void a(d d2) {
        this.c = d2;
    }

    public ce d() {
        return this.c.a();
    }

    public boolean a(ap ap2) {
        return false;
    }

    protected void a(ap ap2, String string, double d2, double d3, double d4, int n2) {
        n n3 = this.c.g;
        double d5 = ap2.a(n3.aU, n3.aV, n3.aW);
        if (d5 <= (double)(n2 * n2)) {
            float f2 = this.c.h;
            float f3 = this.c.i;
            boolean bl2 = false;
            cc.a(this.d(), string, (float)d2 + 0.5f, (float)d3 + 1.5f, (float)d4 + 0.5f, 0, f2, f3, false, false);
        }
    }
}

