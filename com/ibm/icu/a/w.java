/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.x;
import com.ibm.icu.a.z;

public class w {
    public static final z a;

    static {
        z z2 = null;
        try {
            Class<?> class_ = Class.forName("com.ibm.icu.impl.ICUCurrencyDisplayInfoProvider");
            z2 = (z)class_.newInstance();
        }
        catch (Throwable throwable) {
            z2 = new x();
        }
        a = z2;
    }
}

