/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.as;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ce;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.gs;
import com.ibm.icu.d.gt;
import com.ibm.icu.d.gw;
import com.ibm.icu.d.gx;
import com.ibm.icu.util.aj;
import com.ibm.icu.util.dn;
import java.util.Locale;
import java.util.MissingResourceException;

class gv
extends gt {
    private static as a = new gx();

    gv() {
    }

    Locale[] a() {
        if (a.j()) {
            return bc.f();
        }
        return a.a();
    }

    dn[] b() {
        if (a.j()) {
            return bc.e();
        }
        return a.b();
    }

    Object a(gs gs2) {
        return a.a(new gw(gs2));
    }

    boolean a(Object object) {
        return a.b((ce)object);
    }

    gq a(dn dn2, int n2) {
        dn[] arrdn = new dn[1];
        gq gq2 = (gq)a.a(dn2, n2, arrdn);
        if (gq2 == null) {
            throw new MissingResourceException("Unable to construct NumberFormat", "", "");
        }
        gq2 = (gq)gq2.clone();
        if (n2 == 1 || n2 == 5 || n2 == 6) {
            gq2.a(aj.a(dn2));
        }
        dn dn3 = arrdn[0];
        gq2.a(dn3, dn3);
        return gq2;
    }
}

