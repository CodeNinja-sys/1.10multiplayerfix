/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.q.ab;
import net.minecraft.q.au;
import net.minecraft.q.b.q;
import net.minecraft.q.f.a;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;

public class at
implements n {
    protected int a;
    protected int b;
    protected net.minecraft.q.f.k[][] c;
    protected boolean d;
    protected k e;

    public at(k k2, net.minecraft.u.b.b b2, net.minecraft.u.b.b b3, int n2) {
        int n3;
        int n4;
        this.e = k2;
        this.a = b2.cy_() - n2 >> 4;
        this.b = b2.l() - n2 >> 4;
        int n5 = b3.cy_() + n2 >> 4;
        int n6 = b3.l() + n2 >> 4;
        this.c = new net.minecraft.q.f.k[n5 - this.a + 1][n6 - this.b + 1];
        this.d = true;
        for (n4 = this.a; n4 <= n5; ++n4) {
            for (n3 = this.b; n3 <= n6; ++n3) {
                this.c[n4 - this.a][n3 - this.b] = k2.a(n4, n3);
            }
        }
        for (n4 = b2.cy_() >> 4; n4 <= b3.cy_() >> 4; ++n4) {
            for (n3 = b2.l() >> 4; n3 <= b3.l() >> 4; ++n3) {
                net.minecraft.q.f.k k3 = this.c[n4 - this.a][n3 - this.b];
                if (k3 == null || k3.c(b2.k(), b3.k())) continue;
                this.d = false;
            }
        }
    }

    @Override
    public boolean N() {
        return this.d;
    }

    @Override
    public ap q(net.minecraft.u.b.b b2) {
        int n2 = (b2.cy_() >> 4) - this.a;
        int n3 = (b2.l() >> 4) - this.b;
        return this.c[n2][n3].a(b2, net.minecraft.q.f.a.a);
    }

    @Override
    public int b(net.minecraft.u.b.b b2, int n2) {
        int n3 = this.b(au.a, b2);
        int n4 = this.b(au.b, b2);
        if (n4 < n2) {
            n4 = n2;
        }
        return n3 << 20 | n4 << 4;
    }

    @Override
    public b n(net.minecraft.u.b.b b2) {
        if (b2.k() >= 0 && b2.k() < 256) {
            net.minecraft.q.f.k k2;
            int n2 = (b2.cy_() >> 4) - this.a;
            int n3 = (b2.l() >> 4) - this.b;
            if (n2 >= 0 && n2 < this.c.length && n3 >= 0 && n3 < this.c[n2].length && (k2 = this.c[n2][n3]) != null) {
                return k2.a(b2);
            }
        }
        return p.a.v();
    }

    @Override
    public q a(net.minecraft.u.b.b b2) {
        int n2 = (b2.cy_() >> 4) - this.a;
        int n3 = (b2.l() >> 4) - this.b;
        return this.c[n2][n3].a(b2, this.e.k());
    }

    private int b(au au2, net.minecraft.u.b.b b2) {
        if (au2 == au.a && this.e.q.n()) {
            return 0;
        }
        if (b2.k() >= 0 && b2.k() < 256) {
            if (this.n(b2).i()) {
                int n2 = 0;
                for (ad ad2 : ad.values()) {
                    int n3 = this.a(au2, b2.a(ad2));
                    if (n3 > n2) {
                        n2 = n3;
                    }
                    if (n2 < 15) continue;
                    return n2;
                }
                return n2;
            }
            int n4 = (b2.cy_() >> 4) - this.a;
            int n5 = (b2.l() >> 4) - this.b;
            return this.c[n4][n5].a(au2, b2);
        }
        return au2.c;
    }

    @Override
    public boolean c(net.minecraft.u.b.b b2) {
        return this.n(b2).d() == h.a;
    }

    public int a(au au2, net.minecraft.u.b.b b2) {
        if (b2.k() >= 0 && b2.k() < 256) {
            int n2 = (b2.cy_() >> 4) - this.a;
            int n3 = (b2.l() >> 4) - this.b;
            return this.c[n2][n3].a(au2, b2);
        }
        return au2.c;
    }

    @Override
    public int a(net.minecraft.u.b.b b2, ad ad2) {
        return this.n(b2).b(this, b2, ad2);
    }

    @Override
    public ab y() {
        return this.e.y();
    }
}

