/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ca;
import com.ibm.icu.d.cv;
import com.ibm.icu.d.dv;
import com.ibm.icu.d.iz;
import com.ibm.icu.util.af;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.n;
import java.text.FieldPosition;
import java.util.Locale;

public class by
extends iz {
    static final long a = -4610300753104099899L;

    public by(String string, Locale locale) {
        this(string, dn.a(locale));
    }

    public by(String string, dn dn2) {
        this(string, (String)null, dn2);
    }

    public by(String string, String string2, dn dn2) {
        super(string, new ca(dn2), new af(dj.p(), dn2), dn2, true, string2);
    }

    protected void a(StringBuffer stringBuffer, char c2, int n2, int n3, int n4, dv dv2, FieldPosition fieldPosition, n n5) {
        super.a(stringBuffer, c2, n2, n3, n4, dv2, fieldPosition, n5);
    }

    protected int a(String string, int n2, char c2, int n3, boolean bl2, boolean bl3, boolean[] arrbl, n n4) {
        return super.a(string, n2, c2, n3, bl2, bl3, arrbl, n4);
    }

    protected cv a(char c2) {
        return super.a(c2);
    }
}

