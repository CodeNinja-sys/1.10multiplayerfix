/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.d;
import org.apache.commons.compress.archivers.h.aa;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ai;
import org.apache.commons.compress.archivers.h.aj;
import org.apache.commons.compress.archivers.h.al;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.az;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;
import org.apache.commons.compress.archivers.h.j;
import org.apache.commons.compress.archivers.h.o;
import org.apache.commons.compress.archivers.h.p;
import org.apache.commons.compress.archivers.h.y;
import org.apache.commons.compress.archivers.h.z;
import org.apache.commons.compress.c.i;

public class ag
extends d {
    static final int b = 512;
    protected boolean c = false;
    private static final int p = 8192;
    public static final int d = 8;
    public static final int e = -1;
    public static final int f = 0;
    static final String g = "UTF8";
    public static final int h = 2048;
    private static final byte[] q = new byte[0];
    private ai r;
    private String s = "";
    private int t = -1;
    private boolean u = false;
    private int v = 8;
    private final List w = new LinkedList();
    private final CRC32 x = new CRC32();
    private long y = 0L;
    private long z = 0L;
    private long A = 0L;
    private static final byte[] B = new byte[]{0, 0};
    private static final byte[] C = new byte[]{0, 0, 0, 0};
    private final Map D = new HashMap();
    private String E = "UTF8";
    private am F = an.a("UTF8");
    protected final Deflater i = new Deflater(this.t, true);
    private final byte[] G = new byte[512];
    private final RandomAccessFile H;
    private final OutputStream I;
    private boolean J = true;
    private boolean K = false;
    private aj L = aj.b;
    private boolean M = false;
    private z N = org.apache.commons.compress.archivers.h.z.c;
    static final byte[] j = ay.b.a();
    static final byte[] k = ay.c.a();
    static final byte[] l = ay.a.a();
    static final byte[] m = ay.a(101010256L);
    static final byte[] n = ay.a(101075792L);
    static final byte[] o = ay.a(117853008L);
    private static final byte[] O = ay.a(1L);

    public ag(OutputStream outputStream) {
        this.I = outputStream;
        this.H = null;
    }

    public ag(File file) {
        FileOutputStream fileOutputStream = null;
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0L);
        }
        catch (IOException iOException) {
            org.apache.commons.compress.c.i.a(randomAccessFile);
            randomAccessFile = null;
            fileOutputStream = new FileOutputStream(file);
        }
        this.I = fileOutputStream;
        this.H = randomAccessFile;
    }

    public boolean e() {
        return this.H != null;
    }

    public void a(String string) {
        this.E = string;
        this.F = an.a(string);
        if (this.J && !an.b(string)) {
            this.J = false;
        }
    }

    public String f() {
        return this.E;
    }

    public void a(boolean bl2) {
        this.J = bl2 && an.b(this.E);
    }

    public void a(aj aj2) {
        this.L = aj2;
    }

    public void b(boolean bl2) {
        this.K = bl2;
    }

    public void a(z z2) {
        this.N = z2;
    }

    public void b() {
        if (this.c) {
            throw new IOException("This archive has already been finished");
        }
        if (this.r != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        this.z = this.y;
        for (ab ab2 : this.w) {
            this.c(ab2);
        }
        this.A = this.y - this.z;
        this.i();
        this.h();
        this.D.clear();
        this.w.clear();
        this.i.end();
        this.c = true;
    }

    public void a() {
        if (this.c) {
            throw new IOException("Stream has already been finished");
        }
        if (this.r == null) {
            throw new IOException("No current entry to close");
        }
        if (!ai.a(this.r)) {
            this.write(q, 0, 0);
        }
        this.k();
        z z2 = this.g(ai.b(this.r));
        long l2 = this.y - ai.c(this.r);
        long l3 = this.x.getValue();
        this.x.reset();
        boolean bl2 = this.a(l2, l3, z2);
        if (this.H != null) {
            this.c(bl2);
        }
        this.b(ai.b(this.r));
        this.r = null;
    }

    private void k() {
        if (ai.b(this.r).getMethod() == 8) {
            this.i.finish();
            while (!this.i.finished()) {
                this.g();
            }
        }
    }

    private boolean a(long l2, long l3, z z2) {
        boolean bl2;
        if (ai.b(this.r).getMethod() == 8) {
            ai.b(this.r).setSize(ai.d(this.r));
            ai.b(this.r).setCompressedSize(l2);
            ai.b(this.r).setCrc(l3);
            this.i.reset();
        } else if (this.H == null) {
            if (ai.b(this.r).getCrc() != l3) {
                throw new ZipException("bad CRC checksum for entry " + ai.b(this.r).getName() + ": " + Long.toHexString(ai.b(this.r).getCrc()) + " instead of " + Long.toHexString(l3));
            }
            if (ai.b(this.r).getSize() != l2) {
                throw new ZipException("bad size for entry " + ai.b(this.r).getName() + ": " + ai.b(this.r).getSize() + " instead of " + l2);
            }
        } else {
            ai.b(this.r).setSize(l2);
            ai.b(this.r).setCompressedSize(l2);
            ai.b(this.r).setCrc(l3);
        }
        boolean bl3 = bl2 = z2 == org.apache.commons.compress.archivers.h.z.a || ai.b(this.r).getSize() >= 0xFFFFFFFFL || ai.b(this.r).getCompressedSize() >= 0xFFFFFFFFL;
        if (bl2 && z2 == org.apache.commons.compress.archivers.h.z.b) {
            throw new aa(aa.a(ai.b(this.r)));
        }
        return bl2;
    }

    private void c(boolean bl2) {
        long l2 = this.H.getFilePointer();
        this.H.seek(ai.e(this.r));
        this.a(ay.a(ai.b(this.r).getCrc()));
        if (!this.f(ai.b(this.r)) || !bl2) {
            this.a(ay.a(ai.b(this.r).getCompressedSize()));
            this.a(ay.a(ai.b(this.r).getSize()));
        } else {
            this.a(ay.d.a());
            this.a(ay.d.a());
        }
        if (this.f(ai.b(this.r))) {
            this.H.seek(ai.e(this.r) + 12L + 4L + (long)this.i(ai.b(this.r)).limit() + 4L);
            this.a(al.a(ai.b(this.r).getSize()));
            this.a(al.a(ai.b(this.r).getCompressedSize()));
            if (!bl2) {
                this.H.seek(ai.e(this.r) - 10L);
                this.a(ba.a(10));
                ai.b(this.r).a(org.apache.commons.compress.archivers.h.y.a);
                ai.b(this.r).l();
                if (ai.f(this.r)) {
                    this.M = false;
                }
            }
        }
        this.H.seek(l2);
    }

    public void a(a a2) {
        if (this.c) {
            throw new IOException("Stream has already been finished");
        }
        if (this.r != null) {
            this.a();
        }
        this.r = new ai((ab)a2, null);
        this.w.add(ai.b(this.r));
        this.d(ai.b(this.r));
        z z2 = this.g(ai.b(this.r));
        this.b(z2);
        if (this.a(ai.b(this.r), z2)) {
            y y2 = this.e(ai.b(this.r));
            al al2 = al.a;
            if (ai.b(this.r).getMethod() == 0 && ai.b(this.r).getSize() != -1L) {
                al2 = new al(ai.b(this.r).getSize());
            }
            y2.a(al2);
            y2.b(al2);
            ai.b(this.r).l();
        }
        if (ai.b(this.r).getMethod() == 8 && this.u) {
            this.i.setLevel(this.t);
            this.u = false;
        }
        this.a(ai.b(this.r));
    }

    private void d(ab ab2) {
        if (ab2.getMethod() == -1) {
            ab2.setMethod(this.v);
        }
        if (ab2.getTime() == -1L) {
            ab2.setTime(System.currentTimeMillis());
        }
    }

    private void b(z z2) {
        if (ai.b(this.r).getMethod() == 0 && this.H == null) {
            if (ai.b(this.r).getSize() == -1L) {
                throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
            }
            if (ai.b(this.r).getCrc() == -1L) {
                throw new ZipException("crc checksum is required for STORED method when not writing to a file");
            }
            ai.b(this.r).setCompressedSize(ai.b(this.r).getSize());
        }
        if ((ai.b(this.r).getSize() >= 0xFFFFFFFFL || ai.b(this.r).getCompressedSize() >= 0xFFFFFFFFL) && z2 == org.apache.commons.compress.archivers.h.z.b) {
            throw new aa(aa.a(ai.b(this.r)));
        }
    }

    private boolean a(ab ab2, z z2) {
        return z2 == org.apache.commons.compress.archivers.h.z.a || ab2.getSize() >= 0xFFFFFFFFL || ab2.getCompressedSize() >= 0xFFFFFFFFL || ab2.getSize() == -1L && this.H != null && z2 != org.apache.commons.compress.archivers.h.z.b;
    }

    public void b(String string) {
        this.s = string;
    }

    public void b(int n2) {
        if (n2 < -1 || n2 > 9) {
            throw new IllegalArgumentException("Invalid compression level: " + n2);
        }
        this.u = this.t != n2;
        this.t = n2;
    }

    public void c(int n2) {
        this.v = n2;
    }

    public boolean b(a a2) {
        if (a2 instanceof ab) {
            ab ab2 = (ab)a2;
            return ab2.getMethod() != az.g.a() && ab2.getMethod() != az.b.a() && bb.a(ab2);
        }
        return false;
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (this.r == null) {
            throw new IllegalStateException("No current entry");
        }
        bb.b(ai.b(this.r));
        ai.a(this.r, true);
        if (ai.b(this.r).getMethod() == 8) {
            this.b(arrby, n2, n3);
        } else {
            this.a(arrby, n2, n3);
            this.y += (long)n3;
        }
        this.x.update(arrby, n2, n3);
        this.a(n3);
    }

    private void b(byte[] arrby, int n2, int n3) {
        if (n3 > 0 && !this.i.finished()) {
            ai.a(this.r, n3);
            if (n3 <= 8192) {
                this.i.setInput(arrby, n2, n3);
                this.l();
            } else {
                int n4;
                int n5 = n3 / 8192;
                for (n4 = 0; n4 < n5; ++n4) {
                    this.i.setInput(arrby, n2 + n4 * 8192, 8192);
                    this.l();
                }
                n4 = n5 * 8192;
                if (n4 < n3) {
                    this.i.setInput(arrby, n2 + n4, n3 - n4);
                    this.l();
                }
            }
        }
    }

    public void close() {
        if (!this.c) {
            this.b();
        }
        this.j();
    }

    public void flush() {
        if (this.I != null) {
            this.I.flush();
        }
    }

    protected final void g() {
        int n2 = this.i.deflate(this.G, 0, this.G.length);
        if (n2 > 0) {
            this.a(this.G, 0, n2);
            this.y += (long)n2;
        }
    }

    protected void a(ab ab2) {
        byte[] arrby;
        boolean bl2 = this.F.a(ab2.getName());
        ByteBuffer byteBuffer = this.i(ab2);
        if (this.L != aj.b) {
            this.a(ab2, bl2, byteBuffer);
        }
        this.D.put(ab2, this.y);
        this.a(j);
        this.y += 4L;
        int n2 = ab2.getMethod();
        this.a(n2, !bl2 && this.K, this.f(ab2));
        this.y += 4L;
        this.a(ba.a(n2));
        this.y += 2L;
        this.a(bb.a(ab2.getTime()));
        this.y += 4L;
        ai.b(this.r, this.y);
        if (n2 == 8 || this.H != null) {
            this.a(C);
            if (this.f(ai.b(this.r))) {
                this.a(ay.d.a());
                this.a(ay.d.a());
            } else {
                this.a(C);
                this.a(C);
            }
        } else {
            this.a(ay.a(ab2.getCrc()));
            arrby = ay.d.a();
            if (!this.f(ab2)) {
                arrby = ay.a(ab2.getSize());
            }
            this.a(arrby);
            this.a(arrby);
        }
        this.y += 12L;
        this.a(ba.a(byteBuffer.limit()));
        this.y += 2L;
        arrby = ab2.m();
        this.a(ba.a(arrby.length));
        this.y += 2L;
        this.a(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
        this.y += (long)byteBuffer.limit();
        this.a(arrby);
        this.y += (long)arrby.length;
        ai.c(this.r, this.y);
    }

    private void a(ab ab2, boolean bl2, ByteBuffer byteBuffer) {
        String string;
        if (this.L == aj.a || !bl2) {
            ab2.a(new p(ab2.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        if ((string = ab2.getComment()) != null && !"".equals(string)) {
            boolean bl3 = this.F.a(string);
            if (this.L == aj.a || !bl3) {
                ByteBuffer byteBuffer2 = this.h(ab2).b(string);
                ab2.a(new o(string, byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.limit() - byteBuffer2.position()));
            }
        }
    }

    protected void b(ab ab2) {
        if (ab2.getMethod() != 8 || this.H != null) {
            return;
        }
        this.a(k);
        this.a(ay.a(ab2.getCrc()));
        int n2 = 4;
        if (!this.f(ab2)) {
            this.a(ay.a(ab2.getCompressedSize()));
            this.a(ay.a(ab2.getSize()));
        } else {
            n2 = 8;
            this.a(al.a(ab2.getCompressedSize()));
            this.a(al.a(ab2.getSize()));
        }
        this.y += (long)(8 + 2 * n2);
    }

    protected void c(ab ab2) {
        boolean bl2;
        this.a(l);
        this.y += 4L;
        long l2 = (Long)this.D.get(ab2);
        boolean bl3 = bl2 = this.f(ab2) || ab2.getCompressedSize() >= 0xFFFFFFFFL || ab2.getSize() >= 0xFFFFFFFFL || l2 >= 0xFFFFFFFFL;
        if (bl2 && this.N == org.apache.commons.compress.archivers.h.z.b) {
            throw new aa("archive's size exceeds the limit of 4GByte.");
        }
        this.a(ab2, l2, bl2);
        this.a(ba.a(ab2.h() << 8 | (!this.M ? 20 : 45)));
        this.y += 2L;
        int n2 = ab2.getMethod();
        boolean bl4 = this.F.a(ab2.getName());
        this.a(n2, !bl4 && this.K, bl2);
        this.y += 4L;
        this.a(ba.a(n2));
        this.y += 2L;
        this.a(bb.a(ab2.getTime()));
        this.y += 4L;
        this.a(ay.a(ab2.getCrc()));
        if (ab2.getCompressedSize() >= 0xFFFFFFFFL || ab2.getSize() >= 0xFFFFFFFFL) {
            this.a(ay.d.a());
            this.a(ay.d.a());
        } else {
            this.a(ay.a(ab2.getCompressedSize()));
            this.a(ay.a(ab2.getSize()));
        }
        this.y += 12L;
        ByteBuffer byteBuffer = this.i(ab2);
        this.a(ba.a(byteBuffer.limit()));
        this.y += 2L;
        byte[] arrby = ab2.n();
        this.a(ba.a(arrby.length));
        this.y += 2L;
        String string = ab2.getComment();
        if (string == null) {
            string = "";
        }
        ByteBuffer byteBuffer2 = this.h(ab2).b(string);
        this.a(ba.a(byteBuffer2.limit()));
        this.y += 2L;
        this.a(B);
        this.y += 2L;
        this.a(ba.a(ab2.d()));
        this.y += 2L;
        this.a(ay.a(ab2.e()));
        this.y += 4L;
        this.a(ay.a(Math.min(l2, 0xFFFFFFFFL)));
        this.y += 4L;
        this.a(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
        this.y += (long)byteBuffer.limit();
        this.a(arrby);
        this.y += (long)arrby.length;
        this.a(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.limit() - byteBuffer2.position());
        this.y += (long)byteBuffer2.limit();
    }

    private void a(ab ab2, long l2, boolean bl2) {
        if (bl2) {
            y y2 = this.e(ab2);
            if (ab2.getCompressedSize() >= 0xFFFFFFFFL || ab2.getSize() >= 0xFFFFFFFFL) {
                y2.b(new al(ab2.getCompressedSize()));
                y2.a(new al(ab2.getSize()));
            } else {
                y2.b(null);
                y2.a((al)null);
            }
            if (l2 >= 0xFFFFFFFFL) {
                y2.c(new al(l2));
            }
            ab2.l();
        }
    }

    protected void h() {
        this.a(m);
        this.a(B);
        this.a(B);
        int n2 = this.w.size();
        if (n2 > 65535 && this.N == org.apache.commons.compress.archivers.h.z.b) {
            throw new aa("archive contains more than 65535 entries.");
        }
        if (this.z > 0xFFFFFFFFL && this.N == org.apache.commons.compress.archivers.h.z.b) {
            throw new aa("archive's size exceeds the limit of 4GByte.");
        }
        byte[] arrby = ba.a(Math.min(n2, 65535));
        this.a(arrby);
        this.a(arrby);
        this.a(ay.a(Math.min(this.A, 0xFFFFFFFFL)));
        this.a(ay.a(Math.min(this.z, 0xFFFFFFFFL)));
        ByteBuffer byteBuffer = this.F.b(this.s);
        this.a(ba.a(byteBuffer.limit()));
        this.a(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    protected void i() {
        if (this.N == org.apache.commons.compress.archivers.h.z.b) {
            return;
        }
        if (!(this.M || this.z < 0xFFFFFFFFL && this.A < 0xFFFFFFFFL && this.w.size() < 65535)) {
            this.M = true;
        }
        if (!this.M) {
            return;
        }
        long l2 = this.y;
        this.a(n);
        this.a(al.a(44L));
        this.a(ba.a(45));
        this.a(ba.a(45));
        this.a(C);
        this.a(C);
        byte[] arrby = al.a(this.w.size());
        this.a(arrby);
        this.a(arrby);
        this.a(al.a(this.A));
        this.a(al.a(this.z));
        this.a(o);
        this.a(C);
        this.a(al.a(l2));
        this.a(O);
    }

    protected final void a(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
    }

    protected final void a(byte[] arrby, int n2, int n3) {
        if (this.H != null) {
            this.H.write(arrby, n2, n3);
        } else {
            this.I.write(arrby, n2, n3);
        }
    }

    private void l() {
        while (!this.i.needsInput()) {
            this.g();
        }
    }

    private void a(int n2, boolean bl2, boolean bl3) {
        int n3 = 10;
        j j2 = new j();
        j2.a(this.J || bl2);
        if (n2 == 8 && this.H == null) {
            n3 = 20;
            j2.b(true);
        }
        if (bl3) {
            n3 = 45;
        }
        this.a(ba.a(n3));
        this.a(j2.g());
    }

    public a a(File file, String string) {
        if (this.c) {
            throw new IOException("Stream has already been finished");
        }
        return new ab(file, string);
    }

    private y e(ab ab2) {
        if (this.r != null) {
            ai.b(this.r, !this.M);
        }
        this.M = true;
        y y2 = (y)ab2.b(org.apache.commons.compress.archivers.h.y.a);
        if (y2 == null) {
            y2 = new y();
        }
        ab2.b(y2);
        return y2;
    }

    private boolean f(ab ab2) {
        return ab2.b(org.apache.commons.compress.archivers.h.y.a) != null;
    }

    private z g(ab ab2) {
        if (this.N != org.apache.commons.compress.archivers.h.z.c || this.H != null || ab2.getMethod() != 8 || ab2.getSize() != -1L) {
            return this.N;
        }
        return org.apache.commons.compress.archivers.h.z.b;
    }

    private am h(ab ab2) {
        boolean bl2 = this.F.a(ab2.getName());
        return !bl2 && this.K ? an.b : this.F;
    }

    private ByteBuffer i(ab ab2) {
        return this.h(ab2).b(ab2.getName());
    }

    void j() {
        if (this.H != null) {
            this.H.close();
        }
        if (this.I != null) {
            this.I.close();
        }
    }
}

