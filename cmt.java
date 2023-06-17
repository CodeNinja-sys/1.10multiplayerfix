/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.c.a.e;
import io.netty.b.bi;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.c.a;
import net.minecraft.q.v;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class cmt {
    public static final File a = new File("banned-players.json");
    public static final File b = new File("banned-ips.json");
    public static final File c = new File("ops.json");
    public static final File d = new File("whitelist.json");
    private static final d f = org.apache.logging.log4j.c.c();
    private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final a h;
    private final List i = ov.a();
    private final Map j = com.a.a.d.sz.c();
    private final dg k = new dg(a);
    private final aqq l = new aqq(b);
    private final dda m = new dda(c);
    private final cto n = new cto(d);
    private final Map o = com.a.a.d.sz.c();
    private aut p;
    private boolean q;
    protected int e;
    private int r;
    private bvh s;
    private boolean t;
    private int u;

    public cmt(a a2) {
        this.h = a2;
        this.k.a(false);
        this.l.a(false);
        this.e = 8;
    }

    public void a(sz sz2, czt czt2) {
        Object object;
        e e2 = czt2.aq();
        ml ml2 = this.h.aA();
        e e3 = ((bas)((Object)ml2)).a(e2.a());
        String string = e3 == null ? e2.b() : e3.b();
        ((bas)((Object)ml2)).a(e2);
        bvp bvp2 = this.b(czt2);
        czt2.b((iu)((Object)this.h.a(czt2.bS)));
        czt2.c.a((alj)czt2.aQ);
        String string2 = "local";
        if (sz2.b() != null) {
            string2 = sz2.b().toString();
        }
        f.d("{}[{}] logged in with entity id {} at ({}, {}, {})", czt2.i_(), string2, czt2.bW(), czt2.aU, czt2.aV, czt2.aW);
        ls ls2 = this.h.a(czt2.bS);
        cvn cvn2 = ((iu)((Object)ls2)).E();
        cmz cmz2 = ((iu)((Object)ls2)).B();
        this.a(czt2, null, (iu)((Object)ls2));
        bhu bhu2 = new bhu(this.h, sz2, czt2);
        bhu2.a(new kt(czt2.bW(), czt2.c.b(), cvn2.r(), ((alj)ls2).q.a().a(), ((iu)((Object)ls2)).Q(), this.q(), cvn2.s(), ((iu)((Object)ls2)).F().b("reducedDebugInfo")));
        bhu2.a(new afw("MC|Brand", new si(bi.a()).a(this.c().V())));
        bhu2.a(new ckb(cvn2.w(), cvn2.x()));
        bhu2.a(new bxi(cmz2));
        bhu2.a(new bep(czt2.G));
        bhu2.a(new bud(czt2.n.d));
        this.f(czt2);
        czt2.cM().d();
        czt2.cM().b(czt2);
        this.a((ats)((iu)((Object)ls2)).P(), czt2);
        this.h.aC();
        du du2 = czt2.i_().equalsIgnoreCase(string) ? new du("multiplayer.player.joined", czt2.v()) : new du("multiplayer.player.joined.renamed", czt2.v(), string);
        du2.h().a(aug.o);
        this.a(du2);
        this.c(czt2);
        bhu2.a(czt2.aU, czt2.aV, czt2.aW, czt2.ba, czt2.bb);
        this.b(czt2, (alj)((Object)ls2));
        if (!this.h.X().isEmpty()) {
            czt2.a(this.h.X(), this.h.Y());
        }
        Object object2 = czt2.bf().iterator();
        while (object2.hasNext()) {
            object = (cko)object2.next();
            bhu2.a(new bbk(czt2.bW(), (cko)object));
        }
        if (bvp2 != null) {
            if (bvp2.b("RootVehicle", 10)) {
                object2 = bvp2.o("RootVehicle");
                object = aqz.a(((bvp)object2).o("Entity"), (iu)((Object)ls2), true);
                if (object != null) {
                    UUID uUID = ((bvp)object2).a("Attach");
                    if (((cpk)object).cx().equals(uUID)) {
                        czt2.a((cpk)object, true);
                    } else {
                        for (cpk cpk2 : ((cpk)object).cI()) {
                            if (!cpk2.cx().equals(uUID)) continue;
                            czt2.a(cpk2, true);
                            break;
                        }
                    }
                    if (!czt2.cp()) {
                        f.f("Couldn't reattach entity to player");
                        ((iu)((Object)ls2)).f((cpk)object);
                        for (cpk cpk2 : ((cpk)object).cI()) {
                            ((iu)((Object)ls2)).f(cpk2);
                        }
                    }
                }
            } else if (bvp2.b("Riding", 10) && (object2 = aqz.a(bvp2.o("Riding"), (iu)((Object)ls2), true)) != null) {
                czt2.a((cpk)object2, true);
            }
        }
        czt2.C();
    }

    protected void a(ats ats2, czt czt2) {
        HashSet hashSet = aad.a();
        for (Object object : ats2.f()) {
            czt2.a.a(new bvn((ef)object, 0));
        }
        for (int i2 = 0; i2 < 19; ++i2) {
            Object object;
            object = ats2.a(i2);
            if (object == null || hashSet.contains(object)) continue;
            List list = ats2.d((bhi)object);
            for (ds ds2 : list) {
                czt2.a.a(ds2);
            }
            hashSet.add(object);
        }
    }

    public void a(alj[] arralj) {
        this.p = arralj[0].D().d();
        arralj[0].U().a(new akp(this));
    }

    public void a(czt czt2, alj alj2) {
        alj alj3 = czt2.bS();
        if (alj2 != null) {
            alj2.ag().b(czt2);
        }
        alj3.ag().a(czt2);
        alj3.ad().b((int)czt2.aU >> 4, (int)czt2.aW >> 4);
    }

    public int d() {
        return arr.b(this.s());
    }

    public bvp b(czt czt2) {
        bvp bvp2;
        bvp bvp3 = ((iu)((Object)this.h.d[0])).E().h();
        if (czt2.i_().equals(this.h.Q()) && bvp3 != null) {
            bvp2 = ((cgy)((Object)this.h.aI())).a(bst.b, bvp3);
            czt2.f(bvp2);
            f.a("loading single player");
        } else {
            bvp2 = this.p.b(czt2);
        }
        return bvp2;
    }

    protected void a(czt czt2) {
        this.p.a(czt2);
        f f2 = (f)this.o.get(czt2.cx());
        if (f2 != null) {
            f2.b();
        }
    }

    public void c(czt czt2) {
        this.i.add(czt2);
        this.j.put(czt2.cx(), czt2);
        this.a(new cgl(bfp.a, czt2));
        ls ls2 = this.h.a(czt2.bS);
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            czt2.a.a(new cgl(bfp.a, (czt)this.i.get(i2)));
        }
        ((alj)((Object)ls2)).b(czt2);
        this.a(czt2, null);
    }

    public void d(czt czt2) {
        czt2.bS().ag().c(czt2);
    }

    public void e(czt czt2) {
        Object object;
        alj alj2 = czt2.bS();
        czt2.a(bpv.f);
        this.a(czt2);
        if (czt2.cp() && ((cpk)(object = czt2.cJ())).b(czt.class).size() == 1) {
            f.a("Removing player mount");
            czt2.s_();
            alj2.f((cpk)object);
            for (cpk cpk2 : ((cpk)object).cI()) {
                alj2.f(cpk2);
            }
            alj2.a(czt2.bH, czt2.bJ).g();
        }
        alj2.e(czt2);
        alj2.ag().b(czt2);
        this.i.remove(czt2);
        object = czt2.cx();
        czt czt3 = (czt)this.j.get(object);
        if (czt3 == czt2) {
            this.j.remove(object);
            this.o.remove(object);
        }
        this.a(new cgl(bfp.e, czt2));
    }

    public String a(SocketAddress socketAddress, e e2) {
        if (this.k.a(e2)) {
            nn nn2 = (nn)this.k.b((Object)e2);
            String string = "You are banned from this server!\nReason: " + nn2.d();
            if (nn2.c() != null) {
                string = string + "\nYour ban will be removed on " + g.format(nn2.c());
            }
            return string;
        }
        if (!this.d(e2)) {
            return "You are not white-listed on this server!";
        }
        if (this.l.a(socketAddress)) {
            zn zn2 = this.l.b(socketAddress);
            String string = "Your IP address is banned from this server!\nReason: " + zn2.d();
            if (zn2.c() != null) {
                string = string + "\nYour ban will be removed on " + g.format(zn2.c());
            }
            return string;
        }
        if (this.i.size() >= this.e && !this.h(e2)) {
            return "The server is full!";
        }
        return null;
    }

    public czt a(e e2) {
        Object object;
        UUID uUID = bdl.a(e2);
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            object = (czt)this.i.get(i2);
            if (!((cpk)object).cx().equals(uUID)) continue;
            arrayList.add(object);
        }
        czt czt2 = (czt)this.j.get(e2.a());
        if (czt2 != null && !arrayList.contains(czt2)) {
            arrayList.add(czt2);
        }
        for (czt czt3 : arrayList) {
            czt3.a.a("You logged in from another location");
        }
        object = this.h.V() ? new eq((iu)((Object)this.h.a(0))) : new dec((iu)((Object)this.h.a(0)));
        return new czt(this.h, (alj)((Object)this.h.a(0)), e2, (dec)object);
    }

    public czt a(czt czt2, int n2, boolean bl2) {
        Object object2;
        czt2.bS().af().b(czt2);
        czt2.bS().af().b((cpk)czt2);
        czt2.bS().ag().b(czt2);
        this.i.remove(czt2);
        ((iu)((Object)this.h.a(czt2.bS))).f(czt2);
        cmz cmz2 = czt2.av();
        boolean bl3 = czt2.aw();
        czt2.bS = n2;
        dec dec2 = this.h.V() ? new eq((iu)((Object)this.h.a(czt2.bS))) : new dec((iu)((Object)this.h.a(czt2.bS)));
        czt czt3 = new czt(this.h, (alj)((Object)this.h.a(czt2.bS)), czt2.aq(), dec2);
        czt3.a = czt2.a;
        czt3.a(czt2, bl2);
        czt3.l(czt2.bW());
        czt3.q(czt2);
        czt3.a(czt2.aK());
        for (Object object2 : czt2.bX()) {
            czt3.e((String)object2);
        }
        ls ls2 = this.h.a(czt2.bS);
        this.a(czt3, czt2, (iu)((Object)ls2));
        if (cmz2 != null) {
            object2 = bdl.a((iu)((Object)this.h.a(czt2.bS)), cmz2, bl3);
            if (object2 != null) {
                czt3.a_((float)((cjx)object2).a() + 0.5f, (float)((cjx)object2).b() + 0.1f, (float)((cjx)object2).c() + 0.5f, 0.0f, 0.0f);
                czt3.a(cmz2, bl3);
            } else {
                czt3.a.a(new avk(0, 0.0f));
            }
        }
        ((alj)((Object)ls2)).ad().b((int)czt3.aU >> 4, (int)czt3.aW >> 4);
        while (!((iu)((Object)ls2)).a(czt3, czt3.cD()).isEmpty() && czt3.aV < 256.0) {
            czt3.d(czt3.aU, czt3.aV + 1.0, czt3.aW);
        }
        czt3.a.a(new bzd(czt3.bS, czt3.aQ.Q(), czt3.aQ.E().s(), czt3.c.b()));
        object2 = ((iu)((Object)ls2)).B();
        czt3.a.a(czt3.aU, czt3.aV, czt3.aW, czt3.ba, czt3.bb);
        czt3.a.a(new bxi((cmz)object2));
        czt3.a.a(new baq(czt3.J, czt3.I, czt3.H));
        this.b(czt3, (alj)((Object)ls2));
        this.f(czt3);
        ((alj)((Object)ls2)).ag().a(czt3);
        ((alj)((Object)ls2)).b(czt3);
        this.i.add(czt3);
        this.j.put(czt3.cx(), czt3);
        czt3.C();
        czt3.k(czt3.bh());
        return czt3;
    }

    public void f(czt czt2) {
        e e2 = czt2.aq();
        int n2 = this.e(e2) ? this.m.a(e2) : 0;
        n2 = this.h.R() && ((iu)((Object)this.h.d[0])).E().t() ? 4 : n2;
        n2 = this.t ? 4 : n2;
        this.b(czt2, n2);
    }

    public void a(czt czt2, int n2) {
        int n3 = czt2.bS;
        ls ls2 = this.h.a(czt2.bS);
        czt2.bS = n2;
        ls ls3 = this.h.a(czt2.bS);
        czt2.a.a(new bzd(czt2.bS, czt2.aQ.Q(), czt2.aQ.E().s(), czt2.c.b()));
        this.f(czt2);
        ((iu)((Object)ls2)).f(czt2);
        czt2.bk = false;
        this.a(czt2, n3, (alj)((Object)ls2), (alj)((Object)ls3));
        this.a(czt2, (alj)((Object)ls2));
        czt2.a.a(czt2.aU, czt2.aV, czt2.aW, czt2.ba, czt2.bb);
        czt2.c.a((alj)((Object)ls3));
        czt2.a.a(new bep(czt2.G));
        this.b(czt2, (alj)((Object)ls3));
        this.g(czt2);
        for (cko cko2 : czt2.bf()) {
            czt2.a.a(new bbk(czt2.bW(), cko2));
        }
    }

    public void a(cpk cpk2, int n2, alj alj2, alj alj3) {
        double d2 = cpk2.aU;
        double d3 = cpk2.aW;
        double d4 = 8.0;
        float f2 = cpk2.ba;
        alj2.A.a("moving");
        if (cpk2.bS == -1) {
            d2 = cmk.a(d2 / 8.0, alj3.U().b() + 16.0, alj3.U().d() - 16.0);
            d3 = cmk.a(d3 / 8.0, alj3.U().c() + 16.0, alj3.U().e() - 16.0);
            cpk2.a_(d2, cpk2.aV, d3, cpk2.ba, cpk2.bb);
            if (cpk2.bj()) {
                alj2.a(cpk2, false);
            }
        } else if (cpk2.bS == 0) {
            d2 = cmk.a(d2 * 8.0, alj3.U().b() + 16.0, alj3.U().d() - 16.0);
            d3 = cmk.a(d3 * 8.0, alj3.U().c() + 16.0, alj3.U().e() - 16.0);
            cpk2.a_(d2, cpk2.aV, d3, cpk2.ba, cpk2.bb);
            if (cpk2.bj()) {
                alj2.a(cpk2, false);
            }
        } else {
            cmz cmz2 = n2 == 1 ? alj3.B() : alj3.ab();
            d2 = cmz2.a();
            cpk2.aV = cmz2.b();
            d3 = cmz2.c();
            cpk2.a_(d2, cpk2.aV, d3, 90.0f, 0.0f);
            if (cpk2.bj()) {
                alj2.a(cpk2, false);
            }
        }
        alj2.A.b();
        if (n2 != 1) {
            alj2.A.a("placing");
            d2 = cmk.a((int)d2, -29999872, 29999872);
            d3 = cmk.a((int)d3, -29999872, 29999872);
            if (cpk2.bj()) {
                cpk2.a_(d2, cpk2.aV, d3, cpk2.ba, cpk2.bb);
                alj3.ah().a(cpk2, f2);
                alj3.b(cpk2);
                alj3.a(cpk2, false);
            }
            alj2.A.b();
        }
        cpk2.b(alj3);
    }

    public void e() {
        if (++this.u > 600) {
            this.a(new cgl(bfp.c, this.i));
            this.u = 0;
        }
    }

    public void a(ds ds2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            ((czt)this.i.get((int)i2)).a.a(ds2);
        }
    }

    public void a(ds ds2, int n2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            czt czt2 = (czt)this.i.get(i2);
            if (czt2.bS != n2) continue;
            czt2.a.a(ds2);
        }
    }

    public void a(bdl bdl2, cbg cbg2) {
        ccw ccw2 = bdl2.as_();
        if (ccw2 == null) {
            return;
        }
        Collection collection = ccw2.c();
        for (String string : collection) {
            czt czt2 = this.a(string);
            if (czt2 == null || czt2 == bdl2) continue;
            czt2.a(cbg2);
        }
    }

    public void b(bdl bdl2, cbg cbg2) {
        ccw ccw2 = bdl2.as_();
        if (ccw2 == null) {
            this.a(cbg2);
            return;
        }
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            czt czt2 = (czt)this.i.get(i2);
            if (czt2.as_() == ccw2) continue;
            czt2.a(cbg2);
        }
    }

    public String a(boolean bl2) {
        String string = "";
        ArrayList arrayList = ov.a((Iterable)this.i);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (i2 > 0) {
                string = string + ", ";
            }
            string = string + ((czt)arrayList.get(i2)).i_();
            if (!bl2) continue;
            string = string + " (" + ((czt)arrayList.get(i2)).cy() + ")";
        }
        return string;
    }

    public String[] f() {
        String[] arrstring = new String[this.i.size()];
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            arrstring[i2] = ((czt)this.i.get(i2)).i_();
        }
        return arrstring;
    }

    public e[] g() {
        e[] arre = new e[this.i.size()];
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            arre[i2] = ((czt)this.i.get(i2)).aq();
        }
        return arre;
    }

    public dg h() {
        return this.k;
    }

    public aqq i() {
        return this.l;
    }

    public void b(e e2) {
        int n2 = this.h.q();
        this.m.a(new cle(e2, this.h.q(), this.m.b(e2)));
        this.b(this.a(e2.a()), n2);
    }

    public void c(e e2) {
        this.m.c((Object)e2);
        this.b(this.a(e2.a()), 0);
    }

    private void b(czt czt2, int n2) {
        if (czt2 != null && czt2.a != null) {
            byte by2 = n2 <= 0 ? (byte)24 : (n2 >= 4 ? (byte)28 : (byte)((byte)(24 + n2)));
            czt2.a.a(new buk(czt2, by2));
        }
    }

    public boolean d(e e2) {
        return !this.q || this.m.d(e2) || this.n.d(e2);
    }

    public boolean e(e e2) {
        return this.m.d(e2) || this.h.R() && ((iu)((Object)this.h.d[0])).E().t() && this.h.Q().equalsIgnoreCase(e2.b()) || this.t;
    }

    public czt a(String string) {
        for (czt czt2 : this.i) {
            if (!czt2.i_().equalsIgnoreCase(string)) continue;
            return czt2;
        }
        return null;
    }

    public void a(bdl bdl2, double d2, double d3, double d4, double d5, int n2, ds ds2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            double d6;
            double d7;
            double d8;
            czt czt2 = (czt)this.i.get(i2);
            if (czt2 == bdl2 || czt2.bS != n2 || !((d8 = d2 - czt2.aU) * d8 + (d7 = d3 - czt2.aV) * d7 + (d6 = d4 - czt2.aW) * d6 < d5 * d5)) continue;
            czt2.a.a(ds2);
        }
    }

    public void j() {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            this.a((czt)this.i.get(i2));
        }
    }

    public void f(e e2) {
        this.n.a(new je(e2));
    }

    public void g(e e2) {
        this.n.c(e2);
    }

    public cto k() {
        return this.n;
    }

    public String[] l() {
        return this.n.a();
    }

    public dda m() {
        return this.m;
    }

    public String[] n() {
        return this.m.a();
    }

    public void o() {
    }

    public void b(czt czt2, alj alj2) {
        ajw ajw2 = ((iu)((Object)this.h.d[0])).U();
        czt2.a.a(new us(ajw2, bao.d));
        czt2.a.a(new rt(alj2.z(), alj2.A(), alj2.F().b("doDaylightCycle")));
        if (alj2.I()) {
            czt2.a.a(new avk(1, 0.0f));
            czt2.a.a(new avk(7, alj2.j(1.0f)));
            czt2.a.a(new avk(8, alj2.h(1.0f)));
        }
    }

    public void g(czt czt2) {
        czt2.a(czt2.o);
        czt2.bR();
        czt2.a.a(new bud(czt2.n.d));
    }

    public int p() {
        return this.i.size();
    }

    public int q() {
        return this.e;
    }

    public String[] r() {
        return ((iu)((Object)this.h.d[0])).D().d().e();
    }

    public void b(boolean bl2) {
        this.q = bl2;
    }

    public List b(String string) {
        ArrayList arrayList = ov.a();
        for (czt czt2 : this.i) {
            if (!czt2.bT().equals(string)) continue;
            arrayList.add(czt2);
        }
        return arrayList;
    }

    public int s() {
        return this.r;
    }

    public a c() {
        return this.h;
    }

    public bvp b() {
        return null;
    }

    public void a(bvh bvh2) {
        this.s = bvh2;
    }

    private void a(czt czt2, czt czt3, iu iu2) {
        if (czt3 != null) {
            czt2.c.a(czt3.c.b());
        } else if (this.s != null) {
            czt2.c.a(this.s);
        }
        czt2.c.b(iu2.E().p());
    }

    public void c(boolean bl2) {
        this.t = bl2;
    }

    public void t() {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            ((czt)this.i.get((int)i2)).a.a("Server closed");
        }
    }

    public void a(cbg cbg2, boolean bl2) {
        this.h.a((ey)((Object)cbg2));
        byte by2 = bl2 ? (byte)1 : 0;
        this.a(new cxg(cbg2, by2));
    }

    public void a(cbg cbg2) {
        this.a(cbg2, true);
    }

    public f a(bdl bdl2) {
        f f2;
        UUID uUID = bdl2.cx();
        f f3 = f2 = uUID == null ? null : (f)this.o.get(uUID);
        if (f2 == null) {
            File file;
            File file2 = new File(((iu)((Object)this.h.a(0))).D().a(), "stats");
            File file3 = new File(file2, uUID + ".json");
            if (!file3.exists() && (file = new File(file2, bdl2.i_() + ".json")).exists() && file.isFile()) {
                file.renameTo(file3);
            }
            f2 = new f(this.h, file3);
            f2.a();
            this.o.put(uUID, f2);
        }
        return f2;
    }

    public void a(int n2) {
        this.r = n2;
        if (this.h.d == null) {
            return;
        }
        for (v v2 : this.h.d) {
            if (v2 == null) continue;
            ((alj)((Object)v2)).ag().a(n2);
            ((alj)((Object)v2)).af().a(n2);
        }
    }

    public List u() {
        return this.i;
    }

    public czt a(UUID uUID) {
        return (czt)this.j.get(uUID);
    }

    public boolean h(e e2) {
        return false;
    }
}

