/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.af;

class ah
extends af {
    private byte[][] a = new byte[][]{{27, 36, 40, 67}, {27, 36, 40, 68}, {27, 36, 64}, {27, 36, 65}, {27, 36, 66}, {27, 38, 64}, {27, 40, 66}, {27, 40, 72}, {27, 40, 73}, {27, 40, 74}, {27, 46, 65}, {27, 46, 70}};

    ah() {
    }

    String a() {
        return "ISO-2022-JP";
    }

    ae a(ad ad2) {
        int n2 = this.a(ad2.a, ad2.b, this.a);
        return n2 == 0 ? null : new ae(ad2, this, n2);
    }
}

