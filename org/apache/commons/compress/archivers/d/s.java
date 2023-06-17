/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import org.apache.commons.compress.archivers.d.i;

public class s
extends i {
    private static final long a = 1L;

    public s() {
        super("this file uses an unsupported compression algorithm.");
    }

    public s(String string) {
        super("this file uses an unsupported compression algorithm: " + string + ".");
    }
}

