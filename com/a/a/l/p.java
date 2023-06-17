/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.m;
import java.util.Comparator;

enum p implements Comparator
{
    a;


    public int a(float[] arrf, float[] arrf2) {
        int n2 = Math.min(arrf.length, arrf2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = m.a(arrf[i2], arrf2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrf.length - arrf2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((float[])object, (float[])object2);
    }
}

