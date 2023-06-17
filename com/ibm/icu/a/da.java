/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cv;
import com.ibm.icu.a.cx;
import com.ibm.icu.a.cz;
import com.ibm.icu.util.dn;

abstract class da
extends cx {
    private final String a;

    protected da(String string) {
        this.a = string;
    }

    public cv a(dn dn2) {
        return new cz(this.a, dn2);
    }
}

