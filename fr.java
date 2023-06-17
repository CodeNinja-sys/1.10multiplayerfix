/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.yk;
import com.a.b.ag;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.lwjgl.util.e.d;
import org.lwjgl.util.e.l;
import org.lwjgl.util.e.m;

public class fr
implements aoi,
bde {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private static final bpx c = new bpx("textures/environment/moon_phases.png");
    private static final bpx d = new bpx("textures/environment/sun.png");
    private static final bpx e = new bpx("textures/environment/clouds.png");
    private static final bpx f = new bpx("textures/environment/end_sky.png");
    private static final bpx g = new bpx("textures/misc/forcefield.png");
    private final bxy h;
    private final bnm i;
    private final bid j;
    private ym k;
    private Set l = aad.c();
    private List m = ov.b(69696);
    private final Set n = aad.a();
    private bre o;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private final ava s;
    private cwg t;
    private cwg u;
    private cwg v;
    private int w;
    private final Map x = sz.c();
    private final Map y = sz.c();
    private final ars[] z = new ars[10];
    private btr A;
    private bum B;
    private double C = Double.MIN_VALUE;
    private double D = Double.MIN_VALUE;
    private double E = Double.MIN_VALUE;
    private int F = Integer.MIN_VALUE;
    private int G = Integer.MIN_VALUE;
    private int H = Integer.MIN_VALUE;
    private double I = Double.MIN_VALUE;
    private double J = Double.MIN_VALUE;
    private double K = Double.MIN_VALUE;
    private double L = Double.MIN_VALUE;
    private double M = Double.MIN_VALUE;
    private dfr N;
    private yw O;
    private int P = -1;
    private int Q = 2;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private agg V;
    private final m[] W = new m[8];
    private final wg X = new wg();
    private boolean Y;
    akt a;
    private double Z;
    private double aa;
    private double ab;
    private boolean ac = true;
    private boolean ad;
    private final Set ae = aad.a();

    public fr(bxy bxy2) {
        this.h = bxy2;
        this.j = bxy2.ad();
        this.i = bxy2.P();
        this.i.a(g);
        cja.b(3553, 10242, 10497);
        cja.b(3553, 10243, 10497);
        cja.i(0);
        this.m();
        this.Y = cjg.f();
        if (this.Y) {
            this.O = new cyv();
            this.a = new afy();
        } else {
            this.O = new bso();
            this.a = new bsh();
        }
        this.s = new ava();
        this.s.a(new ctq(0, dcy.a, ui.a, 3));
        this.p();
        this.o();
        this.n();
    }

    @Override
    public void a(akx akx2) {
        this.m();
    }

    private void m() {
        dam dam2 = this.h.T();
        for (int i2 = 0; i2 < this.z.length; ++i2) {
            this.z[i2] = dam2.a("minecraft:blocks/destroy_stage_" + i2);
        }
    }

    public void a() {
        if (cjg.O) {
            if (sj.b() == null) {
                sj.a();
            }
            bpx bpx2 = new bpx("shaders/post/entity_outline.json");
            try {
                this.B = new bum(this.h.P(), this.h.Q(), this.h.c(), bpx2);
                this.B.a(this.h.d, this.h.e);
                this.A = this.B.a("final");
            }
            catch (IOException iOException) {
                b.f("Failed to load shader: {}", bpx2, iOException);
                this.B = null;
                this.A = null;
            }
            catch (ag ag2) {
                b.f("Failed to load shader: {}", bpx2, ag2);
                this.B = null;
                this.A = null;
            }
        } else {
            this.B = null;
            this.A = null;
        }
    }

    public void b() {
        if (this.c()) {
            cja.l();
            cja.a(bjt.l, afi.j, bjt.o, afi.e);
            this.A.a(this.h.d, this.h.e, false);
            cja.k();
        }
    }

    protected boolean c() {
        return this.A != null && this.B != null && this.h.h != null;
    }

    private void n() {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        if (this.v != null) {
            this.v.c();
        }
        if (this.r >= 0) {
            avj.b(this.r);
            this.r = -1;
        }
        if (this.Y) {
            this.v = new cwg(this.s);
            this.a(bix2, -16.0f, true);
            bix2.e();
            bix2.b();
            this.v.a(bix2.f());
        } else {
            this.r = avj.a(1);
            cja.f(this.r, 4864);
            this.a(bix2, -16.0f, true);
            bha2.b();
            cja.H();
        }
    }

    private void o() {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        if (this.u != null) {
            this.u.c();
        }
        if (this.q >= 0) {
            avj.b(this.q);
            this.q = -1;
        }
        if (this.Y) {
            this.u = new cwg(this.s);
            this.a(bix2, 16.0f, false);
            bix2.e();
            bix2.b();
            this.u.a(bix2.f());
        } else {
            this.q = avj.a(1);
            cja.f(this.q, 4864);
            this.a(bix2, 16.0f, false);
            bha2.b();
            cja.H();
        }
    }

    private void a(bix bix2, float f2, boolean bl2) {
        int n2 = 64;
        int n3 = 6;
        bix2.a(7, bxb.e);
        for (int i2 = -384; i2 <= 384; i2 += 64) {
            for (int i3 = -384; i3 <= 384; i3 += 64) {
                float f3 = i2;
                float f4 = i2 + 64;
                if (bl2) {
                    f4 = i2;
                    f3 = i2 + 64;
                }
                bix2.b((double)f3, (double)f2, (double)i3).d();
                bix2.b((double)f4, (double)f2, (double)i3).d();
                bix2.b((double)f4, (double)f2, (double)(i3 + 64)).d();
                bix2.b((double)f3, (double)f2, (double)(i3 + 64)).d();
            }
        }
    }

    private void p() {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        if (this.t != null) {
            this.t.c();
        }
        if (this.p >= 0) {
            avj.b(this.p);
            this.p = -1;
        }
        if (this.Y) {
            this.t = new cwg(this.s);
            this.a(bix2);
            bix2.e();
            bix2.b();
            this.t.a(bix2.f());
        } else {
            this.p = avj.a(1);
            cja.D();
            cja.f(this.p, 4864);
            this.a(bix2);
            bha2.b();
            cja.H();
            cja.E();
        }
    }

    private void a(bix bix2) {
        Random random = new Random(10842L);
        bix2.a(7, bxb.e);
        for (int i2 = 0; i2 < 1500; ++i2) {
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = random.nextFloat() * 2.0f - 1.0f;
            double d4 = random.nextFloat() * 2.0f - 1.0f;
            double d5 = 0.15f + random.nextFloat() * 0.1f;
            double d6 = d2 * d2 + d3 * d3 + d4 * d4;
            if (!(d6 < 1.0) || !(d6 > 0.01)) continue;
            d6 = 1.0 / Math.sqrt(d6);
            double d7 = (d2 *= d6) * 100.0;
            double d8 = (d3 *= d6) * 100.0;
            double d9 = (d4 *= d6) * 100.0;
            double d10 = Math.atan2(d2, d4);
            double d11 = Math.sin(d10);
            double d12 = Math.cos(d10);
            double d13 = Math.atan2(Math.sqrt(d2 * d2 + d4 * d4), d3);
            double d14 = Math.sin(d13);
            double d15 = Math.cos(d13);
            double d16 = random.nextDouble() * Math.PI * 2.0;
            double d17 = Math.sin(d16);
            double d18 = Math.cos(d16);
            for (int i3 = 0; i3 < 4; ++i3) {
                double d19;
                double d20 = 0.0;
                double d21 = (double)((i3 & 2) - 1) * d5;
                double d22 = (double)((i3 + 1 & 2) - 1) * d5;
                double d23 = 0.0;
                double d24 = d21 * d18 - d22 * d17;
                double d25 = d19 = d22 * d18 + d21 * d17;
                double d26 = d24 * d14 + 0.0 * d15;
                double d27 = 0.0 * d14 - d24 * d15;
                double d28 = d27 * d11 - d25 * d12;
                double d29 = d26;
                double d30 = d25 * d11 + d27 * d12;
                bix2.b(d7 + d28, d8 + d29, d9 + d30).d();
            }
        }
    }

    public void a(ym ym2) {
        if (this.k != null) {
            this.k.b(this);
        }
        this.C = Double.MIN_VALUE;
        this.D = Double.MIN_VALUE;
        this.E = Double.MIN_VALUE;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.j.a(ym2);
        this.k = ym2;
        if (ym2 != null) {
            ym2.a(this);
            this.d();
        } else {
            this.l.clear();
            this.m.clear();
            this.o = null;
            if (this.N != null) {
                this.N.g();
            }
            this.N = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        if (this.k == null) {
            return;
        }
        if (this.N == null) {
            this.N = new dfr();
        }
        this.ac = true;
        blg.t.a(this.h.u.j);
        blg.u.a(this.h.u.j);
        this.P = this.h.u.d;
        boolean bl2 = this.Y;
        this.Y = cjg.f();
        if (bl2 && !this.Y) {
            this.O = new bso();
            this.a = new bsh();
        } else if (!bl2 && this.Y) {
            this.O = new cyv();
            this.a = new afy();
        }
        if (bl2 != this.Y) {
            this.p();
            this.o();
            this.n();
        }
        if (this.o != null) {
            this.o.a();
        }
        this.e();
        Object object = this.n;
        synchronized (object) {
            this.n.clear();
        }
        this.o = new bre(this.k, this.h.u.d, this, this.a);
        if (this.k != null && (object = this.h.ab()) != null) {
            this.o.a(((cpk)object).aU, ((cpk)object).aW);
        }
        this.Q = 2;
    }

    protected void e() {
        this.l.clear();
        this.N.b();
    }

    public void a(int n2, int n3) {
        if (!cjg.O) {
            return;
        }
        if (this.B != null) {
            this.B.a(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(cpk cpk2, cct cct2, float f2) {
        Object object;
        Object object2;
        Object object32;
        Object object4;
        if (this.Q > 0) {
            --this.Q;
            return;
        }
        double d2 = cpk2.aR + (cpk2.aU - cpk2.aR) * (double)f2;
        double d3 = cpk2.aS + (cpk2.aV - cpk2.aS) * (double)f2;
        double d4 = cpk2.aT + (cpk2.aW - cpk2.aT) * (double)f2;
        this.k.A.a("prepare");
        ccg.a.a(this.k, this.h.P(), this.h.k, this.h.ab(), this.h.t, f2);
        this.j.a(this.k, this.h.k, this.h.ab(), this.h.i, this.h.u, f2);
        this.R = 0;
        this.S = 0;
        this.T = 0;
        cpk cpk3 = this.h.ab();
        double d5 = cpk3.br + (cpk3.aU - cpk3.br) * (double)f2;
        double d6 = cpk3.bs + (cpk3.aV - cpk3.bs) * (double)f2;
        double d7 = cpk3.bt + (cpk3.aW - cpk3.bt) * (double)f2;
        ccg.b = d5;
        ccg.c = d6;
        ccg.d = d7;
        this.j.a(d5, d6, d7);
        this.h.o.g();
        this.k.A.c("global");
        List list = this.k.t();
        this.R = list.size();
        for (int i2 = 0; i2 < this.k.h.size(); ++i2) {
            object4 = (cpk)this.k.h.get(i2);
            ++this.S;
            if (!((cpk)object4).k(d2, d3, d4)) continue;
            this.j.a((cpk)object4, f2, false);
        }
        this.k.A.c("entities");
        ArrayList arrayList = ov.a();
        object4 = ov.a();
        bjb bjb2 = bjb.e();
        for (Object object5 : this.m) {
            object32 = this.k.e(((pu)object5).a.j());
            object2 = ((bhm)object32).t()[((pu)object5).a.j().b() / 16];
            if (((AbstractCollection)object2).isEmpty()) continue;
            object = ((ka)object2).iterator();
            while (object.hasNext()) {
                boolean bl2;
                cpk cpk4 = (cpk)object.next();
                boolean bl3 = this.j.a(cpk4, cct2, d2, d3, d4) || cpk4.t(this.h.h);
                if (!bl3) continue;
                boolean bl4 = bl2 = this.h.ab() instanceof bga ? ((bga)this.h.ab()).H_() : false;
                if (cpk4 == this.h.ab() && this.h.u.as == 0 && !bl2 || cpk4.aV >= 0.0 && cpk4.aV < 256.0 && !this.k.d(bjb2.b(cpk4))) continue;
                ++this.S;
                this.j.a(cpk4, f2, false);
                if (this.a(cpk4, cpk3, cct2)) {
                    arrayList.add(cpk4);
                }
                if (!this.j.b(cpk4)) continue;
                object4.add(cpk4);
            }
        }
        bjb2.f();
        if (!object4.isEmpty()) {
            Iterator iterator = object4.iterator();
            while (iterator.hasNext()) {
                Object object5;
                object5 = (cpk)iterator.next();
                this.j.a((cpk)object5, f2);
            }
        }
        if (this.c() && (!arrayList.isEmpty() || this.ad)) {
            this.k.A.c("entityOutlines");
            this.A.f();
            boolean bl5 = this.ad = !arrayList.isEmpty();
            if (!arrayList.isEmpty()) {
                cja.c(519);
                cja.o();
                this.A.a(false);
                bjr.a();
                this.j.c(true);
                for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                    this.j.a((cpk)arrayList.get(i3), f2, false);
                }
                this.j.c(false);
                bjr.b();
                cja.a(false);
                this.B.a(f2);
                cja.e();
                cja.a(true);
                cja.n();
                cja.l();
                cja.g();
                cja.c(515);
                cja.j();
                cja.d();
            }
            this.h.c().a(false);
        }
        this.k.A.c("blockentities");
        bjr.b();
        for (Object object5 : this.m) {
            object32 = ((pu)object5).a.g().b();
            if (object32.isEmpty()) continue;
            object2 = object32.iterator();
            while (object2.hasNext()) {
                object = (bql)object2.next();
                ccg.a.a((bql)object, f2, -1);
            }
        }
        Iterator iterator = this.n;
        synchronized (iterator) {
            for (Object object32 : this.n) {
                ccg.a.a((bql)object32, f2, -1);
            }
        }
        this.r();
        for (Object object5 : this.x.values()) {
            object32 = ((jt)object5).a();
            object2 = this.k.q((cmz)object32);
            if (object2 instanceof bdm) {
                object = (bdm)object2;
                if (((bdm)object).f != null) {
                    object32 = ((cmz)object32).c(bqk.e);
                    object2 = this.k.q((cmz)object32);
                } else if (((bdm)object).d != null) {
                    object32 = ((cmz)object32).c(bqk.c);
                    object2 = this.k.q((cmz)object32);
                }
            }
            object = this.k.n((cmz)object32).t();
            if (object2 == null || !(object instanceof aqi) && !(object instanceof avw) && !(object instanceof bsu) && !(object instanceof cvc)) continue;
            ccg.a.a((bql)object2, f2, ((jt)object5).b());
        }
        this.s();
        this.h.o.f();
        this.h.B.b();
    }

    private boolean a(cpk cpk2, cpk cpk3, cct cct2) {
        boolean bl2;
        boolean bl3 = bl2 = cpk3 instanceof bga && ((bga)cpk3).H_();
        if (cpk2 == cpk3 && this.h.u.as == 0 && !bl2) {
            return false;
        }
        if (cpk2.cs()) {
            return true;
        }
        if (this.h.h.aL() && this.h.u.am.e() && cpk2 instanceof bdl) {
            return cpk2.bN || cct2.a(cpk2.cD()) || cpk2.t(this.h.h);
        }
        return false;
    }

    public String f() {
        int n2 = this.o.f.length;
        int n3 = this.g();
        return String.format("C: %d/%d %sD: %d, L: %d, %s", n3, n2, this.h.E ? "(s) " : "", this.P, this.ae.size(), this.N == null ? "null" : this.N.a());
    }

    protected int g() {
        int n2 = 0;
        for (pu pu2 : this.m) {
            ajc ajc2 = pu2.a.b;
            if (ajc2 == ajc.a || ajc2.a()) continue;
            ++n2;
        }
        return n2;
    }

    public String h() {
        return "E: " + this.S + "/" + this.R + ", B: " + this.T;
    }

    public void a(cpk cpk2, double d2, cct object, int n2, boolean bl2) {
        Collection<pu> collection;
        Object object2;
        if (this.h.u.d != this.P) {
            this.d();
        }
        this.k.A.a("camera");
        double d3 = cpk2.aU - this.C;
        double d4 = cpk2.aV - this.D;
        double d5 = cpk2.aW - this.E;
        if (this.F != cpk2.bH || this.G != cpk2.bI || this.H != cpk2.bJ || d3 * d3 + d4 * d4 + d5 * d5 > 16.0) {
            this.C = cpk2.aU;
            this.D = cpk2.aV;
            this.E = cpk2.aW;
            this.F = cpk2.bH;
            this.G = cpk2.bI;
            this.H = cpk2.bJ;
            this.o.a(cpk2.aU, cpk2.aW);
        }
        this.k.A.c("renderlistcamera");
        double d6 = cpk2.br + (cpk2.aU - cpk2.br) * d2;
        double d7 = cpk2.bs + (cpk2.aV - cpk2.bs) * d2;
        double d8 = cpk2.bt + (cpk2.aW - cpk2.bt) * d2;
        this.O.a(d6, d7, d8);
        this.k.A.c("cull");
        if (this.V != null) {
            object2 = new daf(this.V);
            ((daf)object2).a(this.X.a, this.X.b, this.X.c);
            object = object2;
        }
        this.h.B.c("culling");
        object2 = new cmz(d6, d7 + (double)cpk2.A(), d8);
        adr adr2 = this.o.a((cmz)object2);
        cmz cmz2 = new cmz(cmk.c(d6 / 16.0) * 16, cmk.c(d7 / 16.0) * 16, cmk.c(d8 / 16.0) * 16);
        this.ac = this.ac || !this.l.isEmpty() || cpk2.aU != this.I || cpk2.aV != this.J || cpk2.aW != this.K || (double)cpk2.bb != this.L || (double)cpk2.ba != this.M;
        this.I = cpk2.aU;
        this.J = cpk2.aV;
        this.K = cpk2.aW;
        this.L = cpk2.bb;
        this.M = cpk2.ba;
        boolean bl3 = this.V != null;
        this.h.B.c("update");
        if (!bl3 && this.ac) {
            int n3;
            this.ac = false;
            this.m = ov.a();
            collection = yk.a();
            cpk.c(cmk.a((double)this.h.u.d / 8.0, 1.0, 2.5));
            boolean bl4 = this.h.E;
            if (adr2 == null) {
                n3 = ((cjx)object2).b() > 0 ? 248 : 8;
                for (int i2 = -this.P; i2 <= this.P; ++i2) {
                    for (int i3 = -this.P; i3 <= this.P; ++i3) {
                        adr object3 = this.o.a(new cmz((i2 << 4) + 8, n3, (i3 << 4) + 8));
                        if (object3 == null || !object.a(object3.c)) continue;
                        object3.a(n2);
                        collection.add(new pu(this, object3, null, 0, null));
                    }
                }
            } else {
                n3 = 0;
                pu pu2 = new pu(this, adr2, null, 0, null);
                Set set = this.b((cmz)object2);
                if (set.size() == 1) {
                    l bl5 = this.a(cpk2, d2);
                    bqk bqk2 = bqk.a(bl5.a, bl5.b, bl5.c).e();
                    set.remove(bqk2);
                }
                if (set.isEmpty()) {
                    n3 = 1;
                }
                if (n3 == 0 || bl2) {
                    if (bl2 && this.k.n((cmz)object2).p()) {
                        bl4 = false;
                    }
                    adr2.a(n2);
                    collection.add(pu2);
                } else {
                    this.m.add(pu2);
                }
            }
            this.h.B.a("iteration");
            while (!collection.isEmpty()) {
                pu pu3 = (pu)collection.poll();
                adr adr3 = pu3.a;
                bqk bqk3 = pu3.b;
                this.m.add(pu3);
                for (bqk bqk4 : bqk.values()) {
                    adr adr4 = this.a(cmz2, adr3, bqk4);
                    if (bl4 && pu3.a(bqk4.e()) || bl4 && bqk3 != null && !adr3.g().a(bqk3.e(), bqk4) || adr4 == null || !adr4.a(n2) || !object.a(adr4.c)) continue;
                    pu pu2 = new pu(this, adr4, bqk4, pu3.d + 1, null);
                    pu2.a(pu3.c, bqk4);
                    collection.add(pu2);
                }
            }
            this.h.B.b();
        }
        this.h.B.c("captureFrustum");
        if (this.U) {
            this.a(d6, d7, d8);
            this.U = false;
        }
        this.h.B.c("rebuildNear");
        collection = this.l;
        this.l = aad.c();
        for (pu pu5 : this.m) {
            boolean bl4;
            adr adr5 = pu5.a;
            if (!adr5.l() && !collection.contains(adr5)) continue;
            this.ac = true;
            cmz cmz3 = adr5.j().e(8, 8, 8);
            boolean bl5 = bl4 = cmz3.f((cjx)object2) < 768.0;
            if (adr5.m() || bl4) {
                this.h.B.a("build near");
                this.N.b(adr5);
                adr5.k();
                this.h.B.b();
                continue;
            }
            this.l.add(adr5);
        }
        this.l.addAll(collection);
        this.h.B.b();
    }

    private Set b(cmz cmz2) {
        apv apv2 = new apv();
        cmz cmz3 = new cmz(cmz2.a() >> 4 << 4, cmz2.b() >> 4 << 4, cmz2.c() >> 4 << 4);
        bhm bhm2 = this.k.e(cmz3);
        for (pj pj2 : cmz.b(cmz3, cmz3.e(15, 15, 15))) {
            if (!bhm2.c(pj2).p()) continue;
            apv2.a(pj2);
        }
        return apv2.b(cmz2);
    }

    private adr a(cmz cmz2, adr adr2, bqk bqk2) {
        cmz cmz3 = adr2.a(bqk2);
        if (cmk.a(cmz2.a() - cmz3.a()) > this.P * 16) {
            return null;
        }
        if (cmz3.b() < 0 || cmz3.b() >= 256) {
            return null;
        }
        if (cmk.a(cmz2.c() - cmz3.c()) > this.P * 16) {
            return null;
        }
        return this.o.a(cmz3);
    }

    private void a(double d2, double d3, double d4) {
        this.V = new zr();
        ((zr)this.V).b();
        bac bac2 = new bac(this.V.c);
        bac2.d();
        bac bac3 = new bac(this.V.b);
        bac3.d();
        bac bac4 = new bac();
        bac.c(bac3, bac2, bac4);
        bac4.b();
        this.X.a = d2;
        this.X.b = d3;
        this.X.c = d4;
        this.W[0] = new m(-1.0f, -1.0f, -1.0f, 1.0f);
        this.W[1] = new m(1.0f, -1.0f, -1.0f, 1.0f);
        this.W[2] = new m(1.0f, 1.0f, -1.0f, 1.0f);
        this.W[3] = new m(-1.0f, 1.0f, -1.0f, 1.0f);
        this.W[4] = new m(-1.0f, -1.0f, 1.0f, 1.0f);
        this.W[5] = new m(1.0f, -1.0f, 1.0f, 1.0f);
        this.W[6] = new m(1.0f, 1.0f, 1.0f, 1.0f);
        this.W[7] = new m(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < 8; ++i2) {
            bac.a((d)bac4, this.W[i2], this.W[i2]);
            this.W[i2].a /= this.W[i2].d;
            this.W[i2].b /= this.W[i2].d;
            this.W[i2].c /= this.W[i2].d;
            this.W[i2].d = 1.0f;
        }
    }

    protected l a(cpk cpk2, double d2) {
        float f2 = (float)((double)cpk2.bd + (double)(cpk2.bb - cpk2.bd) * d2);
        float f3 = (float)((double)cpk2.bc + (double)(cpk2.ba - cpk2.bc) * d2);
        if (bxy.B().u.as == 2) {
            f2 += 180.0f;
        }
        float f4 = cmk.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = cmk.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -cmk.b(-f2 * ((float)Math.PI / 180));
        float f7 = cmk.a(-f2 * ((float)Math.PI / 180));
        return new l(f5 * f6, f7, f4 * f6);
    }

    public int a(kj kj2, double d2, int n2, cpk cpk2) {
        bjr.a();
        if (kj2 == kj.d) {
            this.h.B.a("translucent_sort");
            double d3 = cpk2.aU - this.Z;
            double d4 = cpk2.aV - this.aa;
            double d5 = cpk2.aW - this.ab;
            if (d3 * d3 + d4 * d4 + d5 * d5 > 1.0) {
                this.Z = cpk2.aU;
                this.aa = cpk2.aV;
                this.ab = cpk2.aW;
                int n3 = 0;
                for (pu pu2 : this.m) {
                    if (!pu2.a.b.d(kj2) || n3++ >= 15) continue;
                    this.N.c(pu2.a);
                }
            }
            this.h.B.b();
        }
        this.h.B.a("filterempty");
        int n4 = 0;
        boolean bl2 = kj2 == kj.d;
        int n5 = bl2 ? this.m.size() - 1 : 0;
        int n6 = bl2 ? -1 : this.m.size();
        int n7 = bl2 ? -1 : 1;
        for (int i2 = n5; i2 != n6; i2 += n7) {
            adr adr2 = ((pu)this.m.get((int)i2)).a;
            if (adr2.g().b(kj2)) continue;
            ++n4;
            this.O.a(adr2, kj2);
        }
        this.h.B.c("render_" + (Object)((Object)kj2));
        this.a(kj2);
        this.h.B.b();
        return n4;
    }

    private void a(kj kj2) {
        this.h.o.g();
        if (cjg.f()) {
            cja.n(32884);
            cjg.l(cjg.q);
            cja.n(32888);
            cjg.l(cjg.r);
            cja.n(32888);
            cjg.l(cjg.q);
            cja.n(32886);
        }
        this.O.a(kj2);
        if (cjg.f()) {
            List list = bxb.a.h();
            for (ctq ctq2 : list) {
                ui ui2 = ctq2.b();
                int n2 = ctq2.d();
                switch (ui2) {
                    case a: {
                        cja.m(32884);
                        break;
                    }
                    case d: {
                        cjg.l(cjg.q + n2);
                        cja.m(32888);
                        cjg.l(cjg.q);
                        break;
                    }
                    case c: {
                        cja.m(32886);
                        cja.F();
                    }
                }
            }
        }
        this.h.o.f();
    }

    private void a(Iterator iterator) {
        while (iterator.hasNext()) {
            jt jt2 = (jt)iterator.next();
            int n2 = jt2.c();
            if (this.w - n2 <= 400) continue;
            iterator.remove();
        }
    }

    public void i() {
        ++this.w;
        if (this.w % 20 == 0) {
            this.a(this.x.values().iterator());
        }
        if (!this.ae.isEmpty() && !this.N.h() && this.l.isEmpty()) {
            Iterator iterator = this.ae.iterator();
            while (iterator.hasNext()) {
                cmz cmz2 = (cmz)iterator.next();
                iterator.remove();
                int n2 = cmz2.a();
                int n3 = cmz2.b();
                int n4 = cmz2.c();
                this.a(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1, false);
            }
        }
    }

    private void q() {
        cja.o();
        cja.c();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        bjr.a();
        cja.a(false);
        this.i.a(f);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        for (int i2 = 0; i2 < 6; ++i2) {
            cja.D();
            if (i2 == 1) {
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i2 == 2) {
                cja.b(-90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i2 == 3) {
                cja.b(180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i2 == 4) {
                cja.b(90.0f, 0.0f, 0.0f, 1.0f);
            }
            if (i2 == 5) {
                cja.b(-90.0f, 0.0f, 0.0f, 1.0f);
            }
            bix2.a(7, bxb.i);
            bix2.b(-100.0, -100.0, -100.0).a(0.0, 0.0).b(40, 40, 40, 255).d();
            bix2.b(-100.0, -100.0, 100.0).a(0.0, 16.0).b(40, 40, 40, 255).d();
            bix2.b(100.0, -100.0, 100.0).a(16.0, 16.0).b(40, 40, 40, 255).d();
            bix2.b(100.0, -100.0, -100.0).a(16.0, 0.0).b(40, 40, 40, 255).d();
            bha2.b();
            cja.E();
        }
        cja.a(true);
        cja.v();
        cja.d();
    }

    public void a(float f2, int n2) {
        float f3;
        float f4;
        int n3;
        int n4;
        float f5;
        float f6;
        float f7;
        if (this.h.f.q.a().a() == 1) {
            this.q();
            return;
        }
        if (!this.h.f.q.e()) {
            return;
        }
        cja.w();
        amj amj2 = this.k.a(this.h.ab(), f2);
        float f8 = (float)amj2.b;
        float f9 = (float)amj2.c;
        float f10 = (float)amj2.d;
        if (n2 != 2) {
            float f11 = (f8 * 30.0f + f9 * 59.0f + f10 * 11.0f) / 100.0f;
            float f12 = (f8 * 30.0f + f9 * 70.0f) / 100.0f;
            float f13 = (f8 * 30.0f + f10 * 70.0f) / 100.0f;
            f8 = f11;
            f9 = f12;
            f10 = f13;
        }
        cja.d(f8, f9, f10);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.a(false);
        cja.n();
        cja.d(f8, f9, f10);
        if (this.Y) {
            this.u.a();
            cja.n(32884);
            cja.d(3, 5126, 12, 0);
            this.u.a(7);
            this.u.b();
            cja.m(32884);
        } else {
            cja.p(this.q);
        }
        cja.o();
        cja.c();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        bjr.a();
        float[] arrf = this.k.q.a(this.k.c(f2), f2);
        if (arrf != null) {
            cja.w();
            cja.j(7425);
            cja.D();
            cja.b(90.0f, 1.0f, 0.0f, 0.0f);
            cja.b(cmk.a(this.k.d(f2)) < 0.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
            cja.b(90.0f, 0.0f, 0.0f, 1.0f);
            f7 = arrf[0];
            f6 = arrf[1];
            float f14 = arrf[2];
            if (n2 != 2) {
                float f15 = (f7 * 30.0f + f6 * 59.0f + f14 * 11.0f) / 100.0f;
                float f16 = (f7 * 30.0f + f6 * 70.0f) / 100.0f;
                f5 = (f7 * 30.0f + f14 * 70.0f) / 100.0f;
                f7 = f15;
                f6 = f16;
                f14 = f5;
            }
            bix2.a(6, bxb.f);
            bix2.b(0.0, 100.0, 0.0).a(f7, f6, f14, arrf[3]).d();
            n4 = 16;
            for (n3 = 0; n3 <= 16; ++n3) {
                f5 = (float)n3 * ((float)Math.PI * 2) / 16.0f;
                f4 = cmk.a(f5);
                f3 = cmk.b(f5);
                bix2.b((double)(f4 * 120.0f), (double)(f3 * 120.0f), (double)(-f3 * 40.0f * arrf[3])).a(arrf[0], arrf[1], arrf[2], 0.0f).d();
            }
            bha2.b();
            cja.E();
            cja.j(7424);
        }
        cja.v();
        cja.a(bjt.l, afi.e, bjt.e, afi.n);
        cja.D();
        f7 = 1.0f - this.k.j(f2);
        cja.c(1.0f, 1.0f, 1.0f, f7);
        cja.b(-90.0f, 0.0f, 1.0f, 0.0f);
        cja.b(this.k.c(f2) * 360.0f, 1.0f, 0.0f, 0.0f);
        f6 = 30.0f;
        this.i.a(d);
        bix2.a(7, bxb.g);
        bix2.b((double)(-f6), 100.0, (double)(-f6)).a(0.0, 0.0).d();
        bix2.b((double)f6, 100.0, (double)(-f6)).a(1.0, 0.0).d();
        bix2.b((double)f6, 100.0, (double)f6).a(1.0, 1.0).d();
        bix2.b((double)(-f6), 100.0, (double)f6).a(0.0, 1.0).d();
        bha2.b();
        f6 = 20.0f;
        this.i.a(c);
        int n5 = this.k.i();
        n4 = n5 % 4;
        n3 = n5 / 4 % 2;
        f5 = (float)(n4 + 0) / 4.0f;
        f4 = (float)(n3 + 0) / 2.0f;
        f3 = (float)(n4 + 1) / 4.0f;
        float f17 = (float)(n3 + 1) / 2.0f;
        bix2.a(7, bxb.g);
        bix2.b((double)(-f6), -100.0, (double)f6).a(f3, f17).d();
        bix2.b((double)f6, -100.0, (double)f6).a(f5, f17).d();
        bix2.b((double)f6, -100.0, (double)(-f6)).a(f5, f4).d();
        bix2.b((double)(-f6), -100.0, (double)(-f6)).a(f3, f4).d();
        bha2.b();
        cja.w();
        float f18 = this.k.g(f2) * f7;
        if (f18 > 0.0f) {
            cja.c(f18, f18, f18, f18);
            if (this.Y) {
                this.t.a();
                cja.n(32884);
                cja.d(3, 5126, 12, 0);
                this.t.a(7);
                this.t.b();
                cja.m(32884);
            } else {
                cja.p(this.p);
            }
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
        cja.d();
        cja.n();
        cja.E();
        cja.w();
        cja.d(0.0f, 0.0f, 0.0f);
        double d2 = this.h.h.q((float)f2).c - this.k.N();
        if (d2 < 0.0) {
            cja.D();
            cja.c(0.0f, 12.0f, 0.0f);
            if (this.Y) {
                this.v.a();
                cja.n(32884);
                cja.d(3, 5126, 12, 0);
                this.v.a(7);
                this.v.b();
                cja.m(32884);
            } else {
                cja.p(this.r);
            }
            cja.E();
            float f19 = 1.0f;
            float f20 = -((float)(d2 + 65.0));
            float f21 = -1.0f;
            f5 = f20;
            bix2.a(7, bxb.f);
            bix2.b(-1.0, (double)f5, 1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, (double)f5, 1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, (double)f5, -1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, (double)f5, -1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, (double)f5, 1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, (double)f5, -1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, (double)f5, -1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, (double)f5, 1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            bix2.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            bha2.b();
        }
        if (this.k.q.h()) {
            cja.d(f8 * 0.2f + 0.04f, f9 * 0.2f + 0.04f, f10 * 0.6f + 0.1f);
        } else {
            cja.d(f8, f9, f10);
        }
        cja.D();
        cja.c(0.0f, -((float)(d2 - 16.0)), 0.0f);
        cja.p(this.r);
        cja.E();
        cja.v();
        cja.a(true);
    }

    public void b(float f2, int n2) {
        float f3;
        if (!this.h.f.q.e()) {
            return;
        }
        if (this.h.u.e() == 2) {
            this.c(f2, n2);
            return;
        }
        cja.q();
        cpk cpk2 = this.h.ab();
        float f4 = (float)(cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2);
        int n3 = 32;
        int n4 = 8;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.i.a(e);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        amj amj2 = this.k.e(f2);
        float f5 = (float)amj2.b;
        float f6 = (float)amj2.c;
        float f7 = (float)amj2.d;
        if (n2 != 2) {
            f3 = (f5 * 30.0f + f6 * 59.0f + f7 * 11.0f) / 100.0f;
            float f8 = (f5 * 30.0f + f6 * 70.0f) / 100.0f;
            float f9 = (f5 * 30.0f + f7 * 70.0f) / 100.0f;
            f5 = f3;
            f6 = f8;
            f7 = f9;
        }
        f3 = 4.8828125E-4f;
        double d2 = (float)this.w + f2;
        double d3 = cpk2.aR + (cpk2.aU - cpk2.aR) * (double)f2 + d2 * (double)0.03f;
        double d4 = cpk2.aT + (cpk2.aW - cpk2.aT) * (double)f2;
        int n5 = cmk.c(d3 / 2048.0);
        int n6 = cmk.c(d4 / 2048.0);
        float f10 = this.k.q.g() - f4 + 0.33f;
        float f11 = (float)((d3 -= (double)(n5 * 2048)) * 4.8828125E-4);
        float f12 = (float)((d4 -= (double)(n6 * 2048)) * 4.8828125E-4);
        bix2.a(7, bxb.i);
        for (int i2 = -256; i2 < 256; i2 += 32) {
            for (int i3 = -256; i3 < 256; i3 += 32) {
                bix2.b((double)(i2 + 0), (double)f10, (double)(i3 + 32)).a((float)(i2 + 0) * 4.8828125E-4f + f11, (float)(i3 + 32) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                bix2.b((double)(i2 + 32), (double)f10, (double)(i3 + 32)).a((float)(i2 + 32) * 4.8828125E-4f + f11, (float)(i3 + 32) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                bix2.b((double)(i2 + 32), (double)f10, (double)(i3 + 0)).a((float)(i2 + 32) * 4.8828125E-4f + f11, (float)(i3 + 0) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                bix2.b((double)(i2 + 0), (double)f10, (double)(i3 + 0)).a((float)(i2 + 0) * 4.8828125E-4f + f11, (float)(i3 + 0) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
            }
        }
        bha2.b();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
        cja.p();
    }

    public boolean a(double d2, double d3, double d4, float f2) {
        return false;
    }

    private void c(float f2, int n2) {
        float f3;
        float f4;
        float f5;
        cja.q();
        cpk cpk2 = this.h.ab();
        float f6 = (float)(cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f7 = 12.0f;
        float f8 = 4.0f;
        double d2 = (float)this.w + f2;
        double d3 = (cpk2.aR + (cpk2.aU - cpk2.aR) * (double)f2 + d2 * (double)0.03f) / 12.0;
        double d4 = (cpk2.aT + (cpk2.aW - cpk2.aT) * (double)f2) / 12.0 + (double)0.33f;
        float f9 = this.k.q.g() - f6 + 0.33f;
        int n3 = cmk.c(d3 / 2048.0);
        int n4 = cmk.c(d4 / 2048.0);
        d3 -= (double)(n3 * 2048);
        d4 -= (double)(n4 * 2048);
        this.i.a(e);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        amj amj2 = this.k.e(f2);
        float f10 = (float)amj2.b;
        float f11 = (float)amj2.c;
        float f12 = (float)amj2.d;
        if (n2 != 2) {
            f5 = (f10 * 30.0f + f11 * 59.0f + f12 * 11.0f) / 100.0f;
            f4 = (f10 * 30.0f + f11 * 70.0f) / 100.0f;
            f3 = (f10 * 30.0f + f12 * 70.0f) / 100.0f;
            f10 = f5;
            f11 = f4;
            f12 = f3;
        }
        f5 = f10 * 0.9f;
        f4 = f11 * 0.9f;
        f3 = f12 * 0.9f;
        float f13 = f10 * 0.7f;
        float f14 = f11 * 0.7f;
        float f15 = f12 * 0.7f;
        float f16 = f10 * 0.8f;
        float f17 = f11 * 0.8f;
        float f18 = f12 * 0.8f;
        float f19 = 0.00390625f;
        float f20 = (float)cmk.c(d3) * 0.00390625f;
        float f21 = (float)cmk.c(d4) * 0.00390625f;
        float f22 = (float)(d3 - (double)cmk.c(d3));
        float f23 = (float)(d4 - (double)cmk.c(d4));
        int n5 = 8;
        int n6 = 4;
        float f24 = 9.765625E-4f;
        cja.b(12.0f, 1.0f, 12.0f);
        for (int i2 = 0; i2 < 2; ++i2) {
            if (i2 == 0) {
                cja.a(false, false, false, false);
            } else {
                switch (n2) {
                    case 0: {
                        cja.a(false, true, true, true);
                        break;
                    }
                    case 1: {
                        cja.a(true, false, false, true);
                        break;
                    }
                    case 2: {
                        cja.a(true, true, true, true);
                    }
                }
            }
            for (int i3 = -3; i3 <= 4; ++i3) {
                for (int i4 = -3; i4 <= 4; ++i4) {
                    int n7;
                    bix2.a(7, bxb.l);
                    float f25 = i3 * 8;
                    float f26 = i4 * 8;
                    float f27 = f25 - f22;
                    float f28 = f26 - f23;
                    if (f9 > -5.0f) {
                        bix2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        bix2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        bix2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        bix2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                    }
                    if (f9 <= 5.0f) {
                        bix2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 8.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        bix2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 8.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        bix2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        bix2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                    }
                    if (i3 > -1) {
                        for (n7 = 0; n7 < 8; ++n7) {
                            bix2.b((double)(f27 + (float)n7 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            bix2.b((double)(f27 + (float)n7 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + 8.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            bix2.b((double)(f27 + (float)n7 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + 0.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            bix2.b((double)(f27 + (float)n7 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                        }
                    }
                    if (i3 <= 1) {
                        for (n7 = 0; n7 < 8; ++n7) {
                            bix2.b((double)(f27 + (float)n7 + 1.0f - 9.765625E-4f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            bix2.b((double)(f27 + (float)n7 + 1.0f - 9.765625E-4f), (double)(f9 + 4.0f), (double)(f28 + 8.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            bix2.b((double)(f27 + (float)n7 + 1.0f - 9.765625E-4f), (double)(f9 + 4.0f), (double)(f28 + 0.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            bix2.b((double)(f27 + (float)n7 + 1.0f - 9.765625E-4f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + (float)n7 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                        }
                    }
                    if (i4 > -1) {
                        for (n7 = 0; n7 < 8; ++n7) {
                            bix2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n7 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            bix2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n7 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            bix2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n7 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            bix2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n7 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                        }
                    }
                    if (i4 <= 1) {
                        for (n7 = 0; n7 < 8; ++n7) {
                            bix2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n7 + 1.0f - 9.765625E-4f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            bix2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n7 + 1.0f - 9.765625E-4f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            bix2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n7 + 1.0f - 9.765625E-4f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            bix2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n7 + 1.0f - 9.765625E-4f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n7 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                        }
                    }
                    bha2.b();
                }
            }
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
        cja.p();
    }

    public void a(long l2) {
        this.ac |= this.N.a(l2);
        if (!this.l.isEmpty()) {
            adr adr2;
            boolean bl2;
            Iterator iterator = this.l.iterator();
            while (iterator.hasNext() && (bl2 = (adr2 = (adr)iterator.next()).m() ? this.N.b(adr2) : this.N.a(adr2))) {
                adr2.k();
                iterator.remove();
                long l3 = l2 - System.nanoTime();
                if (l3 >= 0L) continue;
                break;
            }
        }
    }

    public void a(cpk cpk2, float f2) {
        float f3;
        double d2;
        double d3;
        float f4;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        ajw ajw2 = this.k.U();
        double d4 = this.h.u.d * 16;
        if (cpk2.aU < ajw2.d() - d4 && cpk2.aU > ajw2.b() + d4 && cpk2.aW < ajw2.e() - d4 && cpk2.aW > ajw2.c() + d4) {
            return;
        }
        double d5 = 1.0 - ajw2.a(cpk2) / d4;
        d5 = Math.pow(d5, 4.0);
        double d6 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        double d7 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        double d8 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        cja.l();
        cja.a(bjt.l, afi.e, bjt.e, afi.n);
        this.i.a(g);
        cja.a(false);
        cja.D();
        int n2 = ajw2.a().a();
        float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n2 & 0xFF) / 255.0f;
        cja.c(f5, f6, f7, (float)d5);
        cja.a(-3.0f, -3.0f);
        cja.r();
        cja.a(516, 0.1f);
        cja.d();
        cja.q();
        float f8 = (float)(bxy.K() % 3000L) / 3000.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 128.0f;
        bix2.a(7, bxb.g);
        bix2.c(-d6, -d7, -d8);
        double d9 = Math.max((double)cmk.c(d8 - d4), ajw2.c());
        double d10 = Math.min((double)cmk.f(d8 + d4), ajw2.e());
        if (d6 > ajw2.d() - d4) {
            f4 = 0.0f;
            d3 = d9;
            while (d3 < d10) {
                d2 = Math.min(1.0, d10 - d3);
                f3 = (float)d2 * 0.5f;
                bix2.b(ajw2.d(), 256.0, d3).a(f8 + f4, f8 + 0.0f).d();
                bix2.b(ajw2.d(), 256.0, d3 + d2).a(f8 + f3 + f4, f8 + 0.0f).d();
                bix2.b(ajw2.d(), 0.0, d3 + d2).a(f8 + f3 + f4, f8 + 128.0f).d();
                bix2.b(ajw2.d(), 0.0, d3).a(f8 + f4, f8 + 128.0f).d();
                d3 += 1.0;
                f4 += 0.5f;
            }
        }
        if (d6 < ajw2.b() + d4) {
            f4 = 0.0f;
            d3 = d9;
            while (d3 < d10) {
                d2 = Math.min(1.0, d10 - d3);
                f3 = (float)d2 * 0.5f;
                bix2.b(ajw2.b(), 256.0, d3).a(f8 + f4, f8 + 0.0f).d();
                bix2.b(ajw2.b(), 256.0, d3 + d2).a(f8 + f3 + f4, f8 + 0.0f).d();
                bix2.b(ajw2.b(), 0.0, d3 + d2).a(f8 + f3 + f4, f8 + 128.0f).d();
                bix2.b(ajw2.b(), 0.0, d3).a(f8 + f4, f8 + 128.0f).d();
                d3 += 1.0;
                f4 += 0.5f;
            }
        }
        d9 = Math.max((double)cmk.c(d6 - d4), ajw2.b());
        d10 = Math.min((double)cmk.f(d6 + d4), ajw2.d());
        if (d8 > ajw2.e() - d4) {
            f4 = 0.0f;
            d3 = d9;
            while (d3 < d10) {
                d2 = Math.min(1.0, d10 - d3);
                f3 = (float)d2 * 0.5f;
                bix2.b(d3, 256.0, ajw2.e()).a(f8 + f4, f8 + 0.0f).d();
                bix2.b(d3 + d2, 256.0, ajw2.e()).a(f8 + f3 + f4, f8 + 0.0f).d();
                bix2.b(d3 + d2, 0.0, ajw2.e()).a(f8 + f3 + f4, f8 + 128.0f).d();
                bix2.b(d3, 0.0, ajw2.e()).a(f8 + f4, f8 + 128.0f).d();
                d3 += 1.0;
                f4 += 0.5f;
            }
        }
        if (d8 < ajw2.c() + d4) {
            f4 = 0.0f;
            d3 = d9;
            while (d3 < d10) {
                d2 = Math.min(1.0, d10 - d3);
                f3 = (float)d2 * 0.5f;
                bix2.b(d3, 256.0, ajw2.c()).a(f8 + f4, f8 + 0.0f).d();
                bix2.b(d3 + d2, 256.0, ajw2.c()).a(f8 + f3 + f4, f8 + 0.0f).d();
                bix2.b(d3 + d2, 0.0, ajw2.c()).a(f8 + f3 + f4, f8 + 128.0f).d();
                bix2.b(d3, 0.0, ajw2.c()).a(f8 + f4, f8 + 128.0f).d();
                d3 += 1.0;
                f4 += 0.5f;
            }
        }
        bha2.b();
        bix2.c(0.0, 0.0, 0.0);
        cja.p();
        cja.c();
        cja.a(0.0f, 0.0f);
        cja.s();
        cja.d();
        cja.k();
        cja.E();
        cja.a(true);
    }

    private void r() {
        cja.a(bjt.d, afi.m, bjt.e, afi.n);
        cja.l();
        cja.c(1.0f, 1.0f, 1.0f, 0.5f);
        cja.a(-3.0f, -3.0f);
        cja.r();
        cja.a(516, 0.1f);
        cja.d();
        cja.D();
    }

    private void s() {
        cja.c();
        cja.a(0.0f, 0.0f);
        cja.s();
        cja.d();
        cja.a(true);
        cja.E();
    }

    public void a(bha bha2, bix bix2, cpk cpk2, float f2) {
        double d2 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        double d3 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        double d4 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        if (!this.x.isEmpty()) {
            this.i.a(dam.g);
            this.r();
            bix2.a(7, bxb.a);
            bix2.c(-d2, -d3, -d4);
            bix2.c();
            Iterator iterator = this.x.values().iterator();
            while (iterator.hasNext()) {
                jt jt2 = (jt)iterator.next();
                cmz cmz2 = jt2.a();
                double d5 = (double)cmz2.a() - d2;
                double d6 = (double)cmz2.b() - d3;
                double d7 = (double)cmz2.c() - d4;
                bfa bfa2 = this.k.n(cmz2).t();
                if (bfa2 instanceof aqi || bfa2 instanceof avw || bfa2 instanceof bsu || bfa2 instanceof cvc) continue;
                if (d5 * d5 + d6 * d6 + d7 * d7 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                dbk dbk2 = this.k.n(cmz2);
                if (dbk2.a() == ahk.a) continue;
                int n2 = jt2.b();
                ars ars2 = this.z[n2];
                dfp dfp2 = this.h.ac();
                dfp2.a(dbk2, cmz2, ars2, this.k);
            }
            bha2.b();
            bix2.c(0.0, 0.0, 0.0);
            this.s();
        }
    }

    public void a(bdl bdl2, auu auu2, int n2, float f2) {
        if (n2 == 0 && auu2.a == bmw.b) {
            cja.l();
            cja.a(bjt.l, afi.j, bjt.e, afi.n);
            cja.d(2.0f);
            cja.w();
            cja.a(false);
            cmz cmz2 = auu2.a();
            dbk dbk2 = this.k.n(cmz2);
            if (dbk2.a() != ahk.a && this.k.U().a(cmz2)) {
                double d2 = bdl2.br + (bdl2.aU - bdl2.br) * (double)f2;
                double d3 = bdl2.bs + (bdl2.aV - bdl2.bs) * (double)f2;
                double d4 = bdl2.bt + (bdl2.aW - bdl2.bt) * (double)f2;
                fr.a(dbk2.c(this.k, cmz2).b(0.002f).c(-d2, -d3, -d4), 0.0f, 0.0f, 0.0f, 0.4f);
            }
            cja.a(true);
            cja.v();
            cja.k();
        }
    }

    public static void a(cxt cxt2, float f2, float f3, float f4, float f5) {
        fr.a(cxt2.a, cxt2.b, cxt2.c, cxt2.d, cxt2.e, cxt2.f, f2, f3, f4, f5);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(3, bxb.f);
        fr.a(bix2, d2, d3, d4, d5, d6, d7, f2, f3, f4, f5);
        bha2.b();
    }

    public static void a(bix bix2, double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        bix2.b(d2, d3, d4).a(f2, f3, f4, 0.0f).d();
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d7).a(f2, f3, f4, 0.0f).d();
        bix2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, 0.0f).d();
        bix2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d4).a(f2, f3, f4, 0.0f).d();
        bix2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d4).a(f2, f3, f4, 0.0f).d();
    }

    public static void b(cxt cxt2, float f2, float f3, float f4, float f5) {
        fr.b(cxt2.a, cxt2.b, cxt2.c, cxt2.d, cxt2.e, cxt2.f, f2, f3, f4, f5);
    }

    public static void b(double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(5, bxb.f);
        fr.b(bix2, d2, d3, d4, d5, d6, d7, f2, f3, f4, f5);
        bha2.b();
    }

    public static void b(bix bix2, double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        bix2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        this.o.a(n2, n3, n4, n5, n6, n7, bl2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, dbk dbk3, int n2) {
        int n3 = cmz2.a();
        int n4 = cmz2.b();
        int n5 = cmz2.c();
        this.a(n3 - 1, n4 - 1, n5 - 1, n3 + 1, n4 + 1, n5 + 1, (n2 & 8) != 0);
    }

    @Override
    public void a(cmz cmz2) {
        this.ae.add(cmz2.d());
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a(n2 - 1, n3 - 1, n4 - 1, n5 + 1, n6 + 1, n7 + 1, false);
    }

    @Override
    public void a(bi bi2, cmz cmz2) {
        dci dci2 = (dci)this.y.get(cmz2);
        if (dci2 != null) {
            this.h.W().b(dci2);
            this.y.remove(cmz2);
        }
        if (bi2 != null) {
            anz anz2 = anz.a(bi2);
            if (anz2 != null) {
                this.h.r.a(anz2.f());
            }
            dci2 = ol.a(bi2, cmz2.a(), cmz2.b(), cmz2.c());
            this.y.put(cmz2, dci2);
            this.h.W().a(dci2);
        }
    }

    @Override
    public void a(bdl bdl2, bi bi2, csg csg2, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        try {
            this.b(n2, bl2, d2, d3, d4, d5, d6, d7, arrn);
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Exception while adding particle");
            sx sx2 = cet2.a("Particle being added");
            sx2.a("ID", n2);
            if (arrn != null) {
                sx2.a("Parameters", arrn);
            }
            sx2.a("Position", new ane(this, d2, d3, d4));
            throw new oz(cet2);
        }
    }

    private void a(lz lz2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        this.a(lz2.c(), lz2.e(), d2, d3, d4, d5, d6, d7, arrn);
    }

    private qa b(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        cpk cpk2 = this.h.ab();
        if (this.h == null || cpk2 == null || this.h.j == null) {
            return null;
        }
        int n3 = this.h.u.aD;
        if (n3 == 1 && this.k.p.nextInt(3) == 0) {
            n3 = 2;
        }
        double d8 = cpk2.aU - d2;
        double d9 = cpk2.aV - d3;
        double d10 = cpk2.aW - d4;
        if (bl2) {
            return this.h.j.a(n2, d2, d3, d4, d5, d6, d7, arrn);
        }
        if (d8 * d8 + d9 * d9 + d10 * d10 > 1024.0) {
            return null;
        }
        if (n3 > 1) {
            return null;
        }
        return this.h.j.a(n2, d2, d3, d4, d5, d6, d7, arrn);
    }

    @Override
    public void a(cpk cpk2) {
    }

    @Override
    public void b(cpk cpk2) {
    }

    public void j() {
    }

    @Override
    public void a(int n2, cmz cmz2, int n3) {
        switch (n2) {
            case 1023: 
            case 1028: {
                cpk cpk2 = this.h.ab();
                if (cpk2 == null) break;
                double d2 = (double)cmz2.a() - cpk2.aU;
                double d3 = (double)cmz2.b() - cpk2.aV;
                double d4 = (double)cmz2.c() - cpk2.aW;
                double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                double d6 = cpk2.aU;
                double d7 = cpk2.aV;
                double d8 = cpk2.aW;
                if (d5 > 0.0) {
                    d6 += d2 / d5 * 2.0;
                    d7 += d3 / d5 * 2.0;
                    d8 += d4 / d5 * 2.0;
                }
                if (n2 == 1023) {
                    this.k.a(d6, d7, d8, dah.gZ, csg.f, 1.0f, 1.0f, false);
                    break;
                }
                this.k.a(d6, d7, d8, dah.aP, csg.f, 5.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(bdl bdl2, int n2, cmz cmz2, int n3) {
        Random random = this.k.p;
        switch (n2) {
            case 1035: {
                this.k.a(cmz2, dah.K, csg.e, 1.0f, 1.0f, false);
                break;
            }
            case 1033: {
                this.k.a(cmz2, dah.ae, csg.e, 1.0f, 1.0f, false);
                break;
            }
            case 1034: {
                this.k.a(cmz2, dah.ad, csg.e, 1.0f, 1.0f, false);
                break;
            }
            case 1032: {
                this.h.W().a(ol.a(dah.ey, random.nextFloat() * 0.4f + 0.8f));
                break;
            }
            case 1001: {
                this.k.a(cmz2, dah.av, csg.e, 1.0f, 1.2f, false);
                break;
            }
            case 1000: {
                this.k.a(cmz2, dah.au, csg.e, 1.0f, 1.0f, false);
                break;
            }
            case 1003: {
                this.k.a(cmz2, dah.aV, csg.g, 1.0f, 1.2f, false);
                break;
            }
            case 1004: {
                this.k.a(cmz2, dah.bt, csg.g, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.k.a(cmz2, dah.aw, csg.e, 1.0f, 1.2f, false);
                break;
            }
            case 2000: {
                int n4 = n3 % 3 - 1;
                int n5 = n3 / 3 % 3 - 1;
                double d2 = (double)cmz2.a() + (double)n4 * 0.6 + 0.5;
                double d3 = (double)cmz2.b() + 0.5;
                double d4 = (double)cmz2.c() + (double)n5 * 0.6 + 0.5;
                for (int i2 = 0; i2 < 10; ++i2) {
                    double d5 = random.nextDouble() * 0.2 + 0.01;
                    double d6 = d2 + (double)n4 * 0.01 + (random.nextDouble() - 0.5) * (double)n5 * 0.5;
                    double d7 = d3 + (random.nextDouble() - 0.5) * 0.5;
                    double d8 = d4 + (double)n5 * 0.01 + (random.nextDouble() - 0.5) * (double)n4 * 0.5;
                    double d9 = (double)n4 * d5 + random.nextGaussian() * 0.01;
                    double d10 = -0.03 + random.nextGaussian() * 0.01;
                    double d11 = (double)n5 * d5 + random.nextGaussian() * 0.01;
                    this.a(lz.l, d6, d7, d8, d9, d10, d11, new int[0]);
                }
                break;
            }
            case 2003: {
                double d12 = (double)cmz2.a() + 0.5;
                double d13 = cmz2.b();
                double d14 = (double)cmz2.c() + 0.5;
                for (int i3 = 0; i3 < 8; ++i3) {
                    this.a(lz.K, d12, d13, d14, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, azg.a(hp.bR));
                }
                for (double d15 = 0.0; d15 < Math.PI * 2; d15 += 0.15707963267948966) {
                    this.a(lz.y, d12 + Math.cos(d15) * 5.0, d13 - 0.4, d14 + Math.sin(d15) * 5.0, Math.cos(d15) * -5.0, 0.0, Math.sin(d15) * -5.0, new int[0]);
                    this.a(lz.y, d12 + Math.cos(d15) * 5.0, d13 - 0.4, d14 + Math.sin(d15) * 5.0, Math.cos(d15) * -7.0, 0.0, Math.sin(d15) * -7.0, new int[0]);
                }
                break;
            }
            case 2002: {
                double d16 = cmz2.a();
                double d17 = cmz2.b();
                double d18 = cmz2.c();
                for (int i4 = 0; i4 < 8; ++i4) {
                    this.a(lz.K, d16, d17, d18, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, azg.a(hp.bH));
                }
                hy hy2 = hy.a(n3);
                int n6 = anl.a(hy2);
                float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n6 >> 0 & 0xFF) / 255.0f;
                lz lz2 = hy2.c() ? lz.o : lz.n;
                for (int i5 = 0; i5 < 100; ++i5) {
                    double d19 = random.nextDouble() * 4.0;
                    double d20 = random.nextDouble() * Math.PI * 2.0;
                    double d21 = Math.cos(d20) * d19;
                    double d22 = 0.01 + random.nextDouble() * 0.5;
                    double d23 = Math.sin(d20) * d19;
                    qa qa2 = this.b(lz2.c(), lz2.e(), d16 + d21 * 0.1, d17 + 0.3, d18 + d23 * 0.1, d21, d22, d23, new int[0]);
                    if (qa2 == null) continue;
                    float f5 = 0.75f + random.nextFloat() * 0.25f;
                    qa2.a(f2 * f5, f3 * f5, f4 * f5);
                    qa2.b((float)d19);
                }
                this.k.a(cmz2, dah.gg, csg.g, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2001: {
                bfa bfa2 = bfa.f(n3 & 0xFFF);
                if (bfa2.s().a() != ahk.a) {
                    acv acv2 = bfa2.t();
                    this.k.a(cmz2, acv2.c(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f, false);
                }
                this.h.j.a(cmz2, bfa2.a(n3 >> 12 & 0xFF));
                break;
            }
            case 2004: {
                for (int i6 = 0; i6 < 20; ++i6) {
                    double d24 = (double)cmz2.a() + 0.5 + ((double)this.k.p.nextFloat() - 0.5) * 2.0;
                    double d25 = (double)cmz2.b() + 0.5 + ((double)this.k.p.nextFloat() - 0.5) * 2.0;
                    double d26 = (double)cmz2.c() + 0.5 + ((double)this.k.p.nextFloat() - 0.5) * 2.0;
                    this.k.a(lz.l, d24, d25, d26, 0.0, 0.0, 0.0, new int[0]);
                    this.k.a(lz.A, d24, d25, d26, 0.0, 0.0, 0.0, new int[0]);
                }
                break;
            }
            case 2005: {
                hr.a(this.k, cmz2, n3);
                break;
            }
            case 2006: {
                for (int i7 = 0; i7 < 200; ++i7) {
                    float f6 = random.nextFloat() * 4.0f;
                    float f7 = random.nextFloat() * ((float)Math.PI * 2);
                    double d27 = cmk.b(f7) * f6;
                    double d28 = 0.01 + random.nextDouble() * 0.5;
                    double d29 = cmk.a(f7) * f6;
                    qa qa3 = this.b(lz.Q.c(), false, (double)cmz2.a() + d27 * 0.1, (double)cmz2.b() + 0.3, (double)cmz2.c() + d29 * 0.1, d27, d28, d29, new int[0]);
                    if (qa3 == null) continue;
                    qa3.b(f6);
                }
                this.k.a(cmz2, dah.aQ, csg.f, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1012: {
                this.k.a(cmz2, dah.hn, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1036: {
                this.k.a(cmz2, dah.cS, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1013: {
                this.k.a(cmz2, dah.hp, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1014: {
                this.k.a(cmz2, dah.bl, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1011: {
                this.k.a(cmz2, dah.cQ, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1006: {
                this.k.a(cmz2, dah.ho, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                this.k.a(cmz2, dah.hq, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1037: {
                this.k.a(cmz2, dah.cT, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1008: {
                this.k.a(cmz2, dah.bm, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1005: {
                this.k.a(cmz2, dah.cR, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1009: {
                this.k.a(cmz2, dah.bx, csg.e, 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1029: {
                this.k.a(cmz2, dah.c, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1030: {
                this.k.a(cmz2, dah.i, csg.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1031: {
                this.k.a(cmz2, dah.f, csg.e, 0.3f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1010: {
                if (azg.c(n3) instanceof anz) {
                    this.k.a(cmz2, ((anz)azg.c(n3)).g());
                    break;
                }
                this.k.a(cmz2, (bi)null);
                break;
            }
            case 1015: {
                this.k.a(cmz2, dah.bQ, csg.f, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.k.a(cmz2, dah.aU, csg.f, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.k.a(cmz2, dah.bP, csg.f, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1019: {
                this.k.a(cmz2, dah.hB, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1022: {
                this.k.a(cmz2, dah.gV, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1021: {
                this.k.a(cmz2, dah.hD, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.k.a(cmz2, dah.hC, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1018: {
                this.k.a(cmz2, dah.F, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1024: {
                this.k.a(cmz2, dah.gY, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1026: {
                this.k.a(cmz2, dah.hJ, csg.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1027: {
                this.k.a(cmz2, dah.hQ, csg.g, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1025: {
                this.k.a(cmz2, dah.A, csg.g, 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 3000: {
                this.k.a(lz.c, true, (double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, 0.0, 0.0, 0.0, new int[0]);
                this.k.a(cmz2, dah.bh, csg.e, 10.0f, (1.0f + (this.k.p.nextFloat() - this.k.p.nextFloat()) * 0.2f) * 0.7f, false);
                break;
            }
            case 3001: {
                this.k.a(cmz2, dah.aS, csg.f, 64.0f, 0.8f + this.k.p.nextFloat() * 0.3f, false);
            }
        }
    }

    @Override
    public void b(int n2, cmz cmz2, int n3) {
        if (n3 < 0 || n3 >= 10) {
            this.x.remove(n2);
        } else {
            jt jt2 = (jt)this.x.get(n2);
            if (jt2 == null || jt2.a().a() != cmz2.a() || jt2.a().b() != cmz2.b() || jt2.a().c() != cmz2.c()) {
                jt2 = new jt(n2, cmz2);
                this.x.put(n2, jt2);
            }
            jt2.a(n3);
            jt2.b(this.w);
        }
    }

    public boolean k() {
        return this.l.isEmpty() && this.N.f();
    }

    public void l() {
        this.ac = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Collection collection, Collection collection2) {
        Set set = this.n;
        synchronized (set) {
            this.n.removeAll(collection);
            this.n.addAll(collection2);
        }
    }
}

