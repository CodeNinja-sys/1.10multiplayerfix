/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;
import com.ibm.icu.a.ii;
import com.ibm.icu.b.b;

class ie
extends ii {
    final /* synthetic */ hk a;

    ie(hk hk2, int n2) {
        this.a = hk2;
        super(hk2, n2);
    }

    boolean a(int n2) {
        if (n2 <= 159) {
            return n2 == 9 || n2 == 32;
        }
        return com.ibm.icu.b.b.e(n2) == 12;
    }
}

