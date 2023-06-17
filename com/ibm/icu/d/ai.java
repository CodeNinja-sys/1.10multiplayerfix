/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.af;

class ai
extends af {
    private byte[][] a = new byte[][]{{27, 36, 41, 67}};

    ai() {
    }

    String a() {
        return "ISO-2022-KR";
    }

    ae a(ad ad2) {
        int n2 = this.a(ad2.a, ad2.b, this.a);
        return n2 == 0 ? null : new ae(ad2, this, n2);
    }
}

