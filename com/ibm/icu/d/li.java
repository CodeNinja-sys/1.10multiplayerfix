/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.b;
import com.ibm.icu.d.lh;

class li
implements lh {
    int a;

    li(int n2) {
        this.a = n2;
    }

    public boolean a(int n2) {
        return (1 << b.e(n2) & this.a) != 0;
    }
}

