/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bh;
import com.ibm.icu.a.bk;
import com.ibm.icu.a.bp;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import com.ibm.icu.util.dz;
import java.util.HashMap;

class bi
extends bk {
    protected String[] t() {
        String[] arrstring = new String[this.I.a()];
        dy dy2 = this.D();
        int n2 = 0;
        while (dy2.d()) {
            arrstring[n2++] = dy2.a().A();
        }
        return arrstring;
    }

    public String[] u() {
        return this.t();
    }

    protected dv a(String string, HashMap hashMap, dv dv2, int[] arrn, boolean[] arrbl) {
        int n2;
        int n3 = n2 = string.length() > 0 ? Integer.valueOf(string) : -1;
        if (arrn != null) {
            arrn[0] = n2;
        }
        if (n2 < 0) {
            throw new dz("Could not get the correct value for index: " + string);
        }
        return this.a(n2, string, hashMap, dv2, arrbl);
    }

    protected dv a(int n2, HashMap hashMap, dv dv2, boolean[] arrbl) {
        return this.a(n2, Integer.toString(n2), hashMap, dv2, arrbl);
    }

    bi(bp bp2, String string, String string2, int n2, bh bh2) {
        super(bp2, string, string2, n2, bh2);
        this.I = bp2.i(n2);
        this.m();
    }
}

