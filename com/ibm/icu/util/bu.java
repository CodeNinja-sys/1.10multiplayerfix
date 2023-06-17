/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.eq;
import com.ibm.icu.a.es;
import com.ibm.icu.util.az;
import com.ibm.icu.util.bv;
import com.ibm.icu.util.bw;
import com.ibm.icu.util.bx;
import com.ibm.icu.util.dn;

public class bu
implements az {
    bx a = new bx(bv.a);
    bx b = new bx(bv.b);
    bx c = new bx(bv.c);
    private boolean d = false;

    public double a(dn dn2, dn dn3, dn dn4, dn dn5) {
        double d2 = 0.0;
        d2 += this.a.a(dn2, dn3, dn2.f(), dn3.f(), dn4, dn5, dn4.f(), dn5.f());
        d2 += this.b.a(dn2, dn3, dn2.g(), dn3.g(), dn4, dn5, dn4.g(), dn5.g());
        d2 += this.c.a(dn2, dn3, dn2.h(), dn3.h(), dn4, dn5, dn4.h(), dn5.h());
        if (!dn2.i().equals(dn4.i())) {
            d2 += 1.0;
        }
        if (d2 < 0.0) {
            d2 = 0.0;
        } else if (d2 > 1.0) {
            d2 = 1.0;
        }
        return 1.0 - d2;
    }

    private bu a(String string, String string2, int n2) {
        return this.a(string, string2, n2, false, null);
    }

    public bu a(String string, String string2, int n2, String string3) {
        return this.a(string, string2, n2, false, string3);
    }

    public bu a(String string, String string2, int n2, boolean bl2) {
        return this.a(string, string2, n2, bl2, null);
    }

    private bu a(String string, String string2, int n2, boolean bl2, String string3) {
        bw bw2;
        bv bv2;
        double d2 = 1.0 - (double)n2 / 100.0;
        bw bw3 = new bw(string);
        bv bv3 = bw3.a();
        if (bv3 != (bv2 = (bw2 = new bw(string2)).a())) {
            throw new IllegalArgumentException();
        }
        es es2 = eq.a(bw3, bw2, d2);
        es es3 = bl2 ? null : eq.a(bw2, bw3, d2);
        switch (bv3) {
            case a: {
                String string4 = bw3.b();
                String string5 = bw2.b();
                this.a.a(string4, string5, es2);
                if (bl2) break;
                this.a.a(string5, string4, es3);
                break;
            }
            case b: {
                String string6 = bw3.c();
                String string7 = bw2.c();
                this.b.a(string6, string7, es2);
                if (bl2) break;
                this.b.a(string7, string6, es3);
                break;
            }
            case c: {
                String string8 = bw3.d();
                String string9 = bw2.d();
                this.c.a(string8, string9, es2);
                if (bl2) break;
                this.c.a(string9, string8, es3);
            }
        }
        return this;
    }

    public bu a() {
        try {
            bu bu2 = (bu)this.clone();
            bu2.a = this.a.a();
            bu2.b = this.b.a();
            bu2.c = this.c.a();
            bu2.d = false;
            return bu2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalArgumentException(cloneNotSupportedException);
        }
    }

    public bu b() {
        return this;
    }

    public boolean f() {
        return this.d;
    }

    public /* synthetic */ Object i() {
        return this.a();
    }

    public /* synthetic */ Object j() {
        return this.b();
    }

    static /* synthetic */ bu a(bu bu2, String string, String string2, int n2) {
        return bu2.a(string, string2, n2);
    }

    static /* synthetic */ bu a(bu bu2, String string, String string2, int n2, boolean bl2, String string3) {
        return bu2.a(string, string2, n2, bl2, string3);
    }
}

