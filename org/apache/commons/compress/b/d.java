/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.b.a.a;
import org.apache.commons.compress.b.a.c;
import org.apache.commons.compress.b.b.b;
import org.apache.commons.compress.c.i;

public class d {
    public static final String a = "bzip2";
    public static final String b = "gz";
    public static final String c = "pack200";
    public static final String d = "xz";
    public static final String e = "lzma";
    public static final String f = "snappy-framed";
    public static final String g = "snappy-raw";
    public static final String h = "z";
    private boolean i = false;

    public void a(boolean bl2) {
        this.i = bl2;
    }

    public org.apache.commons.compress.b.b a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Stream must not be null.");
        }
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Mark is not supported.");
        }
        byte[] arrby = new byte[12];
        inputStream.mark(arrby.length);
        try {
            int n2 = org.apache.commons.compress.c.i.a(inputStream, arrby);
            inputStream.reset();
            if (org.apache.commons.compress.b.a.a.a(arrby, n2)) {
                return new a(inputStream, this.i);
            }
            if (org.apache.commons.compress.b.b.a.a(arrby, n2)) {
                return new org.apache.commons.compress.b.b.a(inputStream, this.i);
            }
            if (org.apache.commons.compress.b.f.c.a() && org.apache.commons.compress.b.f.a.a(arrby, n2)) {
                return new org.apache.commons.compress.b.f.a(inputStream, this.i);
            }
            if (org.apache.commons.compress.b.d.b.a(arrby, n2)) {
                return new org.apache.commons.compress.b.d.b(inputStream);
            }
            if (org.apache.commons.compress.b.e.a.a(arrby, n2)) {
                return new org.apache.commons.compress.b.e.a(inputStream);
            }
            if (org.apache.commons.compress.b.g.a.a(arrby, n2)) {
                return new org.apache.commons.compress.b.g.a(inputStream);
            }
        }
        catch (IOException iOException) {
            throw new org.apache.commons.compress.b.a("Failed to detect Compressor from InputStream.", iOException);
        }
        throw new org.apache.commons.compress.b.a("No Compressor found for the stream signature.");
    }

    public org.apache.commons.compress.b.b a(String string, InputStream inputStream) {
        if (string == null || inputStream == null) {
            throw new IllegalArgumentException("Compressor name and stream must not be null.");
        }
        try {
            if (b.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.b.a(inputStream, this.i);
            }
            if (a.equalsIgnoreCase(string)) {
                return new a(inputStream, this.i);
            }
            if (d.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.f.a(inputStream, this.i);
            }
            if (e.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.c.a(inputStream);
            }
            if (c.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.d.b(inputStream);
            }
            if (g.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.e.c(inputStream);
            }
            if (f.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.e.a(inputStream);
            }
            if (h.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.g.a(inputStream);
            }
        }
        catch (IOException iOException) {
            throw new org.apache.commons.compress.b.a("Could not create CompressorInputStream.", iOException);
        }
        throw new org.apache.commons.compress.b.a("Compressor: " + string + " not found.");
    }

    public org.apache.commons.compress.b.c a(String string, OutputStream outputStream) {
        if (string == null || outputStream == null) {
            throw new IllegalArgumentException("Compressor name and stream must not be null.");
        }
        try {
            if (b.equalsIgnoreCase(string)) {
                return new b(outputStream);
            }
            if (a.equalsIgnoreCase(string)) {
                return new c(outputStream);
            }
            if (d.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.f.b(outputStream);
            }
            if (c.equalsIgnoreCase(string)) {
                return new org.apache.commons.compress.b.d.d(outputStream);
            }
        }
        catch (IOException iOException) {
            throw new org.apache.commons.compress.b.a("Could not create CompressorOutputStream", iOException);
        }
        throw new org.apache.commons.compress.b.a("Compressor: " + string + " not found.");
    }
}

