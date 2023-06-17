/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import org.apache.logging.log4j.core.h.h;

final class i
extends h {
    private final char a;

    i(char c2) {
        this.a = c2;
    }

    @Override
    public int a(char[] arrc, int n2, int n3, int n4) {
        return this.a == arrc[n2] ? 1 : 0;
    }
}

