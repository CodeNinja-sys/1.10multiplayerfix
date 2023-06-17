/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.bi;
import com.ibm.icu.a.bj;
import com.ibm.icu.a.bl;
import com.ibm.icu.a.bm;
import com.ibm.icu.a.bn;
import com.ibm.icu.a.bo;
import com.ibm.icu.a.bp;
import com.ibm.icu.util.dv;
import java.util.HashMap;

class bh
extends bc {
    protected bh(bp bp2, String string, String string2, int n2, bh bh2) {
        super(bp2, string, string2, n2, bh2);
    }

    protected final bc a(String string, int n2, HashMap hashMap, dv dv2, boolean[] arrbl) {
        if (arrbl != null) {
            arrbl[0] = false;
        }
        String string2 = this.m + "/" + string;
        switch (bp.a(n2)) {
            case 0: 
            case 6: {
                return new bn(this.x, string, string2, n2, this);
            }
            case 1: {
                return new bj(this.x, string, string2, n2, this);
            }
            case 3: {
                if (arrbl != null) {
                    arrbl[0] = true;
                }
                return this.a(string, string2, n2, hashMap, dv2);
            }
            case 7: {
                return new bl(this.x, string, string2, n2, this);
            }
            case 14: {
                return new bm(this.x, string, string2, n2, this);
            }
            case 8: 
            case 9: {
                return new bi(this.x, string, string2, n2, this);
            }
            case 2: 
            case 4: 
            case 5: {
                return new bo(this.x, string, string2, n2, this);
            }
        }
        throw new IllegalStateException("The resource type is unknown");
    }
}

