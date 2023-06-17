/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.m;
import java.util.Arrays;

class ai
extends m {
    private final char[] s;
    private final char[] t;

    ai(String string, char[] arrc, char[] arrc2) {
        super(string);
        this.s = arrc;
        this.t = arrc2;
        cl.a(arrc.length == arrc2.length);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            cl.a(arrc[i2] <= arrc2[i2]);
            if (i2 + 1 >= arrc.length) continue;
            cl.a(arrc2[i2] < arrc[i2 + 1]);
        }
    }

    @Override
    public boolean c(char c2) {
        int n2 = Arrays.binarySearch(this.s, c2);
        if (n2 >= 0) {
            return true;
        }
        return (n2 = ~n2 - 1) >= 0 && c2 <= this.t[n2];
    }
}

