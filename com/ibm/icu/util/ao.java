/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.aj;
import com.ibm.icu.util.cb;

public class ao
extends cb {
    public ao(Number number, aj aj2) {
        super(number, aj2);
    }

    public ao(double d2, aj aj2) {
        super(new Double(d2), aj2);
    }

    public aj a() {
        return (aj)this.c();
    }
}

