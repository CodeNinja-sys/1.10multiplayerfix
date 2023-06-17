/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

final class cl {
    cl() {
    }

    static void a(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException("null key in entry: null=" + object2);
        }
        if (object2 == null) {
            throw new NullPointerException("null value in entry: " + object + "=null");
        }
    }

    static int a(int n2, String string) {
        if (n2 < 0) {
            throw new IllegalArgumentException(string + " cannot be negative but was: " + n2);
        }
        return n2;
    }

    static void a(boolean bl2) {
        com.a.a.b.cl.b(bl2, "no calls to next() since the last call to remove()");
    }
}

