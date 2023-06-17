/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fa;
import com.ibm.icu.d.fd;
import com.ibm.icu.d.fe;

public class fh
extends fd {
    private String a;

    public String a() {
        return this.a;
    }

    public String toString() {
        return "\u00ab" + this.a + "\u00bb";
    }

    private fh(String string) {
        super(fe.a, null);
        this.a = string;
    }

    static /* synthetic */ String a(fh fh2, String string) {
        fh2.a = string;
        return fh2.a;
    }

    static /* synthetic */ String a(fh fh2) {
        return fh2.a;
    }

    /* synthetic */ fh(String string, fa fa2) {
        this(string);
    }
}

