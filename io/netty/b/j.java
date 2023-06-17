/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.g;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;

public class j
extends InputStream
implements DataInput {
    private final g a;
    private final int b;
    private final int c;
    private final StringBuilder d = new StringBuilder();

    public j(g g2) {
        this(g2, g2.r());
    }

    public j(g g2, int n2) {
        if (g2 == null) {
            throw new NullPointerException("buffer");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("length: " + n2);
        }
        if (n2 > g2.r()) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - Needs " + n2 + ", maximum is " + g2.r());
        }
        this.a = g2;
        this.b = g2.p();
        this.c = this.b + n2;
        g2.x();
    }

    public int a() {
        return this.a.p() - this.b;
    }

    @Override
    public int available() {
        return this.c - this.a.p();
    }

    @Override
    public void mark(int n2) {
        this.a.x();
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() {
        if (!this.a.u()) {
            return -1;
        }
        return this.a.E() & 0xFF;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.available();
        if (n4 == 0) {
            return -1;
        }
        n3 = Math.min(n4, n3);
        this.a.a(arrby, n2, n3);
        return n3;
    }

    @Override
    public void reset() {
        this.a.y();
    }

    @Override
    public long skip(long l2) {
        if (l2 > Integer.MAX_VALUE) {
            return this.skipBytes(Integer.MAX_VALUE);
        }
        return this.skipBytes((int)l2);
    }

    @Override
    public boolean readBoolean() {
        this.a(1);
        return this.read() != 0;
    }

    @Override
    public byte readByte() {
        if (!this.a.u()) {
            throw new EOFException();
        }
        return this.a.E();
    }

    @Override
    public char readChar() {
        return (char)this.readShort();
    }

    @Override
    public double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }

    @Override
    public float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }

    @Override
    public void readFully(byte[] arrby) {
        this.readFully(arrby, 0, arrby.length);
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) {
        this.a(n3);
        this.a.a(arrby, n2, n3);
    }

    @Override
    public int readInt() {
        this.a(4);
        return this.a.K();
    }

    @Override
    public String readLine() {
        this.d.setLength(0);
        block4: while (true) {
            if (!this.a.u()) {
                return this.d.length() > 0 ? this.d.toString() : null;
            }
            short s2 = this.a.F();
            switch (s2) {
                case 10: {
                    break block4;
                }
                case 13: {
                    if (!this.a.u() || (char)this.a.n(this.a.p()) != '\n') break block4;
                    this.a.A(1);
                    break block4;
                }
                default: {
                    this.d.append((char)s2);
                    continue block4;
                }
            }
            break;
        }
        return this.d.toString();
    }

    @Override
    public long readLong() {
        this.a(8);
        return this.a.M();
    }

    @Override
    public short readShort() {
        this.a(2);
        return this.a.G();
    }

    @Override
    public String readUTF() {
        return DataInputStream.readUTF(this);
    }

    @Override
    public int readUnsignedByte() {
        return this.readByte() & 0xFF;
    }

    @Override
    public int readUnsignedShort() {
        return this.readShort() & 0xFFFF;
    }

    @Override
    public int skipBytes(int n2) {
        int n3 = Math.min(this.available(), n2);
        this.a.A(n3);
        return n3;
    }

    private void a(int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("fieldSize cannot be a negative number");
        }
        if (n2 > this.available()) {
            throw new EOFException("fieldSize is too long! Length is " + n2 + ", but maximum is " + this.available());
        }
    }
}

