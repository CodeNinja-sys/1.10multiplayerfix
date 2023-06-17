/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.as;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ce;
import com.ibm.icu.util.aj;
import com.ibm.icu.util.an;
import com.ibm.icu.util.aq;
import com.ibm.icu.util.dn;
import java.util.Locale;

final class ap
extends an {
    static final as a = new aq();

    ap() {
    }

    Locale[] b() {
        if (a.j()) {
            return bc.f();
        }
        return a.a();
    }

    dn[] a() {
        if (a.j()) {
            return bc.e();
        }
        return a.b();
    }

    aj a(dn dn2) {
        if (a.j()) {
            return aj.b(dn2);
        }
        aj aj2 = (aj)a.a(dn2);
        return aj2;
    }

    Object a(aj aj2, dn dn2) {
        return a.a((Object)aj2, dn2);
    }

    boolean a(Object object) {
        return a.b((ce)object);
    }
}

