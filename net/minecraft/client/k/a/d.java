/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import com.a.a.d.ov;
import net.minecraft.client.g.ci;
import net.minecraft.client.k.a.f;
import net.minecraft.client.k.a.i;
import net.minecraft.client.k.a.j;
import net.minecraft.client.r;
import net.minecraft.m.cg;
import net.minecraft.r.c;
import net.minecraft.r.o;

class d
extends i {
    final /* synthetic */ j a;

    public d(j j2, r r2) {
        this.a = j2;
        super(j2, r2);
        this.w = ov.a();
        for (c c2 : net.minecraft.r.o.d) {
            boolean bl2 = false;
            cg cg2 = c2.a();
            if (net.minecraft.client.k.a.j.a(j2).a(c2) > 0) {
                bl2 = true;
            } else if (net.minecraft.r.o.c(cg2) != null && net.minecraft.client.k.a.j.a(j2).a(net.minecraft.r.o.c(cg2)) > 0) {
                bl2 = true;
            } else if (net.minecraft.r.o.a(cg2) != null && net.minecraft.client.k.a.j.a(j2).a(net.minecraft.r.o.a(cg2)) > 0) {
                bl2 = true;
            } else if (net.minecraft.r.o.d(cg2) != null && net.minecraft.client.k.a.j.a(j2).a(net.minecraft.r.o.d(cg2)) > 0) {
                bl2 = true;
            } else if (net.minecraft.r.o.e(cg2) != null && net.minecraft.client.k.a.j.a(j2).a(net.minecraft.r.o.e(cg2)) > 0) {
                bl2 = true;
            }
            if (!bl2) continue;
            this.w.add(c2);
        }
        this.x = new f(this);
    }

    @Override
    protected void a(int n2, int n3, ci ci2) {
        super.a(n2, n3, ci2);
        if (this.b == 0) {
            net.minecraft.client.k.a.j.a(this.a, n2 + 115 - 18 + 1, n3 + 1 + 1, 72, 18);
        } else {
            net.minecraft.client.k.a.j.a(this.a, n2 + 115 - 18, n3 + 1, 72, 18);
        }
        if (this.b == 1) {
            net.minecraft.client.k.a.j.a(this.a, n2 + 165 - 18 + 1, n3 + 1 + 1, 18, 18);
        } else {
            net.minecraft.client.k.a.j.a(this.a, n2 + 165 - 18, n3 + 1, 18, 18);
        }
        if (this.b == 2) {
            net.minecraft.client.k.a.j.a(this.a, n2 + 215 - 18 + 1, n3 + 1 + 1, 36, 18);
        } else {
            net.minecraft.client.k.a.j.a(this.a, n2 + 215 - 18, n3 + 1, 36, 18);
        }
        if (this.b == 3) {
            net.minecraft.client.k.a.j.a(this.a, n2 + 265 - 18 + 1, n3 + 1 + 1, 90, 18);
        } else {
            net.minecraft.client.k.a.j.a(this.a, n2 + 265 - 18, n3 + 1, 90, 18);
        }
        if (this.b == 4) {
            net.minecraft.client.k.a.j.a(this.a, n2 + 315 - 18 + 1, n3 + 1 + 1, 108, 18);
        } else {
            net.minecraft.client.k.a.j.a(this.a, n2 + 315 - 18, n3 + 1, 108, 18);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        c c2 = this.c(n2);
        cg cg2 = c2.a();
        net.minecraft.client.k.a.j.a(this.a, n3 + 40, n4, cg2);
        this.a(net.minecraft.r.o.c(cg2), n3 + 115, n4, n2 % 2 == 0);
        this.a(net.minecraft.r.o.a(cg2), n3 + 165, n4, n2 % 2 == 0);
        this.a(c2, n3 + 215, n4, n2 % 2 == 0);
        this.a(net.minecraft.r.o.d(cg2), n3 + 265, n4, n2 % 2 == 0);
        this.a(net.minecraft.r.o.e(cg2), n3 + 315, n4, n2 % 2 == 0);
    }

    @Override
    protected String b(int n2) {
        return n2 == 1 ? "stat.crafted" : (n2 == 2 ? "stat.used" : (n2 == 3 ? "stat.pickup" : (n2 == 4 ? "stat.dropped" : "stat.depleted")));
    }

    static /* synthetic */ j a(d d2) {
        return d2.a;
    }
}

