/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.d.ks;
import java.util.MissingResourceException;

class gb {
    private static final gb a = new gb(null);
    private String[] b;
    private static final String[] c = new String[]{"lg", "ls", "ld", "sg", "ss", "sd"};

    protected gb(String[] arrstring) {
        this.b = arrstring;
    }

    public static gb a(bc bc2, String string) {
        String[] arrstring = gb.b(bc2, string);
        if (arrstring == null) {
            return a;
        }
        return new gb(arrstring);
    }

    public String a(ks ks2) {
        if (this.b == null) {
            return null;
        }
        String string = null;
        switch (ks2) {
            case a: {
                string = this.b[0];
                break;
            }
            case b: {
                string = this.b[1];
                break;
            }
            case c: {
                string = this.b[2];
                break;
            }
            case d: {
                string = this.b[3];
                break;
            }
            case e: {
                string = this.b[4];
                break;
            }
            case f: {
                string = this.b[5];
                break;
            }
            case g: {
                string = null;
            }
        }
        return string;
    }

    protected static String[] b(bc bc2, String string) {
        if (bc2 == null || string == null || string.length() == 0) {
            return null;
        }
        bc bc3 = null;
        try {
            bc3 = bc2.b(string);
        }
        catch (MissingResourceException missingResourceException) {
            return null;
        }
        boolean bl2 = true;
        String[] arrstring = new String[c.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            try {
                arrstring[i2] = bc3.f(c[i2]);
                bl2 = false;
                continue;
            }
            catch (MissingResourceException missingResourceException) {
                arrstring[i2] = null;
            }
        }
        if (bl2) {
            return null;
        }
        return arrstring;
    }
}

