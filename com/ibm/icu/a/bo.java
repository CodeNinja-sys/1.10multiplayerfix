/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bh;
import com.ibm.icu.a.bk;
import com.ibm.icu.a.bp;
import com.ibm.icu.a.bx;
import com.ibm.icu.util.dv;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

class bo
extends bk {
    protected String g(int n2) {
        return ((bx)this.I).d(n2);
    }

    protected Set handleKeySet() {
        TreeSet<String> treeSet = new TreeSet<String>();
        bx bx2 = (bx)this.I;
        for (int i2 = 0; i2 < bx2.a(); ++i2) {
            treeSet.add(bx2.d(i2));
        }
        return treeSet;
    }

    protected int g(String string) {
        return ((bx)this.I).a(string);
    }

    protected int d(int n2) {
        return this.i(n2);
    }

    protected dv a(String string, HashMap hashMap, dv dv2, int[] arrn, boolean[] arrbl) {
        int n2 = ((bx)this.I).a((CharSequence)string);
        if (arrn != null) {
            arrn[0] = n2;
        }
        if (n2 < 0) {
            return null;
        }
        return this.a(n2, string, hashMap, dv2, arrbl);
    }

    protected dv a(int n2, HashMap hashMap, dv dv2, boolean[] arrbl) {
        String string = ((bx)this.I).d(n2);
        if (string == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.a(n2, string, hashMap, dv2, arrbl);
    }

    bo(bp bp2, String string, String string2, int n2, bh bh2) {
        super(bp2, string, string2, n2, bh2);
        this.I = bp2.j(n2);
        this.m();
    }
}

