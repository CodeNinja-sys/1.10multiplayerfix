/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

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
import net.minecraft.client.a.cb;
import net.minecraft.client.c.z;
import net.minecraft.client.f.s;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ah;
import net.minecraft.client.g.am;
import net.minecraft.client.g.an;
import net.minecraft.client.g.au;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bo;
import net.minecraft.client.g.bu;
import net.minecraft.client.g.bw;
import net.minecraft.client.g.c.d;
import net.minecraft.client.g.cg;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.cm;
import net.minecraft.client.g.d.c;
import net.minecraft.client.g.d.f;
import net.minecraft.client.g.d.g;
import net.minecraft.client.g.e.j;
import net.minecraft.client.g.e.p;
import net.minecraft.client.g.e.q;
import net.minecraft.client.g.e.u;
import net.minecraft.client.g.g.a;
import net.minecraft.client.g.g.b;
import net.minecraft.client.g.g.e;
import net.minecraft.client.g.v;
import net.minecraft.client.g.w;
import net.minecraft.client.m.h;
import net.minecraft.client.r;
import net.minecraft.d.m;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.g.cx;
import net.minecraft.g.fk;
import net.minecraft.g.fz;
import net.minecraft.g.hs;
import net.minecraft.g.ib;
import net.minecraft.k.i;
import net.minecraft.q.f.k;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.u.b.t;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.n;
import org.lwjgl.util.e.l;

public class ar
implements net.minecraft.client.f.j,
net.minecraft.q.ag {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private static final bp c = new bp("textures/environment/moon_phases.png");
    private static final bp d = new bp("textures/environment/sun.png");
    private static final bp e = new bp("textures/environment/clouds.png");
    private static final bp f = new bp("textures/environment/end_sky.png");
    private static final bp g = new bp("textures/misc/forcefield.png");
    private final r h;
    private final net.minecraft.client.g.a.c i;
    private final net.minecraft.client.g.i.f j;
    private net.minecraft.client.i.d k;
    private Set l = aad.c();
    private List m = ov.b(69696);
    private final Set n = aad.a();
    private an o;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private final f s;
    private c t;
    private c u;
    private c v;
    private int w;
    private final Map x = sz.c();
    private final Map y = sz.c();
    private final net.minecraft.client.g.a.d[] z = new net.minecraft.client.g.a.d[10];
    private net.minecraft.client.m.b A;
    private h B;
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
    private net.minecraft.client.g.e.r N;
    private bo O;
    private int P = -1;
    private int Q = 2;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private a V;
    private final org.lwjgl.util.e.m[] W = new org.lwjgl.util.e.m[8];
    private final w X = new w();
    private boolean Y;
    net.minecraft.client.g.e.d a;
    private double Z;
    private double aa;
    private double ab;
    private boolean ac = true;
    private boolean ad;
    private final Set ae = aad.a();

    public ar(r r2) {
        this.h = r2;
        this.j = r2.ab();
        this.i = r2.N();
        this.i.a(g);
        bd.b(3553, 10242, 10497);
        bd.b(3553, 10243, 10497);
        bd.i(0);
        this.n();
        this.Y = ay.f();
        if (this.Y) {
            this.O = new cg();
            this.a = new net.minecraft.client.g.e.b();
        } else {
            this.O = new au();
            this.a = new j();
        }
        this.s = new f();
        this.s.a(new net.minecraft.client.g.d.e(0, net.minecraft.client.g.d.d.a, net.minecraft.client.g.d.g.a, 3));
        this.q();
        this.p();
        this.o();
    }

    @Override
    public void a(s s2) {
        this.n();
    }

    private void n() {
        net.minecraft.client.g.a.f f2 = this.h.R();
        for (int i2 = 0; i2 < this.z.length; ++i2) {
            this.z[i2] = f2.a("minecraft:blocks/destroy_stage_" + i2);
        }
    }

    public void a() {
        if (ay.O) {
            if (net.minecraft.client.m.g.b() == null) {
                net.minecraft.client.m.g.a();
            }
            bp bp2 = new bp("shaders/post/entity_outline.json");
            try {
                this.B = new h(this.h.N(), this.h.O(), this.h.b(), bp2);
                this.B.a(this.h.e, this.h.f);
                this.A = this.B.a("final");
            }
            catch (IOException iOException) {
                b.f("Failed to load shader: {}", bp2, iOException);
                this.B = null;
                this.A = null;
            }
            catch (ag ag2) {
                b.f("Failed to load shader: {}", bp2, ag2);
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
            bd.l();
            bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.o, bc.e);
            this.A.a(this.h.e, this.h.f, false);
            bd.k();
        }
    }

    protected boolean c() {
        return this.A != null && this.B != null && this.h.j != null;
    }

    private void o() {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        if (this.v != null) {
            this.v.c();
        }
        if (this.r >= 0) {
            net.minecraft.client.g.v.b(this.r);
            this.r = -1;
        }
        if (this.Y) {
            this.v = new c(this.s);
            this.a(g2, -16.0f, true);
            g2.e();
            g2.b();
            this.v.a(g2.f());
        } else {
            this.r = net.minecraft.client.g.v.a(1);
            bd.f(this.r, 4864);
            this.a(g2, -16.0f, true);
            ci2.b();
            bd.H();
        }
    }

    private void p() {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        if (this.u != null) {
            this.u.c();
        }
        if (this.q >= 0) {
            net.minecraft.client.g.v.b(this.q);
            this.q = -1;
        }
        if (this.Y) {
            this.u = new c(this.s);
            this.a(g2, 16.0f, false);
            g2.e();
            g2.b();
            this.u.a(g2.f());
        } else {
            this.q = net.minecraft.client.g.v.a(1);
            bd.f(this.q, 4864);
            this.a(g2, 16.0f, false);
            ci2.b();
            bd.H();
        }
    }

    private void a(net.minecraft.client.g.g g2, float f2, boolean bl2) {
        int n2 = 64;
        int n3 = 6;
        g2.a(7, net.minecraft.client.g.d.b.e);
        for (int i2 = -384; i2 <= 384; i2 += 64) {
            for (int i3 = -384; i3 <= 384; i3 += 64) {
                float f3 = i2;
                float f4 = i2 + 64;
                if (bl2) {
                    f4 = i2;
                    f3 = i2 + 64;
                }
                g2.b((double)f3, (double)f2, (double)i3).d();
                g2.b((double)f4, (double)f2, (double)i3).d();
                g2.b((double)f4, (double)f2, (double)(i3 + 64)).d();
                g2.b((double)f3, (double)f2, (double)(i3 + 64)).d();
            }
        }
    }

    private void q() {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        if (this.t != null) {
            this.t.c();
        }
        if (this.p >= 0) {
            net.minecraft.client.g.v.b(this.p);
            this.p = -1;
        }
        if (this.Y) {
            this.t = new c(this.s);
            this.a(g2);
            g2.e();
            g2.b();
            this.t.a(g2.f());
        } else {
            this.p = net.minecraft.client.g.v.a(1);
            bd.D();
            bd.f(this.p, 4864);
            this.a(g2);
            ci2.b();
            bd.H();
            bd.E();
        }
    }

    private void a(net.minecraft.client.g.g g2) {
        Random random = new Random(10842L);
        g2.a(7, net.minecraft.client.g.d.b.e);
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
                double d19 = 0.0;
                double d20 = (double)((i3 & 2) - 1) * d5;
                double d21 = (double)((i3 + 1 & 2) - 1) * d5;
                double d22 = 0.0;
                double d23 = d20 * d18 - d21 * d17;
                double d24 = d21 * d18 + d20 * d17;
                double d25 = d23 * d14 + 0.0 * d15;
                double d26 = 0.0 * d14 - d23 * d15;
                double d27 = d26 * d11 - d24 * d12;
                double d28 = d24 * d11 + d26 * d12;
                g2.b(d7 + d27, d8 + d25, d9 + d28).d();
            }
        }
    }

    public void a(net.minecraft.client.i.d d2) {
        if (this.k != null) {
            this.k.b(this);
        }
        this.C = Double.MIN_VALUE;
        this.D = Double.MIN_VALUE;
        this.E = Double.MIN_VALUE;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.j.a(d2);
        this.k = d2;
        if (d2 != null) {
            d2.a(this);
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
        if (this.k != null) {
            if (this.N == null) {
                this.N = new net.minecraft.client.g.e.r();
            }
            this.ac = true;
            net.minecraft.a.p.t.a(this.h.w.j);
            net.minecraft.a.p.u.a(this.h.w.j);
            this.P = this.h.w.d;
            boolean bl2 = this.Y;
            this.Y = ay.f();
            if (bl2 && !this.Y) {
                this.O = new au();
                this.a = new j();
            } else if (!bl2 && this.Y) {
                this.O = new cg();
                this.a = new net.minecraft.client.g.e.b();
            }
            if (bl2 != this.Y) {
                this.q();
                this.p();
                this.o();
            }
            if (this.o != null) {
                this.o.a();
            }
            this.e();
            Object object = this.n;
            synchronized (object) {
                this.n.clear();
            }
            this.o = new an(this.k, this.h.w.d, this, this.a);
            if (this.k != null && (object = this.h.Z()) != null) {
                this.o.a(((n)object).aU, ((n)object).aW);
            }
            this.Q = 2;
        }
    }

    protected void e() {
        this.l.clear();
        this.N.b();
    }

    public void a(int n2, int n3) {
        if (ay.O && this.B != null) {
            this.B.a(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(n n2, net.minecraft.client.g.g.d d2, float f2) {
        if (this.Q > 0) {
            --this.Q;
        } else {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            double d3 = n2.aR + (n2.aU - n2.aR) * (double)f2;
            double d4 = n2.aS + (n2.aV - n2.aS) * (double)f2;
            double d5 = n2.aT + (n2.aW - n2.aT) * (double)f2;
            this.k.A.a("prepare");
            net.minecraft.client.g.c.d.a.a(this.k, this.h.N(), this.h.m, this.h.Z(), this.h.v, f2);
            this.j.a(this.k, this.h.m, this.h.Z(), this.h.k, this.h.w, f2);
            this.R = 0;
            this.S = 0;
            this.T = 0;
            n n3 = this.h.Z();
            double d6 = n3.br + (n3.aU - n3.br) * (double)f2;
            double d7 = n3.bs + (n3.aV - n3.bs) * (double)f2;
            double d8 = n3.bt + (n3.aW - n3.bt) * (double)f2;
            net.minecraft.client.g.c.d.b = d6;
            net.minecraft.client.g.c.d.c = d7;
            net.minecraft.client.g.c.d.d = d8;
            this.j.a(d6, d7, d8);
            this.h.q.g();
            this.k.A.c("global");
            List list = this.k.w();
            this.R = list.size();
            for (int i2 = 0; i2 < this.k.h.size(); ++i2) {
                object4 = (n)this.k.h.get(i2);
                ++this.S;
                if (!((n)object4).j(d3, d4, d5)) continue;
                this.j.a((n)object4, f2, false);
            }
            this.k.A.c("entities");
            ArrayList arrayList = ov.a();
            object4 = ov.a();
            net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
            for (Object object5 : this.m) {
                object3 = this.k.e(((bu)object5).a.j());
                object2 = ((k)object3).t()[((bu)object5).a.j().k() / 16];
                if (((AbstractCollection)object2).isEmpty()) continue;
                Iterator iterator = ((net.minecraft.u.e)object2).iterator();
                while (iterator.hasNext()) {
                    boolean bl2;
                    boolean bl3;
                    object = (n)iterator.next();
                    boolean bl4 = bl3 = this.j.a((n)object, d2, d3, d4, d5) || ((n)object).C(this.h.j);
                    if (!bl3) continue;
                    boolean bl5 = bl2 = this.h.Z() instanceof net.minecraft.w.l ? ((net.minecraft.w.l)this.h.Z()).ae() : false;
                    if (object == this.h.Z() && this.h.w.as == 0 && !bl2 || !(((n)object).aV < 0.0) && !(((n)object).aV >= 256.0) && !this.k.d(h2.b((n)object))) continue;
                    ++this.S;
                    this.j.a((n)object, f2, false);
                    if (this.a((n)object, n3, d2)) {
                        arrayList.add(object);
                    }
                    if (!this.j.b((n)object)) continue;
                    object4.add(object);
                }
            }
            h2.n();
            if (!object4.isEmpty()) {
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    Object object5;
                    object5 = (n)iterator.next();
                    this.j.a((n)object5, f2);
                }
            }
            if (this.c() && (!arrayList.isEmpty() || this.ad)) {
                this.k.A.c("entityOutlines");
                this.A.f();
                boolean bl6 = this.ad = !arrayList.isEmpty();
                if (!arrayList.isEmpty()) {
                    bd.c(519);
                    bd.o();
                    this.A.a(false);
                    am.a();
                    this.j.c(true);
                    for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                        this.j.a((n)arrayList.get(i3), f2, false);
                    }
                    this.j.c(false);
                    am.b();
                    bd.a(false);
                    this.B.a(f2);
                    bd.e();
                    bd.a(true);
                    bd.n();
                    bd.l();
                    bd.g();
                    bd.c(515);
                    bd.j();
                    bd.d();
                }
                this.h.b().a(false);
            }
            this.k.A.c("blockentities");
            am.b();
            for (bu bu2 : this.m) {
                object3 = bu2.a.h().b();
                if (object3.isEmpty()) continue;
                object = object3.iterator();
                while (object.hasNext()) {
                    object2 = (ap)object.next();
                    net.minecraft.client.g.c.d.a.a((ap)object2, f2, -1);
                }
            }
            Object object62 = this.n;
            synchronized (object62) {
                for (Iterator iterator : this.n) {
                    net.minecraft.client.g.c.d.a.a((ap)((Object)iterator), f2, -1);
                }
            }
            this.s();
            for (Object object62 : this.x.values()) {
                object3 = ((bw)object62).a();
                object2 = this.k.q((net.minecraft.u.b.b)object3);
                if (object2 instanceof net.minecraft.f.u) {
                    object = (net.minecraft.f.u)object2;
                    if (((net.minecraft.f.u)object).f != null) {
                        object3 = ((net.minecraft.u.b.b)object3).a(net.minecraft.u.ad.e);
                        object2 = this.k.q((net.minecraft.u.b.b)object3);
                    } else if (((net.minecraft.f.u)object).d != null) {
                        object3 = ((net.minecraft.u.b.b)object3).a(net.minecraft.u.ad.c);
                        object2 = this.k.q((net.minecraft.u.b.b)object3);
                    }
                }
                object = this.k.n((net.minecraft.u.b.b)object3).c();
                if (object2 == null || !(object instanceof ib) && !(object instanceof fz) && !(object instanceof cx) && !(object instanceof hs)) continue;
                net.minecraft.client.g.c.d.a.a((ap)object2, f2, ((bw)object62).b());
            }
            this.t();
            this.h.q.f();
            this.h.D.b();
        }
    }

    private boolean a(n n2, n n3, net.minecraft.client.g.g.d d2) {
        boolean bl2;
        boolean bl3 = bl2 = n3 instanceof net.minecraft.w.l && ((net.minecraft.w.l)n3).ae();
        return n2 == n3 && this.h.w.as == 0 && !bl2 ? false : (n2.cC() ? true : (this.h.j.a() && this.h.w.am.e() && n2 instanceof net.minecraft.w.a.b ? n2.bN || d2.a(n2.cT()) || n2.C(this.h.j) : false));
    }

    public String f() {
        int n2 = this.o.f.length;
        int n3 = this.g();
        return String.format("C: %d/%d %sD: %d, L: %d, %s", n3, n2, this.h.G ? "(s) " : "", this.P, this.ae.size(), this.N == null ? "null" : this.N.a());
    }

    protected int g() {
        int n2 = 0;
        for (bu bu2 : this.m) {
            u u2 = bu2.a.b;
            if (u2 == net.minecraft.client.g.e.u.a || u2.a()) continue;
            ++n2;
        }
        return n2;
    }

    public String h() {
        return "E: " + this.S + "/" + this.R + ", B: " + this.T;
    }

    public void a(n n2, double d2, net.minecraft.client.g.g.d object, int n3, boolean bl2) {
        Object object2;
        Object object3;
        Collection<bu> collection;
        Object object4;
        if (this.h.w.d != this.P) {
            this.d();
        }
        this.k.A.a("camera");
        double d3 = n2.aU - this.C;
        double d4 = n2.aV - this.D;
        double d5 = n2.aW - this.E;
        if (this.F != n2.bH || this.G != n2.bI || this.H != n2.bJ || d3 * d3 + d4 * d4 + d5 * d5 > 16.0) {
            this.C = n2.aU;
            this.D = n2.aV;
            this.E = n2.aW;
            this.F = n2.bH;
            this.G = n2.bI;
            this.H = n2.bJ;
            this.o.a(n2.aU, n2.aW);
        }
        this.k.A.c("renderlistcamera");
        double d6 = n2.br + (n2.aU - n2.br) * d2;
        double d7 = n2.bs + (n2.aV - n2.bs) * d2;
        double d8 = n2.bt + (n2.aW - n2.bt) * d2;
        this.O.a(d6, d7, d8);
        this.k.A.c("cull");
        if (this.V != null) {
            object4 = new e(this.V);
            ((e)object4).a(this.X.a, this.X.b, this.X.c);
            object = object4;
        }
        this.h.D.c("culling");
        object4 = new net.minecraft.u.b.b(d6, d7 + (double)n2.ce_(), d8);
        q q2 = this.o.a((net.minecraft.u.b.b)object4);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(net.minecraft.u.b.n.c(d6 / 16.0) * 16, net.minecraft.u.b.n.c(d7 / 16.0) * 16, net.minecraft.u.b.n.c(d8 / 16.0) * 16);
        this.ac = this.ac || !this.l.isEmpty() || n2.aU != this.I || n2.aV != this.J || n2.aW != this.K || (double)n2.bb != this.L || (double)n2.ba != this.M;
        this.I = n2.aU;
        this.J = n2.aV;
        this.K = n2.aW;
        this.L = n2.bb;
        this.M = n2.ba;
        boolean bl3 = this.V != null;
        this.h.D.c("update");
        if (!bl3 && this.ac) {
            int n4;
            this.ac = false;
            this.m = ov.a();
            collection = yk.a();
            net.minecraft.w.n.b(net.minecraft.u.b.n.a((double)this.h.w.d / 8.0, 1.0, 2.5));
            boolean bl4 = this.h.G;
            if (q2 != null) {
                n4 = 0;
                object3 = new bu(this, q2, null, 0, null);
                object2 = this.b((net.minecraft.u.b.b)object4);
                if (object2.size() == 1) {
                    l object52 = this.a(n2, d2);
                    net.minecraft.u.ad ad2 = net.minecraft.u.ad.a(object52.a, object52.b, object52.c).e();
                    object2.remove(ad2);
                }
                if (object2.isEmpty()) {
                    n4 = 1;
                }
                if (n4 != 0 && !bl2) {
                    this.m.add(object3);
                } else {
                    if (bl2 && this.k.n((net.minecraft.u.b.b)object4).s()) {
                        bl4 = false;
                    }
                    q2.a(n3);
                    collection.add((bu)object3);
                }
            } else {
                n4 = ((t)object4).k() > 0 ? 248 : 8;
                for (int i2 = -this.P; i2 <= this.P; ++i2) {
                    for (int i3 = -this.P; i3 <= this.P; ++i3) {
                        q bl5 = this.o.a(new net.minecraft.u.b.b((i2 << 4) + 8, n4, (i3 << 4) + 8));
                        if (bl5 == null || !object.a(bl5.c)) continue;
                        bl5.a(n3);
                        collection.add(new bu(this, bl5, null, 0, null));
                    }
                }
            }
            this.h.D.a("iteration");
            while (!collection.isEmpty()) {
                bu bu2 = (bu)collection.poll();
                object3 = bu2.a;
                object2 = bu2.b;
                this.m.add(bu2);
                for (net.minecraft.u.ad ad3 : net.minecraft.u.ad.values()) {
                    q q3 = this.a(b2, (q)object3, ad3);
                    if (bl4 && bu2.a(ad3.e()) || bl4 && object2 != null && !((q)object3).h().a(((net.minecraft.u.ad)object2).e(), ad3) || q3 == null || !q3.a(n3) || !object.a(q3.c)) continue;
                    bu bu3 = new bu(this, q3, ad3, bu2.d + 1, null);
                    bu3.a(bu2.c, ad3);
                    collection.add(bu3);
                }
            }
            this.h.D.b();
        }
        this.h.D.c("captureFrustum");
        if (this.U) {
            this.a(d6, d7, d8);
            this.U = false;
        }
        this.h.D.c("rebuildNear");
        collection = this.l;
        this.l = aad.c();
        for (bu bu4 : this.m) {
            boolean bl4;
            object3 = bu4.a;
            if (!((q)object3).l() && !collection.contains(object3)) continue;
            this.ac = true;
            object2 = ((q)object3).j().a(8, 8, 8);
            boolean bl5 = bl4 = ((t)object2).i((t)object4) < 768.0;
            if (!((q)object3).m() && !bl4) {
                this.l.add(object3);
                continue;
            }
            this.h.D.a("build near");
            this.N.b((q)object3);
            ((q)object3).k();
            this.h.D.b();
        }
        this.l.addAll(collection);
        this.h.D.b();
    }

    private Set b(net.minecraft.u.b.b b2) {
        p p2 = new p();
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(b2.cy_() >> 4 << 4, b2.k() >> 4 << 4, b2.l() >> 4 << 4);
        k k2 = this.k.e(b3);
        for (net.minecraft.u.b.g g2 : net.minecraft.u.b.b.b(b3, b3.a(15, 15, 15))) {
            if (!k2.a(g2).s()) continue;
            p2.a(g2);
        }
        return p2.b(b2);
    }

    private q a(net.minecraft.u.b.b b2, q q2, net.minecraft.u.ad ad2) {
        net.minecraft.u.b.b b3 = q2.a(ad2);
        return net.minecraft.u.b.n.a(b2.cy_() - b3.cy_()) > this.P * 16 ? null : (b3.k() >= 0 && b3.k() < 256 ? (net.minecraft.u.b.n.a(b2.l() - b3.l()) > this.P * 16 ? null : this.o.a(b3)) : null);
    }

    private void a(double d2, double d3, double d4) {
        this.V = new b();
        ((b)this.V).b();
        ah ah2 = new ah(this.V.c);
        ah2.d();
        ah ah3 = new ah(this.V.b);
        ah3.d();
        ah ah4 = new ah();
        ah.c(ah3, ah2, ah4);
        ah4.b();
        this.X.a = d2;
        this.X.b = d3;
        this.X.c = d4;
        this.W[0] = new org.lwjgl.util.e.m(-1.0f, -1.0f, -1.0f, 1.0f);
        this.W[1] = new org.lwjgl.util.e.m(1.0f, -1.0f, -1.0f, 1.0f);
        this.W[2] = new org.lwjgl.util.e.m(1.0f, 1.0f, -1.0f, 1.0f);
        this.W[3] = new org.lwjgl.util.e.m(-1.0f, 1.0f, -1.0f, 1.0f);
        this.W[4] = new org.lwjgl.util.e.m(-1.0f, -1.0f, 1.0f, 1.0f);
        this.W[5] = new org.lwjgl.util.e.m(1.0f, -1.0f, 1.0f, 1.0f);
        this.W[6] = new org.lwjgl.util.e.m(1.0f, 1.0f, 1.0f, 1.0f);
        this.W[7] = new org.lwjgl.util.e.m(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < 8; ++i2) {
            ah.a((org.lwjgl.util.e.d)ah4, this.W[i2], this.W[i2]);
            this.W[i2].a /= this.W[i2].d;
            this.W[i2].b /= this.W[i2].d;
            this.W[i2].c /= this.W[i2].d;
            this.W[i2].d = 1.0f;
        }
    }

    protected l a(n n2, double d2) {
        float f2 = (float)((double)n2.bd + (double)(n2.bb - n2.bd) * d2);
        float f3 = (float)((double)n2.bc + (double)(n2.ba - n2.bc) * d2);
        if (net.minecraft.client.r.z().w.as == 2) {
            f2 += 180.0f;
        }
        float f4 = net.minecraft.u.b.n.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = net.minecraft.u.b.n.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -net.minecraft.u.b.n.b(-f2 * ((float)Math.PI / 180));
        float f7 = net.minecraft.u.b.n.a(-f2 * ((float)Math.PI / 180));
        return new l(f5 * f6, f7, f4 * f6);
    }

    public int a(net.minecraft.u.c c2, double d2, int n2, n n3) {
        am.a();
        if (c2 == net.minecraft.u.c.d) {
            this.h.D.a("translucent_sort");
            double d3 = n3.aU - this.Z;
            double d4 = n3.aV - this.aa;
            double d5 = n3.aW - this.ab;
            if (d3 * d3 + d4 * d4 + d5 * d5 > 1.0) {
                this.Z = n3.aU;
                this.aa = n3.aV;
                this.ab = n3.aW;
                int n4 = 0;
                for (bu bu2 : this.m) {
                    if (!bu2.a.b.d(c2) || n4++ >= 15) continue;
                    this.N.c(bu2.a);
                }
            }
            this.h.D.b();
        }
        this.h.D.a("filterempty");
        int n5 = 0;
        boolean bl2 = c2 == net.minecraft.u.c.d;
        int n6 = bl2 ? this.m.size() - 1 : 0;
        int n7 = bl2 ? -1 : this.m.size();
        int n8 = bl2 ? -1 : 1;
        for (int i2 = n6; i2 != n7; i2 += n8) {
            q q2 = ((bu)this.m.get((int)i2)).a;
            if (q2.h().c(c2)) continue;
            ++n5;
            this.O.a(q2, c2);
        }
        this.h.D.c("render_" + (Object)((Object)c2));
        this.a(c2);
        this.h.D.b();
        return n5;
    }

    private void a(net.minecraft.u.c c2) {
        this.h.q.g();
        if (ay.f()) {
            bd.n(32884);
            ay.l(ay.q);
            bd.n(32888);
            ay.l(ay.r);
            bd.n(32888);
            ay.l(ay.q);
            bd.n(32886);
        }
        this.O.a(c2);
        if (ay.f()) {
            for (net.minecraft.client.g.d.e e2 : net.minecraft.client.g.d.b.a.h()) {
                g g2 = e2.b();
                int n2 = e2.d();
                switch (g2) {
                    case a: {
                        bd.m(32884);
                        break;
                    }
                    case d: {
                        ay.l(ay.q + n2);
                        bd.m(32888);
                        ay.l(ay.q);
                        break;
                    }
                    case c: {
                        bd.m(32886);
                        bd.F();
                    }
                }
            }
        }
        this.h.q.f();
    }

    private void a(Iterator iterator) {
        while (iterator.hasNext()) {
            bw bw2 = (bw)iterator.next();
            int n2 = bw2.c();
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
                net.minecraft.u.b.b b2 = (net.minecraft.u.b.b)iterator.next();
                iterator.remove();
                int n2 = b2.cy_();
                int n3 = b2.k();
                int n4 = b2.l();
                this.a(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1, false);
            }
        }
    }

    private void r() {
        bd.o();
        bd.c();
        bd.l();
        bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
        am.a();
        bd.a(false);
        this.i.a(f);
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        for (int i2 = 0; i2 < 6; ++i2) {
            bd.D();
            if (i2 == 1) {
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i2 == 2) {
                bd.b(-90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i2 == 3) {
                bd.b(180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i2 == 4) {
                bd.b(90.0f, 0.0f, 0.0f, 1.0f);
            }
            if (i2 == 5) {
                bd.b(-90.0f, 0.0f, 0.0f, 1.0f);
            }
            g2.a(7, net.minecraft.client.g.d.b.i);
            g2.b(-100.0, -100.0, -100.0).a(0.0, 0.0).b(40, 40, 40, 255).d();
            g2.b(-100.0, -100.0, 100.0).a(0.0, 16.0).b(40, 40, 40, 255).d();
            g2.b(100.0, -100.0, 100.0).a(16.0, 16.0).b(40, 40, 40, 255).d();
            g2.b(100.0, -100.0, -100.0).a(16.0, 0.0).b(40, 40, 40, 255).d();
            ci2.b();
            bd.E();
        }
        bd.a(true);
        bd.v();
        bd.d();
    }

    public void a(float f2, int n2) {
        if (this.h.h.q.a().a() == 1) {
            this.r();
        } else if (this.h.h.q.e()) {
            float f3;
            float f4;
            int n3;
            int n4;
            float f5;
            float f6;
            float f7;
            bd.w();
            net.minecraft.u.b.s s2 = this.k.a(this.h.Z(), f2);
            float f8 = (float)s2.b;
            float f9 = (float)s2.c;
            float f10 = (float)s2.d;
            if (n2 != 2) {
                float f11 = (f8 * 30.0f + f9 * 59.0f + f10 * 11.0f) / 100.0f;
                float f12 = (f8 * 30.0f + f9 * 70.0f) / 100.0f;
                float f13 = (f8 * 30.0f + f10 * 70.0f) / 100.0f;
                f8 = f11;
                f9 = f12;
                f10 = f13;
            }
            bd.d(f8, f9, f10);
            ci ci2 = ci.a();
            net.minecraft.client.g.g g2 = ci2.c();
            bd.a(false);
            bd.n();
            bd.d(f8, f9, f10);
            if (this.Y) {
                this.u.a();
                bd.n(32884);
                bd.d(3, 5126, 12, 0);
                this.u.a(7);
                this.u.b();
                bd.m(32884);
            } else {
                bd.p(this.q);
            }
            bd.o();
            bd.c();
            bd.l();
            bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
            am.a();
            float[] arrf = this.k.q.a(this.k.c(f2), f2);
            if (arrf != null) {
                bd.w();
                bd.j(7425);
                bd.D();
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.b(net.minecraft.u.b.n.a(this.k.d(f2)) < 0.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
                bd.b(90.0f, 0.0f, 0.0f, 1.0f);
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
                g2.a(6, net.minecraft.client.g.d.b.f);
                g2.b(0.0, 100.0, 0.0).a(f7, f6, f14, arrf[3]).d();
                n4 = 16;
                for (n3 = 0; n3 <= 16; ++n3) {
                    f5 = (float)n3 * ((float)Math.PI * 2) / 16.0f;
                    f4 = net.minecraft.u.b.n.a(f5);
                    f3 = net.minecraft.u.b.n.b(f5);
                    g2.b((double)(f4 * 120.0f), (double)(f3 * 120.0f), (double)(-f3 * 40.0f * arrf[3])).a(arrf[0], arrf[1], arrf[2], 0.0f).d();
                }
                ci2.b();
                bd.E();
                bd.j(7424);
            }
            bd.v();
            bd.a(net.minecraft.client.g.ad.l, bc.e, net.minecraft.client.g.ad.e, bc.n);
            bd.D();
            f7 = 1.0f - this.k.j(f2);
            bd.c(1.0f, 1.0f, 1.0f, f7);
            bd.b(-90.0f, 0.0f, 1.0f, 0.0f);
            bd.b(this.k.c(f2) * 360.0f, 1.0f, 0.0f, 0.0f);
            f6 = 30.0f;
            this.i.a(d);
            g2.a(7, net.minecraft.client.g.d.b.g);
            g2.b((double)(-f6), 100.0, (double)(-f6)).a(0.0, 0.0).d();
            g2.b((double)f6, 100.0, (double)(-f6)).a(1.0, 0.0).d();
            g2.b((double)f6, 100.0, (double)f6).a(1.0, 1.0).d();
            g2.b((double)(-f6), 100.0, (double)f6).a(0.0, 1.0).d();
            ci2.b();
            f6 = 20.0f;
            this.i.a(c);
            int n5 = this.k.o();
            n4 = n5 % 4;
            n3 = n5 / 4 % 2;
            f5 = (float)(n4 + 0) / 4.0f;
            f4 = (float)(n3 + 0) / 2.0f;
            f3 = (float)(n4 + 1) / 4.0f;
            float f17 = (float)(n3 + 1) / 2.0f;
            g2.a(7, net.minecraft.client.g.d.b.g);
            g2.b((double)(-f6), -100.0, (double)f6).a(f3, f17).d();
            g2.b((double)f6, -100.0, (double)f6).a(f5, f17).d();
            g2.b((double)f6, -100.0, (double)(-f6)).a(f5, f4).d();
            g2.b((double)(-f6), -100.0, (double)(-f6)).a(f3, f4).d();
            ci2.b();
            bd.w();
            float f18 = this.k.g(f2) * f7;
            if (f18 > 0.0f) {
                bd.c(f18, f18, f18, f18);
                if (this.Y) {
                    this.t.a();
                    bd.n(32884);
                    bd.d(3, 5126, 12, 0);
                    this.t.a(7);
                    this.t.b();
                    bd.m(32884);
                } else {
                    bd.p(this.p);
                }
            }
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.k();
            bd.d();
            bd.n();
            bd.E();
            bd.w();
            bd.d(0.0f, 0.0f, 0.0f);
            double d2 = this.h.j.o((float)f2).c - this.k.O();
            if (d2 < 0.0) {
                bd.D();
                bd.c(0.0f, 12.0f, 0.0f);
                if (this.Y) {
                    this.v.a();
                    bd.n(32884);
                    bd.d(3, 5126, 12, 0);
                    this.v.a(7);
                    this.v.b();
                    bd.m(32884);
                } else {
                    bd.p(this.r);
                }
                bd.E();
                float f19 = 1.0f;
                float f20 = -((float)(d2 + 65.0));
                float f21 = -1.0f;
                g2.a(7, net.minecraft.client.g.d.b.f);
                g2.b(-1.0, (double)f20, 1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, (double)f20, 1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, (double)f20, -1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, (double)f20, -1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, (double)f20, 1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, (double)f20, -1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, (double)f20, -1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, (double)f20, 1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                g2.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                g2.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                ci2.b();
            }
            if (this.k.q.h()) {
                bd.d(f8 * 0.2f + 0.04f, f9 * 0.2f + 0.04f, f10 * 0.6f + 0.1f);
            } else {
                bd.d(f8, f9, f10);
            }
            bd.D();
            bd.c(0.0f, -((float)(d2 - 16.0)), 0.0f);
            bd.p(this.r);
            bd.E();
            bd.v();
            bd.a(true);
        }
    }

    public void b(float f2, int n2) {
        if (this.h.h.q.e()) {
            if (this.h.w.e() == 2) {
                this.c(f2, n2);
            } else {
                float f3;
                bd.q();
                n n3 = this.h.Z();
                float f4 = (float)(n3.bs + (n3.aV - n3.bs) * (double)f2);
                int n4 = 32;
                int n5 = 8;
                ci ci2 = ci.a();
                net.minecraft.client.g.g g2 = ci2.c();
                this.i.a(e);
                bd.l();
                bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
                net.minecraft.u.b.s s2 = this.k.e(f2);
                float f5 = (float)s2.b;
                float f6 = (float)s2.c;
                float f7 = (float)s2.d;
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
                double d3 = n3.aR + (n3.aU - n3.aR) * (double)f2 + d2 * (double)0.03f;
                double d4 = n3.aT + (n3.aW - n3.aT) * (double)f2;
                int n6 = net.minecraft.u.b.n.c(d3 / 2048.0);
                int n7 = net.minecraft.u.b.n.c(d4 / 2048.0);
                float f10 = this.k.q.g() - f4 + 0.33f;
                float f11 = (float)((d3 -= (double)(n6 * 2048)) * 4.8828125E-4);
                float f12 = (float)((d4 -= (double)(n7 * 2048)) * 4.8828125E-4);
                g2.a(7, net.minecraft.client.g.d.b.i);
                for (int i2 = -256; i2 < 256; i2 += 32) {
                    for (int i3 = -256; i3 < 256; i3 += 32) {
                        g2.b((double)(i2 + 0), (double)f10, (double)(i3 + 32)).a((float)(i2 + 0) * 4.8828125E-4f + f11, (float)(i3 + 32) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                        g2.b((double)(i2 + 32), (double)f10, (double)(i3 + 32)).a((float)(i2 + 32) * 4.8828125E-4f + f11, (float)(i3 + 32) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                        g2.b((double)(i2 + 32), (double)f10, (double)(i3 + 0)).a((float)(i2 + 32) * 4.8828125E-4f + f11, (float)(i3 + 0) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                        g2.b((double)(i2 + 0), (double)f10, (double)(i3 + 0)).a((float)(i2 + 0) * 4.8828125E-4f + f11, (float)(i3 + 0) * 4.8828125E-4f + f12).a(f5, f6, f7, 0.8f).d();
                    }
                }
                ci2.b();
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                bd.k();
                bd.p();
            }
        }
    }

    public boolean a(double d2, double d3, double d4, float f2) {
        return false;
    }

    private void c(float f2, int n2) {
        float f3;
        float f4;
        float f5;
        bd.q();
        n n3 = this.h.Z();
        float f6 = (float)(n3.bs + (n3.aV - n3.bs) * (double)f2);
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        float f7 = 12.0f;
        float f8 = 4.0f;
        double d2 = (float)this.w + f2;
        double d3 = (n3.aR + (n3.aU - n3.aR) * (double)f2 + d2 * (double)0.03f) / 12.0;
        double d4 = (n3.aT + (n3.aW - n3.aT) * (double)f2) / 12.0 + (double)0.33f;
        float f9 = this.k.q.g() - f6 + 0.33f;
        int n4 = net.minecraft.u.b.n.c(d3 / 2048.0);
        int n5 = net.minecraft.u.b.n.c(d4 / 2048.0);
        d3 -= (double)(n4 * 2048);
        d4 -= (double)(n5 * 2048);
        this.i.a(e);
        bd.l();
        bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
        net.minecraft.u.b.s s2 = this.k.e(f2);
        float f10 = (float)s2.b;
        float f11 = (float)s2.c;
        float f12 = (float)s2.d;
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
        float f20 = (float)net.minecraft.u.b.n.c(d3) * 0.00390625f;
        float f21 = (float)net.minecraft.u.b.n.c(d4) * 0.00390625f;
        float f22 = (float)(d3 - (double)net.minecraft.u.b.n.c(d3));
        float f23 = (float)(d4 - (double)net.minecraft.u.b.n.c(d4));
        int n6 = 8;
        int n7 = 4;
        float f24 = 9.765625E-4f;
        bd.b(12.0f, 1.0f, 12.0f);
        for (int i2 = 0; i2 < 2; ++i2) {
            if (i2 == 0) {
                bd.a(false, false, false, false);
            } else {
                switch (n2) {
                    case 0: {
                        bd.a(false, true, true, true);
                        break;
                    }
                    case 1: {
                        bd.a(true, false, false, true);
                        break;
                    }
                    case 2: {
                        bd.a(true, true, true, true);
                    }
                }
            }
            for (int i3 = -3; i3 <= 4; ++i3) {
                for (int i4 = -3; i4 <= 4; ++i4) {
                    int n8;
                    g2.a(7, net.minecraft.client.g.d.b.l);
                    float f25 = i3 * 8;
                    float f26 = i4 * 8;
                    float f27 = f25 - f22;
                    float f28 = f26 - f23;
                    if (f9 > -5.0f) {
                        g2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        g2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        g2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        g2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f13, f14, f15, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                    }
                    if (f9 <= 5.0f) {
                        g2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 8.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        g2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 8.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        g2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        g2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f - 9.765625E-4f), (double)(f28 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f10, f11, f12, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                    }
                    if (i3 > -1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            g2.b((double)(f27 + (float)n8 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            g2.b((double)(f27 + (float)n8 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + 8.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            g2.b((double)(f27 + (float)n8 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + 0.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            g2.b((double)(f27 + (float)n8 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                        }
                    }
                    if (i3 <= 1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            g2.b((double)(f27 + (float)n8 + 1.0f - 9.765625E-4f), (double)(f9 + 0.0f), (double)(f28 + 8.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            g2.b((double)(f27 + (float)n8 + 1.0f - 9.765625E-4f), (double)(f9 + 4.0f), (double)(f28 + 8.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            g2.b((double)(f27 + (float)n8 + 1.0f - 9.765625E-4f), (double)(f9 + 4.0f), (double)(f28 + 0.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            g2.b((double)(f27 + (float)n8 + 1.0f - 9.765625E-4f), (double)(f9 + 0.0f), (double)(f28 + 0.0f)).a((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).a(f5, f4, f3, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                        }
                    }
                    if (i4 > -1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            g2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n8 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            g2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n8 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            g2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n8 + 0.0f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            g2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n8 + 0.0f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                        }
                    }
                    if (i4 <= 1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            g2.b((double)(f27 + 0.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n8 + 1.0f - 9.765625E-4f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            g2.b((double)(f27 + 8.0f), (double)(f9 + 4.0f), (double)(f28 + (float)n8 + 1.0f - 9.765625E-4f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            g2.b((double)(f27 + 8.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n8 + 1.0f - 9.765625E-4f)).a((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            g2.b((double)(f27 + 0.0f), (double)(f9 + 0.0f), (double)(f28 + (float)n8 + 1.0f - 9.765625E-4f)).a((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).a(f16, f17, f18, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                        }
                    }
                    ci2.b();
                }
            }
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.k();
        bd.p();
    }

    public void a(long l2) {
        this.ac |= this.N.a(l2);
        if (!this.l.isEmpty()) {
            Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                q q2 = (q)iterator.next();
                boolean bl2 = q2.m() ? this.N.b(q2) : this.N.a(q2);
                if (!bl2) break;
                q2.k();
                iterator.remove();
                long l3 = l2 - System.nanoTime();
                if (l3 < 0L) break;
            }
        }
    }

    public void a(n n2, float f2) {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        net.minecraft.q.c.d d2 = this.k.V();
        double d3 = this.h.w.d * 16;
        if (n2.aU >= d2.f() - d3 || n2.aU <= d2.d() + d3 || n2.aW >= d2.g() - d3 || n2.aW <= d2.e() + d3) {
            float f3;
            double d4;
            double d5;
            float f4;
            double d6 = 1.0 - d2.a(n2) / d3;
            d6 = Math.pow(d6, 4.0);
            double d7 = n2.br + (n2.aU - n2.br) * (double)f2;
            double d8 = n2.bs + (n2.aV - n2.bs) * (double)f2;
            double d9 = n2.bt + (n2.aW - n2.bt) * (double)f2;
            bd.l();
            bd.a(net.minecraft.client.g.ad.l, bc.e, net.minecraft.client.g.ad.e, bc.n);
            this.i.a(g);
            bd.a(false);
            bd.D();
            int n3 = d2.c().a();
            float f5 = (float)(n3 >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n3 & 0xFF) / 255.0f;
            bd.c(f5, f6, f7, (float)d6);
            bd.a(-3.0f, -3.0f);
            bd.r();
            bd.a(516, 0.1f);
            bd.d();
            bd.q();
            float f8 = (float)(net.minecraft.client.r.I() % 3000L) / 3000.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 128.0f;
            g2.a(7, net.minecraft.client.g.d.b.g);
            g2.c(-d7, -d8, -d9);
            double d10 = Math.max((double)net.minecraft.u.b.n.c(d9 - d3), d2.e());
            double d11 = Math.min((double)net.minecraft.u.b.n.f(d9 + d3), d2.g());
            if (d7 > d2.f() - d3) {
                f4 = 0.0f;
                d5 = d10;
                while (d5 < d11) {
                    d4 = Math.min(1.0, d11 - d5);
                    f3 = (float)d4 * 0.5f;
                    g2.b(d2.f(), 256.0, d5).a(f8 + f4, f8 + 0.0f).d();
                    g2.b(d2.f(), 256.0, d5 + d4).a(f8 + f3 + f4, f8 + 0.0f).d();
                    g2.b(d2.f(), 0.0, d5 + d4).a(f8 + f3 + f4, f8 + 128.0f).d();
                    g2.b(d2.f(), 0.0, d5).a(f8 + f4, f8 + 128.0f).d();
                    d5 += 1.0;
                    f4 += 0.5f;
                }
            }
            if (d7 < d2.d() + d3) {
                f4 = 0.0f;
                d5 = d10;
                while (d5 < d11) {
                    d4 = Math.min(1.0, d11 - d5);
                    f3 = (float)d4 * 0.5f;
                    g2.b(d2.d(), 256.0, d5).a(f8 + f4, f8 + 0.0f).d();
                    g2.b(d2.d(), 256.0, d5 + d4).a(f8 + f3 + f4, f8 + 0.0f).d();
                    g2.b(d2.d(), 0.0, d5 + d4).a(f8 + f3 + f4, f8 + 128.0f).d();
                    g2.b(d2.d(), 0.0, d5).a(f8 + f4, f8 + 128.0f).d();
                    d5 += 1.0;
                    f4 += 0.5f;
                }
            }
            d10 = Math.max((double)net.minecraft.u.b.n.c(d7 - d3), d2.d());
            d11 = Math.min((double)net.minecraft.u.b.n.f(d7 + d3), d2.f());
            if (d9 > d2.g() - d3) {
                f4 = 0.0f;
                d5 = d10;
                while (d5 < d11) {
                    d4 = Math.min(1.0, d11 - d5);
                    f3 = (float)d4 * 0.5f;
                    g2.b(d5, 256.0, d2.g()).a(f8 + f4, f8 + 0.0f).d();
                    g2.b(d5 + d4, 256.0, d2.g()).a(f8 + f3 + f4, f8 + 0.0f).d();
                    g2.b(d5 + d4, 0.0, d2.g()).a(f8 + f3 + f4, f8 + 128.0f).d();
                    g2.b(d5, 0.0, d2.g()).a(f8 + f4, f8 + 128.0f).d();
                    d5 += 1.0;
                    f4 += 0.5f;
                }
            }
            if (d9 < d2.e() + d3) {
                f4 = 0.0f;
                d5 = d10;
                while (d5 < d11) {
                    d4 = Math.min(1.0, d11 - d5);
                    f3 = (float)d4 * 0.5f;
                    g2.b(d5, 256.0, d2.e()).a(f8 + f4, f8 + 0.0f).d();
                    g2.b(d5 + d4, 256.0, d2.e()).a(f8 + f3 + f4, f8 + 0.0f).d();
                    g2.b(d5 + d4, 0.0, d2.e()).a(f8 + f3 + f4, f8 + 128.0f).d();
                    g2.b(d5, 0.0, d2.e()).a(f8 + f4, f8 + 128.0f).d();
                    d5 += 1.0;
                    f4 += 0.5f;
                }
            }
            ci2.b();
            g2.c(0.0, 0.0, 0.0);
            bd.p();
            bd.c();
            bd.a(0.0f, 0.0f);
            bd.s();
            bd.d();
            bd.k();
            bd.E();
            bd.a(true);
        }
    }

    private void s() {
        bd.a(net.minecraft.client.g.ad.d, bc.m, net.minecraft.client.g.ad.e, bc.n);
        bd.l();
        bd.c(1.0f, 1.0f, 1.0f, 0.5f);
        bd.a(-3.0f, -3.0f);
        bd.r();
        bd.a(516, 0.1f);
        bd.d();
        bd.D();
    }

    private void t() {
        bd.c();
        bd.a(0.0f, 0.0f);
        bd.s();
        bd.d();
        bd.a(true);
        bd.E();
    }

    public void a(ci ci2, net.minecraft.client.g.g g2, n n2, float f2) {
        double d2 = n2.br + (n2.aU - n2.br) * (double)f2;
        double d3 = n2.bs + (n2.aV - n2.bs) * (double)f2;
        double d4 = n2.bt + (n2.aW - n2.bt) * (double)f2;
        if (!this.x.isEmpty()) {
            this.i.a(net.minecraft.client.g.a.f.b);
            this.s();
            g2.a(7, net.minecraft.client.g.d.b.a);
            g2.c(-d2, -d3, -d4);
            g2.c();
            Iterator iterator = this.x.values().iterator();
            while (iterator.hasNext()) {
                bw bw2 = (bw)iterator.next();
                net.minecraft.u.b.b b2 = bw2.a();
                double d5 = (double)b2.cy_() - d2;
                double d6 = (double)b2.k() - d3;
                double d7 = (double)b2.l() - d4;
                cn cn2 = this.k.n(b2).c();
                if (cn2 instanceof ib || cn2 instanceof fz || cn2 instanceof cx || cn2 instanceof hs) continue;
                if (d5 * d5 + d6 * d6 + d7 * d7 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                net.minecraft.g.c.b b3 = this.k.n(b2);
                if (b3.d() == net.minecraft.g.a.h.a) continue;
                int n3 = bw2.b();
                net.minecraft.client.g.a.d d8 = this.z[n3];
                net.minecraft.client.g.j j2 = this.h.aa();
                j2.a(b3, b2, d8, this.k);
            }
            ci2.b();
            g2.c(0.0, 0.0, 0.0);
            this.t();
        }
    }

    public void a(net.minecraft.w.a.b b2, o o2, int n2, float f2) {
        if (n2 == 0 && o2.a == net.minecraft.u.b.p.b) {
            bd.l();
            bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
            bd.d(2.0f);
            bd.w();
            bd.a(false);
            net.minecraft.u.b.b b3 = o2.a();
            net.minecraft.g.c.b b4 = this.k.n(b3);
            if (b4.d() != net.minecraft.g.a.h.a && this.k.V().a(b3)) {
                double d2 = b2.br + (b2.aU - b2.br) * (double)f2;
                double d3 = b2.bs + (b2.aV - b2.bs) * (double)f2;
                double d4 = b2.bt + (b2.aW - b2.bt) * (double)f2;
                ar.a(b4.c(this.k, b3).b(0.002f).c(-d2, -d3, -d4), 0.0f, 0.0f, 0.0f, 0.4f);
            }
            bd.a(true);
            bd.v();
            bd.k();
        }
    }

    public static void a(net.minecraft.u.b.a a2, float f2, float f3, float f4, float f5) {
        ar.a(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f, f2, f3, f4, f5);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(3, net.minecraft.client.g.d.b.f);
        ar.a(g2, d2, d3, d4, d5, d6, d7, f2, f3, f4, f5);
        ci2.b();
    }

    public static void a(net.minecraft.client.g.g g2, double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        g2.b(d2, d3, d4).a(f2, f3, f4, 0.0f).d();
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d7).a(f2, f3, f4, 0.0f).d();
        g2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, 0.0f).d();
        g2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d4).a(f2, f3, f4, 0.0f).d();
        g2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d4).a(f2, f3, f4, 0.0f).d();
    }

    public static void b(net.minecraft.u.b.a a2, float f2, float f3, float f4, float f5) {
        ar.b(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f, f2, f3, f4, f5);
    }

    public static void b(double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(5, net.minecraft.client.g.d.b.f);
        ar.b(g2, d2, d3, d4, d5, d6, d7, f2, f3, f4, f5);
        ci2.b();
    }

    public static void b(net.minecraft.client.g.g g2, double d2, double d3, double d4, double d5, double d6, double d7, float f2, float f3, float f4, float f5) {
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d3, d7).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d2, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d4).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
        g2.b(d5, d6, d7).a(f2, f3, f4, f5).d();
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        this.o.a(n2, n3, n4, n5, n6, n7, bl2);
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.g.c.b b4, int n2) {
        int n3 = b2.cy_();
        int n4 = b2.k();
        int n5 = b2.l();
        this.a(n3 - 1, n4 - 1, n5 - 1, n3 + 1, n4 + 1, n5 + 1, (n2 & 8) != 0);
    }

    @Override
    public void a(net.minecraft.u.b.b b2) {
        this.ae.add(b2.i());
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a(n2 - 1, n3 - 1, n4 - 1, n5 + 1, n6 + 1, n7 + 1, false);
    }

    @Override
    public void a(bv bv2, net.minecraft.u.b.b b2) {
        z z2 = (z)this.y.get(b2);
        if (z2 != null) {
            this.h.U().b(z2);
            this.y.remove(b2);
        }
        if (bv2 != null) {
            net.minecraft.m.au au2 = net.minecraft.m.au.a(bv2);
            if (au2 != null) {
                this.h.t.a(au2.e());
            }
            net.minecraft.client.c.e e2 = net.minecraft.client.c.e.a(bv2, b2.cy_(), b2.k(), b2.l());
            this.y.put(b2, e2);
            this.h.U().a(e2);
        }
    }

    @Override
    public void a(net.minecraft.w.a.b b2, bv bv2, net.minecraft.u.bu bu2, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        try {
            this.b(n2, bl2, d2, d3, d4, d5, d6, d7, arrn);
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Exception while adding particle");
            i i2 = a2.a("Particle being added");
            i2.a("ID", n2);
            if (arrn != null) {
                i2.a("Parameters", arrn);
            }
            i2.a("Position", new cm(this, d2, d3, d4));
            throw new net.minecraft.u.bo(a2);
        }
    }

    private void a(aj aj2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        this.a(aj2.c(), aj2.e(), d2, d3, d4, d5, d6, d7, arrn);
    }

    private cb b(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        n n3 = this.h.Z();
        if (this.h != null && n3 != null && this.h.l != null) {
            int n4 = this.h.w.aD;
            if (n4 == 1 && this.k.p.nextInt(3) == 0) {
                n4 = 2;
            }
            double d8 = n3.aU - d2;
            double d9 = n3.aV - d3;
            double d10 = n3.aW - d4;
            return bl2 ? this.h.l.a(n2, d2, d3, d4, d5, d6, d7, arrn) : (d8 * d8 + d9 * d9 + d10 * d10 > 1024.0 ? null : (n4 > 1 ? null : this.h.l.a(n2, d2, d3, d4, d5, d6, d7, arrn)));
        }
        return null;
    }

    @Override
    public void a(n n2) {
    }

    @Override
    public void b(n n2) {
    }

    public void j() {
    }

    @Override
    public void a(int n2, net.minecraft.u.b.b b2, int n3) {
        switch (n2) {
            case 1023: 
            case 1028: {
                n n4 = this.h.Z();
                if (n4 == null) break;
                double d2 = (double)b2.cy_() - n4.aU;
                double d3 = (double)b2.k() - n4.aV;
                double d4 = (double)b2.l() - n4.aW;
                double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                double d6 = n4.aU;
                double d7 = n4.aV;
                double d8 = n4.aW;
                if (d5 > 0.0) {
                    d6 += d2 / d5 * 2.0;
                    d7 += d3 / d5 * 2.0;
                    d8 += d4 / d5 * 2.0;
                }
                if (n2 == 1023) {
                    this.k.a(d6, d7, d8, net.minecraft.a.f.gZ, net.minecraft.u.bu.f, 1.0f, 1.0f, false);
                    break;
                }
                this.k.a(d6, d7, d8, net.minecraft.a.f.aP, net.minecraft.u.bu.f, 5.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(net.minecraft.w.a.b b2, int n2, net.minecraft.u.b.b b3, int n3) {
        Random random = this.k.p;
        switch (n2) {
            case 1000: {
                this.k.a(b3, net.minecraft.a.f.au, net.minecraft.u.bu.e, 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.k.a(b3, net.minecraft.a.f.av, net.minecraft.u.bu.e, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.k.a(b3, net.minecraft.a.f.aw, net.minecraft.u.bu.e, 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                this.k.a(b3, net.minecraft.a.f.aV, net.minecraft.u.bu.g, 1.0f, 1.2f, false);
                break;
            }
            case 1004: {
                this.k.a(b3, net.minecraft.a.f.bt, net.minecraft.u.bu.g, 1.0f, 1.2f, false);
                break;
            }
            case 1005: {
                this.k.a(b3, net.minecraft.a.f.cR, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1006: {
                this.k.a(b3, net.minecraft.a.f.ho, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                this.k.a(b3, net.minecraft.a.f.hq, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1008: {
                this.k.a(b3, net.minecraft.a.f.bm, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1009: {
                this.k.a(b3, net.minecraft.a.f.bx, net.minecraft.u.bu.e, 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1010: {
                if (net.minecraft.m.cg.c(n3) instanceof net.minecraft.m.au) {
                    this.k.a(b3, ((net.minecraft.m.au)net.minecraft.m.cg.c(n3)).f());
                    break;
                }
                this.k.a(b3, (bv)null);
                break;
            }
            case 1011: {
                this.k.a(b3, net.minecraft.a.f.cQ, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1012: {
                this.k.a(b3, net.minecraft.a.f.hn, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1013: {
                this.k.a(b3, net.minecraft.a.f.hp, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1014: {
                this.k.a(b3, net.minecraft.a.f.bl, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1015: {
                this.k.a(b3, net.minecraft.a.f.bQ, net.minecraft.u.bu.f, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.k.a(b3, net.minecraft.a.f.bP, net.minecraft.u.bu.f, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.k.a(b3, net.minecraft.a.f.aU, net.minecraft.u.bu.f, 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1018: {
                this.k.a(b3, net.minecraft.a.f.F, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1019: {
                this.k.a(b3, net.minecraft.a.f.hB, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.k.a(b3, net.minecraft.a.f.hC, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1021: {
                this.k.a(b3, net.minecraft.a.f.hD, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1022: {
                this.k.a(b3, net.minecraft.a.f.gV, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1024: {
                this.k.a(b3, net.minecraft.a.f.gY, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1025: {
                this.k.a(b3, net.minecraft.a.f.A, net.minecraft.u.bu.g, 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1026: {
                this.k.a(b3, net.minecraft.a.f.hJ, net.minecraft.u.bu.f, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1027: {
                this.k.a(b3, net.minecraft.a.f.hQ, net.minecraft.u.bu.g, 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1029: {
                this.k.a(b3, net.minecraft.a.f.c, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1030: {
                this.k.a(b3, net.minecraft.a.f.i, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1031: {
                this.k.a(b3, net.minecraft.a.f.f, net.minecraft.u.bu.e, 0.3f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1032: {
                this.h.U().a(net.minecraft.client.c.e.a(net.minecraft.a.f.ey, random.nextFloat() * 0.4f + 0.8f));
                break;
            }
            case 1033: {
                this.k.a(b3, net.minecraft.a.f.ae, net.minecraft.u.bu.e, 1.0f, 1.0f, false);
                break;
            }
            case 1034: {
                this.k.a(b3, net.minecraft.a.f.ad, net.minecraft.u.bu.e, 1.0f, 1.0f, false);
                break;
            }
            case 1035: {
                this.k.a(b3, net.minecraft.a.f.K, net.minecraft.u.bu.e, 1.0f, 1.0f, false);
                break;
            }
            case 1036: {
                this.k.a(b3, net.minecraft.a.f.cS, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1037: {
                this.k.a(b3, net.minecraft.a.f.cT, net.minecraft.u.bu.e, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                int n4 = n3 % 3 - 1;
                int n5 = n3 / 3 % 3 - 1;
                double d2 = (double)b3.cy_() + (double)n4 * 0.6 + 0.5;
                double d3 = (double)b3.k() + 0.5;
                double d4 = (double)b3.l() + (double)n5 * 0.6 + 0.5;
                for (int i2 = 0; i2 < 10; ++i2) {
                    double d5 = random.nextDouble() * 0.2 + 0.01;
                    double d6 = d2 + (double)n4 * 0.01 + (random.nextDouble() - 0.5) * (double)n5 * 0.5;
                    double d7 = d3 + (random.nextDouble() - 0.5) * 0.5;
                    double d8 = d4 + (double)n5 * 0.01 + (random.nextDouble() - 0.5) * (double)n4 * 0.5;
                    double d9 = (double)n4 * d5 + random.nextGaussian() * 0.01;
                    double d10 = -0.03 + random.nextGaussian() * 0.01;
                    double d11 = (double)n5 * d5 + random.nextGaussian() * 0.01;
                    this.a(aj.l, d6, d7, d8, d9, d10, d11, new int[0]);
                }
                return;
            }
            case 2001: {
                cn cn2 = cn.d(n3 & 0xFFF);
                if (cn2.v().d() != net.minecraft.g.a.h.a) {
                    fk fk2 = cn2.w();
                    this.k.a(b3, fk2.c(), net.minecraft.u.bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f, false);
                }
                this.h.l.a(b3, cn2.a(n3 >> 12 & 0xFF));
                break;
            }
            case 2002: {
                double d12 = b3.cy_();
                double d13 = b3.k();
                double d14 = b3.l();
                for (int i3 = 0; i3 < 8; ++i3) {
                    this.a(aj.K, d12, d13, d14, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, net.minecraft.m.cg.a(net.minecraft.a.w.bH));
                }
                net.minecraft.d.b b4 = net.minecraft.d.b.a(n3);
                int n6 = net.minecraft.d.m.a(b4);
                float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n6 >> 0 & 0xFF) / 255.0f;
                aj aj2 = b4.c() ? aj.o : aj.n;
                for (int i4 = 0; i4 < 100; ++i4) {
                    double d15 = random.nextDouble() * 4.0;
                    double d16 = random.nextDouble() * Math.PI * 2.0;
                    double d17 = Math.cos(d16) * d15;
                    double d18 = 0.01 + random.nextDouble() * 0.5;
                    double d19 = Math.sin(d16) * d15;
                    cb cb2 = this.b(aj2.c(), aj2.e(), d12 + d17 * 0.1, d13 + 0.3, d14 + d19 * 0.1, d17, d18, d19, new int[0]);
                    if (cb2 == null) continue;
                    float f5 = 0.75f + random.nextFloat() * 0.25f;
                    cb2.a(f2 * f5, f3 * f5, f4 * f5);
                    cb2.b((float)d15);
                }
                this.k.a(b3, net.minecraft.a.f.gg, net.minecraft.u.bu.g, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                double d20 = (double)b3.cy_() + 0.5;
                double d21 = b3.k();
                double d22 = (double)b3.l() + 0.5;
                for (int i5 = 0; i5 < 8; ++i5) {
                    this.a(aj.K, d20, d21, d22, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, net.minecraft.m.cg.a(net.minecraft.a.w.bR));
                }
                for (double d23 = 0.0; d23 < Math.PI * 2; d23 += 0.15707963267948966) {
                    this.a(aj.y, d20 + Math.cos(d23) * 5.0, d21 - 0.4, d22 + Math.sin(d23) * 5.0, Math.cos(d23) * -5.0, 0.0, Math.sin(d23) * -5.0, new int[0]);
                    this.a(aj.y, d20 + Math.cos(d23) * 5.0, d21 - 0.4, d22 + Math.sin(d23) * 5.0, Math.cos(d23) * -7.0, 0.0, Math.sin(d23) * -7.0, new int[0]);
                }
                return;
            }
            case 2004: {
                for (int i6 = 0; i6 < 20; ++i6) {
                    double d24 = (double)b3.cy_() + 0.5 + ((double)this.k.p.nextFloat() - 0.5) * 2.0;
                    double d25 = (double)b3.k() + 0.5 + ((double)this.k.p.nextFloat() - 0.5) * 2.0;
                    double d26 = (double)b3.l() + 0.5 + ((double)this.k.p.nextFloat() - 0.5) * 2.0;
                    this.k.a(aj.l, d24, d25, d26, 0.0, 0.0, 0.0, new int[0]);
                    this.k.a(aj.A, d24, d25, d26, 0.0, 0.0, 0.0, new int[0]);
                }
                return;
            }
            case 2005: {
                net.minecraft.m.m.a(this.k, b3, n3);
                break;
            }
            case 2006: {
                for (int i7 = 0; i7 < 200; ++i7) {
                    float f6 = random.nextFloat() * 4.0f;
                    float f7 = random.nextFloat() * ((float)Math.PI * 2);
                    double d27 = net.minecraft.u.b.n.b(f7) * f6;
                    double d28 = 0.01 + random.nextDouble() * 0.5;
                    double d29 = net.minecraft.u.b.n.a(f7) * f6;
                    cb cb3 = this.b(aj.Q.c(), false, (double)b3.cy_() + d27 * 0.1, (double)b3.k() + 0.3, (double)b3.l() + d29 * 0.1, d27, d28, d29, new int[0]);
                    if (cb3 == null) continue;
                    cb3.b(f6);
                }
                this.k.a(b3, net.minecraft.a.f.aQ, net.minecraft.u.bu.f, 1.0f, this.k.p.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 3000: {
                this.k.a(aj.c, true, (double)b3.cy_() + 0.5, (double)b3.k() + 0.5, (double)b3.l() + 0.5, 0.0, 0.0, 0.0, new int[0]);
                this.k.a(b3, net.minecraft.a.f.bh, net.minecraft.u.bu.e, 10.0f, (1.0f + (this.k.p.nextFloat() - this.k.p.nextFloat()) * 0.2f) * 0.7f, false);
                break;
            }
            case 3001: {
                this.k.a(b3, net.minecraft.a.f.aS, net.minecraft.u.bu.f, 64.0f, 0.8f + this.k.p.nextFloat() * 0.3f, false);
            }
        }
    }

    @Override
    public void b(int n2, net.minecraft.u.b.b b2, int n3) {
        if (n3 >= 0 && n3 < 10) {
            bw bw2 = (bw)this.x.get(n2);
            if (bw2 == null || bw2.a().cy_() != b2.cy_() || bw2.a().k() != b2.k() || bw2.a().l() != b2.l()) {
                bw2 = new bw(n2, b2);
                this.x.put(n2, bw2);
            }
            bw2.a(n3);
            bw2.b(this.w);
        } else {
            this.x.remove(n2);
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

    public void a(int n2) {
        this.h.w.d = n2;
        this.d();
    }
}

