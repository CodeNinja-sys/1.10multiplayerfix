/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import io.netty.b.bi;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.c.a;
import net.minecraft.c.b.af;
import net.minecraft.c.b.c;
import net.minecraft.c.b.e;
import net.minecraft.c.b.g;
import net.minecraft.c.b.h;
import net.minecraft.c.b.j;
import net.minecraft.c.b.k;
import net.minecraft.c.b.n;
import net.minecraft.c.b.q;
import net.minecraft.c.b.u;
import net.minecraft.c.b.x;
import net.minecraft.c.b.y;
import net.minecraft.j.i;
import net.minecraft.q.a.m;
import net.minecraft.q.am;
import net.minecraft.q.v;
import net.minecraft.r.b;
import net.minecraft.u.a.f;
import net.minecraft.u.b.t;
import net.minecraft.u.d.l;
import net.minecraft.u.d.o;
import net.minecraft.x.ak;
import net.minecraft.x.d.b.ae;
import net.minecraft.x.d.b.as;
import net.minecraft.x.d.b.aw;
import net.minecraft.x.d.b.az;
import net.minecraft.x.d.b.bg;
import net.minecraft.x.d.b.bm;
import net.minecraft.x.d.b.bn;
import net.minecraft.x.d.b.bw;
import net.minecraft.x.d.b.bz;
import net.minecraft.x.d.b.cd;
import net.minecraft.x.d.b.ce;
import net.minecraft.x.d.b.ci;
import net.minecraft.x.d.b.s;
import net.minecraft.x.z;
import org.apache.logging.log4j.d;

public abstract class p {
    public static final File a = new File("banned-players.json");
    public static final File b = new File("banned-ips.json");
    public static final File c = new File("ops.json");
    public static final File d = new File("whitelist.json");
    private static final d f = org.apache.logging.log4j.c.c();
    private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final a h;
    private final List i = ov.a();
    private final Map j = sz.c();
    private final u k = new u(a);
    private final y l = new y(b);
    private final q m = new q(c);
    private final af n = new af(d);
    private final Map o = sz.c();
    private m p;
    private boolean q;
    protected int e;
    private int r;
    private am s;
    private boolean t;
    private int u;

    public p(a a2) {
        this.h = a2;
        this.k.a(false);
        this.l.a(false);
        this.e = 8;
    }

    public void a(ak ak2, net.minecraft.w.a.g g2) {
        com.c.a.e e2 = g2.ac();
        h h2 = this.h.aO();
        com.c.a.e e3 = h2.a(e2.a());
        String string = e3 == null ? e2.b() : e3.b();
        h2.a(e2);
        net.minecraft.e.e e4 = this.b(g2);
        g2.b(this.h.a(g2.bS));
        g2.c.a((v)g2.aQ);
        String string2 = "local";
        if (ak2.b() != null) {
            string2 = ak2.b().toString();
        }
        f.d("{}[{}] logged in with entity id {} at ({}, {}, {})", g2.X(), string2, g2.ca(), g2.aU, g2.aV, g2.aW);
        v v2 = this.h.a(g2.bS);
        net.minecraft.q.a.d d2 = v2.F();
        net.minecraft.u.b.b b2 = v2.D();
        this.a(g2, null, v2);
        z z2 = new z(this.h, ak2, g2);
        z2.a(new bg(g2.ca(), g2.c.a(), d2.s(), v2.q.a().a(), v2.R(), this.q(), d2.t(), v2.G().b("reducedDebugInfo")));
        z2.a(new as("MC|Brand", new net.minecraft.x.a(bi.a()).a(this.c().V())));
        z2.a(new net.minecraft.x.d.b.d(d2.H(), d2.I()));
        z2.a(new s(b2));
        z2.a(new ci(g2.J));
        z2.a(new ae(g2.q.d));
        this.f(g2);
        g2.I().d();
        g2.I().b(g2);
        this.a((net.minecraft.j.c)v2.Q(), g2);
        this.h.aQ();
        l l2 = g2.X().equalsIgnoreCase(string) ? new l("multiplayer.player.joined", g2.aK()) : new l("multiplayer.player.joined.renamed", g2.aK(), string);
        l2.a().a(net.minecraft.u.d.o.o);
        this.a(l2);
        this.c(g2);
        z2.a(g2.aU, g2.aV, g2.aW, g2.ba, g2.bb);
        this.b(g2, v2);
        if (!this.h.ah().isEmpty()) {
            g2.a(this.h.ah(), this.h.ai());
        }
        for (Object object : g2.bm()) {
            z2.a(new bw(g2.ca(), (net.minecraft.d.j)object));
        }
        if (e4 != null) {
            Object object;
            if (e4.b("RootVehicle", 10)) {
                object = e4.o("RootVehicle");
                net.minecraft.w.n n2 = net.minecraft.q.f.a.d.a(((net.minecraft.e.e)object).o("Entity"), (net.minecraft.q.k)v2, true);
                if (n2 != null) {
                    UUID uUID = ((net.minecraft.e.e)object).a("Attach");
                    if (n2.cM().equals(uUID)) {
                        g2.a(n2, true);
                    } else {
                        for (net.minecraft.w.n n3 : n2.dc()) {
                            if (!n3.cM().equals(uUID)) continue;
                            g2.a(n3, true);
                            break;
                        }
                    }
                    if (!g2.cz()) {
                        f.f("Couldn't reattach entity to player");
                        v2.f(n2);
                        for (net.minecraft.w.n n3 : n2.dc()) {
                            v2.f(n3);
                        }
                    }
                }
            } else if (e4.b("Riding", 10) && (object = net.minecraft.q.f.a.d.a(e4.o("Riding"), (net.minecraft.q.k)v2, true)) != null) {
                g2.a((net.minecraft.w.n)object, true);
            }
        }
        g2.e();
    }

    protected void a(net.minecraft.j.c c2, net.minecraft.w.a.g g2) {
        HashSet hashSet = aad.a();
        for (net.minecraft.j.d d2 : c2.f()) {
            g2.a.a(new cd(d2, 0));
        }
        for (int i2 = 0; i2 < 19; ++i2) {
            net.minecraft.j.j j2 = c2.a(i2);
            if (j2 == null || hashSet.contains(j2)) continue;
            for (net.minecraft.x.p p2 : c2.d(j2)) {
                g2.a.a(p2);
            }
            hashSet.add(j2);
        }
    }

    public void a(v[] arrv) {
        this.p = arrv[0].E().d();
        arrv[0].V().a(new n(this));
    }

    public void a(net.minecraft.w.a.g g2, v v2) {
        v v3 = g2.y();
        if (v2 != null) {
            v2.af().b(g2);
        }
        v3.af().a(g2);
        v3.ac().d((int)g2.aU >> 4, (int)g2.aW >> 4);
    }

    public int d() {
        return net.minecraft.c.b.j.b(this.s());
    }

    public net.minecraft.e.e b(net.minecraft.w.a.g g2) {
        net.minecraft.e.e e2;
        net.minecraft.e.e e3 = this.h.d[0].F().h();
        if (g2.X().equals(this.h.aa()) && e3 != null) {
            e2 = this.h.aW().a((f)net.minecraft.u.a.c.b, e3);
            g2.f(e2);
            f.a("loading single player");
        } else {
            e2 = this.p.b(g2);
        }
        return e2;
    }

    protected void a(net.minecraft.w.a.g g2) {
        this.p.a(g2);
        b b2 = (b)this.o.get(g2.cM());
        if (b2 != null) {
            b2.b();
        }
    }

    public void c(net.minecraft.w.a.g g2) {
        this.i.add(g2);
        this.j.put(g2.cM(), g2);
        this.a(new bm(az.a, g2));
        v v2 = this.h.a(g2.bS);
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            g2.a.a(new bm(az.a, (net.minecraft.w.a.g)this.i.get(i2)));
        }
        v2.a(g2);
        this.a(g2, null);
    }

    public void d(net.minecraft.w.a.g g2) {
        g2.y().af().c(g2);
    }

    public void e(net.minecraft.w.a.g g2) {
        net.minecraft.w.n n22;
        Object object;
        v v2 = g2.y();
        g2.a(net.minecraft.r.o.f);
        this.a(g2);
        if (g2.cz() && ((net.minecraft.w.n)(object = g2.dd())).b(net.minecraft.w.a.g.class).size() == 1) {
            f.a("Removing player mount");
            g2.o();
            v2.f((net.minecraft.w.n)object);
            for (net.minecraft.w.n n22 : ((net.minecraft.w.n)object).dc()) {
                v2.f(n22);
            }
            v2.a(g2.bH, g2.bJ).e();
        }
        v2.b(g2);
        v2.af().b(g2);
        this.i.remove(g2);
        object = g2.cM();
        n22 = (net.minecraft.w.a.g)this.j.get(object);
        if (n22 == g2) {
            this.j.remove(object);
            this.o.remove(object);
        }
        this.a(new bm(az.e, g2));
    }

    public String a(SocketAddress socketAddress, com.c.a.e e2) {
        if (this.k.a(e2)) {
            x x2 = (x)this.k.a((Object)e2);
            String string = "You are banned from this server!\nReason: " + x2.b();
            if (x2.a() != null) {
                string = String.valueOf(string) + "\nYour ban will be removed on " + g.format(x2.a());
            }
            return string;
        }
        if (!this.d(e2)) {
            return "You are not white-listed on this server!";
        }
        if (this.l.a(socketAddress)) {
            c c2 = this.l.b(socketAddress);
            String string = "Your IP address is banned from this server!\nReason: " + c2.b();
            if (c2.a() != null) {
                string = String.valueOf(string) + "\nYour ban will be removed on " + g.format(c2.a());
            }
            return string;
        }
        return this.i.size() >= this.e && !this.h(e2) ? "The server is full!" : null;
    }

    public net.minecraft.w.a.g a(com.c.a.e e2) {
        Object object2;
        UUID uUID = net.minecraft.w.a.b.a(e2);
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            object2 = (net.minecraft.w.a.g)this.i.get(i2);
            if (!((net.minecraft.w.n)object2).cM().equals(uUID)) continue;
            arrayList.add(object2);
        }
        net.minecraft.w.a.g g2 = (net.minecraft.w.a.g)this.j.get(e2.a());
        if (g2 != null && !arrayList.contains(g2)) {
            arrayList.add(g2);
        }
        for (Object object2 : arrayList) {
            ((net.minecraft.w.a.g)object2).a.a("You logged in from another location");
        }
        object2 = this.h.af() ? new net.minecraft.q.e.a(this.h.a(0)) : new k(this.h.a(0));
        return new net.minecraft.w.a.g(this.h, this.h.a(0), e2, (k)object2);
    }

    public net.minecraft.w.a.g a(net.minecraft.w.a.g g2, int n2, boolean bl2) {
        Object object;
        Object object22;
        g2.y().ae().b(g2);
        g2.y().ae().b((net.minecraft.w.n)g2);
        g2.y().af().b(g2);
        this.i.remove(g2);
        this.h.a(g2.bS).f(g2);
        net.minecraft.u.b.b b2 = g2.ah();
        boolean bl3 = g2.ai();
        g2.bS = n2;
        k k2 = this.h.af() ? new net.minecraft.q.e.a(this.h.a(g2.bS)) : new k(this.h.a(g2.bS));
        net.minecraft.w.a.g g3 = new net.minecraft.w.a.g(this.h, this.h.a(g2.bS), g2.ac(), k2);
        g3.a = g2.a;
        g3.a(g2, bl2);
        g3.j(g2.ca());
        g3.z(g2);
        g3.a(g2.aH());
        for (Object object22 : g2.cb()) {
            g3.e((String)object22);
        }
        object22 = this.h.a(g2.bS);
        this.a(g3, g2, (net.minecraft.q.k)object22);
        if (b2 != null) {
            object = net.minecraft.w.a.b.a(this.h.a(g2.bS), b2, bl3);
            if (object != null) {
                g3.b((float)((t)object).cy_() + 0.5f, (float)((t)object).k() + 0.1f, (float)((t)object).l() + 0.5f, 0.0f, 0.0f);
                g3.a(b2, bl3);
            } else {
                g3.a.a(new ce(0, 0.0f));
            }
        }
        ((v)object22).ac().d((int)g3.aU >> 4, (int)g3.aW >> 4);
        while (!((net.minecraft.q.k)object22).a((net.minecraft.w.n)g3, g3.cT()).isEmpty() && g3.aV < 256.0) {
            g3.e(g3.aU, g3.aV + 1.0, g3.aW);
        }
        g3.a.a(new net.minecraft.x.d.b.f(g3.bS, g3.aQ.R(), g3.aQ.F().t(), g3.c.a()));
        object = ((net.minecraft.q.k)object22).D();
        g3.a.a(g3.aU, g3.aV, g3.aW, g3.ba, g3.bb);
        g3.a.a(new s((net.minecraft.u.b.b)object));
        g3.a.a(new net.minecraft.x.d.b.k(g3.M, g3.L, g3.K));
        this.b(g3, (v)object22);
        this.f(g3);
        ((v)object22).af().a(g3);
        ((v)object22).a(g3);
        this.i.add(g3);
        this.j.put(g3.cM(), g3);
        g3.e();
        g3.h(g3.bo());
        return g3;
    }

    public void f(net.minecraft.w.a.g g2) {
        com.c.a.e e2 = g2.ac();
        int n2 = this.e(e2) ? this.m.a(e2) : 0;
        n2 = this.h.ab() && this.h.d[0].F().v() ? 4 : n2;
        n2 = this.t ? 4 : n2;
        this.b(g2, n2);
    }

    public void a(net.minecraft.w.a.g g2, int n2) {
        int n3 = g2.bS;
        v v2 = this.h.a(g2.bS);
        g2.bS = n2;
        v v3 = this.h.a(g2.bS);
        g2.a.a(new net.minecraft.x.d.b.f(g2.bS, g2.aQ.R(), g2.aQ.F().t(), g2.c.a()));
        this.f(g2);
        v2.f(g2);
        g2.bk = false;
        this.a(g2, n3, v2, v3);
        this.a(g2, v2);
        g2.a.a(g2.aU, g2.aV, g2.aW, g2.ba, g2.bb);
        g2.c.a(v3);
        g2.a.a(new ci(g2.J));
        this.b(g2, v3);
        this.g(g2);
        for (net.minecraft.d.j j2 : g2.bm()) {
            g2.a.a(new bw(g2.ca(), j2));
        }
    }

    public void a(net.minecraft.w.n n2, int n3, v v2, v v3) {
        double d2 = n2.aU;
        double d3 = n2.aW;
        double d4 = 8.0;
        float f2 = n2.ba;
        v2.A.a("moving");
        if (n2.bS == -1) {
            d2 = net.minecraft.u.b.n.a(d2 / 8.0, v3.V().d() + 16.0, v3.V().f() - 16.0);
            d3 = net.minecraft.u.b.n.a(d3 / 8.0, v3.V().e() + 16.0, v3.V().g() - 16.0);
            n2.b(d2, n2.aV, d3, n2.ba, n2.bb);
            if (n2.br()) {
                v2.a(n2, false);
            }
        } else if (n2.bS == 0) {
            d2 = net.minecraft.u.b.n.a(d2 * 8.0, v3.V().d() + 16.0, v3.V().f() - 16.0);
            d3 = net.minecraft.u.b.n.a(d3 * 8.0, v3.V().e() + 16.0, v3.V().g() - 16.0);
            n2.b(d2, n2.aV, d3, n2.ba, n2.bb);
            if (n2.br()) {
                v2.a(n2, false);
            }
        } else {
            net.minecraft.u.b.b b2 = n3 == 1 ? v3.D() : v3.Z();
            d2 = b2.cy_();
            n2.aV = b2.k();
            d3 = b2.l();
            n2.b(d2, n2.aV, d3, 90.0f, 0.0f);
            if (n2.br()) {
                v2.a(n2, false);
            }
        }
        v2.A.b();
        if (n3 != 1) {
            v2.A.a("placing");
            d2 = net.minecraft.u.b.n.a((int)d2, -29999872, 29999872);
            d3 = net.minecraft.u.b.n.a((int)d3, -29999872, 29999872);
            if (n2.br()) {
                n2.b(d2, n2.aV, d3, n2.ba, n2.bb);
                v3.ag().a(n2, f2);
                v3.a(n2);
                v3.a(n2, false);
            }
            v2.A.b();
        }
        n2.b(v3);
    }

    public void e() {
        if (++this.u > 600) {
            this.a(new bm(az.c, this.i));
            this.u = 0;
        }
    }

    public void a(net.minecraft.x.p p2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            ((net.minecraft.w.a.g)this.i.get((int)i2)).a.a(p2);
        }
    }

    public void a(net.minecraft.x.p p2, int n2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            net.minecraft.w.a.g g2 = (net.minecraft.w.a.g)this.i.get(i2);
            if (g2.bS != n2) continue;
            g2.a.a(p2);
        }
    }

    public void a(net.minecraft.w.a.b b2, net.minecraft.u.d.a a2) {
        i i2 = b2.aA();
        if (i2 != null) {
            for (String string : i2.c()) {
                net.minecraft.w.a.g g2 = this.a(string);
                if (g2 == null || g2 == b2) continue;
                g2.a(a2);
            }
        }
    }

    public void b(net.minecraft.w.a.b b2, net.minecraft.u.d.a a2) {
        i i2 = b2.aA();
        if (i2 == null) {
            this.a(a2);
        } else {
            for (int i3 = 0; i3 < this.i.size(); ++i3) {
                net.minecraft.w.a.g g2 = (net.minecraft.w.a.g)this.i.get(i3);
                if (g2.aA() == i2) continue;
                g2.a(a2);
            }
        }
    }

    public String a(boolean bl2) {
        String string = "";
        ArrayList arrayList = ov.a((Iterable)this.i);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (i2 > 0) {
                string = String.valueOf(string) + ", ";
            }
            string = String.valueOf(string) + ((net.minecraft.w.a.g)arrayList.get(i2)).X();
            if (!bl2) continue;
            string = String.valueOf(string) + " (" + ((net.minecraft.w.a.g)arrayList.get(i2)).cN() + ")";
        }
        return string;
    }

    public String[] f() {
        String[] arrstring = new String[this.i.size()];
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            arrstring[i2] = ((net.minecraft.w.a.g)this.i.get(i2)).X();
        }
        return arrstring;
    }

    public com.c.a.e[] g() {
        com.c.a.e[] arre = new com.c.a.e[this.i.size()];
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            arre[i2] = ((net.minecraft.w.a.g)this.i.get(i2)).ac();
        }
        return arre;
    }

    public u h() {
        return this.k;
    }

    public y i() {
        return this.l;
    }

    public void b(com.c.a.e e2) {
        int n2 = this.h.B();
        this.m.a(new g(e2, this.h.B(), this.m.b(e2)));
        this.b(this.a(e2.a()), n2);
    }

    public void c(com.c.a.e e2) {
        this.m.b((Object)e2);
        this.b(this.a(e2.a()), 0);
    }

    private void b(net.minecraft.w.a.g g2, int n2) {
        if (g2 != null && g2.a != null) {
            byte by2 = n2 <= 0 ? (byte)24 : (n2 >= 4 ? (byte)28 : (byte)((byte)(24 + n2)));
            g2.a.a(new aw(g2, by2));
        }
    }

    public boolean d(com.c.a.e e2) {
        return !this.q || this.m.d(e2) || this.n.d(e2);
    }

    public boolean e(com.c.a.e e2) {
        return this.m.d(e2) || this.h.ab() && this.h.d[0].F().v() && this.h.aa().equalsIgnoreCase(e2.b()) || this.t;
    }

    public net.minecraft.w.a.g a(String string) {
        for (net.minecraft.w.a.g g2 : this.i) {
            if (!g2.X().equalsIgnoreCase(string)) continue;
            return g2;
        }
        return null;
    }

    public void a(net.minecraft.w.a.b b2, double d2, double d3, double d4, double d5, int n2, net.minecraft.x.p p2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            double d6;
            double d7;
            double d8;
            net.minecraft.w.a.g g2 = (net.minecraft.w.a.g)this.i.get(i2);
            if (g2 == b2 || g2.bS != n2 || !((d8 = d2 - g2.aU) * d8 + (d7 = d3 - g2.aV) * d7 + (d6 = d4 - g2.aW) * d6 < d5 * d5)) continue;
            g2.a.a(p2);
        }
    }

    public void j() {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            this.a((net.minecraft.w.a.g)this.i.get(i2));
        }
    }

    public void f(com.c.a.e e2) {
        this.n.a(new e(e2));
    }

    public void g(com.c.a.e e2) {
        this.n.b(e2);
    }

    public af k() {
        return this.n;
    }

    public String[] l() {
        return this.n.b();
    }

    public q m() {
        return this.m;
    }

    public String[] n() {
        return this.m.b();
    }

    public void o() {
    }

    public void b(net.minecraft.w.a.g g2, v v2) {
        net.minecraft.q.c.d d2 = this.h.d[0].V();
        g2.a.a(new net.minecraft.x.d.b.q(d2, bz.d));
        g2.a.a(new bn(v2.B(), v2.C(), v2.G().b("doDaylightCycle")));
        if (v2.J()) {
            g2.a.a(new ce(1, 0.0f));
            g2.a.a(new ce(7, v2.j(1.0f)));
            g2.a.a(new ce(8, v2.h(1.0f)));
        }
    }

    public void g(net.minecraft.w.a.g g2) {
        g2.a(g2.r);
        g2.w();
        g2.a.a(new ae(g2.q.d));
    }

    public int p() {
        return this.i.size();
    }

    public int q() {
        return this.e;
    }

    public String[] r() {
        return this.h.d[0].E().d().e();
    }

    public void b(boolean bl2) {
        this.q = bl2;
    }

    public List b(String string) {
        ArrayList arrayList = ov.a();
        for (net.minecraft.w.a.g g2 : this.i) {
            if (!g2.z().equals(string)) continue;
            arrayList.add(g2);
        }
        return arrayList;
    }

    public int s() {
        return this.r;
    }

    public a c() {
        return this.h;
    }

    public net.minecraft.e.e b() {
        return null;
    }

    public void a(am am2) {
        this.s = am2;
    }

    private void a(net.minecraft.w.a.g g2, net.minecraft.w.a.g g3, net.minecraft.q.k k2) {
        if (g3 != null) {
            g2.c.a(g3.c.a());
        } else if (this.s != null) {
            g2.c.a(this.s);
        }
        g2.c.b(k2.F().q());
    }

    public void c(boolean bl2) {
        this.t = bl2;
    }

    public void t() {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            ((net.minecraft.w.a.g)this.i.get((int)i2)).a.a("Server closed");
        }
    }

    public void a(net.minecraft.u.d.a a2, boolean bl2) {
        this.h.a(a2);
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.a(new net.minecraft.x.d.b.b(a2, by2));
    }

    public void a(net.minecraft.u.d.a a2) {
        this.a(a2, true);
    }

    public b a(net.minecraft.w.a.b b2) {
        b b3;
        UUID uUID = b2.cM();
        b b4 = b3 = uUID == null ? null : (b)this.o.get(uUID);
        if (b3 == null) {
            File file;
            File file2 = new File(this.h.a(0).E().a(), "stats");
            File file3 = new File(file2, uUID + ".json");
            if (!file3.exists() && (file = new File(file2, String.valueOf(b2.X()) + ".json")).exists() && file.isFile()) {
                file.renameTo(file3);
            }
            b3 = new b(this.h, file3);
            b3.a();
            this.o.put(uUID, b3);
        }
        return b3;
    }

    public void a(int n2) {
        this.r = n2;
        if (this.h.d != null) {
            v[] arrv = this.h.d;
            int n3 = this.h.d.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                v v2 = arrv[i2];
                if (v2 == null) continue;
                v2.af().a(n2);
                v2.ae().a(n2);
            }
        }
    }

    public List u() {
        return this.i;
    }

    public net.minecraft.w.a.g a(UUID uUID) {
        return (net.minecraft.w.a.g)this.j.get(uUID);
    }

    public boolean h(com.c.a.e e2) {
        return false;
    }
}

