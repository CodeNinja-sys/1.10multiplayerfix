/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.el;

public final class ek {
    public static void a(boolean bl2) {
        if (!bl2) {
            throw new el();
        }
    }

    public static void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new el(cl.a(string, arrobject));
        }
    }

    public static Object a(Object object) {
        return ek.a(object, "expected a non-null reference", new Object[0]);
    }

    public static Object a(Object object, String string, Object ... arrobject) {
        ek.a(object != null, string, arrobject);
        return object;
    }

    private ek() {
    }
}

