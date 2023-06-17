/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.b;
import org.apache.commons.compress.archivers.b.d;
import org.apache.commons.compress.archivers.b.h;
import org.apache.commons.compress.c.i;

public class c
extends org.apache.commons.compress.archivers.c {
    private static final int a = 96;
    private static final int b = 234;
    private final DataInputStream c;
    private final String d;
    private final h e;
    private d f = null;
    private InputStream g = null;

    public c(InputStream inputStream, String string) {
        this.c = new DataInputStream(inputStream);
        this.d = string;
        try {
            this.e = this.h();
            if ((this.e.d & 1) != 0) {
                throw new b("Encrypted ARJ files are unsupported");
            }
            if ((this.e.d & 4) != 0) {
                throw new b("Multi-volume ARJ files are unsupported");
            }
        }
        catch (IOException iOException) {
            throw new b(iOException.getMessage(), iOException);
        }
    }

    public c(InputStream inputStream) {
        this(inputStream, "CP437");
    }

    public void close() {
        this.c.close();
    }

    private int a(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readUnsignedByte();
        this.a(1);
        return n2;
    }

    private int b(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readUnsignedShort();
        this.a(2);
        return Integer.reverseBytes(n2) >>> 16;
    }

    private int c(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readInt();
        this.a(4);
        return Integer.reverseBytes(n2);
    }

    private String d(DataInputStream dataInputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((n2 = dataInputStream.readUnsignedByte()) != 0) {
            byteArrayOutputStream.write(n2);
        }
        if (this.d != null) {
            return new String(byteArrayOutputStream.toByteArray(), this.d);
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    private void a(DataInputStream dataInputStream, byte[] arrby) {
        dataInputStream.readFully(arrby);
        this.a(arrby.length);
    }

    private byte[] g() {
        boolean bl2 = false;
        byte[] arrby = null;
        do {
            int n2 = 0;
            int n3 = this.a(this.c);
            do {
                n2 = n3;
                n3 = this.a(this.c);
            } while (n2 != 96 && n3 != 234);
            int n4 = this.b(this.c);
            if (n4 == 0) {
                return null;
            }
            if (n4 > 2600) continue;
            arrby = new byte[n4];
            this.a(this.c, arrby);
            long l2 = (long)this.c(this.c) & 0xFFFFFFFFL;
            CRC32 cRC32 = new CRC32();
            cRC32.update(arrby);
            if (l2 != cRC32.getValue()) continue;
            bl2 = true;
        } while (!bl2);
        return arrby;
    }

    private h h() {
        byte[] arrby = this.g();
        if (arrby == null) {
            throw new IOException("Archive ends without any headers");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrby));
        int n2 = dataInputStream.readUnsignedByte();
        byte[] arrby2 = new byte[n2 - 1];
        dataInputStream.readFully(arrby2);
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(arrby2));
        h h2 = new h();
        h2.a = dataInputStream2.readUnsignedByte();
        h2.b = dataInputStream2.readUnsignedByte();
        h2.c = dataInputStream2.readUnsignedByte();
        h2.d = dataInputStream2.readUnsignedByte();
        h2.e = dataInputStream2.readUnsignedByte();
        h2.f = dataInputStream2.readUnsignedByte();
        h2.g = dataInputStream2.readUnsignedByte();
        h2.h = this.c(dataInputStream2);
        h2.i = this.c(dataInputStream2);
        h2.j = 0xFFFFFFFFL & (long)this.c(dataInputStream2);
        h2.k = this.c(dataInputStream2);
        h2.l = this.b(dataInputStream2);
        h2.m = this.b(dataInputStream2);
        this.b(20L);
        h2.n = dataInputStream2.readUnsignedByte();
        h2.o = dataInputStream2.readUnsignedByte();
        if (n2 >= 33) {
            h2.p = dataInputStream2.readUnsignedByte();
            h2.q = dataInputStream2.readUnsignedByte();
            dataInputStream2.readUnsignedByte();
            dataInputStream2.readUnsignedByte();
        }
        h2.r = this.d(dataInputStream);
        h2.s = this.d(dataInputStream);
        int n3 = this.b(this.c);
        if (n3 > 0) {
            h2.t = new byte[n3];
            this.a(this.c, h2.t);
            long l2 = 0xFFFFFFFFL & (long)this.c(this.c);
            CRC32 cRC32 = new CRC32();
            cRC32.update(h2.t);
            if (l2 != cRC32.getValue()) {
                throw new IOException("Extended header CRC32 verification failure");
            }
        }
        return h2;
    }

    private d i() {
        int n2;
        byte[] arrby = this.g();
        if (arrby == null) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrby));
        int n3 = dataInputStream.readUnsignedByte();
        byte[] arrby2 = new byte[n3 - 1];
        dataInputStream.readFully(arrby2);
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(arrby2));
        d d2 = new d();
        d2.a = dataInputStream2.readUnsignedByte();
        d2.b = dataInputStream2.readUnsignedByte();
        d2.c = dataInputStream2.readUnsignedByte();
        d2.d = dataInputStream2.readUnsignedByte();
        d2.e = dataInputStream2.readUnsignedByte();
        d2.f = dataInputStream2.readUnsignedByte();
        d2.g = dataInputStream2.readUnsignedByte();
        d2.h = this.c(dataInputStream2);
        d2.i = 0xFFFFFFFFL & (long)this.c(dataInputStream2);
        d2.j = 0xFFFFFFFFL & (long)this.c(dataInputStream2);
        d2.k = 0xFFFFFFFFL & (long)this.c(dataInputStream2);
        d2.l = this.b(dataInputStream2);
        d2.m = this.b(dataInputStream2);
        this.b(20L);
        d2.n = dataInputStream2.readUnsignedByte();
        d2.o = dataInputStream2.readUnsignedByte();
        this.a(n3, dataInputStream2, d2);
        d2.t = this.d(dataInputStream);
        d2.u = this.d(dataInputStream);
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        while ((n2 = this.b(this.c)) > 0) {
            byte[] arrby3 = new byte[n2];
            this.a(this.c, arrby3);
            long l2 = 0xFFFFFFFFL & (long)this.c(this.c);
            CRC32 cRC32 = new CRC32();
            cRC32.update(arrby3);
            if (l2 != cRC32.getValue()) {
                throw new IOException("Extended header CRC32 verification failure");
            }
            arrayList.add(arrby3);
        }
        d2.v = (byte[][])arrayList.toArray((T[])new byte[arrayList.size()][]);
        return d2;
    }

    private void a(int n2, DataInputStream dataInputStream, d d2) {
        if (n2 >= 33) {
            d2.p = this.c(dataInputStream);
            if (n2 >= 45) {
                d2.q = this.c(dataInputStream);
                d2.r = this.c(dataInputStream);
                d2.s = this.c(dataInputStream);
                this.b(12L);
            }
            this.b(4L);
        }
    }

    public static boolean a(byte[] arrby, int n2) {
        return n2 >= 2 && (0xFF & arrby[0]) == 96 && (0xFF & arrby[1]) == 234;
    }

    public String d() {
        return this.e.r;
    }

    public String e() {
        return this.e.s;
    }

    public org.apache.commons.compress.archivers.b.a f() {
        if (this.g != null) {
            i.a(this.g, Long.MAX_VALUE);
            this.g.close();
            this.f = null;
            this.g = null;
        }
        this.f = this.i();
        if (this.f != null) {
            this.g = new org.apache.commons.compress.c.b(this.c, this.f.i);
            if (this.f.e == 0) {
                this.g = new org.apache.commons.compress.c.c(this.g, this.f.j, this.f.k);
            }
            return new org.apache.commons.compress.archivers.b.a(this.f);
        }
        this.g = null;
        return null;
    }

    public boolean a(a a2) {
        return a2 instanceof org.apache.commons.compress.archivers.b.a && ((org.apache.commons.compress.archivers.b.a)a2).f() == 0;
    }

    public int read(byte[] arrby, int n2, int n3) {
        if (this.f == null) {
            throw new IllegalStateException("No current arj entry");
        }
        if (this.f.e != 0) {
            throw new IOException("Unsupported compression method " + this.f.e);
        }
        return this.g.read(arrby, n2, n3);
    }

    public /* synthetic */ a a() {
        return this.f();
    }
}

