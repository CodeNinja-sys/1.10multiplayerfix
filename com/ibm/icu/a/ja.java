/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.iz;
import java.util.Comparator;

class ja
implements Comparator {
    final /* synthetic */ iz a;

    ja(iz iz2) {
        this.a = iz2;
    }

    public int compare(Object object, Object object2) {
        int n2;
        String string = object.toString();
        String string2 = object2.toString();
        int n3 = string.length();
        if (n3 != (n2 = string2.length())) {
            return n2 - n3;
        }
        return string.compareTo(string2);
    }
}

