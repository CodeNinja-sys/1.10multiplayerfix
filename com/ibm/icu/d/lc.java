/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.iq;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.ld;

public abstract class lc
implements ld {
    public abstract boolean b(int var1);

    public int a(iq iq2, int[] arrn, int n2, boolean bl2) {
        int n3;
        if (arrn[0] < n2 && this.b(n3 = iq2.b(arrn[0]))) {
            arrn[0] = arrn[0] + kx.a(n3);
            return 2;
        }
        if (arrn[0] > n2 && this.b(iq2.b(arrn[0]))) {
            arrn[0] = arrn[0] - 1;
            if (arrn[0] >= 0) {
                arrn[0] = arrn[0] - (kx.a(iq2.b(arrn[0])) - 1);
            }
            return 2;
        }
        if (bl2 && arrn[0] == n2) {
            return 1;
        }
        return 0;
    }

    protected lc() {
    }
}

