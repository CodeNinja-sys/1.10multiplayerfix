/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.client.f.u;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.k.av;
import net.minecraft.client.k.bm;
import net.minecraft.client.k.de;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.g.e;

class q
extends av {
    public int a;
    final /* synthetic */ bm b;

    public q(bm bm2) {
        this.b = bm2;
        super(bm2.n, bm2.p, bm2.q, 43, bm2.q - 60, 24);
        this.a = -1;
    }

    private void a(int n2, int n3, cu cu2) {
        this.e(n2 + 1, n3 + 1);
        bd.A();
        if (cu2 != null && cu2.a() != null) {
            am.c();
            this.b.o.a(cu2, n2 + 2, n3 + 2);
            am.a();
        }
        bd.B();
    }

    private void e(int n2, int n3) {
        this.d(n2, n3, 0, 0);
    }

    private void d(int n2, int n3, int n4, int n5) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c.N().a(de.z);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b((double)(n2 + 0), (double)(n3 + 18), (double)this.b.B).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        g2.b((double)(n2 + 18), (double)(n3 + 18), (double)this.b.B).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        g2.b((double)(n2 + 18), (double)(n3 + 0), (double)this.b.B).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        g2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.b.B).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        ci2.b();
    }

    @Override
    protected int a() {
        return bm.a(this.b).c().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a = n2;
        this.b.g();
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.a;
    }

    @Override
    protected void d() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        String string;
        e e2 = (e)bm.a(this.b).c().get(bm.a(this.b).c().size() - n2 - 1);
        b b2 = e2.b();
        cn cn2 = b2.c();
        cg cg2 = cg.a(cn2);
        cu cu2 = cn2 != net.minecraft.a.p.a && cg2 != null ? new cu(cg2, 1, cn2.b(b2)) : null;
        String string2 = string = cu2 == null ? net.minecraft.client.f.u.a("createWorld.customize.flat.air", new Object[0]) : cg2.a(cu2);
        if (cg2 == null) {
            if (cn2 != net.minecraft.a.p.j && cn2 != net.minecraft.a.p.i) {
                if (cn2 == net.minecraft.a.p.l || cn2 == net.minecraft.a.p.k) {
                    cg2 = w.aA;
                }
            } else {
                cg2 = w.az;
            }
            if (cg2 != null) {
                cu2 = new cu(cg2, 1, cn2.b(b2));
                string = cn2.bV_();
            }
        }
        this.a(n3, n4, cu2);
        this.b.u.a(string, n3 + 18 + 5, n4 + 3, 0xFFFFFF);
        String string3 = n2 == 0 ? net.minecraft.client.f.u.a("createWorld.customize.flat.layer.top", e2.a()) : (n2 == bm.a(this.b).c().size() - 1 ? net.minecraft.client.f.u.a("createWorld.customize.flat.layer.bottom", e2.a()) : net.minecraft.client.f.u.a("createWorld.customize.flat.layer", e2.a()));
        this.b.u.a(string3, n3 + 2 + 213 - this.b.u.a(string3), n4 + 3, 0xFFFFFF);
    }

    @Override
    protected int j() {
        return this.d - 70;
    }
}

