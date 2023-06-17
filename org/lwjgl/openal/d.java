/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import org.lwjgl.openal.AL10;

public class d
extends RuntimeException {
    private static final long a = 1L;

    public d() {
    }

    public d(int n2) {
        super("OpenAL error: " + AL10.h(n2) + " (" + n2 + ")");
    }

    public d(String string) {
        super(string);
    }

    public d(String string, Throwable throwable) {
        super(string, throwable);
    }

    public d(Throwable throwable) {
        super(throwable);
    }
}

