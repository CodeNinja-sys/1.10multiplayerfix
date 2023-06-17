/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;
import org.apache.commons.b.c.o;
import org.apache.commons.b.f;

public class u
extends o
implements DataInput {
    public u(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public boolean readBoolean() {
        return 0 != this.readByte();
    }

    @Override
    public byte readByte() {
        return (byte)this.in.read();
    }

    @Override
    public char readChar() {
        return (char)this.readShort();
    }

    @Override
    public double readDouble() {
        return f.g(this.in);
    }

    @Override
    public float readFloat() {
        return f.f(this.in);
    }

    @Override
    public void readFully(byte[] arrby) {
        this.readFully(arrby, 0, arrby.length);
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) {
        int n4;
        for (int i2 = n3; i2 > 0; i2 -= n4) {
            int n5 = n2 + n3 - i2;
            n4 = this.read(arrby, n5, i2);
            if (-1 != n4) continue;
            throw new EOFException();
        }
    }

    @Override
    public int readInt() {
        return f.c(this.in);
    }

    @Override
    public String readLine() {
        throw new UnsupportedOperationException("Operation not supported: readLine()");
    }

    @Override
    public long readLong() {
        return f.e(this.in);
    }

    @Override
    public short readShort() {
        return f.a(this.in);
    }

    @Override
    public int readUnsignedByte() {
        return this.in.read();
    }

    @Override
    public int readUnsignedShort() {
        return f.b(this.in);
    }

    @Override
    public String readUTF() {
        throw new UnsupportedOperationException("Operation not supported: readUTF()");
    }

    @Override
    public int skipBytes(int n2) {
        return (int)this.in.skip(n2);
    }
}

