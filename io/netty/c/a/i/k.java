/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.i.f;
import java.io.DataOutputStream;
import java.io.ObjectOutput;
import java.io.OutputStream;

public class k
extends OutputStream
implements ObjectOutput {
    private final DataOutputStream a;
    private final int b;

    public k(OutputStream outputStream) {
        this(outputStream, 512);
    }

    public k(OutputStream outputStream, int n2) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("estimatedLength: " + n2);
        }
        this.a = outputStream instanceof DataOutputStream ? (DataOutputStream)outputStream : new DataOutputStream(outputStream);
        this.b = n2;
    }

    @Override
    public void writeObject(Object object) {
        io.netty.b.k k2 = new io.netty.b.k(bi.a(this.b));
        f f2 = new f(k2);
        f2.writeObject(object);
        f2.flush();
        f2.close();
        g g2 = k2.b();
        int n2 = g2.r();
        this.writeInt(n2);
        g2.a(0, this, n2);
    }

    @Override
    public void write(int n2) {
        this.a.write(n2);
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public void flush() {
        this.a.flush();
    }

    public final int a() {
        return this.a.size();
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.a.write(arrby, n2, n3);
    }

    @Override
    public void write(byte[] arrby) {
        this.a.write(arrby);
    }

    @Override
    public final void writeBoolean(boolean bl2) {
        this.a.writeBoolean(bl2);
    }

    @Override
    public final void writeByte(int n2) {
        this.a.writeByte(n2);
    }

    @Override
    public final void writeBytes(String string) {
        this.a.writeBytes(string);
    }

    @Override
    public final void writeChar(int n2) {
        this.a.writeChar(n2);
    }

    @Override
    public final void writeChars(String string) {
        this.a.writeChars(string);
    }

    @Override
    public final void writeDouble(double d2) {
        this.a.writeDouble(d2);
    }

    @Override
    public final void writeFloat(float f2) {
        this.a.writeFloat(f2);
    }

    @Override
    public final void writeInt(int n2) {
        this.a.writeInt(n2);
    }

    @Override
    public final void writeLong(long l2) {
        this.a.writeLong(l2);
    }

    @Override
    public final void writeShort(int n2) {
        this.a.writeShort(n2);
    }

    @Override
    public final void writeUTF(String string) {
        this.a.writeUTF(string);
    }
}

