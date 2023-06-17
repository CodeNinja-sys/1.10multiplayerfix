/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ee;
import java.util.Comparator;

class ef
implements Comparator {
    final /* synthetic */ ee a;

    ef(ee ee2) {
        this.a = ee2;
    }

    public int a(Integer n2, Integer n3) {
        int n4 = n2;
        int n5 = n3;
        int n6 = ee.a(this.a);
        int n7 = 2;
        do {
            if (ee.b(this.a)[n4 + n7] != ee.b(this.a)[n5 + n7]) {
                return ee.b(this.a)[n4 + n7] < ee.b(this.a)[n5 + n7] ? -1 : 1;
            }
            if (++n7 != ee.a(this.a)) continue;
            n7 = 0;
        } while (--n6 > 0);
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

