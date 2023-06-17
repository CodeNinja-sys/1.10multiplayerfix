/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.m;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

class ae
implements m {
    final DataInput a;

    ae(ByteArrayInputStream byteArrayInputStream) {
        this.a = new DataInputStream(byteArrayInputStream);
    }

    @Override
    public void readFully(byte[] arrby) {
        try {
            this.a.readFully(arrby);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) {
        try {
            this.a.readFully(arrby, n2, n3);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public int skipBytes(int n2) {
        try {
            return this.a.skipBytes(n2);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public boolean readBoolean() {
        try {
            return this.a.readBoolean();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public byte readByte() {
        try {
            return this.a.readByte();
        }
        catch (EOFException eOFException) {
            throw new IllegalStateException(eOFException);
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    @Override
    public int readUnsignedByte() {
        try {
            return this.a.readUnsignedByte();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public short readShort() {
        try {
            return this.a.readShort();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public int readUnsignedShort() {
        try {
            return this.a.readUnsignedShort();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public char readChar() {
        try {
            return this.a.readChar();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public int readInt() {
        try {
            return this.a.readInt();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public long readLong() {
        try {
            return this.a.readLong();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public float readFloat() {
        try {
            return this.a.readFloat();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public double readDouble() {
        try {
            return this.a.readDouble();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public String readLine() {
        try {
            return this.a.readLine();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    @Override
    public String readUTF() {
        try {
            return this.a.readUTF();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }
}

