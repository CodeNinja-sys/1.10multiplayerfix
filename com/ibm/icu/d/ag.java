/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.af;

class ag
extends af {
    private byte[][] a = new byte[][]{{27, 36, 41, 65}, {27, 36, 41, 71}, {27, 36, 42, 72}, {27, 36, 41, 69}, {27, 36, 43, 73}, {27, 36, 43, 74}, {27, 36, 43, 75}, {27, 36, 43, 76}, {27, 36, 43, 77}, {27, 78}, {27, 79}};

    ag() {
    }

    String a() {
        return "ISO-2022-CN";
    }

    ae a(ad ad2) {
        int n2 = this.a(ad2.a, ad2.b, this.a);
        return n2 == 0 ? null : new ae(ad2, this, n2);
    }
}

