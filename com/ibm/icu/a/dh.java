/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.util.Comparator;

public class dh
implements Comparator {
    private Comparator[] a;

    public dh(Comparator ... arrcomparator) {
        this.a = arrcomparator;
    }

    public int compare(Object object, Object object2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n2 = this.a[i2].compare(object, object2);
            if (n2 == 0) continue;
            if (n2 > 0) {
                return i2 + 1;
            }
            return -(i2 + 1);
        }
        return 0;
    }
}

