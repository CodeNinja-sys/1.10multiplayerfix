/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import org.apache.commons.compress.archivers.h.m;

class ao {
    private final char[] a;
    private m b;

    ao(char[] arrc) {
        this.a = arrc;
    }

    public synchronized m a() {
        if (this.b == null) {
            this.b = new m(this.a);
        }
        return this.b;
    }
}

