/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class aw {
    static final Logger a = Logger.getLogger(aw.class.getName());

    private aw() {
    }

    public static void a(Closeable closeable, boolean bl2) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException iOException) {
            if (bl2) {
                a.log(Level.WARNING, "IOException thrown while closing Closeable.", iOException);
            }
            throw iOException;
        }
    }

    public static void a(InputStream inputStream) {
        try {
            aw.a(inputStream, true);
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    public static void a(Reader reader) {
        try {
            aw.a(reader, true);
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

