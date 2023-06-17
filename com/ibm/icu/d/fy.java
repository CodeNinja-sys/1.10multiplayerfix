/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fp;
import com.ibm.icu.d.fv;
import com.ibm.icu.d.fw;
import com.ibm.icu.d.fx;
import com.ibm.icu.d.fz;
import com.ibm.icu.d.gm;

final class fy
extends fv {
    private fy() {
    }

    protected gm a(int n2) {
        return (n2 & 0x20) != 0 ? fw.a(fx.a()) : fw.a(fz.a());
    }

    /* synthetic */ fy(fp fp2) {
        this();
    }
}

