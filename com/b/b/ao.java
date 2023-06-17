/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

class ao {
    ao() {
    }

    static int a(int n2) {
        int n3 = 0;
        while (n2 != 0) {
            ++n3;
            n2 >>>= 1;
        }
        return n3;
    }

    static int b(int n2) {
        int n3 = 0;
        while (n2 > 1) {
            ++n3;
            n2 >>>= 1;
        }
        return n3;
    }

    static int c(int n2) {
        int n3 = 0;
        while (n2 != 0) {
            n3 += n2 & 1;
            n2 >>>= 1;
        }
        return n3;
    }
}

