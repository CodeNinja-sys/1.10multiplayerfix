/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;
import com.ibm.icu.a.il;

class hx
extends il {
    final /* synthetic */ hk a;

    hx(hk hk2, int n2) {
        this.a = hk2;
        super(hk2, n2);
    }

    int a(int n2) {
        int n3 = (this.a.a(n2, 2) & 0x3E0) >>> 5;
        if (n3 < hk.a().length) {
            return hk.a()[n3];
        }
        return 0;
    }

    int b(int n2) {
        return 5;
    }
}

