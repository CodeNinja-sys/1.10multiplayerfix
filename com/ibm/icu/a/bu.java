/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bp;

class bu {
    protected bp a;
    protected int b;
    protected int c;

    int a() {
        return this.b;
    }

    int a(int n2) {
        return -1;
    }

    protected int b(int n2) {
        if (n2 < 0 || this.b <= n2) {
            return -1;
        }
        return 0x60000000 | bp.a(this.a).charAt(this.c + n2);
    }

    protected int c(int n2) {
        if (n2 < 0 || this.b <= n2) {
            return -1;
        }
        return bp.a(this.a, this.c + 4 * n2);
    }

    bu(bp bp2) {
        this.a = bp2;
    }
}

