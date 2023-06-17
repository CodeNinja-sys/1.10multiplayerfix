/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.util.Map;

class p {
    final String a;
    final int b;
    final int c;
    final int d;
    final int e;
    final boolean f;
    final Map g;

    p(String string, Map map, int n2, int n3, int n4, boolean bl2) {
        this.a = string;
        this.b = n2;
        this.c = (n2 - 1 & n2) == 0 ? p.a(n2) : 0;
        this.d = n3;
        this.e = n4;
        this.f = bl2;
        this.g = map;
    }

    private static int a(int n2) {
        int n3 = -1;
        while (n2 > 0) {
            ++n3;
            n2 >>= 1;
        }
        return n3;
    }
}

