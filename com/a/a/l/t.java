/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.q;
import java.util.Comparator;

enum t implements Comparator
{
    a;


    public int a(int[] arrn, int[] arrn2) {
        int n2 = Math.min(arrn.length, arrn2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = q.a(arrn[i2], arrn2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrn.length - arrn2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }
}

