/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.c.a.e;
import io.netty.b.bi;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class czt
extends bdl
implements cpx {
    private static final d i = org.apache.logging.log4j.c.c();
    private String j = "en_US";
    public bhu a;
    public final a b;
    public final dec c;
    public double d;
    public double e;
    private final List k = ov.b();
    private final f aK;
    private float aL = Float.MIN_VALUE;
    private int aM = Integer.MIN_VALUE;
    private int bZ = Integer.MIN_VALUE;
    private int ca = Integer.MIN_VALUE;
    private int cb = Integer.MIN_VALUE;
    private int cc = Integer.MIN_VALUE;
    private float cd = -1.0E8f;
    private int ce = -99999999;
    private boolean cf = true;
    private int cg = -99999999;
    private int ch = 60;
    private bgi ci;
    private boolean cj = true;
    private long ck = System.currentTimeMillis();
    private cpk cl;
    private boolean cm;
    private int cn;
    public boolean f;
    public int g;
    public boolean h;

    public czt(a a2, alj alj2, e e2, dec dec2) {
        super(alj2, e2);
        dec2.b = this;
        this.c = dec2;
        cmz cmz2 = alj2.B();
        if (!alj2.q.n() && alj2.E().p() != bvh.d) {
            int n2 = Math.max(0, a2.a((ls)((Object)alj2)));
            int n3 = cmk.c(alj2.U().a(cmz2.a(), cmz2.c()));
            if (n3 < n2) {
                n2 = n3;
            }
            if (n3 <= 1) {
                n2 = 1;
            }
            cmz2 = alj2.p(cmz2.e(this.bx.nextInt(n2 * 2 + 1) - n2, 0, this.bx.nextInt(n2 * 2 + 1) - n2));
        }
        this.b = a2;
        this.aK = ((cmt)((Object)a2.al())).a((bdl)this);
        this.bu = 0.0f;
        this.a(cmz2, 0.0f, 0.0f);
        while (!alj2.a((cpk)this, this.cD()).isEmpty() && this.aV < 255.0) {
            this.d(this.aU, this.aV + 1.0, this.aW);
        }
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("playerGameType", 99)) {
            if (this.o_().at()) {
                this.c.a((bvh)((Object)this.o_().n()));
            } else {
                this.c.a(bvh.a(bvp2.h("playerGameType")));
            }
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("playerGameType", this.c.b().a());
        cpk cpk2 = this.cJ();
        if (this.cL() != null && cpk2 != this & cpk2.b(czt.class).size() == 1) {
            bvp bvp3 = new bvp();
            bvp bvp4 = new bvp();
            cpk2.c(bvp4);
            bvp3.a("Attach", this.cL().cx());
            bvp3.a("Entity", bvp4);
            bvp2.a("RootVehicle", bvp3);
        }
    }

    @Override
    public void j(int n2) {
        super.j(n2);
        this.cg = -1;
    }

    @Override
    public void i(int n2) {
        super.i(n2);
        this.cg = -1;
    }

    public void C() {
        this.p.b(this);
    }

    @Override
    public void bB() {
        super.bB();
        this.a.a(new zb(this.bm(), cop.a));
    }

    @Override
    public void bC() {
        super.bC();
        this.a.a(new zb(this.bm(), cop.b));
    }

    @Override
    protected bkq Z() {
        return new dac(this);
    }

    @Override
    public void bb_() {
        this.c.a();
        --this.ch;
        if (this.bB > 0) {
            --this.bB;
        }
        this.p.a();
        if (!this.aQ.C && !this.p.b(this)) {
            this.q();
            this.p = this.o;
        }
        while (!this.k.isEmpty()) {
            int n2 = Math.min(this.k.size(), Integer.MAX_VALUE);
            int[] arrn = new int[n2];
            Iterator iterator = this.k.iterator();
            int n3 = 0;
            while (iterator.hasNext() && n3 < n2) {
                arrn[n3++] = (Integer)iterator.next();
                iterator.remove();
            }
            this.a.a(new cej(arrn));
        }
        cpk cpk2 = this.cN();
        if (cpk2 != this) {
            if (cpk2.bj()) {
                this.b(cpk2.aU, cpk2.aV, cpk2.aW, cpk2.ba, cpk2.bb);
                ((cmt)((Object)this.b.al())).d(this);
                if (this.ar_()) {
                    this.w(this);
                }
            } else {
                this.w(this);
            }
        }
    }

    public void T() {
        try {
            super.bb_();
            for (int i2 = 0; i2 < this.n.aI_(); ++i2) {
                ds ds2;
                bhl bhl2 = this.n.a(i2);
                if (bhl2 == null || !bhl2.a().u_() || (ds2 = ((qg)bhl2.a()).a(bhl2, this.aQ, this)) == null) continue;
                this.a.a(ds2);
            }
            if (this.bh() != this.cd || this.ce != this.q.a() || this.q.c() == 0.0f != this.cf) {
                this.a.a(new sk(this.bh(), this.q.a(), this.q.c()));
                this.cd = this.bh();
                this.ce = this.q.a();
                boolean bl2 = this.cf = this.q.c() == 0.0f;
            }
            if (this.bh() + this.aO() != this.aL) {
                this.aL = this.bh() + this.aO();
                this.a(bcu.g, cmk.f(this.aL));
            }
            if (this.q.a() != this.aM) {
                this.aM = this.q.a();
                this.a(bcu.h, cmk.f((float)this.aM));
            }
            if (this.cu() != this.bZ) {
                this.bZ = this.cu();
                this.a(bcu.i, cmk.f((float)this.bZ));
            }
            if (this.bl() != this.ca) {
                this.ca = this.bl();
                this.a(bcu.j, cmk.f((float)this.ca));
            }
            if (this.I != this.cc) {
                this.cc = this.I;
                this.a(bcu.k, cmk.f((float)this.cc));
            }
            if (this.H != this.cb) {
                this.cb = this.H;
                this.a(bcu.l, cmk.f((float)this.cb));
            }
            if (this.I != this.cg) {
                this.cg = this.I;
                this.a.a(new baq(this.J, this.I, this.H));
            }
            if (this.by % 20 * 5 == 0 && !this.cM().a(bpa.L)) {
                this.bN();
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Ticking player");
            sx sx2 = cet2.a("Player being ticked");
            this.a(sx2);
            throw new oz(cet2);
        }
    }

    private void a(bcu bcu2, int n2) {
        Collection collection = this.aN().a(bcu2);
        for (bhi bhi2 : collection) {
            czu czu2 = this.aN().c(this.i_(), bhi2);
            czu2.c(n2);
        }
    }

    protected void bN() {
        anr anr2 = this.aQ.a(new cmz(cmk.c(this.aU), 0, cmk.c(this.aW)));
        String string = anr2.l();
        cav cav2 = (cav)this.cM().b((cyd)bpa.L);
        if (cav2 == null) {
            cav2 = (cav)this.cM().a(bpa.L, new cav());
        }
        cav2.add(string);
        if (this.cM().b(bpa.L) && cav2.size() >= anr.o.size()) {
            HashSet hashSet = aad.b((Iterable)anr.o);
            for (String string2 : cav2) {
                Iterator iterator = hashSet.iterator();
                while (iterator.hasNext()) {
                    anr anr3 = (anr)iterator.next();
                    if (!anr3.l().equals(string2)) continue;
                    iterator.remove();
                }
                if (!hashSet.isEmpty()) continue;
                break;
            }
            if (hashSet.isEmpty()) {
                this.a((cyd)bpa.L);
            }
        }
    }

    @Override
    public void a(ahy ahy2) {
        Object object;
        Object object2;
        boolean bl2 = this.aQ.F().b("showDeathMessages");
        this.a.a(new zb(this.bm(), cop.c, bl2));
        if (bl2) {
            object2 = this.as_();
            if (object2 == null || ((ccw)object2).i() == afb.a) {
                ((cmt)((Object)this.b.al())).a(this.bm().b());
            } else if (((ccw)object2).i() == afb.c) {
                ((cmt)((Object)this.b.al())).a(this, this.bm().b());
            } else if (((ccw)object2).i() == afb.d) {
                ((cmt)((Object)this.b.al())).b(this, this.bm().b());
            }
        }
        if (!this.aQ.F().b("keepInventory") && !this.aL()) {
            this.n.m();
        }
        object2 = this.aQ.P().a(bcu.d);
        Object object3 = object2.iterator();
        while (object3.hasNext()) {
            object = (bhi)object3.next();
            czu czu2 = this.aN().c(this.i_(), (bhi)object);
            czu2.a();
        }
        object3 = this.bn();
        if (object3 != null) {
            object = (qb)vb.a.get(vb.b((cpk)object3));
            if (object != null) {
                this.a(((qb)object).e);
            }
            ((cpk)object3).a((cpk)this, this.av);
        }
        this.a(bpv.A);
        this.b(bpv.h);
        this.bm().e();
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        boolean bl2;
        if (this.c(ahy2)) {
            return false;
        }
        boolean bl3 = bl2 = this.b.aa() && this.cU() && "fall".equals(ahy2.s);
        if (!bl2 && this.ch > 0 && ahy2 != ahy.l) {
            return false;
        }
        if (ahy2 instanceof bsg) {
            cpk cpk2 = ahy2.b();
            if (cpk2 instanceof bdl && !this.c((bdl)cpk2)) {
                return false;
            }
            if (cpk2 instanceof cwt) {
                cwt cwt2 = (cwt)cpk2;
                if (cwt2.e instanceof bdl && !this.c((bdl)cwt2.e)) {
                    return false;
                }
            }
        }
        return super.a(ahy2, f2);
    }

    @Override
    public boolean c(bdl bdl2) {
        if (!this.cU()) {
            return false;
        }
        return super.c(bdl2);
    }

    private boolean cU() {
        return this.b.af();
    }

    @Override
    public cpk e_(int n2) {
        this.cm = true;
        if (this.bS == 1 && n2 == 1) {
            this.aQ.e(this);
            if (!this.h) {
                this.h = true;
                if (this.a(bpa.D)) {
                    this.a.a(new avk(4, 0.0f));
                } else {
                    this.a((cyd)bpa.D);
                    this.a.a(new avk(4, 1.0f));
                }
            }
            return this;
        }
        if (this.bS == 0 && n2 == 1) {
            this.a((cyd)bpa.C);
            n2 = 1;
        } else {
            this.a((cyd)bpa.y);
        }
        ((cmt)((Object)this.b.al())).a(this, n2);
        this.a.a(new aqp(1032, cmz.e, 0, false));
        this.cg = -1;
        this.cd = -1.0f;
        this.ce = -1;
        return this;
    }

    @Override
    public boolean a(czt czt2) {
        if (czt2.aL()) {
            return this.cN() == this;
        }
        if (this.aL()) {
            return false;
        }
        return super.a(czt2);
    }

    private void a(bql bql2) {
        hv hv2;
        if (bql2 != null && (hv2 = bql2.a_()) != null) {
            this.a.a(hv2);
        }
    }

    @Override
    public void b(cpk cpk2, int n2) {
        super.b(cpk2, n2);
        this.p.a();
    }

    @Override
    public bqd a(cmz cmz2) {
        bqd bqd2 = super.a(cmz2);
        if (bqd2 == bqd.a) {
            this.a(bpv.ad);
            bjj bjj2 = new bjj(this, cmz2);
            this.bS().af().a((cpk)this, bjj2);
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
            this.a.a(bjj2);
        }
        return bqd2;
    }

    @Override
    public void a(boolean bl2, boolean bl3, boolean bl4) {
        if (this.H_()) {
            this.bS().af().b(this, new atk(this, 2));
        }
        super.a(bl2, bl3, bl4);
        if (this.a != null) {
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
        }
    }

    @Override
    public boolean a(cpk cpk2, boolean bl2) {
        cpk cpk3 = this.cL();
        if (!super.a(cpk2, bl2)) {
            return false;
        }
        cpk cpk4 = this.cL();
        if (cpk4 != cpk3 && this.a != null) {
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
        }
        return true;
    }

    @Override
    public void s_() {
        cpk cpk2 = this.cL();
        super.s_();
        cpk cpk3 = this.cL();
        if (cpk3 != cpk2 && this.a != null) {
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
        }
    }

    @Override
    public boolean c(ahy ahy2) {
        return super.c(ahy2) || this.cQ();
    }

    @Override
    protected void a(double d2, boolean bl2, dbk dbk2, cmz cmz2) {
    }

    @Override
    protected void c(cmz cmz2) {
        if (!this.aL()) {
            super.c(cmz2);
        }
    }

    public void a(double d2, boolean bl2) {
        cmz cmz2;
        dbk dbk2;
        bfa bfa2;
        int n2;
        int n3;
        int n4 = cmk.c(this.aU);
        cmz cmz3 = new cmz(n4, n3 = cmk.c(this.aV - (double)0.2f), n2 = cmk.c(this.aW));
        dbk dbk3 = this.aQ.n(cmz3);
        if (dbk3.a() == ahk.a && ((bfa2 = (dbk2 = this.aQ.n(cmz2 = cmz3.h())).t()) instanceof gd || bfa2 instanceof zd || bfa2 instanceof bty)) {
            cmz3 = cmz2;
            dbk3 = dbk2;
        }
        super.a(d2, bl2, dbk3, cmz3);
    }

    @Override
    public void a(bxr bxr2) {
        bxr2.a(this);
        this.a.a(new azq(bxr2.y()));
    }

    private void cV() {
        this.cn = this.cn % 100 + 1;
    }

    @Override
    public void a(ciq ciq2) {
        if (ciq2 instanceof cem && ((cem)((Object)ciq2)).h() != null && this.aL()) {
            this.a(new du("container.spectatorCantOpen", new Object[0]).a(new bcc().a(aug.m)));
            return;
        }
        this.cV();
        this.a.a(new ckj(this.cn, ciq2.n(), ciq2.v()));
        this.p = ciq2.a(this.n, this);
        this.p.h = this.cn;
        this.p.b(this);
    }

    @Override
    public void a(tb tb2) {
        bme bme2;
        if (tb2 instanceof cem && ((cem)((Object)tb2)).h() != null && this.aL()) {
            this.a(new du("container.spectatorCantOpen", new Object[0]).a(new bcc().a(aug.m)));
            return;
        }
        if (this.p != this.o) {
            this.q();
        }
        if (tb2 instanceof bme && (bme2 = (bme)tb2).aJ_() && !this.a(bme2.i()) && !this.aL()) {
            this.a.a(new cxg(new du("container.isLocked", tb2.v()), 2));
            this.a.a(new cya(dah.W, csg.e, this.aU, this.aV, this.aW, 1.0f, 1.0f));
            return;
        }
        this.cV();
        if (tb2 instanceof ciq) {
            this.a.a(new ckj(this.cn, ((ciq)((Object)tb2)).n(), tb2.v(), tb2.aI_()));
            this.p = ((ciq)((Object)tb2)).a(this.n, this);
        } else {
            this.a.a(new ckj(this.cn, "minecraft:container", tb2.v(), tb2.aI_()));
            this.p = new cnx(this.n, tb2, this);
        }
        this.p.h = this.cn;
        this.p.b(this);
    }

    @Override
    public void a(fc fc2) {
        this.cV();
        this.p = new dbx(this.n, fc2, this.aQ);
        this.p.h = this.cn;
        this.p.b(this);
        avq avq2 = ((dbx)this.p).b();
        cbg cbg2 = fc2.v();
        this.a.a(new ckj(this.cn, "minecraft:villager", cbg2, avq2.aI_()));
        beo beo2 = fc2.b(this);
        if (beo2 != null) {
            si si2 = new si(io.netty.b.bi.a());
            si2.E(this.cn);
            beo2.a(si2);
            this.a.a(new afw("MC|TrList", si2));
        }
    }

    @Override
    public void a(it it2, tb tb2) {
        if (this.p != this.o) {
            this.q();
        }
        this.cV();
        this.a.a(new ckj(this.cn, "EntityHorse", tb2.v(), tb2.aI_(), it2.bW()));
        this.p = new bfl(this.n, tb2, it2, this);
        this.p.h = this.cn;
        this.p.b(this);
    }

    @Override
    public void a(bhl bhl2, bqp bqp2) {
        azg azg2 = bhl2.a();
        if (azg2 == hp.bX) {
            si si2 = new si(io.netty.b.bi.a());
            si2.a(bqp2);
            this.a.a(new afw("MC|BOpen", si2));
        }
    }

    @Override
    public void a(jf jf2) {
        jf2.d(true);
        this.a((bql)jf2);
    }

    @Override
    public void a(apq apq2, int n2, bhl bhl2) {
        if (apq2.a(n2) instanceof aul) {
            return;
        }
        if (this.f) {
            return;
        }
        this.a.a(new bxu(apq2.h, n2, bhl2));
    }

    public void a(apq apq2) {
        this.a(apq2, apq2.c());
    }

    @Override
    public void a(apq apq2, List list) {
        this.a.a(new cvw(apq2.h, list));
        this.a.a(new bxu(-1, -1, this.n.n()));
    }

    @Override
    public void a(apq apq2, int n2, int n3) {
        this.a.a(new aqo(apq2.h, n2, n3));
    }

    @Override
    public void a(apq apq2, tb tb2) {
        for (int i2 = 0; i2 < tb2.f(); ++i2) {
            this.a.a(new aqo(apq2.h, i2, tb2.c(i2)));
        }
    }

    @Override
    public void q() {
        this.a.a(new vj(this.p.h));
        this.bP();
    }

    public void bO() {
        if (this.f) {
            return;
        }
        this.a.a(new bxu(-1, -1, this.n.n()));
    }

    public void bP() {
        this.p.a(this);
        this.p = this.o;
    }

    public void a(float f2, float f3, boolean bl2, boolean bl3) {
        if (this.cp()) {
            if (f2 >= -1.0f && f2 <= 1.0f) {
                this.ay = f2;
            }
            if (f3 >= -1.0f && f3 <= 1.0f) {
                this.az = f3;
            }
            this.ax = bl2;
            this.q(bl3);
        }
    }

    @Override
    public boolean a(box box2) {
        return this.aK.a(box2);
    }

    @Override
    public void a(cyd cyd2, int n2) {
        if (cyd2 == null) {
            return;
        }
        this.aK.b(this, cyd2, n2);
        for (bhi bhi2 : this.aN().a(cyd2.k())) {
            this.aN().c(this.i_(), bhi2).a(n2);
        }
        if (this.aK.e()) {
            this.aK.a(this);
        }
    }

    @Override
    public void b(cyd cyd2) {
        if (cyd2 == null) {
            return;
        }
        this.aK.a(this, cyd2, 0);
        for (bhi bhi2 : this.aN().a(cyd2.k())) {
            this.aN().c(this.i_(), bhi2).c(0);
        }
        if (this.aK.e()) {
            this.aK.a(this);
        }
    }

    public void bQ() {
        this.cl();
        if (this.B) {
            this.a(true, false, false);
        }
    }

    public void bR() {
        this.cd = -1.0E8f;
    }

    @Override
    public void b(cbg cbg2) {
        this.a.a(new cxg(cbg2));
    }

    @Override
    protected void bF() {
        if (this.aH != null && this.ag_()) {
            this.a.a(new buk(this, 9));
            super.bF();
        }
    }

    @Override
    public void a(bdl bdl2, boolean bl2) {
        super.a(bdl2, bl2);
        this.cg = -1;
        this.cd = -1.0f;
        this.ce = -1;
        this.k.addAll(((czt)bdl2).k);
    }

    @Override
    protected void c(cko cko2) {
        super.c(cko2);
        this.a.a(new bbk(this.bW(), cko2));
    }

    @Override
    protected void a(cko cko2, boolean bl2) {
        super.a(cko2, bl2);
        this.a.a(new bbk(this.bW(), cko2));
    }

    @Override
    protected void d(cko cko2) {
        super.d(cko2);
        this.a.a(new dfh(this.bW(), cko2.a()));
    }

    @Override
    public void l(double d2, double d3, double d4) {
        this.a.a(d2, d3, d4, this.ba, this.bb);
    }

    @Override
    public void e(cpk cpk2) {
        this.bS().af().b(this, new atk(cpk2, 4));
    }

    @Override
    public void f(cpk cpk2) {
        this.bS().af().b(this, new atk(cpk2, 5));
    }

    @Override
    public void x() {
        if (this.a == null) {
            return;
        }
        this.a.a(new bep(this.G));
        this.E_();
    }

    public alj bS() {
        return (alj)this.aQ;
    }

    @Override
    public void a(bvh bvh2) {
        this.c.a(bvh2);
        this.a.a(new avk(3, bvh2.a()));
        if (bvh2 == bvh.e) {
            this.s_();
        } else {
            this.w(this);
        }
        this.x();
        this.bD();
    }

    @Override
    public boolean aL() {
        return this.c.b() == bvh.e;
    }

    @Override
    public boolean aM() {
        return this.c.b() == bvh.c;
    }

    @Override
    public void a(cbg cbg2) {
        this.a.a(new cxg(cbg2));
    }

    @Override
    public boolean a(int n2, String string) {
        if ("seed".equals(string) && !this.b.aa()) {
            return true;
        }
        if ("tell".equals(string) || "help".equals(string) || "me".equals(string) || "trigger".equals(string)) {
            return true;
        }
        if (((cmt)((Object)this.b.al())).e(this.aq())) {
            cle cle2 = (cle)((cmt)((Object)this.b.al())).m().b((Object)this.aq());
            if (cle2 != null) {
                return cle2.c() >= n2;
            }
            return this.b.q() >= n2;
        }
        return false;
    }

    public String bT() {
        String string = this.a.a.b().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    public void a(aoc aoc2) {
        this.j = aoc2.a();
        this.ci = aoc2.b();
        this.cj = aoc2.c();
        this.bY().b(l, (byte)aoc2.d());
        this.bY().b(m, (byte)(aoc2.e() != s.a ? 1 : 0));
    }

    public bgi bU() {
        return this.ci;
    }

    public void a(String string, String string2) {
        this.a.a(new bfu(string, string2));
    }

    @Override
    public cmz k_() {
        return new cmz(this.aU, this.aV + 0.5, this.aW);
    }

    public void bV() {
        this.ck = net.minecraft.c.a.av();
    }

    public f cM() {
        return this.aK;
    }

    public void u(cpk cpk2) {
        if (cpk2 instanceof bdl) {
            this.a.a(new cej(cpk2.bW()));
        } else {
            this.k.add(cpk2.bW());
        }
    }

    public void v(cpk cpk2) {
        this.k.remove((Object)cpk2.bW());
    }

    @Override
    protected void E_() {
        if (this.aL()) {
            this.bd();
            this.e_(true);
        } else {
            super.E_();
        }
        this.bS().af().a(this);
    }

    public cpk cN() {
        return this.cl == null ? this : this.cl;
    }

    public void w(cpk cpk2) {
        cpk cpk3 = this.cN();
        cpk cpk4 = this.cl = cpk2 == null ? this : cpk2;
        if (cpk3 != this.cl) {
            this.a.a(new cpe(this.cl));
            this.l(this.cl.aU, this.cl.aV, this.cl.aW);
        }
    }

    @Override
    protected void bZ() {
        if (this.bP > 0 && !this.cm) {
            --this.bP;
        }
    }

    @Override
    public void g(cpk cpk2) {
        if (this.c.b() == bvh.e) {
            this.w(cpk2);
        } else {
            super.g(cpk2);
        }
    }

    public long cO() {
        return this.ck;
    }

    public cbg cP() {
        return null;
    }

    @Override
    public void a(bqp bqp2) {
        super.a(bqp2);
        this.aR();
    }

    public boolean cQ() {
        return this.cm;
    }

    public void cR() {
        this.cm = false;
    }

    public void cS() {
        this.b(7, true);
    }

    public void cT() {
        this.b(7, true);
        this.b(7, false);
    }
}

