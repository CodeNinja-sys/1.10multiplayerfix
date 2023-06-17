/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.es;
import com.ibm.icu.util.az;
import com.ibm.icu.util.bv;
import com.ibm.icu.util.bw;
import com.ibm.icu.util.dn;
import java.util.LinkedHashSet;

class bx
implements az {
    LinkedHashSet a = new LinkedHashSet();
    final double b;
    final bv c;
    private boolean d = false;

    public bx(bv bv2) {
        this.c = bv2;
        this.b = (double)(1 - (bv2 == bv.a ? 90 : (bv2 == bv.b ? 20 : 4))) / 100.0;
    }

    void a(String string, String string2, es es2) {
        this.a.add(es2);
    }

    double a(dn dn2, dn dn3, String string, String string2, dn dn4, dn dn5, String string3, String string4) {
        double d2;
        boolean bl2 = string.equals(string2);
        boolean bl3 = string3.equals(string4);
        if (!string2.equals(string4)) {
            d2 = this.a(dn3, dn5);
            if (bl2 == bl3) {
                d2 *= 0.75;
            } else if (bl2) {
                d2 *= 0.5;
            }
        } else {
            d2 = bl2 == bl3 ? 0.0 : 0.25 * this.b;
        }
        return d2;
    }

    private double a(dn dn2, dn dn3) {
        for (es es2 : this.a) {
            if (!((bw)es2.a()).a(dn2) || !((bw)es2.b()).a(dn3)) continue;
            return (Double)es2.c();
        }
        return this.b;
    }

    public String toString() {
        return (Object)((Object)this.c) + ", " + this.a;
    }

    public bx a() {
        try {
            bx bx2 = (bx)this.clone();
            bx2.a = (LinkedHashSet)bx2.a.clone();
            bx2.d = false;
            return bx2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalArgumentException(cloneNotSupportedException);
        }
    }

    public bx b() {
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
}

