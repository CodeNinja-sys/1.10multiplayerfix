/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

class k
extends OutputStream {
    private final MessageDigest a;
    private boolean b;
    private byte[] c;

    k(MessageDigest messageDigest) {
        this.a = messageDigest;
        this.a.reset();
    }

    public void write(int n2) {
        if (this.b) {
            throw new IOException("Stream has been already closed");
        }
        this.a.update((byte)n2);
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (this.b) {
            throw new IOException("Stream has been already closed");
        }
        this.a.update(arrby, n2, n3);
    }

    public void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c = this.a.digest();
        super.close();
    }

    public byte[] a() {
        return this.c;
    }
}

