/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.ag;
import java.util.Comparator;

class ah {
    static final String a = ah.class.getName() + "$UnsafeComparator";
    static final Comparator b = ah.a();

    ah() {
    }

    static Comparator a() {
        try {
            Class<?> class_ = Class.forName(a);
            Comparator comparator = (Comparator)class_.getEnumConstants()[0];
            return comparator;
        }
        catch (Throwable throwable) {
            return ag.b();
        }
    }
}

