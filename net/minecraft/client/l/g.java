/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.a.a.d.sz;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.a.by;
import net.minecraft.client.h.b;
import net.minecraft.client.k.af;
import net.minecraft.client.k.ag;
import net.minecraft.client.k.ai;
import net.minecraft.client.k.co;
import net.minecraft.client.k.ct;
import net.minecraft.client.k.cx;
import net.minecraft.client.k.dd;
import net.minecraft.client.k.df;
import net.minecraft.client.k.dj;
import net.minecraft.client.l.d;
import net.minecraft.client.l.k;
import net.minecraft.client.m;
import net.minecraft.client.r;
import net.minecraft.f.am;
import net.minecraft.f.ap;
import net.minecraft.f.aq;
import net.minecraft.f.w;
import net.minecraft.g.cn;
import net.minecraft.h.e;
import net.minecraft.h.q;
import net.minecraft.m.cu;
import net.minecraft.q.aj;
import net.minecraft.u.ah;
import net.minecraft.u.au;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bw;
import net.minecraft.w.c.h;
import net.minecraft.w.c.i;
import net.minecraft.w.c.j;
import net.minecraft.w.c.o;
import net.minecraft.w.f.ab;
import net.minecraft.w.f.ad;
import net.minecraft.w.f.ae;
import net.minecraft.w.h.al;
import net.minecraft.x.a;
import net.minecraft.x.ak;
import net.minecraft.x.d.a.aa;
import net.minecraft.x.d.b.ac;
import net.minecraft.x.d.b.an;
import net.minecraft.x.d.b.ao;
import net.minecraft.x.d.b.ar;
import net.minecraft.x.d.b.as;
import net.minecraft.x.d.b.at;
import net.minecraft.x.d.b.av;
import net.minecraft.x.d.b.aw;
import net.minecraft.x.d.b.ax;
import net.minecraft.x.d.b.ay;
import net.minecraft.x.d.b.az;
import net.minecraft.x.d.b.ba;
import net.minecraft.x.d.b.bb;
import net.minecraft.x.d.b.bc;
import net.minecraft.x.d.b.bd;
import net.minecraft.x.d.b.be;
import net.minecraft.x.d.b.bf;
import net.minecraft.x.d.b.bg;
import net.minecraft.x.d.b.bh;
import net.minecraft.x.d.b.bi;
import net.minecraft.x.d.b.bj;
import net.minecraft.x.d.b.bk;
import net.minecraft.x.d.b.bl;
import net.minecraft.x.d.b.bm;
import net.minecraft.x.d.b.bn;
import net.minecraft.x.d.b.bo;
import net.minecraft.x.d.b.bq;
import net.minecraft.x.d.b.br;
import net.minecraft.x.d.b.bs;
import net.minecraft.x.d.b.bt;
import net.minecraft.x.d.b.bx;
import net.minecraft.x.d.b.c;
import net.minecraft.x.d.b.ca;
import net.minecraft.x.d.b.cb;
import net.minecraft.x.d.b.cc;
import net.minecraft.x.d.b.cd;
import net.minecraft.x.d.b.ce;
import net.minecraft.x.d.b.cf;
import net.minecraft.x.d.b.cg;
import net.minecraft.x.d.b.ch;
import net.minecraft.x.d.b.ci;
import net.minecraft.x.d.b.l;
import net.minecraft.x.d.b.n;
import net.minecraft.x.d.b.p;
import net.minecraft.x.d.b.s;
import net.minecraft.x.d.b.t;
import net.minecraft.x.d.b.u;
import net.minecraft.x.d.b.v;
import net.minecraft.x.d.b.x;
import net.minecraft.x.d.b.y;
import net.minecraft.x.d.b.z;
import net.minecraft.x.f;

public class g
implements net.minecraft.x.d.a {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private final ak c;
    private final com.c.a.e d;
    private final net.minecraft.client.k.cc e;
    private r f;
    private net.minecraft.client.i.d g;
    private boolean h;
    private final Map i = sz.c();
    public int a = 20;
    private boolean j;
    private final Random k = new Random();

    public g(r r2, net.minecraft.client.k.cc cc2, ak ak2, com.c.a.e e2) {
        this.f = r2;
        this.e = cc2;
        this.c = ak2;
        this.d = e2;
    }

    public void a() {
        this.g = null;
    }

    @Override
    public void a(bg bg2) {
        net.minecraft.x.f.a(bg2, this, this.f);
        this.f.d = new net.minecraft.client.i.l(this.f, this);
        this.g = new net.minecraft.client.i.d(this, new aj(0L, bg2.c(), false, bg2.b(), bg2.g()), bg2.d(), bg2.e(), this.f.D);
        this.f.w.aq = bg2.e();
        this.f.a(this.g);
        this.f.j.bS = bg2.d();
        this.f.a(new cx(this));
        this.f.j.j(bg2.a());
        this.a = bg2.f();
        this.f.j.d(bg2.h());
        this.f.d.a(bg2.c());
        this.f.w.c();
        this.c.a(new net.minecraft.x.d.a.j("MC|Brand", new a(io.netty.b.bi.a()).a(net.minecraft.client.m.a())));
    }

    @Override
    public void a(bl bl2) {
        net.minecraft.w.n[] arrn;
        net.minecraft.x.f.a(bl2, this, this.f);
        double d2 = bl2.c();
        double d3 = bl2.d();
        double d4 = bl2.e();
        net.minecraft.w.n n2 = null;
        if (bl2.k() == 10) {
            n2 = net.minecraft.w.f.f.a(this.g, d2, d3, d4, net.minecraft.w.f.m.a(bl2.l()));
        } else if (bl2.k() == 90) {
            arrn = this.g.a(bl2.l());
            if (arrn instanceof net.minecraft.w.a.b) {
                n2 = new net.minecraft.w.c.a(this.g, d2, d3, d4, (net.minecraft.w.a.b)arrn);
            }
            bl2.d(0);
        } else if (bl2.k() == 60) {
            n2 = new i(this.g, d2, d3, d4);
        } else if (bl2.k() == 91) {
            n2 = new h(this.g, d2, d3, d4);
        } else if (bl2.k() == 61) {
            n2 = new net.minecraft.w.c.r(this.g, d2, d3, d4);
        } else if (bl2.k() == 71) {
            n2 = new net.minecraft.w.f.l(this.g, new net.minecraft.u.b.b(d2, d3, d4), net.minecraft.u.ad.b(bl2.l()));
            bl2.d(0);
        } else if (bl2.k() == 77) {
            n2 = new net.minecraft.w.p(this.g, new net.minecraft.u.b.b(net.minecraft.u.b.n.c(d2), net.minecraft.u.b.n.c(d3), net.minecraft.u.b.n.c(d4)));
            bl2.d(0);
        } else if (bl2.k() == 65) {
            n2 = new net.minecraft.w.f.k(this.g, d2, d3, d4);
        } else if (bl2.k() == 72) {
            n2 = new net.minecraft.w.f.a(this.g, d2, d3, d4);
        } else if (bl2.k() == 76) {
            n2 = new net.minecraft.w.f.h(this.g, d2, d3, d4, null);
        } else if (bl2.k() == 63) {
            n2 = new net.minecraft.w.c.g(this.g, d2, d3, d4, (double)bl2.f() / 8000.0, (double)bl2.g() / 8000.0, (double)bl2.h() / 8000.0);
            bl2.d(0);
        } else if (bl2.k() == 93) {
            n2 = new o(this.g, d2, d3, d4, (double)bl2.f() / 8000.0, (double)bl2.g() / 8000.0, (double)bl2.h() / 8000.0);
            bl2.d(0);
        } else if (bl2.k() == 64) {
            n2 = new net.minecraft.w.c.d(this.g, d2, d3, d4, (double)bl2.f() / 8000.0, (double)bl2.g() / 8000.0, (double)bl2.h() / 8000.0);
            bl2.d(0);
        } else if (bl2.k() == 66) {
            n2 = new net.minecraft.w.c.b(this.g, d2, d3, d4, (double)bl2.f() / 8000.0, (double)bl2.g() / 8000.0, (double)bl2.h() / 8000.0);
            bl2.d(0);
        } else if (bl2.k() == 67) {
            n2 = new j(this.g, d2, d3, d4, (double)bl2.f() / 8000.0, (double)bl2.g() / 8000.0, (double)bl2.h() / 8000.0);
            bl2.d(0);
        } else if (bl2.k() == 62) {
            n2 = new net.minecraft.w.c.m(this.g, d2, d3, d4);
        } else if (bl2.k() == 73) {
            n2 = new net.minecraft.w.c.k(this.g, d2, d3, d4, null);
            bl2.d(0);
        } else if (bl2.k() == 75) {
            n2 = new net.minecraft.w.f.p(this.g, d2, d3, d4);
            bl2.d(0);
        } else if (bl2.k() == 1) {
            n2 = new ab(this.g, d2, d3, d4);
        } else if (bl2.k() == 50) {
            n2 = new net.minecraft.w.f.af(this.g, d2, d3, d4, null);
        } else if (bl2.k() == 78) {
            n2 = new net.minecraft.w.f.j(this.g, d2, d3, d4);
        } else if (bl2.k() == 51) {
            n2 = new ad(this.g, d2, d3, d4);
        } else if (bl2.k() == 2) {
            n2 = new ae(this.g, d2, d3, d4);
        } else if (bl2.k() == 70) {
            n2 = new net.minecraft.w.f.n(this.g, d2, d3, d4, cn.e(bl2.l() & 0xFFFF));
            bl2.d(0);
        } else if (bl2.k() == 3) {
            n2 = new net.minecraft.w.a(this.g, d2, d3, d4);
        }
        if (n2 != null) {
            net.minecraft.w.w.a(n2, d2, d3, d4);
            n2.bb = (float)(bl2.i() * 360) / 256.0f;
            n2.ba = (float)(bl2.j() * 360) / 256.0f;
            arrn = n2.cF();
            if (arrn != null) {
                int n3 = bl2.a() - n2.ca();
                net.minecraft.w.n[] arrn2 = arrn;
                int n4 = arrn.length;
                for (int i2 = 0; i2 < n4; ++i2) {
                    net.minecraft.w.n n5 = arrn2[i2];
                    n5.j(n5.ca() + n3);
                }
            }
            n2.j(bl2.a());
            n2.a(bl2.b());
            this.g.a(bl2.a(), n2);
            if (bl2.l() > 0) {
                net.minecraft.w.n n6;
                if ((bl2.k() == 60 || bl2.k() == 91) && (n6 = this.g.a(bl2.l() - 1)) instanceof net.minecraft.w.l && n2 instanceof net.minecraft.w.c.f) {
                    ((net.minecraft.w.c.f)n2).e = n6;
                }
                n2.k((double)bl2.f() / 8000.0, (double)bl2.g() / 8000.0, (double)bl2.h() / 8000.0);
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.ab ab2) {
        net.minecraft.x.f.a(ab2, this, this.f);
        double d2 = ab2.b();
        double d3 = ab2.c();
        double d4 = ab2.d();
        net.minecraft.w.f.e e2 = new net.minecraft.w.f.e(this.g, d2, d3, d4, ab2.e());
        net.minecraft.w.w.a(e2, d2, d3, d4);
        e2.ba = 0.0f;
        e2.bb = 0.0f;
        e2.j(ab2.a());
        this.g.a(ab2.a(), (net.minecraft.w.n)e2);
    }

    @Override
    public void a(bk bk2) {
        net.minecraft.x.f.a(bk2, this, this.f);
        double d2 = bk2.b();
        double d3 = bk2.c();
        double d4 = bk2.d();
        net.minecraft.w.g.a a2 = null;
        if (bk2.e() == 1) {
            a2 = new net.minecraft.w.g.a(this.g, d2, d3, d4, false);
        }
        if (a2 != null) {
            net.minecraft.w.w.a(a2, d2, d3, d4);
            a2.ba = 0.0f;
            a2.bb = 0.0f;
            a2.j(bk2.a());
            this.g.e(a2);
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.ad ad2) {
        net.minecraft.x.f.a(ad2, this, this.f);
        net.minecraft.w.f.q q2 = new net.minecraft.w.f.q(this.g, ad2.c(), ad2.d(), ad2.e());
        q2.a(ad2.b());
        this.g.a(ad2.a(), (net.minecraft.w.n)q2);
    }

    @Override
    public void a(net.minecraft.x.d.b.h h2) {
        net.minecraft.x.f.a(h2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(h2.a());
        if (n2 != null) {
            n2.k((double)h2.b() / 8000.0, (double)h2.c() / 8000.0, (double)h2.d() / 8000.0);
        }
    }

    @Override
    public void a(x x2) {
        net.minecraft.x.f.a(x2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(x2.b());
        if (n2 != null && x2.a() != null) {
            n2.cc().a(x2.a());
        }
    }

    @Override
    public void a(ar ar2) {
        net.minecraft.x.f.a(ar2, this, this.f);
        double d2 = ar2.d();
        double d3 = ar2.e();
        double d4 = ar2.f();
        float f2 = (float)(ar2.g() * 360) / 256.0f;
        float f3 = (float)(ar2.h() * 360) / 256.0f;
        b b2 = new b(this.f.h, this.a(ar2.c()).a());
        b2.aR = d2;
        b2.br = d2;
        b2.aS = d3;
        b2.bs = d3;
        b2.aT = d4;
        b2.bt = d4;
        net.minecraft.w.w.a(b2, d2, d3, d4);
        b2.a(d2, d3, d4, f2, f3);
        this.g.a(ar2.b(), (net.minecraft.w.n)b2);
        List list = ar2.a();
        if (list != null) {
            b2.cc().a(list);
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.ag ag2) {
        net.minecraft.x.f.a(ag2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(ag2.a());
        if (n2 != null) {
            double d2 = ag2.b();
            double d3 = ag2.c();
            double d4 = ag2.d();
            net.minecraft.w.w.a(n2, d2, d3, d4);
            if (!n2.de()) {
                float f2 = (float)(ag2.e() * 360) / 256.0f;
                float f3 = (float)(ag2.f() * 360) / 256.0f;
                if (Math.abs(n2.aU - d2) < 0.03125 && Math.abs(n2.aV - d3) < 0.015625 && Math.abs(n2.aW - d4) < 0.03125) {
                    n2.a(n2.aU, n2.aV, n2.aW, f2, f3, 0, true);
                } else {
                    n2.a(d2, d3, d4, f2, f3, 3, true);
                }
                n2.be = ag2.g();
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.ae ae2) {
        net.minecraft.x.f.a(ae2, this, this.f);
        if (net.minecraft.w.a.a.e(ae2.a())) {
            this.f.j.q.d = ae2.a();
        }
    }

    @Override
    public void a(bh bh2) {
        net.minecraft.x.f.a(bh2, this, this.f);
        net.minecraft.w.n n2 = bh2.a(this.g);
        if (n2 != null) {
            n2.bK += (long)bh2.a();
            n2.bL += (long)bh2.b();
            n2.bM += (long)bh2.c();
            double d2 = (double)n2.bK / 4096.0;
            double d3 = (double)n2.bL / 4096.0;
            double d4 = (double)n2.bM / 4096.0;
            if (!n2.de()) {
                float f2 = bh2.f() ? (float)(bh2.d() * 360) / 256.0f : n2.ba;
                float f3 = bh2.f() ? (float)(bh2.e() * 360) / 256.0f : n2.bb;
                n2.a(d2, d3, d4, f2, f3, 3, false);
                n2.be = bh2.g();
            }
        }
    }

    @Override
    public void a(ba ba2) {
        net.minecraft.x.f.a(ba2, this, this.f);
        net.minecraft.w.n n2 = ba2.a(this.g);
        if (n2 != null) {
            float f2 = (float)(ba2.a() * 360) / 256.0f;
            n2.k(f2);
        }
    }

    @Override
    public void a(bt bt2) {
        net.minecraft.x.f.a(bt2, this, this.f);
        for (int i2 = 0; i2 < bt2.a().length; ++i2) {
            this.g.b(bt2.a()[i2]);
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.aa aa2) {
        net.minecraft.x.f.a(aa2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        double d3 = aa2.a();
        double d4 = aa2.b();
        double d5 = aa2.c();
        float f2 = aa2.d();
        float f3 = aa2.e();
        if (aa2.g().contains((Object)net.minecraft.x.d.b.bu.a)) {
            d3 += d2.aU;
        } else {
            d2.aX = 0.0;
        }
        if (aa2.g().contains((Object)net.minecraft.x.d.b.bu.b)) {
            d4 += d2.aV;
        } else {
            d2.aY = 0.0;
        }
        if (aa2.g().contains((Object)net.minecraft.x.d.b.bu.c)) {
            d5 += d2.aW;
        } else {
            d2.aZ = 0.0;
        }
        if (aa2.g().contains((Object)net.minecraft.x.d.b.bu.e)) {
            f3 += d2.bb;
        }
        if (aa2.g().contains((Object)net.minecraft.x.d.b.bu.d)) {
            f2 += d2.ba;
        }
        d2.a(d3, d4, d5, f2, f3);
        this.c.a(new net.minecraft.x.d.a.o(aa2.f()));
        this.c.a(new net.minecraft.x.d.a.z(d2.aU, d2.cT().b, d2.aW, d2.ba, d2.bb, false));
        if (!this.h) {
            this.f.j.aR = this.f.j.aU;
            this.f.j.aS = this.f.j.aV;
            this.f.j.aT = this.f.j.aW;
            this.h = true;
            this.f.a((net.minecraft.client.k.cc)null);
        }
    }

    @Override
    public void a(bc bc2) {
        net.minecraft.x.f.a(bc2, this, this.f);
        for (at at2 : bc2.a()) {
            this.g.a(at2.a(), at2.c());
        }
    }

    @Override
    public void a(ao ao2) {
        net.minecraft.x.f.a(ao2, this, this.f);
        if (ao2.e()) {
            this.g.b(ao2.b(), ao2.c(), true);
        }
        this.g.a(ao2.b() << 4, 0, ao2.c() << 4, (ao2.b() << 4) + 15, 256, (ao2.c() << 4) + 15);
        net.minecraft.q.f.k k2 = this.g.a(ao2.b(), ao2.c());
        k2.a(ao2.a(), ao2.d(), ao2.e());
        this.g.b(ao2.b() << 4, 0, ao2.c() << 4, (ao2.b() << 4) + 15, 256, (ao2.c() << 4) + 15);
        if (!ao2.e() || !(this.g.q instanceof net.minecraft.q.a)) {
            k2.m();
        }
        for (net.minecraft.e.e e2 : ao2.f()) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(e2.h("x"), e2.h("y"), e2.h("z"));
            ap ap2 = this.g.q(b2);
            if (ap2 == null) continue;
            ap2.b(e2);
        }
    }

    @Override
    public void a(bd bd2) {
        net.minecraft.x.f.a(bd2, this, this.f);
        this.g.b(bd2.a(), bd2.b(), false);
    }

    @Override
    public void a(bx bx2) {
        net.minecraft.x.f.a(bx2, this, this.f);
        this.g.a(bx2.b(), bx2.a());
    }

    @Override
    public void a(net.minecraft.x.d.b.af af2) {
        this.c.a(af2.a());
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        this.f.a((net.minecraft.client.i.d)null);
        if (this.e != null) {
            if (this.e instanceof dd) {
                this.f.a(new net.minecraft.s.a(((dd)this.e).f(), "disconnect.lost", a2).o());
            } else {
                this.f.a(new co(this.e, "disconnect.lost", a2));
            }
        } else {
            this.f.a(new co(new ai(new net.minecraft.client.k.ci()), "disconnect.lost", a2));
        }
    }

    public void a(net.minecraft.x.p p2) {
        this.c.a(p2);
    }

    @Override
    public void a(net.minecraft.x.d.b.au au2) {
        net.minecraft.x.f.a(au2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(au2.a());
        net.minecraft.w.l l2 = (net.minecraft.w.l)this.g.a(au2.b());
        if (l2 == null) {
            l2 = this.f.j;
        }
        if (n2 != null) {
            if (n2 instanceof net.minecraft.w.f.e) {
                this.g.a(n2.aU, n2.aV, n2.aW, net.minecraft.a.f.bj, bu.h, 0.2f, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7f + 1.0f) * 2.0f, false);
            } else {
                this.g.a(n2.aU, n2.aV, n2.aW, net.minecraft.a.f.da, bu.h, 0.2f, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7f + 1.0f) * 2.0f, false);
            }
            this.f.l.a(new by((net.minecraft.q.k)this.g, n2, l2, 0.5f));
            this.g.b(au2.a());
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.b b2) {
        net.minecraft.x.f.a(b2, this, this.f);
        if (b2.c() == 2) {
            this.f.t.a(b2.a(), false);
        } else {
            this.f.t.c().a(b2.a());
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.aj aj2) {
        net.minecraft.x.f.a(aj2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(aj2.a());
        if (n2 != null) {
            if (aj2.b() == 0) {
                net.minecraft.w.l l2 = (net.minecraft.w.l)n2;
                l2.a(ah.a);
            } else if (aj2.b() == 3) {
                net.minecraft.w.l l3 = (net.minecraft.w.l)n2;
                l3.a(ah.b);
            } else if (aj2.b() == 1) {
                n2.bs();
            } else if (aj2.b() == 2) {
                net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)n2;
                b2.a(false, false, false);
            } else if (aj2.b() == 4) {
                this.f.l.a(n2, net.minecraft.u.aj.j);
            } else if (aj2.b() == 5) {
                this.f.l.a(n2, net.minecraft.u.aj.k);
            }
        }
    }

    @Override
    public void a(p p2) {
        net.minecraft.x.f.a(p2, this, this.f);
        p2.a(this.g).a(p2.a());
    }

    @Override
    public void a(net.minecraft.x.d.b.ap ap2) {
        net.minecraft.x.f.a(ap2, this, this.f);
        double d2 = ap2.e();
        double d3 = ap2.f();
        double d4 = ap2.g();
        float f2 = (float)(ap2.k() * 360) / 256.0f;
        float f3 = (float)(ap2.l() * 360) / 256.0f;
        net.minecraft.w.l l2 = (net.minecraft.w.l)net.minecraft.w.h.a(ap2.d(), (net.minecraft.q.k)this.f.h);
        net.minecraft.w.w.a(l2, d2, d3, d4);
        l2.ak = (float)(ap2.m() * 360) / 256.0f;
        l2.am = (float)(ap2.m() * 360) / 256.0f;
        net.minecraft.w.n[] arrn = l2.cF();
        if (arrn != null) {
            int n2 = ap2.b() - l2.ca();
            net.minecraft.w.n[] arrn2 = arrn;
            int n3 = arrn.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                net.minecraft.w.n n4 = arrn2[i2];
                n4.j(n4.ca() + n2);
            }
        }
        l2.j(ap2.b());
        l2.a(ap2.c());
        l2.a(d2, d3, d4, f2, f3);
        l2.aX = (float)ap2.h() / 8000.0f;
        l2.aY = (float)ap2.i() / 8000.0f;
        l2.aZ = (float)ap2.j() / 8000.0f;
        this.g.a(ap2.b(), (net.minecraft.w.n)l2);
        List list = ap2.a();
        if (list != null) {
            l2.cc().a(list);
        }
    }

    @Override
    public void a(bn bn2) {
        net.minecraft.x.f.a(bn2, this, this.f);
        this.f.h.b(bn2.a());
        this.f.h.a(bn2.b());
    }

    @Override
    public void a(s s2) {
        net.minecraft.x.f.a(s2, this, this.f);
        this.f.j.a(s2.a(), true);
        this.f.h.F().a(s2.a());
    }

    @Override
    public void a(bo bo2) {
        net.minecraft.x.f.a(bo2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(bo2.b());
        if (n2 == null) {
            b.f("Received passengers for unknown entity");
        } else {
            boolean bl2 = n2.C(this.f.j);
            n2.ct();
            for (int n3 : bo2.a()) {
                net.minecraft.w.n n4 = this.g.a(n3);
                if (n4 == null) {
                    b.f("Received unknown passenger for {}", n2);
                    continue;
                }
                n4.a(n2, true);
                if (n4 != this.f.j || bl2) continue;
                this.f.t.a(net.minecraft.client.f.u.a("mount.onboard", net.minecraft.client.b.a.a(this.f.w.X.j())), false);
            }
        }
    }

    @Override
    public void a(cc cc2) {
        net.minecraft.x.f.a(cc2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(cc2.a());
        net.minecraft.w.n n3 = this.g.a(cc2.b());
        if (n2 instanceof net.minecraft.w.f) {
            if (n3 != null) {
                ((net.minecraft.w.f)n2).b(n3, false);
            } else {
                ((net.minecraft.w.f)n2).a(false, false);
            }
        }
    }

    @Override
    public void a(aw aw2) {
        net.minecraft.x.f.a(aw2, this, this.f);
        net.minecraft.w.n n2 = aw2.a(this.g);
        if (n2 != null) {
            if (aw2.a() == 21) {
                this.f.U().a(new net.minecraft.client.c.p((net.minecraft.w.e.g)n2));
            } else {
                n2.a(aw2.a());
            }
        }
    }

    @Override
    public void a(cf cf2) {
        net.minecraft.x.f.a(cf2, this, this.f);
        this.f.j.b(cf2.a());
        this.f.j.ap().a(cf2.b());
        this.f.j.ap().b(cf2.c());
    }

    @Override
    public void a(net.minecraft.x.d.b.k k2) {
        net.minecraft.x.f.a(k2, this, this.f);
        this.f.j.a(k2.a(), k2.b(), k2.c());
    }

    @Override
    public void a(net.minecraft.x.d.b.f f2) {
        net.minecraft.x.f.a(f2, this, this.f);
        if (f2.a() != this.f.j.bS) {
            this.h = false;
            net.minecraft.j.r r2 = this.g.Q();
            this.g = new net.minecraft.client.i.d(this, new aj(0L, f2.c(), false, this.f.h.F().s(), f2.d()), f2.a(), f2.b(), this.f.D);
            this.g.a(r2);
            this.f.a(this.g);
            this.f.j.bS = f2.a();
            this.f.a(new cx(this));
        }
        this.f.a(f2.a());
        this.f.d.a(f2.c());
    }

    @Override
    public void a(l l2) {
        net.minecraft.x.f.a(l2, this, this.f);
        net.minecraft.q.t t2 = new net.minecraft.q.t(this.f.h, null, l2.d(), l2.e(), l2.f(), l2.g(), l2.h());
        t2.a(true);
        this.f.j.aX += (double)l2.a();
        this.f.j.aY += (double)l2.b();
        this.f.j.aZ += (double)l2.c();
    }

    @Override
    public void a(net.minecraft.x.d.b.al al2) {
        net.minecraft.x.f.a(al2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        if ("minecraft:container".equals(al2.b())) {
            d2.a(new e(al2.c(), al2.d()));
            d2.s.f = al2.a();
        } else if ("minecraft:villager".equals(al2.b())) {
            d2.a(new net.minecraft.w.b(d2, al2.c()));
            d2.s.f = al2.a();
        } else if ("EntityHorse".equals(al2.b())) {
            net.minecraft.w.n n2 = this.g.a(al2.e());
            if (n2 instanceof al) {
                d2.a((al)n2, new q(al2.c(), al2.d()));
                d2.s.f = al2.a();
            }
        } else if (!al2.f()) {
            d2.a(new net.minecraft.client.d.a.b(al2.b(), al2.c()));
            d2.s.f = al2.a();
        } else {
            net.minecraft.client.d.a.a a2 = new net.minecraft.client.d.a.a(al2.b(), al2.c(), al2.d());
            d2.a(a2);
            d2.s.f = al2.a();
        }
    }

    @Override
    public void a(bb bb2) {
        net.minecraft.x.f.a(bb2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        if (bb2.a() == -1) {
            d2.q.e(bb2.c());
        } else if (bb2.a() == -2) {
            d2.q.a(bb2.b(), bb2.c());
        } else {
            Object object;
            boolean bl2 = false;
            if (this.f.o instanceof net.minecraft.client.k.b.k) {
                object = (net.minecraft.client.k.b.k)this.f.o;
                boolean bl3 = bl2 = ((net.minecraft.client.k.b.k)object).f() != net.minecraft.v.d.m.b();
            }
            if (bb2.a() == 0 && bb2.b() >= 36 && bb2.b() < 45) {
                object = d2.r.b(bb2.b()).b();
                if (bb2.c() != null && (object == null || ((cu)object).b < bb2.c().b)) {
                    bb2.c().c = 5;
                }
                d2.r.a(bb2.b(), bb2.c());
            } else if (!(bb2.a() != d2.s.f || bb2.a() == 0 && bl2)) {
                d2.s.a(bb2.b(), bb2.c());
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.aq aq2) {
        net.minecraft.x.f.a(aq2, this, this.f);
        net.minecraft.h.aq aq3 = null;
        net.minecraft.client.h.d d2 = this.f.j;
        if (aq2.a() == 0) {
            aq3 = d2.r;
        } else if (aq2.a() == d2.s.f) {
            aq3 = d2.s;
        }
        if (aq3 != null && !aq2.c()) {
            this.a(new net.minecraft.x.d.a.t(aq2.a(), aq2.b(), true));
        }
    }

    @Override
    public void a(cb cb2) {
        net.minecraft.x.f.a(cb2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        if (cb2.a() == 0) {
            d2.r.a(cb2.b());
        } else if (cb2.a() == d2.s.f) {
            d2.s.a(cb2.b());
        }
    }

    @Override
    public void a(ac ac2) {
        net.minecraft.x.f.a(ac2, this, this.f);
        ap ap2 = this.g.q(ac2.a());
        if (!(ap2 instanceof net.minecraft.f.ad)) {
            ap2 = new net.minecraft.f.ad();
            ap2.b(this.g);
            ap2.c(ac2.a());
        }
        this.f.j.a((net.minecraft.f.ad)ap2);
    }

    @Override
    public void a(net.minecraft.x.d.b.j j2) {
        net.minecraft.x.f.a(j2, this, this.f);
        if (this.f.h.d(j2.a())) {
            boolean bl2;
            ap ap2 = this.f.h.q(j2.a());
            int n2 = j2.b();
            boolean bl3 = bl2 = n2 == 2 && ap2 instanceof net.minecraft.f.h;
            if (n2 == 1 && ap2 instanceof net.minecraft.f.y || bl2 || n2 == 3 && ap2 instanceof aq || n2 == 4 && ap2 instanceof net.minecraft.f.f || n2 == 5 && ap2 instanceof net.minecraft.f.g || n2 == 6 && ap2 instanceof w || n2 == 7 && ap2 instanceof net.minecraft.f.ab || n2 == 8 && ap2 instanceof am || n2 == 9 && ap2 instanceof net.minecraft.f.ad) {
                ap2.b(j2.c());
            }
            if (bl2 && this.f.o instanceof ag) {
                ((ag)this.f.o).f();
            }
        }
    }

    @Override
    public void a(an an2) {
        net.minecraft.x.f.a(an2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        if (d2.s != null && d2.s.f == an2.a()) {
            d2.s.a(an2.b(), an2.c());
        }
    }

    @Override
    public void a(n n2) {
        net.minecraft.x.f.a(n2, this, this.f);
        net.minecraft.w.n n3 = this.g.a(n2.b());
        if (n3 != null) {
            n3.a(n2.c(), n2.a());
        }
    }

    @Override
    public void a(ax ax2) {
        net.minecraft.x.f.a(ax2, this, this.f);
        this.f.j.s();
    }

    @Override
    public void a(bf bf2) {
        net.minecraft.x.f.a(bf2, this, this.f);
        this.f.h.c(bf2.a(), bf2.d(), bf2.b(), bf2.c());
    }

    @Override
    public void a(ca ca2) {
        net.minecraft.x.f.a(ca2, this, this.f);
        this.f.h.c(ca2.a(), ca2.b(), ca2.c());
    }

    @Override
    public void a(ce ce2) {
        net.minecraft.x.f.a(ce2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        int n2 = ce2.a();
        float f2 = ce2.b();
        int n3 = net.minecraft.u.b.n.d(f2 + 0.5f);
        if (n2 >= 0 && n2 < ce.a.length && ce.a[n2] != null) {
            ((net.minecraft.w.a.b)d2).b(new net.minecraft.u.d.l(ce.a[n2], new Object[0]));
        }
        if (n2 == 1) {
            this.g.F().b(true);
            this.g.k(0.0f);
        } else if (n2 == 2) {
            this.g.F().b(false);
            this.g.k(1.0f);
        } else if (n2 == 3) {
            this.f.d.a(net.minecraft.q.am.a(n3));
        } else if (n2 == 4) {
            if (n3 == 0) {
                this.f.j.d.a(new net.minecraft.x.d.a.x(net.minecraft.x.d.a.ah.a));
                this.f.a(new cx(this));
            } else if (n3 == 1) {
                this.f.a(new net.minecraft.client.k.x());
            }
        } else if (n2 == 5) {
            net.minecraft.client.b.a a2 = this.f.w;
            if (f2 == 0.0f) {
                this.f.a(new df());
            } else if (f2 == 101.0f) {
                this.f.t.c().a(new net.minecraft.u.d.l("demo.help.movement", net.minecraft.client.b.a.a(a2.S.j()), net.minecraft.client.b.a.a(a2.T.j()), net.minecraft.client.b.a.a(a2.U.j()), net.minecraft.client.b.a.a(a2.V.j())));
            } else if (f2 == 102.0f) {
                this.f.t.c().a(new net.minecraft.u.d.l("demo.help.jump", net.minecraft.client.b.a.a(a2.W.j())));
            } else if (f2 == 103.0f) {
                this.f.t.c().a(new net.minecraft.u.d.l("demo.help.inventory", net.minecraft.client.b.a.a(a2.Z.j())));
            }
        } else if (n2 == 6) {
            this.g.a(d2, d2.aU, d2.aV + (double)d2.ce_(), d2.aW, net.minecraft.a.f.u, bu.h, 0.18f, 0.45f);
        } else if (n2 == 7) {
            this.g.k(f2);
        } else if (n2 == 8) {
            this.g.i(f2);
        } else if (n2 == 10) {
            this.g.a(net.minecraft.u.aj.P, d2.aU, d2.aV, d2.aW, 0.0, 0.0, 0.0, new int[0]);
            this.g.a(d2, d2.aU, d2.aV, d2.aW, net.minecraft.a.f.aF, bu.f, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.a a2) {
        net.minecraft.x.f.a(a2, this, this.f);
        net.minecraft.q.a.y y2 = net.minecraft.m.bf.a(a2.a(), this.f.h);
        a2.a(y2);
        this.f.q.i().a(y2);
    }

    @Override
    public void a(br br2) {
        net.minecraft.x.f.a(br2, this, this.f);
        if (br2.a()) {
            this.f.h.a(br2.b(), br2.d(), br2.c());
        } else {
            this.f.h.b(br2.b(), br2.d(), br2.c());
        }
    }

    @Override
    public void a(be be2) {
        net.minecraft.x.f.a(be2, this, this.f);
        boolean bl2 = false;
        for (Map.Entry entry : be2.a().entrySet()) {
            net.minecraft.r.k k2 = (net.minecraft.r.k)entry.getKey();
            int n2 = (Integer)entry.getValue();
            if (k2.d() && n2 > 0) {
                if (this.j && this.f.j.y().a(k2) == 0) {
                    net.minecraft.r.d d2 = (net.minecraft.r.d)k2;
                    this.f.s.a(d2);
                    if (k2 == net.minecraft.r.j.f) {
                        this.f.w.J = false;
                        this.f.w.b();
                    }
                }
                bl2 = true;
            }
            this.f.j.y().a(this.f.j, k2, n2);
        }
        if (!this.j && !bl2 && this.f.w.J) {
            this.f.s.b(net.minecraft.r.j.f);
        }
        this.j = true;
        if (this.f.o instanceof net.minecraft.client.k.u) {
            ((net.minecraft.client.k.u)((Object)this.f.o)).d();
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.bw bw2) {
        net.minecraft.d.c c2;
        net.minecraft.x.f.a(bw2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(bw2.b());
        if (n2 instanceof net.minecraft.w.l && (c2 = net.minecraft.d.c.a(bw2.c())) != null) {
            net.minecraft.d.j j2 = new net.minecraft.d.j(c2, bw2.e(), bw2.d(), bw2.g(), bw2.f());
            j2.a(bw2.a());
            ((net.minecraft.w.l)n2).c(j2);
        }
    }

    @Override
    public void a(y y2) {
        net.minecraft.w.n n2;
        net.minecraft.x.f.a(y2, this, this.f);
        if (y2.a == cg.c && (n2 = this.g.a(y2.b)) == this.f.j) {
            this.f.a(new af(y2.e));
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.d d2) {
        net.minecraft.x.f.a(d2, this, this.f);
        this.f.h.F().a(d2.b());
        this.f.h.F().g(d2.a());
    }

    @Override
    public void a(bi bi2) {
        net.minecraft.x.f.a(bi2, this, this.f);
        net.minecraft.w.n n2 = bi2.a(this.g);
        if (n2 != null) {
            this.f.a(n2);
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.q q2) {
        net.minecraft.x.f.a(q2, this, this.f);
        q2.a(this.g.V());
    }

    @Override
    public void a(net.minecraft.x.d.b.ai ai2) {
        net.minecraft.x.f.a(ai2, this, this.f);
        net.minecraft.x.d.b.r r2 = ai2.a();
        String string = null;
        String string2 = null;
        String string3 = ai2.b() != null ? ai2.b().d() : "";
        switch (r2) {
            case a: {
                string = string3;
                break;
            }
            case b: {
                string2 = string3;
                break;
            }
            case e: {
                this.f.t.a("", "", -1, -1, -1);
                this.f.t.a();
                return;
            }
        }
        this.f.t.a(string, string2, ai2.c(), ai2.d(), ai2.e());
    }

    @Override
    public void a(ay ay2) {
        this.f.t.g().b(ay2.a().d().isEmpty() ? null : ay2.a());
        this.f.t.g().a(ay2.b().d().isEmpty() ? null : ay2.b());
    }

    @Override
    public void a(bs bs2) {
        net.minecraft.x.f.a(bs2, this, this.f);
        net.minecraft.w.n n2 = bs2.a(this.g);
        if (n2 instanceof net.minecraft.w.l) {
            ((net.minecraft.w.l)n2).a(bs2.a());
        }
    }

    @Override
    public void a(bm bm2) {
        net.minecraft.x.f.a(bm2, this, this.f);
        for (bj bj2 : bm2.a()) {
            if (bm2.b() == az.e) {
                this.i.remove(bj2.a().a());
                continue;
            }
            net.minecraft.client.l.r r2 = (net.minecraft.client.l.r)this.i.get(bj2.a().a());
            if (bm2.b() == az.a) {
                r2 = new net.minecraft.client.l.r(bj2);
                this.i.put(r2.a().a(), r2);
            }
            if (r2 == null) continue;
            switch (bm2.b()) {
                case a: {
                    r2.a(bj2.c());
                    r2.a(bj2.b());
                    break;
                }
                case b: {
                    r2.a(bj2.c());
                    break;
                }
                case c: {
                    r2.a(bj2.b());
                    break;
                }
                case d: {
                    r2.a(bj2.d());
                }
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.ah ah2) {
        this.a(new aa(ah2.a()));
    }

    @Override
    public void a(ci ci2) {
        net.minecraft.x.f.a(ci2, this, this.f);
        net.minecraft.client.h.d d2 = this.f.j;
        d2.J.b = ci2.b();
        d2.J.d = ci2.d();
        d2.J.a = ci2.a();
        d2.J.c = ci2.c();
        d2.J.a(ci2.e());
        d2.J.b(ci2.f());
    }

    @Override
    public void a(net.minecraft.x.d.b.am am2) {
        net.minecraft.x.f.a(am2, this, this.f);
        String[] arrstring = am2.a();
        if (this.f.o instanceof au) {
            ((au)((Object)this.f.o)).a(arrstring);
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.e e2) {
        net.minecraft.x.f.a(e2, this, this.f);
        this.f.h.a(this.f.j, e2.c(), e2.d(), e2.e(), e2.a(), e2.b(), e2.f(), e2.g());
    }

    @Override
    public void a(net.minecraft.x.d.b.o o2) {
        net.minecraft.x.f.a(o2, this, this.f);
        this.f.U().a(new net.minecraft.client.c.e(new bp(o2.a()), o2.b(), o2.f(), o2.g(), false, 0, net.minecraft.client.c.x.b, (float)o2.c(), (float)o2.d(), (float)o2.e()));
    }

    @Override
    public void a(z z2) {
        String string = z2.a();
        String string2 = z2.b();
        if (this.b(string)) {
            if (string.startsWith("level://")) {
                File file = new File(this.f.y, "saves");
                String string3 = string.substring("level://".length());
                File file2 = new File(file, string3);
                if (file2.isFile()) {
                    this.c.a(new net.minecraft.x.d.a.e(net.minecraft.x.d.a.u.d));
                    com.a.a.n.a.ci.a(this.f.P().a(file2), this.g());
                } else {
                    this.c.a(new net.minecraft.x.d.a.e(net.minecraft.x.d.a.u.c));
                }
            } else {
                net.minecraft.client.i.a a2 = this.f.C();
                if (a2 != null && a2.b() == net.minecraft.client.i.f.a) {
                    this.c.a(new net.minecraft.x.d.a.e(net.minecraft.x.d.a.u.d));
                    com.a.a.n.a.ci.a(this.f.P().a(string, string2), this.g());
                } else if (a2 != null && a2.b() != net.minecraft.client.i.f.c) {
                    this.c.a(new net.minecraft.x.d.a.e(net.minecraft.x.d.a.u.b));
                } else {
                    this.f.a(new k(this, string, string2));
                }
            }
        }
    }

    private boolean b(String string) {
        block4: {
            try {
                URI uRI = new URI(string.replace(' ', '+'));
                String string2 = uRI.getScheme();
                boolean bl2 = "level".equals(string2);
                if (!("http".equals(string2) || "https".equals(string2) || bl2)) {
                    throw new URISyntaxException(string, "Wrong protocol");
                }
                if (bl2 && (string.contains("..") || !string.endsWith("/resources.zip"))) break block4;
                return true;
            }
            catch (URISyntaxException uRISyntaxException) {
                this.c.a(new net.minecraft.x.d.a.e(net.minecraft.x.d.a.u.c));
                return false;
            }
        }
        throw new URISyntaxException(string, "Invalid levelstorage resourcepack path");
    }

    private com.a.a.n.a.cg g() {
        return new d(this);
    }

    @Override
    public void a(net.minecraft.x.d.b.ak ak2) {
        net.minecraft.x.f.a(ak2, this, this.f);
        this.f.t.i().a(ak2);
    }

    @Override
    public void a(u u2) {
        net.minecraft.x.f.a(u2, this, this.f);
        if (u2.b() == 0) {
            this.f.j.aL().b(u2.a());
        } else {
            this.f.j.aL().a(u2.a(), u2.b());
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.m m2) {
        net.minecraft.x.f.a(m2, this, this.f);
        net.minecraft.w.n n2 = this.f.j.dd();
        if (n2 != this.f.j && n2.de()) {
            n2.a(m2.a(), m2.b(), m2.c(), m2.d(), m2.e());
            this.c.a(new net.minecraft.x.d.a.d(n2));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(as as2) {
        net.minecraft.x.f.a(as2, this, this.f);
        if ("MC|TrList".equals(as2.a())) {
            a a2 = as2.b();
            try {
                try {
                    int n2 = a2.K();
                    net.minecraft.client.k.cc cc2 = this.f.o;
                    if (cc2 == null || !(cc2 instanceof ct) || n2 != this.f.j.s.f) return;
                    net.minecraft.w.aj aj2 = ((ct)cc2).f();
                    net.minecraft.b.d d2 = net.minecraft.b.d.b(a2);
                    aj2.a(d2);
                    return;
                }
                catch (IOException iOException) {
                    b.b("Couldn't load trade info", (Throwable)iOException);
                    a2.ad();
                }
                return;
            }
            finally {
                a2.ad();
            }
        } else if ("MC|Brand".equals(as2.a())) {
            this.f.j.c(as2.b().e(32767));
            return;
        } else if ("MC|BOpen".equals(as2.a())) {
            cu cu2;
            ah ah2 = (ah)as2.b().a(ah.class);
            cu cu3 = cu2 = ah2 == ah.b ? this.f.j.bD() : this.f.j.bC();
            if (cu2 == null || cu2.a() != net.minecraft.a.w.bX) return;
            this.f.a(new dj(this.f.j, cu2, false));
            return;
        } else if ("MC|DebugPath".equals(as2.a())) {
            a a3 = as2.b();
            int n3 = a3.K();
            float f2 = a3.O();
            net.minecraft.i.i i2 = net.minecraft.i.i.a(a3);
            ((net.minecraft.client.g.f.d)this.f.r.a).a(n3, i2, f2);
            return;
        } else {
            if (!"MC|StopSound".equals(as2.a())) return;
            a a4 = as2.b();
            String string = a4.e(32767);
            String string2 = a4.e(256);
            this.f.U().a(string2, bu.a(string));
        }
    }

    @Override
    public void a(bq bq2) {
        net.minecraft.x.f.a(bq2, this, this.f);
        net.minecraft.j.r r2 = this.g.Q();
        if (bq2.c() == 0) {
            net.minecraft.j.j j2 = r2.a(bq2.a(), net.minecraft.j.f.b);
            j2.a(bq2.b());
            j2.a(bq2.d());
        } else {
            net.minecraft.j.j j3 = r2.b(bq2.a());
            if (bq2.c() == 1) {
                r2.j(j3);
            } else if (bq2.c() == 2) {
                j3.a(bq2.b());
                j3.a(bq2.d());
            }
        }
    }

    @Override
    public void a(v v2) {
        net.minecraft.x.f.a(v2, this, this.f);
        net.minecraft.j.r r2 = this.g.Q();
        net.minecraft.j.j j2 = r2.b(v2.b());
        if (v2.d() == net.minecraft.x.d.b.c.a) {
            net.minecraft.j.p p2 = r2.c(v2.a(), j2);
            p2.c(v2.c());
        } else if (v2.d() == net.minecraft.x.d.b.c.b) {
            if (bw.b(v2.b())) {
                r2.d(v2.a(), null);
            } else if (j2 != null) {
                r2.d(v2.a(), j2);
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.b.i i2) {
        net.minecraft.x.f.a(i2, this, this.f);
        net.minecraft.j.r r2 = this.g.Q();
        if (i2.b().isEmpty()) {
            r2.a(i2.a(), null);
        } else {
            net.minecraft.j.j j2 = r2.b(i2.b());
            r2.a(i2.a(), j2);
        }
    }

    @Override
    public void a(cd cd2) {
        net.minecraft.x.f.a(cd2, this, this.f);
        net.minecraft.j.r r2 = this.g.Q();
        net.minecraft.j.d d2 = cd2.f() == 0 ? r2.e(cd2.a()) : r2.d(cd2.a());
        if (cd2.f() == 0 || cd2.f() == 2) {
            Object object;
            d2.a(cd2.b());
            d2.b(cd2.c());
            d2.c(cd2.d());
            d2.a(net.minecraft.u.d.o.a(cd2.h()));
            d2.a(cd2.g());
            Object object2 = net.minecraft.j.n.a(cd2.i());
            if (object2 != null) {
                d2.a((net.minecraft.j.n)((Object)object2));
            }
            if ((object = net.minecraft.j.b.a(cd2.j())) != null) {
                d2.a((net.minecraft.j.b)((Object)object));
            }
        }
        if (cd2.f() == 0 || cd2.f() == 3) {
            for (Object object2 : cd2.e()) {
                r2.a((String)object2, cd2.a());
            }
        }
        if (cd2.f() == 4) {
            for (Object object2 : cd2.e()) {
                r2.a((String)object2, d2);
            }
        }
        if (cd2.f() == 1) {
            r2.d(d2);
        }
    }

    @Override
    public void a(av av2) {
        net.minecraft.x.f.a(av2, this, this.f);
        if (av2.j() == 0) {
            double d2 = av2.i() * av2.f();
            double d3 = av2.i() * av2.g();
            double d4 = av2.i() * av2.h();
            try {
                this.g.a(av2.a(), av2.b(), av2.c(), av2.d(), av2.e(), d2, d3, d4, av2.k());
            }
            catch (Throwable throwable) {
                b.f("Could not spawn particle effect {}", new Object[]{av2.a()});
            }
        } else {
            for (int i2 = 0; i2 < av2.j(); ++i2) {
                double d5 = this.k.nextGaussian() * (double)av2.f();
                double d6 = this.k.nextGaussian() * (double)av2.g();
                double d7 = this.k.nextGaussian() * (double)av2.h();
                double d8 = this.k.nextGaussian() * (double)av2.i();
                double d9 = this.k.nextGaussian() * (double)av2.i();
                double d10 = this.k.nextGaussian() * (double)av2.i();
                try {
                    this.g.a(av2.a(), av2.b(), av2.c() + d5, av2.d() + d6, av2.e() + d7, d8, d9, d10, av2.k());
                    continue;
                }
                catch (Throwable throwable) {
                    b.f("Could not spawn particle effect {}", new Object[]{av2.a()});
                    return;
                }
            }
        }
    }

    @Override
    public void a(ch ch2) {
        net.minecraft.x.f.a(ch2, this, this.f);
        net.minecraft.w.n n2 = this.g.a(ch2.a());
        if (n2 != null) {
            if (!(n2 instanceof net.minecraft.w.l)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + n2 + ")");
            }
            net.minecraft.w.b.a.b b2 = ((net.minecraft.w.l)n2).bA();
            for (t t2 : ch2.b()) {
                net.minecraft.w.b.a.i i2 = b2.a(t2.a());
                if (i2 == null) {
                    i2 = b2.b(new net.minecraft.w.b.a.c(null, t2.a(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                }
                i2.a(t2.b());
                i2.e();
                for (net.minecraft.w.b.a.h h2 : t2.c()) {
                    i2.b(h2);
                }
            }
        }
    }

    public ak b() {
        return this.c;
    }

    public Collection c() {
        return this.i.values();
    }

    public net.minecraft.client.l.r a(UUID uUID) {
        return (net.minecraft.client.l.r)this.i.get(uUID);
    }

    public net.minecraft.client.l.r a(String string) {
        for (net.minecraft.client.l.r r2 : this.i.values()) {
            if (!r2.a().b().equals(string)) continue;
            return r2;
        }
        return null;
    }

    public com.c.a.e d() {
        return this.d;
    }

    static /* synthetic */ r a(g g2) {
        return g2.f;
    }

    static /* synthetic */ void a(g g2, r r2) {
        g2.f = r2;
    }

    static /* synthetic */ ak b(g g2) {
        return g2.c;
    }

    static /* synthetic */ com.a.a.n.a.cg c(g g2) {
        return g2.g();
    }
}

