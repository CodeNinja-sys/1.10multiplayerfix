/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;

class il {
    int c;
    int d;
    int e;
    final /* synthetic */ hk f;

    il(hk hk2, int n2, int n3, int n4) {
        this.f = hk2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    il(hk hk2, int n2) {
        this.f = hk2;
        this.c = n2;
        this.d = 0;
    }

    final int a() {
        return this.d == 0 ? this.c : 2;
    }

    int a(int n2) {
        return (this.f.a(n2, this.c) & this.d) >>> this.e;
    }

    int b(int n2) {
        return (this.f.f(this.c) & this.d) >>> this.e;
    }
}

