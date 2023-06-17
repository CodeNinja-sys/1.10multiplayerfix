/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.r;
import com.ibm.icu.d.cw;
import com.ibm.icu.util.af;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.util.Locale;

public class ca
extends cw {
    static final long a = 6827816119783952890L;
    String[] b;

    public ca() {
        this(dn.a(dr.b));
    }

    public ca(Locale locale) {
        super(af.class, dn.a(locale));
    }

    public ca(dn dn2) {
        super(af.class, dn2);
    }

    public ca(n n2, Locale locale) {
        super(n2 == null ? null : n2.getClass(), locale);
    }

    public ca(n n2, dn dn2) {
        super(n2 == null ? null : n2.getClass(), dn2);
    }

    public String a(int n2) {
        return this.b[n2];
    }

    protected void a(dn dn2, r r2) {
        super.a(dn2, r2);
        this.m();
    }

    void a(cw cw2) {
        super.a(cw2);
        if (cw2 instanceof ca) {
            this.b = ((ca)cw2).b;
        } else {
            this.m();
        }
    }

    private void m() {
        this.b = new String[2];
        this.b[0] = "";
        this.b[1] = this.O != null ? this.O[0].replace("{0}", "") : "";
    }
}

