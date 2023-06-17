/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abg;
import java.util.Comparator;
import java.util.List;

final class abi
extends abg {
    @Override
    int a(Comparator comparator, Object object, List list, int n2) {
        int n3 = n2;
        int n4 = list.size() - 1;
        while (n3 < n4) {
            int n5 = n3 + n4 + 1 >>> 1;
            int n6 = comparator.compare(list.get(n5), object);
            if (n6 > 0) {
                n4 = n5 - 1;
                continue;
            }
            n3 = n5;
        }
        return n3;
    }
}

