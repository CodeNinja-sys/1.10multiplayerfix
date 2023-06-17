/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.am;
import java.util.Comparator;

enum an implements Comparator
{
    a;


    public int a(int[] arrn, int[] arrn2) {
        int n2 = Math.min(arrn.length, arrn2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrn[i2] == arrn2[i2]) continue;
            return am.a(arrn[i2], arrn2[i2]);
        }
        return arrn.length - arrn2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }
}

