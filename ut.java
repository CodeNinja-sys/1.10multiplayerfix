/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsScreen
 */
import com.a.a.n.a.cg;
import com.a.a.n.a.ci;
import com.c.a.e;
import io.netty.b.bi;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.m;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.s.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ut
implements bfz {
    private static final d b = org.apache.logging.log4j.c.c();
    private final sz c;
    private final e d;
    private final cjn e;
    private bxy f;
    private ym g;
    private boolean h;
    private final Map i = com.a.a.d.sz.c();
    public int a = 20;
    private boolean j;
    private final Random k = new Random();

    public ut(bxy bxy2, cjn cjn2, sz sz2, e e2) {
        this.f = bxy2;
        this.e = cjn2;
        this.c = sz2;
        this.d = e2;
    }

    public void a() {
        this.g = null;
    }

    @Override
    public void a(kt kt2) {
        ceb.a(kt2, this, this.f);
        this.f.c = new pz(this.f, this);
        this.g = new ym(this, new atd(0L, kt2.c(), false, kt2.b(), kt2.g()), kt2.d(), kt2.e(), this.f.B);
        this.f.u.aq = kt2.e();
        this.f.a(this.g);
        this.f.h.bS = kt2.d();
        this.f.a(new csn(this));
        this.f.h.l(kt2.a());
        this.a = kt2.f();
        this.f.h.e(kt2.h());
        this.f.c.a(kt2.c());
        this.f.u.c();
        this.c.a(new pm("MC|Brand", new si(bi.a()).a(m.a())));
    }

    @Override
    public void a(azj azj2) {
        cpk[] arrcpk;
        ceb.a(azj2, this, this.f);
        double d2 = azj2.c();
        double d3 = azj2.d();
        double d4 = azj2.e();
        cpk cpk2 = null;
        if (azj2.k() == 10) {
            cpk2 = cef.a(this.g, d2, d3, d4, cta.a(azj2.l()));
        } else if (azj2.k() == 90) {
            arrcpk = this.g.a(azj2.l());
            if (arrcpk instanceof bdl) {
                cpk2 = new cvo(this.g, d2, d3, d4, (bdl)arrcpk);
            }
            azj2.d(0);
        } else if (azj2.k() == 60) {
            cpk2 = new bib(this.g, d2, d3, d4);
        } else if (azj2.k() == 91) {
            cpk2 = new bno(this.g, d2, d3, d4);
        } else if (azj2.k() == 61) {
            cpk2 = new bef(this.g, d2, d3, d4);
        } else if (azj2.k() == 71) {
            cpk2 = new cvr(this.g, new cmz(d2, d3, d4), bqk.b(azj2.l()));
            azj2.d(0);
        } else if (azj2.k() == 77) {
            cpk2 = new ahe(this.g, new cmz(cmk.c(d2), cmk.c(d3), cmk.c(d4)));
            azj2.d(0);
        } else if (azj2.k() == 65) {
            cpk2 = new ddg(this.g, d2, d3, d4);
        } else if (azj2.k() == 72) {
            cpk2 = new cnd(this.g, d2, d3, d4);
        } else if (azj2.k() == 76) {
            cpk2 = new p(this.g, d2, d3, d4, null);
        } else if (azj2.k() == 63) {
            cpk2 = new cyk(this.g, d2, d3, d4, (double)azj2.f() / 8000.0, (double)azj2.g() / 8000.0, (double)azj2.h() / 8000.0);
            azj2.d(0);
        } else if (azj2.k() == 93) {
            cpk2 = new ckd(this.g, d2, d3, d4, (double)azj2.f() / 8000.0, (double)azj2.g() / 8000.0, (double)azj2.h() / 8000.0);
            azj2.d(0);
        } else if (azj2.k() == 64) {
            cpk2 = new bx(this.g, d2, d3, d4, (double)azj2.f() / 8000.0, (double)azj2.g() / 8000.0, (double)azj2.h() / 8000.0);
            azj2.d(0);
        } else if (azj2.k() == 66) {
            cpk2 = new nm(this.g, d2, d3, d4, (double)azj2.f() / 8000.0, (double)azj2.g() / 8000.0, (double)azj2.h() / 8000.0);
            azj2.d(0);
        } else if (azj2.k() == 67) {
            cpk2 = new dcg(this.g, d2, d3, d4, (double)azj2.f() / 8000.0, (double)azj2.g() / 8000.0, (double)azj2.h() / 8000.0);
            azj2.d(0);
        } else if (azj2.k() == 62) {
            cpk2 = new xe(this.g, d2, d3, d4);
        } else if (azj2.k() == 73) {
            cpk2 = new tp(this.g, d2, d3, d4, null);
            azj2.d(0);
        } else if (azj2.k() == 75) {
            cpk2 = new bgc(this.g, d2, d3, d4);
            azj2.d(0);
        } else if (azj2.k() == 1) {
            cpk2 = new cor(this.g, d2, d3, d4);
        } else if (azj2.k() == 50) {
            cpk2 = new cgg(this.g, d2, d3, d4, null);
        } else if (azj2.k() == 78) {
            cpk2 = new bdi(this.g, d2, d3, d4);
        } else if (azj2.k() == 51) {
            cpk2 = new abi(this.g, d2, d3, d4);
        } else if (azj2.k() == 2) {
            cpk2 = new er(this.g, d2, d3, d4);
        } else if (azj2.k() == 70) {
            cpk2 = new azb(this.g, d2, d3, d4, bfa.g(azj2.l() & 0xFFFF));
            azj2.d(0);
        } else if (azj2.k() == 3) {
            cpk2 = new gw(this.g, d2, d3, d4);
        }
        if (cpk2 != null) {
            tt.a(cpk2, d2, d3, d4);
            cpk2.bb = (float)(azj2.i() * 360) / 256.0f;
            cpk2.ba = (float)(azj2.j() * 360) / 256.0f;
            arrcpk = cpk2.at_();
            if (arrcpk != null) {
                int n2 = azj2.a() - cpk2.bW();
                for (cpk cpk3 : arrcpk) {
                    cpk3.l(cpk3.bW() + n2);
                }
            }
            cpk2.l(azj2.a());
            cpk2.b(azj2.b());
            this.g.a(azj2.a(), cpk2);
            if (azj2.l() > 0) {
                cpk cpk4;
                if ((azj2.k() == 60 || azj2.k() == 91) && (cpk4 = this.g.a(azj2.l() - 1)) instanceof bga && cpk2 instanceof cwt) {
                    ((cwt)cpk2).e = cpk4;
                }
                cpk2.a((double)azj2.f() / 8000.0, (double)azj2.g() / 8000.0, (double)azj2.h() / 8000.0);
            }
        }
    }

    @Override
    public void a(bbv bbv2) {
        ceb.a(bbv2, this, this.f);
        double d2 = bbv2.b();
        double d3 = bbv2.c();
        double d4 = bbv2.d();
        cvs cvs2 = new cvs(this.g, d2, d3, d4, bbv2.e());
        tt.a(cvs2, d2, d3, d4);
        cvs2.ba = 0.0f;
        cvs2.bb = 0.0f;
        cvs2.l(bbv2.a());
        this.g.a(bbv2.a(), (cpk)cvs2);
    }

    @Override
    public void a(cus cus2) {
        ceb.a(cus2, this, this.f);
        double d2 = cus2.b();
        double d3 = cus2.c();
        double d4 = cus2.d();
        tz tz2 = null;
        if (cus2.e() == 1) {
            tz2 = new tz(this.g, d2, d3, d4, false);
        }
        if (tz2 != null) {
            tt.a(tz2, d2, d3, d4);
            tz2.ba = 0.0f;
            tz2.bb = 0.0f;
            tz2.l(cus2.a());
            this.g.a(tz2);
        }
    }

    @Override
    public void a(bz bz2) {
        ceb.a(bz2, this, this.f);
        cbk cbk2 = new cbk(this.g, bz2.c(), bz2.d(), bz2.e());
        cbk2.b(bz2.b());
        this.g.a(bz2.a(), (cpk)cbk2);
    }

    @Override
    public void a(gi gi2) {
        ceb.a(gi2, this, this.f);
        cpk cpk2 = this.g.a(gi2.a());
        if (cpk2 == null) {
            return;
        }
        cpk2.a((double)gi2.b() / 8000.0, (double)gi2.c() / 8000.0, (double)gi2.d() / 8000.0);
    }

    @Override
    public void a(qx qx2) {
        ceb.a(qx2, this, this.f);
        cpk cpk2 = this.g.a(qx2.b());
        if (cpk2 != null && qx2.a() != null) {
            cpk2.bY().a(qx2.a());
        }
    }

    @Override
    public void a(hb hb2) {
        ceb.a(hb2, this, this.f);
        double d2 = hb2.d();
        double d3 = hb2.e();
        double d4 = hb2.f();
        float f2 = (float)(hb2.g() * 360) / 256.0f;
        float f3 = (float)(hb2.h() * 360) / 256.0f;
        vn vn2 = new vn(this.f.f, this.a(hb2.c()).a());
        vn2.aR = d2;
        vn2.br = d2;
        vn2.aS = d3;
        vn2.bs = d3;
        vn2.aT = d4;
        vn2.bt = d4;
        tt.a(vn2, d2, d3, d4);
        vn2.b(d2, d3, d4, f2, f3);
        this.g.a(hb2.b(), (cpk)vn2);
        List list = hb2.a();
        if (list != null) {
            vn2.bY().a(list);
        }
    }

    @Override
    public void a(bqt bqt2) {
        ceb.a(bqt2, this, this.f);
        cpk cpk2 = this.g.a(bqt2.a());
        if (cpk2 == null) {
            return;
        }
        double d2 = bqt2.b();
        double d3 = bqt2.c();
        double d4 = bqt2.d();
        tt.a(cpk2, d2, d3, d4);
        if (!cpk2.cK()) {
            float f2 = (float)(bqt2.e() * 360) / 256.0f;
            float f3 = (float)(bqt2.f() * 360) / 256.0f;
            if (Math.abs(cpk2.aU - d2) >= 0.03125 || Math.abs(cpk2.aV - d3) >= 0.015625 || Math.abs(cpk2.aW - d4) >= 0.03125) {
                cpk2.a(d2, d3, d4, f2, f3, 3, true);
            } else {
                cpk2.a(cpk2.aU, cpk2.aV, cpk2.aW, f2, f3, 0, true);
            }
            cpk2.be = bqt2.g();
        }
    }

    @Override
    public void a(bud bud2) {
        ceb.a(bud2, this, this.f);
        if (cps.e(bud2.a())) {
            this.f.h.n.d = bud2.a();
        }
    }

    @Override
    public void a(bla bla2) {
        ceb.a(bla2, this, this.f);
        cpk cpk2 = bla2.a(this.g);
        if (cpk2 == null) {
            return;
        }
        cpk2.bK += (long)bla2.a();
        cpk2.bL += (long)bla2.b();
        cpk2.bM += (long)bla2.c();
        double d2 = (double)cpk2.bK / 4096.0;
        double d3 = (double)cpk2.bL / 4096.0;
        double d4 = (double)cpk2.bM / 4096.0;
        if (!cpk2.cK()) {
            float f2 = bla2.f() ? (float)(bla2.d() * 360) / 256.0f : cpk2.ba;
            float f3 = bla2.f() ? (float)(bla2.e() * 360) / 256.0f : cpk2.bb;
            cpk2.a(d2, d3, d4, f2, f3, 3, false);
            cpk2.be = bla2.g();
        }
    }

    @Override
    public void a(bmq bmq2) {
        ceb.a(bmq2, this, this.f);
        cpk cpk2 = bmq2.a(this.g);
        if (cpk2 == null) {
            return;
        }
        float f2 = (float)(bmq2.a() * 360) / 256.0f;
        cpk2.n(f2);
    }

    @Override
    public void a(cej cej2) {
        ceb.a(cej2, this, this.f);
        for (int i2 = 0; i2 < cej2.a().length; ++i2) {
            this.g.e(cej2.a()[i2]);
        }
    }

    @Override
    public void a(aqf aqf2) {
        ceb.a(aqf2, this, this.f);
        ob ob2 = this.f.h;
        double d2 = aqf2.a();
        double d3 = aqf2.b();
        double d4 = aqf2.c();
        float f2 = aqf2.d();
        float f3 = aqf2.e();
        if (aqf2.g().contains((Object)bgf.a)) {
            d2 += ob2.aU;
        } else {
            ob2.aX = 0.0;
        }
        if (aqf2.g().contains((Object)bgf.b)) {
            d3 += ob2.aV;
        } else {
            ob2.aY = 0.0;
        }
        if (aqf2.g().contains((Object)bgf.c)) {
            d4 += ob2.aW;
        } else {
            ob2.aZ = 0.0;
        }
        if (aqf2.g().contains((Object)bgf.e)) {
            f3 += ob2.bb;
        }
        if (aqf2.g().contains((Object)bgf.d)) {
            f2 += ob2.ba;
        }
        ob2.b(d2, d3, d4, f2, f3);
        this.c.a(new ctd(aqf2.f()));
        this.c.a(new bzg(ob2.aU, ob2.cD().b, ob2.aW, ob2.ba, ob2.bb, false));
        if (!this.h) {
            this.f.h.aR = this.f.h.aU;
            this.f.h.aS = this.f.h.aV;
            this.f.h.aT = this.f.h.aW;
            this.h = true;
            this.f.a((cjn)null);
        }
    }

    @Override
    public void a(czi czi2) {
        ceb.a(czi2, this, this.f);
        for (cz cz2 : czi2.a()) {
            this.g.b(cz2.a(), cz2.c());
        }
    }

    @Override
    public void a(bvb bvb2) {
        ceb.a(bvb2, this, this.f);
        if (bvb2.e()) {
            this.g.b(bvb2.b(), bvb2.c(), true);
        }
        this.g.b(bvb2.b() << 4, 0, bvb2.c() << 4, (bvb2.b() << 4) + 15, 256, (bvb2.c() << 4) + 15);
        bhm bhm2 = this.g.a(bvb2.b(), bvb2.c());
        bhm2.a(bvb2.a(), bvb2.d(), bvb2.e());
        this.g.a(bvb2.b() << 4, 0, bvb2.c() << 4, (bvb2.b() << 4) + 15, 256, (bvb2.c() << 4) + 15);
        if (!bvb2.e() || !(this.g.q instanceof ho)) {
            bhm2.m();
        }
        for (bvp bvp2 : bvb2.f()) {
            cmz cmz2 = new cmz(bvp2.h("x"), bvp2.h("y"), bvp2.h("z"));
            bql bql2 = this.g.q(cmz2);
            if (bql2 == null) continue;
            bql2.a(bvp2);
        }
    }

    @Override
    public void a(ua ua2) {
        ceb.a(ua2, this, this.f);
        this.g.b(ua2.a(), ua2.b(), false);
    }

    @Override
    public void a(cjj cjj2) {
        ceb.a(cjj2, this, this.f);
        this.g.b(cjj2.b(), cjj2.a());
    }

    @Override
    public void a(bkm bkm2) {
        this.c.a(bkm2.a());
    }

    @Override
    public void a(cbg cbg2) {
        this.f.a((ym)null);
        if (this.e != null) {
            if (this.e instanceof bdr) {
                this.f.a((cjn)((Object)new a((RealmsScreen)((bdr)this.e).f(), "disconnect.lost", (ey)((Object)cbg2)).getProxy()));
            } else {
                this.f.a(new chp(this.e, "disconnect.lost", cbg2));
            }
        } else {
            this.f.a(new chp(new cuz(new agj()), "disconnect.lost", cbg2));
        }
    }

    public void a(ds ds2) {
        this.c.a(ds2);
    }

    @Override
    public void a(and and2) {
        ceb.a(and2, this, this.f);
        cpk cpk2 = this.g.a(and2.a());
        bga bga2 = (bga)this.g.a(and2.b());
        if (bga2 == null) {
            bga2 = this.f.h;
        }
        if (cpk2 != null) {
            if (cpk2 instanceof cvs) {
                this.g.a(cpk2.aU, cpk2.aV, cpk2.aW, dah.bj, csg.h, 0.2f, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7f + 1.0f) * 2.0f, false);
            } else {
                this.g.a(cpk2.aU, cpk2.aV, cpk2.aW, dah.da, csg.h, 0.2f, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7f + 1.0f) * 2.0f, false);
            }
            this.f.j.a(new cxe((iu)this.g, cpk2, bga2, 0.5f));
            this.g.e(and2.a());
        }
    }

    @Override
    public void a(cxg cxg2) {
        ceb.a(cxg2, this, this.f);
        if (cxg2.c() == 2) {
            this.f.r.a(cxg2.a(), false);
        } else {
            this.f.r.c().a(cxg2.a());
        }
    }

    @Override
    public void a(atk atk2) {
        ceb.a(atk2, this, this.f);
        cpk cpk2 = this.g.a(atk2.a());
        if (cpk2 == null) {
            return;
        }
        if (atk2.b() == 0) {
            bga bga2 = (bga)cpk2;
            bga2.a(bqp.a);
        } else if (atk2.b() == 3) {
            bga bga3 = (bga)cpk2;
            bga3.a(bqp.b);
        } else if (atk2.b() == 1) {
            cpk2.bk();
        } else if (atk2.b() == 2) {
            bdl bdl2 = (bdl)cpk2;
            bdl2.a(false, false, false);
        } else if (atk2.b() == 4) {
            this.f.j.a(cpk2, lz.j);
        } else if (atk2.b() == 5) {
            this.f.j.a(cpk2, lz.k);
        }
    }

    @Override
    public void a(bjj bjj2) {
        ceb.a(bjj2, this, this.f);
        bjj2.a(this.g).a(bjj2.a());
    }

    @Override
    public void a(bvv bvv2) {
        ceb.a(bvv2, this, this.f);
        double d2 = bvv2.e();
        double d3 = bvv2.f();
        double d4 = bvv2.g();
        float f2 = (float)(bvv2.k() * 360) / 256.0f;
        float f3 = (float)(bvv2.l() * 360) / 256.0f;
        bga bga2 = (bga)vb.a(bvv2.d(), (iu)this.f.f);
        tt.a(bga2, d2, d3, d4);
        bga2.ah = (float)(bvv2.m() * 360) / 256.0f;
        bga2.aj = (float)(bvv2.m() * 360) / 256.0f;
        cpk[] arrcpk = bga2.at_();
        if (arrcpk != null) {
            int n2 = bvv2.b() - bga2.bW();
            for (cpk cpk2 : arrcpk) {
                cpk2.l(cpk2.bW() + n2);
            }
        }
        bga2.l(bvv2.b());
        bga2.b(bvv2.c());
        bga2.b(d2, d3, d4, f2, f3);
        bga2.aX = (float)bvv2.h() / 8000.0f;
        bga2.aY = (float)bvv2.i() / 8000.0f;
        bga2.aZ = (float)bvv2.j() / 8000.0f;
        this.g.a(bvv2.b(), (cpk)bga2);
        List list = bvv2.a();
        if (list != null) {
            bga2.bY().a(list);
        }
    }

    @Override
    public void a(rt rt2) {
        ceb.a(rt2, this, this.f);
        this.f.f.a(rt2.a());
        this.f.f.b(rt2.b());
    }

    @Override
    public void a(bxi bxi2) {
        ceb.a(bxi2, this, this.f);
        this.f.h.a(bxi2.a(), true);
        this.f.f.E().a(bxi2.a());
    }

    @Override
    public void a(pg pg2) {
        ceb.a(pg2, this, this.f);
        cpk cpk2 = this.g.a(pg2.b());
        if (cpk2 == null) {
            b.f("Received passengers for unknown entity");
            return;
        }
        boolean bl2 = cpk2.t(this.f.h);
        cpk2.cl();
        for (int n2 : pg2.a()) {
            cpk cpk3 = this.g.a(n2);
            if (cpk3 == null) {
                b.f("Received unknown passenger for {}", cpk2);
                continue;
            }
            cpk3.a(cpk2, true);
            if (cpk3 != this.f.h || bl2) continue;
            this.f.r.a(bf.a("mount.onboard", cmx.a(this.f.u.X.j())), false);
        }
    }

    @Override
    public void a(bsc bsc2) {
        ceb.a(bsc2, this, this.f);
        cpk cpk2 = this.g.a(bsc2.a());
        cpk cpk3 = this.g.a(bsc2.b());
        if (cpk2 instanceof xy) {
            if (cpk3 != null) {
                ((xy)cpk2).b(cpk3, false);
            } else {
                ((xy)cpk2).a(false, false);
            }
        }
    }

    @Override
    public void a(buk buk2) {
        ceb.a(buk2, this, this.f);
        cpk cpk2 = buk2.a(this.g);
        if (cpk2 != null) {
            if (buk2.a() == 21) {
                this.f.W().a(new cve((bym)cpk2));
            } else {
                cpk2.a(buk2.a());
            }
        }
    }

    @Override
    public void a(sk sk2) {
        ceb.a(sk2, this, this.f);
        this.f.h.d(sk2.a());
        this.f.h.aE().a(sk2.b());
        this.f.h.aE().b(sk2.c());
    }

    @Override
    public void a(baq baq2) {
        ceb.a(baq2, this, this.f);
        this.f.h.a(baq2.a(), baq2.b(), baq2.c());
    }

    @Override
    public void a(bzd bzd2) {
        ceb.a(bzd2, this, this.f);
        if (bzd2.a() != this.f.h.bS) {
            this.h = false;
            bzt bzt2 = this.g.P();
            this.g = new ym(this, new atd(0L, bzd2.c(), false, this.f.f.E().r(), bzd2.d()), bzd2.a(), bzd2.b(), this.f.B);
            this.g.a(bzt2);
            this.f.a(this.g);
            this.f.h.bS = bzd2.a();
            this.f.a(new csn(this));
        }
        this.f.a(bzd2.a());
        this.f.c.a(bzd2.c());
    }

    @Override
    public void a(caa caa2) {
        ceb.a(caa2, this, this.f);
        yk yk2 = new yk(this.f.f, null, caa2.d(), caa2.e(), caa2.f(), caa2.g(), caa2.h());
        yk2.a(true);
        this.f.h.aX += (double)caa2.a();
        this.f.h.aY += (double)caa2.b();
        this.f.h.aZ += (double)caa2.c();
    }

    @Override
    public void a(ckj ckj2) {
        ceb.a(ckj2, this, this.f);
        ob ob2 = this.f.h;
        if ("minecraft:container".equals(ckj2.b())) {
            ob2.a(new al(ckj2.c(), ckj2.d()));
            ob2.p.h = ckj2.a();
        } else if ("minecraft:villager".equals(ckj2.b())) {
            ob2.a(new alg(ob2, ckj2.c()));
            ob2.p.h = ckj2.a();
        } else if ("EntityHorse".equals(ckj2.b())) {
            cpk cpk2 = this.g.a(ckj2.e());
            if (cpk2 instanceof it) {
                ob2.a((it)cpk2, new aq(ckj2.c(), ckj2.d()));
                ob2.p.h = ckj2.a();
            }
        } else if (!ckj2.f()) {
            ob2.a(new cxq(ckj2.b(), ckj2.c()));
            ob2.p.h = ckj2.a();
        } else {
            czn czn2 = new czn(ckj2.b(), ckj2.c(), ckj2.d());
            ob2.a(czn2);
            ob2.p.h = ckj2.a();
        }
    }

    @Override
    public void a(bxu bxu2) {
        ceb.a(bxu2, this, this.f);
        ob ob2 = this.f.h;
        if (bxu2.a() == -1) {
            ob2.n.e(bxu2.c());
        } else if (bxu2.a() == -2) {
            ob2.n.a(bxu2.b(), bxu2.c());
        } else {
            Object object;
            boolean bl2 = false;
            if (this.f.m instanceof ans) {
                object = (ans)this.f.m;
                boolean bl3 = bl2 = ((ans)object).f() != zm.m.b();
            }
            if (bxu2.a() == 0 && bxu2.b() >= 36 && bxu2.b() < 45) {
                object = ob2.o.a(bxu2.b()).a();
                if (bxu2.c() != null && (object == null || ((bhl)object).b < bxu2.c().b)) {
                    bxu2.c().c = 5;
                }
                ob2.o.a(bxu2.b(), bxu2.c());
            } else if (!(bxu2.a() != ob2.p.h || bxu2.a() == 0 && bl2)) {
                ob2.p.a(bxu2.b(), bxu2.c());
            }
        }
    }

    @Override
    public void a(jh jh2) {
        ceb.a(jh2, this, this.f);
        apq apq2 = null;
        ob ob2 = this.f.h;
        if (jh2.a() == 0) {
            apq2 = ob2.o;
        } else if (jh2.a() == ob2.p.h) {
            apq2 = ob2.p;
        }
        if (apq2 != null && !jh2.c()) {
            this.a(new asa(jh2.a(), jh2.b(), true));
        }
    }

    @Override
    public void a(cvw cvw2) {
        ceb.a(cvw2, this, this.f);
        ob ob2 = this.f.h;
        if (cvw2.a() == 0) {
            ob2.o.a(cvw2.b());
        } else if (cvw2.a() == ob2.p.h) {
            ob2.p.a(cvw2.b());
        }
    }

    @Override
    public void a(azq azq2) {
        ceb.a(azq2, this, this.f);
        bql bql2 = this.g.q(azq2.a());
        if (!(bql2 instanceof bxr)) {
            bql2 = new bxr();
            bql2.a(this.g);
            bql2.c(azq2.a());
        }
        this.f.h.a((bxr)bql2);
    }

    @Override
    public void a(hv hv2) {
        ceb.a(hv2, this, this.f);
        if (this.f.f.d(hv2.a())) {
            boolean bl2;
            bql bql2 = this.f.f.q(hv2.a());
            int n2 = hv2.b();
            boolean bl3 = bl2 = n2 == 2 && bql2 instanceof jf;
            if (n2 == 1 && bql2 instanceof ze || bl2 || n2 == 3 && bql2 instanceof agq || n2 == 4 && bql2 instanceof tr || n2 == 5 && bql2 instanceof cbj || n2 == 6 && bql2 instanceof cwd || n2 == 7 && bql2 instanceof i || n2 == 8 && bql2 instanceof bii || n2 == 9 && bql2 instanceof bxr) {
                bql2.a(hv2.c());
            }
            if (bl2 && this.f.m instanceof ddf) {
                ((ddf)this.f.m).f();
            }
        }
    }

    @Override
    public void a(aqo aqo2) {
        ceb.a(aqo2, this, this.f);
        ob ob2 = this.f.h;
        if (ob2.p != null && ob2.p.h == aqo2.a()) {
            ob2.p.a(aqo2.b(), aqo2.c());
        }
    }

    @Override
    public void a(aey aey2) {
        ceb.a(aey2, this, this.f);
        cpk cpk2 = this.g.a(aey2.b());
        if (cpk2 != null) {
            cpk2.a(aey2.c(), aey2.a());
        }
    }

    @Override
    public void a(vj vj2) {
        ceb.a(vj2, this, this.f);
        this.f.h.u();
    }

    @Override
    public void a(ahm ahm2) {
        ceb.a(ahm2, this, this.f);
        this.f.f.c(ahm2.a(), ahm2.d(), ahm2.b(), ahm2.c());
    }

    @Override
    public void a(aaw aaw2) {
        ceb.a(aaw2, this, this.f);
        this.f.f.c(aaw2.a(), aaw2.b(), aaw2.c());
    }

    @Override
    public void a(avk avk2) {
        ceb.a(avk2, this, this.f);
        ob ob2 = this.f.h;
        int n2 = avk2.a();
        float f2 = avk2.b();
        int n3 = cmk.d(f2 + 0.5f);
        if (n2 >= 0 && n2 < avk.a.length && avk.a[n2] != null) {
            ((bdl)ob2).b(new du(avk.a[n2], new Object[0]));
        }
        if (n2 == 1) {
            this.g.E().b(true);
            this.g.k(0.0f);
        } else if (n2 == 2) {
            this.g.E().b(false);
            this.g.k(1.0f);
        } else if (n2 == 3) {
            this.f.c.a(bvh.a(n3));
        } else if (n2 == 4) {
            if (n3 == 0) {
                this.f.h.a.a(new daq(cpl.a));
                this.f.a(new csn(this));
            } else if (n3 == 1) {
                this.f.a(new czf());
            }
        } else if (n2 == 5) {
            cmx cmx2 = this.f.u;
            if (f2 == 0.0f) {
                this.f.a(new cky());
            } else if (f2 == 101.0f) {
                this.f.r.c().a(new du("demo.help.movement", cmx.a(cmx2.S.j()), cmx.a(cmx2.T.j()), cmx.a(cmx2.U.j()), cmx.a(cmx2.V.j())));
            } else if (f2 == 102.0f) {
                this.f.r.c().a(new du("demo.help.jump", cmx.a(cmx2.W.j())));
            } else if (f2 == 103.0f) {
                this.f.r.c().a(new du("demo.help.inventory", cmx.a(cmx2.Z.j())));
            }
        } else if (n2 == 6) {
            this.g.a(ob2, ob2.aU, ob2.aV + (double)ob2.A(), ob2.aW, dah.u, csg.h, 0.18f, 0.45f);
        } else if (n2 == 7) {
            this.g.k(f2);
        } else if (n2 == 8) {
            this.g.i(f2);
        } else if (n2 == 10) {
            this.g.a(lz.P, ob2.aU, ob2.aV, ob2.aW, 0.0, 0.0, 0.0, new int[0]);
            this.g.a(ob2, ob2.aU, ob2.aV, ob2.aW, dah.aF, csg.f, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(aew aew2) {
        ceb.a(aew2, this, this.f);
        aph aph2 = ayb.a(aew2.a(), this.f.f);
        aew2.a(aph2);
        this.f.o.i().a(aph2);
    }

    @Override
    public void a(aqp aqp2) {
        ceb.a(aqp2, this, this.f);
        if (aqp2.a()) {
            this.f.f.a(aqp2.b(), aqp2.d(), aqp2.c());
        } else {
            this.f.f.b(aqp2.b(), aqp2.d(), aqp2.c());
        }
    }

    @Override
    public void a(csl csl2) {
        ceb.a(csl2, this, this.f);
        boolean bl2 = false;
        for (Map.Entry entry : csl2.a().entrySet()) {
            cyd cyd2 = (cyd)entry.getKey();
            int n2 = (Integer)entry.getValue();
            if (cyd2.e() && n2 > 0) {
                if (this.j && this.f.h.E().a(cyd2) == 0) {
                    box box2 = (box)cyd2;
                    this.f.q.a(box2);
                    if (cyd2 == bpa.f) {
                        this.f.u.J = false;
                        this.f.u.b();
                    }
                }
                bl2 = true;
            }
            this.f.h.E().a(this.f.h, cyd2, n2);
        }
        if (!this.j && !bl2 && this.f.u.J) {
            this.f.q.b(bpa.f);
        }
        this.j = true;
        if (this.f.m instanceof acn) {
            ((acn)((Object)this.f.m)).c();
        }
    }

    @Override
    public void a(bbk bbk2) {
        ceb.a(bbk2, this, this.f);
        cpk cpk2 = this.g.a(bbk2.b());
        if (!(cpk2 instanceof bga)) {
            return;
        }
        bfv bfv2 = bfv.a(bbk2.c());
        if (bfv2 == null) {
            return;
        }
        cko cko2 = new cko(bfv2, bbk2.e(), bbk2.d(), bbk2.g(), bbk2.f());
        cko2.a(bbk2.a());
        ((bga)cpk2).b(cko2);
    }

    @Override
    public void a(zb zb2) {
        cpk cpk2;
        ceb.a(zb2, this, this.f);
        if (zb2.a == cop.c && (cpk2 = this.g.a(zb2.b)) == this.f.h) {
            this.f.a(new cxv(zb2.e));
        }
    }

    @Override
    public void a(ckb ckb2) {
        ceb.a(ckb2, this, this.f);
        this.f.f.E().a(ckb2.b());
        this.f.f.E().e(ckb2.a());
    }

    @Override
    public void a(cpe cpe2) {
        ceb.a(cpe2, this, this.f);
        cpk cpk2 = cpe2.a(this.g);
        if (cpk2 != null) {
            this.f.a(cpk2);
        }
    }

    @Override
    public void a(us us2) {
        ceb.a(us2, this, this.f);
        us2.a(this.g.U());
    }

    @Override
    public void a(cha cha2) {
        ceb.a(cha2, this, this.f);
        hg hg2 = cha2.a();
        String string = null;
        String string2 = null;
        String string3 = cha2.b() != null ? cha2.b().j() : "";
        switch (hg2) {
            case a: {
                string = string3;
                break;
            }
            case b: {
                string2 = string3;
                break;
            }
            case e: {
                this.f.r.a("", "", -1, -1, -1);
                this.f.r.a();
                return;
            }
        }
        this.f.r.a(string, string2, cha2.c(), cha2.d(), cha2.e());
    }

    @Override
    public void a(za za2) {
        this.f.r.g().b(za2.a().j().isEmpty() ? null : za2.a());
        this.f.r.g().a(za2.b().j().isEmpty() ? null : za2.b());
    }

    @Override
    public void a(dfh dfh2) {
        ceb.a(dfh2, this, this.f);
        cpk cpk2 = dfh2.a(this.g);
        if (cpk2 instanceof bga) {
            ((bga)cpk2).a(dfh2.a());
        }
    }

    @Override
    public void a(cgl cgl2) {
        ceb.a(cgl2, this, this.f);
        for (aup aup2 : cgl2.a()) {
            if (cgl2.b() == bfp.e) {
                this.i.remove(aup2.a().a());
                continue;
            }
            bae bae2 = (bae)this.i.get(aup2.a().a());
            if (cgl2.b() == bfp.a) {
                bae2 = new bae(aup2);
                this.i.put(bae2.a().a(), bae2);
            }
            if (bae2 == null) continue;
            switch (cgl2.b()) {
                case a: {
                    bae2.a(aup2.c());
                    bae2.a(aup2.b());
                    break;
                }
                case b: {
                    bae2.a(aup2.c());
                    break;
                }
                case c: {
                    bae2.a(aup2.b());
                    break;
                }
                case d: {
                    bae2.a(aup2.d());
                }
            }
        }
    }

    @Override
    public void a(yn yn2) {
        this.a(new ani(yn2.a()));
    }

    @Override
    public void a(bep bep2) {
        ceb.a(bep2, this, this.f);
        ob ob2 = this.f.h;
        ob2.G.b = bep2.b();
        ob2.G.d = bep2.d();
        ob2.G.a = bep2.a();
        ob2.G.c = bep2.c();
        ob2.G.a(bep2.e());
        ob2.G.b(bep2.f());
    }

    @Override
    public void a(cjh cjh2) {
        ceb.a(cjh2, this, this.f);
        String[] arrstring = cjh2.a();
        if (this.f.m instanceof ddy) {
            ((ddy)((Object)this.f.m)).a(arrstring);
        }
    }

    @Override
    public void a(cya cya2) {
        ceb.a(cya2, this, this.f);
        this.f.f.a(this.f.h, cya2.c(), cya2.d(), cya2.e(), cya2.a(), cya2.b(), cya2.f(), cya2.g());
    }

    @Override
    public void a(cme cme2) {
        ceb.a(cme2, this, this.f);
        this.f.W().a(new ol(new bpx(cme2.a()), cme2.b(), cme2.f(), cme2.g(), false, 0, btu.b, (float)cme2.c(), (float)cme2.d(), (float)cme2.e()));
    }

    @Override
    public void a(bfu bfu2) {
        String string = bfu2.a();
        String string2 = bfu2.b();
        if (!this.b(string)) {
            return;
        }
        if (string.startsWith("level://")) {
            File file = new File(this.f.w, "saves");
            String string3 = string.substring("level://".length());
            File file2 = new File(file, string3);
            if (file2.isFile()) {
                this.c.a(new cyj(se.d));
                ci.a(this.f.R().a(file2), this.e());
            } else {
                this.c.a(new cyj(se.c));
            }
            return;
        }
        cyq cyq2 = this.f.E();
        if (cyq2 != null && cyq2.b() == rj.a) {
            this.c.a(new cyj(se.d));
            ci.a(this.f.R().a(string, string2), this.e());
        } else if (cyq2 == null || cyq2.b() == rj.c) {
            this.f.a(new brw(this, string, string2));
        } else {
            this.c.a(new cyj(se.b));
        }
    }

    private boolean b(String string) {
        try {
            URI uRI = new URI(string.replace(' ', '+'));
            String string2 = uRI.getScheme();
            boolean bl2 = "level".equals(string2);
            if (!("http".equals(string2) || "https".equals(string2) || bl2)) {
                throw new URISyntaxException(string, "Wrong protocol");
            }
            if (bl2 && (string.contains("..") || !string.endsWith("/resources.zip"))) {
                throw new URISyntaxException(string, "Invalid levelstorage resourcepack path");
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            this.c.a(new cyj(se.c));
            return false;
        }
        return true;
    }

    private cg e() {
        return new agb(this);
    }

    @Override
    public void a(dgy dgy2) {
        ceb.a(dgy2, this, this.f);
        this.f.r.i().a(dgy2);
    }

    @Override
    public void a(ok ok2) {
        ceb.a(ok2, this, this.f);
        if (ok2.b() == 0) {
            this.f.h.aS().b(ok2.a());
        } else {
            this.f.h.aS().a(ok2.a(), ok2.b());
        }
    }

    @Override
    public void a(bnh bnh2) {
        ceb.a(bnh2, this, this.f);
        cpk cpk2 = this.f.h.cJ();
        if (cpk2 != this.f.h && cpk2.cK()) {
            cpk2.b(bnh2.a(), bnh2.b(), bnh2.c(), bnh2.d(), bnh2.e());
            this.c.a(new btl(cpk2));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(afw afw2) {
        ceb.a(afw2, this, this.f);
        if ("MC|TrList".equals(afw2.a())) {
            si si2 = afw2.b();
            try {
                int n2 = si2.K();
                cjn cjn2 = this.f.m;
                if (cjn2 == null || !(cjn2 instanceof aez) || n2 != this.f.h.p.h) return;
                fc fc2 = ((aez)cjn2).f();
                beo beo2 = beo.b(si2);
                fc2.a(beo2);
                return;
            }
            catch (IOException iOException) {
                b.b("Couldn't load trade info", (Throwable)iOException);
                return;
            }
            finally {
                si2.ad();
            }
        } else if ("MC|Brand".equals(afw2.a())) {
            this.f.h.b(afw2.b().e(32767));
            return;
        } else if ("MC|BOpen".equals(afw2.a())) {
            bhl bhl2;
            bqp bqp2 = (bqp)afw2.b().a(bqp.class);
            bhl bhl3 = bhl2 = bqp2 == bqp.b ? this.f.h.bu() : this.f.h.bt();
            if (bhl2 == null || bhl2.a() != hp.bX) return;
            this.f.a(new zk(this.f.h, bhl2, false));
            return;
        } else if ("MC|DebugPath".equals(afw2.a())) {
            si si3 = afw2.b();
            int n3 = si3.K();
            float f2 = si3.O();
            dbn dbn2 = dbn.a(si3);
            ((dy)this.f.p.a).a(n3, dbn2, f2);
            return;
        } else {
            if (!"MC|StopSound".equals(afw2.a())) return;
            si si4 = afw2.b();
            String string = si4.e(32767);
            String string2 = si4.e(256);
            this.f.W().a(string2, csg.a(string));
        }
    }

    @Override
    public void a(dbi dbi2) {
        ceb.a(dbi2, this, this.f);
        bzt bzt2 = this.g.P();
        if (dbi2.c() == 0) {
            bhi bhi2 = bzt2.a(dbi2.a(), bcu.b);
            bhi2.a(dbi2.b());
            bhi2.a(dbi2.d());
        } else {
            bhi bhi3 = bzt2.b(dbi2.a());
            if (dbi2.c() == 1) {
                bzt2.j(bhi3);
            } else if (dbi2.c() == 2) {
                bhi3.a(dbi2.b());
                bhi3.a(dbi2.d());
            }
        }
    }

    @Override
    public void a(cnr cnr2) {
        ceb.a(cnr2, this, this.f);
        bzt bzt2 = this.g.P();
        bhi bhi2 = bzt2.b(cnr2.b());
        if (cnr2.d() == bcr.a) {
            czu czu2 = bzt2.c(cnr2.a(), bhi2);
            czu2.c(cnr2.c());
        } else if (cnr2.d() == bcr.b) {
            if (aco.b(cnr2.b())) {
                bzt2.d(cnr2.a(), null);
            } else if (bhi2 != null) {
                bzt2.d(cnr2.a(), bhi2);
            }
        }
    }

    @Override
    public void a(cnc cnc2) {
        ceb.a(cnc2, this, this.f);
        bzt bzt2 = this.g.P();
        if (cnc2.b().isEmpty()) {
            bzt2.a(cnc2.a(), null);
        } else {
            bhi bhi2 = bzt2.b(cnc2.b());
            bzt2.a(cnc2.a(), bhi2);
        }
    }

    @Override
    public void a(bvn bvn2) {
        ceb.a(bvn2, this, this.f);
        bzt bzt2 = this.g.P();
        ef ef2 = bvn2.f() == 0 ? bzt2.e(bvn2.a()) : bzt2.d(bvn2.a());
        if (bvn2.f() == 0 || bvn2.f() == 2) {
            Object object;
            ef2.a(bvn2.b());
            ef2.b(bvn2.c());
            ef2.c(bvn2.d());
            ef2.a(aug.a(bvn2.h()));
            ef2.a(bvn2.g());
            Object object2 = afb.a(bvn2.i());
            if (object2 != null) {
                ef2.a((afb)((Object)object2));
            }
            if ((object = bfo.a(bvn2.j())) != null) {
                ef2.a((bfo)((Object)object));
            }
        }
        if (bvn2.f() == 0 || bvn2.f() == 3) {
            for (Object object : bvn2.e()) {
                bzt2.a((String)object, bvn2.a());
            }
        }
        if (bvn2.f() == 4) {
            for (Object object : bvn2.e()) {
                bzt2.a((String)object, ef2);
            }
        }
        if (bvn2.f() == 1) {
            bzt2.d(ef2);
        }
    }

    @Override
    public void a(cnu cnu2) {
        ceb.a(cnu2, this, this.f);
        if (cnu2.j() == 0) {
            double d2 = cnu2.i() * cnu2.f();
            double d3 = cnu2.i() * cnu2.g();
            double d4 = cnu2.i() * cnu2.h();
            try {
                this.g.a(cnu2.a(), cnu2.b(), cnu2.c(), cnu2.d(), cnu2.e(), d2, d3, d4, cnu2.k());
            }
            catch (Throwable throwable) {
                b.f("Could not spawn particle effect {}", new Object[]{cnu2.a()});
            }
        } else {
            for (int i2 = 0; i2 < cnu2.j(); ++i2) {
                double d5 = this.k.nextGaussian() * (double)cnu2.f();
                double d6 = this.k.nextGaussian() * (double)cnu2.g();
                double d7 = this.k.nextGaussian() * (double)cnu2.h();
                double d8 = this.k.nextGaussian() * (double)cnu2.i();
                double d9 = this.k.nextGaussian() * (double)cnu2.i();
                double d10 = this.k.nextGaussian() * (double)cnu2.i();
                try {
                    this.g.a(cnu2.a(), cnu2.b(), cnu2.c() + d5, cnu2.d() + d6, cnu2.e() + d7, d8, d9, d10, cnu2.k());
                    continue;
                }
                catch (Throwable throwable) {
                    b.f("Could not spawn particle effect {}", new Object[]{cnu2.a()});
                    return;
                }
            }
        }
    }

    @Override
    public void a(cl cl2) {
        ceb.a(cl2, this, this.f);
        cpk cpk2 = this.g.a(cl2.a());
        if (cpk2 == null) {
            return;
        }
        if (!(cpk2 instanceof bga)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + cpk2 + ")");
        }
        anu anu2 = ((bga)cpk2).bs();
        for (bdb bdb2 : cl2.b()) {
            cp cp2 = anu2.b(bdb2.a());
            if (cp2 == null) {
                cp2 = anu2.b(new ot(null, bdb2.a(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
            }
            cp2.a(bdb2.b());
            cp2.d();
            for (cs cs2 : bdb2.c()) {
                cp2.b(cs2);
            }
        }
    }

    public sz b() {
        return this.c;
    }

    public Collection c() {
        return this.i.values();
    }

    public bae a(UUID uUID) {
        return (bae)this.i.get(uUID);
    }

    public bae a(String string) {
        for (bae bae2 : this.i.values()) {
            if (!bae2.a().b().equals(string)) continue;
            return bae2;
        }
        return null;
    }

    public e d() {
        return this.d;
    }

    static /* synthetic */ bxy a(ut ut2, bxy bxy2) {
        ut2.f = bxy2;
        return ut2.f;
    }

    static /* synthetic */ bxy a(ut ut2) {
        return ut2.f;
    }

    static /* synthetic */ sz b(ut ut2) {
        return ut2.c;
    }

    static /* synthetic */ cg c(ut ut2) {
        return ut2.e();
    }
}

