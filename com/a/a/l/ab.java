/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.aa;
import java.util.Comparator;

enum ab implements Comparator
{
    a;


    public int a(short[] arrs, short[] arrs2) {
        int n2 = Math.min(arrs.length, arrs2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = aa.a(arrs[i2], arrs2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrs.length - arrs2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((short[])object, (short[])object2);
    }
}

