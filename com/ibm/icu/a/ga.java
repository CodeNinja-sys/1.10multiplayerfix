/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.ft;
import com.ibm.icu.a.gb;
import com.ibm.icu.d.ks;
import java.util.MissingResourceException;

class ga
extends gb {
    private String a;
    private static final ga b = new ga(null, null);

    public static ga a(bc bc2, String string, String string2) {
        if (bc2 == null || string == null || string.length() == 0) {
            return b;
        }
        String[] arrstring = ga.b(bc2, string);
        String string3 = null;
        bc bc3 = null;
        try {
            bc3 = bc2.b(string);
            string3 = bc3.f("ec");
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        if (string3 == null) {
            string3 = ft.c(string2);
        }
        if (string3 == null && arrstring == null) {
            return b;
        }
        return new ga(arrstring, string3);
    }

    public String a(ks ks2) {
        if (ks2 == ks.g) {
            return this.a;
        }
        return super.a(ks2);
    }

    private ga(String[] arrstring, String string) {
        super(arrstring);
        this.a = string;
    }
}

