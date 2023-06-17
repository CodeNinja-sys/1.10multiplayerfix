/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.b.b;
import com.ibm.icu.d.ku;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.MissingResourceException;

public class gz {
    private String a = "0123456789";
    private int b = 10;
    private boolean c = false;
    private String d = "latn";
    private static aj e = new ew();
    private static aj f = new ew();

    public static gz a(int n2, boolean bl2, String string) {
        return gz.a(null, n2, bl2, string);
    }

    private static gz a(String string, int n2, boolean bl2, String string2) {
        if (n2 < 2) {
            throw new IllegalArgumentException("Invalid radix for numbering system");
        }
        if (!(bl2 || string2.length() == n2 && gz.b(string2))) {
            throw new IllegalArgumentException("Invalid digit string for numbering system");
        }
        gz gz2 = new gz();
        gz2.b = n2;
        gz2.c = bl2;
        gz2.a = string2;
        gz2.d = string;
        return gz2;
    }

    public static gz a(Locale locale) {
        return gz.a(dn.a(locale));
    }

    public static gz a(dn dn2) {
        gz gz2;
        Object object;
        Object object2;
        String[] arrstring = new String[]{"native", "traditional", "finance"};
        Boolean bl2 = true;
        String string = dn2.j("numbers");
        if (string != null) {
            object2 = arrstring;
            int n2 = ((String[])object2).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = object2[i2];
                if (!string.equals(object)) continue;
                bl2 = false;
                break;
            }
        } else {
            string = "default";
            bl2 = false;
        }
        if (bl2.booleanValue()) {
            gz2 = gz.a(string);
            if (gz2 != null) {
                return gz2;
            }
            string = "default";
            bl2 = false;
        }
        if ((gz2 = (gz)e.a((String)(object2 = dn2.k()) + "@numbers=" + string)) != null) {
            return gz2;
        }
        String string2 = string;
        String string3 = null;
        while (!bl2.booleanValue()) {
            try {
                object = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
                object = ((bc)object).b("NumberElements");
                string3 = ((bc)object).f(string);
                bl2 = true;
            }
            catch (MissingResourceException missingResourceException) {
                if (string.equals("native") || string.equals("finance")) {
                    string = "default";
                    continue;
                }
                if (string.equals("traditional")) {
                    string = "native";
                    continue;
                }
                bl2 = true;
            }
        }
        if (string3 != null) {
            gz2 = gz.a(string3);
        }
        if (gz2 == null) {
            gz2 = new gz();
        }
        e.a((String)object2 + "@numbers=" + string2, gz2);
        return gz2;
    }

    public static gz a() {
        return gz.a(dn.a(dr.b));
    }

    public static gz a(String string) {
        boolean bl2;
        int n2;
        String string2;
        gz gz2 = (gz)f.a(string);
        if (gz2 != null) {
            return gz2;
        }
        try {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "numberingSystems");
            dv dv3 = dv2.l("numberingSystems");
            dv dv4 = dv3.l(string);
            string2 = dv4.getString("desc");
            dv dv5 = dv4.l("radix");
            dv dv6 = dv4.l("algorithmic");
            n2 = dv5.x();
            int n3 = dv6.x();
            bl2 = n3 == 1;
        }
        catch (MissingResourceException missingResourceException) {
            return null;
        }
        gz2 = gz.a(string, n2, bl2, string2);
        f.a(string, gz2);
        return gz2;
    }

    public static String[] b() {
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "numberingSystems");
        dv dv3 = dv2.l("numberingSystems");
        ArrayList<String> arrayList = new ArrayList<String>();
        dy dy2 = dv3.D();
        while (dy2.d()) {
            dv dv4 = dy2.a();
            String string = dv4.k();
            arrayList.add(string);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean b(String string) {
        int n2;
        int n3 = 0;
        ku ku2 = ku.b(string);
        ku2.l();
        while ((n2 = ku2.j()) != -1) {
            if (com.ibm.icu.b.b.A(n2)) {
                return false;
            }
            ++n3;
        }
        return n3 == 10;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.d;
    }

    public boolean f() {
        return this.c;
    }
}

