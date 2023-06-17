/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.io.IOException;

public class i
extends IOException {
    private static final long a = 1L;

    public i() {
    }

    public i(String string) {
        super(string);
    }

    public i(Throwable throwable) {
        this.initCause(throwable);
    }

    public i(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

