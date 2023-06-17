/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.dz;
import com.ibm.icu.a.ex;
import com.ibm.icu.a.je;
import com.ibm.icu.a.jf;
import com.ibm.icu.util.dv;
import java.util.MissingResourceException;

class jh
extends ex {
    private jh() {
    }

    protected dz a(String string, String string2) {
        dz dz2 = null;
        try {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "zoneinfo64", bc.n);
            dv dv3 = je.a(dv2, string2);
            if (dv3 != null) {
                dz2 = new dz(dv2, dv3, string2);
                dz2.g();
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        return dz2;
    }

    protected /* synthetic */ Object b(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }

    /* synthetic */ jh(jf jf2) {
        this();
    }
}

