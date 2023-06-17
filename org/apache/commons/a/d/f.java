/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.d;

class f {
    f() {
    }

    static int a(byte by2) {
        int n2 = Character.digit((char)by2, 16);
        if (n2 == -1) {
            throw new org.apache.commons.a.f("Invalid URL encoding: not a valid digit (radix 16): " + by2);
        }
        return n2;
    }
}

