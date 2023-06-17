/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import org.apache.commons.c.h.k;

final class l
extends k {
    private final char a;

    l(char c2) {
        this.a = c2;
    }

    @Override
    public int a(char[] arrc, int n2, int n3, int n4) {
        return this.a == arrc[n2] ? 1 : 0;
    }
}

