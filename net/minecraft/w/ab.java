/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.d.aad;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.minecraft.g.cn;
import net.minecraft.m.bf;
import net.minecraft.m.cu;
import net.minecraft.q.a.y;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.b.a.e;
import net.minecraft.w.c.a;
import net.minecraft.w.c.d;
import net.minecraft.w.c.f;
import net.minecraft.w.c.h;
import net.minecraft.w.c.i;
import net.minecraft.w.c.j;
import net.minecraft.w.c.k;
import net.minecraft.w.c.m;
import net.minecraft.w.c.o;
import net.minecraft.w.c.q;
import net.minecraft.w.c.r;
import net.minecraft.w.f.ad;
import net.minecraft.w.f.ae;
import net.minecraft.w.f.af;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.p;
import net.minecraft.w.w;
import net.minecraft.x.d.b.ag;
import net.minecraft.x.d.b.ap;
import net.minecraft.x.d.b.ar;
import net.minecraft.x.d.b.ba;
import net.minecraft.x.d.b.bl;
import net.minecraft.x.d.b.bo;
import net.minecraft.x.d.b.bp;
import net.minecraft.x.d.b.bv;
import net.minecraft.x.d.b.bw;
import net.minecraft.x.d.b.by;
import net.minecraft.x.d.b.ch;
import net.minecraft.x.d.b.x;
import org.apache.logging.log4j.c;

public class ab {
    private static final org.apache.logging.log4j.d c = org.apache.logging.log4j.c.c();
    private final n d;
    private final int e;
    private int f;
    private final int g;
    private long h;
    private long i;
    private long j;
    private int k;
    private int l;
    private int m;
    private double n;
    private double o;
    private double p;
    public int a;
    private double q;
    private double r;
    private double s;
    private boolean t;
    private final boolean u;
    private int v;
    private List w = Collections.emptyList();
    private boolean x;
    private boolean y;
    public boolean b;
    private final Set z = aad.a();

    public ab(n n2, int n3, int n4, int n5, boolean bl2) {
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.u = bl2;
        this.h = net.minecraft.w.w.a(n2.aU);
        this.i = net.minecraft.w.w.a(n2.aV);
        this.j = net.minecraft.w.w.a(n2.aW);
        this.k = net.minecraft.u.b.n.d(n2.ba * 256.0f / 360.0f);
        this.l = net.minecraft.u.b.n.d(n2.bb * 256.0f / 360.0f);
        this.m = net.minecraft.u.b.n.d(n2.bO() * 256.0f / 360.0f);
        this.y = n2.be;
    }

    public boolean equals(Object object) {
        return object instanceof ab ? ((ab)object).d.ca() == this.d.ca() : false;
    }

    public int hashCode() {
        return this.d.ca();
    }

    public void a(List list) {
        List list2;
        this.b = false;
        if (!this.t || this.d.h(this.q, this.r, this.s) > 16.0) {
            this.q = this.d.aU;
            this.r = this.d.aV;
            this.s = this.d.aW;
            this.t = true;
            this.b = true;
            this.b(list);
        }
        if (!(list2 = this.d.db()).equals(this.w)) {
            this.w = list2;
            this.a(new bo(this.d));
        }
        if (this.d instanceof net.minecraft.w.f.l && this.a % 10 == 0) {
            net.minecraft.w.f.l l2 = (net.minecraft.w.f.l)this.d;
            cu cu2 = l2.p();
            if (cu2 != null && cu2.a() instanceof bf) {
                y y2 = net.minecraft.a.w.bk.a(cu2, this.d.aQ);
                for (b b2 : list) {
                    g g2 = (g)b2;
                    y2.a(g2, cu2);
                    net.minecraft.x.p p2 = net.minecraft.a.w.bk.a(cu2, this.d.aQ, g2);
                    if (p2 == null) continue;
                    g2.a.a(p2);
                }
            }
            this.d();
        }
        if (this.a % this.g == 0 || this.d.bO || this.d.cc().a()) {
            if (this.d.cz()) {
                boolean bl2;
                int n2 = net.minecraft.u.b.n.d(this.d.ba * 256.0f / 360.0f);
                int n3 = net.minecraft.u.b.n.d(this.d.bb * 256.0f / 360.0f);
                boolean bl3 = bl2 = Math.abs(n2 - this.k) >= 1 || Math.abs(n3 - this.l) >= 1;
                if (bl2) {
                    this.a(new bv(this.d.ca(), (byte)n2, (byte)n3, this.d.be));
                    this.k = n2;
                    this.l = n3;
                }
                this.h = net.minecraft.w.w.a(this.d.aU);
                this.i = net.minecraft.w.w.a(this.d.aV);
                this.j = net.minecraft.w.w.a(this.d.aW);
                this.d();
                this.x = true;
            } else {
                boolean bl4;
                ++this.v;
                long l3 = net.minecraft.w.w.a(this.d.aU);
                long l4 = net.minecraft.w.w.a(this.d.aV);
                long l5 = net.minecraft.w.w.a(this.d.aW);
                int n4 = net.minecraft.u.b.n.d(this.d.ba * 256.0f / 360.0f);
                int n5 = net.minecraft.u.b.n.d(this.d.bb * 256.0f / 360.0f);
                long l6 = l3 - this.h;
                long l7 = l4 - this.i;
                long l8 = l5 - this.j;
                net.minecraft.x.p p3 = null;
                boolean bl5 = l6 * l6 + l7 * l7 + l8 * l8 >= 128L || this.a % 60 == 0;
                boolean bl6 = bl4 = Math.abs(n4 - this.k) >= 1 || Math.abs(n5 - this.l) >= 1;
                if (this.a > 0 || this.d instanceof f) {
                    if (l6 >= -32768L && l6 < 32768L && l7 >= -32768L && l7 < 32768L && l8 >= -32768L && l8 < 32768L && this.v <= 400 && !this.x && this.y == this.d.be) {
                        if (!(bl5 && bl4 || this.d instanceof f)) {
                            if (bl5) {
                                p3 = new bp(this.d.ca(), l6, l7, l8, this.d.be);
                            } else if (bl4) {
                                p3 = new bv(this.d.ca(), (byte)n4, (byte)n5, this.d.be);
                            }
                        } else {
                            p3 = new by(this.d.ca(), l6, l7, l8, (byte)n4, (byte)n5, this.d.be);
                        }
                    } else {
                        this.y = this.d.be;
                        this.v = 0;
                        this.c();
                        p3 = new ag(this.d);
                    }
                }
                boolean bl7 = this.u;
                if (this.d instanceof l && ((l)this.d).bW()) {
                    bl7 = true;
                }
                if (bl7) {
                    double d2 = this.d.aX - this.n;
                    double d3 = this.d.aY - this.o;
                    double d4 = this.d.aZ - this.p;
                    double d5 = 0.02;
                    double d6 = d2 * d2 + d3 * d3 + d4 * d4;
                    if (d6 > 4.0E-4 || d6 > 0.0 && this.d.aX == 0.0 && this.d.aY == 0.0 && this.d.aZ == 0.0) {
                        this.n = this.d.aX;
                        this.o = this.d.aY;
                        this.p = this.d.aZ;
                        this.a(new net.minecraft.x.d.b.h(this.d.ca(), this.n, this.o, this.p));
                    }
                }
                if (p3 != null) {
                    this.a(p3);
                }
                this.d();
                if (bl5) {
                    this.h = l3;
                    this.i = l4;
                    this.j = l5;
                }
                if (bl4) {
                    this.k = n4;
                    this.l = n5;
                }
                this.x = false;
            }
            int n6 = net.minecraft.u.b.n.d(this.d.bO() * 256.0f / 360.0f);
            if (Math.abs(n6 - this.m) >= 1) {
                this.a(new ba(this.d, (byte)n6));
                this.m = n6;
            }
            this.d.bO = false;
        }
        ++this.a;
        if (this.d.bi) {
            this.b(new net.minecraft.x.d.b.h(this.d));
            this.d.bi = false;
        }
    }

    private void d() {
        net.minecraft.x.a.o o2 = this.d.cc();
        if (o2.a()) {
            this.b(new x(this.d.ca(), o2, false));
        }
        if (this.d instanceof l) {
            e e2 = (e)((l)this.d).bA();
            Set set = e2.b();
            if (!set.isEmpty()) {
                this.b(new ch(this.d.ca(), set));
            }
            set.clear();
        }
    }

    public void a(net.minecraft.x.p p2) {
        for (g g2 : this.z) {
            g2.a.a(p2);
        }
    }

    public void b(net.minecraft.x.p p2) {
        this.a(p2);
        if (this.d instanceof g) {
            ((g)this.d).a.a(p2);
        }
    }

    public void a() {
        for (g g2 : this.z) {
            this.d.c(g2);
            g2.e(this.d);
        }
    }

    public void a(g g2) {
        if (this.z.contains(g2)) {
            this.d.c(g2);
            g2.e(this.d);
            this.z.remove(g2);
        }
    }

    public void b(g g2) {
        if (g2 != this.d) {
            if (this.c(g2)) {
                if (!this.z.contains(g2) && (this.e(g2) || this.d.aP)) {
                    b b2;
                    this.z.add(g2);
                    net.minecraft.x.p p2 = this.e();
                    g2.a.a(p2);
                    if (!this.d.cc().d()) {
                        g2.a.a(new x(this.d.ca(), this.d.cc(), true));
                    }
                    boolean bl2 = this.u;
                    if (this.d instanceof l) {
                        e object3 = (e)((l)this.d).bA();
                        Object object = object3.c();
                        if (!object.isEmpty()) {
                            g2.a.a(new ch(this.d.ca(), (Collection)object));
                        }
                        if (((l)this.d).bW()) {
                            bl2 = true;
                        }
                    }
                    this.n = this.d.aX;
                    this.o = this.d.aY;
                    this.p = this.d.aZ;
                    if (bl2 && !(p2 instanceof ap)) {
                        g2.a.a(new net.minecraft.x.d.b.h(this.d.ca(), this.d.aX, this.d.aY, this.d.aZ));
                    }
                    if (this.d instanceof l) {
                        for (net.minecraft.h.k k2 : net.minecraft.h.k.values()) {
                            cu cu2 = ((l)this.d).a(k2);
                            if (cu2 == null) continue;
                            g2.a.a(new net.minecraft.x.d.b.n(this.d.ca(), k2, cu2));
                        }
                    }
                    if (this.d instanceof b && (b2 = (b)this.d).ae()) {
                        g2.a.a(new net.minecraft.x.d.b.p(b2, new net.minecraft.u.b.b(this.d)));
                    }
                    if (this.d instanceof l) {
                        l l2 = (l)this.d;
                        for (Object object : l2.bm()) {
                            g2.a.a(new bw(this.d.ca(), (net.minecraft.d.j)object));
                        }
                    }
                    this.d.b(g2);
                    g2.f(this.d);
                }
            } else if (this.z.contains(g2)) {
                this.z.remove(g2);
                this.d.c(g2);
                g2.e(this.d);
            }
        }
    }

    public boolean c(g g2) {
        double d2 = g2.aU - (double)this.h / 4096.0;
        double d3 = g2.aW - (double)this.j / 4096.0;
        int n2 = Math.min(this.e, this.f);
        return d2 >= (double)(-n2) && d2 <= (double)n2 && d3 >= (double)(-n2) && d3 <= (double)n2 && this.d.a(g2);
    }

    private boolean e(g g2) {
        return g2.y().af().a(g2, this.d.bH, this.d.bJ);
    }

    public void b(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.b((g)list.get(i2));
        }
    }

    private net.minecraft.x.p e() {
        if (this.d.bk) {
            c.f("Fetching addPacket for removed entity");
        }
        if (this.d instanceof ae) {
            return new bl(this.d, 2, 1);
        }
        if (this.d instanceof g) {
            return new ar((b)this.d);
        }
        if (this.d instanceof net.minecraft.w.f.f) {
            net.minecraft.w.f.f f2 = (net.minecraft.w.f.f)this.d;
            return new bl(this.d, 10, f2.a().a());
        }
        if (this.d instanceof net.minecraft.w.f.ab) {
            return new bl(this.d, 1);
        }
        if (this.d instanceof net.minecraft.w.h.a) {
            this.m = net.minecraft.u.b.n.d(this.d.bO() * 256.0f / 360.0f);
            return new ap((l)this.d);
        }
        if (this.d instanceof a) {
            b b2 = ((a)this.d).a;
            return new bl(this.d, 90, b2 != null ? b2.ca() : this.d.ca());
        }
        if (this.d instanceof h) {
            n n2 = ((h)this.d).e;
            return new bl(this.d, 91, 1 + (n2 != null ? n2.ca() : this.d.ca()));
        }
        if (this.d instanceof i) {
            n n3 = ((f)this.d).e;
            return new bl(this.d, 60, 1 + (n3 != null ? n3.ca() : this.d.ca()));
        }
        if (this.d instanceof r) {
            return new bl(this.d, 61);
        }
        if (this.d instanceof k) {
            return new bl(this.d, 73);
        }
        if (this.d instanceof net.minecraft.w.f.p) {
            return new bl(this.d, 75);
        }
        if (this.d instanceof net.minecraft.w.f.k) {
            return new bl(this.d, 65);
        }
        if (this.d instanceof net.minecraft.w.f.a) {
            return new bl(this.d, 72);
        }
        if (this.d instanceof net.minecraft.w.f.h) {
            return new bl(this.d, 76);
        }
        if (this.d instanceof q) {
            q q2 = (q)this.d;
            bl bl2 = null;
            int n4 = 63;
            if (this.d instanceof d) {
                n4 = 64;
            } else if (this.d instanceof o) {
                n4 = 93;
            } else if (this.d instanceof net.minecraft.w.c.b) {
                n4 = 66;
            }
            bl2 = q2.b != null ? new bl(this.d, n4, ((q)this.d).b.ca()) : new bl(this.d, n4, 0);
            bl2.a((int)(q2.c * 8000.0));
            bl2.b((int)(q2.d * 8000.0));
            bl2.c((int)(q2.e * 8000.0));
            return bl2;
        }
        if (this.d instanceof j) {
            bl bl3 = new bl(this.d, 67, 0);
            bl3.a((int)(this.d.aX * 8000.0));
            bl3.b((int)(this.d.aY * 8000.0));
            bl3.c((int)(this.d.aZ * 8000.0));
            return bl3;
        }
        if (this.d instanceof m) {
            return new bl(this.d, 62);
        }
        if (this.d instanceof af) {
            return new bl(this.d, 50);
        }
        if (this.d instanceof ad) {
            return new bl(this.d, 51);
        }
        if (this.d instanceof net.minecraft.w.f.n) {
            net.minecraft.w.f.n n5 = (net.minecraft.w.f.n)this.d;
            return new bl(this.d, 70, cn.p(n5.f()));
        }
        if (this.d instanceof net.minecraft.w.f.j) {
            return new bl(this.d, 78);
        }
        if (this.d instanceof net.minecraft.w.f.q) {
            return new net.minecraft.x.d.b.ad((net.minecraft.w.f.q)this.d);
        }
        if (this.d instanceof net.minecraft.w.f.l) {
            net.minecraft.w.f.l l2 = (net.minecraft.w.f.l)this.d;
            return new bl(this.d, 71, l2.b.c(), l2.l());
        }
        if (this.d instanceof p) {
            p p2 = (p)this.d;
            return new bl(this.d, 77, 0, p2.l());
        }
        if (this.d instanceof net.minecraft.w.f.e) {
            return new net.minecraft.x.d.b.ab((net.minecraft.w.f.e)this.d);
        }
        if (this.d instanceof net.minecraft.w.a) {
            return new bl(this.d, 3);
        }
        throw new IllegalArgumentException("Don't know how to add " + this.d.getClass() + "!");
    }

    public void d(g g2) {
        if (this.z.contains(g2)) {
            this.z.remove(g2);
            this.d.c(g2);
            g2.e(this.d);
        }
    }

    public n b() {
        return this.d;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public void c() {
        this.t = false;
    }
}

