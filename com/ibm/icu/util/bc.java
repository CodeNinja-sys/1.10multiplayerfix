/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.ew;
import com.ibm.icu.util.ba;
import com.ibm.icu.util.bb;
import com.ibm.icu.util.be;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.util.MissingResourceException;

class bc {
    private final aj a = new ew();

    private bc() {
    }

    public ba a(dn dn2) {
        ba ba2 = (ba)this.a.a(dn2);
        if (ba2 == null) {
            ba2 = bc.b(dn2);
            if (ba2 == null) {
                dn dn3 = dn2.j();
                ba2 = dn3 == null ? ba.a() : this.a(dn3);
            }
            this.a.a(dn2, ba2);
        }
        return ba2;
    }

    private static ba b(dn dn2) {
        dv dv2 = dv.c("com/ibm/icu/impl/data/icudt51b", "genderList", com.ibm.icu.a.bc.n, true);
        dv dv3 = dv2.l("genderList");
        try {
            return new ba(be.a(dv3.getString(dn2.toString())));
        }
        catch (MissingResourceException missingResourceException) {
            return null;
        }
    }

    /* synthetic */ bc(bb bb2) {
        this();
    }
}

