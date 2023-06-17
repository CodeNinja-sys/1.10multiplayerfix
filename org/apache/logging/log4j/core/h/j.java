/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import java.util.Arrays;
import org.apache.logging.log4j.core.h.h;

final class j
extends h {
    private final char[] a;

    j(char[] arrc) {
        this.a = (char[])arrc.clone();
        Arrays.sort(this.a);
    }

    @Override
    public int a(char[] arrc, int n2, int n3, int n4) {
        return Arrays.binarySearch(this.a, arrc[n2]) >= 0 ? 1 : 0;
    }
}

