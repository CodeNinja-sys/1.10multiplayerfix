/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;

class ii {
    int b;
    int c;
    final /* synthetic */ hk d;

    ii(hk hk2, int n2, int n3) {
        this.d = hk2;
        this.b = n2;
        this.c = n3;
    }

    ii(hk hk2, int n2) {
        this.d = hk2;
        this.b = n2;
        this.c = 0;
    }

    final int a() {
        return this.c == 0 ? this.b : 2;
    }

    boolean a(int n2) {
        return (this.d.a(n2, this.b) & this.c) != 0;
    }
}

