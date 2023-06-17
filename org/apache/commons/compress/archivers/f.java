/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

import org.apache.commons.compress.archivers.b;

public class f
extends b {
    private static final long a = 1L;
    private final String b;

    public f(String string) {
        super("The " + string + " doesn't support streaming.");
        this.b = string;
    }

    public String a() {
        return this.b;
    }
}

