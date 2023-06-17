/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.a.p;
import net.minecraft.client.g.h.a;
import net.minecraft.client.g.h.d;
import net.minecraft.client.g.h.e;
import net.minecraft.client.g.h.h;
import net.minecraft.client.g.h.i;
import net.minecraft.client.g.h.k;
import net.minecraft.client.g.h.l;
import net.minecraft.client.g.h.m;
import net.minecraft.client.g.h.o;
import net.minecraft.client.g.h.t;
import net.minecraft.client.g.h.v;
import net.minecraft.client.g.h.x;
import net.minecraft.client.g.h.y;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.n;
import net.minecraft.u.bn;

public class g {
    private final bn a = new bn(32);

    public static g a() {
        g g2 = new g();
        g2.a(new m(), p.cF);
        g2.a(new x(g2), p.ca);
        g2.a(new a(), p.c);
        g2.a(new h(), p.t);
        g2.a(new l(), p.u);
        g2.a(new k(), p.j, p.i);
        g2.a(new e(), p.af);
        g2.a(new y(), p.aM);
        g2.a(new i(), p.bm, p.bl);
        g2.a(new v(), p.H);
        g2.a(new t(), p.bn);
        g2.a(new o(), p.bx);
        return g2;
    }

    public int a(b b2) {
        d d2 = (d)this.a.a(cn.c(b2.c()));
        if (d2 != null) {
            return d2.a(b2, null, null, 0);
        }
        net.minecraft.g.a.e e2 = b2.j();
        return e2 != null ? e2.L : -1;
    }

    public int a(b b2, n n2, net.minecraft.u.b.b b3, int n3) {
        d d2 = (d)this.a.a(cn.c(b2.c()));
        return d2 == null ? -1 : d2.a(b2, n2, b3, n3);
    }

    public void a(d d2, cn ... arrcn) {
        cn[] arrcn2 = arrcn;
        int n2 = arrcn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cn cn2 = arrcn2[i2];
            this.a.a(d2, cn.c(cn2));
        }
    }
}

