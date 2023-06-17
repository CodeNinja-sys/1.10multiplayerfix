/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.au;
import com.ibm.icu.a.aw;
import com.ibm.icu.a.cc;
import com.ibm.icu.a.ce;
import com.ibm.icu.a.cf;
import com.ibm.icu.a.dg;
import com.ibm.icu.util.dn;
import java.util.Locale;
import java.util.Set;

public class as
extends cc {
    private dn b;
    private String c;

    public as() {
    }

    public as(String string) {
        super(string);
    }

    public Object a(dn dn2) {
        return this.a(dn2, -1, null);
    }

    public Object a(dn dn2, int n2) {
        return this.a(dn2, n2, null);
    }

    public Object a(dn dn2, dn[] arrdn) {
        return this.a(dn2, -1, arrdn);
    }

    public Object a(dn dn2, int n2, dn[] arrdn) {
        cf cf2 = this.b(dn2, n2);
        if (arrdn == null) {
            return this.a(cf2);
        }
        String[] arrstring = new String[1];
        Object object = this.a(cf2, arrstring);
        if (object != null) {
            int n3 = arrstring[0].indexOf("/");
            if (n3 >= 0) {
                arrstring[0] = arrstring[0].substring(n3 + 1);
            }
            arrdn[0] = new dn(arrstring[0]);
        }
        return object;
    }

    public ce a(Object object, dn dn2) {
        return this.a(object, dn2, -1, true);
    }

    public ce a(Object object, dn dn2, boolean bl2) {
        return this.a(object, dn2, -1, bl2);
    }

    public ce a(Object object, dn dn2, int n2) {
        return this.a(object, dn2, n2, true);
    }

    public ce a(Object object, dn dn2, int n2, boolean bl2) {
        aw aw2 = new aw(object, dn2, n2, bl2);
        return this.a(aw2);
    }

    public Locale[] a() {
        Set set = this.e();
        Locale[] arrlocale = new Locale[set.size()];
        int n2 = 0;
        for (String string : set) {
            Locale locale = dg.a(string);
            arrlocale[n2++] = locale;
        }
        return arrlocale;
    }

    public dn[] b() {
        Set set = this.e();
        dn[] arrdn = new dn[set.size()];
        int n2 = 0;
        for (String string : set) {
            arrdn[n2++] = new dn(string);
        }
        return arrdn;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c() {
        dn dn2 = dn.b();
        if (dn2 != this.b) {
            as as2 = this;
            synchronized (as2) {
                if (dn2 != this.b) {
                    this.b = dn2;
                    this.c = dn2.k();
                    this.m();
                }
            }
        }
        return this.c;
    }

    public cf a(String string) {
        return au.a(string, this.c());
    }

    public cf a(String string, int n2) {
        return au.a(string, this.c(), n2);
    }

    public cf b(dn dn2, int n2) {
        return au.a(dn2, this.c(), n2);
    }
}

