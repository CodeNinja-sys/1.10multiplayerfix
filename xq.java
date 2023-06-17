/*
 * Decompiled with CFR 0.150.
 */
public final class xq
extends RuntimeException {
    public static final xq a = new xq();

    private xq() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

