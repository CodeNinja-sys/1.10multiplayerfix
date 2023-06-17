/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.IOException;

public class s
extends IOException {
    private static final long a = 1L;

    public s(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }

    public s(Throwable throwable) {
        super(throwable == null ? null : throwable.toString());
        this.initCause(throwable);
    }
}

