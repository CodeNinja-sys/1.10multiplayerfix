/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bf;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import java.util.Date;
import java.util.Locale;

public class c
extends bf {
    private static final long aG = 2583005278132380631L;
    public static final int a = 0;
    private static final int aH = -543;
    private static final int aI = 1970;

    public c() {
    }

    public c(dj dj2) {
        super(dj2);
    }

    public c(Locale locale) {
        super(locale);
    }

    public c(dn dn2) {
        super(dn2);
    }

    public c(dj dj2, Locale locale) {
        super(dj2, locale);
    }

    public c(dj dj2, dn dn2) {
        super(dj2, dn2);
    }

    public c(Date date) {
        this();
        this.a(date);
    }

    public c(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public c(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
    }

    protected int a() {
        int n2 = this.i(19, 1) == 19 ? this.c(19, 1970) : this.c(1, 2513) + -543;
        return n2;
    }

    protected int a(int n2, int n3, boolean bl2) {
        return super.a(n2, n3, bl2);
    }

    protected void a(int n2) {
        super.a(n2);
        int n3 = this.c(19) - -543;
        this.l(0, 0);
        this.l(1, n3);
    }

    protected int a(int n2, int n3) {
        if (n2 == 0) {
            return 0;
        }
        return super.a(n2, n3);
    }

    public String b() {
        return "buddhist";
    }
}

