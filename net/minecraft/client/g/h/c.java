/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.a.w;
import net.minecraft.client.g.h.b;
import net.minecraft.client.g.h.f;
import net.minecraft.client.g.h.g;
import net.minecraft.client.g.h.j;
import net.minecraft.client.g.h.n;
import net.minecraft.client.g.h.p;
import net.minecraft.client.g.h.q;
import net.minecraft.client.g.h.r;
import net.minecraft.client.g.h.s;
import net.minecraft.client.g.h.u;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.bn;

public class c {
    private final bn a = new bn(32);

    public static c a(g g2) {
        c c2 = new c();
        c2.a((j)new r(), w.S, w.T, w.U, w.V);
        c2.a((j)new f(), w.cO, w.cQ);
        c2.a((j)new b(), net.minecraft.a.p.cF);
        c2.a((j)new q(), w.cm);
        c2.a((j)new n(), w.bG, w.bH, w.bI);
        c2.a((j)new p(), w.bT);
        c2.a((j)new s(g2), net.minecraft.a.p.c, net.minecraft.a.p.H, net.minecraft.a.p.bn, net.minecraft.a.p.t, net.minecraft.a.p.u, net.minecraft.a.p.bx);
        c2.a((j)new u(), w.i);
        return c2;
    }

    public int a(cu cu2, int n2) {
        j j2 = (j)this.a.a(cg.e.d(cu2.a()));
        return j2 == null ? -1 : j2.a(cu2, n2);
    }

    public void a(j j2, cn ... arrcn) {
        cn[] arrcn2 = arrcn;
        int n2 = arrcn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cn cn2 = arrcn2[i2];
            this.a.a(j2, cg.a(cg.a(cn2)));
        }
    }

    public void a(j j2, cg ... arrcg) {
        cg[] arrcg2 = arrcg;
        int n2 = arrcg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cg cg2 = arrcg2[i2];
            this.a.a(j2, cg.a(cg2));
        }
    }
}

