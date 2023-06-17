/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import org.apache.commons.c.h.k;

final class o
extends k {
    private final char[] a;

    o(String string) {
        this.a = string.toCharArray();
    }

    @Override
    public int a(char[] arrc, int n2, int n3, int n4) {
        int n5 = this.a.length;
        if (n2 + n5 > n4) {
            return 0;
        }
        int n6 = 0;
        while (n6 < this.a.length) {
            if (this.a[n6] != arrc[n2]) {
                return 0;
            }
            ++n6;
            ++n2;
        }
        return n5;
    }
}

