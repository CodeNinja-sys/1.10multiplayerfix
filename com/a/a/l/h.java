/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.f;
import java.util.Comparator;

enum h implements Comparator
{
    a;


    public int a(char[] arrc, char[] arrc2) {
        int n2 = Math.min(arrc.length, arrc2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = f.a(arrc[i2], arrc2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrc.length - arrc2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((char[])object, (char[])object2);
    }
}

