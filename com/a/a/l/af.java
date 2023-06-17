/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.ae;
import java.util.Comparator;

enum af implements Comparator
{
    a;


    public int a(byte[] arrby, byte[] arrby2) {
        int n2 = Math.min(arrby.length, arrby2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = ae.a(arrby[i2], arrby2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrby.length - arrby2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byte[])object, (byte[])object2);
    }
}

