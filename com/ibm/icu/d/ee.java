/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.util.BitSet;
import java.util.Comparator;

final class ee
implements Comparator {
    ee() {
    }

    public int a(BitSet bitSet, BitSet bitSet2) {
        int n2 = bitSet.cardinality() - bitSet2.cardinality();
        if (n2 != 0) {
            return n2;
        }
        int n3 = bitSet.nextSetBit(0);
        int n4 = bitSet2.nextSetBit(0);
        while ((n2 = n3 - n4) == 0 && n3 > 0) {
            n3 = bitSet.nextSetBit(n3 + 1);
            n4 = bitSet2.nextSetBit(n4 + 1);
        }
        return n2;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((BitSet)object, (BitSet)object2);
    }
}

