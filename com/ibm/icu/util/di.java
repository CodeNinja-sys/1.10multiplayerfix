/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cb;
import com.ibm.icu.util.dh;

public class di
extends cb {
    public di(Number number, dh dh2) {
        super(number, dh2);
    }

    public di(double d2, dh dh2) {
        super(new Double(d2), dh2);
    }

    public dh a() {
        return (dh)this.c();
    }
}

