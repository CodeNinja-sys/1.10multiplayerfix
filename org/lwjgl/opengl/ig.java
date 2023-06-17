/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.iy;

public class ig
extends RuntimeException {
    private static final long a = 1L;

    public ig(int n2) {
        this(ig.a(n2));
    }

    private static String a(int n2) {
        String string = iy.a(n2);
        return string + " (" + n2 + ")";
    }

    public ig() {
    }

    public ig(String string) {
        super(string);
    }

    public ig(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ig(Throwable throwable) {
        super(throwable);
    }
}

