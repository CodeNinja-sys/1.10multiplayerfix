/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;
import com.ibm.icu.d.ae;
import com.ibm.icu.d.bm;

class bn
extends bm {
    private static int[] d = new int[]{4212310, 4216507, 4216511, 4219507, 4219509, 4219569, 4219579, 4219612, 4219734, 4224342, 4224476, 4239702, 4242262, 4242774, 4242875, 4242895, 4242908, 4250289, 4250795, 4250801, 4829526, 5652566, 5652568, 5652578, 5652579, 5652595, 5652597, 5652600, 5652634, 5652657, 5652667, 5652669, 5652671, 5652698, 5652700, 5658688, 5681494, 5689152, 5812566, 6533462, 6536534, 6795606, 6926678, 7582038, 7909718, 10137942, 11223138, 11383126, 11616354, 11621952, 11622095, 11639360, 11645248, 12271714, 12271836, 12300630, 12408384, 12434240, 13582434, 13582556, 13611350, 14332314, 14461760, 14463318};

    bn() {
    }

    public String a() {
        return "IBM420_ltr";
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

