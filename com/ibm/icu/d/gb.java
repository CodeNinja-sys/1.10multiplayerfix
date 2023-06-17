/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fp;
import com.ibm.icu.d.fv;
import com.ibm.icu.d.fw;
import com.ibm.icu.d.ga;
import com.ibm.icu.d.gc;
import com.ibm.icu.d.gm;

final class gb
extends fv {
    private gb() {
    }

    protected gm a(int n2) {
        return (n2 & 0x20) != 0 ? fw.a(ga.a()) : fw.a(gc.a());
    }

    /* synthetic */ gb(fp fp2) {
        this();
    }
}

