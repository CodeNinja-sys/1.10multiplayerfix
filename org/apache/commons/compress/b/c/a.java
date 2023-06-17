/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.LZMAInputStream
 */
package org.apache.commons.compress.b.c;

import java.io.InputStream;
import org.apache.commons.compress.b.b;
import org.tukaani.xz.LZMAInputStream;

public class a
extends b {
    private final InputStream a;

    public a(InputStream inputStream) {
        this.a = new LZMAInputStream(inputStream);
    }

    public int read() {
        int n2 = this.a.read();
        this.a(n2 == -1 ? 0 : 1);
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.a.read(arrby, n2, n3);
        this.a(n4);
        return n4;
    }

    public long skip(long l2) {
        return this.a.skip(l2);
    }

    public int available() {
        return this.a.available();
    }

    public void close() {
        this.a.close();
    }
}

