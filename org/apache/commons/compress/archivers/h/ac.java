/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ae;
import org.apache.commons.compress.archivers.h.af;
import org.apache.commons.compress.archivers.h.ag;
import org.apache.commons.compress.archivers.h.al;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.az;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;
import org.apache.commons.compress.archivers.h.f;
import org.apache.commons.compress.archivers.h.j;
import org.apache.commons.compress.archivers.h.t;
import org.apache.commons.compress.archivers.h.u;
import org.apache.commons.compress.archivers.h.v;
import org.apache.commons.compress.archivers.h.y;
import org.apache.commons.compress.c.i;

public class ac
extends c {
    private final am a;
    private final boolean b;
    private final InputStream c;
    private final Inflater d = new Inflater(true);
    private final ByteBuffer e = ByteBuffer.allocate(512);
    private af f = null;
    private boolean g = false;
    private boolean h = false;
    private ByteArrayInputStream i = null;
    private boolean j = false;
    private static final int k = 30;
    private static final int l = 46;
    private static final long m = 0x100000000L;
    private final byte[] n = new byte[30];
    private final byte[] o = new byte[1024];
    private final byte[] p = new byte[2];
    private final byte[] q = new byte[4];
    private final byte[] r = new byte[16];
    private int s = 0;
    private static final byte[] t = ay.b.a();
    private static final byte[] u = ay.a.a();
    private static final byte[] v = ay.c.a();

    public ac(InputStream inputStream) {
        this(inputStream, "UTF8");
    }

    public ac(InputStream inputStream, String string) {
        this(inputStream, string, true);
    }

    public ac(InputStream inputStream, String string, boolean bl2) {
        this(inputStream, string, bl2, false);
    }

    public ac(InputStream inputStream, String string, boolean bl2, boolean bl3) {
        this.a = an.a(string);
        this.b = bl2;
        this.c = new PushbackInputStream(inputStream, this.e.capacity());
        this.j = bl3;
        this.e.limit(0);
    }

    public ab e() {
        boolean bl2 = true;
        if (this.g || this.h) {
            return null;
        }
        if (this.f != null) {
            this.d();
            bl2 = false;
        }
        try {
            if (bl2) {
                this.a(this.n);
            } else {
                this.b(this.n);
            }
        }
        catch (EOFException eOFException) {
            return null;
        }
        ay ay2 = new ay(this.n);
        if (ay2.equals(ay.a) || ay2.equals(ay.f)) {
            this.h = true;
            this.k();
        }
        if (!ay2.equals(ay.b)) {
            return null;
        }
        int n2 = 4;
        this.f = new af(null);
        int n3 = ba.a(this.n, n2);
        af.a(this.f).c(n3 >> 8 & 0xF);
        j j2 = org.apache.commons.compress.archivers.h.j.a(this.n, n2 += 2);
        boolean bl3 = j2.a();
        am am2 = bl3 ? an.b : this.a;
        af.a(this.f, j2.b());
        af.a(this.f).a(j2);
        af.a(this.f).setMethod(ba.a(this.n, n2 += 2));
        long l2 = bb.c(ay.a(this.n, n2 += 2));
        af.a(this.f).setTime(l2);
        n2 += 4;
        ay ay3 = null;
        ay ay4 = null;
        if (!af.b(this.f)) {
            af.a(this.f).setCrc(ay.a(this.n, n2));
            ay4 = new ay(this.n, n2 += 4);
            ay3 = new ay(this.n, n2 += 4);
            n2 += 4;
        } else {
            n2 += 12;
        }
        int n4 = ba.a(this.n, n2);
        int n5 = ba.a(this.n, n2 += 2);
        n2 += 2;
        byte[] arrby = new byte[n4];
        this.b(arrby);
        af.a(this.f).a(am2.a(arrby), arrby);
        byte[] arrby2 = new byte[n5];
        this.b(arrby2);
        af.a(this.f).setExtra(arrby2);
        if (!bl3 && this.b) {
            bb.a(af.a(this.f), arrby, null);
        }
        this.a(ay3, ay4);
        if (af.a(this.f).getCompressedSize() != -1L) {
            if (af.a(this.f).getMethod() == az.b.a()) {
                af.a(this.f, new t(new ae(this, this.c, af.a(this.f).getCompressedSize())));
            } else if (af.a(this.f).getMethod() == az.g.a()) {
                af.a(this.f, new f(af.a(this.f).p().e(), af.a(this.f).p().f(), new ae(this, this.c, af.a(this.f).getCompressedSize())));
            }
        }
        ++this.s;
        return af.a(this.f);
    }

    private void a(byte[] arrby) {
        this.b(arrby);
        ay ay2 = new ay(arrby);
        if (ay2.equals(ay.c)) {
            throw new u(org.apache.commons.compress.archivers.h.v.d);
        }
        if (ay2.equals(ay.e)) {
            byte[] arrby2 = new byte[4];
            this.b(arrby2);
            System.arraycopy(arrby, 4, arrby, 0, 26);
            System.arraycopy(arrby2, 0, arrby, 26, 4);
        }
    }

    private void a(ay ay2, ay ay3) {
        y y2 = (y)af.a(this.f).b(y.a);
        af.b(this.f, y2 != null);
        if (!af.b(this.f)) {
            if (y2 != null && (ay3.equals(ay.d) || ay2.equals(ay.d))) {
                af.a(this.f).setCompressedSize(y2.g().b());
                af.a(this.f).setSize(y2.b().b());
            } else {
                af.a(this.f).setCompressedSize(ay3.b());
                af.a(this.f).setSize(ay2.b());
            }
        }
    }

    public a a() {
        return this.e();
    }

    public boolean a(a a2) {
        if (a2 instanceof ab) {
            ab ab2 = (ab)a2;
            return bb.a(ab2) && this.a(ab2);
        }
        return false;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4;
        if (this.g) {
            throw new IOException("The stream is closed");
        }
        if (this.f == null) {
            return -1;
        }
        if (n2 > arrby.length || n3 < 0 || n2 < 0 || arrby.length - n2 < n3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        bb.b(af.a(this.f));
        if (!this.a(af.a(this.f))) {
            throw new u(org.apache.commons.compress.archivers.h.v.c, af.a(this.f));
        }
        if (af.a(this.f).getMethod() == 0) {
            n4 = this.a(arrby, n2, n3);
        } else if (af.a(this.f).getMethod() == 8) {
            n4 = this.b(arrby, n2, n3);
        } else if (af.a(this.f).getMethod() == az.b.a() || af.a(this.f).getMethod() == az.g.a()) {
            n4 = af.c(this.f).read(arrby, n2, n3);
        } else {
            throw new u(az.a(af.a(this.f).getMethod()), af.a(this.f));
        }
        if (n4 >= 0) {
            af.d(this.f).update(arrby, n2, n4);
        }
        return n4;
    }

    private int a(byte[] arrby, int n2, int n3) {
        int n4;
        if (af.b(this.f)) {
            if (this.i == null) {
                this.j();
            }
            return this.i.read(arrby, n2, n3);
        }
        long l2 = af.a(this.f).getSize();
        if (af.e(this.f) >= l2) {
            return -1;
        }
        if (this.e.position() >= this.e.limit()) {
            this.e.position(0);
            n4 = this.c.read(this.e.array());
            if (n4 == -1) {
                return -1;
            }
            this.e.limit(n4);
            this.a(n4);
            af.a(this.f, n4);
        }
        n4 = Math.min(this.e.remaining(), n3);
        if (l2 - af.e(this.f) < (long)n4) {
            n4 = (int)(l2 - af.e(this.f));
        }
        this.e.get(arrby, n2, n4);
        af.b(this.f, n4);
        return n4;
    }

    private int b(byte[] arrby, int n2, int n3) {
        int n4 = this.c(arrby, n2, n3);
        if (n4 <= 0) {
            if (this.d.finished()) {
                return -1;
            }
            if (this.d.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
            }
            if (n4 == -1) {
                throw new IOException("Truncated ZIP file");
            }
        }
        return n4;
    }

    private int c(byte[] arrby, int n2, int n3) {
        int n4 = 0;
        do {
            if (this.d.needsInput()) {
                int n5 = this.h();
                if (n5 > 0) {
                    af.a(this.f, this.e.limit());
                } else {
                    if (n5 != -1) break;
                    return -1;
                }
            }
            try {
                n4 = this.d.inflate(arrby, n2, n3);
            }
            catch (DataFormatException dataFormatException) {
                throw (IOException)new ZipException(dataFormatException.getMessage()).initCause(dataFormatException);
            }
        } while (n4 == 0 && this.d.needsInput());
        return n4;
    }

    public void close() {
        if (!this.g) {
            this.g = true;
            this.c.close();
            this.d.end();
        }
    }

    public long skip(long l2) {
        if (l2 >= 0L) {
            long l3;
            int n2;
            for (l3 = 0L; l3 < l2; l3 += (long)n2) {
                long l4 = l2 - l3;
                n2 = this.read(this.o, 0, (int)((long)this.o.length > l4 ? l4 : (long)this.o.length));
                if (n2 != -1) continue;
                return l3;
            }
            return l3;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(byte[] arrby, int n2) {
        if (n2 < ag.j.length) {
            return false;
        }
        return ac.a(arrby, ag.j) || ac.a(arrby, ag.m) || ac.a(arrby, ag.k) || ac.a(arrby, ay.e.a());
    }

    private static boolean a(byte[] arrby, byte[] arrby2) {
        for (int i2 = 0; i2 < arrby2.length; ++i2) {
            if (arrby[i2] == arrby2[i2]) continue;
            return false;
        }
        return true;
    }

    private void d() {
        if (this.g) {
            throw new IOException("The stream is closed");
        }
        if (this.f == null) {
            return;
        }
        if (af.f(this.f) <= af.a(this.f).getCompressedSize() && !af.b(this.f)) {
            this.f();
        } else {
            this.skip(Long.MAX_VALUE);
            long l2 = af.a(this.f).getMethod() == 8 ? this.g() : af.e(this.f);
            int n2 = (int)(af.f(this.f) - l2);
            if (n2 > 0) {
                this.d(this.e.array(), this.e.limit() - n2, n2);
            }
        }
        if (this.i == null && af.b(this.f)) {
            this.i();
        }
        this.d.reset();
        this.e.clear().flip();
        this.f = null;
        this.i = null;
    }

    private void f() {
        long l2;
        for (long i2 = af.a(this.f).getCompressedSize() - af.f(this.f); i2 > 0L; i2 -= l2) {
            l2 = this.c.read(this.e.array(), 0, (int)Math.min((long)this.e.capacity(), i2));
            if (l2 < 0L) {
                throw new EOFException("Truncated ZIP entry: " + af.a(this.f).getName());
            }
            this.a(l2);
        }
    }

    private long g() {
        long l2 = this.d.getBytesRead();
        if (af.f(this.f) >= 0x100000000L) {
            while (l2 + 0x100000000L <= af.f(this.f)) {
                l2 += 0x100000000L;
            }
        }
        return l2;
    }

    private int h() {
        if (this.g) {
            throw new IOException("The stream is closed");
        }
        int n2 = this.c.read(this.e.array());
        if (n2 > 0) {
            this.e.limit(n2);
            this.a(this.e.limit());
            this.d.setInput(this.e.array(), 0, this.e.limit());
        }
        return n2;
    }

    private void b(byte[] arrby) {
        int n2 = org.apache.commons.compress.c.i.a(this.c, arrby);
        this.a(n2);
        if (n2 < arrby.length) {
            throw new EOFException();
        }
    }

    private void i() {
        this.b(this.q);
        ay ay2 = new ay(this.q);
        if (ay.c.equals(ay2)) {
            this.b(this.q);
            ay2 = new ay(this.q);
        }
        af.a(this.f).setCrc(ay2.b());
        this.b(this.r);
        ay ay3 = new ay(this.r, 8);
        if (ay3.equals(ay.a) || ay3.equals(ay.b)) {
            this.d(this.r, 8, 8);
            af.a(this.f).setCompressedSize(ay.a(this.r));
            af.a(this.f).setSize(ay.a(this.r, 4));
        } else {
            af.a(this.f).setCompressedSize(al.a(this.r));
            af.a(this.f).setSize(al.a(this.r, 8));
        }
    }

    private boolean a(ab ab2) {
        return !ab2.p().b() || this.j && ab2.getMethod() == 0 || ab2.getMethod() == 8;
    }

    private void j() {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n3 = 0;
        boolean bl2 = false;
        int n4 = n2 = af.g(this.f) ? 20 : 12;
        while (!bl2) {
            int n5 = this.c.read(this.e.array(), n3, 512 - n3);
            if (n5 <= 0) {
                throw new IOException("Truncated ZIP file");
            }
            if (n5 + n3 < 4) {
                n3 += n5;
                continue;
            }
            bl2 = this.a(byteArrayOutputStream, n3, n5, n2);
            if (bl2) continue;
            n3 = this.b(byteArrayOutputStream, n3, n5, n2);
        }
        byte[] arrby = byteArrayOutputStream.toByteArray();
        this.i = new ByteArrayInputStream(arrby);
    }

    private boolean a(ByteArrayOutputStream byteArrayOutputStream, int n2, int n3, int n4) {
        boolean bl2 = false;
        int n5 = 0;
        for (int i2 = 0; !bl2 && i2 < n3 - 4; ++i2) {
            if (this.e.array()[i2] != t[0] || this.e.array()[i2 + 1] != t[1]) continue;
            if (this.e.array()[i2 + 2] == t[2] && this.e.array()[i2 + 3] == t[3] || this.e.array()[i2] == u[2] && this.e.array()[i2 + 3] == u[3]) {
                n5 = n2 + n3 - i2 - n4;
                bl2 = true;
            } else if (this.e.array()[i2 + 2] == v[2] && this.e.array()[i2 + 3] == v[3]) {
                n5 = n2 + n3 - i2;
                bl2 = true;
            }
            if (!bl2) continue;
            this.d(this.e.array(), n2 + n3 - n5, n5);
            byteArrayOutputStream.write(this.e.array(), 0, i2);
            this.i();
        }
        return bl2;
    }

    private int b(ByteArrayOutputStream byteArrayOutputStream, int n2, int n3, int n4) {
        int n5 = n2 + n3 - n4 - 3;
        if (n5 > 0) {
            byteArrayOutputStream.write(this.e.array(), 0, n5);
            System.arraycopy(this.e.array(), n5, this.e.array(), 0, n4 + 3);
            n2 = n4 + 3;
        } else {
            n2 += n3;
        }
        return n2;
    }

    private void d(byte[] arrby, int n2, int n3) {
        ((PushbackInputStream)this.c).unread(arrby, n2, n3);
        this.b((long)n3);
    }

    private void k() {
        this.c(this.s * 46 - 30);
        this.l();
        this.c(16L);
        this.b(this.p);
        this.c(ba.a(this.p));
    }

    private void l() {
        int n2 = -1;
        boolean bl2 = false;
        while (bl2 || (n2 = this.m()) > -1) {
            bl2 = false;
            if (!this.b(n2)) continue;
            n2 = this.m();
            if (n2 != ag.m[1]) {
                if (n2 == -1) break;
                bl2 = this.b(n2);
                continue;
            }
            n2 = this.m();
            if (n2 != ag.m[2]) {
                if (n2 == -1) break;
                bl2 = this.b(n2);
                continue;
            }
            n2 = this.m();
            if (n2 == -1 || n2 == ag.m[3]) break;
            bl2 = this.b(n2);
        }
    }

    private void c(long l2) {
        if (l2 >= 0L) {
            int n2;
            for (long i2 = 0L; i2 < l2; i2 += (long)n2) {
                long l3 = l2 - i2;
                n2 = this.c.read(this.o, 0, (int)((long)this.o.length > l3 ? l3 : (long)this.o.length));
                if (n2 == -1) {
                    return;
                }
                this.a(n2);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private int m() {
        int n2 = this.c.read();
        if (n2 != -1) {
            this.a(1);
        }
        return n2;
    }

    private boolean b(int n2) {
        return n2 == ag.m[0];
    }

    static /* synthetic */ void a(ac ac2, int n2) {
        ac2.a(n2);
    }

    static /* synthetic */ af a(ac ac2) {
        return ac2.f;
    }

    static /* synthetic */ void b(ac ac2, int n2) {
        ac2.a(n2);
    }
}

