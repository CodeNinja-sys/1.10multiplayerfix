/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.as;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ce;
import com.ibm.icu.a.s;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.n;
import com.ibm.icu.util.p;
import com.ibm.icu.util.q;
import com.ibm.icu.util.v;
import com.ibm.icu.util.w;
import java.util.Locale;
import java.util.MissingResourceException;

class u
extends q {
    private static as a = new w();

    u() {
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

    n a(dn dn2) {
        dn dn3;
        Object object;
        dn[] arrdn = new dn[1];
        if (dn2.equals(dn.v)) {
            dn2 = dn.v;
        }
        if (dn2.j("calendar") == null) {
            object = s.a(dn2);
            dn3 = dn2.b("calendar", (String)object);
        } else {
            dn3 = dn2;
        }
        object = (n)a.a(dn3, arrdn);
        if (object == null) {
            throw new MissingResourceException("Unable to construct Calendar", "", "");
        }
        object = (n)((n)object).clone();
        return object;
    }

    Object a(p p2) {
        return a.a(new v(p2));
    }

    boolean a(Object object) {
        return a.b((ce)object);
    }
}

