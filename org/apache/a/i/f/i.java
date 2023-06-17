/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.InterruptedIOException;

public class i
extends InterruptedIOException {
    private static final long a = 4973849966012490112L;

    public i(String string) {
        super(string);
    }

    public i(String string, Throwable throwable) {
        super(string);
        if (throwable != null) {
            this.initCause(throwable);
        }
    }
}

