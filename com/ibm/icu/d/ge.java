/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fp;
import com.ibm.icu.d.fv;
import com.ibm.icu.d.fw;
import com.ibm.icu.d.gd;
import com.ibm.icu.d.gf;
import com.ibm.icu.d.gm;

final class ge
extends fv {
    private ge() {
    }

    protected gm a(int n2) {
        return (n2 & 0x20) != 0 ? fw.a(gd.a()) : fw.a(gf.a());
    }

    /* synthetic */ ge(fp fp2) {
        this();
    }
}

