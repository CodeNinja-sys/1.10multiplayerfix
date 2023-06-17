/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.c.i;

public class b
extends c {
    private final InputStream b;
    private long c = 0L;
    private boolean d;
    private org.apache.commons.compress.archivers.a.a e = null;
    private byte[] f = null;
    private long g = -1L;
    private final byte[] h = new byte[16];
    private final byte[] i = new byte[12];
    private final byte[] j = new byte[6];
    private final byte[] k = new byte[8];
    private final byte[] l = new byte[10];
    static final String a = "#1/";
    private static final int m = "#1/".length();
    private static final String n = "^#1/\\d+";
    private static final String o = "//";
    private static final String p = "^/\\d+";

    public b(InputStream inputStream) {
        this.b = inputStream;
        this.d = false;
    }

    public org.apache.commons.compress.archivers.a.a d() {
        int n2;
        int n3;
        Object object;
        if (this.e != null) {
            long l2 = this.g + this.e.f();
            org.apache.commons.compress.c.i.a((InputStream)this, l2 - this.c);
            this.e = null;
        }
        if (this.c == 0L) {
            byte[] arrby = org.apache.commons.compress.c.a.a("!<arch>\n");
            object = new byte[arrby.length];
            int n4 = org.apache.commons.compress.c.i.a((InputStream)this, object);
            if (n4 != arrby.length) {
                throw new IOException("failed to read header. Occured at byte: " + this.c());
            }
            for (n3 = 0; n3 < arrby.length; ++n3) {
                if (arrby[n3] == object[n3]) continue;
                throw new IOException("invalid header " + org.apache.commons.compress.c.a.a(object));
            }
        }
        if (this.c % 2L != 0L && this.read() < 0) {
            return null;
        }
        if (this.b.available() == 0) {
            return null;
        }
        org.apache.commons.compress.c.i.a((InputStream)this, this.h);
        org.apache.commons.compress.c.i.a((InputStream)this, this.i);
        org.apache.commons.compress.c.i.a((InputStream)this, this.j);
        int n5 = this.a(this.j, true);
        org.apache.commons.compress.c.i.a((InputStream)this, this.j);
        org.apache.commons.compress.c.i.a((InputStream)this, this.k);
        org.apache.commons.compress.c.i.a((InputStream)this, this.l);
        object = org.apache.commons.compress.c.a.a("`\n");
        byte[] arrby = new byte[((byte[])object).length];
        n3 = org.apache.commons.compress.c.i.a((InputStream)this, arrby);
        if (n3 != ((byte[])object).length) {
            throw new IOException("failed to read entry trailer. Occured at byte: " + this.c());
        }
        for (n2 = 0; n2 < ((byte[])object).length; ++n2) {
            if (object[n2] == arrby[n2]) continue;
            throw new IOException("invalid entry trailer. not read the content? Occured at byte: " + this.c());
        }
        this.g = this.c;
        object = org.apache.commons.compress.c.a.a(this.h).trim();
        if (org.apache.commons.compress.archivers.a.b.c((String)object)) {
            this.e = this.c(this.l);
            return this.d();
        }
        long l3 = this.a(this.l);
        if (object.endsWith("/")) {
            object = object.substring(0, object.length() - 1);
        } else if (this.d((String)object)) {
            n2 = Integer.parseInt(object.substring(1));
            object = this.b(n2);
        } else if (org.apache.commons.compress.archivers.a.b.a((String)object)) {
            object = this.b((String)object);
            n2 = object.length();
            l3 -= (long)n2;
            this.g += (long)n2;
        }
        this.e = new org.apache.commons.compress.archivers.a.a((String)object, l3, n5, this.a(this.j, true), this.b(this.k, 8), this.a(this.i));
        return this.e;
    }

    private String b(int n2) {
        if (this.f == null) {
            throw new IOException("Cannot process GNU long filename as no // record was found");
        }
        for (int i2 = n2; i2 < this.f.length; ++i2) {
            if (this.f[i2] != 10) continue;
            if (this.f[i2 - 1] == 47) {
                --i2;
            }
            return org.apache.commons.compress.c.a.a(this.f, n2, i2 - n2);
        }
        throw new IOException("Failed to read entry: " + n2);
    }

    private long a(byte[] arrby) {
        return Long.parseLong(org.apache.commons.compress.c.a.a(arrby).trim());
    }

    private int b(byte[] arrby) {
        return this.a(arrby, 10, false);
    }

    private int a(byte[] arrby, boolean bl2) {
        return this.a(arrby, 10, bl2);
    }

    private int b(byte[] arrby, int n2) {
        return this.a(arrby, n2, false);
    }

    private int a(byte[] arrby, int n2, boolean bl2) {
        String string = org.apache.commons.compress.c.a.a(arrby).trim();
        if (string.length() == 0 && bl2) {
            return 0;
        }
        return Integer.parseInt(string, n2);
    }

    public a a() {
        return this.d();
    }

    public void close() {
        if (!this.d) {
            this.d = true;
            this.b.close();
        }
        this.e = null;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = n3;
        if (this.e != null) {
            long l2 = this.g + this.e.f();
            if (n3 > 0 && l2 > this.c) {
                n4 = (int)Math.min((long)n3, l2 - this.c);
            } else {
                return -1;
            }
        }
        int n5 = this.b.read(arrby, n2, n4);
        this.a(n5);
        this.c += n5 > 0 ? (long)n5 : 0L;
        return n5;
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < 8) {
            return false;
        }
        if (arrby[0] != 33) {
            return false;
        }
        if (arrby[1] != 60) {
            return false;
        }
        if (arrby[2] != 97) {
            return false;
        }
        if (arrby[3] != 114) {
            return false;
        }
        if (arrby[4] != 99) {
            return false;
        }
        if (arrby[5] != 104) {
            return false;
        }
        if (arrby[6] != 62) {
            return false;
        }
        return arrby[7] == 10;
    }

    private static boolean a(String string) {
        return string != null && string.matches(n);
    }

    private String b(String string) {
        int n2 = Integer.parseInt(string.substring(m));
        byte[] arrby = new byte[n2];
        int n3 = org.apache.commons.compress.c.i.a(this.b, arrby);
        this.a(n3);
        if (n3 != n2) {
            throw new EOFException();
        }
        return org.apache.commons.compress.c.a.a(arrby);
    }

    private static boolean c(String string) {
        return o.equals(string);
    }

    private org.apache.commons.compress.archivers.a.a c(byte[] arrby) {
        int n2 = this.b(arrby);
        this.f = new byte[n2];
        int n3 = org.apache.commons.compress.c.i.a(this, this.f, 0, n2);
        if (n3 != n2) {
            throw new IOException("Failed to read complete // record: expected=" + n2 + " read=" + n3);
        }
        return new org.apache.commons.compress.archivers.a.a(o, n2);
    }

    private boolean d(String string) {
        return string != null && string.matches(p);
    }
}

