/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.df;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;

public class cb {
    public static String a(String string, dn dn2, String string2, String string3) {
        bc bc2 = (bc)dv.b(string, dn2.k());
        return cb.a(bc2, string2, null, string3);
    }

    public static String a(bc bc2, String string, String string2, String string3) {
        String string4 = null;
        try {
            while (true) {
                Object object;
                Object object2;
                bc bc3;
                if ("currency".equals(string2)) {
                    bc3 = bc2.b("Currencies");
                    bc3 = bc3.b(string3);
                    return bc3.j(1);
                }
                bc3 = cb.a(bc2, string);
                if (bc3 == null) {
                    return string3;
                }
                bc bc4 = bc3;
                if (string2 != null) {
                    bc4 = cb.a(bc3, string2);
                }
                if (bc4 != null && (object2 = cb.a(bc4, string3)) != null) {
                    string4 = ((dv)object2).A();
                    break;
                }
                if (string2 == null) {
                    object2 = null;
                    if (string.equals("Countries")) {
                        object2 = df.e(string3);
                    } else if (string.equals("Languages")) {
                        object2 = df.f(string3);
                    }
                    object = cb.a(bc3, (String)object2);
                    if (object != null) {
                        string4 = ((dv)object).A();
                        break;
                    }
                }
                if ((object2 = cb.a(bc3, "Fallback")) == null) {
                    return string3;
                }
                object = ((dv)object2).A();
                if (((String)object).length() == 0) {
                    object = "root";
                }
                if (((String)object).equals(bc3.i().l())) {
                    return string3;
                }
                bc2 = (bc)dv.b(bc2.h(), (String)object);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string4 != null && string4.length() > 0 ? string4 : string3;
    }

    private static bc a(bc bc2, String string) {
        return bc.a(string, bc2, null);
    }
}

