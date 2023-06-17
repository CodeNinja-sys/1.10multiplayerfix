/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.ak;

class al
extends ak {
    al() {
    }

    String a() {
        return "UTF-16BE";
    }

    ae a(ad ad2) {
        byte[] arrby = ad2.f;
        if (arrby.length >= 2 && (arrby[0] & 0xFF) == 254 && (arrby[1] & 0xFF) == 255) {
            int n2 = 100;
            return new ae(ad2, this, n2);
        }
        return null;
    }
}

