/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

public class b
extends Exception {
    private static final long a = 2772690708123267100L;

    public b(String string) {
        super(string);
    }

    public b(String string, Exception exception) {
        super(string);
        this.initCause(exception);
    }
}

