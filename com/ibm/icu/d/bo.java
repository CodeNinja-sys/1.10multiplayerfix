/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.bm;

class bo
extends bm {
    private static int[] d = new int[]{4216497, 4216509, 4216918, 4233905, 4238300, 4239793, 4242365, 4247382, 5652566, 5654080, 5661504, 5666112, 5681472, 5681481, 5681494, 5681496, 5681507, 5681511, 5681513, 5681523, 5681528, 5681562, 5681581, 5681595, 5681615, 5681628, 5684032, 5684544, 5684579, 5783638, 6438998, 6439083, 6439089, 6439099, 6439119, 6504534, 7553110, 7561792, 7684182, 7692864, 7880790, 10109014, 10138074, 11263040, 11616342, 11625024, 11655744, 11656256, 12271702, 12277312, 12280384, 12303680, 12402774, 12533846, 12539456, 13588145, 13614400, 14303318, 14434390, 14434491, 14434511, 14443072, 14447936, 14466368};

    bo() {
    }

    public String a() {
        return "IBM420_rtl";
    }

    public ae a(ad ad2) {
        byte[] arrby = ad2.a;
        int n2 = ad2.b;
        ad2.a = this.a(arrby, n2);
        ad2.b = ad2.a.length;
        int n3 = this.a(ad2, d, b, (byte)64);
        ad2.a = arrby;
        ad2.b = n2;
        return n3 == 0 ? null : new ae(ad2, this, n3);
    }
}
