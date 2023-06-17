/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.OutputStream;

class k
extends OutputStream {
    @Override
    public void close() {
    }

    @Override
    public void flush() {
        System.err.flush();
    }

    @Override
    public void write(byte[] arrby) {
        System.err.write(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        System.err.write(arrby, n2, n3);
    }

    @Override
    public void write(int n2) {
        System.err.write(n2);
    }
}

