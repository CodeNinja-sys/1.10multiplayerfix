/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.aq;
import com.ibm.icu.d.ax;

class aw
extends aq {
    static int[] a = new int[]{33088, 33089, 33090, 33093, 33115, 33129, 33130, 33141, 33142, 33440, 33442, 33444, 33449, 33450, 33451, 33453, 33455, 33457, 33459, 33461, 33463, 33469, 33470, 33473, 33476, 33477, 33478, 33480, 33481, 33484, 33485, 33500, 33504, 33511, 33512, 33513, 33514, 33520, 33521, 33601, 33603, 33614, 33615, 33624, 33630, 33634, 33639, 33653, 33654, 33673, 33674, 33675, 33677, 33683, 36502, 37882, 38314};

    aw() {
    }

    boolean a(ax ax2, ad ad2) {
        ax2.b = ax2.c;
        ax2.d = false;
        ax2.a = ax2.a(ad2);
        int n2 = ax2.a;
        if (n2 < 0) {
            return false;
        }
        if (n2 <= 127 || n2 > 160 && n2 <= 223) {
            return true;
        }
        int n3 = ax2.a(ad2);
        if (n3 < 0) {
            return false;
        }
        ax2.a = n2 << 8 | n3;
        if (!(n3 >= 64 && n3 <= 127 || n3 >= 128 && n3 <= 255)) {
            ax2.d = true;
        }
        return true;
    }

    ae a(ad ad2) {
        int n2 = this.a(ad2, a);
        return n2 == 0 ? null : new ae(ad2, this, n2);
    }

    String a() {
        return "Shift_JIS";
    }

    public String b() {
        return "ja";
    }
}

