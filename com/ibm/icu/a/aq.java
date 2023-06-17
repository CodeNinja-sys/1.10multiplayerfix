/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.util.VersionInfo;
import com.ibm.icu.util.dv;
import java.util.MissingResourceException;

public final class aq {
    private static final String a = "icuver";
    private static final String b = "DataVersion";

    public static VersionInfo a() {
        dv dv2 = null;
        try {
            dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", a, bc.n);
            dv2 = dv2.l(b);
        }
        catch (MissingResourceException missingResourceException) {
            return null;
        }
        return VersionInfo.a(dv2.A());
    }
}

