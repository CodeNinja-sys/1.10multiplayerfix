/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

public class v {
    public static final v a = new v("encryption");
    public static final v b = new v("compression method");
    public static final v c = new v("data descriptor");
    public static final v d = new v("splitting");
    private final String e;

    private v(String string) {
        this.e = string;
    }

    public String toString() {
        return this.e;
    }
}

