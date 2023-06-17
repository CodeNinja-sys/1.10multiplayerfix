/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.l.u;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public class ci
extends FilterOutputStream
implements DataOutput {
    public ci(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream)cl.a(outputStream)));
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.out.write(arrby, n2, n3);
    }

    @Override
    public void writeBoolean(boolean bl2) {
        ((DataOutputStream)this.out).writeBoolean(bl2);
    }

    @Override
    public void writeByte(int n2) {
        ((DataOutputStream)this.out).writeByte(n2);
    }

    @Override
    public void writeBytes(String string) {
        ((DataOutputStream)this.out).writeBytes(string);
    }

    @Override
    public void writeChar(int n2) {
        this.writeShort(n2);
    }

    @Override
    public void writeChars(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            this.writeChar(string.charAt(i2));
        }
    }

    @Override
    public void writeDouble(double d2) {
        this.writeLong(Double.doubleToLongBits(d2));
    }

    @Override
    public void writeFloat(float f2) {
        this.writeInt(Float.floatToIntBits(f2));
    }

    @Override
    public void writeInt(int n2) {
        this.out.write(0xFF & n2);
        this.out.write(0xFF & n2 >> 8);
        this.out.write(0xFF & n2 >> 16);
        this.out.write(0xFF & n2 >> 24);
    }

    @Override
    public void writeLong(long l2) {
        byte[] arrby = u.b(Long.reverseBytes(l2));
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public void writeShort(int n2) {
        this.out.write(0xFF & n2);
        this.out.write(0xFF & n2 >> 8);
    }

    @Override
    public void writeUTF(String string) {
        ((DataOutputStream)this.out).writeUTF(string);
    }

    @Override
    public void close() {
        this.out.close();
    }
}

