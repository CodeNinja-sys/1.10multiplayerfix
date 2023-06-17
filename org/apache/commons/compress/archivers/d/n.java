/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import org.apache.commons.compress.archivers.d.i;

public class n
extends i {
    private static final long b = 1L;
    protected long a;

    public n() {
        super("there was an error decoding a tape segment");
    }

    public n(long l2) {
        super("there was an error decoding a tape segment header at offset " + l2 + ".");
        this.a = l2;
    }

    public long a() {
        return this.a;
    }
}

