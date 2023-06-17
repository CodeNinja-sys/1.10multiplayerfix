/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.r;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.n;
import java.util.MissingResourceException;

class s {
    private String[] a;
    private String[] b;

    public s(String[] arrstring, String[] arrstring2) {
        this.a = arrstring;
        this.b = arrstring2;
    }

    private String a(int n2) {
        int n3 = 8;
        if (this.a.length >= 13) {
            n3 += n2 + 1;
        }
        String string = this.a[n3];
        return string;
    }

    private static s b(n n2, dn dn2) {
        String string = n2.b();
        String string2 = dn2.k() + "+" + string;
        s s2 = (s)n.E().a(string2);
        if (s2 == null) {
            try {
                r r2 = new r(dn2, string);
                s2 = new s(r2.a(), r2.b());
            }
            catch (MissingResourceException missingResourceException) {
                s2 = new s(n.F(), null);
            }
            n.E().a(string2, s2);
        }
        return s2;
    }

    static /* synthetic */ s a(n n2, dn dn2) {
        return s.b(n2, dn2);
    }

    static /* synthetic */ String a(s s2, int n2) {
        return s2.a(n2);
    }

    static /* synthetic */ String[] a(s s2) {
        return s2.a;
    }

    static /* synthetic */ String[] b(s s2) {
        return s2.b;
    }
}

