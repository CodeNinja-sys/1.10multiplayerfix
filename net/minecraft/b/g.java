/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.b;

import com.a.a.d.ov;
import com.c.a.e;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import net.minecraft.b.f;
import net.minecraft.b.h;
import net.minecraft.e.a;
import net.minecraft.e.q;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ga;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.s;
import net.minecraft.w.e.bj;
import net.minecraft.w.h.ak;
import net.minecraft.w.l;

public class g {
    private k a;
    private final List b = ov.a();
    private net.minecraft.u.b.b c = net.minecraft.u.b.b.c;
    private net.minecraft.u.b.b d = net.minecraft.u.b.b.c;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final TreeMap j = new TreeMap();
    private final List k = ov.a();
    private int l;

    public g() {
    }

    public g(k k2) {
        this.a = k2;
    }

    public void a(k k2) {
        this.a = k2;
    }

    public void a(int n2) {
        s s2;
        int n3;
        this.g = n2;
        this.m();
        this.l();
        if (n2 % 20 == 0) {
            this.k();
        }
        if (n2 % 30 == 0) {
            this.j();
        }
        if (this.l < (n3 = this.h / 10) && this.b.size() > 20 && this.a.p.nextInt(7000) == 0 && (s2 = this.a(this.d, 2, 4, 2)) != null) {
            bj bj2 = new bj(this.a);
            bj2.e(s2.b, s2.c, s2.d);
            this.a.a(bj2);
            ++this.l;
        }
    }

    private s a(net.minecraft.u.b.b b2, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < 10; ++i2) {
            net.minecraft.u.b.b b3 = b2.a(this.a.p.nextInt(16) - 8, this.a.p.nextInt(6) - 3, this.a.p.nextInt(16) - 8);
            if (!this.a(b3) || !this.a(new net.minecraft.u.b.b(n2, n3, n4), b3)) continue;
            return new s(b3.cy_(), b3.k(), b3.l());
        }
        return null;
    }

    private boolean a(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        if (!this.a.n(b3.c()).t()) {
            return false;
        }
        int n2 = b3.cy_() - b2.cy_() / 2;
        int n3 = b3.l() - b2.l() / 2;
        for (int i2 = n2; i2 < n2 + b2.cy_(); ++i2) {
            for (int i3 = b3.k(); i3 < b3.k() + b2.k(); ++i3) {
                for (int i4 = n3; i4 < n3 + b2.l(); ++i4) {
                    if (!this.a.n(new net.minecraft.u.b.b(i2, i3, i4)).o()) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void j() {
        List list = this.a.a(bj.class, new net.minecraft.u.b.a(this.d.cy_() - this.e, this.d.k() - 4, this.d.l() - this.e, this.d.cy_() + this.e, this.d.k() + 4, this.d.l() + this.e));
        this.l = list.size();
    }

    private void k() {
        List list = this.a.a(ak.class, new net.minecraft.u.b.a(this.d.cy_() - this.e, this.d.k() - 4, this.d.l() - this.e, this.d.cy_() + this.e, this.d.k() + 4, this.d.l() + this.e));
        this.h = list.size();
        if (this.h == 0) {
            this.j.clear();
        }
    }

    public net.minecraft.u.b.b a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.b.size();
    }

    public int d() {
        return this.g - this.f;
    }

    public int e() {
        return this.h;
    }

    public boolean a(net.minecraft.u.b.b b2) {
        return this.d.i(b2) < (double)(this.e * this.e);
    }

    public List f() {
        return this.b;
    }

    public h b(net.minecraft.u.b.b b2) {
        h h2 = null;
        int n2 = Integer.MAX_VALUE;
        for (h h3 : this.b) {
            int n3 = h3.a(b2);
            if (n3 >= n2) continue;
            h2 = h3;
            n2 = n3;
        }
        return h2;
    }

    public h c(net.minecraft.u.b.b b2) {
        h h2 = null;
        int n2 = Integer.MAX_VALUE;
        for (h h3 : this.b) {
            ad ad2;
            net.minecraft.u.b.b b3;
            int n3 = h3.a(b2);
            n3 = n3 > 256 ? (n3 *= 1000) : h3.c();
            if (n3 >= n2 || !this.a.n((b3 = h3.d()).a(ad2 = h3.j(), 1)).c().a((n)this.a, b3.a(ad2, 1)) || !this.a.n(b3.a(ad2, -1)).c().a((n)this.a, b3.a(ad2, -1)) || !this.a.n(b3.b().a(ad2, 1)).c().a((n)this.a, b3.b().a(ad2, 1)) || !this.a.n(b3.b().a(ad2, -1)).c().a((n)this.a, b3.b().a(ad2, -1))) continue;
            h2 = h3;
            n2 = n3;
        }
        return h2;
    }

    public h d(net.minecraft.u.b.b b2) {
        if (this.d.i(b2) > (double)(this.e * this.e)) {
            return null;
        }
        for (h h2 : this.b) {
            if (h2.d().cy_() != b2.cy_() || h2.d().l() != b2.l() || Math.abs(h2.d().k() - b2.k()) > 1) continue;
            return h2;
        }
        return null;
    }

    public void a(h h2) {
        this.b.add(h2);
        this.c = this.c.a(h2.d());
        this.n();
        this.f = h2.h();
    }

    public boolean g() {
        return this.b.isEmpty();
    }

    public void a(l l2) {
        for (f f2 : this.k) {
            if (f2.a != l2) continue;
            f2.b = this.g;
            return;
        }
        this.k.add(new f(this, l2, this.g));
    }

    public l b(l l2) {
        double d2 = Double.MAX_VALUE;
        f f2 = null;
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            f f3 = (f)this.k.get(i2);
            double d3 = f3.a.n(l2);
            if (!(d3 <= d2)) continue;
            f2 = f3;
            d2 = d3;
        }
        return f2 != null ? f2.a : null;
    }

    public net.minecraft.w.a.b c(l l2) {
        double d2 = Double.MAX_VALUE;
        net.minecraft.w.a.b b2 = null;
        for (String string : this.j.keySet()) {
            double d3;
            net.minecraft.w.a.b b3;
            if (!this.b(string) || (b3 = this.a.a(string)) == null || !((d3 = b3.n(l2)) <= d2)) continue;
            b2 = b3;
            d2 = d3;
        }
        return b2;
    }

    private void l() {
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            f f2 = (f)iterator.next();
            if (f2.a.br() && Math.abs(this.g - f2.b) <= 300) continue;
            iterator.remove();
        }
    }

    private void m() {
        boolean bl2 = false;
        boolean bl3 = this.a.p.nextInt(50) == 0;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            h h2 = (h)iterator.next();
            if (bl3) {
                h2.a();
            }
            if (this.e(h2.d()) && Math.abs(this.g - h2.h()) <= 1200) continue;
            this.c = this.c.b(h2.d());
            bl2 = true;
            h2.a(true);
            iterator.remove();
        }
        if (bl2) {
            this.n();
        }
    }

    private boolean e(net.minecraft.u.b.b b2) {
        b b3 = this.a.n(b2);
        cn cn2 = b3.c();
        return cn2 instanceof ga ? b3.d() == net.minecraft.g.a.h.d : false;
    }

    private void n() {
        int n2 = this.b.size();
        if (n2 == 0) {
            this.d = net.minecraft.u.b.b.c;
            this.e = 0;
        } else {
            this.d = new net.minecraft.u.b.b(this.c.cy_() / n2, this.c.k() / n2, this.c.l() / n2);
            int n3 = 0;
            for (h h2 : this.b) {
                n3 = Math.max(h2.a(this.d), n3);
            }
            this.e = Math.max(32, (int)Math.sqrt(n3) + 1);
        }
    }

    public int a(String string) {
        Integer n2 = (Integer)this.j.get(string);
        return n2 != null ? n2 : 0;
    }

    public int a(String string, int n2) {
        int n3 = this.a(string);
        int n4 = net.minecraft.u.b.n.a(n3 + n2, -30, 10);
        this.j.put(string, n4);
        return n4;
    }

    public boolean b(String string) {
        return this.a(string) <= -15;
    }

    public void a(net.minecraft.e.e e2) {
        Object object;
        this.h = e2.h("PopSize");
        this.e = e2.h("Radius");
        this.l = e2.h("Golems");
        this.f = e2.h("Stable");
        this.g = e2.h("Tick");
        this.i = e2.h("MTick");
        this.d = new net.minecraft.u.b.b(e2.h("CX"), e2.h("CY"), e2.h("CZ"));
        this.c = new net.minecraft.u.b.b(e2.h("ACX"), e2.h("ACY"), e2.h("ACZ"));
        q q2 = e2.c("Doors", 10);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            net.minecraft.e.e e3 = q2.b(i2);
            object = new h(new net.minecraft.u.b.b(e3.h("X"), e3.h("Y"), e3.h("Z")), e3.h("IDX"), e3.h("IDZ"), e3.h("TS"));
            this.b.add(object);
        }
        q q3 = e2.c("Players", 10);
        for (int i3 = 0; i3 < q3.e(); ++i3) {
            object = q3.b(i3);
            if (((net.minecraft.e.e)object).e("UUID") && this.a != null && this.a.l() != null) {
                net.minecraft.c.b.h h2 = this.a.l().aO();
                e e4 = h2.a(UUID.fromString(((net.minecraft.e.e)object).l("UUID")));
                if (e4 == null) continue;
                this.j.put(e4.b(), ((net.minecraft.e.e)object).h("S"));
                continue;
            }
            this.j.put(((net.minecraft.e.e)object).l("Name"), ((net.minecraft.e.e)object).h("S"));
        }
    }

    public void b(net.minecraft.e.e e2) {
        Object object2;
        e2.a("PopSize", this.h);
        e2.a("Radius", this.e);
        e2.a("Golems", this.l);
        e2.a("Stable", this.f);
        e2.a("Tick", this.g);
        e2.a("MTick", this.i);
        e2.a("CX", this.d.cy_());
        e2.a("CY", this.d.k());
        e2.a("CZ", this.d.l());
        e2.a("ACX", this.c.cy_());
        e2.a("ACY", this.c.k());
        e2.a("ACZ", this.c.l());
        q q2 = new q();
        for (Object object2 : this.b) {
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            e3.a("X", ((h)object2).d().cy_());
            e3.a("Y", ((h)object2).d().k());
            e3.a("Z", ((h)object2).d().l());
            e3.a("IDX", ((h)object2).f());
            e3.a("IDZ", ((h)object2).g());
            e3.a("TS", ((h)object2).h());
            q2.a(e3);
        }
        e2.a("Doors", q2);
        object2 = new q();
        for (Object object3 : this.j.keySet()) {
            net.minecraft.e.e e4 = new net.minecraft.e.e();
            net.minecraft.c.b.h h2 = this.a.l().aO();
            e e5 = h2.a((String)object3);
            if (e5 == null) continue;
            e4.a("UUID", e5.a().toString());
            e4.a("S", (Integer)this.j.get(object3));
            ((q)object2).a(e4);
        }
        e2.a("Players", (a)object2);
    }

    public void h() {
        this.i = this.g;
    }

    public boolean i() {
        return this.i == 0 || this.g - this.i >= 3600;
    }

    public void b(int n2) {
        for (String string : this.j.keySet()) {
            this.a(string, n2);
        }
    }
}

