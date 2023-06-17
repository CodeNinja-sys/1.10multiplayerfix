/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

public final class aj {
    public static final aj a = new aj("always");
    public static final aj b = new aj("never");
    public static final aj c = new aj("not encodeable");
    private final String d;

    private aj(String string) {
        this.d = string;
    }

    public String toString() {
        return this.d;
    }
}

