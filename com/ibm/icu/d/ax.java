/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;

class ax {
    int a = 0;
    int b = 0;
    int c = 0;
    boolean d = false;
    boolean e = false;

    ax() {
    }

    void a() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.d = false;
        this.e = false;
    }

    int a(ad ad2) {
        if (this.c >= ad2.g) {
            this.e = true;
            return -1;
        }
        int n2 = ad2.f[this.c++] & 0xFF;
        return n2;
    }
}

