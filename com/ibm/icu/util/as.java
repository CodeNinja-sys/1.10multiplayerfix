/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.af;
import com.ibm.icu.util.bl;
import com.ibm.icu.util.cm;
import com.ibm.icu.util.dg;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import java.util.Date;

public class as
extends af {
    private static final long aC = 8156297445349501985L;
    private static final int aD = -2332;
    private static final dj aE;

    public as() {
        this(dj.p(), dn.a(dr.b));
    }

    public as(Date date) {
        this(dj.p(), dn.a(dr.b));
        this.a(date);
    }

    public as(dj dj2, dn dn2) {
        super(dj2, dn2, -2332, aE);
    }

    public String b() {
        return "dangi";
    }

    static {
        bl bl2 = new bl("GMT+8", 28800000, 0);
        long[] arrl = new long[]{-2302128000000L};
        long[] arrl2 = new long[]{-2270592000000L};
        long[] arrl3 = new long[]{-1829088000000L};
        dg dg2 = new dg("Korean 1897", 25200000, 0, arrl, 1);
        dg dg3 = new dg("Korean 1898-1911", 28800000, 0, arrl2, 1);
        dg dg4 = new dg("Korean 1912-", 32400000, 0, arrl3, 1);
        cm cm2 = new cm("KOREA_ZONE", bl2);
        cm2.a(dg2);
        cm2.a(dg3);
        cm2.a(dg4);
        cm2.g();
        aE = cm2;
    }
}

