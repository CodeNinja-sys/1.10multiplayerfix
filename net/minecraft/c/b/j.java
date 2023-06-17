/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.c.b.a;
import net.minecraft.c.b.ab;
import net.minecraft.c.b.ad;
import net.minecraft.c.b.r;
import net.minecraft.c.b.t;
import net.minecraft.c.b.z;
import net.minecraft.q.e;
import net.minecraft.q.f.k;
import net.minecraft.q.v;
import net.minecraft.u.b.b;
import net.minecraft.u.b.m;
import net.minecraft.u.b.n;
import net.minecraft.w.a.g;

public class j {
    private static final cm a = new r();
    private static final cm b = new ab();
    private final v c;
    private final List d = ov.a();
    private final as e = new bl(4096);
    private final Set f = aad.a();
    private final List g = ov.b();
    private final List h = ov.b();
    private final List i = ov.a();
    private int j;
    private long k;
    private boolean l = true;
    private boolean m = true;

    public j(v v2) {
        this.c = v2;
        this.a(v2.l().av().s());
    }

    public v a() {
        return this.c;
    }

    public Iterator b() {
        Iterator iterator = this.i.iterator();
        return new z(this, iterator);
    }

    public void c() {
        e e2;
        Iterator iterator;
        long l2 = this.c.B();
        if (l2 - this.k > 8000L) {
            this.k = l2;
            for (int i2 = 0; i2 < this.i.size(); ++i2) {
                iterator = (a)this.i.get(i2);
                ((a)((Object)iterator)).d();
                ((a)((Object)iterator)).c();
            }
        }
        if (!this.f.isEmpty()) {
            for (a a2 : this.f) {
                a2.d();
            }
            this.f.clear();
        }
        if (this.l && l2 % 4L == 0L) {
            this.l = false;
            Collections.sort(this.h, new t(this));
        }
        if (this.m && l2 % 4L == 2L) {
            this.m = false;
            Collections.sort(this.g, new ad(this));
        }
        if (!this.h.isEmpty()) {
            long l3 = System.nanoTime() + 50000000L;
            int n2 = 49;
            Iterator iterator2 = this.h.iterator();
            while (iterator2.hasNext()) {
                boolean bl2;
                a a3 = (a)iterator2.next();
                if (a3.f() != null || !a3.a(bl2 = a3.a(b))) continue;
                iterator2.remove();
                if (a3.b()) {
                    this.g.remove(a3);
                }
                if (--n2 < 0 || System.nanoTime() > l3) break;
            }
        }
        if (!this.g.isEmpty()) {
            int n3 = 81;
            iterator = this.g.iterator();
            while (iterator.hasNext()) {
                a a4 = (a)iterator.next();
                if (!a4.b()) continue;
                iterator.remove();
                if (--n3 < 0) break;
            }
        }
        if (this.d.isEmpty() && !(e2 = this.c.q).f()) {
            this.c.ac().d();
        }
    }

    public boolean a(int n2, int n3) {
        long l2 = net.minecraft.c.b.j.d(n2, n3);
        return this.e.c(l2) != null;
    }

    public a b(int n2, int n3) {
        return (a)this.e.c(net.minecraft.c.b.j.d(n2, n3));
    }

    private a c(int n2, int n3) {
        long l2 = net.minecraft.c.b.j.d(n2, n3);
        a a2 = (a)this.e.c(l2);
        if (a2 == null) {
            a2 = new a(this, n2, n3);
            this.e.a(l2, a2);
            this.i.add(a2);
            if (a2.f() == null) {
                this.h.add(a2);
            }
            if (!a2.b()) {
                this.g.add(a2);
            }
        }
        return a2;
    }

    public void a(b b2) {
        int n2;
        int n3 = b2.cy_() >> 4;
        a a2 = this.b(n3, n2 = b2.l() >> 4);
        if (a2 != null) {
            a2.a(b2.cy_() & 0xF, b2.k(), b2.l() & 0xF);
        }
    }

    public void a(g g2) {
        int n2 = (int)g2.aU >> 4;
        int n3 = (int)g2.aW >> 4;
        g2.d = g2.aU;
        g2.e = g2.aW;
        for (int i2 = n2 - this.j; i2 <= n2 + this.j; ++i2) {
            for (int i3 = n3 - this.j; i3 <= n3 + this.j; ++i3) {
                this.c(i2, i3).a(g2);
            }
        }
        this.d.add(g2);
        this.e();
    }

    public void b(g g2) {
        int n2 = (int)g2.d >> 4;
        int n3 = (int)g2.e >> 4;
        for (int i2 = n2 - this.j; i2 <= n2 + this.j; ++i2) {
            for (int i3 = n3 - this.j; i3 <= n3 + this.j; ++i3) {
                a a2 = this.b(i2, i3);
                if (a2 == null) continue;
                a2.b(g2);
            }
        }
        this.d.remove(g2);
        this.e();
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 - n4;
        int n8 = n3 - n5;
        return n7 >= -n6 && n7 <= n6 ? n8 >= -n6 && n8 <= n6 : false;
    }

    public void c(g g2) {
        int n2 = (int)g2.aU >> 4;
        int n3 = (int)g2.aW >> 4;
        double d2 = g2.d - g2.aU;
        double d3 = g2.e - g2.aW;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 >= 64.0) {
            int n4 = (int)g2.d >> 4;
            int n5 = (int)g2.e >> 4;
            int n6 = this.j;
            int n7 = n2 - n4;
            int n8 = n3 - n5;
            if (n7 != 0 || n8 != 0) {
                for (int i2 = n2 - n6; i2 <= n2 + n6; ++i2) {
                    for (int i3 = n3 - n6; i3 <= n3 + n6; ++i3) {
                        a a2;
                        if (!this.a(i2, i3, n4, n5, n6)) {
                            this.c(i2, i3).a(g2);
                        }
                        if (this.a(i2 - n7, i3 - n8, n2, n3, n6) || (a2 = this.b(i2 - n7, i3 - n8)) == null) continue;
                        a2.b(g2);
                    }
                }
                g2.d = g2.aU;
                g2.e = g2.aW;
                this.e();
            }
        }
    }

    public boolean a(g g2, int n2, int n3) {
        a a2 = this.b(n2, n3);
        return a2 != null && a2.d(g2) && a2.e();
    }

    public void a(int n2) {
        if ((n2 = n.a(n2, 3, 32)) != this.j) {
            int n3 = n2 - this.j;
            for (g g2 : ov.a((Iterable)this.d)) {
                int n4;
                int n5;
                int n6 = (int)g2.aU >> 4;
                int n7 = (int)g2.aW >> 4;
                if (n3 > 0) {
                    for (n5 = n6 - n2; n5 <= n6 + n2; ++n5) {
                        for (n4 = n7 - n2; n4 <= n7 + n2; ++n4) {
                            a a2 = this.c(n5, n4);
                            if (a2.d(g2)) continue;
                            a2.a(g2);
                        }
                    }
                    continue;
                }
                for (n5 = n6 - this.j; n5 <= n6 + this.j; ++n5) {
                    for (n4 = n7 - this.j; n4 <= n7 + this.j; ++n4) {
                        if (this.a(n5, n4, n6, n7, n2)) continue;
                        this.c(n5, n4).b(g2);
                    }
                }
            }
            this.j = n2;
            this.e();
        }
    }

    private void e() {
        this.l = true;
        this.m = true;
    }

    public static int b(int n2) {
        return n2 * 16 - 16;
    }

    private static long d(int n2, int n3) {
        return (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
    }

    public void a(a a2) {
        this.f.add(a2);
    }

    public void b(a a2) {
        m m2 = a2.a();
        long l2 = net.minecraft.c.b.j.d(m2.a, m2.b);
        a2.c();
        this.e.a(l2);
        this.i.remove(a2);
        this.f.remove(a2);
        this.g.remove(a2);
        this.h.remove(a2);
        k k2 = a2.f();
        if (k2 != null) {
            this.a().ac().a(k2);
        }
    }

    static /* synthetic */ cm d() {
        return a;
    }
}

