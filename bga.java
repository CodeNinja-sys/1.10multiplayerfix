/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public abstract class bga
extends cpk {
    private static final UUID a = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final cs b = new cs(a, "Sprinting speed boost", 0.3f, 2).a(false);
    protected static final bcz N = bwm.a(bga.class, cbf.a);
    private static final bcz c = bwm.a(bga.class, cbf.c);
    private static final bcz d = bwm.a(bga.class, cbf.b);
    private static final bcz e = bwm.a(bga.class, cbf.h);
    private static final bcz f = bwm.a(bga.class, cbf.b);
    private anu g;
    private final csk j = new csk(this);
    private final Map k = sz.c();
    private final bhl[] l = new bhl[2];
    private final bhl[] m = new bhl[4];
    public boolean O;
    public bqp P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public int V;
    public float W;
    public float X;
    protected int Y;
    public float Z;
    public float aa;
    public float ab;
    public int ac = 20;
    public float ad;
    public float ae;
    public float af;
    public float ag;
    public float ah;
    public float ai;
    public float aj;
    public float ak;
    public float al = 0.02f;
    protected bdl am;
    protected int an;
    protected boolean ao;
    protected int ap;
    protected float aq;
    protected float ar;
    protected float as;
    protected float at;
    protected float au;
    protected int av;
    protected float aw;
    protected boolean ax;
    public float ay;
    public float az;
    public float aA;
    protected int aB;
    protected double aC;
    protected double aD;
    protected double aE;
    protected double aF;
    protected double aG;
    private boolean n = true;
    private bga o;
    private int p;
    private bga q;
    private int r;
    private float s;
    private int t;
    private float u;
    protected bhl aH;
    protected int aI;
    protected int aJ;
    private cmz v;
    private ahy w;
    private long x;

    @Override
    public void v_() {
        this.a(ahy.l, Float.MAX_VALUE);
    }

    public bga(iu iu2) {
        super(iu2);
        this.p();
        this.k(this.bo());
        this.aN = true;
        this.ag = (float)((Math.random() + 1.0) * (double)0.01f);
        this.d(this.aU, this.aV, this.aW);
        this.af = (float)Math.random() * 12398.0f;
        this.aj = this.ba = (float)(Math.random() * 6.2831854820251465);
        this.bu = 0.6f;
    }

    @Override
    protected void a() {
        this.bE.a(N, (byte)0);
        this.bE.a(d, 0);
        this.bE.a(e, false);
        this.bE.a(f, 0);
        this.bE.a(c, Float.valueOf(1.0f));
    }

    protected void p() {
        this.bs().b(cgz.a);
        this.bs().b(cgz.c);
        this.bs().b(cgz.d);
        this.bs().b(cgz.g);
        this.bs().b(cgz.h);
    }

    @Override
    protected void a(double d2, boolean bl2, dbk dbk2, cmz cmz2) {
        if (!this.V_()) {
            this.bf_();
        }
        if (!this.aQ.C && this.bq > 3.0f && bl2) {
            float f2 = cmk.f(this.bq - 3.0f);
            if (dbk2.a() != ahk.a) {
                double d3 = Math.min((double)(0.2f + f2 / 15.0f), 2.5);
                int n2 = (int)(150.0 * d3);
                ((alj)this.aQ).a(lz.M, this.aU, this.aV, this.aW, n2, 0.0, 0.0, 0.0, (double)0.15f, bfa.u(dbk2));
            }
        }
        super.a(d2, bl2, dbk2, cmz2);
    }

    public boolean f() {
        return false;
    }

    @Override
    public void w_() {
        boolean bl2;
        this.W = this.X;
        super.w_();
        this.aQ.A.a("livingEntityBaseTick");
        boolean bl3 = this instanceof bdl;
        if (this.bj()) {
            double d2;
            double d3;
            if (this.K_()) {
                this.a(ahy.f, 1.0f);
            } else if (bl3 && !this.aQ.U().a(this.cD()) && (d3 = this.aQ.U().a(this) + this.aQ.U().m()) < 0.0 && (d2 = this.aQ.U().n()) > 0.0) {
                this.a(ahy.f, (float)Math.max(1, cmk.c(-d3 * d2)));
            }
        }
        if (this.cg() || this.aQ.C) {
            this.cb();
        }
        boolean bl4 = bl2 = bl3 && ((bdl)this).G.a;
        if (this.bj()) {
            cmz cmz2;
            if (this.a(ahk.h)) {
                if (!(this.f() || this.b(ake.m) || bl2)) {
                    this.o(this.b_(this.cu()));
                    if (this.cu() == -20) {
                        this.o(0);
                        for (int i2 = 0; i2 < 8; ++i2) {
                            float f2 = this.bx.nextFloat() - this.bx.nextFloat();
                            float f3 = this.bx.nextFloat() - this.bx.nextFloat();
                            float f4 = this.bx.nextFloat() - this.bx.nextFloat();
                            this.aQ.a(lz.e, this.aU + (double)f2, this.aV + (double)f3, this.aW + (double)f4, this.aX, this.aY, this.aZ, new int[0]);
                        }
                        this.a(ahy.g, 2.0f);
                    }
                }
                if (!this.aQ.C && this.cp() && this.cL() instanceof bga) {
                    this.s_();
                }
            } else {
                this.o(300);
            }
            if (!this.aQ.C && !cc.a((Object)this.v, (Object)(cmz2 = new cmz(this)))) {
                this.v = cmz2;
                this.c(cmz2);
            }
        }
        if (this.bj() && this.ch()) {
            this.cb();
        }
        this.ad = this.ae;
        if (this.S > 0) {
            --this.S;
        }
        if (this.bB > 0 && !(this instanceof czt)) {
            --this.bB;
        }
        if (this.bh() <= 0.0f) {
            this.aV();
        }
        if (this.an > 0) {
            --this.an;
        } else {
            this.am = null;
        }
        if (this.q != null && !this.q.bj()) {
            this.q = null;
        }
        if (this.o != null) {
            if (!this.o.bj()) {
                this.d((bga)null);
            } else if (this.by - this.p > 100) {
                this.d((bga)null);
            }
        }
        this.bc();
        this.at = this.as;
        this.ai = this.ah;
        this.ak = this.aj;
        this.bc = this.ba;
        this.bd = this.bb;
        this.aQ.A.b();
    }

    protected void c(cmz cmz2) {
        int n2 = acz.a(bbh.j, this);
        if (n2 > 0) {
            eg.a(this, this.aQ, cmz2, n2);
        }
    }

    public boolean R_() {
        return false;
    }

    protected void aV() {
        ++this.V;
        if (this.V == 20) {
            int n2;
            if (!this.aQ.C && (this.D_() || this.an > 0 && this.ab_() && this.aQ.F().b("doMobLoot"))) {
                int n3;
                for (n2 = this.c_(this.am); n2 > 0; n2 -= n3) {
                    n3 = cvs.c(n2);
                    this.aQ.b(new cvs(this.aQ, this.aU, this.aV, this.aW, n3));
                }
            }
            this.ak_();
            for (n2 = 0; n2 < 20; ++n2) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                this.aQ.a(lz.a, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    protected boolean ab_() {
        return !this.R_();
    }

    protected int b_(int n2) {
        int n3 = acz.c(this);
        if (n3 > 0 && this.bx.nextInt(n3 + 1) > 0) {
            return n2;
        }
        return n2 - 1;
    }

    protected int c_(bdl bdl2) {
        return 0;
    }

    protected boolean D_() {
        return false;
    }

    public Random aW() {
        return this.bx;
    }

    public bga aX() {
        return this.o;
    }

    public int aY() {
        return this.p;
    }

    public void d(bga bga2) {
        this.o = bga2;
        this.p = this.by;
    }

    public bga aZ() {
        return this.q;
    }

    public int ba() {
        return this.r;
    }

    public void h(cpk cpk2) {
        this.q = cpk2 instanceof bga ? (bga)cpk2 : null;
        this.r = this.by;
    }

    public int bb() {
        return this.ap;
    }

    protected void d(bhl bhl2) {
        if (bhl2 == null) {
            return;
        }
        bi bi2 = dah.p;
        azg azg2 = bhl2.a();
        if (azg2 instanceof uh) {
            bi2 = ((uh)azg2).f().b();
        } else if (azg2 == hp.cR) {
            bi2 = dah.s;
        }
        this.a(bi2, 1.0f, 1.0f);
    }

    @Override
    public void a(bvp bvp2) {
        bhl bhl2;
        bvp2.a("Health", this.bh());
        bvp2.a("HurtTime", (short)this.S);
        bvp2.a("HurtByTimestamp", this.p);
        bvp2.a("DeathTime", (short)this.V);
        bvp2.a("AbsorptionAmount", this.aO());
        for (dfm dfm2 : dfm.values()) {
            bhl2 = this.a(dfm2);
            if (bhl2 == null) continue;
            this.bs().a(bhl2.a(dfm2));
        }
        bvp2.a("Attributes", cgz.a(this.bs()));
        for (dfm dfm2 : dfm.values()) {
            bhl2 = this.a(dfm2);
            if (bhl2 == null) continue;
            this.bs().b(bhl2.a(dfm2));
        }
        if (!this.k.isEmpty()) {
            bmh bmh2 = new bmh();
            for (cko cko2 : this.k.values()) {
                bmh2.a(cko2.a(new bvp()));
            }
            bvp2.a("ActiveEffects", bmh2);
        }
        bvp2.a("FallFlying", this.bL());
    }

    @Override
    public void b(bvp bvp2) {
        Object object;
        this.a_(bvp2.j("AbsorptionAmount"));
        if (bvp2.b("Attributes", 9) && this.aQ != null && !this.aQ.C) {
            cgz.a(this.bs(), bvp2.c("Attributes", 10));
        }
        if (bvp2.b("ActiveEffects", 9)) {
            object = bvp2.c("ActiveEffects", 10);
            for (int i2 = 0; i2 < ((bmh)object).b(); ++i2) {
                bvp bvp3 = ((bmh)object).b(i2);
                cko cko2 = cko.b(bvp3);
                if (cko2 == null) continue;
                this.k.put(cko2.a(), cko2);
            }
        }
        if (bvp2.b("Health", 99)) {
            this.k(bvp2.j("Health"));
        }
        this.S = bvp2.g("HurtTime");
        this.V = bvp2.g("DeathTime");
        this.p = bvp2.h("HurtByTimestamp");
        if (bvp2.b("Team", 8)) {
            object = bvp2.l("Team");
            this.aQ.P().a(this.cy(), (String)object);
        }
        if (bvp2.p("FallFlying")) {
            this.b(7, true);
        }
    }

    protected void bc() {
        Iterator iterator = this.k.keySet().iterator();
        while (iterator.hasNext()) {
            bfv bfv2 = (bfv)iterator.next();
            cko cko2 = (cko)this.k.get(bfv2);
            if (!cko2.a(this)) {
                if (this.aQ.C) continue;
                iterator.remove();
                this.d(cko2);
                continue;
            }
            if (cko2.b() % 600 != 0) continue;
            this.a(cko2, false);
        }
        if (this.n) {
            if (!this.aQ.C) {
                this.E_();
            }
            this.n = false;
        }
        int n2 = (Integer)this.bE.a(d);
        boolean bl2 = (Boolean)this.bE.a(e);
        if (n2 > 0) {
            boolean bl3 = this.ct() ? this.bx.nextInt(15) == 0 : this.bx.nextBoolean();
            if (bl2) {
                bl3 &= this.bx.nextInt(5) == 0;
            }
            if (bl3 && n2 > 0) {
                double d2 = (double)(n2 >> 16 & 0xFF) / 255.0;
                double d3 = (double)(n2 >> 8 & 0xFF) / 255.0;
                double d4 = (double)(n2 >> 0 & 0xFF) / 255.0;
                this.aQ.a(bl2 ? lz.q : lz.p, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    protected void E_() {
        if (this.k.isEmpty()) {
            this.bd();
            this.e_(false);
        } else {
            Collection collection = this.k.values();
            this.bE.b(e, bga.a(collection));
            this.bE.b(d, anl.a(collection));
            this.e_(this.b(ake.n));
        }
    }

    public static boolean a(Collection collection) {
        for (cko cko2 : collection) {
            if (cko2.d()) continue;
            return false;
        }
        return true;
    }

    protected void bd() {
        this.bE.b(e, false);
        this.bE.b(d, 0);
    }

    public void be() {
        if (this.aQ.C) {
            return;
        }
        Iterator iterator = this.k.values().iterator();
        while (iterator.hasNext()) {
            this.d((cko)iterator.next());
            iterator.remove();
        }
    }

    public Collection bf() {
        return this.k.values();
    }

    public boolean b(bfv bfv2) {
        return this.k.containsKey(bfv2);
    }

    public cko c(bfv bfv2) {
        return (cko)this.k.get(bfv2);
    }

    public void b(cko cko2) {
        if (!this.a(cko2)) {
            return;
        }
        cko cko3 = (cko)this.k.get(cko2.a());
        if (cko3 == null) {
            this.k.put(cko2.a(), cko2);
            this.c(cko2);
        } else {
            cko3.a(cko2);
            this.a(cko3, true);
        }
    }

    public boolean a(cko cko2) {
        bfv bfv2;
        return this.ak() != agh.b || (bfv2 = cko2.a()) != ake.j && bfv2 != ake.s;
    }

    public boolean bg() {
        return this.ak() == agh.b;
    }

    public cko a(bfv bfv2) {
        return (cko)this.k.remove(bfv2);
    }

    public void d(bfv bfv2) {
        cko cko2 = this.a(bfv2);
        if (cko2 != null) {
            this.d(cko2);
        }
    }

    protected void c(cko cko2) {
        this.n = true;
        if (!this.aQ.C) {
            cko2.a().b(this, this.bs(), cko2.c());
        }
    }

    protected void a(cko cko2, boolean bl2) {
        this.n = true;
        if (bl2 && !this.aQ.C) {
            bfv bfv2 = cko2.a();
            bfv2.a(this, this.bs(), cko2.c());
            bfv2.b(this, this.bs(), cko2.c());
        }
    }

    protected void d(cko cko2) {
        this.n = true;
        if (!this.aQ.C) {
            cko2.a().a(this, this.bs(), cko2.c());
        }
    }

    public void b_(float f2) {
        float f3 = this.bh();
        if (f3 > 0.0f) {
            this.k(f3 + f2);
        }
    }

    public final float bh() {
        return ((Float)this.bE.a(c)).floatValue();
    }

    public void k(float f2) {
        this.bE.b(c, Float.valueOf(cmk.a(f2, 0.0f, this.bo())));
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        Object object;
        if (this.c(ahy2)) {
            return false;
        }
        if (this.aQ.C) {
            return false;
        }
        this.ap = 0;
        if (this.bh() <= 0.0f) {
            return false;
        }
        if (ahy2.o() && this.b(ake.l)) {
            return false;
        }
        if ((ahy2 == ahy.p || ahy2 == ahy.q) && this.a(dfm.f) != null) {
            this.a(dfm.f).a((int)(f2 * 4.0f + this.bx.nextFloat() * f2 * 2.0f), this);
            f2 *= 0.75f;
        }
        boolean bl2 = false;
        if (f2 > 0.0f && this.d(ahy2)) {
            this.d_(f2);
            if (ahy2.c()) {
                f2 = 0.0f;
            } else {
                f2 *= 0.33f;
                if (ahy2.a() instanceof bga) {
                    ((bga)ahy2.a()).a(this, 0.5f, this.aU - ahy2.a().aU, this.aW - ahy2.a().aW);
                }
            }
            bl2 = true;
        }
        this.aa = 1.5f;
        boolean bl3 = true;
        if ((float)this.bB > (float)this.ac / 2.0f) {
            if (f2 <= this.aw) {
                return false;
            }
            this.b(ahy2, f2 - this.aw);
            this.aw = f2;
            bl3 = false;
        } else {
            this.aw = f2;
            this.bB = this.ac;
            this.b(ahy2, f2);
            this.S = this.T = 10;
        }
        this.U = 0.0f;
        cpk cpk2 = ahy2.b();
        if (cpk2 != null) {
            if (cpk2 instanceof bga) {
                this.d((bga)cpk2);
            }
            if (cpk2 instanceof bdl) {
                this.an = 100;
                this.am = (bdl)cpk2;
            } else if (cpk2 instanceof cqw && ((nb)(object = (cqw)cpk2)).B()) {
                this.an = 100;
                this.am = null;
            }
        }
        if (bl3) {
            if (bl2) {
                this.aQ.a((cpk)this, (byte)29);
            } else if (ahy2 instanceof bsg && ((bsg)ahy2).x()) {
                this.aQ.a((cpk)this, (byte)33);
            } else {
                this.aQ.a((cpk)this, (byte)2);
            }
            if (ahy2 != ahy.g && (!bl2 || f2 > 0.0f)) {
                this.bz();
            }
            if (cpk2 != null) {
                double d2 = cpk2.aU - this.aU;
                double d3 = cpk2.aW - this.aW;
                while (d2 * d2 + d3 * d3 < 1.0E-4) {
                    d2 = (Math.random() - Math.random()) * 0.01;
                    d3 = (Math.random() - Math.random()) * 0.01;
                }
                this.U = (float)(cmk.b(d3, d2) * 57.2957763671875 - (double)this.ba);
                this.a(cpk2, 0.4f, d2, d3);
            } else {
                this.U = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.bh() <= 0.0f) {
            object = this.s();
            if (bl3 && object != null) {
                this.a((bi)object, this.t(), this.ac_());
            }
            this.a(ahy2);
        } else if (bl3) {
            this.b(ahy2);
        }
        if (!bl2 || f2 > 0.0f) {
            this.w = ahy2;
            this.x = this.aQ.z();
        }
        return !bl2 || f2 > 0.0f;
    }

    public ahy bi() {
        if (this.aQ.z() - this.x > 40L) {
            this.w = null;
        }
        return this.w;
    }

    protected void b(ahy ahy2) {
        bi bi2 = this.r();
        if (bi2 != null) {
            this.a(bi2, this.t(), this.ac_());
        }
    }

    private boolean d(ahy ahy2) {
        amj amj2;
        if (!ahy2.g() && this.bK() && (amj2 = ahy2.v()) != null) {
            amj amj3 = this.l(1.0f);
            amj amj4 = amj2.a(new amj(this.aU, this.aV, this.aW)).a();
            amj4 = new amj(amj4.b, 0.0, amj4.d);
            if (amj4.b(amj3) < 0.0) {
                return true;
            }
        }
        return false;
    }

    public void e(bhl bhl2) {
        this.a(dah.cZ, 0.8f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
        for (int i2 = 0; i2 < 5; ++i2) {
            amj amj2 = new amj(((double)this.bx.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            amj2 = amj2.a(-this.bb * ((float)Math.PI / 180));
            amj2 = amj2.b(-this.ba * ((float)Math.PI / 180));
            double d2 = (double)(-this.bx.nextFloat()) * 0.6 - 0.3;
            amj amj3 = new amj(((double)this.bx.nextFloat() - 0.5) * 0.3, d2, 0.6);
            amj3 = amj3.a(-this.bb * ((float)Math.PI / 180));
            amj3 = amj3.b(-this.ba * ((float)Math.PI / 180));
            amj3 = amj3.b(this.aU, this.aV + (double)this.A(), this.aW);
            this.aQ.a(lz.K, amj3.b, amj3.c, amj3.d, amj2.b, amj2.c + 0.05, amj2.d, azg.a(bhl2.a()));
        }
    }

    public void a(ahy ahy2) {
        if (this.ao) {
            return;
        }
        cpk cpk2 = ahy2.b();
        bga bga2 = this.bn();
        if (this.av >= 0 && bga2 != null) {
            bga2.a((cpk)this, this.av);
        }
        if (cpk2 != null) {
            cpk2.a_(this);
        }
        this.ao = true;
        this.bm().e();
        if (!this.aQ.C) {
            int n2 = 0;
            if (cpk2 instanceof bdl) {
                n2 = acz.h((bga)cpk2);
            }
            if (this.ab_() && this.aQ.F().b("doMobLoot")) {
                boolean bl2 = this.an > 0;
                this.a(bl2, n2, ahy2);
            }
        }
        this.aQ.a((cpk)this, (byte)3);
    }

    protected void a(boolean bl2, int n2, ahy ahy2) {
        this.a(bl2, n2);
        this.b(bl2, n2);
    }

    protected void b(boolean bl2, int n2) {
    }

    public void a(cpk cpk2, float f2, double d2, double d3) {
        if (this.bx.nextDouble() < this.a(cgz.c).e()) {
            return;
        }
        this.bO = true;
        float f3 = cmk.a(d2 * d2 + d3 * d3);
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

    protected bi r() {
        return dah.bH;
    }

    protected bi s() {
        return dah.bC;
    }

    protected bi c_(int n2) {
        if (n2 > 4) {
            return dah.bA;
        }
        return dah.bI;
    }

    protected void a(boolean bl2, int n2) {
    }

    public boolean ai() {
        int n2 = cmk.c(this.aU);
        int n3 = cmk.c(this.cD().b);
        int n4 = cmk.c(this.aW);
        if (this instanceof bdl && ((bdl)this).aL()) {
            return false;
        }
        cmz cmz2 = new cmz(n2, n3, n4);
        dbk dbk2 = this.aQ.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.au || bfa2 == blg.bn) {
            return true;
        }
        return bfa2 instanceof csa && this.a(cmz2, dbk2);
    }

    private boolean a(cmz cmz2, dbk dbk2) {
        dbk dbk3;
        return (Boolean)dbk2.b(csa.b) != false && (dbk3 = this.aQ.n(cmz2.h())).t() == blg.au && dbk3.b(def.a) == dbk2.b(csa.a);
    }

    @Override
    public boolean bj() {
        return !this.bk && this.bh() > 0.0f;
    }

    @Override
    public void a(float f2, float f3) {
        super.a(f2, f3);
        cko cko2 = this.c(ake.h);
        float f4 = cko2 == null ? 0.0f : (float)(cko2.c() + 1);
        int n2 = cmk.f((f2 - 3.0f - f4) * f3);
        if (n2 > 0) {
            this.a(this.c_(n2), 1.0f, 1.0f);
            this.a(ahy.j, (float)n2);
            int n3 = cmk.c(this.aU);
            int n4 = cmk.c(this.aV - (double)0.2f);
            int n5 = cmk.c(this.aW);
            dbk dbk2 = this.aQ.n(new cmz(n3, n4, n5));
            if (dbk2.a() != ahk.a) {
                acv acv2 = dbk2.t().t();
                this.a(acv2.g(), acv2.a() * 0.5f, acv2.b() * 0.75f);
            }
        }
    }

    @Override
    public void bk() {
        this.S = this.T = 10;
        this.U = 0.0f;
    }

    public int bl() {
        cp cp2 = this.a(cgz.g);
        return cmk.c(cp2.e());
    }

    protected void c_(float f2) {
    }

    protected void d_(float f2) {
    }

    protected float c(ahy ahy2, float f2) {
        if (!ahy2.g()) {
            this.c_(f2);
            f2 = fp.a(f2, this.bl(), (float)this.a(cgz.h).e());
        }
        return f2;
    }

    protected float d(ahy ahy2, float f2) {
        int n2;
        if (ahy2.j()) {
            return f2;
        }
        if (this.b(ake.k) && ahy2 != ahy.l) {
            n2 = (this.c(ake.k).c() + 1) * 5;
            int n3 = 25 - n2;
            float f3 = f2 * (float)n3;
            f2 = f3 / 25.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        n2 = acz.a(this.aB(), ahy2);
        if (n2 > 0) {
            f2 = fp.a(f2, n2);
        }
        return f2;
    }

    protected void b(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return;
        }
        f2 = this.c(ahy2, f2);
        float f3 = f2 = this.d(ahy2, f2);
        f2 = Math.max(f2 - this.aO(), 0.0f);
        this.a_(this.aO() - (f3 - f2));
        if (f2 == 0.0f) {
            return;
        }
        float f4 = this.bh();
        this.k(f4 - f2);
        this.bm().a(ahy2, f4, f2);
        this.a_(this.aO() - f2);
    }

    public csk bm() {
        return this.j;
    }

    public bga bn() {
        if (this.j.c() != null) {
            return this.j.c();
        }
        if (this.am != null) {
            return this.am;
        }
        if (this.o != null) {
            return this.o;
        }
        return null;
    }

    public final float bo() {
        return (float)this.a(cgz.a).e();
    }

    public final int bp() {
        return (Integer)this.bE.a(f);
    }

    public final void k(int n2) {
        this.bE.b(f, n2);
    }

    private int C() {
        if (this.b(ake.c)) {
            return 6 - (1 + this.c(ake.c).c());
        }
        if (this.b(ake.d)) {
            return 6 + (1 + this.c(ake.d).c()) * 2;
        }
        return 6;
    }

    public void a(bqp bqp2) {
        if (!this.O || this.Q >= this.C() / 2 || this.Q < 0) {
            this.Q = -1;
            this.O = true;
            this.P = bqp2;
            if (this.aQ instanceof alj) {
                ((alj)this.aQ).af().a(this, new atk(this, bqp2 == bqp.a ? 0 : 3));
            }
        }
    }

    @Override
    public void a(byte by2) {
        boolean bl2;
        boolean bl3 = bl2 = by2 == 33;
        if (by2 == 2 || bl2) {
            bi bi2;
            this.aa = 1.5f;
            this.bB = this.ac;
            this.S = this.T = 10;
            this.U = 0.0f;
            if (bl2) {
                this.a(dah.gy, this.t(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            if ((bi2 = this.r()) != null) {
                this.a(bi2, this.t(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            this.a(ahy.m, 0.0f);
        } else if (by2 == 3) {
            bi bi3 = this.s();
            if (bi3 != null) {
                this.a(bi3, this.t(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            this.k(0.0f);
            this.a(ahy.m);
        } else if (by2 == 30) {
            this.a(dah.fd, 0.8f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
        } else if (by2 == 29) {
            this.a(dah.fc, 1.0f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
        } else {
            super.a(by2);
        }
    }

    @Override
    protected void bq() {
        this.a(ahy.l, 4.0f);
    }

    protected void br() {
        int n2 = this.C();
        if (this.O) {
            ++this.Q;
            if (this.Q >= n2) {
                this.Q = 0;
                this.O = false;
            }
        } else {
            this.Q = 0;
        }
        this.X = (float)this.Q / (float)n2;
    }

    public cp a(cmb cmb2) {
        return this.bs().d(cmb2);
    }

    public anu bs() {
        if (this.g == null) {
            this.g = new abh();
        }
        return this.g;
    }

    public agh ak() {
        return agh.a;
    }

    public bhl bt() {
        return this.a(dfm.a);
    }

    public bhl bu() {
        return this.a(dfm.b);
    }

    public bhl c(bqp bqp2) {
        if (bqp2 == bqp.a) {
            return this.a(dfm.a);
        }
        if (bqp2 == bqp.b) {
            return this.a(dfm.b);
        }
        throw new IllegalArgumentException("Invalid hand " + (Object)((Object)bqp2));
    }

    public void a(bqp bqp2, bhl bhl2) {
        if (bqp2 == bqp.a) {
            this.a(dfm.a, bhl2);
        } else if (bqp2 == bqp.b) {
            this.a(dfm.b, bhl2);
        } else {
            throw new IllegalArgumentException("Invalid hand " + (Object)((Object)bqp2));
        }
    }

    @Override
    public abstract Iterable aB();

    public abstract bhl a(dfm var1);

    @Override
    public abstract void a(dfm var1, bhl var2);

    @Override
    public void c_(boolean bl2) {
        super.c_(bl2);
        cp cp2 = this.a(cgz.d);
        if (cp2.a(a) != null) {
            cp2.c(b);
        }
        if (bl2) {
            cp2.b(b);
        }
    }

    protected float t() {
        return 1.0f;
    }

    protected float ac_() {
        if (this.R_()) {
            return (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.5f;
        }
        return (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f;
    }

    protected boolean aa() {
        return this.bh() <= 0.0f;
    }

    public void i(cpk cpk2) {
        if (cpk2 instanceof cor || cpk2 instanceof it) {
            double d2 = (double)(this.bl / 2.0f + cpk2.bl / 2.0f) + 0.4;
            float f2 = cpk2 instanceof cor ? 0.0f : 1.5707964f * (float)(this.aK() == s.b ? -1 : 1);
            float f3 = -cmk.a(-this.ba * ((float)Math.PI / 180) - (float)Math.PI + f2);
            float f4 = -cmk.b(-this.ba * ((float)Math.PI / 180) - (float)Math.PI + f2);
            double d3 = Math.abs(f3) > Math.abs(f4) ? d2 / (double)Math.abs(f3) : d2 / (double)Math.abs(f4);
            double d4 = this.aU + (double)f3 * d3;
            double d5 = this.aW + (double)f4 * d3;
            this.d(d4, cpk2.aV + (double)cpk2.bm + 0.001, d5);
            if (!this.aQ.b(this.cD())) {
                return;
            }
            this.d(d4, cpk2.aV + (double)cpk2.bm + 1.001, d5);
            if (!this.aQ.b(this.cD())) {
                return;
            }
            this.d(cpk2.aU, cpk2.aV + (double)this.bm + 0.001, cpk2.aW);
            return;
        }
        double d6 = cpk2.aU;
        double d7 = cpk2.cD().b + (double)cpk2.bm;
        double d8 = cpk2.aW;
        bqk bqk2 = cpk2.L_();
        bqk bqk3 = bqk2.f();
        int[][] arrarrn = new int[][]{{0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 0}, {1, 0}, {0, 1}};
        double d9 = Math.floor(this.aU) + 0.5;
        double d10 = Math.floor(this.aW) + 0.5;
        double d11 = this.cD().d - this.cD().a;
        double d12 = this.cD().f - this.cD().c;
        cxt cxt2 = new cxt(d9 - d11 / 2.0, this.cD().b, d10 - d12 / 2.0, d9 + d11 / 2.0, this.cD().e, d10 + d12 / 2.0);
        for (int[] arrn : arrarrn) {
            double d13 = bqk2.h() * arrn[0] + bqk3.h() * arrn[1];
            double d14 = bqk2.j() * arrn[0] + bqk3.j() * arrn[1];
            double d15 = d9 + d13;
            double d16 = d10 + d14;
            cxt cxt3 = cxt2.c(d13, 1.0, d14);
            if (!this.aQ.b(cxt3)) {
                if (this.aQ.n(new cmz(d15, this.aV, d16)).q()) {
                    this.l(d15, this.aV + 1.0, d16);
                    return;
                }
                cmz cmz2 = new cmz(d15, this.aV - 1.0, d16);
                if (!this.aQ.n(cmz2).q() && this.aQ.n(cmz2).a() != ahk.h) continue;
                d6 = d15;
                d7 = this.aV + 1.0;
                d8 = d16;
                continue;
            }
            if (this.aQ.b(cxt3.c(0.0, 1.0, 0.0)) || !this.aQ.n(new cmz(d15, this.aV + 1.0, d16)).q()) continue;
            d6 = d15;
            d7 = this.aV + 2.0;
            d8 = d16;
        }
        this.l(d6, d7, d8);
    }

    @Override
    public boolean F_() {
        return this.cB();
    }

    protected float U_() {
        return 0.42f;
    }

    protected void ad_() {
        this.aY = this.U_();
        if (this.b(ake.h)) {
            this.aY += (double)((float)(this.c(ake.h).c() + 1) * 0.1f);
        }
        if (this.cr()) {
            float f2 = this.ba * ((float)Math.PI / 180);
            this.aX -= (double)(cmk.a(f2) * 0.2f);
            this.aZ += (double)(cmk.b(f2) * 0.2f);
        }
        this.bO = true;
    }

    protected void bv() {
        this.aY += (double)0.04f;
    }

    protected void bw() {
        this.aY += (double)0.04f;
    }

    protected float bx() {
        return 0.8f;
    }

    public void b(float f2, float f3) {
        if (this.T_() || this.cK()) {
            if (!(!this.V_() || this instanceof bdl && ((bdl)this).G.b)) {
                double d2 = this.aV;
                float f4 = this.bx();
                float f5 = 0.02f;
                float f6 = acz.d(this);
                if (f6 > 3.0f) {
                    f6 = 3.0f;
                }
                if (!this.be) {
                    f6 *= 0.5f;
                }
                if (f6 > 0.0f) {
                    f4 += (0.54600006f - f4) * f6 / 3.0f;
                    f5 += (this.G_() - f5) * f6 / 3.0f;
                }
                this.b(f2, f3, f5);
                this.b(this.aX, this.aY, this.aZ);
                this.aX *= (double)f4;
                this.aY *= (double)0.8f;
                this.aZ *= (double)f4;
                if (!this.cf()) {
                    this.aY -= 0.02;
                }
                if (this.bf && this.h(this.aX, this.aY + (double)0.6f - this.aV + d2, this.aZ)) {
                    this.aY = 0.3f;
                }
            } else if (!(!this.cj() || this instanceof bdl && ((bdl)this).G.b)) {
                double d3 = this.aV;
                this.b(f2, f3, 0.02f);
                this.b(this.aX, this.aY, this.aZ);
                this.aX *= 0.5;
                this.aY *= 0.5;
                this.aZ *= 0.5;
                if (!this.cf()) {
                    this.aY -= 0.02;
                }
                if (this.bf && this.h(this.aX, this.aY + (double)0.6f - this.aV + d3, this.aZ)) {
                    this.aY = 0.3f;
                }
            } else if (this.bL()) {
                double d4;
                float f7;
                double d5;
                if (this.aY > -0.5) {
                    this.bq = 1.0f;
                }
                amj amj2 = this.by();
                float f8 = this.bb * ((float)Math.PI / 180);
                double d6 = Math.sqrt(amj2.b * amj2.b + amj2.d * amj2.d);
                double d7 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
                double d8 = amj2.b();
                float f9 = cmk.b(f8);
                f9 = (float)((double)f9 * ((double)f9 * Math.min(1.0, d8 / 0.4)));
                this.aY += -0.08 + (double)f9 * 0.06;
                if (this.aY < 0.0 && d6 > 0.0) {
                    d5 = this.aY * -0.1 * (double)f9;
                    this.aY += d5;
                    this.aX += amj2.b * d5 / d6;
                    this.aZ += amj2.d * d5 / d6;
                }
                if (f8 < 0.0f) {
                    d5 = d7 * (double)(-cmk.a(f8)) * 0.04;
                    this.aY += d5 * 3.2;
                    this.aX -= amj2.b * d5 / d6;
                    this.aZ -= amj2.d * d5 / d6;
                }
                if (d6 > 0.0) {
                    this.aX += (amj2.b / d6 * d7 - this.aX) * 0.1;
                    this.aZ += (amj2.d / d6 * d7 - this.aZ) * 0.1;
                }
                this.aX *= (double)0.99f;
                this.aY *= (double)0.98f;
                this.aZ *= (double)0.99f;
                this.b(this.aX, this.aY, this.aZ);
                if (this.bf && !this.aQ.C && (f7 = (float)((d4 = d7 - (d5 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ))) * 10.0 - 3.0)) > 0.0f) {
                    this.a(this.c_((int)f7), 1.0f, 1.0f);
                    this.a(ahy.k, f7);
                }
                if (this.be && !this.aQ.C) {
                    this.b(7, false);
                }
            } else {
                float f10 = 0.91f;
                bjb bjb2 = bjb.b(this.aU, this.cD().b - 1.0, this.aW);
                if (this.be) {
                    f10 = this.aQ.n((cmz)bjb2).t().N * 0.91f;
                }
                float f11 = 0.16277136f / (f10 * f10 * f10);
                float f12 = this.be ? this.G_() * f11 : this.al;
                this.b(f2, f3, f12);
                f10 = 0.91f;
                if (this.be) {
                    f10 = this.aQ.n((cmz)bjb2.c((double)this.aU, (double)(this.cD().b - 1.0), (double)this.aW)).t().N * 0.91f;
                }
                if (this.ai()) {
                    boolean bl2;
                    float f13 = 0.15f;
                    this.aX = cmk.a(this.aX, (double)-0.15f, (double)0.15f);
                    this.aZ = cmk.a(this.aZ, (double)-0.15f, (double)0.15f);
                    this.bq = 0.0f;
                    if (this.aY < -0.15) {
                        this.aY = -0.15;
                    }
                    boolean bl3 = bl2 = this.ar_() && this instanceof bdl;
                    if (bl2 && this.aY < 0.0) {
                        this.aY = 0.0;
                    }
                }
                this.b(this.aX, this.aY, this.aZ);
                if (this.bf && this.ai()) {
                    this.aY = 0.2;
                }
                if (this.b(ake.y)) {
                    this.aY += (0.05 * (double)(this.c(ake.y).c() + 1) - this.aY) * 0.2;
                } else {
                    bjb2.c(this.aU, 0.0, this.aW);
                    if (!this.aQ.C || this.aQ.d(bjb2) && this.aQ.e(bjb2).p()) {
                        if (!this.cf()) {
                            this.aY -= 0.08;
                        }
                    } else {
                        this.aY = this.aV > 0.0 ? -0.1 : 0.0;
                    }
                }
                this.aY *= (double)0.98f;
                this.aX *= (double)f10;
                this.aZ *= (double)f10;
                bjb2.f();
            }
        }
        this.Z = this.aa;
        double d9 = this.aU - this.aR;
        double d10 = this.aW - this.aT;
        float f14 = cmk.a(d9 * d9 + d10 * d10) * 4.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        this.aa += (f14 - this.aa) * 0.4f;
        this.ab += this.aa;
    }

    public float G_() {
        return this.s;
    }

    public void i(float f2) {
        this.s = f2;
    }

    public boolean a(cpk cpk2) {
        this.h(cpk2);
        return false;
    }

    public boolean H_() {
        return false;
    }

    @Override
    public void bb_() {
        super.bb_();
        this.bE();
        if (!this.aQ.C) {
            int n2 = this.bp();
            if (n2 > 0) {
                if (this.R <= 0) {
                    this.R = 20 * (30 - n2);
                }
                --this.R;
                if (this.R <= 0) {
                    this.k(n2 - 1);
                }
            }
            block8: for (dfm dfm2 : dfm.values()) {
                bhl bhl2;
                switch (dfm2.a()) {
                    case a: {
                        bhl2 = this.l[dfm2.b()];
                        break;
                    }
                    case b: {
                        bhl2 = this.m[dfm2.b()];
                        break;
                    }
                    default: {
                        continue block8;
                    }
                }
                bhl bhl3 = this.a(dfm2);
                if (bhl.b(bhl3, bhl2)) continue;
                ((alj)this.aQ).af().a(this, new aey(this.bW(), dfm2, bhl3));
                if (bhl2 != null) {
                    this.bs().a(bhl2.a(dfm2));
                }
                if (bhl3 != null) {
                    this.bs().b(bhl3.a(dfm2));
                }
                switch (dfm2.a()) {
                    case a: {
                        this.l[dfm2.b()] = bhl3 == null ? null : bhl3.j();
                        continue block8;
                    }
                    case b: {
                        this.m[dfm2.b()] = bhl3 == null ? null : bhl3.j();
                    }
                }
            }
            if (this.by % 20 == 0) {
                this.bm().e();
            }
            if (!this.bY) {
                boolean bl2 = this.b(ake.x);
                if (this.n(6) != bl2) {
                    this.b(6, bl2);
                }
            }
        }
        this.Q_();
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f2 = (float)(d2 * d2 + d3 * d3);
        float f3 = this.ah;
        float f4 = 0.0f;
        this.aq = this.ar;
        float f5 = 0.0f;
        if (f2 > 0.0025000002f) {
            f5 = 1.0f;
            f4 = (float)Math.sqrt(f2) * 3.0f;
            f3 = (float)cmk.b(d3, d2) * 57.295776f - 90.0f;
        }
        if (this.X > 0.0f) {
            f3 = this.ba;
        }
        if (!this.be) {
            f5 = 0.0f;
        }
        this.ar += (f5 - this.ar) * 0.3f;
        this.aQ.A.a("headTurn");
        f4 = this.d(f3, f4);
        this.aQ.A.b();
        this.aQ.A.a("rangeChecks");
        while (this.ba - this.bc < -180.0f) {
            this.bc -= 360.0f;
        }
        while (this.ba - this.bc >= 180.0f) {
            this.bc += 360.0f;
        }
        while (this.ah - this.ai < -180.0f) {
            this.ai -= 360.0f;
        }
        while (this.ah - this.ai >= 180.0f) {
            this.ai += 360.0f;
        }
        while (this.bb - this.bd < -180.0f) {
            this.bd -= 360.0f;
        }
        while (this.bb - this.bd >= 180.0f) {
            this.bd += 360.0f;
        }
        while (this.aj - this.ak < -180.0f) {
            this.ak -= 360.0f;
        }
        while (this.aj - this.ak >= 180.0f) {
            this.ak += 360.0f;
        }
        this.aQ.A.b();
        this.as += f4;
        this.aJ = this.bL() ? ++this.aJ : 0;
    }

    protected float d(float f2, float f3) {
        boolean bl2;
        float f4 = cmk.g(f2 - this.ah);
        this.ah += f4 * 0.3f;
        float f5 = cmk.g(this.ba - this.ah);
        boolean bl3 = bl2 = f5 < -90.0f || f5 >= 90.0f;
        if (f5 < -75.0f) {
            f5 = -75.0f;
        }
        if (f5 >= 75.0f) {
            f5 = 75.0f;
        }
        this.ah = this.ba - f5;
        if (f5 * f5 > 2500.0f) {
            this.ah += f5 * 0.2f;
        }
        if (bl2) {
            f3 *= -1.0f;
        }
        return f3;
    }

    public void Q_() {
        if (this.t > 0) {
            --this.t;
        }
        if (this.aB > 0 && !this.cK()) {
            double d2 = this.aU + (this.aC - this.aU) / (double)this.aB;
            double d3 = this.aV + (this.aD - this.aV) / (double)this.aB;
            double d4 = this.aW + (this.aE - this.aW) / (double)this.aB;
            double d5 = cmk.g(this.aF - (double)this.ba);
            this.ba = (float)((double)this.ba + d5 / (double)this.aB);
            this.bb = (float)((double)this.bb + (this.aG - (double)this.bb) / (double)this.aB);
            --this.aB;
            this.d(d2, d3, d4);
            this.e(this.ba, this.bb);
        } else if (!this.T_()) {
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
        if (this.aa()) {
            this.ax = false;
            this.ay = 0.0f;
            this.az = 0.0f;
            this.aA = 0.0f;
        } else if (this.T_()) {
            this.aQ.A.a("newAi");
            this.aa_();
            this.aQ.A.b();
        }
        this.aQ.A.b();
        this.aQ.A.a("jump");
        if (this.ax) {
            if (this.V_()) {
                this.bv();
            } else if (this.cj()) {
                this.bw();
            } else if (this.be && this.t == 0) {
                this.ad_();
                this.t = 10;
            }
        } else {
            this.t = 0;
        }
        this.aQ.A.b();
        this.aQ.A.a("travel");
        this.ay *= 0.98f;
        this.az *= 0.98f;
        this.aA *= 0.9f;
        this.T();
        this.b(this.ay, this.az);
        this.aQ.A.b();
        this.aQ.A.a("push");
        this.ae_();
        this.aQ.A.b();
    }

    private void T() {
        boolean bl2 = this.n(7);
        if (bl2 && !this.be && !this.cp()) {
            bhl bhl2 = this.a(dfm.e);
            if (bhl2 != null && bhl2.a() == hp.cR && anb.g(bhl2)) {
                bl2 = true;
                if (!this.aQ.C && (this.aJ + 1) % 20 == 0) {
                    bhl2.a(1, this);
                }
            } else {
                bl2 = false;
            }
        } else {
            bl2 = false;
        }
        if (!this.aQ.C) {
            this.b(7, bl2);
        }
    }

    protected void aa_() {
    }

    protected void ae_() {
        List list = this.aQ.a((cpk)this, this.cD(), auxx.a(this));
        if (!list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                cpk cpk2 = (cpk)list.get(i2);
                this.b(cpk2);
            }
        }
    }

    protected void b(cpk cpk2) {
        cpk2.e_(this);
    }

    @Override
    public void s_() {
        cpk cpk2 = this.cL();
        super.s_();
        if (cpk2 != null && cpk2 != this.cL() && !this.aQ.C) {
            this.i(cpk2);
        }
    }

    @Override
    public void af_() {
        super.af_();
        this.aq = this.ar;
        this.ar = 0.0f;
        this.bq = 0.0f;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.aC = d2;
        this.aD = d3;
        this.aE = d4;
        this.aF = f2;
        this.aG = f3;
        this.aB = n2;
    }

    public void d_(boolean bl2) {
        this.ax = bl2;
    }

    public void b(cpk cpk2, int n2) {
        if (!cpk2.bk && !this.aQ.C) {
            tt tt2 = ((alj)this.aQ).af();
            if (cpk2 instanceof er) {
                tt2.a(cpk2, new and(cpk2.bW(), this.bW()));
            }
            if (cpk2 instanceof cwt) {
                tt2.a(cpk2, new and(cpk2.bW(), this.bW()));
            }
            if (cpk2 instanceof cvs) {
                tt2.a(cpk2, new and(cpk2.bW(), this.bW()));
            }
        }
    }

    public boolean j(cpk cpk2) {
        return this.aQ.a(new amj(this.aU, this.aV + (double)this.A(), this.aW), new amj(cpk2.aU, cpk2.aV + (double)cpk2.A(), cpk2.aW), false, true, false) == null;
    }

    @Override
    public amj by() {
        return this.l(1.0f);
    }

    @Override
    public amj l(float f2) {
        if (f2 == 1.0f) {
            return this.g(this.bb, this.aj);
        }
        float f3 = this.bd + (this.bb - this.bd) * f2;
        float f4 = this.ak + (this.aj - this.ak) * f2;
        return this.g(f3, f4);
    }

    public float m(float f2) {
        float f3 = this.X - this.W;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        return this.W + f3 * f2;
    }

    public boolean T_() {
        return !this.aQ.C;
    }

    @Override
    public boolean bc_() {
        return !this.bk;
    }

    @Override
    public boolean P() {
        return !this.bk;
    }

    @Override
    protected void bz() {
        this.bi = this.bx.nextDouble() >= this.a(cgz.c).e();
    }

    @Override
    public float bA() {
        return this.aj;
    }

    @Override
    public void n(float f2) {
        this.aj = f2;
    }

    @Override
    public void o(float f2) {
        this.ah = f2;
    }

    public float aO() {
        return this.u;
    }

    public void a_(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.u = f2;
    }

    public void bB() {
    }

    public void bC() {
    }

    protected void bD() {
        this.n = true;
    }

    public abstract s aK();

    public boolean ag_() {
        return ((Byte)this.bE.a(N) & 1) > 0;
    }

    public bqp ah_() {
        return ((Byte)this.bE.a(N) & 2) > 0 ? bqp.b : bqp.a;
    }

    protected void bE() {
        if (this.ag_()) {
            bhl bhl2 = this.c(this.ah_());
            if (bhl2 == this.aH) {
                if (this.bH() <= 25 && this.bH() % 4 == 0) {
                    this.a(this.aH, 5);
                }
                if (--this.aI == 0 && !this.aQ.C) {
                    this.bF();
                }
            } else {
                this.ai_();
            }
        }
    }

    public void b(bqp bqp2) {
        bhl bhl2 = this.c(bqp2);
        if (bhl2 == null || this.ag_()) {
            return;
        }
        this.aH = bhl2;
        this.aI = bhl2.l();
        if (!this.aQ.C) {
            int n2 = 1;
            if (bqp2 == bqp.b) {
                n2 |= 2;
            }
            this.bE.b(N, (byte)n2);
        }
    }

    @Override
    public void a(bcz bcz2) {
        super.a(bcz2);
        if (N.equals(bcz2) && this.aQ.C) {
            if (this.ag_() && this.aH == null) {
                this.aH = this.c(this.ah_());
                if (this.aH != null) {
                    this.aI = this.aH.l();
                }
            } else if (!this.ag_() && this.aH != null) {
                this.aH = null;
                this.aI = 0;
            }
        }
    }

    protected void a(bhl bhl2, int n2) {
        if (bhl2 == null || !this.ag_()) {
            return;
        }
        if (bhl2.m() == cga.c) {
            this.a(dah.bD, 0.5f, this.aQ.p.nextFloat() * 0.1f + 0.9f);
        }
        if (bhl2.m() == cga.b) {
            for (int i2 = 0; i2 < n2; ++i2) {
                amj amj2 = new amj(((double)this.bx.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                amj2 = amj2.a(-this.bb * ((float)Math.PI / 180));
                amj2 = amj2.b(-this.ba * ((float)Math.PI / 180));
                double d2 = (double)(-this.bx.nextFloat()) * 0.6 - 0.3;
                amj amj3 = new amj(((double)this.bx.nextFloat() - 0.5) * 0.3, d2, 0.6);
                amj3 = amj3.a(-this.bb * ((float)Math.PI / 180));
                amj3 = amj3.b(-this.ba * ((float)Math.PI / 180));
                amj3 = amj3.b(this.aU, this.aV + (double)this.A(), this.aW);
                if (bhl2.e()) {
                    this.aQ.a(lz.K, amj3.b, amj3.c, amj3.d, amj2.b, amj2.c + 0.05, amj2.d, azg.a(bhl2.a()), bhl2.h());
                    continue;
                }
                this.aQ.a(lz.K, amj3.b, amj3.c, amj3.d, amj2.b, amj2.c + 0.05, amj2.d, azg.a(bhl2.a()));
            }
            this.a(dah.bE, 0.5f + 0.5f * (float)this.bx.nextInt(2), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
        }
    }

    protected void bF() {
        if (this.aH != null && this.ag_()) {
            this.a(this.aH, 16);
            bhl bhl2 = this.aH.a(this.aQ, this);
            if (bhl2 != null && bhl2.b == 0) {
                bhl2 = null;
            }
            this.a(this.ah_(), bhl2);
            this.ai_();
        }
    }

    public bhl bG() {
        return this.aH;
    }

    public int bH() {
        return this.aI;
    }

    public int bI() {
        if (this.ag_()) {
            return this.aH.l() - this.bH();
        }
        return 0;
    }

    public void bJ() {
        if (this.aH != null) {
            this.aH.a(this.aQ, this, this.bH());
        }
        this.ai_();
    }

    public void ai_() {
        if (!this.aQ.C) {
            this.bE.b(N, (byte)0);
        }
        this.aH = null;
        this.aI = 0;
    }

    public boolean bK() {
        if (!this.ag_() || this.aH == null) {
            return false;
        }
        azg azg2 = this.aH.a();
        if (azg2.d_(this.aH) != cga.d) {
            return false;
        }
        return azg2.e_(this.aH) - this.aI >= 5;
    }

    public boolean bL() {
        return this.n(7);
    }

    public int bM() {
        return this.aJ;
    }

    public boolean g(double d2, double d3, double d4) {
        int n2;
        double d5 = this.aU;
        double d6 = this.aV;
        double d7 = this.aW;
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        boolean bl2 = false;
        cmz cmz2 = new cmz(this);
        iu iu2 = this.aQ;
        Random random = this.aW();
        if (iu2.d(cmz2)) {
            n2 = 0;
            while (n2 == 0 && cmz2.b() > 0) {
                cmz cmz3 = cmz2.h();
                dbk dbk2 = iu2.n(cmz3);
                if (dbk2.a().c()) {
                    n2 = 1;
                    continue;
                }
                this.aV -= 1.0;
                cmz2 = cmz3;
            }
            if (n2 != 0) {
                this.l(this.aU, this.aV, this.aW);
                if (iu2.a((cpk)this, this.cD()).isEmpty() && !iu2.e(this.cD())) {
                    bl2 = true;
                }
            }
        }
        if (!bl2) {
            this.l(d5, d6, d7);
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
            iu2.a(lz.y, d9, d10, d11, (double)f2, (double)f3, (double)f4, new int[0]);
        }
        if (this instanceof cfl) {
            ((cfl)this).ap().n();
        }
        return true;
    }

    public boolean I_() {
        return true;
    }
}

