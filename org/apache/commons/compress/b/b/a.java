/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.b;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.b.b;
import org.apache.commons.compress.b.b.c;

public class a
extends b {
    private static final int b = 2;
    private static final int c = 4;
    private static final int d = 8;
    private static final int e = 16;
    private static final int f = 224;
    private final InputStream g;
    private final boolean h;
    private final byte[] i = new byte[8192];
    private int j = 0;
    private Inflater k = new Inflater(true);
    private final CRC32 l = new CRC32();
    private int m;
    private boolean n = false;
    private final byte[] o = new byte[1];
    private final c p = new c();

    public a(InputStream inputStream) {
        this(inputStream, false);
    }

    public a(InputStream inputStream, boolean bl2) {
        this.g = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
        this.h = bl2;
        this.a(true);
    }

    public c a() {
        return this.p;
    }

    private boolean a(boolean bl2) {
        assert (bl2 || this.h);
        int n2 = this.g.read();
        int n3 = this.g.read();
        if (n2 == -1 && !bl2) {
            return false;
        }
        if (n2 != 31 || n3 != 139) {
            throw new IOException(bl2 ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        DataInputStream dataInputStream = new DataInputStream(this.g);
        int n4 = dataInputStream.readUnsignedByte();
        if (n4 != 8) {
            throw new IOException("Unsupported compression method " + n4 + " in the .gz header");
        }
        int n5 = dataInputStream.readUnsignedByte();
        if ((n5 & 0xE0) != 0) {
            throw new IOException("Reserved flags are set in the .gz header");
        }
        this.p.a((long)(this.b(dataInputStream) * 1000));
        switch (dataInputStream.readUnsignedByte()) {
            case 2: {
                this.p.a(9);
                break;
            }
            case 4: {
                this.p.a(1);
                break;
            }
        }
        this.p.b(dataInputStream.readUnsignedByte());
        if ((n5 & 4) != 0) {
            int n6 = dataInputStream.readUnsignedByte();
            n6 |= dataInputStream.readUnsignedByte() << 8;
            while (n6-- > 0) {
                dataInputStream.readUnsignedByte();
            }
        }
        if ((n5 & 8) != 0) {
            this.p.a(new String(this.a(dataInputStream), "ISO-8859-1"));
        }
        if ((n5 & 0x10) != 0) {
            this.p.b(new String(this.a(dataInputStream), "ISO-8859-1"));
        }
        if ((n5 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.k.reset();
        this.l.reset();
        this.m = 0;
        return true;
    }

    private byte[] a(DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = 0;
        while ((n2 = dataInputStream.readUnsignedByte()) != 0) {
            byteArrayOutputStream.write(n2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private int b(DataInputStream dataInputStream) {
        return dataInputStream.readUnsignedByte() | dataInputStream.readUnsignedByte() << 8 | dataInputStream.readUnsignedByte() << 16 | dataInputStream.readUnsignedByte() << 24;
    }

    public int read() {
        return this.read(this.o, 0, 1) == -1 ? -1 : this.o[0] & 0xFF;
    }

    public int read(byte[] arrby, int n2, int n3) {
        if (this.n) {
            return -1;
        }
        int n4 = 0;
        while (n3 > 0) {
            int n5;
            int n6;
            if (this.k.needsInput()) {
                this.g.mark(this.i.length);
                this.j = this.g.read(this.i);
                if (this.j == -1) {
                    throw new EOFException();
                }
                this.k.setInput(this.i, 0, this.j);
            }
            try {
                n6 = this.k.inflate(arrby, n2, n3);
            }
            catch (DataFormatException dataFormatException) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
            this.l.update(arrby, n2, n6);
            this.m += n6;
            n2 += n6;
            n3 -= n6;
            n4 += n6;
            this.a(n6);
            if (!this.k.finished()) continue;
            this.g.reset();
            int n7 = this.j - this.k.getRemaining();
            if (this.g.skip(n7) != (long)n7) {
                throw new IOException();
            }
            this.j = 0;
            DataInputStream dataInputStream = new DataInputStream(this.g);
            long l2 = 0L;
            for (n5 = 0; n5 < 4; ++n5) {
                l2 |= (long)dataInputStream.readUnsignedByte() << n5 * 8;
            }
            if (l2 != this.l.getValue()) {
                throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
            }
            n5 = 0;
            for (int i2 = 0; i2 < 4; ++i2) {
                n5 |= dataInputStream.readUnsignedByte() << i2 * 8;
            }
            if (n5 != this.m) {
                throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
            }
            if (this.h && this.a(false)) continue;
            this.k.end();
            this.k = null;
            this.n = true;
            return n4 == 0 ? -1 : n4;
        }
        return n4;
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < 2) {
            return false;
        }
        if (arrby[0] != 31) {
            return false;
        }
        return arrby[1] == -117;
    }

    public void close() {
        if (this.k != null) {
            this.k.end();
            this.k = null;
        }
        if (this.g != System.in) {
            this.g.close();
        }
    }
}

