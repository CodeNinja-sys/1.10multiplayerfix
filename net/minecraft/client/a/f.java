/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.yk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import net.minecraft.client.a.ab;
import net.minecraft.client.a.ac;
import net.minecraft.client.a.ad;
import net.minecraft.client.a.ae;
import net.minecraft.client.a.af;
import net.minecraft.client.a.ag;
import net.minecraft.client.a.ah;
import net.minecraft.client.a.aj;
import net.minecraft.client.a.ak;
import net.minecraft.client.a.ap;
import net.minecraft.client.a.as;
import net.minecraft.client.a.at;
import net.minecraft.client.a.ay;
import net.minecraft.client.a.ba;
import net.minecraft.client.a.bb;
import net.minecraft.client.a.be;
import net.minecraft.client.a.bh;
import net.minecraft.client.a.bj;
import net.minecraft.client.a.bn;
import net.minecraft.client.a.bq;
import net.minecraft.client.a.bs;
import net.minecraft.client.a.bt;
import net.minecraft.client.a.bu;
import net.minecraft.client.a.bv;
import net.minecraft.client.a.bx;
import net.minecraft.client.a.c;
import net.minecraft.client.a.ca;
import net.minecraft.client.a.cb;
import net.minecraft.client.a.cd;
import net.minecraft.client.a.cf;
import net.minecraft.client.a.cg;
import net.minecraft.client.a.ch;
import net.minecraft.client.a.ci;
import net.minecraft.client.a.cj;
import net.minecraft.client.a.ck;
import net.minecraft.client.a.cl;
import net.minecraft.client.a.cm;
import net.minecraft.client.a.cn;
import net.minecraft.client.a.co;
import net.minecraft.client.a.d;
import net.minecraft.client.a.h;
import net.minecraft.client.a.i;
import net.minecraft.client.a.j;
import net.minecraft.client.a.k;
import net.minecraft.client.a.l;
import net.minecraft.client.a.n;
import net.minecraft.client.a.p;
import net.minecraft.client.a.r;
import net.minecraft.client.a.t;
import net.minecraft.client.a.v;
import net.minecraft.client.a.w;
import net.minecraft.client.a.x;
import net.minecraft.client.a.y;
import net.minecraft.client.g.ao;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.g;
import net.minecraft.g.c.b;
import net.minecraft.k.a;
import net.minecraft.u.bo;
import net.minecraft.u.bp;

public class f {
    private static final bp b = new bp("textures/particle/particles.png");
    protected net.minecraft.q.k a;
    private final ArrayDeque[][] c = new ArrayDeque[4][];
    private final Queue d = yk.a();
    private final net.minecraft.client.g.a.c e;
    private final Random f = new Random();
    private final Map g = sz.c();
    private final Queue h = yk.a();

    public f(net.minecraft.q.k k2, net.minecraft.client.g.a.c c2) {
        this.a = k2;
        this.e = c2;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.c[i2] = new ArrayDeque[2];
            for (int i3 = 0; i3 < 2; ++i3) {
                this.c[i2][i3] = yk.a();
            }
        }
        this.c();
    }

    private void c() {
        this.a(net.minecraft.u.aj.a.c(), new ba());
        this.a(net.minecraft.u.aj.e.c(), new cl());
        this.a(net.minecraft.u.aj.f.c(), new cg());
        this.a(net.minecraft.u.aj.g.c(), new ap());
        this.a(net.minecraft.u.aj.N.c(), new af());
        this.a(net.minecraft.u.aj.h.c(), new r());
        this.a(net.minecraft.u.aj.i.c(), new h());
        this.a(net.minecraft.u.aj.j.c(), new bx());
        this.a(net.minecraft.u.aj.k.c(), new ah());
        this.a(net.minecraft.u.aj.l.c(), new ak());
        this.a(net.minecraft.u.aj.m.c(), new ci());
        this.a(net.minecraft.u.aj.n.c(), new ck());
        this.a(net.minecraft.u.aj.o.c(), new x());
        this.a(net.minecraft.u.aj.p.c(), new c());
        this.a(net.minecraft.u.aj.q.c(), new y());
        this.a(net.minecraft.u.aj.r.c(), new k());
        this.a(net.minecraft.u.aj.s.c(), new ch());
        this.a(net.minecraft.u.aj.t.c(), new cd());
        this.a(net.minecraft.u.aj.u.c(), new bn());
        this.a(net.minecraft.u.aj.v.c(), new cm());
        this.a(net.minecraft.u.aj.w.c(), new h());
        this.a(net.minecraft.u.aj.x.c(), new ad());
        this.a(net.minecraft.u.aj.y.c(), new at());
        this.a(net.minecraft.u.aj.z.c(), new be());
        this.a(net.minecraft.u.aj.A.c(), new co());
        this.a(net.minecraft.u.aj.B.c(), new ab());
        this.a(net.minecraft.u.aj.C.c(), new bq());
        this.a(net.minecraft.u.aj.D.c(), new w());
        this.a(net.minecraft.u.aj.E.c(), new t());
        this.a(net.minecraft.u.aj.U.c(), new aj());
        this.a(net.minecraft.u.aj.F.c(), new ay());
        this.a(net.minecraft.u.aj.G.c(), new bh());
        this.a(net.minecraft.u.aj.H.c(), new bb());
        this.a(net.minecraft.u.aj.I.c(), new ac());
        this.a(net.minecraft.u.aj.J.c(), new bj());
        this.a(net.minecraft.u.aj.K.c(), new as());
        this.a(net.minecraft.u.aj.L.c(), new bv());
        this.a(net.minecraft.u.aj.M.c(), new cj());
        this.a(net.minecraft.u.aj.c.c(), new i());
        this.a(net.minecraft.u.aj.b.c(), new ag());
        this.a(net.minecraft.u.aj.d.c(), new n());
        this.a(net.minecraft.u.aj.P.c(), new ae());
        this.a(net.minecraft.u.aj.Q.c(), new bt());
        this.a(net.minecraft.u.aj.R.c(), new cn());
        this.a(net.minecraft.u.aj.S.c(), new p());
        this.a(net.minecraft.u.aj.T.c(), new v());
    }

    public void a(int n2, cf cf2) {
        this.g.put(n2, cf2);
    }

    public void a(net.minecraft.w.n n2, net.minecraft.u.aj aj2) {
        this.d.add(new ca(this.a, n2, aj2));
    }

    public cb a(int n2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        cb cb2;
        cf cf2 = (cf)this.g.get(n2);
        if (cf2 != null && (cb2 = cf2.a(n2, this.a, d2, d3, d4, d5, d6, d7, arrn)) != null) {
            this.a(cb2);
            return cb2;
        }
        return null;
    }

    public void a(cb cb2) {
        this.h.add(cb2);
    }

    public void a() {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(i2);
        }
        if (!this.d.isEmpty()) {
            ArrayList arrayList = ov.a();
            for (ca ca2 : this.d) {
                ca2.b();
                if (ca2.j()) continue;
                arrayList.add(ca2);
            }
            this.d.removeAll(arrayList);
        }
        if (!this.h.isEmpty()) {
            cb cb2 = (cb)this.h.poll();
            while (cb2 != null) {
                int n2;
                int n3 = cb2.a();
                int n4 = n2 = cb2.bX_() ? 0 : 1;
                if (this.c[n3][n2].size() >= 16384) {
                    this.c[n3][n2].removeFirst();
                }
                this.c[n3][n2].add(cb2);
                cb2 = (cb)this.h.poll();
            }
        }
    }

    private void a(int n2) {
        this.a.A.a(String.valueOf(n2));
        for (int i2 = 0; i2 < 2; ++i2) {
            this.a.A.a(String.valueOf(i2));
            this.a(this.c[n2][i2]);
            this.a.A.b();
        }
        this.a.A.b();
    }

    private void a(Queue queue) {
        if (!queue.isEmpty()) {
            Iterator iterator = queue.iterator();
            while (iterator.hasNext()) {
                cb cb2 = (cb)iterator.next();
                this.b(cb2);
                if (cb2.j()) continue;
                iterator.remove();
            }
        }
    }

    private void b(cb cb2) {
        try {
            cb2.b();
        }
        catch (Throwable throwable) {
            a a2 = net.minecraft.k.a.a(throwable, "Ticking Particle");
            net.minecraft.k.i i2 = a2.a("Particle being ticked");
            int n2 = cb2.a();
            i2.a("Particle", new bu(this, cb2));
            i2.a("Particle Type", new d(this, n2));
            throw new bo(a2);
        }
    }

    public void a(net.minecraft.w.n n2, float f2) {
        float f3 = ao.b();
        float f4 = ao.d();
        float f5 = ao.e();
        float f6 = ao.f();
        float f7 = ao.c();
        cb.H = n2.br + (n2.aU - n2.br) * (double)f2;
        cb.I = n2.bs + (n2.aV - n2.bs) * (double)f2;
        cb.J = n2.bt + (n2.aW - n2.bt) * (double)f2;
        cb.K = n2.i(f2);
        bd.l();
        bd.a(net.minecraft.client.g.ad.l, bc.j);
        bd.a(516, 0.003921569f);
        for (int i2 = 0; i2 < 3; ++i2) {
            int n3 = i2;
            for (int i3 = 0; i3 < 2; ++i3) {
                if (this.c[n3][i3].isEmpty()) continue;
                switch (i3) {
                    case 0: {
                        bd.a(false);
                        break;
                    }
                    case 1: {
                        bd.a(true);
                    }
                }
                switch (n3) {
                    default: {
                        this.e.a(b);
                        break;
                    }
                    case 1: {
                        this.e.a(net.minecraft.client.g.a.f.b);
                    }
                }
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
                g g2 = ci2.c();
                g2.a(7, net.minecraft.client.g.d.b.d);
                for (cb cb2 : this.c[n3][i3]) {
                    try {
                        cb2.a(g2, n2, f2, f3, f7, f4, f5, f6);
                    }
                    catch (Throwable throwable) {
                        a a2 = net.minecraft.k.a.a(throwable, "Rendering Particle");
                        net.minecraft.k.i i4 = a2.a("Particle being rendered");
                        i4.a("Particle", new l(this, cb2));
                        i4.a("Particle Type", new bs(this, n3));
                        throw new bo(a2);
                    }
                }
                ci2.b();
            }
        }
        bd.a(true);
        bd.k();
        bd.a(516, 0.1f);
    }

    public void b(net.minecraft.w.n n2, float f2) {
        float f3 = (float)Math.PI / 180;
        float f4 = net.minecraft.u.b.n.b(n2.ba * ((float)Math.PI / 180));
        float f5 = net.minecraft.u.b.n.a(n2.ba * ((float)Math.PI / 180));
        float f6 = -f5 * net.minecraft.u.b.n.a(n2.bb * ((float)Math.PI / 180));
        float f7 = f4 * net.minecraft.u.b.n.a(n2.bb * ((float)Math.PI / 180));
        float f8 = net.minecraft.u.b.n.b(n2.bb * ((float)Math.PI / 180));
        for (int i2 = 0; i2 < 2; ++i2) {
            ArrayDeque arrayDeque = this.c[3][i2];
            if (arrayDeque.isEmpty()) continue;
            net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
            g g2 = ci2.c();
            for (cb cb2 : arrayDeque) {
                cb2.a(g2, n2, f2, f4, f8, f5, f6, f7);
            }
        }
    }

    public void a(net.minecraft.q.k k2) {
        this.a = k2;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                this.c[i2][i3].clear();
            }
        }
        this.d.clear();
    }

    public void a(net.minecraft.u.b.b b2, b b3) {
        if (b3.d() != net.minecraft.g.a.h.a) {
            b3 = b3.b((net.minecraft.q.n)this.a, b2);
            int n2 = 4;
            for (int i2 = 0; i2 < 4; ++i2) {
                for (int i3 = 0; i3 < 4; ++i3) {
                    for (int i4 = 0; i4 < 4; ++i4) {
                        double d2 = (double)b2.cy_() + ((double)i2 + 0.5) / 4.0;
                        double d3 = (double)b2.k() + ((double)i3 + 0.5) / 4.0;
                        double d4 = (double)b2.l() + ((double)i4 + 0.5) / 4.0;
                        this.a(new j(this.a, d2, d3, d4, d2 - (double)b2.cy_() - 0.5, d3 - (double)b2.k() - 0.5, d4 - (double)b2.l() - 0.5, b3).a(b2));
                    }
                }
            }
        }
    }

    public void a(net.minecraft.u.b.b b2, net.minecraft.u.ad ad2) {
        b b3 = this.a.n(b2);
        if (b3.l() != net.minecraft.u.ac.a) {
            int n2 = b2.cy_();
            int n3 = b2.k();
            int n4 = b2.l();
            float f2 = 0.1f;
            net.minecraft.u.b.a a2 = b3.c((net.minecraft.q.n)this.a, b2);
            double d2 = (double)n2 + this.f.nextDouble() * (a2.d - a2.a - (double)0.2f) + (double)0.1f + a2.a;
            double d3 = (double)n3 + this.f.nextDouble() * (a2.e - a2.b - (double)0.2f) + (double)0.1f + a2.b;
            double d4 = (double)n4 + this.f.nextDouble() * (a2.f - a2.c - (double)0.2f) + (double)0.1f + a2.c;
            if (ad2 == net.minecraft.u.ad.a) {
                d3 = (double)n3 + a2.b - (double)0.1f;
            }
            if (ad2 == net.minecraft.u.ad.b) {
                d3 = (double)n3 + a2.e + (double)0.1f;
            }
            if (ad2 == net.minecraft.u.ad.c) {
                d4 = (double)n4 + a2.c - (double)0.1f;
            }
            if (ad2 == net.minecraft.u.ad.d) {
                d4 = (double)n4 + a2.f + (double)0.1f;
            }
            if (ad2 == net.minecraft.u.ad.e) {
                d2 = (double)n2 + a2.a - (double)0.1f;
            }
            if (ad2 == net.minecraft.u.ad.f) {
                d2 = (double)n2 + a2.d + (double)0.1f;
            }
            this.a(new j(this.a, d2, d3, d4, 0.0, 0.0, 0.0, b3).a(b2).b(0.2f).c(0.6f));
        }
    }

    public String b() {
        int n2 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                n2 += this.c[i2][i3].size();
            }
        }
        return "" + n2;
    }
}

