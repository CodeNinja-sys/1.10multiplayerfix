/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bo;
import net.minecraft.g.db;
import net.minecraft.g.fh;
import net.minecraft.g.gb;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a;
import net.minecraft.q.g.a.aa;
import net.minecraft.q.g.a.ac;
import net.minecraft.q.g.a.ae;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.b;
import net.minecraft.q.g.a.c;
import net.minecraft.q.g.a.d;
import net.minecraft.q.g.a.e;
import net.minecraft.q.g.a.l;
import net.minecraft.q.g.a.o;
import net.minecraft.q.g.a.s;
import net.minecraft.q.g.a.w;
import net.minecraft.q.g.a.y;
import net.minecraft.q.g.h;
import net.minecraft.q.k;

public class t {
    protected boolean b;
    protected net.minecraft.u.b.b c;
    protected a d;
    protected aj e = new w(4);
    protected aj f = new e(net.minecraft.a.p.m, 7);
    protected aj g = new e(net.minecraft.a.p.n, 6);
    protected aj h;
    protected aj i;
    protected aj j;
    protected aj k;
    protected aj l;
    protected aj m;
    protected aj n;
    protected aj o;
    protected aj p;
    protected aj q;
    protected aj r;
    protected d s = new d(net.minecraft.a.p.N, fh.a);
    protected aj t = new b(net.minecraft.a.p.P);
    protected aj u = new b(net.minecraft.a.p.Q);
    protected aj v = new ae();
    protected aj w = new c();
    protected aj x = new s();
    protected aj y = new aa();
    protected int z;
    protected int A;
    protected float B = 0.1f;
    protected int C = 2;
    protected int D = 1;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I = 1;
    protected int J = 3;
    protected int K = 1;
    protected int L;
    public boolean M = true;

    public void a(k k2, Random random, q q2, net.minecraft.u.b.b b2) {
        if (this.b) {
            throw new RuntimeException("Already decorating");
        }
        this.d = net.minecraft.q.g.h.a(k2.F().u()).b();
        this.c = b2;
        this.h = new y(net.minecraft.a.p.d.v(), this.d.I);
        this.i = new y(net.minecraft.a.p.n.v(), this.d.M);
        this.j = new y(net.minecraft.a.p.b.v().a(bo.a, (Comparable)((Object)db.b)), this.d.Q);
        this.k = new y(net.minecraft.a.p.b.v().a(bo.a, (Comparable)((Object)db.d)), this.d.U);
        this.l = new y(net.minecraft.a.p.b.v().a(bo.a, (Comparable)((Object)db.f)), this.d.Y);
        this.m = new y(net.minecraft.a.p.q.v(), this.d.ac);
        this.n = new y(net.minecraft.a.p.p.v(), this.d.ag);
        this.o = new y(net.minecraft.a.p.o.v(), this.d.ak);
        this.p = new y(net.minecraft.a.p.aC.v(), this.d.ao);
        this.q = new y(net.minecraft.a.p.ag.v(), this.d.as);
        this.r = new y(net.minecraft.a.p.x.v(), this.d.aw);
        this.a(q2, k2, random);
        this.b = false;
    }

    protected void a(q q2, k k2, Random random) {
        Object object;
        Object object2;
        net.minecraft.u.b.b b2;
        Object object3;
        int n2;
        int n3;
        int n4;
        int n5;
        this.a(k2, random);
        for (n5 = 0; n5 < this.J; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            this.f.a(k2, random, k2.p(this.c.a(n4, 0, n3)));
        }
        for (n5 = 0; n5 < this.K; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            this.e.a(k2, random, k2.p(this.c.a(n4, 0, n3)));
        }
        for (n5 = 0; n5 < this.I; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            this.g.a(k2, random, k2.p(this.c.a(n4, 0, n3)));
        }
        n5 = this.A;
        if (random.nextFloat() < this.B) {
            ++n5;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(16) + 8;
            object3 = q2.a(random);
            ((aj)object3).a();
            b2 = k2.k(this.c.a(n3, 0, n2));
            if (!((aj)object3).a(k2, random, b2)) continue;
            ((net.minecraft.q.g.a.q)object3).b(k2, random, b2);
        }
        for (n4 = 0; n4 < this.L; ++n4) {
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(16) + 8;
            this.v.a(k2, random, k2.k(this.c.a(n3, 0, n2)));
        }
        for (n4 = 0; n4 < this.C; ++n4) {
            int n6;
            gb gb2;
            n3 = random.nextInt(16) + 8;
            int n7 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() + 32;
            if (n7 <= 0 || (gb2 = ((fh)(object2 = q2.a(random, (net.minecraft.u.b.b)(object = this.c.a(n3, n6 = random.nextInt(n7), n2))))).b().a()).v().d() == net.minecraft.g.a.h.a) continue;
            this.s.a(gb2, (fh)object2);
            this.s.a(k2, random, (net.minecraft.u.b.b)object);
        }
        for (n4 = 0; n4 < this.D; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n8 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() * 2;
            if (n8 <= 0) continue;
            int n9 = random.nextInt(n8);
            q2.b(random).a(k2, random, this.c.a(n3, n9, n2));
        }
        for (n4 = 0; n4 < this.E; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n10 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() * 2;
            if (n10 <= 0) continue;
            int n11 = random.nextInt(n10);
            new l().a(k2, random, this.c.a(n3, n11, n2));
        }
        for (n4 = 0; n4 < this.z; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n12 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() * 2;
            if (n12 <= 0) continue;
            int n13 = random.nextInt(n12);
            object = this.c.a(n3, n13, n2);
            while (((net.minecraft.u.b.t)object).k() > 0) {
                object2 = ((net.minecraft.u.b.b)object).c();
                if (!k2.c((net.minecraft.u.b.b)object2)) break;
                object = object2;
            }
            this.y.a(k2, random, (net.minecraft.u.b.b)object);
        }
        for (n4 = 0; n4 < this.F; ++n4) {
            int n14;
            if (random.nextInt(4) == 0) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                object3 = k2.k(this.c.a(n3, 0, n2));
                this.t.a(k2, random, (net.minecraft.u.b.b)object3);
            }
            if (random.nextInt(8) != 0 || (n14 = k2.k(this.c.a(n3 = random.nextInt(16) + 8, 0, n2 = random.nextInt(16) + 8)).k() * 2) <= 0) continue;
            int n15 = random.nextInt(n14);
            object = this.c.a(n3, n15, n2);
            this.u.a(k2, random, (net.minecraft.u.b.b)object);
        }
        if (random.nextInt(4) == 0 && (n2 = k2.k(this.c.a(n4 = random.nextInt(16) + 8, 0, n3 = random.nextInt(16) + 8)).k() * 2) > 0) {
            int n16 = random.nextInt(n2);
            this.t.a(k2, random, this.c.a(n4, n16, n3));
        }
        if (random.nextInt(8) == 0 && (n2 = k2.k(this.c.a(n4 = random.nextInt(16) + 8, 0, n3 = random.nextInt(16) + 8)).k() * 2) > 0) {
            int n17 = random.nextInt(n2);
            this.u.a(k2, random, this.c.a(n4, n17, n3));
        }
        for (n4 = 0; n4 < this.G; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n18 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() * 2;
            if (n18 <= 0) continue;
            int n19 = random.nextInt(n18);
            this.w.a(k2, random, this.c.a(n3, n19, n2));
        }
        for (n4 = 0; n4 < 10; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n20 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() * 2;
            if (n20 <= 0) continue;
            int n21 = random.nextInt(n20);
            this.w.a(k2, random, this.c.a(n3, n21, n2));
        }
        if (random.nextInt(32) == 0 && (n2 = k2.k(this.c.a(n4 = random.nextInt(16) + 8, 0, n3 = random.nextInt(16) + 8)).k() * 2) > 0) {
            int n22 = random.nextInt(n2);
            new o().a(k2, random, this.c.a(n4, n22, n3));
        }
        for (n4 = 0; n4 < this.H; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n23 = k2.k(this.c.a(n3, 0, n2 = random.nextInt(16) + 8)).k() * 2;
            if (n23 <= 0) continue;
            int n24 = random.nextInt(n23);
            this.x.a(k2, random, this.c.a(n3, n24, n2));
        }
        if (this.M) {
            for (n4 = 0; n4 < 50; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                int n25 = random.nextInt(248) + 8;
                if (n25 <= 0) continue;
                int n26 = random.nextInt(n25);
                object = this.c.a(n3, n26, n2);
                new ac(net.minecraft.a.p.i).a(k2, random, (net.minecraft.u.b.b)object);
            }
            for (n4 = 0; n4 < 20; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                int n27 = random.nextInt(random.nextInt(random.nextInt(240) + 8) + 8);
                b2 = this.c.a(n3, n27, n2);
                new ac(net.minecraft.a.p.k).a(k2, random, b2);
            }
        }
    }

    protected void a(k k2, Random random) {
        this.a(k2, random, this.d.J, this.h, this.d.K, this.d.L);
        this.a(k2, random, this.d.N, this.i, this.d.O, this.d.P);
        this.a(k2, random, this.d.V, this.k, this.d.W, this.d.X);
        this.a(k2, random, this.d.R, this.j, this.d.S, this.d.T);
        this.a(k2, random, this.d.Z, this.l, this.d.aa, this.d.ab);
        this.a(k2, random, this.d.ad, this.m, this.d.ae, this.d.af);
        this.a(k2, random, this.d.ah, this.n, this.d.ai, this.d.aj);
        this.a(k2, random, this.d.al, this.o, this.d.am, this.d.an);
        this.a(k2, random, this.d.ap, this.p, this.d.aq, this.d.ar);
        this.a(k2, random, this.d.at, this.q, this.d.au, this.d.av);
        this.b(k2, random, this.d.ax, this.r, this.d.ay, this.d.az);
    }

    protected void a(k k2, Random random, int n2, aj aj2, int n3, int n4) {
        int n5;
        if (n4 < n3) {
            n5 = n3;
            n3 = n4;
            n4 = n5;
        } else if (n4 == n3) {
            if (n3 < 255) {
                ++n4;
            } else {
                --n3;
            }
        }
        for (n5 = 0; n5 < n2; ++n5) {
            net.minecraft.u.b.b b2 = this.c.a(random.nextInt(16), random.nextInt(n4 - n3) + n3, random.nextInt(16));
            aj2.a(k2, random, b2);
        }
    }

    protected void b(k k2, Random random, int n2, aj aj2, int n3, int n4) {
        for (int i2 = 0; i2 < n2; ++i2) {
            net.minecraft.u.b.b b2 = this.c.a(random.nextInt(16), random.nextInt(n4) + random.nextInt(n4) + n3 - n4, random.nextInt(16));
            aj2.a(k2, random, b2);
        }
    }
}

