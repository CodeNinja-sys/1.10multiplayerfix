/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c.a;

import com.a.a.b.cm;
import com.a.a.c.an;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.f;
import net.minecraft.g.c.a.g;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.t;

public class h {
    private final cm[][][] a;
    private final int b;
    private final int c;
    private final int d;

    public h(cm[][][] arrcm) {
        this.a = arrcm;
        this.b = arrcm.length;
        if (this.b > 0) {
            this.c = arrcm[0].length;
            this.d = this.c > 0 ? arrcm[0][0].length : 0;
        } else {
            this.c = 0;
            this.d = 0;
        }
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    private f a(b b2, ad ad2, ad ad3, an an2) {
        for (int i2 = 0; i2 < this.d; ++i2) {
            for (int i3 = 0; i3 < this.c; ++i3) {
                for (int i4 = 0; i4 < this.b; ++i4) {
                    if (this.a[i4][i3][i2].a((a)an2.c(h.a(b2, ad2, ad3, i2, i3, i4)))) continue;
                    return null;
                }
            }
        }
        return new f(b2, ad2, ad3, an2, this.d, this.c, this.b);
    }

    public f a(k k2, b b2) {
        an an2 = h.a(k2, false);
        int n2 = Math.max(Math.max(this.d, this.c), this.b);
        for (b b3 : net.minecraft.u.b.b.a(b2, b2.a(n2 - 1, n2 - 1, n2 - 1))) {
            for (ad ad2 : ad.values()) {
                for (ad ad3 : ad.values()) {
                    f f2;
                    if (ad3 == ad2 || ad3 == ad2.e() || (f2 = this.a(b3, ad2, ad3, an2)) == null) continue;
                    return f2;
                }
            }
        }
        return null;
    }

    public static an a(k k2, boolean bl2) {
        return com.a.a.c.f.a().a(new g(k2, bl2));
    }

    protected static b a(b b2, ad ad2, ad ad3, int n2, int n3, int n4) {
        if (ad2 != ad3 && ad2 != ad3.e()) {
            t t2 = new t(ad2.h(), ad2.i(), ad2.j());
            t t3 = new t(ad3.h(), ad3.i(), ad3.j());
            t t4 = t2.d(t3);
            return b2.a(t3.cy_() * -n3 + t4.cy_() * n2 + t2.cy_() * n4, t3.k() * -n3 + t4.k() * n2 + t2.k() * n4, t3.l() * -n3 + t4.l() * n2 + t2.l() * n4);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }
}

