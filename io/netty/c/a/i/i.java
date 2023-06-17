/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.c.a.i.c;
import io.netty.c.a.i.d;
import io.netty.c.a.i.e;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.StreamCorruptedException;

public class i
extends InputStream
implements ObjectInput {
    private final DataInputStream a;
    private final int b;
    private final c c;

    public i(InputStream inputStream) {
        this(inputStream, null);
    }

    public i(InputStream inputStream, ClassLoader classLoader) {
        this(inputStream, classLoader, 0x100000);
    }

    public i(InputStream inputStream, int n2) {
        this(inputStream, null, n2);
    }

    public i(InputStream inputStream, ClassLoader classLoader, int n2) {
        if (inputStream == null) {
            throw new NullPointerException("in");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxObjectSize: " + n2);
        }
        this.a = inputStream instanceof DataInputStream ? (DataInputStream)inputStream : new DataInputStream(inputStream);
        this.c = d.b(classLoader);
        this.b = n2;
    }

    @Override
    public Object readObject() {
        int n2 = this.readInt();
        if (n2 <= 0) {
            throw new StreamCorruptedException("invalid data length: " + n2);
        }
        if (n2 > this.b) {
            throw new StreamCorruptedException("data length too big: " + n2 + " (max: " + this.b + ')');
        }
        return new e(this.a, this.c).readObject();
    }

    @Override
    public int available() {
        return this.a.available();
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public void mark(int n2) {
        this.a.mark(n2);
    }

    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override
    public int read() {
        return this.a.read();
    }

    @Override
    public final int read(byte[] arrby, int n2, int n3) {
        return this.a.read(arrby, n2, n3);
    }

    @Override
    public final int read(byte[] arrby) {
        return this.a.read(arrby);
    }

    @Override
    public final boolean readBoolean() {
        return this.a.readBoolean();
    }

    @Override
    public final byte readByte() {
        return this.a.readByte();
    }

    @Override
    public final char readChar() {
        return this.a.readChar();
    }

    @Override
    public final double readDouble() {
        return this.a.readDouble();
    }

    @Override
    public final float readFloat() {
        return this.a.readFloat();
    }

    @Override
    public final void readFully(byte[] arrby, int n2, int n3) {
        this.a.readFully(arrby, n2, n3);
    }

    @Override
    public final void readFully(byte[] arrby) {
        this.a.readFully(arrby);
    }

    @Override
    public final int readInt() {
        return this.a.readInt();
    }

    @Override
    public final String readLine() {
        return this.a.readLine();
    }

    @Override
    public final long readLong() {
        return this.a.readLong();
    }

    @Override
    public final short readShort() {
        return this.a.readShort();
    }

    @Override
    public final int readUnsignedByte() {
        return this.a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        return this.a.readUnsignedShort();
    }

    @Override
    public final String readUTF() {
        return this.a.readUTF();
    }

    @Override
    public void reset() {
        this.a.reset();
    }

    @Override
    public long skip(long l2) {
        return this.a.skip(l2);
    }

    @Override
    public final int skipBytes(int n2) {
        return this.a.skipBytes(n2);
    }
}

