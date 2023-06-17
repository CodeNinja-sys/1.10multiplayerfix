/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public class ck
extends IllegalArgumentException {
    private static final long a = 3789261542830211225L;

    public ck(String string) {
        super(string);
    }

    public ck(Throwable throwable) {
        super(throwable);
    }

    public ck(String string, Throwable throwable) {
        super(string, throwable);
    }

    public synchronized ck a(Throwable throwable) {
        return (ck)super.initCause(throwable);
    }

    public /* synthetic */ Throwable initCause(Throwable throwable) {
        return this.a(throwable);
    }
}

