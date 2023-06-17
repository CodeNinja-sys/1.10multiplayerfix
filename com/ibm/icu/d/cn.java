/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.w;
import com.ibm.icu.util.dn;
import java.util.Map;

public abstract class cn {
    public static cn a(dn dn2) {
        return w.a.a(dn2, true);
    }

    public static cn a(dn dn2, boolean bl2) {
        return w.a.a(dn2, !bl2);
    }

    public static boolean f() {
        return w.a.a();
    }

    public abstract dn e();

    public abstract String c(String var1);

    public abstract String b(String var1);

    public abstract String a(String var1, String var2);

    public abstract Map c();

    public abstract Map d();

    protected cn() {
    }
}

