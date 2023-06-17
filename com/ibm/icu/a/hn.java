/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.di;
import com.ibm.icu.a.ha;
import com.ibm.icu.a.hk;
import com.ibm.icu.a.ii;
import com.ibm.icu.b.b;

class hn
extends ii {
    final /* synthetic */ hk a;

    hn(hk hk2, int n2) {
        this.a = hk2;
        super(hk2, n2);
    }

    boolean a(int n2) {
        String string = di.a().a.k(n2);
        if (string != null) {
            n2 = string.codePointAt(0);
            if (Character.charCount(n2) != string.length()) {
                n2 = -1;
            }
        } else if (n2 < 0) {
            return false;
        }
        if (n2 >= 0) {
            ha ha2 = ha.h;
            ha.b.setLength(0);
            return ha2.a(n2, ha.b, 0) >= 0;
        }
        String string2 = com.ibm.icu.b.b.a(string, true);
        return !string2.equals(string);
    }
}

