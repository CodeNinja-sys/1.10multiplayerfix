/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

public class n
extends IllegalStateException {
    private static final long a = -2507492394288153468L;

    public n() {
    }

    public n(int n2) {
        this("refCnt: " + n2);
    }

    public n(int n2, int n3) {
        this("refCnt: " + n2 + ", " + (n3 > 0 ? "increment: " + n3 : "decrement: " + -n3));
    }

    public n(String string) {
        super(string);
    }

    public n(String string, Throwable throwable) {
        super(string, throwable);
    }

    public n(Throwable throwable) {
        super(throwable);
    }
}

