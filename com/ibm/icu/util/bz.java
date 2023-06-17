/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.util.Comparator;

final class bz
implements Comparator {
    bz() {
    }

    public int a(Double d2, Double d3) {
        return -d2.compareTo(d3);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Double)object, (Double)object2);
    }
}

