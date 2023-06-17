/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import org.apache.commons.c.b.l;

public class k
extends RuntimeException {
    private static final long a = -6582182735562919670L;

    protected k() {
    }

    public k(Throwable throwable) {
        super(l.a(throwable));
    }

    public k(String string, Throwable throwable) {
        super(string, l.a(throwable));
    }
}

