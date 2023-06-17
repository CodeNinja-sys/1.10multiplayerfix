/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.au;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;

public abstract class bi
implements au {
    private String a;
    private au b;
    private static bi[] c = new bi[0];

    public static bi[] a() {
        return bi.a(dn.a(dr.b));
    }

    public static bi[] a(Locale locale) {
        return bi.a(dn.a(locale));
    }

    public static bi[] a(dn dn2) {
        bi[] arrbi = c;
        try {
            dv dv2 = dv.a("com.ibm.icu.impl.data.HolidayBundle", dn2);
            arrbi = (bi[])dv2.getObject("holidays");
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        return arrbi;
    }

    public Date a(Date date) {
        return this.b.a(date);
    }

    public Date a(Date date, Date date2) {
        return this.b.a(date, date2);
    }

    public boolean b(Date date) {
        return this.b.b(date);
    }

    public boolean b(Date date, Date date2) {
        return this.b.b(date, date2);
    }

    protected bi(String string, au au2) {
        this.a = string;
        this.b = au2;
    }

    public String b() {
        return this.b(dn.a(dr.a));
    }

    public String b(Locale locale) {
        return this.b(dn.a(locale));
    }

    public String b(dn dn2) {
        String string = this.a;
        try {
            dv dv2 = dv.a("com.ibm.icu.impl.data.HolidayBundle", dn2);
            string = dv2.getString(this.a);
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        return string;
    }

    public au c() {
        return this.b;
    }

    public void a(au au2) {
        this.b = au2;
    }
}

