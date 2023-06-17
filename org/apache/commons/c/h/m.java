/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.Arrays;
import org.apache.commons.c.h.k;

final class m
extends k {
    private final char[] a;

    m(char[] arrc) {
        this.a = (char[])arrc.clone();
        Arrays.sort(this.a);
    }

    @Override
    public int a(char[] arrc, int n2, int n3, int n4) {
        return Arrays.binarySearch(this.a, arrc[n2]) >= 0 ? 1 : 0;
    }
}

