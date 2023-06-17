/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.util.Enumeration;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ce
extends ResourceBundle {
    private String[] a;
    private Locale b;
    private ResourceBundle[] c;

    public ce(String[] arrstring, Locale locale) {
        this.a = arrstring;
        this.b = locale;
        this.c = new ResourceBundle[arrstring.length];
    }

    protected Object handleGetObject(String string) {
        Object object = null;
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            block3: {
                this.a(i2);
                try {
                    object = this.c[i2].getObject(string);
                }
                catch (MissingResourceException missingResourceException) {
                    if (i2 != this.c.length - 1) break block3;
                    throw missingResourceException;
                }
            }
            if (object != null) break;
        }
        return object;
    }

    public Enumeration getKeys() {
        int n2 = this.c.length - 1;
        this.a(n2);
        return this.c[n2].getKeys();
    }

    private void a(int n2) {
        block9: {
            if (this.c[n2] == null) {
                boolean bl2 = false;
                try {
                    this.c[n2] = ResourceBundle.getBundle(this.a[n2], this.b);
                    if (this.c[n2].getLocale().equals(this.b)) {
                        return;
                    }
                    if (this.b.getCountry().length() != 0 && n2 != this.c.length - 1) {
                        bl2 = true;
                    }
                }
                catch (MissingResourceException missingResourceException) {
                    if (n2 == this.c.length - 1) {
                        throw missingResourceException;
                    }
                    bl2 = true;
                }
                if (bl2) {
                    Locale locale = new Locale("xx", this.b.getCountry(), this.b.getVariant());
                    try {
                        this.c[n2] = ResourceBundle.getBundle(this.a[n2], locale);
                    }
                    catch (MissingResourceException missingResourceException) {
                        if (this.c[n2] != null) break block9;
                        throw missingResourceException;
                    }
                }
            }
        }
    }
}

