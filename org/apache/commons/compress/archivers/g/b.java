/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.g.d;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.c.i;

public class b
extends c {
    private static final int a = 256;
    private final byte[] b = new byte[256];
    private final int c;
    private final int d;
    private boolean e;
    private long f;
    private long g;
    private final InputStream h;
    private org.apache.commons.compress.archivers.g.a i;
    private final am j;

    public b(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public b(InputStream inputStream, String string) {
        this(inputStream, 10240, 512, string);
    }

    public b(InputStream inputStream, int n2) {
        this(inputStream, n2, 512);
    }

    public b(InputStream inputStream, int n2, String string) {
        this(inputStream, n2, 512, string);
    }

    public b(InputStream inputStream, int n2, int n3) {
        this(inputStream, n2, n3, null);
    }

    public b(InputStream inputStream, int n2, int n3, String string) {
        this.h = inputStream;
        this.e = false;
        this.j = an.a(string);
        this.c = n3;
        this.d = n2;
    }

    public void close() {
        this.h.close();
    }

    public int d() {
        return this.c;
    }

    public int available() {
        if (this.f - this.g > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(this.f - this.g);
    }

    public long skip(long l2) {
        if (l2 <= 0L) {
            return 0L;
        }
        long l3 = this.f - this.g;
        long l4 = this.h.skip(Math.min(l2, l3));
        this.a(l4);
        this.g += l4;
        return l4;
    }

    public synchronized void reset() {
    }

    public org.apache.commons.compress.archivers.g.a e() {
        byte[] arrby;
        byte[] arrby2;
        if (this.e) {
            return null;
        }
        if (this.i != null) {
            org.apache.commons.compress.c.i.a((InputStream)this, Long.MAX_VALUE);
            this.j();
        }
        if ((arrby2 = this.k()) == null) {
            this.i = null;
            return null;
        }
        try {
            this.i = new org.apache.commons.compress.archivers.g.a(arrby2, this.j);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IOException iOException = new IOException("Error detected parsing the header");
            iOException.initCause(illegalArgumentException);
            throw iOException;
        }
        this.g = 0L;
        this.f = this.i.getSize();
        if (this.i.p()) {
            arrby = this.f();
            if (arrby == null) {
                return null;
            }
            this.i.b(this.j.a(arrby));
        }
        if (this.i.q()) {
            arrby = this.f();
            if (arrby == null) {
                return null;
            }
            this.i.a(this.j.a(arrby));
        }
        if (this.i.r()) {
            this.l();
        }
        if (this.i.o()) {
            this.m();
        }
        this.f = this.i.getSize();
        return this.i;
    }

    private void j() {
        if (this.f > 0L && this.f % (long)this.c != 0L) {
            long l2 = this.f / (long)this.c + 1L;
            long l3 = l2 * (long)this.c - this.f;
            long l4 = org.apache.commons.compress.c.i.a(this.h, l3);
            this.a(l4);
        }
    }

    protected byte[] f() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = 0;
        while ((n2 = this.read(this.b)) >= 0) {
            byteArrayOutputStream.write(this.b, 0, n2);
        }
        this.a();
        if (this.i == null) {
            return null;
        }
        byte[] arrby = byteArrayOutputStream.toByteArray();
        for (n2 = arrby.length; n2 > 0 && arrby[n2 - 1] == 0; --n2) {
        }
        if (n2 != arrby.length) {
            byte[] arrby2 = new byte[n2];
            System.arraycopy(arrby, 0, arrby2, 0, n2);
            arrby = arrby2;
        }
        return arrby;
    }

    private byte[] k() {
        byte[] arrby = this.g();
        this.e = this.a(arrby);
        if (this.e && arrby != null) {
            this.n();
            this.o();
            arrby = null;
        }
        return arrby;
    }

    protected boolean a(byte[] arrby) {
        return arrby == null || org.apache.commons.compress.c.a.a(arrby, this.c);
    }

    protected byte[] g() {
        byte[] arrby = new byte[this.c];
        int n2 = org.apache.commons.compress.c.i.a(this.h, arrby);
        this.a(n2);
        if (n2 != this.c) {
            return null;
        }
        return arrby;
    }

    private void l() {
        Map map = this.a(this);
        this.a();
        this.a(map);
    }

    Map a(InputStream inputStream) {
        int n2;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        block0: do {
            int n3 = 0;
            int n4 = 0;
            while ((n2 = inputStream.read()) != -1) {
                ++n4;
                if (n2 == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while ((n2 = inputStream.read()) != -1) {
                        ++n4;
                        if (n2 == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            byte[] arrby = new byte[n3 - n4];
                            int n5 = org.apache.commons.compress.c.i.a(inputStream, arrby);
                            if (n5 != n3 - n4) {
                                throw new IOException("Failed to read Paxheader. Expected " + (n3 - n4) + " bytes, read " + n5);
                            }
                            String string2 = new String(arrby, 0, n3 - n4 - 1, "UTF-8");
                            hashMap.put(string, string2);
                            continue block0;
                        }
                        byteArrayOutputStream.write((byte)n2);
                    }
                    continue block0;
                }
                n3 *= 10;
                n3 += n2 - 48;
            }
        } while (n2 != -1);
        return hashMap;
    }

    private void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            if ("path".equals(string)) {
                this.i.a(string2);
                continue;
            }
            if ("linkpath".equals(string)) {
                this.i.b(string2);
                continue;
            }
            if ("gid".equals(string)) {
                this.i.c(Integer.parseInt(string2));
                continue;
            }
            if ("gname".equals(string)) {
                this.i.d(string2);
                continue;
            }
            if ("uid".equals(string)) {
                this.i.b(Integer.parseInt(string2));
                continue;
            }
            if ("uname".equals(string)) {
                this.i.c(string2);
                continue;
            }
            if ("size".equals(string)) {
                this.i.b(Long.parseLong(string2));
                continue;
            }
            if ("mtime".equals(string)) {
                this.i.a((long)(Double.parseDouble(string2) * 1000.0));
                continue;
            }
            if ("SCHILY.devminor".equals(string)) {
                this.i.e(Integer.parseInt(string2));
                continue;
            }
            if (!"SCHILY.devmajor".equals(string)) continue;
            this.i.d(Integer.parseInt(string2));
        }
    }

    private void m() {
        if (this.i.m()) {
            byte[] arrby;
            d d2;
            do {
                if ((arrby = this.k()) != null) continue;
                this.i = null;
                break;
            } while ((d2 = new d(arrby)).a());
        }
    }

    public a a() {
        return this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void n() {
        boolean bl2 = true;
        boolean bl3 = this.h.markSupported();
        if (bl3) {
            this.h.mark(this.c);
        }
        try {
            bl2 = !this.a(this.g());
        }
        finally {
            if (bl2 && bl3) {
                this.b(this.c);
                this.h.reset();
            }
        }
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = 0;
        if (this.e || this.g >= this.f) {
            return -1;
        }
        if (this.i == null) {
            throw new IllegalStateException("No current tar entry");
        }
        n4 = this.h.read(arrby, n2, n3 = Math.min(n3, this.available()));
        if (n4 == -1) {
            if (n3 > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.e = true;
        } else {
            this.a(n4);
            this.g += (long)n4;
        }
        return n4;
    }

    public boolean a(a a2) {
        if (a2 instanceof org.apache.commons.compress.archivers.g.a) {
            org.apache.commons.compress.archivers.g.a a3 = (org.apache.commons.compress.archivers.g.a)a2;
            return !a3.o();
        }
        return false;
    }

    public org.apache.commons.compress.archivers.g.a h() {
        return this.i;
    }

    protected final void a(org.apache.commons.compress.archivers.g.a a2) {
        this.i = a2;
    }

    protected final boolean i() {
        return this.e;
    }

    protected final void a(boolean bl2) {
        this.e = bl2;
    }

    private void o() {
        long l2 = this.c() % (long)this.d;
        if (l2 > 0L) {
            long l3 = org.apache.commons.compress.c.i.a(this.h, (long)this.d - l2);
            this.a(l3);
        }
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < 265) {
            return false;
        }
        if (org.apache.commons.compress.c.a.a("ustar\u0000", arrby, 257, 6) && org.apache.commons.compress.c.a.a("00", arrby, 263, 2)) {
            return true;
        }
        if (org.apache.commons.compress.c.a.a("ustar ", arrby, 257, 6) && (org.apache.commons.compress.c.a.a(" \u0000", arrby, 263, 2) || org.apache.commons.compress.c.a.a("0\u0000", arrby, 263, 2))) {
            return true;
        }
        return org.apache.commons.compress.c.a.a("ustar\u0000", arrby, 257, 6) && org.apache.commons.compress.c.a.a("\u0000\u0000", arrby, 263, 2);
    }
}

