/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ge;

class hx
implements ge {
    hx() {
    }

    public int a(int n2) {
        if ((n2 & 0x8000) != 0) {
            return n2 & 0x7FFF;
        }
        return 0;
    }
}

