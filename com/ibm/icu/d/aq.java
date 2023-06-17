/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ax;
import com.ibm.icu.d.bx;
import java.util.Arrays;

abstract class aq
extends bx {
    aq() {
    }

    abstract String a();

    int a(ad ad2, int[] arrn) {
        int n2;
        block13: {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            n2 = 0;
            ax ax2 = new ax();
            ax2.a();
            while (this.a(ax2, ad2)) {
                ++n7;
                if (ax2.d) {
                    ++n6;
                } else {
                    long l2 = (long)ax2.a & 0xFFFFFFFFL;
                    if (l2 <= 255L) {
                        ++n3;
                    } else {
                        ++n4;
                        if (arrn != null && Arrays.binarySearch(arrn, (int)l2) >= 0) {
                            ++n5;
                        }
                    }
                }
                if (n6 < 2 || n6 * 5 < n4) continue;
                break block13;
            }
            if (n4 <= 10 && n6 == 0) {
                n2 = n4 == 0 && n7 < 10 ? 0 : 10;
            } else if (n4 < 20 * n6) {
                n2 = 0;
            } else if (arrn == null) {
                n2 = 30 + n4 - 20 * n6;
                if (n2 > 100) {
                    n2 = 100;
                }
            } else {
                double d2 = Math.log((float)n4 / 4.0f);
                double d3 = 90.0 / d2;
                n2 = (int)(Math.log(n5 + 1) * d3 + 10.0);
                n2 = Math.min(n2, 100);
            }
        }
        return n2;
    }

    abstract boolean a(ax var1, ad var2);
}

