/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

public class b
extends RuntimeException {
    private static final long b = 8486587136871052495L;
    protected Throwable a = null;

    public b() {
    }

    public b(String string) {
        super(string);
    }

    public b(Throwable throwable) {
        this(throwable == null ? null : throwable.toString(), throwable);
    }

    public b(String string, Throwable throwable) {
        super(string + " (Caused by " + throwable + ")");
        this.a = throwable;
    }

    public Throwable getCause() {
        return this.a;
    }
}

