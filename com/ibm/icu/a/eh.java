/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cm;
import com.ibm.icu.a.gv;

class eh
implements gv {
    private cm a;

    public eh(cm cm2) {
        this.a = cm2;
    }

    public int a(int n2, int n3) {
        int n4 = this.a.b;
        int n5 = n2 + 1024;
        while (n2 < n5) {
            boolean[] arrbl = new boolean[1];
            int n6 = this.a.a(n2, arrbl);
            if (arrbl[0]) {
                n2 += 32;
                continue;
            }
            if (n6 != n4) {
                return n3;
            }
            ++n2;
        }
        return 0;
    }
}

