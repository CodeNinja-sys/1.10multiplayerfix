/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.d;

import java.io.IOException;

public final class f
extends IOException {
    private static final long a = 1L;

    public f(String string) {
        super(string);
    }

    public f(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }

    public f(Throwable throwable) {
        this.initCause(throwable);
    }
}

