/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.dd;
import com.ibm.icu.d.de;

class dg {
    int a;
    int b;

    private dg() {
    }

    void a() {
        this.b = 0;
        this.a = 0;
    }

    void a(dg dg2) {
        this.a = dg2.a;
        this.b = dg2.b;
    }

    void a(int n2) {
        this.a |= 1 << n2;
    }

    void b(int n2) {
        this.b |= 1 << n2;
    }

    public String toString() {
        return "missingFieldMask: " + dd.c(this.a) + ", extraFieldMask: " + dd.c(this.b);
    }

    /* synthetic */ dg(de de2) {
        this();
    }
}

