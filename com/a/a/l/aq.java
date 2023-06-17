/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.ap;
import java.util.Comparator;

enum aq implements Comparator
{
    a;


    public int a(long[] arrl, long[] arrl2) {
        int n2 = Math.min(arrl.length, arrl2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrl[i2] == arrl2[i2]) continue;
            return ap.a(arrl[i2], arrl2[i2]);
        }
        return arrl.length - arrl2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((long[])object, (long[])object2);
    }
}

