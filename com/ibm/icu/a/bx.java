/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bp;
import com.ibm.icu.a.bu;

class bx
extends bu {
    protected char[] d;
    protected int[] e;
    private static final int f = -1;

    String d(int n2) {
        if (n2 < 0 || this.b <= n2) {
            return null;
        }
        return this.d != null ? bp.c(this.a, this.d[n2]) : bp.d(this.a, this.e[n2]);
    }

    int a(CharSequence charSequence) {
        int n2 = 0;
        int n3 = this.b;
        while (n2 < n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = this.d != null ? bp.a(this.a, charSequence, this.d[n4]) : bp.a(this.a, charSequence, this.e[n4]);
            if (n5 < 0) {
                n3 = n4;
                continue;
            }
            if (n5 > 0) {
                n2 = n4 + 1;
                continue;
            }
            return n4;
        }
        return -1;
    }

    int a(String string) {
        return this.a(this.a((CharSequence)string));
    }

    bx(bp bp2) {
        super(bp2);
    }
}

