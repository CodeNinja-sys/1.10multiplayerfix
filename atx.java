/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.yk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

public class atx {
    private static final bpx b = new bpx("textures/particle/particles.png");
    protected iu a;
    private final ArrayDeque[][] c = new ArrayDeque[4][];
    private final Queue d = yk.a();
    private final bnm e;
    private final Random f = new Random();
    private final Map g = sz.c();
    private final Queue h = yk.a();

    public atx(iu iu2, bnm bnm2) {
        this.a = iu2;
        this.e = bnm2;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.c[i2] = new ArrayDeque[2];
            for (int i3 = 0; i3 < 2; ++i3) {
                this.c[i2][i3] = yk.a();
            }
        }
        this.c();
    }

    private void c() {
        this.a(lz.a.c(), new crf());
        this.a(lz.e.c(), new brm());
        this.a(lz.f.c(), new bow());
        this.a(lz.g.c(), new dat());
        this.a(lz.N.c(), new bpq());
        this.a(lz.h.c(), new ant());
        this.a(lz.i.c(), new le());
        this.a(lz.j.c(), new dgp());
        this.a(lz.k.c(), new bqy());
        this.a(lz.l.c(), new aol());
        this.a(lz.m.c(), new br());
        this.a(lz.n.c(), new aek());
        this.a(lz.o.c(), new ns());
        this.a(lz.p.c(), new az());
        this.a(lz.q.c(), new btm());
        this.a(lz.r.c(), new ckl());
        this.a(lz.s.c(), new byk());
        this.a(lz.t.c(), new ur());
        this.a(lz.u.c(), new cos());
        this.a(lz.v.c(), new dfq());
        this.a(lz.w.c(), new le());
        this.a(lz.x.c(), new aap());
        this.a(lz.y.c(), new cyf());
        this.a(lz.z.c(), new ado());
        this.a(lz.A.c(), new bkf());
        this.a(lz.B.c(), new bzl());
        this.a(lz.C.c(), new dcd());
        this.a(lz.D.c(), new bcs());
        this.a(lz.E.c(), new crq());
        this.a(lz.U.c(), new ccf());
        this.a(lz.F.c(), new byx());
        this.a(lz.G.c(), new cue());
        this.a(lz.H.c(), new cys());
        this.a(lz.I.c(), new ul());
        this.a(lz.J.c(), new bot());
        this.a(lz.K.c(), new aej());
        this.a(lz.L.c(), new dcm());
        this.a(lz.M.c(), new bgr());
        this.a(lz.c.c(), new ms());
        this.a(lz.b.c(), new adf());
        this.a(lz.d.c(), new anj());
        this.a(lz.P.c(), new alz());
        this.a(lz.Q.c(), new bqg());
        this.a(lz.R.c(), new bvd());
        this.a(lz.S.c(), new ciw());
        this.a(lz.T.c(), new ddk());
    }

    public void a(int n2, als als2) {
        this.g.put(n2, als2);
    }

    public void a(cpk cpk2, lz lz2) {
        this.d.add(new bwn(this.a, cpk2, lz2));
    }

    public qa a(int n2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        qa qa2;
        als als2 = (als)this.g.get(n2);
        if (als2 != null && (qa2 = als2.a(n2, this.a, d2, d3, d4, d5, d6, d7, arrn)) != null) {
            this.a(qa2);
            return qa2;
        }
        return null;
    }

    public void a(qa qa2) {
        this.h.add(qa2);
    }

    public void a() {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(i2);
        }
        if (!this.d.isEmpty()) {
            ArrayList arrayList = ov.a();
            for (bwn bwn2 : this.d) {
                bwn2.b();
                if (bwn2.j()) continue;
                arrayList.add(bwn2);
            }
            this.d.removeAll(arrayList);
        }
        if (!this.h.isEmpty()) {
            qa qa2 = (qa)this.h.poll();
            while (qa2 != null) {
                int n2;
                int n3 = qa2.f();
                int n4 = n2 = qa2.a() ? 0 : 1;
                if (this.c[n3][n2].size() >= 16384) {
                    this.c[n3][n2].removeFirst();
                }
                this.c[n3][n2].add(qa2);
                qa2 = (qa)this.h.poll();
            }
        }
    }

    private void a(int n2) {
        this.a.A.a(n2 + "");
        for (int i2 = 0; i2 < 2; ++i2) {
            this.a.A.a(i2 + "");
            this.a(this.c[n2][i2]);
            this.a.A.b();
        }
        this.a.A.b();
    }

    private void a(Queue queue) {
        if (!queue.isEmpty()) {
            Iterator iterator = queue.iterator();
            while (iterator.hasNext()) {
                qa qa2 = (qa)iterator.next();
                this.b(qa2);
                if (qa2.j()) continue;
                iterator.remove();
            }
        }
    }

    private void b(qa qa2) {
        try {
            qa2.b();
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Ticking Particle");
            sx sx2 = cet2.a("Particle being ticked");
            int n2 = qa2.f();
            sx2.a("Particle", new but(this, qa2));
            sx2.a("Particle Type", new adz(this, n2));
            throw new oz(cet2);
        }
    }

    public void a(cpk cpk2, float f2) {
        float f3 = bsx.b();
        float f4 = bsx.d();
        float f5 = bsx.e();
        float f6 = bsx.f();
        float f7 = bsx.c();
        qa.G = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        qa.H = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        qa.I = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        qa.J = cpk2.l(f2);
        cja.l();
        cja.a(bjt.l, afi.j);
        cja.a(516, 0.003921569f);
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                if (this.c[i2][i3].isEmpty()) continue;
                switch (i3) {
                    case 0: {
                        cja.a(false);
                        break;
                    }
                    case 1: {
                        cja.a(true);
                    }
                }
                switch (i2) {
                    default: {
                        this.e.a(b);
                        break;
                    }
                    case 1: {
                        this.e.a(dam.g);
                    }
                }
                cja.c(1.0f, 1.0f, 1.0f, 1.0f);
                bha bha2 = bha.a();
                bix bix2 = bha2.c();
                bix2.a(7, bxb.d);
                for (qa qa2 : this.c[i2][i3]) {
                    try {
                        qa2.a(bix2, cpk2, f2, f3, f7, f4, f5, f6);
                    }
                    catch (Throwable throwable) {
                        cet cet2 = cet.a(throwable, "Rendering Particle");
                        sx sx2 = cet2.a("Particle being rendered");
                        int n2 = i2;
                        sx2.a("Particle", new cqi(this, qa2));
                        sx2.a("Particle Type", new cy(this, n2));
                        throw new oz(cet2);
                    }
                }
                bha2.b();
            }
        }
        cja.a(true);
        cja.k();
        cja.a(516, 0.1f);
    }

    public void b(cpk cpk2, float f2) {
        float f3 = (float)Math.PI / 180;
        float f4 = cmk.b(cpk2.ba * ((float)Math.PI / 180));
        float f5 = cmk.a(cpk2.ba * ((float)Math.PI / 180));
        float f6 = -f5 * cmk.a(cpk2.bb * ((float)Math.PI / 180));
        float f7 = f4 * cmk.a(cpk2.bb * ((float)Math.PI / 180));
        float f8 = cmk.b(cpk2.bb * ((float)Math.PI / 180));
        for (int i2 = 0; i2 < 2; ++i2) {
            ArrayDeque arrayDeque = this.c[3][i2];
            if (arrayDeque.isEmpty()) continue;
            bha bha2 = bha.a();
            bix bix2 = bha2.c();
            for (qa qa2 : arrayDeque) {
                qa2.a(bix2, cpk2, f2, f4, f8, f5, f6, f7);
            }
        }
    }

    public void a(iu iu2) {
        this.a = iu2;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                this.c[i2][i3].clear();
            }
        }
        this.d.clear();
    }

    public void a(cmz cmz2, dbk dbk2) {
        if (dbk2.a() == ahk.a) {
            return;
        }
        dbk2 = dbk2.b((bnj)this.a, cmz2);
        int n2 = 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                for (int i4 = 0; i4 < 4; ++i4) {
                    double d2 = (double)cmz2.a() + ((double)i2 + 0.5) / 4.0;
                    double d3 = (double)cmz2.b() + ((double)i3 + 0.5) / 4.0;
                    double d4 = (double)cmz2.c() + ((double)i4 + 0.5) / 4.0;
                    this.a(new cba(this.a, d2, d3, d4, d2 - (double)cmz2.a() - 0.5, d3 - (double)cmz2.b() - 0.5, d4 - (double)cmz2.c() - 0.5, dbk2).a(cmz2));
                }
            }
        }
    }

    public void a(cmz cmz2, bqk bqk2) {
        dbk dbk2 = this.a.n(cmz2);
        if (dbk2.i() == cpb.a) {
            return;
        }
        int n2 = cmz2.a();
        int n3 = cmz2.b();
        int n4 = cmz2.c();
        float f2 = 0.1f;
        cxt cxt2 = dbk2.c((bnj)this.a, cmz2);
        double d2 = (double)n2 + this.f.nextDouble() * (cxt2.d - cxt2.a - (double)0.2f) + (double)0.1f + cxt2.a;
        double d3 = (double)n3 + this.f.nextDouble() * (cxt2.e - cxt2.b - (double)0.2f) + (double)0.1f + cxt2.b;
        double d4 = (double)n4 + this.f.nextDouble() * (cxt2.f - cxt2.c - (double)0.2f) + (double)0.1f + cxt2.c;
        if (bqk2 == bqk.a) {
            d3 = (double)n3 + cxt2.b - (double)0.1f;
        }
        if (bqk2 == bqk.b) {
            d3 = (double)n3 + cxt2.e + (double)0.1f;
        }
        if (bqk2 == bqk.c) {
            d4 = (double)n4 + cxt2.c - (double)0.1f;
        }
        if (bqk2 == bqk.d) {
            d4 = (double)n4 + cxt2.f + (double)0.1f;
        }
        if (bqk2 == bqk.e) {
            d2 = (double)n2 + cxt2.a - (double)0.1f;
        }
        if (bqk2 == bqk.f) {
            d2 = (double)n2 + cxt2.d + (double)0.1f;
        }
        this.a(new cba(this.a, d2, d3, d4, 0.0, 0.0, 0.0, dbk2).a(cmz2).b(0.2f).c(0.6f));
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

