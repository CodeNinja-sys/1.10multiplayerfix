/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.a;
import java.util.Comparator;

enum c implements Comparator
{
    a;


    public int a(boolean[] arrbl, boolean[] arrbl2) {
        int n2 = Math.min(arrbl.length, arrbl2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = com.a.a.l.a.a(arrbl[i2], arrbl2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrbl.length - arrbl2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((boolean[])object, (boolean[])object2);
    }
}

