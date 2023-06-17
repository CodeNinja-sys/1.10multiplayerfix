/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.i;
import java.util.Comparator;

enum l implements Comparator
{
    a;


    public int a(double[] arrd, double[] arrd2) {
        int n2 = Math.min(arrd.length, arrd2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = i.a(arrd[i2], arrd2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrd.length - arrd2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((double[])object, (double[])object2);
    }
}

