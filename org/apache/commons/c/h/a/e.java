/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import org.apache.commons.c.h.a.k;

public class e
extends k {
    public static e b(int n2) {
        return e.b(0, n2);
    }

    public static e c(int n2) {
        return e.b(n2, Integer.MAX_VALUE);
    }

    public static e a(int n2, int n3) {
        return new e(n2, n3, true);
    }

    public static e b(int n2, int n3) {
        return new e(n2, n3, false);
    }

    public e(int n2, int n3, boolean bl2) {
        super(n2, n3, bl2);
    }

    @Override
    protected String d(int n2) {
        char[] arrc = Character.toChars(n2);
        return "\\u" + e.a(arrc[0]) + "\\u" + e.a(arrc[1]);
    }
}

