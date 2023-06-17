/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.ap;
import java.io.InputStream;
import java.io.RandomAccessFile;

class aq
extends InputStream {
    RandomAccessFile a = null;
    final String b = "r";
    final /* synthetic */ ap c;

    aq(ap ap2, String string) {
        this.c = ap2;
        this.a = new RandomAccessFile(string, "r");
    }

    public int read() {
        return this.a.read();
    }

    public int read(byte[] arrby) {
        return this.a.read(arrby);
    }

    public int read(byte[] arrby, int n2, int n3) {
        return this.a.read(arrby, n2, n3);
    }

    public long skip(long l2) {
        return this.a.skipBytes((int)l2);
    }

    public long a() {
        return this.a.length();
    }

    public long b() {
        return this.a.getFilePointer();
    }

    public int available() {
        return this.a.length() == this.a.getFilePointer() ? 0 : 1;
    }

    public void close() {
        this.a.close();
    }

    public synchronized void mark(int n2) {
    }

    public synchronized void reset() {
    }

    public boolean markSupported() {
        return false;
    }

    public void a(long l2) {
        this.a.seek(l2);
    }
}

