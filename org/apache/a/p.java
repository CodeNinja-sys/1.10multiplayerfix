/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a;

public class p
extends Exception {
    private static final long a = -5437299376222011036L;

    public p() {
    }

    public p(String string) {
        super(string);
    }

    public p(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

