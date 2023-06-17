/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.eh;
import com.ibm.icu.d.ei;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;

class ej {
    private final aj a = new ew();

    private ej() {
    }

    public eh a(dn dn2) {
        eh eh2 = (eh)this.a.a(dn2);
        if (eh2 == null) {
            eh2 = ej.b(dn2);
            this.a.a(dn2, eh2);
        }
        return eh2;
    }

    private static eh b(dn dn2) {
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        bc2 = bc2.b("listPattern/standard");
        return new eh(bc2.b("2").A(), bc2.b("start").A(), bc2.b("middle").A(), bc2.b("end").A());
    }

    /* synthetic */ ej(ei ei2) {
        this();
    }
}

