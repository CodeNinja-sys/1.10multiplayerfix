/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import org.apache.logging.log4j.core.h.h;

final class l
extends h {
    private final char[] a;

    l(String string) {
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

