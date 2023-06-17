/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c;

import java.io.IOException;

public class f
extends IOException {
    private static final long a = -5596590843227115865L;

    public f() {
    }

    public f(String string) {
        super(string);
    }

    public f(Throwable throwable) {
        this.initCause(throwable);
    }

    public f(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

