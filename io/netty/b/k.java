/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.g;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;

public class k
extends OutputStream
implements DataOutput {
    private final g a;
    private final int b;
    private final DataOutputStream c = new DataOutputStream(this);

    public k(g g2) {
        if (g2 == null) {
            throw new NullPointerException("buffer");
        }
        this.a = g2;
        this.b = g2.q();
    }

    public int a() {
        return this.a.q() - this.b;
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        this.a.b(arrby, n2, n3);
    }

    @Override
    public void write(byte[] arrby) {
        this.a.c(arrby);
    }

    @Override
    public void write(int n2) {
        this.a.B((byte)n2);
    }

    @Override
    public void writeBoolean(boolean bl2) {
        this.write(bl2 ? 1 : 0);
    }

    @Override
    public void writeByte(int n2) {
        this.write(n2);
    }

    @Override
    public void writeBytes(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.write((byte)string.charAt(i2));
        }
    }

    @Override
    public void writeChar(int n2) {
        this.writeShort((short)n2);
    }

    @Override
    public void writeChars(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
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
        this.a.E(n2);
    }

    @Override
    public void writeLong(long l2) {
        this.a.b(l2);
    }

    @Override
    public void writeShort(int n2) {
        this.a.C((short)n2);
    }

    @Override
    public void writeUTF(String string) {
        this.c.writeUTF(string);
    }

    public g b() {
        return this.a;
    }
}

