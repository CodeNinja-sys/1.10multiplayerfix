/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.ak;

class am
extends ak {
    am() {
    }

    String a() {
        return "UTF-16LE";
    }

    ae a(ad ad2) {
        byte[] arrby = ad2.f;
        if (arrby.length >= 2 && (arrby[0] & 0xFF) == 255 && (arrby[1] & 0xFF) == 254) {
            if (arrby.length >= 4 && arrby[2] == 0 && arrby[3] == 0) {
                return null;
            }
            int n2 = 100;
            return new ae(ad2, this, n2);
        }
        return null;
    }
}

