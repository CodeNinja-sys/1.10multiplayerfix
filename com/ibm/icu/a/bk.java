/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bh;
import com.ibm.icu.a.bp;
import com.ibm.icu.a.bu;
import com.ibm.icu.util.dv;
import java.util.HashMap;

class bk
extends bh {
    protected bu I;

    public int w() {
        return this.I.a();
    }

    protected int i(int n2) {
        return this.I.a(n2);
    }

    protected dv a(int n2, String string, HashMap hashMap, dv dv2, boolean[] arrbl) {
        int n3 = this.i(n2);
        if (n3 == -1) {
            throw new IndexOutOfBoundsException();
        }
        return this.a(string, n3, hashMap, dv2, arrbl);
    }

    bk(bp bp2, String string, String string2, int n2, bh bh2) {
        super(bp2, string, string2, n2, bh2);
    }
}

