/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abg;
import java.util.Comparator;
import java.util.List;

final class abj
extends abg {
    @Override
    int a(Comparator comparator, Object object, List list, int n2) {
        int n3 = 0;
        int n4 = n2;
        while (n3 < n4) {
            int n5 = n3 + n4 >>> 1;
            int n6 = comparator.compare(list.get(n5), object);
            if (n6 < 0) {
                n3 = n5 + 1;
                continue;
            }
            n4 = n5;
        }
        return n3;
    }
}

