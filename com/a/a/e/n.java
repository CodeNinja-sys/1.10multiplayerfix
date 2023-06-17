/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

import com.a.a.e.o;

final class n {
    private static final ThreadLocal a = new o();

    private n() {
    }

    static char[] a() {
        return (char[])a.get();
    }
}

