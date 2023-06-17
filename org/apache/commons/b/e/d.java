/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.IOException;
import java.io.OutputStream;

public class d
extends OutputStream {
    public static final d a = new d();

    @Override
    public void write(int n2) {
        throw new IOException("write(" + n2 + ") failed: stream is closed");
    }
}

