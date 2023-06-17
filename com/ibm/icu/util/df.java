/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bf;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import java.util.Date;
import java.util.Locale;

public class df
extends bf {
    private static final long aH = 2583005278132380631L;
    public static final int a = 0;
    public static final int aG = 1;
    private static final int aI = 1911;
    private static final int aJ = 1970;

    public df() {
    }

    public df(dj dj2) {
        super(dj2);
    }

    public df(Locale locale) {
        super(locale);
    }

    public df(dn dn2) {
        super(dn2);
    }

    public df(dj dj2, Locale locale) {
        super(dj2, locale);
    }

    public df(dj dj2, dn dn2) {
        super(dj2, dn2);
    }

    public df(Date date) {
        this();
        this.a(date);
    }

    public df(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public df(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
    }

    protected int a() {
        int n2;
        int n3 = 1970;
        n3 = this.i(19, 1) == 19 && this.i(19, 0) == 19 ? this.c(19, 1970) : ((n2 = this.c(0, 1)) == 1 ? this.c(1, 1) + 1911 : 1 - this.c(1, 1) + 1911);
        return n3;
    }

    protected void a(int n2) {
        super.a(n2);
        int n3 = this.c(19) - 1911;
        if (n3 > 0) {
            this.l(0, 1);
            this.l(1, n3);
        } else {
            this.l(0, 0);
            this.l(1, 1 - n3);
        }
    }

    protected int a(int n2, int n3) {
        if (n2 == 0) {
            if (n3 == 0 || n3 == 1) {
                return 0;
            }
            return 1;
        }
        return super.a(n2, n3);
    }

    public String b() {
        return "roc";
    }
}

