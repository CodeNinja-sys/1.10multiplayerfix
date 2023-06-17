/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.bv;
import com.ibm.icu.d.bx;

abstract class ay
extends bx {
    ay() {
    }

    abstract String a();

    int a(ad ad2, int[] arrn, byte[] arrby) {
        return this.a(ad2, arrn, arrby, (byte)32);
    }

    int a(ad ad2, int[] arrn, byte[] arrby, byte by2) {
        bv bv2 = new bv(arrn, arrby);
        return bv2.a(ad2, by2);
    }
}

