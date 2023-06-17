/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.bx;

class aj
extends bx {
    aj() {
    }

    String a() {
        return "UTF-8";
    }

    ae a(ad ad2) {
        boolean bl2 = false;
        int n2 = 0;
        int n3 = 0;
        byte[] arrby = ad2.f;
        int n4 = 0;
        if (ad2.g >= 3 && (arrby[0] & 0xFF) == 239 && (arrby[1] & 0xFF) == 187 && (arrby[2] & 0xFF) == 191) {
            bl2 = true;
        }
        block0: for (int i2 = 0; i2 < ad2.g; ++i2) {
            byte by2 = arrby[i2];
            if ((by2 & 0x80) == 0) continue;
            if ((by2 & 0xE0) == 192) {
                n4 = 1;
            } else if ((by2 & 0xF0) == 224) {
                n4 = 2;
            } else if ((by2 & 0xF8) == 240) {
                n4 = 3;
            } else {
                if (++n3 > 5) break;
                n4 = 0;
            }
            while (++i2 < ad2.g) {
                by2 = arrby[i2];
                if ((by2 & 0xC0) != 128) {
                    ++n3;
                    continue block0;
                }
                if (--n4 != 0) continue;
                ++n2;
                continue block0;
            }
        }
        int n5 = 0;
        if (bl2 && n3 == 0) {
            n5 = 100;
        } else if (bl2 && n2 > n3 * 10) {
            n5 = 80;
        } else if (n2 > 3 && n3 == 0) {
            n5 = 100;
        } else if (n2 > 0 && n3 == 0) {
            n5 = 80;
        } else if (n2 == 0 && n3 == 0) {
            n5 = 10;
        } else if (n2 > n3 * 10) {
            n5 = 25;
        }
        return n5 == 0 ? null : new ae(ad2, this, n5);
    }
}

