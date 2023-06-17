/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.b;

import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import net.minecraft.b.g;
import net.minecraft.b.h;
import net.minecraft.e.q;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ga;
import net.minecraft.q.f;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class e
extends f {
    private k a;
    private final List b = ov.a();
    private final List c = ov.a();
    private final List d = ov.a();
    private int e;

    public e(String string) {
        super(string);
    }

    public e(k k2) {
        super(net.minecraft.b.e.a(k2.q));
        this.a = k2;
        this.d();
    }

    public void a(k k2) {
        this.a = k2;
        for (g g2 : this.d) {
            g2.a(k2);
        }
    }

    public void a(net.minecraft.u.b.b b2) {
        if (this.b.size() <= 64 && !this.e(b2)) {
            this.b.add(b2);
        }
    }

    public void a() {
        ++this.e;
        for (g g2 : this.d) {
            g2.a(this.e);
        }
        this.c();
        this.f();
        this.g();
        if (this.e % 400 == 0) {
            this.d();
        }
    }

    private void c() {
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            g g2 = (g)iterator.next();
            if (!g2.g()) continue;
            iterator.remove();
            this.d();
        }
    }

    public List b() {
        return this.d;
    }

    public g a(net.minecraft.u.b.b b2, int n2) {
        g g2 = null;
        double d2 = 3.4028234663852886E38;
        for (g g3 : this.d) {
            float f2;
            double d3 = g3.a().i(b2);
            if (!(d3 < d2) || !(d3 <= (double)((f2 = (float)(n2 + g3.b())) * f2))) continue;
            g2 = g3;
            d2 = d3;
        }
        return g2;
    }

    private void f() {
        if (!this.b.isEmpty()) {
            this.b((net.minecraft.u.b.b)this.b.remove(0));
        }
    }

    private void g() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            h h2 = (h)this.c.get(i2);
            g g2 = this.a(h2.d(), 32);
            if (g2 == null) {
                g2 = new g(this.a);
                this.d.add(g2);
                this.d();
            }
            g2.a(h2);
        }
        this.c.clear();
    }

    private void b(net.minecraft.u.b.b b2) {
        int n2 = 16;
        int n3 = 4;
        int n4 = 16;
        for (int i2 = -16; i2 < 16; ++i2) {
            for (int i3 = -4; i3 < 4; ++i3) {
                for (int i4 = -16; i4 < 16; ++i4) {
                    net.minecraft.u.b.b b3 = b2.a(i2, i3, i4);
                    if (!this.f(b3)) continue;
                    h h2 = this.c(b3);
                    if (h2 == null) {
                        this.d(b3);
                        continue;
                    }
                    h2.a(this.e);
                }
            }
        }
    }

    private h c(net.minecraft.u.b.b b2) {
        for (Object object : this.c) {
            if (((h)object).d().cy_() != b2.cy_() || ((h)object).d().l() != b2.l() || Math.abs(((h)object).d().k() - b2.k()) > 1) continue;
            return object;
        }
        for (Object object : this.d) {
            h h2 = ((g)object).d(b2);
            if (h2 == null) continue;
            return h2;
        }
        return null;
    }

    private void d(net.minecraft.u.b.b b2) {
        int n2;
        ad ad2 = ga.e(this.a, b2);
        ad ad3 = ad2.e();
        int n3 = this.a(b2, ad2, 5);
        if (n3 != (n2 = this.a(b2, ad3, n3 + 1))) {
            this.c.add(new h(b2, n3 < n2 ? ad2 : ad3, this.e));
        }
    }

    private int a(net.minecraft.u.b.b b2, ad ad2, int n2) {
        int n3 = 0;
        for (int i2 = 1; i2 <= 5; ++i2) {
            if (!this.a.g(b2.a(ad2, i2)) || ++n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    private boolean e(net.minecraft.u.b.b b2) {
        for (net.minecraft.u.b.b b3 : this.b) {
            if (!b3.equals(b2)) continue;
            return true;
        }
        return false;
    }

    private boolean f(net.minecraft.u.b.b b2) {
        b b3 = this.a.n(b2);
        cn cn2 = b3.c();
        return cn2 instanceof ga ? b3.d() == net.minecraft.g.a.h.d : false;
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        this.e = e2.h("Tick");
        q q2 = e2.c("Villages", 10);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            net.minecraft.e.e e3 = q2.b(i2);
            g g2 = new g();
            g2.a(e3);
            this.d.add(g2);
        }
    }

    @Override
    public net.minecraft.e.e b(net.minecraft.e.e e2) {
        e2.a("Tick", this.e);
        q q2 = new q();
        for (g g2 : this.d) {
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            g2.b(e3);
            q2.a(e3);
        }
        e2.a("Villages", q2);
        return e2;
    }

    public static String a(net.minecraft.q.e e2) {
        return "villages" + e2.a().c();
    }
}

