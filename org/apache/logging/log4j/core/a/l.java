/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.OutputStream;

class l
extends OutputStream {
    @Override
    public void close() {
    }

    @Override
    public void flush() {
        System.out.flush();
    }

    @Override
    public void write(byte[] arrby) {
        System.out.write(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        System.out.write(arrby, n2, n3);
    }

    @Override
    public void write(int n2) {
        System.out.write(n2);
    }
}

