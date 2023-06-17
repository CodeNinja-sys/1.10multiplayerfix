/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.b.cc;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.a.aa;
import net.minecraft.d.j;
import net.minecraft.d.m;
import net.minecraft.e.a;
import net.minecraft.e.q;
import net.minecraft.g.au;
import net.minecraft.g.cn;
import net.minecraft.g.cq;
import net.minecraft.g.fk;
import net.minecraft.h.k;
import net.minecraft.m.av;
import net.minecraft.m.by;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.q.v;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.s;
import net.minecraft.u.bv;
import net.minecraft.u.p;
import net.minecraft.u.r;
import net.minecraft.w.a.g;
import net.minecraft.w.ae;
import net.minecraft.w.b.a.b;
import net.minecraft.w.b.a.e;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;
import net.minecraft.w.c;
import net.minecraft.w.c.f;
import net.minecraft.w.d;
import net.minecraft.w.f.ab;
import net.minecraft.w.h.ai;
import net.minecraft.w.h.al;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.w.w;
import net.minecraft.x.a.o;
import net.minecraft.x.d.b.aj;

public abstract class l
extends n {
    private static final UUID a = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final h b = new h(a, "Sprinting speed boost", 0.3f, 2).a(false);
    protected static final net.minecraft.x.a.g Q = net.minecraft.x.a.o.a(l.class, net.minecraft.x.a.q.a);
    private static final net.minecraft.x.a.g c = net.minecraft.x.a.o.a(l.class, net.minecraft.x.a.q.c);
    private static final net.minecraft.x.a.g d = net.minecraft.x.a.o.a(l.class, net.minecraft.x.a.q.b);
    private static final net.minecraft.x.a.g e = net.minecraft.x.a.o.a(l.class, net.minecraft.x.a.q.h);
    private static final net.minecraft.x.a.g f = net.minecraft.x.a.o.a(l.class, net.minecraft.x.a.q.b);
    private b g;
    private final net.minecraft.u.i h = new net.minecraft.u.i(this);
    private final Map i = sz.c();
    private final cu[] l = new cu[2];
    private final cu[] m = new cu[4];
    public boolean R;
    public ah S;
    public int T;
    public int U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public float Z;
    public float aa;
    protected int ab;
    public float ac;
    public float ad;
    public float ae;
    public int af = 20;
    public float ag;
    public float ah;
    public float ai;
    public float aj;
    public float ak;
    public float al;
    public float am;
    public float an;
    public float ao = 0.02f;
    protected net.minecraft.w.a.b ap;
    protected int aq;
    protected boolean ar;
    protected int as;
    protected float at;
    protected float au;
    protected float av;
    protected float aw;
    protected float ax;
    protected int ay;
    protected float az;
    protected boolean aA;
    public float aB;
    public float aC;
    public float aD;
    protected int aE;
    protected double aF;
    protected double aG;
    protected double aH;
    protected double aI;
    protected double aJ;
    private boolean n = true;
    private l o;
    private int p;
    private l q;
    private int r;
    private float s;
    private int t;
    private float u;
    protected cu aK;
    protected int aL;
    protected int aM;
    private net.minecraft.u.b.b v;
    private net.minecraft.u.n w;
    private long x;

    @Override
    public void aY() {
        this.a(net.minecraft.u.n.l, Float.MAX_VALUE);
    }

    public l(net.minecraft.q.k k2) {
        super(k2);
        this.ca_();
        this.h(this.bw());
        this.aN = true;
        this.aj = (float)((Math.random() + 1.0) * (double)0.01f);
        this.e(this.aU, this.aV, this.aW);
        this.ai = (float)Math.random() * 12398.0f;
        this.am = this.ba = (float)(Math.random() * (Math.PI * 2));
        this.bu = 0.6f;
    }

    @Override
    protected void cb_() {
        this.bE.a(Q, (byte)0);
        this.bE.a(d, 0);
        this.bE.a(e, false);
        this.bE.a(f, 0);
        this.bE.a(c, Float.valueOf(1.0f));
    }

    protected void ca_() {
        this.bA().b(net.minecraft.w.d.a);
        this.bA().b(net.minecraft.w.d.c);
        this.bA().b(net.minecraft.w.d.d);
        this.bA().b(net.minecraft.w.d.g);
        this.bA().b(net.minecraft.w.d.h);
    }

    @Override
    protected void a(double d2, boolean bl2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3) {
        if (!this.cm()) {
            this.cn();
        }
        if (!this.aQ.C && this.bq > 3.0f && bl2) {
            float f2 = net.minecraft.u.b.n.f(this.bq - 3.0f);
            if (b2.d() != net.minecraft.g.a.h.a) {
                double d3 = Math.min((double)(0.2f + f2 / 15.0f), 2.5);
                int n2 = (int)(150.0 * d3);
                ((v)this.aQ).a(net.minecraft.u.aj.M, this.aU, this.aV, this.aW, n2, 0.0, 0.0, 0.0, (double)0.15f, cn.p(b2));
            }
        }
        super.a(d2, bl2, b2, b3);
    }

    public boolean aZ() {
        return false;
    }

    @Override
    public void cf_() {
        boolean bl2;
        this.Z = this.aa;
        super.cf_();
        this.aQ.A.a("livingEntityBaseTick");
        boolean bl3 = this instanceof net.minecraft.w.a.b;
        if (this.br()) {
            double d2;
            double d3;
            if (this.ab()) {
                this.a(net.minecraft.u.n.f, 1.0f);
            } else if (bl3 && !this.aQ.V().a(this.cT()) && (d3 = this.aQ.V().a(this) + this.aQ.V().m()) < 0.0 && (d2 = this.aQ.V().n()) > 0.0) {
                this.a(net.minecraft.u.n.f, (float)Math.max(1, net.minecraft.u.b.n.c(-d3 * d2)));
            }
        }
        if (this.ck() || this.aQ.C) {
            this.ce();
        }
        boolean bl4 = bl2 = bl3 && ((net.minecraft.w.a.b)this).J.a;
        if (this.br()) {
            net.minecraft.u.b.b b2;
            if (!this.a(net.minecraft.g.a.h.h)) {
                this.n(300);
            } else {
                if (!(this.aZ() || this.b(net.minecraft.a.c.m) || bl2)) {
                    this.n(this.h(this.cE()));
                    if (this.cE() == -20) {
                        this.n(0);
                        for (int i2 = 0; i2 < 8; ++i2) {
                            float f2 = this.bx.nextFloat() - this.bx.nextFloat();
                            float f3 = this.bx.nextFloat() - this.bx.nextFloat();
                            float f4 = this.bx.nextFloat() - this.bx.nextFloat();
                            this.aQ.a(net.minecraft.u.aj.e, this.aU + (double)f2, this.aV + (double)f3, this.aW + (double)f4, this.aX, this.aY, this.aZ, new int[0]);
                        }
                        this.a(net.minecraft.u.n.g, 2.0f);
                    }
                }
                if (!this.aQ.C && this.cz() && this.df() instanceof l) {
                    this.o();
                }
            }
            if (!this.aQ.C && !cc.a((Object)this.v, (Object)(b2 = new net.minecraft.u.b.b(this)))) {
                this.v = b2;
                this.b(b2);
            }
        }
        if (this.br() && this.cl()) {
            this.ce();
        }
        this.ag = this.ah;
        if (this.V > 0) {
            --this.V;
        }
        if (this.bB > 0 && !(this instanceof g)) {
            --this.bB;
        }
        if (this.bo() <= 0.0f) {
            this.bb();
        }
        if (this.aq > 0) {
            --this.aq;
        } else {
            this.ap = null;
        }
        if (this.q != null && !this.q.br()) {
            this.q = null;
        }
        if (this.o != null) {
            if (!this.o.br()) {
                this.a((l)null);
            } else if (this.by - this.p > 100) {
                this.a((l)null);
            }
        }
        this.bj();
        this.aw = this.av;
        this.al = this.ak;
        this.an = this.am;
        this.bc = this.ba;
        this.bd = this.bb;
        this.aQ.A.b();
    }

    protected void b(net.minecraft.u.b.b b2) {
        int n2 = net.minecraft.o.f.a(net.minecraft.a.aa.j, this);
        if (n2 > 0) {
            net.minecraft.o.l.a(this, this.aQ, b2, n2);
        }
    }

    public boolean ba() {
        return false;
    }

    protected void bb() {
        ++this.Y;
        if (this.Y == 20) {
            int n2;
            if (!this.aQ.C && (this.as() || this.aq > 0 && this.bc() && this.aQ.G().b("doMobLoot"))) {
                int n3;
                for (n2 = this.b_(this.ap); n2 > 0; n2 -= n3) {
                    n3 = net.minecraft.w.f.e.b(n2);
                    this.aQ.a(new net.minecraft.w.f.e(this.aQ, this.aU, this.aV, this.aW, n3));
                }
            }
            this.aa();
            for (n2 = 0; n2 < 20; ++n2) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                this.aQ.a(net.minecraft.u.aj.a, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    protected boolean bc() {
        return !this.ba();
    }

    protected int h(int n2) {
        int n3 = net.minecraft.o.f.c(this);
        return n3 > 0 && this.bx.nextInt(n3 + 1) > 0 ? n2 : n2 - 1;
    }

    protected int b_(net.minecraft.w.a.b b2) {
        return 0;
    }

    protected boolean as() {
        return false;
    }

    public Random bd() {
        return this.bx;
    }

    public l be() {
        return this.o;
    }

    public int bf() {
        return this.p;
    }

    public void a(l l2) {
        this.o = l2;
        this.p = this.by;
    }

    public l bg() {
        return this.q;
    }

    public int bh() {
        return this.r;
    }

    public void h(n n2) {
        this.q = n2 instanceof l ? (l)n2 : null;
        this.r = this.by;
    }

    public int bi() {
        return this.as;
    }

    protected void d(cu cu2) {
        if (cu2 != null) {
            bv bv2 = net.minecraft.a.f.p;
            cg cg2 = cu2.a();
            if (cg2 instanceof dn) {
                bv2 = ((dn)cg2).g().b();
            } else if (cg2 == net.minecraft.a.w.cR) {
                bv2 = net.minecraft.a.f.s;
            }
            this.a(bv2, 1.0f, 1.0f);
        }
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        cu cu2;
        e2.a("Health", this.bo());
        e2.a("HurtTime", (short)this.V);
        e2.a("HurtByTimestamp", this.p);
        e2.a("DeathTime", (short)this.Y);
        e2.a("AbsorptionAmount", this.aB());
        for (Object object : k.values()) {
            cu2 = this.a((k)((Object)object));
            if (cu2 == null) continue;
            this.bA().a(cu2.a((k)((Object)object)));
        }
        e2.a("Attributes", net.minecraft.w.d.a(this.bA()));
        for (Object object : k.values()) {
            cu2 = this.a((k)((Object)object));
            if (cu2 == null) continue;
            this.bA().b(cu2.a((k)((Object)object)));
        }
        if (!this.i.isEmpty()) {
            Object object;
            object = new q();
            for (j j2 : this.i.values()) {
                ((q)object).a(j2.a(new net.minecraft.e.e()));
            }
            e2.a("ActiveEffects", (a)object);
        }
        e2.a("FallFlying", this.bW());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        Object object;
        this.f(e2.j("AbsorptionAmount"));
        if (e2.b("Attributes", 9) && this.aQ != null && !this.aQ.C) {
            net.minecraft.w.d.a(this.bA(), e2.c("Attributes", 10));
        }
        if (e2.b("ActiveEffects", 9)) {
            object = e2.c("ActiveEffects", 10);
            for (int i2 = 0; i2 < ((q)object).e(); ++i2) {
                net.minecraft.e.e e3 = ((q)object).b(i2);
                j j2 = j.b(e3);
                if (j2 == null) continue;
                this.i.put(j2.a(), j2);
            }
        }
        if (e2.b("Health", 99)) {
            this.h(e2.j("Health"));
        }
        this.V = e2.g("HurtTime");
        this.Y = e2.g("DeathTime");
        this.p = e2.h("HurtByTimestamp");
        if (e2.b("Team", 8)) {
            object = e2.l("Team");
            this.aQ.Q().a(this.cN(), (String)object);
        }
        if (e2.p("FallFlying")) {
            this.a(7, true);
        }
    }

    protected void bj() {
        Iterator iterator = this.i.keySet().iterator();
        while (iterator.hasNext()) {
            net.minecraft.d.c c2 = (net.minecraft.d.c)iterator.next();
            j j2 = (j)this.i.get(c2);
            if (!j2.a(this)) {
                if (this.aQ.C) continue;
                iterator.remove();
                this.b(j2);
                continue;
            }
            if (j2.b() % 600 != 0) continue;
            this.a(j2, false);
        }
        if (this.n) {
            if (!this.aQ.C) {
                this.cn_();
            }
            this.n = false;
        }
        int n2 = (Integer)this.bE.a(d);
        boolean bl2 = (Boolean)this.bE.a(e);
        if (n2 > 0) {
            boolean bl3 = this.cD() ? this.bx.nextInt(15) == 0 : this.bx.nextBoolean();
            if (bl2) {
                bl3 &= this.bx.nextInt(5) == 0;
            }
            if (bl3 && n2 > 0) {
                double d2 = (double)(n2 >> 16 & 0xFF) / 255.0;
                double d3 = (double)(n2 >> 8 & 0xFF) / 255.0;
                double d4 = (double)(n2 >> 0 & 0xFF) / 255.0;
                this.aQ.a(bl2 ? net.minecraft.u.aj.q : net.minecraft.u.aj.p, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    protected void cn_() {
        if (this.i.isEmpty()) {
            this.bk();
            this.o(false);
        } else {
            Collection collection = this.i.values();
            this.bE.b(e, net.minecraft.w.l.a(collection));
            this.bE.b(d, net.minecraft.d.m.a(collection));
            this.o(this.b(net.minecraft.a.c.n));
        }
    }

    public static boolean a(Collection collection) {
        for (j j2 : collection) {
            if (j2.d()) continue;
            return false;
        }
        return true;
    }

    protected void bk() {
        this.bE.b(e, false);
        this.bE.b(d, 0);
    }

    public void bl() {
        if (!this.aQ.C) {
            Iterator iterator = this.i.values().iterator();
            while (iterator.hasNext()) {
                this.b((j)iterator.next());
                iterator.remove();
            }
        }
    }

    public Collection bm() {
        return this.i.values();
    }

    public boolean b(net.minecraft.d.c c2) {
        return this.i.containsKey(c2);
    }

    public j c(net.minecraft.d.c c2) {
        return (j)this.i.get(c2);
    }

    public void c(j j2) {
        if (this.d(j2)) {
            j j3 = (j)this.i.get(j2.a());
            if (j3 == null) {
                this.i.put(j2.a(), j2);
                this.a(j2);
            } else {
                j3.a(j2);
                this.a(j3, true);
            }
        }
    }

    public boolean d(j j2) {
        net.minecraft.d.c c2;
        return this.bB() != net.minecraft.w.ae.b || (c2 = j2.a()) != net.minecraft.a.c.j && c2 != net.minecraft.a.c.s;
    }

    public boolean bn() {
        return this.bB() == net.minecraft.w.ae.b;
    }

    public j a(net.minecraft.d.c c2) {
        return (j)this.i.remove(c2);
    }

    public void d(net.minecraft.d.c c2) {
        j j2 = this.a(c2);
        if (j2 != null) {
            this.b(j2);
        }
    }

    protected void a(j j2) {
        this.n = true;
        if (!this.aQ.C) {
            j2.a().b(this, this.bA(), j2.c());
        }
    }

    protected void a(j j2, boolean bl2) {
        this.n = true;
        if (bl2 && !this.aQ.C) {
            net.minecraft.d.c c2 = j2.a();
            c2.a(this, this.bA(), j2.c());
            c2.b(this, this.bA(), j2.c());
        }
    }

    protected void b(j j2) {
        this.n = true;
        if (!this.aQ.C) {
            j2.a().a(this, this.bA(), j2.c());
        }
    }

    public void a(float f2) {
        float f3 = this.bo();
        if (f3 > 0.0f) {
            this.h(f3 + f2);
        }
    }

    public final float bo() {
        return ((Float)this.bE.a(c)).floatValue();
    }

    public void h(float f2) {
        this.bE.b(c, Float.valueOf(net.minecraft.u.b.n.a(f2, 0.0f, this.bw())));
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        Object object;
        if (this instanceof net.minecraft.l.b.b) {
            return false;
        }
        if (this.b(n2)) {
            return false;
        }
        if (this.aQ.C) {
            return false;
        }
        this.as = 0;
        if (this.bo() <= 0.0f) {
            return false;
        }
        if (n2.o() && this.b(net.minecraft.a.c.l)) {
            return false;
        }
        if ((n2 == net.minecraft.u.n.p || n2 == net.minecraft.u.n.q) && this.a(k.f) != null) {
            this.a(k.f).a((int)(f2 * 4.0f + this.bx.nextFloat() * f2 * 2.0f), this);
            f2 *= 0.75f;
        }
        boolean bl2 = false;
        if (f2 > 0.0f && this.d(n2)) {
            this.d(f2);
            if (n2.a()) {
                f2 = 0.0f;
            } else {
                f2 *= 0.33f;
                if (n2.i() instanceof l) {
                    ((l)n2.i()).a(this, 0.5f, this.aU - n2.i().aU, this.aW - n2.i().aW);
                }
            }
            bl2 = true;
        }
        this.ad = 1.5f;
        boolean bl3 = true;
        if ((float)this.bB > (float)this.af / 2.0f) {
            if (f2 <= this.az) {
                return false;
            }
            this.b(n2, f2 - this.az);
            this.az = f2;
            bl3 = false;
        } else {
            this.az = f2;
            this.bB = this.af;
            this.b(n2, f2);
            this.V = this.W = 10;
        }
        this.X = 0.0f;
        n n3 = n2.j();
        if (n3 != null) {
            if (n3 instanceof l) {
                this.a((l)n3);
            }
            if (n3 instanceof net.minecraft.w.a.b) {
                this.aq = 100;
                this.ap = (net.minecraft.w.a.b)n3;
            } else if (n3 instanceof net.minecraft.w.h.e && ((ai)(object = (net.minecraft.w.h.e)n3)).z()) {
                this.aq = 100;
                this.ap = null;
            }
        }
        if (bl3) {
            if (bl2) {
                this.aQ.a((n)this, (byte)29);
            } else if (n2 instanceof p && ((p)n2).x()) {
                this.aQ.a((n)this, (byte)33);
            } else {
                this.aQ.a((n)this, (byte)2);
            }
            if (n2 != net.minecraft.u.n.g && (!bl2 || f2 > 0.0f)) {
                this.bN();
            }
            if (n3 != null) {
                double d2 = n3.aU - this.aU;
                double d3 = n3.aW - this.aW;
                while (d2 * d2 + d3 * d3 < 1.0E-4) {
                    d2 = (Math.random() - Math.random()) * 0.01;
                    d3 = (Math.random() - Math.random()) * 0.01;
                }
                this.X = (float)(net.minecraft.u.b.n.b(d3, d2) * 57.29577951308232 - (double)this.ba);
                this.a(n3, 0.4f, d2, d3);
            } else {
                this.X = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.bo() <= 0.0f) {
            object = this.cd_();
            if (bl3 && object != null) {
                this.a((bv)object, this.bE(), this.bF());
            }
            this.a(n2);
        } else if (bl3) {
            this.c(n2);
        }
        if (!bl2 || f2 > 0.0f) {
            this.w = n2;
            this.x = this.aQ.B();
        }
        return !bl2 || f2 > 0.0f;
    }

    public net.minecraft.u.n bp() {
        if (this.aQ.B() - this.x > 40L) {
            this.w = null;
        }
        return this.w;
    }

    protected void c(net.minecraft.u.n n2) {
        bv bv2 = this.cc_();
        if (bv2 != null) {
            this.a(bv2, this.bE(), this.bF());
        }
    }

    private boolean d(net.minecraft.u.n n2) {
        s s2;
        if (!n2.e() && this.bV() && (s2 = n2.v()) != null) {
            s s3 = this.i(1.0f);
            s s4 = s2.a(new s(this.aU, this.aV, this.aW)).a();
            s4 = new s(s4.b, 0.0, s4.d);
            if (s4.b(s3) < 0.0) {
                return true;
            }
        }
        return false;
    }

    public void e(cu cu2) {
        this.a(net.minecraft.a.f.cZ, 0.8f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
        for (int i2 = 0; i2 < 5; ++i2) {
            s s2 = new s(((double)this.bx.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            s2 = s2.a(-this.bb * ((float)Math.PI / 180));
            s2 = s2.b(-this.ba * ((float)Math.PI / 180));
            double d2 = (double)(-this.bx.nextFloat()) * 0.6 - 0.3;
            s s3 = new s(((double)this.bx.nextFloat() - 0.5) * 0.3, d2, 0.6);
            s3 = s3.a(-this.bb * ((float)Math.PI / 180));
            s3 = s3.b(-this.ba * ((float)Math.PI / 180));
            s3 = s3.b(this.aU, this.aV + (double)this.ce_(), this.aW);
            this.aQ.a(net.minecraft.u.aj.K, s3.b, s3.c, s3.d, s2.b, s2.c + 0.05, s2.d, cg.a(cu2.a()));
        }
    }

    public void a(net.minecraft.u.n n2) {
        if (!this.ar) {
            n n3 = n2.j();
            l l2 = this.bv();
            if (this.ay >= 0 && l2 != null) {
                l2.a((n)this, this.ay);
            }
            if (n3 != null) {
                n3.b(this);
            }
            this.ar = true;
            this.bu().e();
            if (!this.aQ.C) {
                int n4 = 0;
                if (n3 instanceof net.minecraft.w.a.b) {
                    n4 = net.minecraft.o.f.h((l)n3);
                }
                if (this.bc() && this.aQ.G().b("doMobLoot")) {
                    boolean bl2 = this.aq > 0;
                    this.a(bl2, n4, n2);
                }
            }
            this.aQ.a((n)this, (byte)3);
        }
    }

    protected void a(boolean bl2, int n2, net.minecraft.u.n n3) {
        this.a(bl2, n2);
        this.b(bl2, n2);
    }

    protected void b(boolean bl2, int n2) {
    }

    public void a(n n2, float f2, double d2, double d3) {
        if (this.bx.nextDouble() >= this.a(net.minecraft.w.d.c).f()) {
            this.bO = true;
            float f3 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3);
            this.aX /= 2.0;
            this.aZ /= 2.0;
            this.aX -= d2 / (double)f3 * (double)f2;
            this.aZ -= d3 / (double)f3 * (double)f2;
            if (this.be) {
                this.aY /= 2.0;
                this.aY += (double)f2;
                if (this.aY > (double)0.4f) {
                    this.aY = 0.4f;
                }
            }
        }
    }

    protected bv cc_() {
        return net.minecraft.a.f.bH;
    }

    protected bv cd_() {
        return net.minecraft.a.f.bC;
    }

    protected bv d(int n2) {
        return n2 > 4 ? net.minecraft.a.f.bA : net.minecraft.a.f.bI;
    }

    protected void a(boolean bl2, int n2) {
    }

    public boolean bq() {
        int n2 = net.minecraft.u.b.n.c(this.aU);
        int n3 = net.minecraft.u.b.n.c(this.cT().b);
        int n4 = net.minecraft.u.b.n.c(this.aW);
        if (this instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)this).a()) {
            return false;
        }
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2, n3, n4);
        net.minecraft.g.c.b b3 = this.aQ.n(b2);
        cn cn2 = b3.c();
        return cn2 != net.minecraft.a.p.au && cn2 != net.minecraft.a.p.bn ? cn2 instanceof au && this.a(b2, b3) : true;
    }

    private boolean a(net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        net.minecraft.g.c.b b4;
        return (Boolean)b3.a(net.minecraft.g.au.b) != false && (b4 = this.aQ.n(b2.c())).c() == net.minecraft.a.p.au && b4.a(cq.a) == b3.a(net.minecraft.g.au.a);
    }

    @Override
    public boolean br() {
        return !this.bk && this.bo() > 0.0f;
    }

    @Override
    public void c(float f2, float f3) {
        super.c(f2, f3);
        j j2 = this.c(net.minecraft.a.c.h);
        float f4 = j2 == null ? 0.0f : (float)(j2.c() + 1);
        int n2 = net.minecraft.u.b.n.f((f2 - 3.0f - f4) * f3);
        if (n2 > 0) {
            this.a(this.d(n2), 1.0f, 1.0f);
            this.a(net.minecraft.u.n.j, (float)n2);
            int n3 = net.minecraft.u.b.n.c(this.aU);
            int n4 = net.minecraft.u.b.n.c(this.aV - (double)0.2f);
            int n5 = net.minecraft.u.b.n.c(this.aW);
            net.minecraft.g.c.b b2 = this.aQ.n(new net.minecraft.u.b.b(n3, n4, n5));
            if (b2.d() != net.minecraft.g.a.h.a) {
                fk fk2 = b2.c().w();
                this.a(fk2.g(), fk2.a() * 0.5f, fk2.b() * 0.75f);
            }
        }
    }

    @Override
    public void bs() {
        this.V = this.W = 10;
        this.X = 0.0f;
    }

    public int bt() {
        i i2 = this.a(net.minecraft.w.d.g);
        return net.minecraft.u.b.n.c(i2.f());
    }

    protected void c(float f2) {
    }

    protected void d(float f2) {
    }

    protected float c(net.minecraft.u.n n2, float f2) {
        if (!n2.e()) {
            this.c(f2);
            f2 = net.minecraft.u.h.a(f2, this.bt(), (float)this.a(net.minecraft.w.d.h).f());
        }
        return f2;
    }

    protected float d(net.minecraft.u.n n2, float f2) {
        int n3;
        if (n2.h()) {
            return f2;
        }
        if (this.b(net.minecraft.a.c.k) && n2 != net.minecraft.u.n.l) {
            n3 = (this.c(net.minecraft.a.c.k).c() + 1) * 5;
            int n4 = 25 - n3;
            float f3 = f2 * (float)n4;
            f2 = f3 / 25.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        n3 = net.minecraft.o.f.a(this.ax(), n2);
        if (n3 > 0) {
            f2 = net.minecraft.u.h.a(f2, n3);
        }
        return f2;
    }

    protected void b(net.minecraft.u.n n2, float f2) {
        if (!this.b(n2)) {
            f2 = this.c(n2, f2);
            float f3 = f2 = this.d(n2, f2);
            f2 = Math.max(f2 - this.aB(), 0.0f);
            this.f(this.aB() - (f3 - f2));
            if (f2 != 0.0f) {
                float f4 = this.bo();
                this.h(f4 - f2);
                this.bu().a(n2, f4, f2);
                this.f(this.aB() - f2);
            }
        }
    }

    public net.minecraft.u.i bu() {
        return this.h;
    }

    public l bv() {
        return this.h.c() != null ? this.h.c() : (this.ap != null ? this.ap : (this.o != null ? this.o : null));
    }

    public final float bw() {
        return (float)this.a(net.minecraft.w.d.a).f();
    }

    public final int bx() {
        return (Integer)this.bE.a(f);
    }

    public final void i(int n2) {
        this.bE.b(f, n2);
    }

    private int a() {
        return this.b(net.minecraft.a.c.c) ? 6 - (1 + this.c(net.minecraft.a.c.c).c()) : (this.b(net.minecraft.a.c.d) ? 6 + (1 + this.c(net.minecraft.a.c.d).c()) * 2 : 6);
    }

    public void a(ah ah2) {
        if (!this.R || this.T >= this.a() / 2 || this.T < 0) {
            this.T = -1;
            this.R = true;
            this.S = ah2;
            if (this.aQ instanceof v) {
                ((v)this.aQ).ae().a(this, new aj(this, ah2 == net.minecraft.u.ah.a ? 0 : 3));
            }
        }
    }

    @Override
    public void a(byte by2) {
        boolean bl2;
        boolean bl3 = bl2 = by2 == 33;
        if (by2 != 2 && !bl2) {
            if (by2 == 3) {
                bv bv2 = this.cd_();
                if (bv2 != null) {
                    this.a(bv2, this.bE(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
                }
                this.h(0.0f);
                this.a(net.minecraft.u.n.m);
            } else if (by2 == 30) {
                this.a(net.minecraft.a.f.fd, 0.8f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
            } else if (by2 == 29) {
                this.a(net.minecraft.a.f.fc, 1.0f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
            } else {
                super.a(by2);
            }
        } else {
            bv bv3;
            this.ad = 1.5f;
            this.bB = this.af;
            this.V = this.W = 10;
            this.X = 0.0f;
            if (bl2) {
                this.a(net.minecraft.a.f.gy, this.bE(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            if ((bv3 = this.cc_()) != null) {
                this.a(bv3, this.bE(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            this.a(net.minecraft.u.n.m, 0.0f);
        }
    }

    @Override
    protected void by() {
        this.a(net.minecraft.u.n.l, 4.0f);
    }

    protected void bz() {
        int n2 = this.a();
        if (this.R) {
            ++this.T;
            if (this.T >= n2) {
                this.T = 0;
                this.R = false;
            }
        } else {
            this.T = 0;
        }
        this.aa = (float)this.T / (float)n2;
    }

    public i a(net.minecraft.w.b.a.f f2) {
        return this.bA().a(f2);
    }

    public b bA() {
        if (this.g == null) {
            this.g = new e();
        }
        return this.g;
    }

    public ae bB() {
        return net.minecraft.w.ae.a;
    }

    public cu bC() {
        return this.a(k.a);
    }

    public cu bD() {
        return this.a(k.b);
    }

    public cu c(ah ah2) {
        if (ah2 == net.minecraft.u.ah.a) {
            return this.a(k.a);
        }
        if (ah2 == net.minecraft.u.ah.b) {
            return this.a(k.b);
        }
        throw new IllegalArgumentException("Invalid hand " + (Object)((Object)ah2));
    }

    public void a(ah ah2, cu cu2) {
        if (ah2 == net.minecraft.u.ah.a) {
            this.a(k.a, cu2);
        } else {
            if (ah2 != net.minecraft.u.ah.b) {
                throw new IllegalArgumentException("Invalid hand " + (Object)((Object)ah2));
            }
            this.a(k.b, cu2);
        }
    }

    @Override
    public abstract Iterable ax();

    public abstract cu a(k var1);

    @Override
    public abstract void a(k var1, cu var2);

    @Override
    public void b(boolean bl2) {
        super.b(bl2);
        i i2 = this.a(net.minecraft.w.d.d);
        if (i2.a(a) != null) {
            i2.c(b);
        }
        if (bl2) {
            i2.b(b);
        }
    }

    protected float bE() {
        return 1.0f;
    }

    protected float bF() {
        return this.ba() ? (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.5f : (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f;
    }

    protected boolean T() {
        return this.bo() <= 0.0f;
    }

    public void i(n n2) {
        if (!(n2 instanceof ab) && !(n2 instanceof al)) {
            double d2 = n2.aU;
            double d3 = n2.cT().b + (double)n2.bm;
            double d4 = n2.aW;
            ad ad2 = n2.cR();
            ad ad3 = ad2.f();
            int[][] arrarrn = new int[9][];
            int[] arrn = new int[2];
            arrn[1] = 1;
            arrarrn[0] = arrn;
            int[] arrn2 = new int[2];
            arrn2[1] = -1;
            arrarrn[1] = arrn2;
            arrarrn[2] = new int[]{-1, 1};
            arrarrn[3] = new int[]{-1, -1};
            arrarrn[4] = new int[]{1, 1};
            arrarrn[5] = new int[]{1, -1};
            int[] arrn3 = new int[2];
            arrn3[0] = -1;
            arrarrn[6] = arrn3;
            int[] arrn4 = new int[2];
            arrn4[0] = 1;
            arrarrn[7] = arrn4;
            int[] arrn5 = new int[2];
            arrn5[1] = 1;
            arrarrn[8] = arrn5;
            int[][] arrarrn2 = arrarrn;
            double d5 = Math.floor(this.aU) + 0.5;
            double d6 = Math.floor(this.aW) + 0.5;
            double d7 = this.cT().d - this.cT().a;
            double d8 = this.cT().f - this.cT().c;
            net.minecraft.u.b.a a2 = new net.minecraft.u.b.a(d5 - d7 / 2.0, this.cT().b, d6 - d8 / 2.0, d5 + d7 / 2.0, this.cT().e, d6 + d8 / 2.0);
            int[][] arrarrn3 = arrarrn2;
            int n3 = arrarrn2.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                int[] arrn6 = arrarrn3[i2];
                double d9 = ad2.h() * arrn6[0] + ad3.h() * arrn6[1];
                double d10 = ad2.j() * arrn6[0] + ad3.j() * arrn6[1];
                double d11 = d5 + d9;
                double d12 = d6 + d10;
                net.minecraft.u.b.a a3 = a2.c(d9, 1.0, d10);
                if (!this.aQ.b(a3)) {
                    if (this.aQ.n(new net.minecraft.u.b.b(d11, this.aV, d12)).t()) {
                        this.d(d11, this.aV + 1.0, d12);
                        return;
                    }
                    net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(d11, this.aV - 1.0, d12);
                    if (!this.aQ.n(b2).t() && this.aQ.n(b2).d() != net.minecraft.g.a.h.h) continue;
                    d2 = d11;
                    d3 = this.aV + 1.0;
                    d4 = d12;
                    continue;
                }
                if (this.aQ.b(a3.c(0.0, 1.0, 0.0)) || !this.aQ.n(new net.minecraft.u.b.b(d11, this.aV + 1.0, d12)).t()) continue;
                d2 = d11;
                d3 = this.aV + 2.0;
                d4 = d12;
            }
            this.d(d2, d3, d4);
        } else {
            double d13 = (double)(this.bl / 2.0f + n2.bl / 2.0f) + 0.4;
            float f2 = n2 instanceof ab ? 0.0f : 1.5707964f * (float)(this.aH() == net.minecraft.u.ai.b ? -1 : 1);
            float f3 = -net.minecraft.u.b.n.a(-this.ba * ((float)Math.PI / 180) - (float)Math.PI + f2);
            float f4 = -net.minecraft.u.b.n.b(-this.ba * ((float)Math.PI / 180) - (float)Math.PI + f2);
            double d14 = Math.abs(f3) > Math.abs(f4) ? d13 / (double)Math.abs(f3) : d13 / (double)Math.abs(f4);
            double d15 = this.aU + (double)f3 * d14;
            double d16 = this.aW + (double)f4 * d14;
            this.e(d15, n2.aV + (double)n2.bm + 0.001, d16);
            if (this.aQ.b(this.cT())) {
                this.e(d15, n2.aV + (double)n2.bm + 1.001, d16);
                if (this.aQ.b(this.cT())) {
                    this.e(n2.aU, n2.aV + (double)this.bm + 0.001, n2.aW);
                }
            }
        }
    }

    @Override
    public boolean at() {
        return this.cQ();
    }

    protected float bG() {
        return 0.42f;
    }

    protected void aj() {
        if (this instanceof net.minecraft.l.b.b) {
            this.aY = (double)this.bG() * 1.4;
            new c(this, (net.minecraft.l.b.b)this).run();
        } else {
            this.aY = this.bG();
        }
        if (this.b(net.minecraft.a.c.h)) {
            this.aY += (double)((float)(this.c(net.minecraft.a.c.h).c() + 1) * 0.1f);
        }
        if (this.cB()) {
            float f2 = this.ba * ((float)Math.PI / 180);
            this.aX -= (double)(net.minecraft.u.b.n.a(f2) * 0.2f);
            this.aZ += (double)(net.minecraft.u.b.n.b(f2) * 0.2f);
        }
        this.bO = true;
    }

    protected void bH() {
        this.aY += (double)0.04f;
    }

    protected void bI() {
        this.aY += (double)0.04f;
    }

    protected float bJ() {
        return 0.8f;
    }

    public void b(float f2, float f3) {
        double d2;
        if (this.A() || this.de()) {
            if (!this.cm() || this instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)this).J.b) {
                if (!this.cq() || this instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)this).J.b) {
                    if (this.bW()) {
                        double d3;
                        float f4;
                        double d4;
                        if (this.aY > -0.5) {
                            this.bq = 1.0f;
                        }
                        s s2 = this.bL();
                        float f5 = this.bb * ((float)Math.PI / 180);
                        d2 = Math.sqrt(s2.b * s2.b + s2.d * s2.d);
                        double d5 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
                        double d6 = s2.b();
                        float f6 = net.minecraft.u.b.n.b(f5);
                        f6 = (float)((double)f6 * (double)f6 * Math.min(1.0, d6 / 0.4));
                        this.aY += -0.08 + (double)f6 * 0.06;
                        if (this.aY < 0.0 && d2 > 0.0) {
                            d4 = this.aY * -0.1 * (double)f6;
                            this.aY += d4;
                            this.aX += s2.b * d4 / d2;
                            this.aZ += s2.d * d4 / d2;
                        }
                        if (f5 < 0.0f) {
                            d4 = d5 * (double)(-net.minecraft.u.b.n.a(f5)) * 0.04;
                            this.aY += d4 * 3.2;
                            this.aX -= s2.b * d4 / d2;
                            this.aZ -= s2.d * d4 / d2;
                        }
                        if (d2 > 0.0) {
                            this.aX += (s2.b / d2 * d5 - this.aX) * 0.1;
                            this.aZ += (s2.d / d2 * d5 - this.aZ) * 0.1;
                        }
                        this.aX *= (double)0.99f;
                        this.aY *= (double)0.98f;
                        this.aZ *= (double)0.99f;
                        this.b(this.aX, this.aY, this.aZ);
                        if (this.bf && !this.aQ.C && (f4 = (float)((d3 = d5 - (d4 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ))) * 10.0 - 3.0)) > 0.0f) {
                            this.a(this.d((int)f4), 1.0f, 1.0f);
                            this.a(net.minecraft.u.n.k, f4);
                        }
                        if (this.be && !this.aQ.C) {
                            this.a(7, false);
                        }
                    } else {
                        float f7 = 0.91f;
                        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.c(this.aU, this.cT().b - 1.0, this.aW);
                        if (this.be) {
                            f7 = this.aQ.n((net.minecraft.u.b.b)h2).c().N * 0.91f;
                        }
                        float f8 = 0.16277136f / (f7 * f7 * f7);
                        float f9 = this.be ? this.ak() * f8 : this.ao;
                        this.a(f2, f3, f9, false);
                        f7 = 0.91f;
                        if (this.be) {
                            f7 = this.aQ.n((net.minecraft.u.b.b)h2.d((double)this.aU, (double)(this.cT().b - 1.0), (double)this.aW)).c().N * 0.91f;
                        }
                        if (this.bq()) {
                            boolean bl2;
                            float f10 = 0.15f;
                            this.aX = net.minecraft.u.b.n.a(this.aX, (double)-0.15f, (double)0.15f);
                            this.aZ = net.minecraft.u.b.n.a(this.aZ, (double)-0.15f, (double)0.15f);
                            this.bq = 0.0f;
                            if (this.aY < -0.15) {
                                this.aY = -0.15;
                            }
                            boolean bl3 = bl2 = this.G() && this instanceof net.minecraft.w.a.b;
                            if (bl2 && this.aY < 0.0) {
                                this.aY = 0.0;
                            }
                        }
                        this.b(this.aX, this.aY, this.aZ);
                        if (this.bf && this.bq()) {
                            this.aY = 0.2;
                        }
                        if (this.b(net.minecraft.a.c.y)) {
                            this.aY += (0.05 * (double)(this.c(net.minecraft.a.c.y).c() + 1) - this.aY) * 0.2;
                        } else {
                            h2.d(this.aU, 0.0, this.aW);
                            if (!this.aQ.C || this.aQ.d(h2) && this.aQ.e(h2).p()) {
                                if (!this.ci()) {
                                    this.aY -= 0.08;
                                }
                            } else {
                                this.aY = this.aV > 0.0 ? -0.1 : 0.0;
                            }
                        }
                        this.aY *= (double)0.98f;
                        this.aX *= (double)f7;
                        this.aZ *= (double)f7;
                        h2.n();
                    }
                } else {
                    double d7 = this.aV;
                    this.a(f2, f3, 0.02f, false);
                    this.b(this.aX, this.aY, this.aZ);
                    this.aX *= 0.5;
                    this.aY *= 0.5;
                    this.aZ *= 0.5;
                    if (!this.ci()) {
                        this.aY -= 0.02;
                    }
                    if (this.bf && this.g(this.aX, this.aY + (double)0.6f - this.aV + d7, this.aZ)) {
                        this.aY = 0.3f;
                    }
                }
            } else {
                double d8 = this.aV;
                float f11 = this.bJ();
                float f12 = 0.02f;
                float f13 = net.minecraft.o.f.d(this);
                if (f13 > 3.0f) {
                    f13 = 3.0f;
                }
                if (!this.be) {
                    f13 *= 0.5f;
                }
                if (f13 > 0.0f) {
                    f11 += (0.54600006f - f11) * f13 / 3.0f;
                    f12 += (this.ak() - f12) * f13 / 3.0f;
                }
                this.a(f2, f3, f12, true);
                this.b(this.aX, this.aY, this.aZ);
                this.aX *= (double)f11;
                this.aY *= (double)0.8f;
                this.aZ *= (double)f11;
                if (!this.ci()) {
                    this.aY -= 0.02;
                }
                if (this.bf && this.g(this.aX, this.aY + (double)0.6f - this.aV + d8, this.aZ)) {
                    this.aY = 0.3f;
                }
            }
        }
        this.ac = this.ad;
        double d9 = this.aU - this.aR;
        d2 = this.aW - this.aT;
        float f14 = net.minecraft.u.b.n.a(d9 * d9 + d2 * d2) * 4.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        this.ad += (f14 - this.ad) * 0.4f;
        this.ae += this.ad;
    }

    public float ak() {
        return this.s;
    }

    public void e_(float f2) {
        this.s = f2;
    }

    public boolean j(n n2) {
        this.h(n2);
        return false;
    }

    public boolean ae() {
        return false;
    }

    @Override
    public void cE_() {
        super.cE_();
        this.bQ();
        if (!this.aQ.C) {
            int n2 = this.bx();
            if (n2 > 0) {
                if (this.U <= 0) {
                    this.U = 20 * (30 - n2);
                }
                --this.U;
                if (this.U <= 0) {
                    this.i(n2 - 1);
                }
            }
            block8: for (k k2 : k.values()) {
                cu cu2;
                switch (k2.a()) {
                    case a: {
                        cu2 = this.l[k2.b()];
                        break;
                    }
                    case b: {
                        cu2 = this.m[k2.b()];
                        break;
                    }
                    default: {
                        continue block8;
                    }
                }
                cu cu3 = this.a(k2);
                if (cu.b(cu3, cu2)) continue;
                ((v)this.aQ).ae().a(this, new net.minecraft.x.d.b.n(this.ca(), k2, cu3));
                if (cu2 != null) {
                    this.bA().a(cu2.a(k2));
                }
                if (cu3 != null) {
                    this.bA().b(cu3.a(k2));
                }
                switch (k2.a()) {
                    case a: {
                        this.l[k2.b()] = cu3 == null ? null : cu3.j();
                        continue block8;
                    }
                    case b: {
                        this.m[k2.b()] = cu3 == null ? null : cu3.j();
                    }
                }
            }
            if (this.by % 20 == 0) {
                this.bu().e();
            }
            if (!this.bY) {
                boolean bl2 = this.b(net.minecraft.a.c.x);
                if (this.m(6) != bl2) {
                    this.a(6, bl2);
                }
            }
        }
        this.n();
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f2 = (float)(d2 * d2 + d3 * d3);
        float f3 = this.ak;
        float f4 = 0.0f;
        this.at = this.au;
        float f5 = 0.0f;
        if (f2 > 0.0025000002f) {
            f5 = 1.0f;
            f4 = (float)Math.sqrt(f2) * 3.0f;
            f3 = (float)net.minecraft.u.b.n.b(d3, d2) * 57.295776f - 90.0f;
        }
        if (this.aa > 0.0f) {
            f3 = this.ba;
        }
        if (!this.be) {
            f5 = 0.0f;
        }
        this.au += (f5 - this.au) * 0.3f;
        this.aQ.A.a("headTurn");
        f4 = this.b_(f3, f4);
        this.aQ.A.b();
        this.aQ.A.a("rangeChecks");
        while (this.ba - this.bc < -180.0f) {
            this.bc -= 360.0f;
        }
        while (this.ba - this.bc >= 180.0f) {
            this.bc += 360.0f;
        }
        while (this.ak - this.al < -180.0f) {
            this.al -= 360.0f;
        }
        while (this.ak - this.al >= 180.0f) {
            this.al += 360.0f;
        }
        while (this.bb - this.bd < -180.0f) {
            this.bd -= 360.0f;
        }
        while (this.bb - this.bd >= 180.0f) {
            this.bd += 360.0f;
        }
        while (this.am - this.an < -180.0f) {
            this.an -= 360.0f;
        }
        while (this.am - this.an >= 180.0f) {
            this.an += 360.0f;
        }
        this.aQ.A.b();
        this.av += f4;
        this.aM = this.bW() ? ++this.aM : 0;
    }

    protected float b_(float f2, float f3) {
        boolean bl2;
        float f4 = net.minecraft.u.b.n.g(f2 - this.ak);
        this.ak += f4 * 0.3f;
        float f5 = net.minecraft.u.b.n.g(this.ba - this.ak);
        boolean bl3 = bl2 = f5 < -90.0f || f5 >= 90.0f;
        if (f5 < -75.0f) {
            f5 = -75.0f;
        }
        if (f5 >= 75.0f) {
            f5 = 75.0f;
        }
        this.ak = this.ba - f5;
        if (f5 * f5 > 2500.0f) {
            this.ak += f5 * 0.2f;
        }
        if (bl2) {
            f3 *= -1.0f;
        }
        return f3;
    }

    public void n() {
        if (this.t > 0) {
            --this.t;
        }
        if (this.aE > 0 && !this.de()) {
            double d2 = this.aU + (this.aF - this.aU) / (double)this.aE;
            double d3 = this.aV + (this.aG - this.aV) / (double)this.aE;
            double d4 = this.aW + (this.aH - this.aW) / (double)this.aE;
            double d5 = net.minecraft.u.b.n.g(this.aI - (double)this.ba);
            this.ba = (float)((double)this.ba + d5 / (double)this.aE);
            this.bb = (float)((double)this.bb + (this.aJ - (double)this.bb) / (double)this.aE);
            --this.aE;
            this.e(d2, d3, d4);
            this.e(this.ba, this.bb);
        } else if (!this.A()) {
            this.aX *= 0.98;
            this.aY *= 0.98;
            this.aZ *= 0.98;
        }
        if (Math.abs(this.aX) < 0.003) {
            this.aX = 0.0;
        }
        if (Math.abs(this.aY) < 0.003) {
            this.aY = 0.0;
        }
        if (Math.abs(this.aZ) < 0.003) {
            this.aZ = 0.0;
        }
        this.aQ.A.a("ai");
        if (this.T()) {
            this.aA = false;
            this.aB = 0.0f;
            this.aC = 0.0f;
            this.aD = 0.0f;
        } else if (this.A()) {
            this.aQ.A.a("newAi");
            this.H();
            this.aQ.A.b();
        }
        this.aQ.A.b();
        this.aQ.A.a("jump");
        if (this.aA) {
            if (this.cm()) {
                if (this instanceof net.minecraft.l.b.b) {
                    this.aC = 0.05f;
                }
                this.bH();
            } else if (this.cq()) {
                this.bI();
            } else if (this.be && this.t == 0) {
                this.aj();
                this.t = 10;
            }
        } else {
            this.t = 0;
        }
        this.aQ.A.b();
        this.aQ.A.a("travel");
        this.aB *= 0.98f;
        this.aC *= 0.98f;
        this.aD *= 0.9f;
        this.i();
        this.b(this.aB, this.aC);
        this.aQ.A.b();
        this.aQ.A.a("push");
        this.bK();
        this.aQ.A.b();
    }

    private void i() {
        boolean bl2 = this.m(7);
        if (bl2 && !this.be && !this.cz()) {
            cu cu2 = this.a(k.e);
            if (cu2 != null && cu2.a() == net.minecraft.a.w.cR && net.minecraft.m.by.h(cu2)) {
                bl2 = true;
                if (!this.aQ.C && (this.aM + 1) % 20 == 0) {
                    cu2.a(1, this);
                }
            } else {
                bl2 = false;
            }
        } else {
            bl2 = false;
        }
        if (!this.aQ.C) {
            this.a(7, bl2);
        }
    }

    protected void H() {
    }

    protected void bK() {
        List list = this.aQ.a((n)this, this.cT(), net.minecraft.u.r.a(this));
        if (!list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                n n2 = (n)list.get(i2);
                this.k(n2);
            }
        }
    }

    protected void k(n n2) {
        n2.d(this);
    }

    @Override
    public void o() {
        n n2 = this.df();
        super.o();
        if (n2 != null && n2 != this.df() && !this.aQ.C) {
            this.i(n2);
        }
    }

    @Override
    public void J() {
        super.J();
        this.at = this.au;
        this.au = 0.0f;
        this.bq = 0.0f;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.aF = d2;
        this.aG = d3;
        this.aH = d4;
        this.aI = f2;
        this.aJ = f3;
        this.aE = n2;
    }

    public void i(boolean bl2) {
        this.aA = bl2;
    }

    public void b(n n2, int n3) {
        if (!n2.bk && !this.aQ.C) {
            w w2 = ((v)this.aQ).ae();
            if (n2 instanceof net.minecraft.w.f.ae) {
                w2.a(n2, new net.minecraft.x.d.b.au(n2.ca(), this.ca()));
            }
            if (n2 instanceof f) {
                w2.a(n2, new net.minecraft.x.d.b.au(n2.ca(), this.ca()));
            }
            if (n2 instanceof net.minecraft.w.f.e) {
                w2.a(n2, new net.minecraft.x.d.b.au(n2.ca(), this.ca()));
            }
        }
    }

    public boolean l(n n2) {
        return this.aQ.a(new s(this.aU, this.aV + (double)this.ce_(), this.aW), new s(n2.aU, n2.aV + (double)n2.ce_(), n2.aW), false, true, false) == null;
    }

    @Override
    public s bL() {
        return this.i(1.0f);
    }

    @Override
    public s i(float f2) {
        if (f2 == 1.0f) {
            return this.g(this.bb, this.am);
        }
        float f3 = this.bd + (this.bb - this.bd) * f2;
        float f4 = this.an + (this.am - this.an) * f2;
        return this.g(f3, f4);
    }

    public float j(float f2) {
        float f3 = this.aa - this.Z;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        return this.Z + f3 * f2;
    }

    public boolean A() {
        return !this.aQ.C;
    }

    @Override
    public boolean cg_() {
        return !this.bk;
    }

    @Override
    public boolean bM() {
        return !this.bk;
    }

    @Override
    protected void bN() {
        this.bi = this.bx.nextDouble() >= this.a(net.minecraft.w.d.c).f();
    }

    @Override
    public float bO() {
        return this.am;
    }

    @Override
    public void k(float f2) {
        this.am = f2;
    }

    @Override
    public void l(float f2) {
        this.ak = f2;
    }

    public float aB() {
        return this.u;
    }

    public void f(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.u = f2;
    }

    public void ch_() {
    }

    public void ci_() {
    }

    protected void bP() {
        this.n = true;
    }

    public abstract net.minecraft.u.ai aH();

    public boolean B() {
        return ((Byte)this.bE.a(Q) & 1) > 0;
    }

    public ah D() {
        return ((Byte)this.bE.a(Q) & 2) > 0 ? net.minecraft.u.ah.b : net.minecraft.u.ah.a;
    }

    protected void bQ() {
        if (this.B()) {
            cu cu2 = this.c(this.D());
            if (cu2 == this.aK) {
                if (this.bS() <= 25 && this.bS() % 4 == 0) {
                    this.a(this.aK, 5);
                }
                if (--this.aL == 0 && !this.aQ.C) {
                    this.co_();
                }
            } else {
                this.C();
            }
        }
    }

    public void b(ah ah2) {
        cu cu2 = this.c(ah2);
        if (cu2 != null && !this.B()) {
            this.aK = cu2;
            this.aL = cu2.l();
            if (!this.aQ.C) {
                int n2 = 1;
                if (ah2 == net.minecraft.u.ah.b) {
                    n2 |= 2;
                }
                this.bE.b(Q, (byte)n2);
            }
        }
    }

    @Override
    public void a(net.minecraft.x.a.g g2) {
        super.a(g2);
        if (Q.equals(g2) && this.aQ.C) {
            if (this.B() && this.aK == null) {
                this.aK = this.c(this.D());
                if (this.aK != null) {
                    this.aL = this.aK.l();
                }
            } else if (!this.B() && this.aK != null) {
                this.aK = null;
                this.aL = 0;
            }
        }
    }

    protected void a(cu cu2, int n2) {
        if (cu2 != null && this.B()) {
            if (cu2.m() == net.minecraft.m.av.c) {
                this.a(net.minecraft.a.f.bD, 0.5f, this.aQ.p.nextFloat() * 0.1f + 0.9f);
            }
            if (cu2.m() == net.minecraft.m.av.b) {
                for (int i2 = 0; i2 < n2; ++i2) {
                    s s2 = new s(((double)this.bx.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                    s2 = s2.a(-this.bb * ((float)Math.PI / 180));
                    s2 = s2.b(-this.ba * ((float)Math.PI / 180));
                    double d2 = (double)(-this.bx.nextFloat()) * 0.6 - 0.3;
                    s s3 = new s(((double)this.bx.nextFloat() - 0.5) * 0.3, d2, 0.6);
                    s3 = s3.a(-this.bb * ((float)Math.PI / 180));
                    s3 = s3.b(-this.ba * ((float)Math.PI / 180));
                    s3 = s3.b(this.aU, this.aV + (double)this.ce_(), this.aW);
                    if (cu2.e()) {
                        this.aQ.a(net.minecraft.u.aj.K, s3.b, s3.c, s3.d, s2.b, s2.c + 0.05, s2.d, cg.a(cu2.a()), cu2.h());
                        continue;
                    }
                    this.aQ.a(net.minecraft.u.aj.K, s3.b, s3.c, s3.d, s2.b, s2.c + 0.05, s2.d, cg.a(cu2.a()));
                }
                this.a(net.minecraft.a.f.bE, 0.5f + 0.5f * (float)this.bx.nextInt(2), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
        }
    }

    protected void co_() {
        if (this.aK != null && this.B()) {
            this.a(this.aK, 16);
            cu cu2 = this.aK.a(this.aQ, this);
            if (cu2 != null && cu2.b == 0) {
                cu2 = null;
            }
            this.a(this.D(), cu2);
            this.C();
        }
    }

    public cu bR() {
        return this.aK;
    }

    public int bS() {
        return this.aL;
    }

    public int bT() {
        return this.B() ? this.aK.l() - this.bS() : 0;
    }

    public void bU() {
        if (this.aK != null) {
            this.aK.a(this.aQ, this, this.bS());
        }
        this.C();
    }

    public void C() {
        if (!this.aQ.C) {
            this.bE.b(Q, (byte)0);
        }
        this.aK = null;
        this.aL = 0;
    }

    public boolean bV() {
        if (this.B() && this.aK != null) {
            cg cg2 = this.aK.a();
            return cg2.b(this.aK) != net.minecraft.m.av.d ? false : cg2.c(this.aK) - this.aL >= 5;
        }
        return false;
    }

    public boolean bW() {
        return this.m(7);
    }

    public int bX() {
        return this.aM;
    }

    public boolean f(double d2, double d3, double d4) {
        int n2;
        double d5 = this.aU;
        double d6 = this.aV;
        double d7 = this.aW;
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        boolean bl2 = false;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
        net.minecraft.q.k k2 = this.aQ;
        Random random = this.bd();
        if (k2.d(b2)) {
            n2 = 0;
            while (n2 == 0 && b2.k() > 0) {
                net.minecraft.u.b.b b3 = b2.c();
                net.minecraft.g.c.b b4 = k2.n(b3);
                if (b4.d().c()) {
                    n2 = 1;
                    continue;
                }
                this.aV -= 1.0;
                b2 = b3;
            }
            if (n2 != 0) {
                this.d(this.aU, this.aV, this.aW);
                if (k2.a((n)this, this.cT()).isEmpty() && !k2.e(this.cT())) {
                    bl2 = true;
                }
            }
        }
        if (!bl2) {
            this.d(d5, d6, d7);
            return false;
        }
        n2 = 128;
        for (int i2 = 0; i2 < 128; ++i2) {
            double d8 = (double)i2 / 127.0;
            float f2 = (random.nextFloat() - 0.5f) * 0.2f;
            float f3 = (random.nextFloat() - 0.5f) * 0.2f;
            float f4 = (random.nextFloat() - 0.5f) * 0.2f;
            double d9 = d5 + (this.aU - d5) * d8 + (random.nextDouble() - 0.5) * (double)this.bl * 2.0;
            double d10 = d6 + (this.aV - d6) * d8 + random.nextDouble() * (double)this.bm;
            double d11 = d7 + (this.aW - d7) * d8 + (random.nextDouble() - 0.5) * (double)this.bl * 2.0;
            k2.a(net.minecraft.u.aj.y, d9, d10, d11, (double)f2, (double)f3, (double)f4, new int[0]);
        }
        if (this instanceof t) {
            ((t)this).N().m();
        }
        return true;
    }

    public boolean bY() {
        return true;
    }
}

