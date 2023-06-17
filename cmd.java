/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.aad;
import com.a.a.d.ep;
import com.a.a.d.ov;
import com.a.a.d.yl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cmd {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final cm b = cn.a(auxx.a, auxx.a(0.0, 128.0, 0.0, 192.0));
    private final bjy c = (bjy)new bjy(new du("entity.EnderDragon.name", new Object[0]), jd.a, abo.a).b(true).c(true);
    private final alj d;
    private final List e = ov.a();
    private final ve f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private UUID m;
    private boolean n = true;
    private cmz o;
    private c p;
    private int q;
    private List r;

    public cmd(alj alj2, bvp bvp2) {
        this.d = alj2;
        if (bvp2.b("DragonKilled", 99)) {
            if (bvp2.b("DragonUUID")) {
                this.m = bvp2.a("DragonUUID");
            }
            this.k = bvp2.p("DragonKilled");
            this.l = bvp2.p("PreviouslyKilled");
            if (bvp2.p("IsRespawning")) {
                this.p = c.a;
            }
            if (bvp2.b("ExitPortalLocation", 10)) {
                this.o = ayj.c(bvp2.o("ExitPortalLocation"));
            }
        } else {
            this.k = true;
            this.l = true;
        }
        if (bvp2.b("Gateways", 9)) {
            bmh bmh2 = bvp2.c("Gateways", 3);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                this.e.add(bmh2.c(i2));
            }
        } else {
            this.e.addAll(com.a.a.d.du.a(yl.c(Integer.valueOf(0), Integer.valueOf(20)), ep.a()));
            Collections.shuffle(this.e, new Random(alj2.y()));
        }
        this.f = chl.a().a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").a('#', amr.a(bqa.a(blg.h))).b();
    }

    public bvp a() {
        if (this.n) {
            return new bvp();
        }
        bvp bvp2 = new bvp();
        if (this.m != null) {
            bvp2.a("DragonUUID", this.m);
        }
        bvp2.a("DragonKilled", this.k);
        bvp2.a("PreviouslyKilled", this.l);
        if (this.o != null) {
            bvp2.a("ExitPortalLocation", ayj.a(this.o));
        }
        bmh bmh2 = new bmh();
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            bmh2.a(new iq(n2));
        }
        bvp2.a("Gateways", bmh2);
        return bvp2;
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
                List list = this.d.a(brd.class, auxx.a);
                if (list.isEmpty()) {
                    this.k = true;
                } else {
                    brd brd2 = (brd)list.get(0);
                    this.m = brd2.cx();
                    a.d("Found that there's a dragon still alive ({})", brd2);
                    this.k = false;
                    if (!bl2) {
                        a.d("But we didn't have a portal, let's remove it.");
                        brd2.ak_();
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
                    List list = this.d.a(brd.class, auxx.a);
                    if (list.isEmpty()) {
                        a.a("Haven't seen the dragon, respawning it");
                        this.m();
                    } else {
                        a.a("Haven't seen our dragon, but found another one to use.");
                        this.m = ((brd)list.get(0)).cx();
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

    protected void a(c c2) {
        if (this.p == null) {
            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
        }
        this.q = 0;
        if (c2 == c.e) {
            this.p = null;
            this.k = false;
            this.m();
        } else {
            this.p = c2;
        }
    }

    private boolean g() {
        for (int i2 = -8; i2 <= 8; ++i2) {
            for (int i3 = -8; i3 <= 8; ++i3) {
                bhm bhm2 = this.d.a(i2, i3);
                for (bql bql2 : bhm2.s().values()) {
                    if (!(bql2 instanceof alv)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private aiz h() {
        Object object;
        int n2;
        int n3;
        for (n3 = -8; n3 <= 8; ++n3) {
            for (n2 = -8; n2 <= 8; ++n2) {
                object = this.d.a(n3, n2);
                for (bql bql2 : ((bhm)object).s().values()) {
                    aiz aiz2;
                    if (!(bql2 instanceof alv) || (aiz2 = this.f.a(this.d, bql2.y())) == null) continue;
                    cmz cmz2 = aiz2.a(3, 3, 4).c();
                    if (this.o == null && cmz2.a() == 0 && cmz2.c() == 0) {
                        this.o = cmz2;
                    }
                    return aiz2;
                }
            }
        }
        for (n2 = n3 = this.d.k(apk.a).b(); n2 >= 0; --n2) {
            object = this.f.a(this.d, new cmz(apk.a.a(), n2, apk.a.c()));
            if (object == null) continue;
            if (this.o == null) {
                this.o = ((aiz)object).a(3, 3, 4).c();
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
        for (Object object2 : this.d.b(czt.class, b)) {
            this.c.a((czt)object2);
            hashSet.add(object2);
        }
        HashSet hashSet2 = aad.b(this.c.i());
        hashSet2.removeAll(hashSet);
        object2 = hashSet2.iterator();
        while (object2.hasNext()) {
            czt czt2 = (czt)object2.next();
            this.c.b(czt2);
        }
    }

    private void k() {
        this.i = 0;
        this.h = 0;
        for (ajp ajp2 : acp.a(this.d)) {
            this.h += this.d.a(abi.class, ajp2.f()).size();
        }
        a.a("Found {} end crystals still alive", this.h);
    }

    public void a(brd brd2) {
        if (brd2.cx().equals(this.m)) {
            this.c.a(0.0f);
            this.c.d(false);
            this.a(true);
            this.l();
            if (!this.l) {
                this.d.a(this.d.k(apk.a), blg.bI.s());
            }
            this.l = true;
            this.k = true;
        }
    }

    private void l() {
        if (this.e.isEmpty()) {
            return;
        }
        int n2 = (Integer)this.e.remove(this.e.size() - 1);
        int n3 = (int)(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)n2)));
        int n4 = (int)(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)n2)));
        this.a(new cmz(n3, 75, n4));
    }

    private void a(cmz cmz2) {
        this.d.b(3000, cmz2, 0);
        new cic().a((iu)this.d, new Random(), cmz2);
    }

    private void a(boolean bl2) {
        apk apk2 = new apk(bl2);
        if (this.o == null) {
            this.o = this.d.p(apk.a).h();
            while (this.d.n(this.o).t() == blg.h && this.o.b() > this.d.u()) {
                this.o = this.o.h();
            }
        }
        apk2.a((iu)this.d, new Random(), this.o);
    }

    private void m() {
        this.d.e(new cmz(0, 128, 0));
        brd brd2 = new brd(this.d);
        brd2.aL().a(baw.a);
        brd2.a_(0.0, 128.0, 0.0, this.d.p.nextFloat() * 360.0f, 0.0f);
        this.d.b(brd2);
        this.m = brd2.cx();
    }

    public void b(brd brd2) {
        if (brd2.cx().equals(this.m)) {
            this.c.a(brd2.bh() / brd2.bo());
            this.g = 0;
        }
    }

    public int c() {
        return this.h;
    }

    public void a(abi abi2, ahy ahy2) {
        if (this.p != null && this.r.contains(abi2)) {
            a.a("Aborting respawn sequence");
            this.p = null;
            this.q = 0;
            this.f();
            this.a(true);
        } else {
            this.k();
            cpk cpk2 = this.d.b(this.m);
            if (cpk2 instanceof brd) {
                ((brd)cpk2).a(abi2, new cmz(abi2), ahy2);
            }
        }
    }

    public boolean d() {
        return this.l;
    }

    public void e() {
        if (this.k && this.p == null) {
            Object object;
            cmz cmz2 = this.o;
            if (cmz2 == null) {
                a.a("Tried to respawn, but need to find the portal first.");
                object = this.h();
                if (object == null) {
                    a.a("Couldn't find a portal, so we made one.");
                    this.a(true);
                    cmz2 = this.o;
                } else {
                    a.a("Found the exit portal & temporarily using it.");
                    cmz2 = ((aiz)object).a(3, 3, 3).c();
                }
            }
            object = ov.a();
            cmz cmz3 = cmz2.b(1);
            for (bqk bqk2 : afj.a) {
                List list = this.d.a(abi.class, new cxt(cmz3.c(bqk2, 2)));
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
            aiz aiz2 = this.h();
            while (aiz2 != null) {
                for (int i2 = 0; i2 < this.f.c(); ++i2) {
                    for (int i3 = 0; i3 < this.f.b(); ++i3) {
                        for (int i4 = 0; i4 < this.f.a(); ++i4) {
                            amr amr2 = aiz2.a(i2, i3, i4);
                            if (amr2.a().t() != blg.h && amr2.a().t() != blg.bF) continue;
                            this.d.a(amr2.c(), blg.bH.s());
                        }
                    }
                }
                aiz2 = this.h();
            }
            this.p = c.a;
            this.q = 0;
            this.a(false);
            this.r = list;
        }
    }

    public void f() {
        for (ajp ajp2 : acp.a(this.d)) {
            List list = this.d.a(abi.class, ajp2.f());
            for (abi abi2 : list) {
                abi2.s(false);
                abi2.a((cmz)null);
            }
        }
    }
}

