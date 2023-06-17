/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.b;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.apache.commons.compress.b.c;

public class b
extends c {
    private static final int a = 8;
    private static final int b = 16;
    private final OutputStream c;
    private final Deflater d;
    private final byte[] e = new byte[512];
    private boolean f;
    private final CRC32 g = new CRC32();

    public b(OutputStream outputStream) {
        this(outputStream, new org.apache.commons.compress.b.b.c());
    }

    public b(OutputStream outputStream, org.apache.commons.compress.b.b.c c2) {
        this.c = outputStream;
        this.d = new Deflater(c2.a(), true);
        this.a(c2);
    }

    private void a(org.apache.commons.compress.b.b.c c2) {
        String string = c2.c();
        String string2 = c2.d();
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short)-29921);
        byteBuffer.put((byte)8);
        byteBuffer.put((byte)((string != null ? 8 : 0) | (string2 != null ? 16 : 0)));
        byteBuffer.putInt((int)(c2.b() / 1000L));
        int n2 = c2.a();
        if (n2 == 9) {
            byteBuffer.put((byte)2);
        } else if (n2 == 1) {
            byteBuffer.put((byte)4);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.put((byte)c2.e());
        this.c.write(byteBuffer.array());
        if (string != null) {
            this.c.write(string.getBytes("ISO-8859-1"));
            this.c.write(0);
        }
        if (string2 != null) {
            this.c.write(string2.getBytes("ISO-8859-1"));
            this.c.write(0);
        }
    }

    private void b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt((int)this.g.getValue());
        byteBuffer.putInt(this.d.getTotalIn());
        this.c.write(byteBuffer.array());
    }

    public void write(int n2) {
        this.write(new byte[]{(byte)(n2 & 0xFF)}, 0, 1);
    }

    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (this.d.finished()) {
            throw new IOException("Cannot write more data, the end of the compressed data stream has been reached");
        }
        if (n3 > 0) {
            this.d.setInput(arrby, n2, n3);
            while (!this.d.needsInput()) {
                this.c();
            }
            this.g.update(arrby, n2, n3);
        }
    }

    private void c() {
        int n2 = this.d.deflate(this.e, 0, this.e.length);
        if (n2 > 0) {
            this.c.write(this.e, 0, n2);
        }
    }

    public void a() {
        if (!this.d.finished()) {
            this.d.finish();
            while (!this.d.finished()) {
                this.c();
            }
            this.b();
        }
    }

    public void flush() {
        this.c.flush();
    }

    public void close() {
        if (!this.f) {
            this.a();
            this.d.end();
            this.c.close();
            this.f = true;
        }
    }
}

