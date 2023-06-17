/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import java.util.Arrays;

public class ae
extends RuntimeException {
    private static final long a = 7186453858343358280L;
    private final StackTraceElement[] b = this.getStackTrace();

    public ae() {
    }

    public ae(String string) {
        super(string);
    }

    public ae(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ae(Throwable throwable) {
        super(throwable);
    }

    public int hashCode() {
        StackTraceElement[] arrstackTraceElement = this.b;
        int n2 = 0;
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            n2 = n2 * 31 + stackTraceElement.hashCode();
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ae)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        return Arrays.equals(this.b, ((ae)object).b);
    }
}

