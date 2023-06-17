/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.z;
import com.a.a.l.q;
import com.a.a.l.u;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class ch
extends FilterInputStream
implements DataInput {
    public ch(InputStream inputStream) {
        super((InputStream)cl.a(inputStream));
    }

    @Override
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override
    public void readFully(byte[] arrby) {
        z.a((InputStream)this, arrby);
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) {
        z.a(this, arrby, n2, n3);
    }

    @Override
    public int skipBytes(int n2) {
        return (int)this.in.skip(n2);
    }

    @Override
    public int readUnsignedByte() {
        int n2 = this.in.read();
        if (0 > n2) {
            throw new EOFException();
        }
        return n2;
    }

    @Override
    public int readUnsignedShort() {
        byte by2 = this.a();
        byte by3 = this.a();
        return q.a((byte)0, (byte)0, by3, by2);
    }

    @Override
    public int readInt() {
        byte by2 = this.a();
        byte by3 = this.a();
        byte by4 = this.a();
        byte by5 = this.a();
        return q.a(by5, by4, by3, by2);
    }

    @Override
    public long readLong() {
        byte by2 = this.a();
        byte by3 = this.a();
        byte by4 = this.a();
        byte by5 = this.a();
        byte by6 = this.a();
        byte by7 = this.a();
        byte by8 = this.a();
        byte by9 = this.a();
        return u.a(by9, by8, by7, by6, by5, by4, by3, by2);
    }

    @Override
    public float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }

    @Override
    public double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }

    @Override
    public String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    @Override
    public short readShort() {
        return (short)this.readUnsignedShort();
    }

    @Override
    public char readChar() {
        return (char)this.readUnsignedShort();
    }

    @Override
    public byte readByte() {
        return (byte)this.readUnsignedByte();
    }

    @Override
    public boolean readBoolean() {
        return this.readUnsignedByte() != 0;
    }

    private byte a() {
        int n2 = this.in.read();
        if (-1 == n2) {
            throw new EOFException();
        }
        return (byte)n2;
    }
}

