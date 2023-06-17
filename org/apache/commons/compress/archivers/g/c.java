/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.g;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.d;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.c.h;

public class c
extends d {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    private long i;
    private String j;
    private long k;
    private final byte[] l;
    private int m;
    private final byte[] n;
    private int o = 0;
    private int p = 0;
    private int q;
    private final int r;
    private final int s;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final OutputStream w;
    private final am x;
    private boolean y = false;
    private static final am z = an.a("ASCII");

    public c(OutputStream outputStream) {
        this(outputStream, 10240, 512);
    }

    public c(OutputStream outputStream, String string) {
        this(outputStream, 10240, 512, string);
    }

    public c(OutputStream outputStream, int n2) {
        this(outputStream, n2, 512);
    }

    public c(OutputStream outputStream, int n2, String string) {
        this(outputStream, n2, 512, string);
    }

    public c(OutputStream outputStream, int n2, int n3) {
        this(outputStream, n2, n3, null);
    }

    public c(OutputStream outputStream, int n2, int n3, String string) {
        this.w = new h(outputStream);
        this.x = an.a(string);
        this.m = 0;
        this.n = new byte[n3];
        this.l = new byte[n3];
        this.s = n3;
        this.r = n2 / n3;
    }

    public void b(int n2) {
        this.o = n2;
    }

    public void c(int n2) {
        this.p = n2;
    }

    public void a(boolean bl2) {
        this.y = bl2;
    }

    public int c() {
        return (int)this.d();
    }

    public long d() {
        return ((h)this.w).a();
    }

    public void b() {
        if (this.v) {
            throw new IOException("This archive has already been finished");
        }
        if (this.u) {
            throw new IOException("This archives contains unclosed entries.");
        }
        this.f();
        this.f();
        this.g();
        this.w.flush();
        this.v = true;
    }

    public void close() {
        if (!this.v) {
            this.b();
        }
        if (!this.t) {
            this.w.close();
            this.t = true;
        }
    }

    public int e() {
        return this.s;
    }

    public void a(a a2) {
        boolean bl2;
        if (this.v) {
            throw new IOException("Stream has already been finished");
        }
        org.apache.commons.compress.archivers.g.a a3 = (org.apache.commons.compress.archivers.g.a)a2;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string = a3.getName();
        boolean bl3 = this.a(string, hashMap, "path", (byte)76, "file name");
        String string2 = a3.b();
        boolean bl4 = bl2 = string2 != null && string2.length() > 0 && this.a(string2, hashMap, "linkpath", (byte)75, "link name");
        if (this.p == 2) {
            this.a(hashMap, a3);
        } else if (this.p != 1) {
            this.a(a3);
        }
        if (this.y && !bl3 && !z.a(string)) {
            hashMap.put("path", string);
        }
        if (this.y && !bl2 && (a3.v() || a3.u()) && !z.a(string2)) {
            hashMap.put("linkpath", string2);
        }
        if (hashMap.size() > 0) {
            this.a(string, hashMap);
        }
        a3.a(this.l, this.x, this.p == 1);
        this.a(this.l);
        this.k = 0L;
        this.i = a3.isDirectory() ? 0L : a3.getSize();
        this.j = string;
        this.u = true;
    }

    public void a() {
        if (this.v) {
            throw new IOException("Stream has already been finished");
        }
        if (!this.u) {
            throw new IOException("No current entry to close");
        }
        if (this.m > 0) {
            for (int i2 = this.m; i2 < this.n.length; ++i2) {
                this.n[i2] = 0;
            }
            this.a(this.n);
            this.k += (long)this.m;
            this.m = 0;
        }
        if (this.k < this.i) {
            throw new IOException("entry '" + this.j + "' closed at '" + this.k + "' before the '" + this.i + "' bytes specified in the header were written");
        }
        this.u = false;
    }

    public void write(byte[] arrby, int n2, int n3) {
        int n4;
        if (!this.u) {
            throw new IllegalStateException("No current tar entry");
        }
        if (this.k + (long)n3 > this.i) {
            throw new IOException("request to write '" + n3 + "' bytes exceeds size in header of '" + this.i + "' bytes for entry '" + this.j + "'");
        }
        if (this.m > 0) {
            if (this.m + n3 >= this.l.length) {
                n4 = this.l.length - this.m;
                System.arraycopy(this.n, 0, this.l, 0, this.m);
                System.arraycopy(arrby, n2, this.l, this.m, n4);
                this.a(this.l);
                this.k += (long)this.l.length;
                n2 += n4;
                n3 -= n4;
                this.m = 0;
            } else {
                System.arraycopy(arrby, n2, this.n, this.m, n3);
                n2 += n3;
                this.m += n3;
                n3 = 0;
            }
        }
        while (n3 > 0) {
            if (n3 < this.l.length) {
                System.arraycopy(arrby, n2, this.n, this.m, n3);
                this.m += n3;
                break;
            }
            this.a(arrby, n2);
            n4 = this.l.length;
            this.k += (long)n4;
            n3 -= n4;
            n2 += n4;
        }
    }

    void a(String string, Map map) {
        String string2 = "./PaxHeaders.X/" + this.a(string);
        if (string2.length() >= 100) {
            string2 = string2.substring(0, 99);
        }
        org.apache.commons.compress.archivers.g.a a2 = new org.apache.commons.compress.archivers.g.a(string2, 120);
        StringWriter stringWriter = new StringWriter();
        for (Map.Entry entry : map.entrySet()) {
            String string3 = (String)entry.getKey();
            String string4 = (String)entry.getValue();
            int n2 = string3.length() + string4.length() + 3 + 2;
            String string5 = n2 + " " + string3 + "=" + string4 + "\n";
            int n3 = string5.getBytes("UTF-8").length;
            while (n2 != n3) {
                n2 = n3;
                string5 = n2 + " " + string3 + "=" + string4 + "\n";
                n3 = string5.getBytes("UTF-8").length;
            }
            stringWriter.write(string5);
        }
        Object object = stringWriter.toString().getBytes("UTF-8");
        a2.b((long)((Object)object).length);
        this.a((a)a2);
        this.write((byte[])object);
        this.a();
    }

    private String a(String string) {
        int n2 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = (char)(string.charAt(i2) & 0x7F);
            if (this.a(c2)) {
                stringBuilder.append("_");
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private boolean a(char c2) {
        return c2 == '\u0000' || c2 == '/' || c2 == '\\';
    }

    private void f() {
        Arrays.fill(this.l, (byte)0);
        this.a(this.l);
    }

    public void flush() {
        this.w.flush();
    }

    public a a(File file, String string) {
        if (this.v) {
            throw new IOException("Stream has already been finished");
        }
        return new org.apache.commons.compress.archivers.g.a(file, string);
    }

    private void a(byte[] arrby) {
        if (arrby.length != this.s) {
            throw new IOException("record to write has length '" + arrby.length + "' which is not the record size of '" + this.s + "'");
        }
        this.w.write(arrby);
        ++this.q;
    }

    private void a(byte[] arrby, int n2) {
        if (n2 + this.s > arrby.length) {
            throw new IOException("record has length '" + arrby.length + "' with offset '" + n2 + "' which is less than the record size of '" + this.s + "'");
        }
        this.w.write(arrby, n2, this.s);
        ++this.q;
    }

    private void g() {
        int n2 = this.q % this.r;
        if (n2 != 0) {
            for (int i2 = n2; i2 < this.r; ++i2) {
                this.f();
            }
        }
    }

    private void a(Map map, org.apache.commons.compress.archivers.g.a a2) {
        this.a(map, "size", a2.getSize(), 0x1FFFFFFFFL);
        this.a(map, "gid", a2.d(), 0x1FFFFFL);
        this.a(map, "mtime", a2.g().getTime() / 1000L, 0x1FFFFFFFFL);
        this.a(map, "uid", a2.c(), 0x1FFFFFL);
        this.a(map, "SCHILY.devmajor", a2.k(), 0x1FFFFFL);
        this.a(map, "SCHILY.devminor", a2.l(), 0x1FFFFFL);
        this.a("mode", a2.j(), 0x1FFFFFL);
    }

    private void a(Map map, String string, long l2, long l3) {
        if (l2 < 0L || l2 > l3) {
            map.put(string, String.valueOf(l2));
        }
    }

    private void a(org.apache.commons.compress.archivers.g.a a2) {
        this.a("entry size", a2.getSize(), 0x1FFFFFFFFL);
        this.a("group id", a2.d(), 0x1FFFFFL);
        this.a("last modification time", a2.g().getTime() / 1000L, 0x1FFFFFFFFL);
        this.a("user id", a2.c(), 0x1FFFFFL);
        this.a("mode", a2.j(), 0x1FFFFFL);
        this.a("major device number", a2.k(), 0x1FFFFFL);
        this.a("minor device number", a2.l(), 0x1FFFFFL);
    }

    private void a(String string, long l2, long l3) {
        if (l2 < 0L || l2 > l3) {
            throw new RuntimeException(string + " '" + l2 + "' is too big ( > " + l3 + " )");
        }
    }

    private boolean a(String string, Map map, String string2, byte by2, String string3) {
        ByteBuffer byteBuffer = this.x.b(string);
        int n2 = byteBuffer.limit() - byteBuffer.position();
        if (n2 >= 100) {
            if (this.o == 3) {
                map.put(string2, string);
                return true;
            }
            if (this.o == 2) {
                org.apache.commons.compress.archivers.g.a a2 = new org.apache.commons.compress.archivers.g.a("././@LongLink", by2);
                a2.b((long)(n2 + 1));
                this.a((a)a2);
                this.write(byteBuffer.array(), byteBuffer.arrayOffset(), n2);
                this.write(0);
                this.a();
            } else if (this.o != 1) {
                throw new RuntimeException(string3 + " '" + string + "' is too long ( > " + 100 + " bytes)");
            }
        }
        return false;
    }
}

