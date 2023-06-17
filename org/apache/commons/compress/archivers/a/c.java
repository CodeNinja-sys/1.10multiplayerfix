/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.a;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.a.a;
import org.apache.commons.compress.archivers.d;

public class c
extends d {
    public static final int b = 0;
    public static final int c = 1;
    private final OutputStream d;
    private long e = 0L;
    private a f;
    private boolean g = false;
    private int h = 0;
    private boolean i = false;

    public c(OutputStream outputStream) {
        this.d = outputStream;
    }

    public void b(int n2) {
        this.h = n2;
    }

    private long e() {
        byte[] arrby = org.apache.commons.compress.c.a.a("!<arch>\n");
        this.d.write(arrby);
        return arrby.length;
    }

    public void a() {
        if (this.i) {
            throw new IOException("Stream has already been finished");
        }
        if (this.f == null || !this.g) {
            throw new IOException("No current entry to close");
        }
        if (this.e % 2L != 0L) {
            this.d.write(10);
        }
        this.g = false;
    }

    public void a(org.apache.commons.compress.archivers.a a2) {
        if (this.i) {
            throw new IOException("Stream has already been finished");
        }
        a a3 = (a)a2;
        if (this.f == null) {
            this.e();
        } else {
            if (this.f.f() != this.e) {
                throw new IOException("length does not match entry (" + this.f.f() + " != " + this.e);
            }
            if (this.g) {
                this.a();
            }
        }
        this.f = a3;
        this.a(a3);
        this.e = 0L;
        this.g = true;
    }

    private long a(long l2, long l3, char c2) {
        long l4 = l3 - l2;
        if (l4 > 0L) {
            int n2 = 0;
            while ((long)n2 < l4) {
                this.write(c2);
                ++n2;
            }
        }
        return l3;
    }

    private long a(String string) {
        byte[] arrby = string.getBytes("ascii");
        this.write(arrby);
        return arrby.length;
    }

    private long a(a a2) {
        long l2 = 0L;
        boolean bl2 = false;
        String string = a2.getName();
        if (0 == this.h && string.length() > 16) {
            throw new IOException("filename too long, > 16 chars: " + string);
        }
        if (1 == this.h && (string.length() > 16 || string.indexOf(" ") > -1)) {
            bl2 = true;
            l2 += this.a("#1/" + String.valueOf(string.length()));
        } else {
            l2 += this.a(string);
        }
        l2 = this.a(l2, 16L, ' ');
        String string2 = "" + a2.e();
        if (string2.length() > 12) {
            throw new IOException("modified too long");
        }
        l2 += this.a(string2);
        l2 = this.a(l2, 28L, ' ');
        String string3 = "" + a2.b();
        if (string3.length() > 6) {
            throw new IOException("userid too long");
        }
        l2 += this.a(string3);
        l2 = this.a(l2, 34L, ' ');
        String string4 = "" + a2.c();
        if (string4.length() > 6) {
            throw new IOException("groupid too long");
        }
        l2 += this.a(string4);
        l2 = this.a(l2, 40L, ' ');
        String string5 = "" + Integer.toString(a2.d(), 8);
        if (string5.length() > 8) {
            throw new IOException("filemode too long");
        }
        l2 += this.a(string5);
        l2 = this.a(l2, 48L, ' ');
        String string6 = String.valueOf(a2.f() + (long)(bl2 ? string.length() : 0));
        if (string6.length() > 10) {
            throw new IOException("size too long");
        }
        l2 += this.a(string6);
        l2 = this.a(l2, 58L, ' ');
        l2 += this.a("`\n");
        if (bl2) {
            l2 += this.a(string);
        }
        return l2;
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.d.write(arrby, n2, n3);
        this.a(n3);
        this.e += (long)n3;
    }

    public void close() {
        if (!this.i) {
            this.b();
        }
        this.d.close();
        this.f = null;
    }

    public org.apache.commons.compress.archivers.a a(File file, String string) {
        if (this.i) {
            throw new IOException("Stream has already been finished");
        }
        return new a(file, string);
    }

    public void b() {
        if (this.g) {
            throw new IOException("This archive contains unclosed entries.");
        }
        if (this.i) {
            throw new IOException("This archive has already been finished");
        }
        this.i = true;
    }
}

