/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bku {
    protected boolean a;
    protected cmz b;
    protected dw c;
    protected to d = new mt(4);
    protected to e = new bm(blg.m, 7);
    protected to f = new bm(blg.n, 6);
    protected to g;
    protected to h;
    protected to i;
    protected to j;
    protected to k;
    protected to l;
    protected to m;
    protected to n;
    protected to o;
    protected to p;
    protected to q;
    protected aou r = new aou(blg.N, amt.a);
    protected to s = new axs(blg.P);
    protected to t = new axs(blg.Q);
    protected to u = new axx();
    protected to v = new cn();
    protected to w = new lv();
    protected to x = new aby();
    protected int y;
    protected int z;
    protected float A = 0.1f;
    protected int B = 2;
    protected int C = 1;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected int H = 1;
    protected int I = 3;
    protected int J = 1;
    protected int K;
    public boolean L = true;

    public void a(iu iu2, Random random, anr anr2, cmz cmz2) {
        if (this.a) {
            throw new RuntimeException("Already decorating");
        }
        this.c = bqr.a(iu2.E().z()).b();
        this.b = cmz2;
        this.g = new bld(blg.d.s(), this.c.I);
        this.h = new bld(blg.n.s(), this.c.M);
        this.i = new bld(blg.b.s().a(cec.a, (Comparable)((Object)ade.b)), this.c.Q);
        this.j = new bld(blg.b.s().a(cec.a, (Comparable)((Object)ade.d)), this.c.U);
        this.k = new bld(blg.b.s().a(cec.a, (Comparable)((Object)ade.f)), this.c.Y);
        this.l = new bld(blg.q.s(), this.c.ac);
        this.m = new bld(blg.p.s(), this.c.ag);
        this.n = new bld(blg.o.s(), this.c.ak);
        this.o = new bld(blg.aC.s(), this.c.ao);
        this.p = new bld(blg.ag.s(), this.c.as);
        this.q = new bld(blg.x.s(), this.c.aw);
        this.a(anr2, iu2, random);
        this.a = false;
    }

    protected void a(anr anr2, iu iu2, Random random) {
        Object object;
        Object object2;
        int n2;
        int n3;
        int n4;
        int n5;
        this.a(iu2, random);
        for (n5 = 0; n5 < this.I; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            this.e.a(iu2, random, iu2.p(this.b.e(n4, 0, n3)));
        }
        for (n5 = 0; n5 < this.J; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            this.d.a(iu2, random, iu2.p(this.b.e(n4, 0, n3)));
        }
        for (n5 = 0; n5 < this.H; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            this.f.a(iu2, random, iu2.p(this.b.e(n4, 0, n3)));
        }
        n5 = this.z;
        if (random.nextFloat() < this.A) {
            ++n5;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(16) + 8;
            ko ko2 = anr2.a(random);
            ko2.e();
            cmz cmz2 = iu2.k(this.b.e(n3, 0, n2));
            if (!ko2.a(iu2, random, cmz2)) continue;
            ko2.b(iu2, random, cmz2);
        }
        for (n4 = 0; n4 < this.K; ++n4) {
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(16) + 8;
            this.u.a(iu2, random, iu2.k(this.b.e(n3, 0, n2)));
        }
        for (n4 = 0; n4 < this.B; ++n4) {
            int n6;
            amh amh2;
            n3 = random.nextInt(16) + 8;
            int n7 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() + 32;
            if (n7 <= 0 || (amh2 = ((amt)(object2 = anr2.a(random, (cmz)(object = this.b.e(n3, n6 = random.nextInt(n7), n2))))).b().a()).s().a() == ahk.a) continue;
            this.r.a(amh2, (amt)object2);
            this.r.a(iu2, random, (cmz)object);
        }
        for (n4 = 0; n4 < this.C; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n8 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() * 2;
            if (n8 <= 0) continue;
            int n9 = random.nextInt(n8);
            anr2.b(random).a(iu2, random, this.b.e(n3, n9, n2));
        }
        for (n4 = 0; n4 < this.D; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n10 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() * 2;
            if (n10 <= 0) continue;
            int n11 = random.nextInt(n10);
            new axk().a(iu2, random, this.b.e(n3, n11, n2));
        }
        for (n4 = 0; n4 < this.y; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n12 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() * 2;
            if (n12 <= 0) continue;
            int n13 = random.nextInt(n12);
            object = this.b.e(n3, n13, n2);
            while (((cjx)object).b() > 0 && iu2.c((cmz)(object2 = ((cmz)object).h()))) {
                object = object2;
            }
            this.x.a(iu2, random, (cmz)object);
        }
        for (n4 = 0; n4 < this.E; ++n4) {
            int n14;
            if (random.nextInt(4) == 0) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                cmz cmz3 = iu2.k(this.b.e(n3, 0, n2));
                this.s.a(iu2, random, cmz3);
            }
            if (random.nextInt(8) != 0 || (n14 = iu2.k(this.b.e(n3 = random.nextInt(16) + 8, 0, n2 = random.nextInt(16) + 8)).b() * 2) <= 0) continue;
            int n15 = random.nextInt(n14);
            object = this.b.e(n3, n15, n2);
            this.t.a(iu2, random, (cmz)object);
        }
        if (random.nextInt(4) == 0 && (n2 = iu2.k(this.b.e(n4 = random.nextInt(16) + 8, 0, n3 = random.nextInt(16) + 8)).b() * 2) > 0) {
            int n16 = random.nextInt(n2);
            this.s.a(iu2, random, this.b.e(n4, n16, n3));
        }
        if (random.nextInt(8) == 0 && (n2 = iu2.k(this.b.e(n4 = random.nextInt(16) + 8, 0, n3 = random.nextInt(16) + 8)).b() * 2) > 0) {
            int n17 = random.nextInt(n2);
            this.t.a(iu2, random, this.b.e(n4, n17, n3));
        }
        for (n4 = 0; n4 < this.F; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n18 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() * 2;
            if (n18 <= 0) continue;
            int n19 = random.nextInt(n18);
            this.v.a(iu2, random, this.b.e(n3, n19, n2));
        }
        for (n4 = 0; n4 < 10; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n20 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() * 2;
            if (n20 <= 0) continue;
            int n21 = random.nextInt(n20);
            this.v.a(iu2, random, this.b.e(n3, n21, n2));
        }
        if (random.nextInt(32) == 0 && (n2 = iu2.k(this.b.e(n4 = random.nextInt(16) + 8, 0, n3 = random.nextInt(16) + 8)).b() * 2) > 0) {
            int n22 = random.nextInt(n2);
            new bca().a(iu2, random, this.b.e(n4, n22, n3));
        }
        for (n4 = 0; n4 < this.G; ++n4) {
            n3 = random.nextInt(16) + 8;
            int n23 = iu2.k(this.b.e(n3, 0, n2 = random.nextInt(16) + 8)).b() * 2;
            if (n23 <= 0) continue;
            int n24 = random.nextInt(n23);
            this.w.a(iu2, random, this.b.e(n3, n24, n2));
        }
        if (this.L) {
            for (n4 = 0; n4 < 50; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                int n25 = random.nextInt(248) + 8;
                if (n25 <= 0) continue;
                int n26 = random.nextInt(n25);
                object = this.b.e(n3, n26, n2);
                new che(blg.i).a(iu2, random, (cmz)object);
            }
            for (n4 = 0; n4 < 20; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                int n27 = random.nextInt(random.nextInt(random.nextInt(240) + 8) + 8);
                cmz cmz4 = this.b.e(n3, n27, n2);
                new che(blg.k).a(iu2, random, cmz4);
            }
        }
    }

    protected void a(iu iu2, Random random) {
        this.a(iu2, random, this.c.J, this.g, this.c.K, this.c.L);
        this.a(iu2, random, this.c.N, this.h, this.c.O, this.c.P);
        this.a(iu2, random, this.c.V, this.j, this.c.W, this.c.X);
        this.a(iu2, random, this.c.R, this.i, this.c.S, this.c.T);
        this.a(iu2, random, this.c.Z, this.k, this.c.aa, this.c.ab);
        this.a(iu2, random, this.c.ad, this.l, this.c.ae, this.c.af);
        this.a(iu2, random, this.c.ah, this.m, this.c.ai, this.c.aj);
        this.a(iu2, random, this.c.al, this.n, this.c.am, this.c.an);
        this.a(iu2, random, this.c.ap, this.o, this.c.aq, this.c.ar);
        this.a(iu2, random, this.c.at, this.p, this.c.au, this.c.av);
        this.b(iu2, random, this.c.ax, this.q, this.c.ay, this.c.az);
    }

    protected void a(iu iu2, Random random, int n2, to to2, int n3, int n4) {
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
            cmz cmz2 = this.b.e(random.nextInt(16), random.nextInt(n4 - n3) + n3, random.nextInt(16));
            to2.a(iu2, random, cmz2);
        }
    }

    protected void b(iu iu2, Random random, int n2, to to2, int n3, int n4) {
        for (int i2 = 0; i2 < n2; ++i2) {
            cmz cmz2 = this.b.e(random.nextInt(16), random.nextInt(n4) + random.nextInt(n4) + n3 - n4, random.nextInt(16));
            to2.a(iu2, random, cmz2);
        }
    }
}

