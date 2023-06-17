/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.g.hn;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.b;

public class cs {
    private final k a;
    private final ae b;
    private final ad c;
    private final ad d;
    private int e;
    private b f;
    private int g;
    private int h;

    public cs(k k2, b b2, ae ae2) {
        this.a = k2;
        this.b = ae2;
        if (ae2 == ae.a) {
            this.d = ad.f;
            this.c = ad.e;
        } else {
            this.d = ad.c;
            this.c = ad.d;
        }
        b b3 = b2;
        while (b2.k() > b3.k() - 21 && b2.k() > 0 && this.a(k2.n(b2.c()).c())) {
            b2 = b2.c();
        }
        int n2 = this.a(b2, this.d) - 1;
        if (n2 >= 0) {
            this.f = b2.a(this.d, n2);
            this.h = this.a(this.f, this.c);
            if (this.h < 2 || this.h > 21) {
                this.f = null;
                this.h = 0;
            }
        }
        if (this.f != null) {
            this.g = this.c();
        }
    }

    protected int a(b b2, ad ad2) {
        Object object;
        int n2;
        for (n2 = 0; n2 < 22; ++n2) {
            object = b2.a(ad2, n2);
            if (!this.a(this.a.n((b)object).c()) || this.a.n(((b)object).c()).c() != p.Z) break;
        }
        return (object = this.a.n(b2.a(ad2, n2)).c()) == p.Z ? n2 : 0;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    protected int c() {
        int n2;
        this.g = 0;
        block0: while (this.g < 21) {
            for (n2 = 0; n2 < this.h; ++n2) {
                b b2 = this.f.a(this.c, n2).a(this.g);
                cn cn2 = this.a.n(b2).c();
                if (!this.a(cn2)) break block0;
                if (cn2 == p.aY) {
                    ++this.e;
                }
                if (n2 == 0 ? (cn2 = this.a.n(b2.a(this.d)).c()) != p.Z : n2 == this.h - 1 && (cn2 = this.a.n(b2.a(this.c)).c()) != p.Z) break block0;
            }
            ++this.g;
        }
        for (n2 = 0; n2 < this.h; ++n2) {
            if (this.a.n(this.f.a(this.c, n2).a(this.g)).c() == p.Z) continue;
            this.g = 0;
            break;
        }
        if (this.g <= 21 && this.g >= 3) {
            return this.g;
        }
        this.f = null;
        this.h = 0;
        this.g = 0;
        return 0;
    }

    protected boolean a(cn cn2) {
        return cn2.L == net.minecraft.g.a.h.a || cn2 == p.ab || cn2 == p.aY;
    }

    public boolean d() {
        return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
    }

    public void e() {
        for (int i2 = 0; i2 < this.h; ++i2) {
            b b2 = this.f.a(this.c, i2);
            for (int i3 = 0; i3 < this.g; ++i3) {
                this.a.a(b2.a(i3), p.aY.v().a(hn.a, (Comparable)((Object)this.b)), 2);
            }
        }
    }

    static /* synthetic */ int a(cs cs2) {
        return cs2.e;
    }

    static /* synthetic */ int b(cs cs2) {
        return cs2.h;
    }

    static /* synthetic */ int c(cs cs2) {
        return cs2.g;
    }

    static /* synthetic */ ad d(cs cs2) {
        return cs2.c;
    }

    static /* synthetic */ b e(cs cs2) {
        return cs2.f;
    }
}

