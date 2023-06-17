/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.f.ab;
import org.apache.commons.compress.archivers.f.ac;
import org.apache.commons.compress.archivers.f.ad;
import org.apache.commons.compress.archivers.f.c;
import org.apache.commons.compress.archivers.f.d;
import org.apache.commons.compress.archivers.f.e;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.h;
import org.apache.commons.compress.archivers.f.r;
import org.apache.commons.compress.archivers.f.u;
import org.apache.commons.compress.archivers.f.w;
import org.apache.commons.compress.archivers.f.x;
import org.apache.commons.compress.c.b;
import org.apache.commons.compress.c.i;

public class v
implements Closeable {
    static final int a = 32;
    private RandomAccessFile c;
    private final c d;
    private int e = -1;
    private int f = -1;
    private InputStream g = null;
    private InputStream h = null;
    private byte[] i;
    static final byte[] b = new byte[]{55, 122, -68, -81, 39, 28};

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public v(File file, byte[] arrby) {
        boolean bl2 = false;
        this.c = new RandomAccessFile(file, "r");
        try {
            this.d = this.b(arrby);
            if (arrby != null) {
                this.i = new byte[arrby.length];
                System.arraycopy(arrby, 0, this.i, 0, arrby.length);
            } else {
                this.i = null;
            }
            bl2 = true;
        }
        finally {
            if (!bl2) {
                this.c.close();
            }
        }
    }

    public v(File file) {
        this(file, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        if (this.c != null) {
            try {
                this.c.close();
            }
            finally {
                this.c = null;
                if (this.i != null) {
                    Arrays.fill(this.i, (byte)0);
                }
                this.i = null;
            }
        }
    }

    public u a() {
        if (this.e >= this.d.g.length - 1) {
            return null;
        }
        ++this.e;
        u u2 = this.d.g[this.e];
        this.c();
        return u2;
    }

    private c b(byte[] arrby) {
        byte[] arrby2 = new byte[6];
        this.c.readFully(arrby2);
        if (!Arrays.equals(arrby2, b)) {
            throw new IOException("Bad 7z signature");
        }
        byte by2 = this.c.readByte();
        byte by3 = this.c.readByte();
        if (by2 != 0) {
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", by2, by3));
        }
        long l2 = 0xFFFFFFFFL & (long)Integer.reverseBytes(this.c.readInt());
        ab ab2 = this.a(l2);
        int n2 = (int)ab2.b;
        if ((long)n2 != ab2.b) {
            throw new IOException("cannot handle nextHeaderSize " + ab2.b);
        }
        this.c.seek(32L + ab2.a);
        byte[] arrby3 = new byte[n2];
        this.c.readFully(arrby3);
        CRC32 cRC32 = new CRC32();
        cRC32.update(arrby3);
        if (ab2.c != cRC32.getValue()) {
            throw new IOException("NextHeader CRC mismatch");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby3);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        c c2 = new c();
        int n3 = dataInputStream.readUnsignedByte();
        if (n3 == 23) {
            dataInputStream = this.a(dataInputStream, c2, arrby);
            c2 = new c();
            n3 = dataInputStream.readUnsignedByte();
        }
        if (n3 != 1) {
            throw new IOException("Broken or unsupported archive: no Header");
        }
        this.a((DataInput)dataInputStream, c2);
        dataInputStream.close();
        return c2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ab a(long l2) {
        ab ab2 = new ab();
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new org.apache.commons.compress.c.c((InputStream)new e(this.c, 20L), 20L, l2));
            ab2.a = Long.reverseBytes(((DataInputStream)filterInputStream).readLong());
            ab2.b = Long.reverseBytes(((DataInputStream)filterInputStream).readLong());
            ab2.c = 0xFFFFFFFFL & (long)Integer.reverseBytes(((DataInputStream)filterInputStream).readInt());
            ab ab3 = ab2;
            return ab3;
        }
        finally {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
        }
    }

    private void a(DataInput dataInput, c c2) {
        int n2 = dataInput.readUnsignedByte();
        if (n2 == 2) {
            this.a(dataInput);
            n2 = dataInput.readUnsignedByte();
        }
        if (n2 == 3) {
            throw new IOException("Additional streams unsupported");
        }
        if (n2 == 4) {
            this.b(dataInput, c2);
            n2 = dataInput.readUnsignedByte();
        }
        if (n2 == 5) {
            this.f(dataInput, c2);
            n2 = dataInput.readUnsignedByte();
        }
        if (n2 != 0) {
            throw new IOException("Badly terminated header");
        }
    }

    private void a(DataInput dataInput) {
        int n2 = dataInput.readUnsignedByte();
        while (n2 != 0) {
            long l2 = v.c(dataInput);
            byte[] arrby = new byte[(int)l2];
            dataInput.readFully(arrby);
            n2 = dataInput.readUnsignedByte();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private DataInputStream a(DataInputStream dataInputStream, c c2, byte[] arrby) {
        Object object2;
        this.b((DataInput)dataInputStream, c2);
        r r2 = c2.e[0];
        boolean bl2 = false;
        long l2 = 32L + c2.a + 0L;
        this.c.seek(l2);
        InputStream inputStream = new e(this.c, c2.b[0]);
        for (Object object2 : r2.a()) {
            if (((f)object2).b != 1L || ((f)object2).c != 1L) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            inputStream = org.apache.commons.compress.archivers.f.h.a(inputStream, (f)object2, arrby);
        }
        if (r2.g) {
            inputStream = new org.apache.commons.compress.c.c(inputStream, r2.b(), r2.h);
        }
        Object object3 = new byte[(int)r2.b()];
        object2 = new DataInputStream(inputStream);
        try {
            ((DataInputStream)object2).readFully((byte[])object3);
        }
        finally {
            ((FilterInputStream)object2).close();
        }
        return new DataInputStream(new ByteArrayInputStream((byte[])object3));
    }

    private void b(DataInput dataInput, c c2) {
        int n2 = dataInput.readUnsignedByte();
        if (n2 == 6) {
            this.c(dataInput, c2);
            n2 = dataInput.readUnsignedByte();
        }
        if (n2 == 7) {
            this.d(dataInput, c2);
            n2 = dataInput.readUnsignedByte();
        } else {
            c2.e = new r[0];
        }
        if (n2 == 8) {
            this.e(dataInput, c2);
            n2 = dataInput.readUnsignedByte();
        }
        if (n2 != 0) {
            throw new IOException("Badly terminated StreamsInfo");
        }
    }

    private void c(DataInput dataInput, c c2) {
        int n2;
        c2.a = v.c(dataInput);
        long l2 = v.c(dataInput);
        int n3 = dataInput.readUnsignedByte();
        if (n3 == 9) {
            c2.b = new long[(int)l2];
            for (n2 = 0; n2 < c2.b.length; ++n2) {
                c2.b[n2] = v.c(dataInput);
            }
            n3 = dataInput.readUnsignedByte();
        }
        if (n3 == 10) {
            c2.c = this.a(dataInput, (int)l2);
            c2.d = new long[(int)l2];
            for (n2 = 0; n2 < (int)l2; ++n2) {
                if (!c2.c.get(n2)) continue;
                c2.d[n2] = 0xFFFFFFFFL & (long)Integer.reverseBytes(dataInput.readInt());
            }
            n3 = dataInput.readUnsignedByte();
        }
        if (n3 != 0) {
            throw new IOException("Badly terminated PackInfo (" + n3 + ")");
        }
    }

    private void d(DataInput dataInput, c c2) {
        int n2 = dataInput.readUnsignedByte();
        if (n2 != 11) {
            throw new IOException("Expected kFolder, got " + n2);
        }
        long l2 = v.c(dataInput);
        r[] arrr = new r[(int)l2];
        c2.e = arrr;
        int n3 = dataInput.readUnsignedByte();
        if (n3 != 0) {
            throw new IOException("External unsupported");
        }
        for (int i2 = 0; i2 < (int)l2; ++i2) {
            arrr[i2] = this.b(dataInput);
        }
        n2 = dataInput.readUnsignedByte();
        if (n2 != 12) {
            throw new IOException("Expected kCodersUnpackSize, got " + n2);
        }
        for (r r2 : arrr) {
            r2.f = new long[(int)r2.c];
            int n4 = 0;
            while ((long)n4 < r2.c) {
                r2.f[n4] = v.c(dataInput);
                ++n4;
            }
        }
        n2 = dataInput.readUnsignedByte();
        if (n2 == 10) {
            BitSet bitSet = this.a(dataInput, (int)l2);
            for (int i3 = 0; i3 < (int)l2; ++i3) {
                if (bitSet.get(i3)) {
                    arrr[i3].g = true;
                    arrr[i3].h = 0xFFFFFFFFL & (long)Integer.reverseBytes(dataInput.readInt());
                    continue;
                }
                arrr[i3].g = false;
            }
            n2 = dataInput.readUnsignedByte();
        }
        if (n2 != 0) {
            throw new IOException("Badly terminated UnpackInfo");
        }
    }

    private void e(DataInput dataInput, c c2) {
        for (r r2 : c2.e) {
            r2.i = 1;
        }
        int n2 = c2.e.length;
        int n3 = dataInput.readUnsignedByte();
        if (n3 == 13) {
            n2 = 0;
            for (r r3 : c2.e) {
                long l2 = v.c(dataInput);
                r3.i = (int)l2;
                n2 = (int)((long)n2 + l2);
            }
            n3 = dataInput.readUnsignedByte();
        }
        ad ad2 = new ad();
        ad2.a = new long[n2];
        ad2.b = new BitSet(n2);
        ad2.c = new long[n2];
        int n4 = 0;
        for (r r4 : c2.e) {
            if (r4.i == 0) continue;
            long l3 = 0L;
            if (n3 == 9) {
                for (int i2 = 0; i2 < r4.i - 1; ++i2) {
                    long l4 = v.c(dataInput);
                    ad2.a[n4++] = l4;
                    l3 += l4;
                }
            }
            ad2.a[n4++] = r4.b() - l3;
        }
        if (n3 == 9) {
            n3 = dataInput.readUnsignedByte();
        }
        int n5 = 0;
        for (r r5 : c2.e) {
            if (r5.i == 1 && r5.g) continue;
            n5 += r5.i;
        }
        if (n3 == 10) {
            int n6;
            BitSet bitSet = this.a(dataInput, n5);
            long[] arrl = new long[n5];
            for (n6 = 0; n6 < n5; ++n6) {
                if (!bitSet.get(n6)) continue;
                arrl[n6] = 0xFFFFFFFFL & (long)Integer.reverseBytes(dataInput.readInt());
            }
            n6 = 0;
            int n7 = 0;
            for (r r6 : c2.e) {
                if (r6.i == 1 && r6.g) {
                    ad2.b.set(n6, true);
                    ad2.c[n6] = r6.h;
                    ++n6;
                    continue;
                }
                for (int i3 = 0; i3 < r6.i; ++i3) {
                    ad2.b.set(n6, bitSet.get(n7));
                    ad2.c[n6] = arrl[n7];
                    ++n6;
                    ++n7;
                }
            }
            n3 = dataInput.readUnsignedByte();
        }
        if (n3 != 0) {
            throw new IOException("Badly terminated SubStreamsInfo");
        }
        c2.f = ad2;
    }

    private r b(DataInput dataInput) {
        int n2;
        r r2 = new r();
        long l2 = v.c(dataInput);
        f[] arrf = new f[(int)l2];
        long l3 = 0L;
        long l4 = 0L;
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrf[i2] = new f();
            int n3 = dataInput.readUnsignedByte();
            int n4 = n3 & 0xF;
            n2 = (n3 & 0x10) == 0 ? 1 : 0;
            boolean bl2 = (n3 & 0x20) != 0;
            boolean bl3 = (n3 & 0x80) != 0;
            arrf[i2].a = new byte[n4];
            dataInput.readFully(arrf[i2].a);
            if (n2 != 0) {
                arrf[i2].b = 1L;
                arrf[i2].c = 1L;
            } else {
                arrf[i2].b = v.c(dataInput);
                arrf[i2].c = v.c(dataInput);
            }
            l3 += arrf[i2].b;
            l4 += arrf[i2].c;
            if (bl2) {
                long l5 = v.c(dataInput);
                arrf[i2].d = new byte[(int)l5];
                dataInput.readFully(arrf[i2].d);
            }
            if (!bl3) continue;
            throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
        }
        r2.a = arrf;
        r2.b = l3;
        r2.c = l4;
        if (l4 == 0L) {
            throw new IOException("Total output streams can't be 0");
        }
        long l6 = l4 - 1L;
        d[] arrd = new d[(int)l6];
        for (n2 = 0; n2 < arrd.length; ++n2) {
            arrd[n2] = new d();
            arrd[n2].a = v.c(dataInput);
            arrd[n2].b = v.c(dataInput);
        }
        r2.d = arrd;
        if (l3 < l6) {
            throw new IOException("Total input streams can't be less than the number of bind pairs");
        }
        long l7 = l3 - l6;
        long[] arrl = new long[(int)l7];
        if (l7 == 1L) {
            int n5;
            for (n5 = 0; n5 < (int)l3 && r2.a(n5) >= 0; ++n5) {
            }
            if (n5 == (int)l3) {
                throw new IOException("Couldn't find stream's bind pair index");
            }
            arrl[0] = n5;
        } else {
            for (int i3 = 0; i3 < (int)l7; ++i3) {
                arrl[i3] = v.c(dataInput);
            }
        }
        r2.e = arrl;
        return r2;
    }

    private BitSet a(DataInput dataInput, int n2) {
        BitSet bitSet;
        int n3 = dataInput.readUnsignedByte();
        if (n3 != 0) {
            bitSet = new BitSet(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                bitSet.set(i2, true);
            }
        } else {
            bitSet = this.b(dataInput, n2);
        }
        return bitSet;
    }

    private BitSet b(DataInput dataInput, int n2) {
        BitSet bitSet = new BitSet(n2);
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (n3 == 0) {
                n3 = 128;
                n4 = dataInput.readUnsignedByte();
            }
            bitSet.set(i2, (n4 & n3) != 0);
            n3 >>>= 1;
        }
        return bitSet;
    }

    private void f(DataInput dataInput, c c2) {
        int n2;
        long l2 = v.c(dataInput);
        u[] arru = new u[(int)l2];
        for (int i2 = 0; i2 < arru.length; ++i2) {
            arru[i2] = new u();
        }
        BitSet bitSet = null;
        BitSet bitSet2 = null;
        BitSet bitSet3 = null;
        block13: while ((n2 = dataInput.readUnsignedByte()) != 0) {
            long l3 = v.c(dataInput);
            switch (n2) {
                case 14: {
                    bitSet = this.b(dataInput, arru.length);
                    break;
                }
                case 15: {
                    if (bitSet == null) {
                        throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
                    }
                    bitSet2 = this.b(dataInput, bitSet.cardinality());
                    break;
                }
                case 16: {
                    if (bitSet == null) {
                        throw new IOException("Header format error: kEmptyStream must appear before kAnti");
                    }
                    bitSet3 = this.b(dataInput, bitSet.cardinality());
                    break;
                }
                case 17: {
                    int n3 = dataInput.readUnsignedByte();
                    if (n3 != 0) {
                        throw new IOException("Not implemented");
                    }
                    if ((l3 - 1L & 1L) != 0L) {
                        throw new IOException("File names length invalid");
                    }
                    byte[] arrby = new byte[(int)(l3 - 1L)];
                    dataInput.readFully(arrby);
                    int n4 = 0;
                    int n5 = 0;
                    for (int i3 = 0; i3 < arrby.length; i3 += 2) {
                        if (arrby[i3] != 0 || arrby[i3 + 1] != 0) continue;
                        arru[n4++].a(new String(arrby, n5, i3 - n5, "UTF-16LE"));
                        n5 = i3 + 2;
                    }
                    if (n5 == arrby.length && n4 == arru.length) continue block13;
                    throw new IOException("Error parsing file names");
                }
                case 18: {
                    int n4;
                    BitSet bitSet4 = this.a(dataInput, arru.length);
                    int n6 = dataInput.readUnsignedByte();
                    if (n6 != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n4 = 0; n4 < arru.length; ++n4) {
                        arru[n4].d(bitSet4.get(n4));
                        if (!arru[n4].d()) continue;
                        arru[n4].a(Long.reverseBytes(dataInput.readLong()));
                    }
                    continue block13;
                }
                case 19: {
                    int n4;
                    BitSet bitSet5 = this.a(dataInput, arru.length);
                    int n7 = dataInput.readUnsignedByte();
                    if (n7 != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n4 = 0; n4 < arru.length; ++n4) {
                        arru[n4].f(bitSet5.get(n4));
                        if (!arru[n4].g()) continue;
                        arru[n4].c(Long.reverseBytes(dataInput.readLong()));
                    }
                    continue block13;
                }
                case 20: {
                    int n4;
                    BitSet bitSet6 = this.a(dataInput, arru.length);
                    int n8 = dataInput.readUnsignedByte();
                    if (n8 != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n4 = 0; n4 < arru.length; ++n4) {
                        arru[n4].e(bitSet6.get(n4));
                        if (!arru[n4].f()) continue;
                        arru[n4].b(Long.reverseBytes(dataInput.readLong()));
                    }
                    continue block13;
                }
                case 21: {
                    int n4;
                    BitSet bitSet7 = this.a(dataInput, arru.length);
                    int n9 = dataInput.readUnsignedByte();
                    if (n9 != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n4 = 0; n4 < arru.length; ++n4) {
                        arru[n4].g(bitSet7.get(n4));
                        if (!arru[n4].i()) continue;
                        arru[n4].a(Integer.reverseBytes(dataInput.readInt()));
                    }
                    continue block13;
                }
                case 24: {
                    throw new IOException("kStartPos is unsupported, please report");
                }
                case 25: {
                    throw new IOException("kDummy is unsupported, please report");
                }
                default: {
                    throw new IOException("Unknown property " + n2);
                }
            }
        }
        n2 = 0;
        int n10 = 0;
        for (int i4 = 0; i4 < arru.length; ++i4) {
            arru[i4].a(bitSet == null ? true : !bitSet.get(i4));
            if (arru[i4].b()) {
                arru[i4].b(false);
                arru[i4].c(false);
                arru[i4].h(c2.f.b.get(n2));
                arru[i4].d(c2.f.c[n2]);
                arru[i4].f(c2.f.a[n2]);
                ++n2;
                continue;
            }
            arru[i4].b(bitSet2 == null ? true : !bitSet2.get(n10));
            arru[i4].c(bitSet3 == null ? false : bitSet3.get(n10));
            arru[i4].h(false);
            arru[i4].f(0L);
            ++n10;
        }
        c2.g = arru;
        this.a(c2);
    }

    private void a(c c2) {
        int n2;
        ac ac2 = new ac();
        int n3 = 0;
        int n4 = c2.e != null ? c2.e.length : 0;
        ac2.a = new int[n4];
        for (int i2 = 0; i2 < n4; ++i2) {
            ac2.a[i2] = n3;
            n3 += c2.e[i2].e.length;
        }
        long l2 = 0L;
        int n5 = c2.b != null ? c2.b.length : 0;
        ac2.b = new long[n5];
        for (n2 = 0; n2 < n5; ++n2) {
            ac2.b[n2] = l2;
            l2 += c2.b[n2];
        }
        ac2.c = new int[n4];
        ac2.d = new int[c2.g.length];
        n2 = 0;
        int n6 = 0;
        for (int i3 = 0; i3 < c2.g.length; ++i3) {
            if (!c2.g[i3].b() && n6 == 0) {
                ac2.d[i3] = -1;
                continue;
            }
            if (n6 == 0) {
                while (n2 < c2.e.length) {
                    ac2.c[n2] = i3;
                    if (c2.e[n2].i > 0) break;
                    ++n2;
                }
                if (n2 >= c2.e.length) {
                    throw new IOException("Too few folders in archive");
                }
            }
            ac2.d[i3] = n2++;
            if (!c2.g[i3].b() || ++n6 < c2.e[n2].i) continue;
            n6 = 0;
        }
        c2.h = ac2;
    }

    private void c() {
        Object object;
        int n2 = this.d.h.d[this.e];
        if (n2 < 0) {
            this.h = new b(new ByteArrayInputStream(new byte[0]), 0L);
            return;
        }
        u u2 = this.d.g[this.e];
        if (this.f == n2) {
            this.d();
            u2.a(this.d.g[this.e - 1].q());
        } else {
            this.f = n2;
            if (this.g != null) {
                this.g.close();
                this.g = null;
            }
            object = this.d.e[n2];
            int n3 = this.d.h.a[n2];
            long l2 = 32L + this.d.a + this.d.h.b[n3];
            this.g = this.a((r)object, l2, n3, u2);
        }
        object = new b(this.g, u2.getSize());
        this.h = u2.k() ? new org.apache.commons.compress.c.c((InputStream)object, u2.getSize(), u2.m()) : object;
    }

    private void d() {
        if (this.h != null) {
            org.apache.commons.compress.c.i.a(this.h, Long.MAX_VALUE);
            this.h.close();
            this.h = null;
        }
    }

    private InputStream a(r r2, long l2, int n2, u u2) {
        this.c.seek(l2);
        InputStream inputStream = new e(this.c, this.d.b[n2]);
        LinkedList<x> linkedList = new LinkedList<x>();
        for (f f2 : r2.a()) {
            if (f2.b != 1L || f2.c != 1L) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            w w2 = w.a(f2.a);
            inputStream = org.apache.commons.compress.archivers.f.h.a(inputStream, f2, this.i);
            linkedList.addFirst(new x(w2, org.apache.commons.compress.archivers.f.h.a(w2).a(f2, inputStream)));
        }
        u2.a(linkedList);
        if (r2.g) {
            return new org.apache.commons.compress.c.c(inputStream, r2.b(), r2.h);
        }
        return inputStream;
    }

    public int b() {
        if (this.h == null) {
            throw new IllegalStateException("No current 7z entry");
        }
        return this.h.read();
    }

    public int a(byte[] arrby) {
        return this.a(arrby, 0, arrby.length);
    }

    public int a(byte[] arrby, int n2, int n3) {
        if (this.h == null) {
            throw new IllegalStateException("No current 7z entry");
        }
        return this.h.read(arrby, n2, n3);
    }

    private static long c(DataInput dataInput) {
        long l2 = dataInput.readUnsignedByte();
        int n2 = 128;
        long l3 = 0L;
        for (int i2 = 0; i2 < 8; ++i2) {
            if ((l2 & (long)n2) == 0L) {
                return l3 | (l2 & (long)(n2 - 1)) << 8 * i2;
            }
            long l4 = dataInput.readUnsignedByte();
            l3 |= l4 << 8 * i2;
            n2 >>>= 1;
        }
        return l3;
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < b.length) {
            return false;
        }
        for (int i2 = 0; i2 < b.length; ++i2) {
            if (arrby[i2] == b[i2]) continue;
            return false;
        }
        return true;
    }
}

