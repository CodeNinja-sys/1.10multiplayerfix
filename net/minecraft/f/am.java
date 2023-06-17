/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.q.g.a.h;
import net.minecraft.q.g.a.u;
import net.minecraft.q.k;
import net.minecraft.q.m;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.u.b.a;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.u.b.t;
import net.minecraft.x.d.b.j;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class am
extends ap
implements aw {
    private static final d a = org.apache.logging.log4j.c.c();
    private long b;
    private int c;
    private net.minecraft.u.b.b d;
    private boolean e;

    @Override
    public e a(e e2) {
        super.a(e2);
        e2.a("Age", this.b);
        if (this.d != null) {
            e2.a("ExitPortal", net.minecraft.e.u.a(this.d));
        }
        if (this.e) {
            e2.a("ExactTeleport", this.e);
        }
        return e2;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.b = e2.i("Age");
        if (e2.b("ExitPortal", 10)) {
            this.d = net.minecraft.e.u.c(e2.o("ExitPortal"));
        }
        this.e = e2.p("ExactTeleport");
    }

    @Override
    public double bM_() {
        return 65536.0;
    }

    @Override
    public void a() {
        List list;
        boolean bl2 = this.g();
        boolean bl3 = this.h();
        ++this.b;
        if (bl3) {
            --this.c;
        } else if (!this.k.C && !(list = this.k.a(net.minecraft.w.n.class, new a(this.D()))).isEmpty()) {
            this.a((net.minecraft.w.n)list.get(0));
        }
        if (bl2 != this.g() || bl3 != this.h()) {
            this.C();
        }
    }

    public boolean g() {
        return this.b < 200L;
    }

    public boolean h() {
        return this.c > 0;
    }

    public float i() {
        return net.minecraft.u.b.n.a((float)this.b / 200.0f, 0.0f, 1.0f);
    }

    public float j() {
        return 1.0f - net.minecraft.u.b.n.a((float)this.c / 20.0f, 0.0f, 1.0f);
    }

    @Override
    public j bJ_() {
        return new j(this.l, 8, this.d());
    }

    @Override
    public e d() {
        return this.a(new e());
    }

    public void k() {
        if (!this.k.C) {
            this.c = 20;
            this.k.c(this.D(), this.E(), 1, 0);
            this.C();
        }
    }

    @Override
    public boolean c(int n2, int n3) {
        if (n2 == 1) {
            this.c = 20;
            return true;
        }
        return super.c(n2, n3);
    }

    public void a(net.minecraft.w.n n2) {
        if (!this.k.C && !this.h()) {
            this.c = 100;
            if (this.d == null && this.k.q instanceof m) {
                this.p();
            }
            if (this.d != null) {
                net.minecraft.u.b.b b2 = this.e ? this.d : this.o();
                n2.d((double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5);
            }
            this.k();
        }
    }

    private net.minecraft.u.b.b o() {
        net.minecraft.u.b.b b2 = am.a(this.k, this.d, 5, false);
        a.a("Best exit position for portal at {} is {}", this.d, b2);
        return b2.b();
    }

    private void p() {
        s s2 = new s(this.D().cy_(), 0.0, this.D().l()).a();
        s s3 = s2.a(1024.0);
        int n2 = 16;
        while (am.a(this.k, s3).g() > 0 && n2-- > 0) {
            a.a("Skipping backwards past nonempty chunk at {}", s3);
            s3 = s3.e(s2.a(-16.0));
        }
        n2 = 16;
        while (am.a(this.k, s3).g() == 0 && n2-- > 0) {
            a.a("Skipping forward past empty chunk at {}", s3);
            s3 = s3.e(s2.a(16.0));
        }
        a.a("Found chunk at {}", s3);
        net.minecraft.q.f.k k2 = am.a(this.k, s3);
        this.d = am.a(k2);
        if (this.d == null) {
            this.d = new net.minecraft.u.b.b(s3.b + 0.5, 75.0, s3.d + 0.5);
            a.a("Failed to find suitable block, settling on {}", this.d);
            new h().a(this.k, new Random(this.d.h()), this.d);
        } else {
            a.a("Found block at {}", this.d);
        }
        this.d = am.a(this.k, this.d, 16, true);
        a.a("Creating portal at {}", this.d);
        this.d = this.d.a(10);
        this.a(this.d);
        this.C();
    }

    private static net.minecraft.u.b.b a(k k2, net.minecraft.u.b.b b2, int n2, boolean bl2) {
        t t2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            block1: for (int i3 = -n2; i3 <= n2; ++i3) {
                if (i2 == 0 && i3 == 0 && !bl2) continue;
                for (int i4 = 255; i4 > (t2 == null ? 0 : t2.k()); --i4) {
                    net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(b2.cy_() + i2, i4, b2.l() + i3);
                    b b4 = k2.n(b3);
                    if (!b4.n() || !bl2 && b4.c() == p.h) continue;
                    t2 = b3;
                    continue block1;
                }
            }
        }
        return t2 == null ? b2 : t2;
    }

    private static net.minecraft.q.f.k a(k k2, s s2) {
        return k2.a(net.minecraft.u.b.n.c(s2.b / 16.0), net.minecraft.u.b.n.c(s2.d / 16.0));
    }

    private static net.minecraft.u.b.b a(net.minecraft.q.f.k k2) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(k2.b * 16, 30, k2.c * 16);
        int n2 = k2.g() + 16 - 1;
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(k2.b * 16 + 16 - 1, n2, k2.c * 16 + 16 - 1);
        net.minecraft.u.b.b b4 = null;
        double d2 = 0.0;
        for (net.minecraft.u.b.b b5 : net.minecraft.u.b.b.a(b2, b3)) {
            b b6 = k2.a(b5);
            if (b6.c() != p.bH || k2.a(b5.a(1)).n() || k2.a(b5.a(2)).n()) continue;
            double d3 = b5.f(0.0, 0.0, 0.0);
            if (b4 != null && !(d3 < d2)) continue;
            b4 = b5;
            d2 = d3;
        }
        return b4;
    }

    private void a(net.minecraft.u.b.b b2) {
        new u().a(this.k, new Random(), b2);
        ap ap2 = this.k.q(b2);
        if (ap2 instanceof am) {
            am am2 = (am)ap2;
            am2.d = new net.minecraft.u.b.b(this.D());
            am2.C();
        } else {
            a.f("Couldn't save exit portal at {}", b2);
        }
    }

    public boolean a(ad ad2) {
        return this.E().v().c(this.k, this.D(), ad2);
    }

    public int n() {
        int n2 = 0;
        for (ad ad2 : ad.values()) {
            n2 += this.a(ad2) ? 1 : 0;
        }
        return n2;
    }
}

