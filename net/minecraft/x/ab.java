/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

public final class ab
extends RuntimeException {
    public static final ab a = new ab();

    private ab() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

