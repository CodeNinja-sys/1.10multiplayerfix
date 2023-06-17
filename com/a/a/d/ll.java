/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afm;
import com.a.a.d.lf;
import com.a.a.d.yl;
import com.a.a.d.yr;

public class ll {
    private final yr a = afm.c();

    public ll a(yl yl2) {
        if (yl2.j()) {
            throw new IllegalArgumentException("range must not be empty, but was " + yl2);
        }
        if (!this.a.k().c(yl2)) {
            for (yl yl3 : this.a.l()) {
                cl.a(!yl3.b(yl2) || yl3.c(yl2).j(), "Ranges may not overlap, but received %s and %s", new Object[]{yl3, yl2});
            }
            throw new AssertionError((Object)"should have thrown an IAE above");
        }
        this.a.a(yl2);
        return this;
    }

    public ll a(yr yr2) {
        for (yl yl2 : yr2.l()) {
            this.a(yl2);
        }
        return this;
    }

    public lf a() {
        return lf.d(this.a);
    }
}

