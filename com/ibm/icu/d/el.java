/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.cq;
import com.ibm.icu.d.dv;
import com.ibm.icu.d.dw;
import com.ibm.icu.d.em;
import com.ibm.icu.util.dn;
import java.util.Locale;

public abstract class el {
    public static el b(dn dn2) {
        return el.b(dn2, em.a);
    }

    public static el b(dn dn2, em em2) {
        return cq.a(dn2, em2);
    }

    public static el b(dn dn2, dv ... arrdv) {
        return cq.a(dn2, arrdv);
    }

    public abstract dn a();

    public abstract em b();

    public abstract dv a(dw var1);

    public abstract String a(dn var1);

    public abstract String a(Locale var1);

    public abstract String a(String var1);

    public abstract String b(String var1);

    public abstract String c(String var1);

    public String d(String string) {
        return this.c(string);
    }

    public abstract String a(int var1);

    public abstract String e(String var1);

    public abstract String f(String var1);

    public abstract String g(String var1);

    public abstract String a(String var1, String var2);

    protected el() {
    }
}

