/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.a.c.b.d;

public class c
extends InputStream {
    private InputStream a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public c(InputStream inputStream) {
        byte[] arrby = new byte[6];
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, arrby.length);
        int n2 = pushbackInputStream.read(arrby);
        if (n2 == -1) {
            throw new IOException("Unable to read the response");
        }
        byte[] arrby2 = new byte[1];
        Inflater inflater = new Inflater();
        try {
            int n3;
            while ((n3 = inflater.inflate(arrby2)) == 0) {
                if (inflater.finished()) {
                    throw new IOException("Unable to read the response");
                }
                if (inflater.needsDictionary()) break;
                if (!inflater.needsInput()) continue;
                inflater.setInput(arrby);
            }
            if (n3 == -1) {
                throw new IOException("Unable to read the response");
            }
            pushbackInputStream.unread(arrby, 0, n2);
            this.a = new d(pushbackInputStream, new Inflater());
        }
        catch (DataFormatException dataFormatException) {
            pushbackInputStream.unread(arrby, 0, n2);
            this.a = new d(pushbackInputStream, new Inflater(true));
        }
        finally {
            inflater.end();
        }
    }

    public int read() {
        return this.a.read();
    }

    public int read(byte[] arrby) {
        return this.a.read(arrby);
    }

    public int read(byte[] arrby, int n2, int n3) {
        return this.a.read(arrby, n2, n3);
    }

    public long skip(long l2) {
        return this.a.skip(l2);
    }

    public int available() {
        return this.a.available();
    }

    public void mark(int n2) {
        this.a.mark(n2);
    }

    public void reset() {
        this.a.reset();
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public void close() {
        this.a.close();
    }
}

