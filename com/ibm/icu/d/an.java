/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.ak;

abstract class an
extends ak {
    an() {
    }

    abstract int a(byte[] var1, int var2);

    abstract String a();

    ae a(ad ad2) {
        byte[] arrby = ad2.f;
        int n2 = ad2.g / 4 * 4;
        int n3 = 0;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        if (n2 == 0) {
            return null;
        }
        if (this.a(arrby, 0) == 65279) {
            bl2 = true;
        }
        for (int i2 = 0; i2 < n2; i2 += 4) {
            int n6 = this.a(arrby, i2);
            if (n6 < 0 || n6 >= 0x10FFFF || n6 >= 55296 && n6 <= 57343) {
                ++n4;
                continue;
            }
            ++n3;
        }
        if (bl2 && n4 == 0) {
            n5 = 100;
        } else if (bl2 && n3 > n4 * 10) {
            n5 = 80;
        } else if (n3 > 3 && n4 == 0) {
            n5 = 100;
        } else if (n3 > 0 && n4 == 0) {
            n5 = 80;
        } else if (n3 > n4 * 10) {
            n5 = 25;
        }
        return n5 == 0 ? null : new ae(ad2, this, n5);
    }
}

