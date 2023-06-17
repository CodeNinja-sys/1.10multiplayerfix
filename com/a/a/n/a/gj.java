/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import java.util.logging.Level;
import java.util.logging.Logger;

final class gj
implements Thread.UncaughtExceptionHandler {
    private static final Logger a = Logger.getLogger(gj.class.getName());
    private final Runtime b;

    gj(Runtime runtime) {
        this.b = runtime;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        try {
            a.log(Level.SEVERE, String.format("Caught an exception in %s.  Shutting down.", thread), throwable);
        }
        catch (Throwable throwable2) {
            System.err.println(throwable.getMessage());
            System.err.println(throwable2.getMessage());
        }
        finally {
            this.b.exit(1);
        }
    }
}

