/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import java.util.ArrayList;
import java.util.MissingResourceException;

public class r {
    private bc a;
    private String b;
    private String c;

    public r(dn dn2, String string) {
        this((bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2), string);
    }

    public r(bc bc2, String string) {
        this.a = bc2;
        if (string == null || string.equals("") || string.equals("gregorian")) {
            this.b = "gregorian";
            this.c = null;
        } else {
            this.b = string;
            this.c = "gregorian";
        }
    }

    public bc a(String string) {
        try {
            return this.a.b("calendar/" + this.b + "/" + string);
        }
        catch (MissingResourceException missingResourceException) {
            if (this.c != null) {
                return this.a.b("calendar/" + this.c + "/" + string);
            }
            throw missingResourceException;
        }
    }

    public bc a(String string, String string2) {
        try {
            return this.a.b("calendar/" + this.b + "/" + string + "/format/" + string2);
        }
        catch (MissingResourceException missingResourceException) {
            if (this.c != null) {
                return this.a.b("calendar/" + this.c + "/" + string + "/format/" + string2);
            }
            throw missingResourceException;
        }
    }

    public bc a(String string, String string2, String string3) {
        try {
            return this.a.b("calendar/" + this.b + "/" + string + "/" + string2 + "/" + string3);
        }
        catch (MissingResourceException missingResourceException) {
            if (this.c != null) {
                return this.a.b("calendar/" + this.c + "/" + string + "/" + string2 + "/" + string3);
            }
            throw missingResourceException;
        }
    }

    public bc a(String string, String string2, String string3, String string4) {
        try {
            return this.a.b("calendar/" + this.b + "/" + string + "/" + string2 + "/" + string3 + "/" + string4);
        }
        catch (MissingResourceException missingResourceException) {
            if (this.c != null) {
                return this.a.b("calendar/" + this.c + "/" + string + "/" + string2 + "/" + string3 + "/" + string4);
            }
            throw missingResourceException;
        }
    }

    public String[] b(String string) {
        return this.a(string).u();
    }

    public String[] b(String string, String string2) {
        return this.a(string, string2).u();
    }

    public String[] b(String string, String string2, String string3) {
        return this.a(string, string2, string3).u();
    }

    public String[] c(String string) {
        bc bc2 = this.a("eras/" + string);
        return bc2.u();
    }

    public String[] a() {
        bc bc2 = this.a("DateTimePatterns");
        ArrayList<String> arrayList = new ArrayList<String>();
        dy dy2 = bc2.D();
        while (dy2.d()) {
            dv dv2 = dy2.a();
            int n2 = dv2.l();
            switch (n2) {
                case 0: {
                    arrayList.add(dv2.A());
                    break;
                }
                case 8: {
                    String[] arrstring = dv2.u();
                    arrayList.add(arrstring[0]);
                }
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] b() {
        bc bc2 = this.a("DateTimePatterns");
        ArrayList<String> arrayList = new ArrayList<String>();
        dy dy2 = bc2.D();
        while (dy2.d()) {
            dv dv2 = dy2.a();
            int n2 = dv2.l();
            switch (n2) {
                case 0: {
                    arrayList.add(null);
                    break;
                }
                case 8: {
                    String[] arrstring = dv2.u();
                    arrayList.add(arrstring[1]);
                }
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public dn c() {
        return this.a.i();
    }
}

