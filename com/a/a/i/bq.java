/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class bq {
    private static final Logger a = Logger.getLogger(bq.class.getName());

    private bq() {
    }

    public static void a(Flushable flushable, boolean bl2) {
        try {
            flushable.flush();
        }
        catch (IOException iOException) {
            if (bl2) {
                a.log(Level.WARNING, "IOException thrown while flushing Flushable.", iOException);
            }
            throw iOException;
        }
    }

    public static void a(Flushable flushable) {
        try {
            bq.a(flushable, true);
        }
        catch (IOException iOException) {
            a.log(Level.SEVERE, "IOException should not have been thrown.", iOException);
        }
    }
}

