/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fa;
import com.ibm.icu.d.fe;
import com.ibm.icu.d.fg;

public class fd
extends fg {
    private fe a;

    public fe h() {
        return this.a;
    }

    public String toString() {
        return "{REPLACE_NUMBER}";
    }

    private fd(fe fe2) {
        super(null);
        this.a = fe2;
    }

    private static fd a() {
        return new fd(fe.c);
    }

    /* synthetic */ fd(fe fe2, fa fa2) {
        this(fe2);
    }

    static /* synthetic */ fd i() {
        return fd.a();
    }
}

