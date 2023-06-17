/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.aq;
import com.ibm.icu.d.ax;

abstract class as
extends aq {
    as() {
    }

    boolean a(ax ax2, ad ad2) {
        ax2.b = ax2.c;
        ax2.d = false;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        ax2.a = ax2.a(ad2);
        n2 = ax2.a;
        if (n2 < 0) {
            ax2.e = true;
        } else if (n2 > 141) {
            n3 = ax2.a(ad2);
            ax2.a = ax2.a << 8 | n3;
            if (n2 >= 161 && n2 <= 254) {
                if (n3 < 161) {
                    ax2.d = true;
                }
            } else if (n2 == 142) {
                if (n3 < 161) {
                    ax2.d = true;
                }
            } else if (n2 == 143) {
                n4 = ax2.a(ad2);
                ax2.a = ax2.a << 8 | n4;
                if (n4 < 161) {
                    ax2.d = true;
                }
            }
        }
        return !ax2.e;
    }
}

