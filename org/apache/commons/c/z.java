/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

public class z
extends UnsupportedOperationException {
    private static final long a = 20131021L;
    private final String b;

    public z(String string) {
        this(string, (String)null);
    }

    public z(Throwable throwable) {
        this(throwable, null);
    }

    public z(String string, Throwable throwable) {
        this(string, throwable, null);
    }

    public z(String string, String string2) {
        super(string);
        this.b = string2;
    }

    public z(Throwable throwable, String string) {
        super(throwable);
        this.b = string;
    }

    public z(String string, Throwable throwable, String string2) {
        super(string, throwable);
        this.b = string2;
    }

    public String a() {
        return this.b;
    }
}

