/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.n.a.dl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import net.minecraft.c.a;
import net.minecraft.q.v;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class alj
extends iu
implements aie {
    private static final d a = org.apache.logging.log4j.c.c();
    private final a I;
    private final tt J;
    private final arr K;
    private final Set L = aad.a();
    private final TreeSet M = new TreeSet();
    private final Map N = sz.c();
    public boolean G;
    private boolean O;
    private int P;
    private final bel Q;
    private final cnv R = new cnv();
    protected final cvt H = new cvt(this);
    private final ajf[] S = new ajf[]{new ajf(null), new ajf(null)};
    private int T;
    private final List U = ov.a();

    public alj(a a2, ajq ajq2, cvn cvn2, int n2, cfe cfe2) {
        super(ajq2, cvn2, cyy.a(n2).d(), cfe2, false);
        this.I = a2;
        this.J = new tt(this);
        this.K = new arr(this);
        this.q.a(this);
        this.t = this.e();
        this.Q = new bel(this);
        this.o();
        this.q();
        this.U().a(a2.aD());
    }

    @Override
    public iu b() {
        this.x = new bkj(this.u);
        String string = go.a(this.q);
        go go2 = (go)this.x.a(go.class, string);
        if (go2 == null) {
            this.y = new go(this);
            this.x.a(string, this.y);
        } else {
            this.y = go2;
            this.y.a(this);
        }
        this.B = new ats(this.I);
        dcr dcr2 = (dcr)this.x.a(dcr.class, "scoreboard");
        if (dcr2 == null) {
            dcr2 = new dcr();
            this.x.a("scoreboard", dcr2);
        }
        dcr2.a(this.B);
        ((ats)this.B).a(new avd(dcr2));
        this.z = new baz(new File(new File(this.u.a(), "data"), "loot_tables"));
        this.U().b(this.v.A(), this.v.B());
        this.U().c(this.v.G());
        this.U().b(this.v.F());
        this.U().c(this.v.H());
        this.U().b(this.v.I());
        if (this.v.D() > 0L) {
            this.U().a(this.v.C(), this.v.E(), this.v.D());
        } else {
            this.U().a(this.v.C());
        }
        return this;
    }

    @Override
    public void p() {
        super.p();
        if (this.E().r() && this.Q() != ct.d) {
            this.E().a(ct.d);
        }
        this.q.l().b();
        if (this.X()) {
            if (this.F().b("doDaylightCycle")) {
                long l2 = this.v.f() + 24000L;
                this.v.b(l2 - l2 % 24000L);
            }
            this.W();
        }
        this.A.a("mobSpawner");
        if (this.F().b("doMobSpawning") && this.v.s() != aaf.g) {
            this.R.a(this, this.D, this.E, this.v.e() % 400L == 0L);
        }
        this.A.c("chunkSource");
        this.t.a();
        int n2 = this.a(1.0f);
        if (n2 != this.R()) {
            this.c(n2);
        }
        this.v.a(this.v.e() + 1L);
        if (this.F().b("doDaylightCycle")) {
            this.v.b(this.v.f() + 1L);
        }
        this.A.c("tickPending");
        this.a(false);
        this.A.c("tickBlocks");
        this.s();
        this.A.c("chunkMap");
        this.K.c();
        this.A.c("village");
        this.y.c();
        this.H.a();
        this.A.c("portalForcer");
        this.Q.a(this.z());
        this.A.b();
        this.am();
    }

    public clh a(nx nx2, cmz cmz2) {
        List list = this.ad().a(nx2, cmz2);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (clh)ctt.a(this.p, list);
    }

    public boolean a(nx nx2, clh clh2, cmz cmz2) {
        List list = this.ad().a(nx2, cmz2);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(clh2);
    }

    @Override
    public void G() {
        this.O = false;
        if (!this.g.isEmpty()) {
            int n2 = 0;
            int n3 = 0;
            for (bdl bdl2 : this.g) {
                if (bdl2.aL()) {
                    ++n2;
                    continue;
                }
                if (!bdl2.H_()) continue;
                ++n3;
            }
            this.O = n3 > 0 && n3 >= this.g.size() - n2;
        }
    }

    protected void W() {
        this.O = false;
        for (bdl bdl2 : this.g) {
            if (!bdl2.H_()) continue;
            bdl2.a(false, false, true);
        }
        this.c();
    }

    private void c() {
        this.v.f(0);
        this.v.b(false);
        this.v.e(0);
        this.v.a(false);
    }

    public boolean X() {
        if (this.O && !this.C) {
            for (bdl bdl2 : this.g) {
                if (bdl2.aL() || bdl2.at()) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void g() {
        if (this.v.c() <= 0) {
            this.v.b(this.u() + 1);
        }
        int n2 = this.v.b();
        int n3 = this.v.d();
        int n4 = 0;
        while (this.b(new cmz(n2, 0, n3)).a() == ahk.a) {
            n2 += this.p.nextInt(8) - this.p.nextInt(8);
            n3 += this.p.nextInt(8) - this.p.nextInt(8);
            if (++n4 != 10000) continue;
        }
        this.v.a(n2);
        this.v.c(n3);
    }

    @Override
    protected boolean a(int n2, int n3, boolean bl2) {
        return this.ad().d(n2, n3);
    }

    protected void Y() {
        this.A.a("playerCheckLight");
        if (!this.g.isEmpty()) {
            int n2 = this.p.nextInt(this.g.size());
            bdl bdl2 = (bdl)this.g.get(n2);
            int n3 = cmk.c(bdl2.aU) + this.p.nextInt(11) - 5;
            int n4 = cmk.c(bdl2.aV) + this.p.nextInt(11) - 5;
            int n5 = cmk.c(bdl2.aW) + this.p.nextInt(11) - 5;
            this.v(new cmz(n3, n4, n5));
        }
        this.A.b();
    }

    @Override
    protected void s() {
        this.Y();
        if (this.v.s() == aaf.g) {
            Iterator iterator = this.K.b();
            while (iterator.hasNext()) {
                ((bhm)iterator.next()).b(false);
            }
            return;
        }
        int n2 = this.F().c("randomTickSpeed");
        boolean bl2 = this.I();
        boolean bl3 = this.H();
        this.A.a("pollingChunks");
        Iterator iterator = this.K.b();
        while (iterator.hasNext()) {
            Object object;
            cmz cmz2;
            int n3;
            this.A.a("getChunk");
            bhm bhm2 = (bhm)iterator.next();
            int n4 = bhm2.b * 16;
            int n5 = bhm2.c * 16;
            this.A.c("checkNextLight");
            bhm2.n();
            this.A.c("tickChunk");
            bhm2.b(false);
            this.A.c("thunder");
            if (bl2 && bl3 && this.p.nextInt(100000) == 0) {
                this.j = this.j * 3 + 1013904223;
                n3 = this.j >> 2;
                cmz2 = this.D(new cmz(n4 + (n3 & 0xF), 0, n5 + (n3 >> 8 & 0xF)));
                if (this.A(cmz2)) {
                    object = this.C(cmz2);
                    if (this.p.nextDouble() < (double)((bgp)object).a() * 0.05) {
                        it it2 = new it(this);
                        it2.a(bmv.e);
                        it2.k(true);
                        it2.j(0);
                        it2.d(cmz2.a(), cmz2.b(), cmz2.c());
                        this.b(it2);
                        this.a(new tz(this, cmz2.a(), cmz2.b(), cmz2.c(), true));
                    } else {
                        this.a(new tz(this, cmz2.a(), cmz2.b(), cmz2.c(), false));
                    }
                }
            }
            this.A.c("iceandsnow");
            if (this.p.nextInt(16) == 0) {
                this.j = this.j * 3 + 1013904223;
                n3 = this.j >> 2;
                cmz2 = this.o(new cmz(n4 + (n3 & 0xF), 0, n5 + (n3 >> 8 & 0xF)));
                object = cmz2.h();
                if (this.u((cmz)object)) {
                    this.a((cmz)object, blg.aI.s());
                }
                if (bl2 && this.f(cmz2, true)) {
                    this.a(cmz2, blg.aH.s());
                }
                if (bl2 && this.a((cmz)object).d()) {
                    this.n((cmz)object).t().a_(this, (cmz)object);
                }
            }
            this.A.c("tickBlocks");
            if (n2 > 0) {
                for (aei aei2 : bhm2.b()) {
                    if (aei2 == bhm.a || !aei2.b()) continue;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        this.j = this.j * 3 + 1013904223;
                        int n6 = this.j >> 2;
                        int n7 = n6 & 0xF;
                        int n8 = n6 >> 8 & 0xF;
                        int n9 = n6 >> 16 & 0xF;
                        dbk dbk2 = aei2.a(n7, n9, n8);
                        bfa bfa2 = dbk2.t();
                        this.A.a("randomTick");
                        if (bfa2.k()) {
                            bfa2.b((iu)this, new cmz(n7 + n4, n9 + aei2.c(), n8 + n5), dbk2, this.p);
                        }
                        this.A.b();
                    }
                }
            }
            this.A.b();
        }
        this.A.b();
    }

    protected cmz D(cmz cmz2) {
        cmz cmz3 = this.o(cmz2);
        cxt cxt2 = new cxt(cmz3, new cmz(cmz3.a(), this.K(), cmz3.c())).b(3.0);
        List list = this.a(bga.class, cxt2, (com.a.a.b.cm)new aos(this));
        if (!list.isEmpty()) {
            return ((bga)list.get(this.p.nextInt(list.size()))).k_();
        }
        if (cmz3.b() == -1) {
            cmz3 = cmz3.b(2);
        }
        return cmz3;
    }

    @Override
    public boolean d(cmz cmz2, bfa bfa2) {
        api api2 = new api(cmz2, bfa2);
        return this.U.contains(api2);
    }

    @Override
    public boolean e(cmz cmz2, bfa bfa2) {
        api api2 = new api(cmz2, bfa2);
        return this.L.contains(api2);
    }

    @Override
    public void a(cmz cmz2, bfa bfa2, int n2) {
        this.a(cmz2, bfa2, n2, 0);
    }

    @Override
    public void a(cmz cmz2, bfa bfa2, int n2, int n3) {
        if (cmz2 instanceof pj || cmz2 instanceof bjb) {
            cmz2 = new cmz(cmz2);
            org.apache.logging.log4j.c.c().f("Tried to assign a mutable BlockPos to tick data...", (Throwable)new Error(cmz2.getClass().toString()));
        }
        ahk ahk2 = bfa2.s().a();
        if (this.b && ahk2 != ahk.a) {
            if (bfa2.i()) {
                dbk dbk2;
                if (this.a(cmz2.e(-8, -8, -8), cmz2.e(8, 8, 8)) && (dbk2 = this.n(cmz2)).a() != ahk.a && dbk2.t() == bfa2) {
                    dbk2.t().a((iu)this, cmz2, dbk2, this.p);
                }
                return;
            }
            n2 = 1;
        }
        api api2 = new api(cmz2, bfa2);
        if (this.d(cmz2)) {
            if (ahk2 != ahk.a) {
                api2.a((long)n2 + this.v.e());
                api2.a(n3);
            }
            if (!this.L.contains(api2)) {
                this.L.add(api2);
                this.M.add(api2);
            }
        }
    }

    @Override
    public void b(cmz cmz2, bfa bfa2, int n2, int n3) {
        if (cmz2 instanceof pj || cmz2 instanceof bjb) {
            cmz2 = new cmz(cmz2);
            org.apache.logging.log4j.c.c().f("Tried to assign a mutable BlockPos to tick data...", (Throwable)new Error(cmz2.getClass().toString()));
        }
        api api2 = new api(cmz2, bfa2);
        api2.a(n3);
        ahk ahk2 = bfa2.s().a();
        if (ahk2 != ahk.a) {
            api2.a((long)n2 + this.v.e());
        }
        if (!this.L.contains(api2)) {
            this.L.add(api2);
            this.M.add(api2);
        }
    }

    @Override
    public void k() {
        if (this.g.isEmpty()) {
            if (this.P++ >= 300) {
                return;
            }
        } else {
            this.Z();
        }
        this.q.r();
        super.k();
    }

    @Override
    protected void l() {
        super.l();
        this.A.c("players");
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            cpk cpk2 = (cpk)this.g.get(i2);
            cpk cpk3 = cpk2.cL();
            if (cpk3 != null) {
                if (!cpk3.bk && cpk3.r(cpk2)) continue;
                cpk2.s_();
            }
            this.A.a("tick");
            if (!cpk2.bk) {
                try {
                    this.g(cpk2);
                }
                catch (Throwable throwable) {
                    cet cet2 = cet.a(throwable, "Ticking player");
                    sx sx2 = cet2.a("Player being ticked");
                    cpk2.a(sx2);
                    throw new oz(cet2);
                }
            }
            this.A.b();
            this.A.a("remove");
            if (cpk2.bk) {
                int n2 = cpk2.bH;
                int n3 = cpk2.bJ;
                if (cpk2.bG && this.a(n2, n3, true)) {
                    this.a(n2, n3).b(cpk2);
                }
                this.c.remove(cpk2);
                this.d(cpk2);
            }
            this.A.b();
        }
    }

    public void Z() {
        this.P = 0;
    }

    @Override
    public boolean a(boolean bl2) {
        api api2;
        if (this.v.s() == aaf.g) {
            return false;
        }
        int n2 = this.M.size();
        if (n2 != this.L.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n2 > 65536) {
            n2 = 65536;
        }
        this.A.a("cleaning");
        for (int i2 = 0; i2 < n2; ++i2) {
            api2 = (api)this.M.first();
            if (!bl2 && api2.b > this.v.e()) break;
            this.M.remove(api2);
            this.L.remove(api2);
            this.U.add(api2);
        }
        this.A.b();
        this.A.a("ticking");
        Iterator iterator = this.U.iterator();
        while (iterator.hasNext()) {
            api2 = (api)iterator.next();
            iterator.remove();
            boolean bl3 = false;
            if (this.a(api2.a.e(0, 0, 0), api2.a.e(0, 0, 0))) {
                dbk dbk2 = this.n(api2.a);
                if (dbk2.a() == ahk.a || !bfa.a(dbk2.t(), api2.a())) continue;
                try {
                    dbk2.t().a((iu)this, api2.a, dbk2, this.p);
                    continue;
                }
                catch (Throwable throwable) {
                    cet cet2 = cet.a(throwable, "Exception while ticking a block");
                    sx sx2 = cet2.a("Block being ticked");
                    sx.a(sx2, api2.a, dbk2);
                    throw new oz(cet2);
                }
            }
            this.a(api2.a, api2.a(), 0);
        }
        this.A.b();
        this.U.clear();
        return !this.M.isEmpty();
    }

    @Override
    public List a(bhm bhm2, boolean bl2) {
        zz zz2 = bhm2.k();
        int n2 = (zz2.a << 4) - 2;
        int n3 = n2 + 16 + 2;
        int n4 = (zz2.b << 4) - 2;
        int n5 = n4 + 16 + 2;
        return this.b(new awx(n2, 0, n4, n3, 256, n5), bl2);
    }

    @Override
    public List b(awx awx2, boolean bl2) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < 2; ++i2) {
            Iterator iterator = i2 == 0 ? this.M.iterator() : this.U.iterator();
            while (iterator.hasNext()) {
                api api2 = (api)iterator.next();
                cmz cmz2 = api2.a;
                if (cmz2.a() < awx2.a || cmz2.a() >= awx2.d || cmz2.c() < awx2.c || cmz2.c() >= awx2.f) continue;
                if (bl2) {
                    if (i2 == 0) {
                        this.L.remove(api2);
                    }
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = ov.a();
                }
                arrayList.add(api2);
            }
        }
        return arrayList;
    }

    @Override
    public void a(cpk cpk2, boolean bl2) {
        if (!this.ak() && (cpk2 instanceof cxn || cpk2 instanceof ev)) {
            cpk2.ak_();
        }
        if (!this.aj() && cpk2 instanceof cgx) {
            cpk2.ak_();
        }
        super.a(cpk2, bl2);
    }

    private boolean aj() {
        return this.I.ad();
    }

    private boolean ak() {
        return this.I.ac();
    }

    @Override
    protected apb e() {
        dab dab2 = this.u.a(this.q);
        return new czb(this, dab2, this.q.d());
    }

    @Override
    public boolean a(bdl bdl2, cmz cmz2) {
        return !this.I.a((aid)((Object)this), (cm)((Object)cmz2), (zs)((Object)bdl2)) && this.U().a(cmz2);
    }

    @Override
    public void a(atd atd2) {
        if (!this.v.u()) {
            try {
                this.b(atd2);
                if (this.v.s() == aaf.g) {
                    this.al();
                }
                super.a(atd2);
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Exception initializing level");
                try {
                    this.a(cet2);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new oz(cet2);
            }
            this.v.d(true);
        }
    }

    private void al() {
        this.v.f(false);
        this.v.c(true);
        this.v.b(false);
        this.v.a(false);
        this.v.g(1000000000);
        this.v.b(6000L);
        this.v.a(bvh.e);
        this.v.g(false);
        this.v.a(ct.a);
        this.v.e(true);
        this.F().a("doDaylightCycle", "false");
    }

    private void b(atd atd2) {
        if (!this.q.f()) {
            this.v.a(cmz.e.b(this.q.j()));
            return;
        }
        if (this.v.s() == aaf.g) {
            this.v.a(cmz.e.g());
            return;
        }
        this.w = true;
        ey ey2 = this.q.l();
        List list = ey2.a();
        Random random = new Random(this.y());
        cmz cmz2 = ey2.a(0, 0, 256, list, random);
        int n2 = 8;
        int n3 = this.q.j();
        int n4 = 8;
        if (cmz2 != null) {
            n2 = cmz2.a();
            n4 = cmz2.c();
        } else {
            a.f("Unable to find spawn biome");
        }
        int n5 = 0;
        while (!this.q.b(n2, n4)) {
            n2 += random.nextInt(64) - random.nextInt(64);
            n4 += random.nextInt(64) - random.nextInt(64);
            if (++n5 != 1000) continue;
        }
        this.v.a(new cmz(n2, n3, n4));
        this.w = false;
        if (atd2.c()) {
            this.aa();
        }
    }

    protected void aa() {
        int n2;
        int n3;
        cmz cmz2;
        bkc bkc2 = new bkc();
        for (int i2 = 0; i2 < 10 && !bkc2.a((iu)this, this.p, cmz2 = this.p(new cmz(n3 = this.v.b() + this.p.nextInt(6) - this.p.nextInt(6), 0, n2 = this.v.d() + this.p.nextInt(6) - this.p.nextInt(6))).g()); ++i2) {
        }
    }

    public cmz ab() {
        return this.q.i();
    }

    public void a(boolean bl2, wd wd2) {
        czb czb2 = this.ad();
        if (!czb2.f()) {
            return;
        }
        if (wd2 != null) {
            wd2.a("Saving level");
        }
        this.a();
        if (wd2 != null) {
            wd2.c("Saving chunks");
        }
        czb2.a(bl2);
        ArrayList arrayList = ov.a(czb2.c());
        for (bhm bhm2 : arrayList) {
            if (bhm2 == null || this.K.a(bhm2.b, bhm2.c)) continue;
            czb2.a(bhm2);
        }
    }

    public void ac() {
        czb czb2 = this.ad();
        if (!czb2.f()) {
            return;
        }
        czb2.e();
    }

    protected void a() {
        this.x();
        for (v v2 : this.I.d) {
            if (!(v2 instanceof ib)) continue;
            ((ib)((Object)v2)).c();
        }
        this.v.a(this.U().h());
        this.v.d(this.U().f());
        this.v.c(this.U().g());
        this.v.e(this.U().m());
        this.v.f(this.U().n());
        this.v.h(this.U().q());
        this.v.i(this.U().p());
        this.v.b(this.U().j());
        this.v.c(this.U().i());
        this.u.a(this.v, ((cmt)((Object)this.I.al())).b());
        this.x.a();
    }

    @Override
    public boolean b(cpk cpk2) {
        if (this.i(cpk2)) {
            return super.b(cpk2);
        }
        return false;
    }

    @Override
    public void b(Collection collection) {
        ArrayList arrayList = ov.a(collection);
        for (cpk cpk2 : arrayList) {
            if (!this.i(cpk2)) continue;
            this.c.add(cpk2);
            this.c(cpk2);
        }
    }

    private boolean i(cpk cpk2) {
        if (cpk2.bk) {
            a.f("Tried to add entity {} but it was marked as removed already", vb.b(cpk2));
            return false;
        }
        UUID uUID = cpk2.cx();
        if (this.N.containsKey(uUID)) {
            cpk cpk3 = (cpk)this.N.get(uUID);
            if (this.d.contains(cpk3)) {
                this.d.remove(cpk3);
            } else {
                if (!(cpk2 instanceof bdl)) {
                    a.f("Keeping entity {} that already exists with UUID {}", vb.b(cpk3), uUID.toString());
                    return false;
                }
                a.f("Force-added player with duplicate UUID {}", uUID.toString());
            }
            this.f(cpk3);
        }
        return true;
    }

    @Override
    protected void c(cpk cpk2) {
        super.c(cpk2);
        this.i.a(cpk2.bW(), cpk2);
        this.N.put(cpk2.cx(), cpk2);
        cpk[] arrcpk = cpk2.at_();
        if (arrcpk != null) {
            for (cpk cpk3 : arrcpk) {
                this.i.a(cpk3.bW(), cpk3);
            }
        }
    }

    @Override
    protected void d(cpk cpk2) {
        super.d(cpk2);
        this.i.d(cpk2.bW());
        this.N.remove(cpk2.cx());
        cpk[] arrcpk = cpk2.at_();
        if (arrcpk != null) {
            for (cpk cpk3 : arrcpk) {
                this.i.d(cpk3.bW());
            }
        }
    }

    @Override
    public boolean a(cpk cpk2) {
        if (super.a(cpk2)) {
            ((cmt)((Object)this.I.al())).a(null, cpk2.aU, cpk2.aV, cpk2.aW, 512.0, this.q.a().a(), new cus(cpk2));
            return true;
        }
        return false;
    }

    @Override
    public void a(cpk cpk2, byte by2) {
        this.af().b(cpk2, new buk(cpk2, by2));
    }

    public czb ad() {
        return (czb)super.C();
    }

    @Override
    public yk a(cpk cpk2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        yk yk2 = new yk(this, cpk2, d2, d3, d4, f2, bl2, bl3);
        yk2.a();
        yk2.a(false);
        if (!bl3) {
            yk2.d();
        }
        for (bdl bdl2 : this.g) {
            if (!(bdl2.i(d2, d3, d4) < 4096.0)) continue;
            ((czt)bdl2).a.a(new caa(d2, d3, d4, f2, yk2.e(), (amj)yk2.b().get(bdl2)));
        }
        return yk2;
    }

    @Override
    public void c(cmz cmz2, bfa bfa2, int n2, int n3) {
        cgh cgh2 = new cgh(cmz2, bfa2, n2, n3);
        for (cgh cgh3 : this.S[this.T]) {
            if (!cgh3.equals(cgh2)) continue;
            return;
        }
        this.S[this.T].add(cgh2);
    }

    private void am() {
        while (!this.S[this.T].isEmpty()) {
            int n2 = this.T;
            this.T ^= 1;
            for (cgh cgh2 : this.S[n2]) {
                if (!this.a(cgh2)) continue;
                ((cmt)((Object)this.I.al())).a(null, cgh2.a().a(), cgh2.a().b(), cgh2.a().c(), 64.0, this.q.a().a(), new ahm(cgh2.a(), cgh2.d(), cgh2.b(), cgh2.c()));
            }
            this.S[n2].clear();
        }
    }

    private boolean a(cgh cgh2) {
        dbk dbk2 = this.n(cgh2.a());
        if (dbk2.t() == cgh2.d()) {
            return dbk2.a((iu)this, cgh2.a(), cgh2.b(), cgh2.c());
        }
        return false;
    }

    public void ae() {
        this.u.f();
    }

    @Override
    protected void r() {
        boolean bl2 = this.I();
        super.r();
        if (this.l != this.m) {
            ((cmt)((Object)this.I.al())).a(new avk(7, this.m), this.q.a().a());
        }
        if (this.n != this.o) {
            ((cmt)((Object)this.I.al())).a(new avk(8, this.o), this.q.a().a());
        }
        if (bl2 != this.I()) {
            if (bl2) {
                ((cmt)((Object)this.I.al())).a(new avk(2, 0.0f));
            } else {
                ((cmt)((Object)this.I.al())).a(new avk(1, 0.0f));
            }
            ((cmt)((Object)this.I.al())).a(new avk(7, this.m));
            ((cmt)((Object)this.I.al())).a(new avk(8, this.o));
        }
    }

    @Override
    public a f() {
        return this.I;
    }

    public tt af() {
        return this.J;
    }

    public arr ag() {
        return this.K;
    }

    public bel ah() {
        return this.Q;
    }

    public bzz ai() {
        return this.u.g();
    }

    public void a(lz lz2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... arrn) {
        this.a(lz2, false, d2, d3, d4, n2, d5, d6, d7, d8, arrn);
    }

    public void a(lz lz2, boolean bl2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... arrn) {
        cnu cnu2 = new cnu(lz2, bl2, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, n2, arrn);
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            czt czt2 = (czt)this.g.get(i2);
            this.a(czt2, bl2, d2, d3, d4, cnu2);
        }
    }

    public void a(czt czt2, lz lz2, boolean bl2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... arrn) {
        cnu cnu2 = new cnu(lz2, bl2, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, n2, arrn);
        this.a(czt2, bl2, d2, d3, d4, cnu2);
    }

    private void a(czt czt2, boolean bl2, double d2, double d3, double d4, ds ds2) {
        cmz cmz2 = czt2.k_();
        double d5 = cmz2.d(d2, d3, d4);
        if (d5 <= 1024.0 || bl2 && d5 <= 262144.0) {
            czt2.a.a(ds2);
        }
    }

    public cpk b(UUID uUID) {
        return (cpk)this.N.get(uUID);
    }

    @Override
    public dl a(Runnable runnable) {
        return this.I.a(runnable);
    }

    @Override
    public boolean d() {
        return this.I.aE();
    }

    @Override
    public /* synthetic */ apb C() {
        return this.ad();
    }
}

