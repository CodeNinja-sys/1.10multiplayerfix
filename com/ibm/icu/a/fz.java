/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.af;
import com.ibm.icu.a.ex;
import com.ibm.icu.a.fu;
import com.ibm.icu.a.fw;
import com.ibm.icu.util.dv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.MissingResourceException;

class fz
extends ex {
    private fz() {
    }

    protected List a(String string, String string2) {
        List list = null;
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "metaZones");
        dv dv3 = dv2.l("metazoneInfo");
        String string3 = string2.replace('/', ':');
        try {
            dv dv4 = dv3.l(string3);
            list = new ArrayList(dv4.w());
            for (int i2 = 0; i2 < dv4.w(); ++i2) {
                dv dv5 = dv4.k(i2);
                String string4 = dv5.j(0);
                String string5 = "1970-01-01 00:00";
                String string6 = "9999-12-31 23:59";
                if (dv5.w() == 3) {
                    string5 = dv5.j(1);
                    string6 = dv5.j(2);
                }
                long l2 = fz.a(string5);
                long l3 = fz.a(string6);
                list.add(new fw(string4, l2, l3));
            }
        }
        catch (MissingResourceException missingResourceException) {
            list = Collections.emptyList();
        }
        return list;
    }

    private static long a(String string) {
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        for (n3 = 0; n3 <= 3; ++n3) {
            n2 = string.charAt(n3) - 48;
            if (n2 < 0 || n2 >= 10) {
                throw new IllegalArgumentException("Bad year");
            }
            n4 = 10 * n4 + n2;
        }
        for (n3 = 5; n3 <= 6; ++n3) {
            n2 = string.charAt(n3) - 48;
            if (n2 < 0 || n2 >= 10) {
                throw new IllegalArgumentException("Bad month");
            }
            n5 = 10 * n5 + n2;
        }
        for (n3 = 8; n3 <= 9; ++n3) {
            n2 = string.charAt(n3) - 48;
            if (n2 < 0 || n2 >= 10) {
                throw new IllegalArgumentException("Bad day");
            }
            n6 = 10 * n6 + n2;
        }
        for (n3 = 11; n3 <= 12; ++n3) {
            n2 = string.charAt(n3) - 48;
            if (n2 < 0 || n2 >= 10) {
                throw new IllegalArgumentException("Bad hour");
            }
            n7 = 10 * n7 + n2;
        }
        for (n3 = 14; n3 <= 15; ++n3) {
            n2 = string.charAt(n3) - 48;
            if (n2 < 0 || n2 >= 10) {
                throw new IllegalArgumentException("Bad minute");
            }
            n8 = 10 * n8 + n2;
        }
        long l2 = af.a(n4, n5 - 1, n6) * 86400000L + (long)n7 * 3600000L + (long)n8 * 60000L;
        return l2;
    }

    protected /* synthetic */ Object b(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }

    /* synthetic */ fz(fu fu2) {
        this();
    }
}

