/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.d;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.aad;
import com.a.a.d.du;
import com.a.a.d.ep;
import com.a.a.d.ov;
import com.a.a.d.yl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.f.ao;
import net.minecraft.f.ap;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.f;
import net.minecraft.q.ae;
import net.minecraft.q.ah;
import net.minecraft.q.ar;
import net.minecraft.q.b.h;
import net.minecraft.q.d.d;
import net.minecraft.q.g.a.am;
import net.minecraft.q.g.a.u;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.ag;
import net.minecraft.u.d.l;
import net.minecraft.u.r;
import net.minecraft.w.a.g;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.f.ad;
import net.minecraft.w.n;
import org.apache.logging.log4j.c;

public class b {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final cm b = cn.a(net.minecraft.u.r.a, net.minecraft.u.r.a(0.0, 128.0, 0.0, 192.0));
    private final ah c = (ah)new ah(new l("entity.EnderDragon.name", new Object[0]), ae.a, ar.a).b(true).c(true);
    private final v d;
    private final List e = ov.a();
    private final net.minecraft.g.c.a.h f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private UUID m;
    private boolean n = true;
    private net.minecraft.u.b.b o;
    private d p;
    private int q;
    private List r;

    public b(v v2, e e2) {
        this.d = v2;
        if (e2.b("DragonKilled", 99)) {
            if (e2.b("DragonUUID")) {
                this.m = e2.a("DragonUUID");
            }
            this.k = e2.p("DragonKilled");
            this.l = e2.p("PreviouslyKilled");
            if (e2.p("IsRespawning")) {
                this.p = net.minecraft.q.d.d.a;
            }
            if (e2.b("ExitPortalLocation", 10)) {
                this.o = net.minecraft.e.u.c(e2.o("ExitPortalLocation"));
            }
        } else {
            this.k = true;
            this.l = true;
        }
        if (e2.b("Gateways", 9)) {
            q q2 = e2.c("Gateways", 3);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                this.e.add(q2.c(i2));
            }
        } else {
            this.e.addAll(du.a(yl.c(Integer.valueOf(0), Integer.valueOf(20)), ep.a()));
            Collections.shuffle(this.e, new Random(v2.A()));
        }
        this.f = net.minecraft.g.c.a.c.a().a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").a('#', net.minecraft.g.c.a.a(net.minecraft.g.c.a.b.a(net.minecraft.a.p.h))).b();
    }

    public e a() {
        if (this.n) {
            return new e();
        }
        e e2 = new e();
        if (this.m != null) {
            e2.a("DragonUUID", this.m);
        }
        e2.a("DragonKilled", this.k);
        e2.a("PreviouslyKilled", this.l);
        if (this.o != null) {
            e2.a("ExitPortalLocation", net.minecraft.e.u.a(this.o));
        }
        q q2 = new q();
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            q2.a(new net.minecraft.e.r(n2));
        }
        e2.a("Gateways", q2);
        return e2;
    }

    public void b() {
        this.c.d(!this.k);
        if (++this.j >= 20) {
            this.j();
            this.j = 0;
        }
        if (!this.c.i().isEmpty()) {
            if (this.n) {
                a.d("Scanning for legacy world dragon fight...");
                this.i();
                this.n = false;
                boolean bl2 = this.g();
                if (bl2) {
                    a.d("Found that the dragon has been killed in this world already.");
                    this.l = true;
                } else {
                    a.d("Found that the dragon has not yet been killed in this world.");
                    this.l = false;
                    this.a(false);
                }
                List list = this.d.a(net.minecraft.w.d.a.class, net.minecraft.u.r.a);
                if (list.isEmpty()) {
                    this.k = true;
                } else {
                    net.minecraft.w.d.a a2 = (net.minecraft.w.d.a)list.get(0);
                    this.m = a2.cM();
                    a.d("Found that there's a dragon still alive ({})", a2);
                    this.k = false;
                    if (!bl2) {
                        a.d("But we didn't have a portal, let's remove it.");
                        a2.aa();
                        this.m = null;
                    }
                }
                if (!this.l && this.k) {
                    this.k = false;
                }
            }
            if (this.p != null) {
                if (this.r == null) {
                    this.p = null;
                    this.e();
                }
                this.p.a(this.d, this, this.r, this.q++, this.o);
            }
            if (!this.k) {
                if (this.m == null || ++this.g >= 1200) {
                    this.i();
                    List list = this.d.a(net.minecraft.w.d.a.class, net.minecraft.u.r.a);
                    if (list.isEmpty()) {
                        a.a("Haven't seen the dragon, respawning it");
                        this.m();
                    } else {
                        a.a("Haven't seen our dragon, but found another one to use.");
                        this.m = ((net.minecraft.w.d.a)list.get(0)).cM();
                    }
                    this.g = 0;
                }
                if (++this.i >= 100) {
                    this.k();
                    this.i = 0;
                }
            }
        }
    }

    protected void a(d d2) {
        if (this.p == null) {
            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
        }
        this.q = 0;
        if (d2 == net.minecraft.q.d.d.e) {
            this.p = null;
            this.k = false;
            this.m();
        } else {
            this.p = d2;
        }
    }

    private boolean g() {
        for (int i2 = -8; i2 <= 8; ++i2) {
            for (int i3 = -8; i3 <= 8; ++i3) {
                net.minecraft.q.f.k k2 = this.d.a(i2, i3);
                for (ap ap2 : k2.s().values()) {
                    if (!(ap2 instanceof ao)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private f h() {
        Object object;
        int n2;
        int n3;
        for (n3 = -8; n3 <= 8; ++n3) {
            for (n2 = -8; n2 <= 8; ++n2) {
                object = this.d.a(n3, n2);
                for (ap ap2 : ((net.minecraft.q.f.k)object).s().values()) {
                    f f2;
                    if (!(ap2 instanceof ao) || (f2 = this.f.a(this.d, ap2.D())) == null) continue;
                    net.minecraft.u.b.b b2 = f2.a(3, 3, 4).c();
                    if (this.o == null && b2.cy_() == 0 && b2.l() == 0) {
                        this.o = b2;
                    }
                    return f2;
                }
            }
        }
        for (n2 = n3 = this.d.k(am.a).k(); n2 >= 0; --n2) {
            object = this.f.a(this.d, new net.minecraft.u.b.b(am.a.cy_(), n2, am.a.l()));
            if (object == null) continue;
            if (this.o == null) {
                this.o = ((f)object).a(3, 3, 4).c();
            }
            return object;
        }
        return null;
    }

    private void i() {
        for (int i2 = -8; i2 <= 8; ++i2) {
            for (int i3 = -8; i3 <= 8; ++i3) {
                this.d.a(i2, i3);
            }
        }
    }

    private void j() {
        Object object2;
        HashSet hashSet = aad.a();
        for (Object object2 : this.d.b(g.class, b)) {
            this.c.a((g)object2);
            hashSet.add(object2);
        }
        object2 = aad.b(this.c.i());
        object2.removeAll(hashSet);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            g g2 = (g)iterator.next();
            this.c.b(g2);
        }
    }

    private void k() {
        this.i = 0;
        this.h = 0;
        for (net.minecraft.q.g.a.a a2 : net.minecraft.q.b.h.a(this.d)) {
            this.h += this.d.a(ad.class, a2.f()).size();
        }
        a.a("Found {} end crystals still alive", this.h);
    }

    public void a(net.minecraft.w.d.a a2) {
        if (a2.cM().equals(this.m)) {
            this.c.a(0.0f);
            this.c.d(false);
            this.a(true);
            this.l();
            if (!this.l) {
                this.d.b(this.d.k(am.a), net.minecraft.a.p.bI.v());
            }
            this.l = true;
            this.k = true;
        }
    }

    private void l() {
        if (!this.e.isEmpty()) {
            int n2 = (Integer)this.e.remove(this.e.size() - 1);
            int n3 = (int)(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)n2)));
            int n4 = (int)(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)n2)));
            this.a(new net.minecraft.u.b.b(n3, 75, n4));
        }
    }

    private void a(net.minecraft.u.b.b b2) {
        this.d.b(3000, b2, 0);
        new u().a((k)this.d, new Random(), b2);
    }

    private void a(boolean bl2) {
        am am2 = new am(bl2);
        if (this.o == null) {
            this.o = this.d.p(am.a).c();
            while (this.d.n(this.o).c() == net.minecraft.a.p.h && this.o.k() > this.d.x()) {
                this.o = this.o.c();
            }
        }
        am2.a((k)this.d, new Random(), this.o);
    }

    private void m() {
        this.d.e(new net.minecraft.u.b.b(0, 128, 0));
        net.minecraft.w.d.a a2 = new net.minecraft.w.d.a(this.d);
        a2.p().a(net.minecraft.w.d.a.a.j.a);
        a2.b(0.0, 128.0, 0.0, this.d.p.nextFloat() * 360.0f, 0.0f);
        this.d.a(a2);
        this.m = a2.cM();
    }

    public void b(net.minecraft.w.d.a a2) {
        if (a2.cM().equals(this.m)) {
            this.c.a(a2.bo() / a2.bw());
            this.g = 0;
        }
    }

    public int c() {
        return this.h;
    }

    public void a(ad ad2, net.minecraft.u.n n2) {
        if (this.p != null && this.r.contains(ad2)) {
            a.a("Aborting respawn sequence");
            this.p = null;
            this.q = 0;
            this.f();
            this.a(true);
        } else {
            this.k();
            n n3 = this.d.b(this.m);
            if (n3 instanceof net.minecraft.w.d.a) {
                ((net.minecraft.w.d.a)n3).a(ad2, new net.minecraft.u.b.b(ad2), n2);
            }
        }
    }

    public boolean d() {
        return this.l;
    }

    public void e() {
        if (this.k && this.p == null) {
            Object object;
            net.minecraft.u.b.b b2 = this.o;
            if (b2 == null) {
                a.a("Tried to respawn, but need to find the portal first.");
                object = this.h();
                if (object == null) {
                    a.a("Couldn't find a portal, so we made one.");
                    this.a(true);
                    b2 = this.o;
                } else {
                    a.a("Found the exit portal & temporarily using it.");
                    b2 = ((f)object).a(3, 3, 3).c();
                }
            }
            object = ov.a();
            net.minecraft.u.b.b b3 = b2.a(1);
            for (net.minecraft.u.ad ad2 : ag.a) {
                List list = this.d.a(ad.class, new net.minecraft.u.b.a(b3.a(ad2, 2)));
                if (list.isEmpty()) {
                    return;
                }
                object.addAll(list);
            }
            a.a("Found all crystals, respawning dragon.");
            this.a((List)object);
        }
    }

    private void a(List list) {
        if (this.k && this.p == null) {
            f f2 = this.h();
            while (f2 != null) {
                for (int i2 = 0; i2 < this.f.c(); ++i2) {
                    for (int i3 = 0; i3 < this.f.b(); ++i3) {
                        for (int i4 = 0; i4 < this.f.a(); ++i4) {
                            a a2 = f2.a(i2, i3, i4);
                            if (a2.a().c() != net.minecraft.a.p.h && a2.a().c() != net.minecraft.a.p.bF) continue;
                            this.d.b(a2.c(), net.minecraft.a.p.bH.v());
                        }
                    }
                }
                f2 = this.h();
            }
            this.p = net.minecraft.q.d.d.a;
            this.q = 0;
            this.a(false);
            this.r = list;
        }
    }

    public void f() {
        for (net.minecraft.q.g.a.a a2 : net.minecraft.q.b.h.a(this.d)) {
            for (ad ad2 : this.d.a(ad.class, a2.f())) {
                ad2.p(false);
                ad2.a((net.minecraft.u.b.b)null);
            }
        }
    }
}

