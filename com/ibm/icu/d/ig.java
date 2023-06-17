/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.gv;
import com.ibm.icu.d.if;

class ig
implements gv {
    final /* synthetic */ if a;

    ig(if if_) {
        this.a = if_;
    }

    public int a(int n2, int n3) {
        boolean[] arrbl = new boolean[1];
        int n4 = n2 + 1024;
        while (n2 < n4) {
            int n5 = this.a.c.a(n2, arrbl);
            if (arrbl[0]) {
                n2 += 32;
                continue;
            }
            if (n5 != 0) {
                return n3 | 0x8000;
            }
            ++n2;
        }
        return 0;
    }
}

