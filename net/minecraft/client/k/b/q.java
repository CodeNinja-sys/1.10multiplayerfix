/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.f.u;
import net.minecraft.client.g.af;
import net.minecraft.client.g.am;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.k.a.g;
import net.minecraft.client.k.a.j;
import net.minecraft.client.k.b.k;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class q
extends af {
    private float a;
    private float j;

    public q(b b2) {
        super(b2.r);
        this.t = true;
    }

    @Override
    public void bY_() {
        if (this.n.d.h()) {
            this.n.a(new k(this.n.j));
        }
        if (net.minecraft.l.k.g) {
            this.n.a((cc)null);
            this.n.o();
        }
    }

    @Override
    public void ct_() {
        this.r.clear();
        if (this.n.d.h()) {
            this.n.a(new k(this.n.j));
        } else {
            super.ct_();
        }
    }

    @Override
    protected void b(int n2, int n3) {
        this.u.a(net.minecraft.client.f.u.a("container.crafting", new Object[0]), 97, 8, 0x404040);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        this.a = n2;
        this.j = n3;
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(b);
        int n4 = this.f;
        int n5 = this.g;
        this.a_(n4, n5, 0, 0, this.c, this.d);
        net.minecraft.client.k.b.q.a(n4 + 51, n5 + 75, 30, (float)(n4 + 51) - this.a, (float)(n5 + 75 - 50) - this.j, this.n.j);
    }

    public static void a(int n2, int n3, int n4, float f2, float f3, l l2) {
        bd.g();
        bd.D();
        bd.c((float)n2, (float)n3, 50.0f);
        bd.b((float)(-n4), (float)n4, (float)n4);
        bd.b(180.0f, 0.0f, 0.0f, 1.0f);
        float f4 = l2.ak;
        float f5 = l2.ba;
        float f6 = l2.bb;
        float f7 = l2.an;
        float f8 = l2.am;
        bd.b(135.0f, 0.0f, 1.0f, 0.0f);
        am.b();
        bd.b(-135.0f, 0.0f, 1.0f, 0.0f);
        bd.b(-((float)Math.atan(f3 / 40.0f)) * 20.0f, 1.0f, 0.0f, 0.0f);
        l2.ak = (float)Math.atan(f2 / 40.0f) * 20.0f;
        l2.ba = (float)Math.atan(f2 / 40.0f) * 40.0f;
        l2.bb = -((float)Math.atan(f3 / 40.0f)) * 20.0f;
        l2.am = l2.ba;
        l2.an = l2.ba;
        bd.c(0.0f, 0.0f, 0.0f);
        f f9 = net.minecraft.client.r.z().ab();
        f9.a(180.0f);
        f9.a(false);
        f9.a(l2, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
        f9.a(true);
        l2.ak = f4;
        l2.ba = f5;
        l2.bb = f6;
        l2.an = f7;
        l2.am = f8;
        bd.E();
        am.a();
        bd.B();
        bd.g(ay.r);
        bd.w();
        bd.g(ay.q);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 0) {
            this.n.a(new g(this, this.n.j.y()));
        }
        if (ch2.j == 1) {
            this.n.a(new j(this, this.n.j.y()));
        }
    }
}

