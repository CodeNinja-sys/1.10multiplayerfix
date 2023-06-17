/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import com.a.a.b.cm;
import com.a.a.d.sz;
import com.a.a.d.yk;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.p;
import net.minecraft.q.ab;
import net.minecraft.q.au;
import net.minecraft.q.b.i;
import net.minecraft.q.b.q;
import net.minecraft.q.f.a;
import net.minecraft.q.f.e;
import net.minecraft.q.f.f;
import net.minecraft.q.f.n;
import net.minecraft.q.f.o;
import net.minecraft.q.g.g;
import net.minecraft.u.ad;
import net.minecraft.u.af;
import net.minecraft.u.ag;
import net.minecraft.u.b.m;
import net.minecraft.u.bo;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class k {
    private static final d e = org.apache.logging.log4j.c.c();
    public static final net.minecraft.q.f.a.e a = null;
    private final net.minecraft.q.f.a.e[] f = new net.minecraft.q.f.a.e[16];
    private final byte[] g = new byte[256];
    private final int[] h = new int[256];
    private final boolean[] i = new boolean[256];
    private boolean j;
    private final net.minecraft.q.k k;
    private final int[] l;
    public final int b;
    public final int c;
    private boolean m;
    private final Map n = sz.c();
    private final net.minecraft.u.e[] o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private long u;
    private int v;
    private long w;
    private int x = 4096;
    private ConcurrentLinkedQueue y = yk.b();
    public boolean d;

    public k(net.minecraft.q.k k2, int n2, int n3) {
        this.o = new net.minecraft.u.e[16];
        this.k = k2;
        this.b = n2;
        this.c = n3;
        this.l = new int[256];
        for (int i2 = 0; i2 < this.o.length; ++i2) {
            this.o[i2] = new net.minecraft.u.e(net.minecraft.w.n.class);
        }
        Arrays.fill(this.h, -999);
        Arrays.fill(this.g, (byte)-1);
    }

    public k(net.minecraft.q.k k2, e e2, int n2, int n3) {
        this(k2, n2, n3);
        int n4 = 256;
        boolean bl2 = !k2.q.n();
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 256; ++i4) {
                    b b2 = e2.a(i2, i4, i3);
                    if (b2.d() == net.minecraft.g.a.h.a) continue;
                    int n5 = i4 >> 4;
                    if (this.f[n5] == a) {
                        this.f[n5] = new net.minecraft.q.f.a.e(n5 << 4, bl2);
                    }
                    this.f[n5].a(i2, i4 & 0xF, i3, b2);
                }
            }
        }
    }

    public boolean a(int n2, int n3) {
        return n2 == this.b && n3 == this.c;
    }

    public int e(net.minecraft.u.b.b b2) {
        return this.b(b2.cy_() & 0xF, b2.l() & 0xF);
    }

    public int b(int n2, int n3) {
        return this.l[n3 << 4 | n2];
    }

    private net.minecraft.q.f.a.e y() {
        for (int i2 = this.f.length - 1; i2 >= 0; --i2) {
            if (this.f[i2] == a) continue;
            return this.f[i2];
        }
        return null;
    }

    public int g() {
        net.minecraft.q.f.a.e e2 = this.y();
        return e2 == null ? 0 : e2.c();
    }

    public net.minecraft.q.f.a.e[] h() {
        return this.f;
    }

    protected void a() {
        int n2 = this.g();
        this.v = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            block1: for (int i3 = 0; i3 < 16; ++i3) {
                this.h[i2 + (i3 << 4)] = -999;
                for (int i4 = n2 + 16; i4 > 0; --i4) {
                    b b2 = this.a(i2, i4 - 1, i3);
                    if (b2.f() == 0) continue;
                    this.l[i3 << 4 | i2] = i4;
                    if (i4 >= this.v) continue block1;
                    this.v = i4;
                    continue block1;
                }
            }
        }
        this.s = true;
    }

    public void b() {
        int n2 = this.g();
        this.v = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n3;
                this.h[i2 + (i3 << 4)] = -999;
                for (n3 = n2 + 16; n3 > 0; --n3) {
                    if (this.d(i2, n3 - 1, i3) == 0) continue;
                    this.l[i3 << 4 | i2] = n3;
                    if (n3 >= this.v) break;
                    this.v = n3;
                    break;
                }
                if (this.k.q.n()) continue;
                n3 = 15;
                int n4 = n2 + 16 - 1;
                do {
                    net.minecraft.q.f.a.e e2;
                    int n5;
                    if ((n5 = this.d(i2, n4, i3)) == 0 && n3 != 15) {
                        n5 = 1;
                    }
                    if ((n3 -= n5) <= 0 || (e2 = this.f[n4 >> 4]) == a) continue;
                    e2.a(i2, n4 & 0xF, i3, n3);
                    this.k.l(new net.minecraft.u.b.b((this.b << 4) + i2, n4, (this.c << 4) + i3));
                } while (--n4 > 0 && n3 > 0);
            }
        }
        this.s = true;
    }

    private void d(int n2, int n3) {
        this.i[n2 + n3 * 16] = true;
        this.m = true;
    }

    private void h(boolean bl2) {
        this.k.A.a("recheckGaps");
        if (this.k.a(new net.minecraft.u.b.b(this.b * 16 + 8, 0, this.c * 16 + 8), 16)) {
            for (int i2 = 0; i2 < 16; ++i2) {
                for (int i3 = 0; i3 < 16; ++i3) {
                    if (!this.i[i2 + i3 * 16]) continue;
                    this.i[i2 + i3 * 16] = false;
                    int n2 = this.b(i2, i3);
                    int n3 = this.b * 16 + i2;
                    int n4 = this.c * 16 + i3;
                    int n5 = Integer.MAX_VALUE;
                    for (ad ad2 : ag.a) {
                        n5 = Math.min(n5, this.k.c(n3 + ad2.h(), n4 + ad2.j()));
                    }
                    this.b(n3, n4, n5);
                    for (ad ad2 : ag.a) {
                        this.b(n3 + ad2.h(), n4 + ad2.j(), n2);
                    }
                    if (!bl2) continue;
                    this.k.A.b();
                    return;
                }
            }
            this.m = false;
        }
        this.k.A.b();
    }

    private void b(int n2, int n3, int n4) {
        int n5 = this.k.k(new net.minecraft.u.b.b(n2, 0, n3)).k();
        if (n5 > n4) {
            this.a(n2, n3, n4, n5 + 1);
        } else if (n5 < n4) {
            this.a(n2, n3, n5, n4 + 1);
        }
    }

    private void a(int n2, int n3, int n4, int n5) {
        if (n5 > n4 && this.k.a(new net.minecraft.u.b.b(n2, 0, n3), 16)) {
            for (int i2 = n4; i2 < n5; ++i2) {
                this.k.c(au.a, new net.minecraft.u.b.b(n2, i2, n3));
            }
            this.s = true;
        }
    }

    private void c(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = this.l[n4 << 4 | n2] & 0xFF;
        if (n3 > n5) {
            n6 = n3;
        }
        while (n6 > 0 && this.d(n2, n6 - 1, n4) == 0) {
            --n6;
        }
        if (n6 != n5) {
            int n7;
            this.k.a(n2 + this.b * 16, n4 + this.c * 16, n6, n5);
            this.l[n4 << 4 | n2] = n6;
            int n8 = this.b * 16 + n2;
            int n9 = this.c * 16 + n4;
            if (!this.k.q.n()) {
                net.minecraft.q.f.a.e e2;
                if (n6 < n5) {
                    for (n7 = n6; n7 < n5; ++n7) {
                        e2 = this.f[n7 >> 4];
                        if (e2 == a) continue;
                        e2.a(n2, n7 & 0xF, n4, 15);
                        this.k.l(new net.minecraft.u.b.b((this.b << 4) + n2, n7, (this.c << 4) + n4));
                    }
                } else {
                    for (n7 = n5; n7 < n6; ++n7) {
                        e2 = this.f[n7 >> 4];
                        if (e2 == a) continue;
                        e2.a(n2, n7 & 0xF, n4, 0);
                        this.k.l(new net.minecraft.u.b.b((this.b << 4) + n2, n7, (this.c << 4) + n4));
                    }
                }
                n7 = 15;
                while (n6 > 0 && n7 > 0) {
                    net.minecraft.q.f.a.e e3;
                    int n10;
                    if ((n10 = this.d(n2, --n6, n4)) == 0) {
                        n10 = 1;
                    }
                    if ((n7 -= n10) < 0) {
                        n7 = 0;
                    }
                    if ((e3 = this.f[n6 >> 4]) == a) continue;
                    e3.a(n2, n6 & 0xF, n4, n7);
                }
            }
            n7 = this.l[n4 << 4 | n2];
            int n11 = n5;
            int n12 = n7;
            if (n7 < n5) {
                n11 = n7;
                n12 = n5;
            }
            if (n7 < this.v) {
                this.v = n7;
            }
            if (!this.k.q.n()) {
                for (ad ad2 : ag.a) {
                    this.a(n8 + ad2.h(), n9 + ad2.j(), n11, n12);
                }
                this.a(n8, n9, n11, n12);
            }
            this.s = true;
        }
    }

    public int b(net.minecraft.u.b.b b2) {
        return this.a(b2).f();
    }

    private int d(int n2, int n3, int n4) {
        return this.a(n2, n3, n4).f();
    }

    public b a(net.minecraft.u.b.b b2) {
        return this.a(b2.cy_(), b2.k(), b2.l());
    }

    public b a(int n2, int n3, int n4) {
        if (this.k.y() == ab.g) {
            b b2 = null;
            if (n3 == 60) {
                b2 = net.minecraft.a.p.cv.v();
            }
            if (n3 == 70) {
                b2 = net.minecraft.q.g.g.c(n2, n4);
            }
            return b2 == null ? net.minecraft.a.p.a.v() : b2;
        }
        try {
            net.minecraft.q.f.a.e e2;
            if (n3 >= 0 && n3 >> 4 < this.f.length && (e2 = this.f[n3 >> 4]) != a) {
                return e2.a(n2 & 0xF, n3 & 0xF, n4 & 0xF);
            }
            return net.minecraft.a.p.a.v();
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Getting block state");
            net.minecraft.k.i i2 = a2.a("Block being got");
            i2.a("Location", new n(this, n2, n3, n4));
            throw new bo(a2);
        }
    }

    public b a(net.minecraft.u.b.b b2, b b3) {
        ap ap2;
        int n2;
        int n3;
        int n4 = b2.cy_() & 0xF;
        int n5 = b2.k();
        if (n5 >= this.h[n3 = (n2 = b2.l() & 0xF) << 4 | n4] - 1) {
            this.h[n3] = -999;
        }
        int n6 = this.l[n3];
        b b4 = this.a(b2);
        if (b4 == b3) {
            return null;
        }
        cn cn2 = b3.c();
        cn cn3 = b4.c();
        net.minecraft.q.f.a.e e2 = this.f[n5 >> 4];
        boolean bl2 = false;
        if (e2 == a) {
            if (cn2 == net.minecraft.a.p.a) {
                return null;
            }
            this.f[n5 >> 4] = e2 = new net.minecraft.q.f.a.e(n5 >> 4 << 4, !this.k.q.n());
            bl2 = n5 >= n6;
        }
        e2.a(n4, n5 & 0xF, n2, b3);
        if (cn3 != cn2) {
            if (!this.k.C) {
                cn3.a(this.k, b2, b4);
            } else if (cn3 instanceof p) {
                this.k.r(b2);
            }
        }
        if (e2.a(n4, n5 & 0xF, n2).c() != cn2) {
            return null;
        }
        if (bl2) {
            this.b();
        } else {
            int n7 = b3.f();
            int n8 = b4.f();
            if (n7 > 0) {
                if (n5 >= n6) {
                    this.c(n4, n5 + 1, n2);
                }
            } else if (n5 == n6 - 1) {
                this.c(n4, n5, n2);
            }
            if (n7 != n8 && (n7 < n8 || this.a(au.a, b2) > 0 || this.a(au.b, b2) > 0)) {
                this.d(n4, n2);
            }
        }
        if (cn3 instanceof p && (ap2 = this.a(b2, net.minecraft.q.f.a.c)) != null) {
            ap2.bN_();
        }
        if (!this.k.C && cn3 != cn2) {
            cn2.b(this.k, b2, b3);
        }
        if (cn2 instanceof p) {
            ap ap3 = this.a(b2, net.minecraft.q.f.a.c);
            if (ap3 == null) {
                ap3 = ((p)((Object)cn2)).a(this.k, cn2.b(b3));
                this.k.a(b2, ap3);
            }
            if (ap3 != null) {
                ap3.bN_();
            }
        }
        this.s = true;
        return b4;
    }

    public int a(au au2, net.minecraft.u.b.b b2) {
        int n2 = b2.cy_() & 0xF;
        int n3 = b2.k();
        int n4 = b2.l() & 0xF;
        net.minecraft.q.f.a.e e2 = this.f[n3 >> 4];
        return e2 == a ? (this.c(b2) ? au2.c : 0) : (au2 == au.a ? (this.k.q.n() ? 0 : e2.b(n2, n3 & 0xF, n4)) : (au2 == au.b ? e2.c(n2, n3 & 0xF, n4) : au2.c));
    }

    public void a(au au2, net.minecraft.u.b.b b2, int n2) {
        int n3 = b2.cy_() & 0xF;
        int n4 = b2.k();
        int n5 = b2.l() & 0xF;
        net.minecraft.q.f.a.e e2 = this.f[n4 >> 4];
        if (e2 == a) {
            this.f[n4 >> 4] = e2 = new net.minecraft.q.f.a.e(n4 >> 4 << 4, !this.k.q.n());
            this.b();
        }
        this.s = true;
        if (au2 == au.a) {
            if (!this.k.q.n()) {
                e2.a(n3, n4 & 0xF, n5, n2);
            }
        } else if (au2 == au.b) {
            e2.b(n3, n4 & 0xF, n5, n2);
        }
    }

    public int a(net.minecraft.u.b.b b2, int n2) {
        int n3 = b2.cy_() & 0xF;
        int n4 = b2.k();
        int n5 = b2.l() & 0xF;
        net.minecraft.q.f.a.e e2 = this.f[n4 >> 4];
        if (e2 == a) {
            return !this.k.q.n() && n2 < au.a.c ? au.a.c - n2 : 0;
        }
        int n6 = this.k.q.n() ? 0 : e2.b(n3, n4 & 0xF, n5);
        int n7 = e2.c(n3, n4 & 0xF, n5);
        if (n7 > (n6 -= n2)) {
            n6 = n7;
        }
        return n6;
    }

    public void a(net.minecraft.w.n n2) {
        int n3;
        this.t = true;
        int n4 = net.minecraft.u.b.n.c(n2.aU / 16.0);
        int n5 = net.minecraft.u.b.n.c(n2.aW / 16.0);
        if (n4 != this.b || n5 != this.c) {
            e.f("Wrong location! ({}, {}) should be ({}, {}), {}", n4, n5, this.b, this.c, n2, n2);
            n2.aa();
        }
        if ((n3 = net.minecraft.u.b.n.c(n2.aV / 16.0)) < 0) {
            n3 = 0;
        }
        if (n3 >= this.o.length) {
            n3 = this.o.length - 1;
        }
        n2.bG = true;
        n2.bH = this.b;
        n2.bI = n3;
        n2.bJ = this.c;
        this.o[n3].add(n2);
    }

    public void b(net.minecraft.w.n n2) {
        this.a(n2, n2.bI);
    }

    public void a(net.minecraft.w.n n2, int n3) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 >= this.o.length) {
            n3 = this.o.length - 1;
        }
        this.o[n3].remove(n2);
    }

    public boolean c(net.minecraft.u.b.b b2) {
        int n2;
        int n3 = b2.cy_() & 0xF;
        int n4 = b2.k();
        return n4 >= this.l[(n2 = b2.l() & 0xF) << 4 | n3];
    }

    private ap g(net.minecraft.u.b.b b2) {
        b b3 = this.a(b2);
        cn cn2 = b3.c();
        return !cn2.n() ? null : ((p)((Object)cn2)).a(this.k, b3.c().b(b3));
    }

    public ap a(net.minecraft.u.b.b b2, a a2) {
        ap ap2 = (ap)this.n.get(b2);
        if (ap2 == null) {
            if (a2 == net.minecraft.q.f.a.a) {
                ap2 = this.g(b2);
                this.k.a(b2, ap2);
            } else if (a2 == net.minecraft.q.f.a.b) {
                this.y.add(b2);
            }
        } else if (ap2.F()) {
            this.n.remove(b2);
            return null;
        }
        return ap2;
    }

    public void a(ap ap2) {
        this.a(ap2.D(), ap2);
        if (this.j) {
            this.k.a(ap2);
        }
    }

    public void a(net.minecraft.u.b.b b2, ap ap2) {
        ap2.b(this.k);
        ap2.c(b2);
        if (this.a(b2).c() instanceof p) {
            if (this.n.containsKey(b2)) {
                ((ap)this.n.get(b2)).bP_();
            }
            ap2.l();
            this.n.put(b2, ap2);
        }
    }

    public void d(net.minecraft.u.b.b b2) {
        ap ap2;
        if (this.j && (ap2 = (ap)this.n.remove(b2)) != null) {
            ap2.bP_();
        }
    }

    public void c() {
        this.j = true;
        this.k.a(this.n.values());
        net.minecraft.u.e[] arre = this.o;
        int n2 = this.o.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            net.minecraft.u.e e2 = arre[i2];
            this.k.b(e2);
        }
    }

    public void d() {
        this.j = false;
        for (Object object : this.n.values()) {
            this.k.b((ap)object);
        }
        net.minecraft.u.e[] arre = this.o;
        int n2 = this.o.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            object = arre[i2];
            this.k.c((Collection)object);
        }
    }

    public void e() {
        this.s = true;
    }

    public void a(net.minecraft.w.n n2, net.minecraft.u.b.a a2, List list, cm cm2) {
        int n3 = net.minecraft.u.b.n.c((a2.b - 2.0) / 16.0);
        int n4 = net.minecraft.u.b.n.c((a2.e + 2.0) / 16.0);
        n3 = net.minecraft.u.b.n.a(n3, 0, this.o.length - 1);
        n4 = net.minecraft.u.b.n.a(n4, 0, this.o.length - 1);
        for (int i2 = n3; i2 <= n4; ++i2) {
            if (this.o[i2].isEmpty()) continue;
            for (net.minecraft.w.n n5 : this.o[i2]) {
                net.minecraft.w.n[] arrn;
                if (!n5.cT().b(a2) || n5 == n2) continue;
                if (cm2 == null || cm2.a(n5)) {
                    list.add(n5);
                }
                if ((arrn = n5.cF()) == null) continue;
                net.minecraft.w.n[] arrn2 = arrn;
                int n6 = arrn.length;
                for (int i3 = 0; i3 < n6; ++i3) {
                    net.minecraft.w.n n7 = arrn2[i3];
                    if (n7 == n2 || !n7.cT().b(a2) || cm2 != null && !cm2.a(n7)) continue;
                    list.add(n7);
                }
            }
        }
    }

    public void a(Class class_, net.minecraft.u.b.a a2, List list, cm cm2) {
        int n2 = net.minecraft.u.b.n.c((a2.b - 2.0) / 16.0);
        int n3 = net.minecraft.u.b.n.c((a2.e + 2.0) / 16.0);
        n2 = net.minecraft.u.b.n.a(n2, 0, this.o.length - 1);
        n3 = net.minecraft.u.b.n.a(n3, 0, this.o.length - 1);
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (net.minecraft.w.n n4 : this.o[i2].c(class_)) {
                if (!n4.cT().b(a2) || cm2 != null && !cm2.a(n4)) continue;
                list.add(n4);
            }
        }
    }

    public boolean a(boolean bl2) {
        if (bl2 ? this.t && this.k.B() != this.u || this.s : this.t && this.k.B() >= this.u + 600L) {
            return true;
        }
        return this.s;
    }

    public Random a(long l2) {
        return new Random(this.k.A() + (long)(this.b * this.b * 4987142) + (long)(this.b * 5947611) + (long)(this.c * this.c) * 4392871L + (long)(this.c * 389711) ^ l2);
    }

    public boolean f() {
        return false;
    }

    public void a(f f2, o o2) {
        k k2;
        k k3 = f2.b(this.b, this.c - 1);
        k k4 = f2.b(this.b + 1, this.c);
        k k5 = f2.b(this.b, this.c + 1);
        k k6 = f2.b(this.b - 1, this.c);
        if (k4 != null && k5 != null && f2.b(this.b + 1, this.c + 1) != null) {
            this.a(o2);
        }
        if (k6 != null && k5 != null && f2.b(this.b - 1, this.c + 1) != null) {
            k6.a(o2);
        }
        if (k3 != null && k4 != null && f2.b(this.b + 1, this.c - 1) != null) {
            k3.a(o2);
        }
        if (k3 != null && k6 != null && (k2 = f2.b(this.b - 1, this.c - 1)) != null) {
            k2.a(o2);
        }
    }

    protected void a(o o2) {
        if (this.u()) {
            if (o2.a(this, this.b, this.c)) {
                this.e();
            }
        } else {
            this.o();
            o2.b(this.b, this.c);
            this.e();
        }
    }

    public net.minecraft.u.b.b f(net.minecraft.u.b.b b2) {
        int n2 = b2.cy_() & 0xF;
        int n3 = b2.l() & 0xF;
        int n4 = n2 | n3 << 4;
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(b2.cy_(), this.h[n4], b2.l());
        if (b3.k() == -999) {
            int n5 = this.g() + 15;
            b3 = new net.minecraft.u.b.b(b2.cy_(), n5, b2.l());
            int n6 = -1;
            while (b3.k() > 0 && n6 == -1) {
                b b4 = this.a(b3);
                h h2 = b4.d();
                if (!h2.c() && !h2.d()) {
                    b3 = b3.c();
                    continue;
                }
                n6 = b3.k() + 1;
            }
            this.h[n4] = n6;
        }
        return new net.minecraft.u.b.b(b2.cy_(), this.h[n4], b2.l());
    }

    public void b(boolean bl2) {
        if (this.m && !this.k.q.n() && !bl2) {
            this.h(this.k.C);
        }
        this.r = true;
        if (!this.q && this.p) {
            this.o();
        }
        while (!this.y.isEmpty()) {
            net.minecraft.u.b.b b2 = (net.minecraft.u.b.b)this.y.poll();
            if (this.a(b2, net.minecraft.q.f.a.c) != null || !this.a(b2).c().n()) continue;
            ap ap2 = this.g(b2);
            this.k.a(b2, ap2);
            this.k.b(b2, b2);
        }
    }

    public boolean i() {
        return this.r && this.p && this.q;
    }

    public boolean j() {
        return this.r;
    }

    public m k() {
        return new m(this.b, this.c);
    }

    public boolean c(int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        for (int i2 = n2; i2 <= n3; i2 += 16) {
            net.minecraft.q.f.a.e e2 = this.f[i2 >> 4];
            if (e2 == a || e2.a()) continue;
            return false;
        }
        return true;
    }

    public void a(net.minecraft.q.f.a.e[] arre) {
        if (this.f.length != arre.length) {
            e.f("Could not set level chunk sections, array length is {} instead of {}", arre.length, this.f.length);
        } else {
            System.arraycopy(arre, 0, this.f, 0, this.f.length);
        }
    }

    public void a(net.minecraft.x.a a2, int n2, boolean bl2) {
        int n3;
        boolean bl3 = !this.k.q.n();
        for (n3 = 0; n3 < this.f.length; ++n3) {
            Object object = this.f[n3];
            if ((n2 & 1 << n3) == 0) {
                if (!bl2 || object == a) continue;
                this.f[n3] = a;
                continue;
            }
            if (object == a) {
                this.f[n3] = object = new net.minecraft.q.f.a.e(n3 << 4, bl3);
            }
            ((net.minecraft.q.f.a.e)object).e().a(a2);
            a2.b(((net.minecraft.q.f.a.e)object).f().a());
            if (!bl3) continue;
            a2.b(((net.minecraft.q.f.a.e)object).g().a());
        }
        if (bl2) {
            a2.b(this.g);
        }
        for (n3 = 0; n3 < this.f.length; ++n3) {
            if (this.f[n3] == a || (n2 & 1 << n3) == 0) continue;
            this.f[n3].d();
        }
        this.q = true;
        this.p = true;
        this.a();
        for (ap ap2 : this.n.values()) {
            ap2.bN_();
        }
    }

    public q a(net.minecraft.u.b.b b2, i i2) {
        q q2;
        int n2 = b2.cy_() & 0xF;
        int n3 = b2.l() & 0xF;
        int n4 = this.g[n3 << 4 | n2] & 0xFF;
        if (n4 == 255) {
            q2 = i2.a(b2, net.minecraft.a.i.c);
            n4 = net.minecraft.q.b.q.a(q2);
            this.g[n3 << 4 | n2] = (byte)(n4 & 0xFF);
        }
        return (q2 = net.minecraft.q.b.q.b(n4)) == null ? net.minecraft.a.i.c : q2;
    }

    public byte[] l() {
        return this.g;
    }

    public void a(byte[] arrby) {
        if (this.g.length != arrby.length) {
            e.f("Could not set level chunk biomes, array length is {} instead of {}", arrby.length, this.g.length);
        } else {
            System.arraycopy(arrby, 0, this.g, 0, this.g.length);
        }
    }

    public void m() {
        this.x = 0;
    }

    public void n() {
        if (this.x < 4096) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.b << 4, 0, this.c << 4);
            for (int i2 = 0; i2 < 8; ++i2) {
                if (this.x >= 4096) {
                    return;
                }
                int n2 = this.x % 16;
                int n3 = this.x / 16 % 16;
                int n4 = this.x / 256;
                ++this.x;
                for (int i3 = 0; i3 < 16; ++i3) {
                    boolean bl2;
                    net.minecraft.u.b.b b3 = b2.a(n3, (n2 << 4) + i3, n4);
                    boolean bl3 = bl2 = i3 == 0 || i3 == 15 || n3 == 0 || n3 == 15 || n4 == 0 || n4 == 15;
                    if ((this.f[n2] != a || !bl2) && (this.f[n2] == a || this.f[n2].a(n3, i3, n4).d() != net.minecraft.g.a.h.a)) continue;
                    for (ad ad2 : ad.values()) {
                        net.minecraft.u.b.b b4 = b3.a(ad2);
                        if (this.k.n(b4).g() <= 0) continue;
                        this.k.v(b4);
                    }
                    this.k.v(b3);
                }
            }
        }
    }

    public void o() {
        this.p = true;
        this.q = true;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.b << 4, 0, this.c << 4);
        if (!this.k.q.n()) {
            if (this.k.a(b2.a(-1, 0, -1), b2.a(16, this.k.x(), 16))) {
                block0: for (int i2 = 0; i2 < 16; ++i2) {
                    for (int i3 = 0; i3 < 16; ++i3) {
                        if (this.e(i2, i3)) continue;
                        this.q = false;
                        break block0;
                    }
                }
                if (this.q) {
                    for (ad ad2 : ag.a) {
                        int n2 = ad2.d() == af.a ? 16 : 1;
                        this.k.e(b2.a(ad2, n2)).a(ad2.e());
                    }
                    this.z();
                }
            } else {
                this.q = false;
            }
        }
    }

    private void z() {
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2] = true;
        }
        this.h(false);
    }

    private void a(ad ad2) {
        block4: {
            block7: {
                block6: {
                    block5: {
                        if (!this.p) break block4;
                        if (ad2 != ad.f) break block5;
                        for (int i2 = 0; i2 < 16; ++i2) {
                            this.e(15, i2);
                        }
                        break block4;
                    }
                    if (ad2 != ad.e) break block6;
                    for (int i3 = 0; i3 < 16; ++i3) {
                        this.e(0, i3);
                    }
                    break block4;
                }
                if (ad2 != ad.d) break block7;
                for (int i4 = 0; i4 < 16; ++i4) {
                    this.e(i4, 15);
                }
                break block4;
            }
            if (ad2 != ad.c) break block4;
            for (int i5 = 0; i5 < 16; ++i5) {
                this.e(i5, 0);
            }
        }
    }

    private boolean e(int n2, int n3) {
        int n4;
        int n5 = this.g();
        boolean bl2 = false;
        boolean bl3 = false;
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g((this.b << 4) + n2, 0, (this.c << 4) + n3);
        for (n4 = n5 + 16 - 1; n4 > this.k.x() || n4 > 0 && !bl3; --n4) {
            g2.b(g2.cy_(), n4, g2.l());
            int n6 = this.b(g2);
            if (n6 == 255 && g2.k() < this.k.x()) {
                bl3 = true;
            }
            if (!bl2 && n6 > 0) {
                bl2 = true;
                continue;
            }
            if (!bl2 || n6 != 0 || this.k.v(g2)) continue;
            return false;
        }
        for (n4 = g2.k(); n4 > 0; --n4) {
            g2.b(g2.cy_(), n4, g2.l());
            if (this.a(g2).g() <= 0) continue;
            this.k.v(g2);
        }
        return true;
    }

    public boolean p() {
        return this.j;
    }

    public void c(boolean bl2) {
        this.j = bl2;
    }

    public net.minecraft.q.k q() {
        return this.k;
    }

    public int[] r() {
        return this.l;
    }

    public void a(int[] arrn) {
        if (this.l.length != arrn.length) {
            e.f("Could not set level chunk heightmap, array length is {} instead of {}", arrn.length, this.l.length);
        } else {
            System.arraycopy(arrn, 0, this.l, 0, this.l.length);
        }
    }

    public Map s() {
        return this.n;
    }

    public net.minecraft.u.e[] t() {
        return this.o;
    }

    public boolean u() {
        return this.p;
    }

    public void d(boolean bl2) {
        this.p = bl2;
    }

    public boolean v() {
        return this.q;
    }

    public void e(boolean bl2) {
        this.q = bl2;
    }

    public void f(boolean bl2) {
        this.s = bl2;
    }

    public void g(boolean bl2) {
        this.t = bl2;
    }

    public void b(long l2) {
        this.u = l2;
    }

    public int w() {
        return this.v;
    }

    public long x() {
        return this.w;
    }

    public void c(long l2) {
        this.w = l2;
    }
}

