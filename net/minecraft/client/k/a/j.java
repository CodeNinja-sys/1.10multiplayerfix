/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.a.a;
import net.minecraft.client.k.a.d;
import net.minecraft.client.k.a.e;
import net.minecraft.client.k.a.h;
import net.minecraft.client.k.av;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.u;
import net.minecraft.client.r;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.f;
import net.minecraft.x.d.a.ah;
import net.minecraft.x.d.a.x;

public class j
extends cc
implements u {
    protected cc b;
    protected String c = "Select world";
    private a d;
    private d e;
    private h f;
    private e g;
    private final f h;
    private av i;
    private boolean j = true;

    public j(cc cc2, f f2) {
        this.b = cc2;
        this.h = f2;
    }

    @Override
    public void ct_() {
        this.c = net.minecraft.client.f.u.a("gui.stats", new Object[0]);
        this.j = true;
        this.n.v().a(new x(ah.b));
    }

    @Override
    public void cp_() {
        super.cp_();
        if (this.i != null) {
            this.i.cr_();
        }
    }

    public void f() {
        this.d = new a(this, this.n);
        this.d.d(1, 1);
        this.e = new d(this, this.n);
        this.e.d(1, 1);
        this.f = new h(this, this.n);
        this.f.d(1, 1);
        this.g = new e(this, this.n);
        this.g.d(1, 1);
    }

    public void g() {
        this.r.add(new ch(0, this.p / 2 + 4, this.q - 28, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.r.add(new ch(1, this.p / 2 - 160, this.q - 52, 80, 20, net.minecraft.client.f.u.a("stat.generalButton", new Object[0])));
        ch ch2 = this.b(new ch(2, this.p / 2 - 80, this.q - 52, 80, 20, net.minecraft.client.f.u.a("stat.blocksButton", new Object[0])));
        ch ch3 = this.b(new ch(3, this.p / 2, this.q - 52, 80, 20, net.minecraft.client.f.u.a("stat.itemsButton", new Object[0])));
        ch ch4 = this.b(new ch(4, this.p / 2 + 80, this.q - 52, 80, 20, net.minecraft.client.f.u.a("stat.mobsButton", new Object[0])));
        if (this.f.a() == 0) {
            ch2.k = false;
        }
        if (this.e.a() == 0) {
            ch3.k = false;
        }
        if (this.g.a() == 0) {
            ch4.k = false;
        }
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 0) {
                this.n.a(this.b);
            } else if (ch2.j == 1) {
                this.i = this.d;
            } else if (ch2.j == 3) {
                this.i = this.e;
            } else if (ch2.j == 2) {
                this.i = this.f;
            } else if (ch2.j == 4) {
                this.i = this.g;
            } else {
                this.i.a(ch2);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.j) {
            this.m();
            this.a(this.u, net.minecraft.client.f.u.a("multiplayer.downloadingStats", new Object[0]), this.p / 2, this.q / 2, 0xFFFFFF);
            this.a(this.u, a[(int)(net.minecraft.client.r.I() / 150L % (long)a.length)], this.p / 2, this.q / 2 + this.u.a * 2, 0xFFFFFF);
        } else {
            this.i.a(n2, n3, f2);
            this.a(this.u, this.c, this.p / 2, 20, 0xFFFFFF);
            super.a(n2, n3, f2);
        }
    }

    @Override
    public void d() {
        if (this.j) {
            this.f();
            this.g();
            this.i = this.d;
            this.j = false;
        }
    }

    @Override
    public boolean cq_() {
        return !this.j;
    }

    private void a(int n2, int n3, cg cg2) {
        this.b(n2 + 1, n3 + 1);
        bd.A();
        am.c();
        this.o.a(new cu(cg2), n2 + 2, n3 + 2);
        am.a();
        bd.B();
    }

    private void b(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    private void c(int n2, int n3, int n4, int n5) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(z);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b((double)(n2 + 0), (double)(n3 + 18), (double)this.B).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        g2.b((double)(n2 + 18), (double)(n3 + 18), (double)this.B).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        g2.b((double)(n2 + 18), (double)(n3 + 0), (double)this.B).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        g2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.B).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        ci2.b();
    }

    static /* synthetic */ void a(j j2, int n2, int n3, int n4, int n5) {
        j2.c(n2, n3, n4, n5);
    }

    static /* synthetic */ f a(j j2) {
        return j2.h;
    }

    static /* synthetic */ ce b(j j2) {
        return j2.u;
    }

    static /* synthetic */ void a(j j2, int n2, int n3, int n4, int n5, int n6, int n7) {
        j2.b(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ void a(j j2, int n2, int n3, cg cg2) {
        j2.a(n2, n3, cg2);
    }
}

