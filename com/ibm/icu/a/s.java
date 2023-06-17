/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.util.MissingResourceException;

public class s {
    private static aj a = new ew();
    private static final String b = "calendar";
    private static final String c = "gregorian";

    public static String a(dn dn2) {
        String string = null;
        string = dn2.j(b);
        if (string != null) {
            return string;
        }
        String string2 = dn2.k();
        string = (String)a.a(string2);
        if (string != null) {
            return string;
        }
        dn dn3 = dn.a(dn2.toString());
        string = dn3.j(b);
        if (string == null) {
            Object object;
            String string3 = dn3.h();
            if (string3.length() == 0) {
                object = dn.j(dn3);
                string3 = ((dn)object).h();
            }
            try {
                object = dv.b("com/ibm/icu/impl/data/icudt51b", "supplementalData", bc.n);
                dv dv2 = ((dv)object).l("calendarPreferenceData");
                dv dv3 = null;
                try {
                    dv3 = dv2.l(string3);
                }
                catch (MissingResourceException missingResourceException) {
                    dv3 = dv2.l("001");
                }
                string = dv3.j(0);
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (string == null) {
                string = c;
            }
        }
        a.a(string2, string);
        return string;
    }
}

