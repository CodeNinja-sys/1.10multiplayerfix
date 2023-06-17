/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fp;
import com.ibm.icu.d.fv;
import com.ibm.icu.d.fw;
import com.ibm.icu.d.gg;
import com.ibm.icu.d.gi;
import com.ibm.icu.d.gm;

final class gh
extends fv {
    private gh() {
    }

    protected gm a(int n2) {
        return (n2 & 0x20) != 0 ? fw.a(gg.a()) : fw.a(gi.a());
    }

    /* synthetic */ gh(fp fp2) {
        this();
    }
}

