/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.av;
import net.minecraft.client.r;
import net.minecraft.u.b.n;

public class h
extends av {
    private final net.minecraft.s.r a;

    public h(net.minecraft.s.r r2, int n2, int n3, int n4, int n5, int n6) {
        super(net.minecraft.client.r.z(), n2, n3, n4, n5, n6);
        this.a = r2;
    }

    @Override
    protected int a() {
        return this.a.a();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a.a(n2, bl2, n3, n4);
    }

    @Override
    protected boolean a(int n2) {
        return this.a.a(n2);
    }

    @Override
    protected void d() {
        this.a.c();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
    }

    public int b() {
        return this.d;
    }

    public int e() {
        return this.l;
    }

    public int f() {
        return this.k;
    }

    @Override
    protected int c() {
        return this.a.b();
    }

    @Override
    protected int j() {
        return this.a.g();
    }

    @Override
    public void cr_() {
        super.cr_();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.s) {
            this.k = n2;
            this.l = n3;
            this.d();
            int n4 = this.j();
            int n5 = n4 + 6;
            this.k();
            bd.f();
            bd.o();
            ci ci2 = ci.a();
            g g2 = ci2.c();
            int n6 = this.i + this.d / 2 - this.i() / 2 + 2;
            int n7 = this.f + 4 - (int)this.p;
            if (this.u) {
                this.a(n6, n7, ci2);
            }
            this.b(n6, n7, n2, n3);
            bd.i();
            this.c(0, this.f, 255, 255);
            this.c(this.g, this.e, 255, 255);
            bd.l();
            bd.a(ad.l, bc.j, ad.o, bc.e);
            bd.c();
            bd.j(7425);
            bd.w();
            int n8 = this.l();
            if (n8 > 0) {
                int n9 = (this.g - this.f) * (this.g - this.f) / this.c();
                int n10 = (int)this.p * (this.g - this.f - (n9 = net.minecraft.u.b.n.a(n9, 32, this.g - this.f - 8))) / n8 + this.f;
                if (n10 < this.f) {
                    n10 = this.f;
                }
                g2.a(7, b.i);
                g2.b((double)n4, (double)this.g, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                g2.b((double)n5, (double)this.g, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b((double)n5, (double)this.f, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                g2.b((double)n4, (double)this.f, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                ci2.b();
                g2.a(7, b.i);
                g2.b((double)n4, (double)(n10 + n9), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                g2.b((double)n5, (double)(n10 + n9), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                g2.b((double)n5, (double)n10, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                g2.b((double)n4, (double)n10, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                ci2.b();
                g2.a(7, b.i);
                g2.b((double)n4, (double)(n10 + n9 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
                g2.b((double)(n5 - 1), (double)(n10 + n9 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
                g2.b((double)(n5 - 1), (double)n10, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
                g2.b((double)n4, (double)n10, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
                ci2.b();
            }
            this.b(n2, n3);
            bd.v();
            bd.j(7424);
            bd.d();
            bd.k();
        }
    }
}

