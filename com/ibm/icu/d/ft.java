/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fp;
import com.ibm.icu.d.fs;
import com.ibm.icu.d.fu;
import com.ibm.icu.d.fv;
import com.ibm.icu.d.fw;
import com.ibm.icu.d.gm;

final class ft
extends fv {
    private ft() {
    }

    protected gm a(int n2) {
        return (n2 & 0x20) != 0 ? fw.a(fs.a()) : fw.a(fu.a());
    }

    /* synthetic */ ft(fp fp2) {
        this();
    }
}

