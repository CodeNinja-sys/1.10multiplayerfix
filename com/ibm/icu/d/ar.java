/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.aq;
import com.ibm.icu.d.ax;

class ar
extends aq {
    static int[] a = new int[]{41280, 41281, 41282, 41283, 41287, 41289, 41333, 41334, 42048, 42054, 42055, 42056, 42065, 42068, 42071, 42084, 42090, 42092, 42103, 42147, 42148, 42151, 42177, 42190, 42193, 42207, 42216, 42237, 42304, 42312, 42328, 42345, 42445, 42471, 42583, 42593, 42594, 42600, 42608, 42664, 42675, 42681, 42707, 42715, 42726, 42738, 42816, 42833, 42841, 42970, 43171, 43173, 43181, 43217, 43219, 43236, 43260, 43456, 43474, 43507, 43627, 43706, 43710, 43724, 43772, 44103, 44111, 44208, 44242, 44377, 44745, 45024, 45290, 45423, 45747, 45764, 45935, 46156, 46158, 46412, 46501, 46525, 46544, 46552, 46705, 47085, 47207, 47428, 47832, 47940, 48033, 48593, 49860, 50105, 50240, 50271};

    ar() {
    }

    boolean a(ax ax2, ad ad2) {
        ax2.b = ax2.c;
        ax2.d = false;
        ax2.a = ax2.a(ad2);
        int n2 = ax2.a;
        if (n2 < 0) {
            return false;
        }
        if (n2 <= 127 || n2 == 255) {
            return true;
        }
        int n3 = ax2.a(ad2);
        if (n3 < 0) {
            return false;
        }
        ax2.a = ax2.a << 8 | n3;
        if (n3 < 64 || n3 == 127 || n3 == 255) {
            ax2.d = true;
        }
        return true;
    }

    ae a(ad ad2) {
        int n2 = this.a(ad2, a);
        return n2 == 0 ? null : new ae(ad2, this, n2);
    }

    String a() {
        return "Big5";
    }

    public String b() {
        return "zh";
    }
}

