/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.gq;
import com.ibm.icu.util.dn;
import java.util.Locale;
import java.util.Set;

public abstract class gs {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;

    public boolean a() {
        return true;
    }

    public abstract Set b();

    public gq a(dn dn2, int n2) {
        return this.a(dn2.a(), n2);
    }

    public gq a(Locale locale, int n2) {
        return this.a(dn.a(locale), n2);
    }

    protected gs() {
    }
}

