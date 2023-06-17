/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.bx;

abstract class af
extends bx {
    af() {
    }

    int a(byte[] arrby, int n2, byte[][] arrby2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            if (arrby[i2] == 27) {
                block1: for (int i3 = 0; i3 < arrby2.length; ++i3) {
                    byte[] arrby3 = arrby2[i3];
                    if (n2 - i2 < arrby3.length) continue;
                    for (int i4 = 1; i4 < arrby3.length; ++i4) {
                        if (arrby3[i4] != arrby[i2 + i4]) continue block1;
                    }
                    ++n3;
                    i2 += arrby3.length - 1;
                    continue block0;
                }
                ++n4;
            }
            if (arrby[i2] != 14 && arrby[i2] != 15) continue;
            ++n5;
        }
        if (n3 == 0) {
            return 0;
        }
        int n6 = (100 * n3 - 100 * n4) / (n3 + n4);
        if (n3 + n5 < 5) {
            n6 -= (5 - (n3 + n5)) * 10;
        }
        if (n6 < 0) {
            n6 = 0;
        }
        return n6;
    }
}

