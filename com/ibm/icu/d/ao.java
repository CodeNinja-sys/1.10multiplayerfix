/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.an;

class ao
extends an {
    ao() {
    }

    int a(byte[] arrby, int n2) {
        return (arrby[n2 + 0] & 0xFF) << 24 | (arrby[n2 + 1] & 0xFF) << 16 | (arrby[n2 + 2] & 0xFF) << 8 | arrby[n2 + 3] & 0xFF;
    }

    String a() {
        return "UTF-32BE";
    }
}

