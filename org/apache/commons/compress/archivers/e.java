/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.b;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.d;
import org.apache.commons.compress.archivers.d.j;
import org.apache.commons.compress.archivers.f;
import org.apache.commons.compress.archivers.f.v;
import org.apache.commons.compress.archivers.h.ac;
import org.apache.commons.compress.archivers.h.ag;
import org.apache.commons.compress.c.i;

public class e {
    public static final String a = "ar";
    public static final String b = "arj";
    public static final String c = "cpio";
    public static final String d = "dump";
    public static final String e = "jar";
    public static final String f = "tar";
    public static final String g = "zip";
    public static final String h = "7z";
    private String i = null;

    public String a() {
        return this.i;
    }

    public void a(String string) {
        this.i = string;
    }

    public c a(String string, InputStream inputStream) {
        if (string == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if (a.equalsIgnoreCase(string)) {
            return new org.apache.commons.compress.archivers.a.b(inputStream);
        }
        if (b.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new org.apache.commons.compress.archivers.b.c(inputStream, this.i);
            }
            return new org.apache.commons.compress.archivers.b.c(inputStream);
        }
        if (g.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new ac(inputStream, this.i);
            }
            return new ac(inputStream);
        }
        if (f.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new org.apache.commons.compress.archivers.g.b(inputStream, this.i);
            }
            return new org.apache.commons.compress.archivers.g.b(inputStream);
        }
        if (e.equalsIgnoreCase(string)) {
            return new org.apache.commons.compress.archivers.e.b(inputStream);
        }
        if (c.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new org.apache.commons.compress.archivers.c.b(inputStream, this.i);
            }
            return new org.apache.commons.compress.archivers.c.b(inputStream);
        }
        if (d.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new j(inputStream, this.i);
            }
            return new j(inputStream);
        }
        if (h.equalsIgnoreCase(string)) {
            throw new f(h);
        }
        throw new b("Archiver: " + string + " not found.");
    }

    public d a(String string, OutputStream outputStream) {
        if (string == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("OutputStream must not be null.");
        }
        if (a.equalsIgnoreCase(string)) {
            return new org.apache.commons.compress.archivers.a.c(outputStream);
        }
        if (g.equalsIgnoreCase(string)) {
            ag ag2 = new ag(outputStream);
            if (this.i != null) {
                ag2.a(this.i);
            }
            return ag2;
        }
        if (f.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new org.apache.commons.compress.archivers.g.c(outputStream, this.i);
            }
            return new org.apache.commons.compress.archivers.g.c(outputStream);
        }
        if (e.equalsIgnoreCase(string)) {
            return new org.apache.commons.compress.archivers.e.c(outputStream);
        }
        if (c.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return new org.apache.commons.compress.archivers.c.c(outputStream, this.i);
            }
            return new org.apache.commons.compress.archivers.c.c(outputStream);
        }
        if (h.equalsIgnoreCase(string)) {
            throw new f(h);
        }
        throw new b("Archiver: " + string + " not found.");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public c a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Stream must not be null.");
        }
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Mark is not supported.");
        }
        byte[] arrby = new byte[12];
        inputStream.mark(arrby.length);
        try {
            org.apache.commons.compress.archivers.g.b b2;
            block16: {
                org.apache.commons.compress.archivers.g.b b3;
                int n2 = org.apache.commons.compress.c.i.a(inputStream, arrby);
                inputStream.reset();
                if (ac.b(arrby, n2)) {
                    if (this.i == null) return new ac(inputStream);
                    return new ac(inputStream, this.i);
                }
                if (org.apache.commons.compress.archivers.e.b.a(arrby, n2)) {
                    return new org.apache.commons.compress.archivers.e.b(inputStream);
                }
                if (org.apache.commons.compress.archivers.a.b.a(arrby, n2)) {
                    return new org.apache.commons.compress.archivers.a.b(inputStream);
                }
                if (org.apache.commons.compress.archivers.c.b.a(arrby, n2)) {
                    return new org.apache.commons.compress.archivers.c.b(inputStream);
                }
                if (org.apache.commons.compress.archivers.b.c.a(arrby, n2)) {
                    return new org.apache.commons.compress.archivers.b.c(inputStream);
                }
                if (v.a(arrby, n2)) {
                    throw new f(h);
                }
                byte[] arrby2 = new byte[32];
                inputStream.mark(arrby2.length);
                n2 = org.apache.commons.compress.c.i.a(inputStream, arrby2);
                inputStream.reset();
                if (j.a(arrby2, n2)) {
                    return new j(inputStream);
                }
                byte[] arrby3 = new byte[512];
                inputStream.mark(arrby3.length);
                n2 = org.apache.commons.compress.c.i.a(inputStream, arrby3);
                inputStream.reset();
                if (org.apache.commons.compress.archivers.g.b.a(arrby3, n2)) {
                    if (this.i == null) return new org.apache.commons.compress.archivers.g.b(inputStream);
                    return new org.apache.commons.compress.archivers.g.b(inputStream, this.i);
                }
                if (n2 < 512) throw new b("No Archiver found for the stream signature");
                b2 = null;
                try {
                    b2 = new org.apache.commons.compress.archivers.g.b(new ByteArrayInputStream(arrby3));
                    if (!b2.e().h()) break block16;
                    b3 = new org.apache.commons.compress.archivers.g.b(inputStream);
                }
                catch (Exception exception) {
                    org.apache.commons.compress.c.i.a(b2);
                    throw new b("No Archiver found for the stream signature");
                    catch (Throwable throwable) {
                        org.apache.commons.compress.c.i.a(b2);
                        throw throwable;
                    }
                }
                org.apache.commons.compress.c.i.a((Closeable)b2);
                return b3;
            }
            org.apache.commons.compress.c.i.a((Closeable)b2);
            throw new b("No Archiver found for the stream signature");
        }
        catch (IOException iOException) {
            throw new b("Could not use reset and mark operations.", iOException);
        }
    }
}

