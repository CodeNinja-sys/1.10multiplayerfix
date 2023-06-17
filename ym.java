/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Random;
import java.util.Set;

public class ym
extends iu {
    private final ut G;
    private com H;
    private final Set I = aad.a();
    private final Set J = aad.a();
    private final bxy K = bxy.B();
    private final Set L = aad.a();
    private int M = this.p.nextInt(12000);
    protected Set a = aad.a();

    public ym(ut ut2, atd atd2, int n2, ct ct2, cfe cfe2) {
        super(new ags(), new cvn(atd2, "MpServer"), cyy.a(n2).d(), cfe2, true);
        this.G = ut2;
        this.E().a(ct2);
        this.z(new cmz(8, 64, 8));
        this.q.a(this);
        this.t = this.e();
        this.x = new ctn();
        this.o();
        this.q();
    }

    @Override
    public void p() {
        super.p();
        this.a(this.z() + 1L);
        if (this.F().b("doDaylightCycle")) {
            this.b(this.A() + 1L);
        }
        this.A.a("reEntryProcessing");
        for (int i2 = 0; i2 < 10 && !this.J.isEmpty(); ++i2) {
            cpk cpk2 = (cpk)this.J.iterator().next();
            this.J.remove(cpk2);
            if (this.c.contains(cpk2)) continue;
            this.b(cpk2);
        }
        this.A.c("chunkCache");
        this.H.a();
        this.A.c("blocks");
        this.s();
        this.A.b();
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    protected apb e() {
        this.H = new com(this);
        return this.H;
    }

    @Override
    protected boolean a(int n2, int n3, boolean bl2) {
        return bl2 || !this.W().b(n2, n3).h();
    }

    protected void a() {
        this.a.clear();
        int n2 = this.K.u.d;
        this.A.a("buildList");
        int n3 = cmk.c(this.K.h.aU / 16.0);
        int n4 = cmk.c(this.K.h.aW / 16.0);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                this.a.add(new zz(i2 + n3, i3 + n4));
            }
        }
        this.A.b();
    }

    @Override
    protected void s() {
        this.a();
        if (this.M > 0) {
            --this.M;
        }
        this.L.retainAll(this.a);
        if (this.L.size() == this.a.size()) {
            this.L.clear();
        }
        int n2 = 0;
        for (zz zz2 : this.a) {
            if (this.L.contains(zz2)) continue;
            int n3 = zz2.a * 16;
            int n4 = zz2.b * 16;
            this.A.a("getChunk");
            bhm bhm2 = this.a(zz2.a, zz2.b);
            this.a(n3, n4, bhm2);
            this.A.b();
            this.L.add(zz2);
            if (++n2 < 10) continue;
            return;
        }
    }

    public void b(int n2, int n3, boolean bl2) {
        if (bl2) {
            this.H.d(n2, n3);
        } else {
            this.H.c(n2, n3);
            this.a(n2 * 16, 0, n3 * 16, n2 * 16 + 15, 256, n3 * 16 + 15);
        }
    }

    @Override
    public boolean b(cpk cpk2) {
        boolean bl2 = super.b(cpk2);
        this.I.add(cpk2);
        if (bl2) {
            if (cpk2 instanceof cef) {
                this.K.W().a(new yt((cef)cpk2));
            }
        } else {
            this.J.add(cpk2);
        }
        return bl2;
    }

    @Override
    public void e(cpk cpk2) {
        super.e(cpk2);
        this.I.remove(cpk2);
    }

    @Override
    protected void c(cpk cpk2) {
        super.c(cpk2);
        if (this.J.contains(cpk2)) {
            this.J.remove(cpk2);
        }
    }

    @Override
    protected void d(cpk cpk2) {
        super.d(cpk2);
        if (this.I.contains(cpk2)) {
            if (cpk2.bj()) {
                this.J.add(cpk2);
            } else {
                this.I.remove(cpk2);
            }
        }
    }

    public void a(int n2, cpk cpk2) {
        cpk cpk3 = this.a(n2);
        if (cpk3 != null) {
            this.e(cpk3);
        }
        this.I.add(cpk2);
        cpk2.l(n2);
        if (!this.b(cpk2)) {
            this.J.add(cpk2);
        }
        this.i.a(n2, cpk2);
    }

    @Override
    public cpk a(int n2) {
        if (n2 == this.K.h.bW()) {
            return this.K.h;
        }
        return super.a(n2);
    }

    public cpk e(int n2) {
        cpk cpk2 = (cpk)this.i.d(n2);
        if (cpk2 != null) {
            this.I.remove(cpk2);
            this.e(cpk2);
        }
        return cpk2;
    }

    public boolean b(cmz cmz2, dbk dbk2) {
        int n2 = cmz2.a();
        int n3 = cmz2.b();
        int n4 = cmz2.c();
        this.b(n2, n3, n4, n2, n3, n4);
        return super.a(cmz2, dbk2, 3);
    }

    @Override
    public void w() {
        this.G.b().a(new aym("Quitting"));
    }

    @Override
    protected void r() {
    }

    @Override
    protected void a(int n2, int n3, bhm bhm2) {
        super.a(n2, n3, bhm2);
        if (this.M == 0) {
            this.j = this.j * 3 + 1013904223;
            int n4 = this.j >> 2;
            int n5 = n4 & 0xF;
            int n6 = n4 >> 8 & 0xF;
            int n7 = n4 >> 16 & 0xFF;
            cmz cmz2 = new cmz(n5 + n2, n7, n6 + n3);
            dbk dbk2 = bhm2.c(cmz2);
            n5 += n2;
            n6 += n3;
            if (dbk2.a() == ahk.a && this.i(cmz2) <= this.p.nextInt(8) && this.b(bzq.a, cmz2) <= 0 && this.K.h != null && this.K.h.i((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5) > 4.0) {
                this.a((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5, dah.a, csg.i, 0.7f, 0.8f + this.p.nextFloat() * 0.2f, false);
                this.M = this.p.nextInt(12000) + 6000;
            }
        }
    }

    public void b(int n2, int n3, int n4) {
        int n5 = 32;
        Random random = new Random();
        bhl bhl2 = this.K.h.bt();
        boolean bl2 = this.K.c.l() == bvh.c && bhl2 != null && bfa.a(bhl2.a()) == blg.cv;
        pj pj2 = new pj();
        for (int i2 = 0; i2 < 667; ++i2) {
            this.a(n2, n3, n4, 16, random, bl2, pj2);
            this.a(n2, n3, n4, 32, random, bl2, pj2);
        }
    }

    public void a(int n2, int n3, int n4, int n5, Random random, boolean bl2, pj pj2) {
        int n6 = n2 + this.p.nextInt(n5) - this.p.nextInt(n5);
        int n7 = n3 + this.p.nextInt(n5) - this.p.nextInt(n5);
        int n8 = n4 + this.p.nextInt(n5) - this.p.nextInt(n5);
        pj2.a(n6, n7, n8);
        dbk dbk2 = this.n(pj2);
        dbk2.t().a(dbk2, (iu)this, (cmz)pj2, random);
        if (bl2 && dbk2.t() == blg.cv) {
            this.a(lz.J, (double)((float)n6 + 0.5f), (double)((float)n7 + 0.5f), (double)((float)n8 + 0.5f), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    public void c() {
        int n2;
        cpk cpk2;
        int n3;
        this.c.removeAll(this.d);
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            cpk2 = (cpk)this.d.get(n3);
            int n4 = cpk2.bH;
            n2 = cpk2.bJ;
            if (!cpk2.bG || !this.a(n4, n2, true)) continue;
            this.a(n4, n2).b(cpk2);
        }
        for (n3 = 0; n3 < this.d.size(); ++n3) {
            this.d((cpk)this.d.get(n3));
        }
        this.d.clear();
        for (n3 = 0; n3 < this.c.size(); ++n3) {
            cpk2 = (cpk)this.c.get(n3);
            cpk cpk3 = cpk2.cL();
            if (cpk3 != null) {
                if (!cpk3.bk && cpk3.r(cpk2)) continue;
                cpk2.s_();
            }
            if (!cpk2.bk) continue;
            n2 = cpk2.bH;
            int n5 = cpk2.bJ;
            if (cpk2.bG && this.a(n2, n5, true)) {
                this.a(n2, n5).b(cpk2);
            }
            this.c.remove(n3--);
            this.d(cpk2);
        }
    }

    @Override
    public sx a(cet cet2) {
        sx sx2 = super.a(cet2);
        sx2.a("Forced entities", new bcp(this));
        sx2.a("Retry entities", new bmy(this));
        sx2.a("Server brand", new un(this));
        sx2.a("Server type", new de(this));
        return sx2;
    }

    @Override
    public void a(bdl bdl2, double d2, double d3, double d4, bi bi2, csg csg2, float f2, float f3) {
        if (bdl2 == this.K.h) {
            this.a(d2, d3, d4, bi2, csg2, f2, f3, false);
        }
    }

    public void a(cmz cmz2, bi bi2, csg csg2, float f2, float f3, boolean bl2) {
        this.a((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, bi2, csg2, f2, f3, bl2);
    }

    @Override
    public void a(double d2, double d3, double d4, bi bi2, csg csg2, float f2, float f3, boolean bl2) {
        double d5 = this.K.ab().i(d2, d3, d4);
        ol ol2 = new ol(bi2, csg2, f2, f3, (float)d2, (float)d3, (float)d4);
        if (bl2 && d5 > 100.0) {
            double d6 = Math.sqrt(d5) / 40.0;
            this.K.W().a(ol2, (int)(d6 * 20.0));
        } else {
            this.K.W().a(ol2);
        }
    }

    @Override
    public void a(double d2, double d3, double d4, double d5, double d6, double d7, bvp bvp2) {
        this.K.j.a(new buf(this, d2, d3, d4, d5, d6, d7, this.K.j, bvp2));
    }

    @Override
    public void a(ds ds2) {
        this.G.a(ds2);
    }

    public void a(bzt bzt2) {
        this.B = bzt2;
    }

    @Override
    public void b(long l2) {
        if (l2 < 0L) {
            l2 = -l2;
            this.F().a("doDaylightCycle", "false");
        } else {
            this.F().a("doDaylightCycle", "true");
        }
        super.b(l2);
    }

    public com W() {
        return (com)super.C();
    }

    @Override
    public /* synthetic */ apb C() {
        return this.W();
    }

    static /* synthetic */ Set a(ym ym2) {
        return ym2.I;
    }

    static /* synthetic */ Set b(ym ym2) {
        return ym2.J;
    }

    static /* synthetic */ bxy c(ym ym2) {
        return ym2.K;
    }
}

