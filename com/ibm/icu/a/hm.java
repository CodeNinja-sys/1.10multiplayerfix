/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;
import com.ibm.icu.a.ii;
import com.ibm.icu.b.b;

class hm
extends ii {
    final /* synthetic */ hk a;

    hm(hk hk2, int n2) {
        this.a = hk2;
        super(hk2, n2);
    }

    boolean a(int n2) {
        if (n2 <= 102 && n2 >= 65 && (n2 <= 70 || n2 >= 97) || n2 >= 65313 && n2 <= 65350 && (n2 <= 65318 || n2 >= 65345)) {
            return true;
        }
        return com.ibm.icu.b.b.e(n2) == 9;
    }
}

