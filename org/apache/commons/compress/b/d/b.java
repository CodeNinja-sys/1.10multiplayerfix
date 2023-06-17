/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import org.apache.commons.compress.b.d.c;
import org.apache.commons.compress.b.d.e;
import org.apache.commons.compress.b.d.i;

public class b
extends org.apache.commons.compress.b.b {
    private final InputStream a;
    private final i b;
    private static final byte[] c = new byte[]{-54, -2, -48, 13};
    private static final int d = c.length;

    public b(InputStream inputStream) {
        this(inputStream, e.a);
    }

    public b(InputStream inputStream, e e2) {
        this(inputStream, null, e2, null);
    }

    public b(InputStream inputStream, Map map) {
        this(inputStream, e.a, map);
    }

    public b(InputStream inputStream, e e2, Map map) {
        this(inputStream, null, e2, map);
    }

    public b(File file) {
        this(file, e.a);
    }

    public b(File file, e e2) {
        this(null, file, e2, null);
    }

    public b(File file, Map map) {
        this(file, e.a, map);
    }

    public b(File file, e e2, Map map) {
        this(null, file, e2, map);
    }

    private b(InputStream inputStream, File file, e e2, Map map) {
        this.a = inputStream;
        this.b = e2.a();
        JarOutputStream jarOutputStream = new JarOutputStream(this.b);
        Pack200.Unpacker unpacker = Pack200.newUnpacker();
        if (map != null) {
            unpacker.properties().putAll(map);
        }
        if (file == null) {
            unpacker.unpack(new c(this, inputStream), jarOutputStream);
        } else {
            unpacker.unpack(file, jarOutputStream);
        }
        jarOutputStream.close();
    }

    public int read() {
        return this.b.b().read();
    }

    public int read(byte[] arrby) {
        return this.b.b().read(arrby);
    }

    public int read(byte[] arrby, int n2, int n3) {
        return this.b.b().read(arrby, n2, n3);
    }

    public int available() {
        return this.b.b().available();
    }

    public boolean markSupported() {
        try {
            return this.b.b().markSupported();
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public void mark(int n2) {
        try {
            this.b.b().mark(n2);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void reset() {
        this.b.b().reset();
    }

    public long skip(long l2) {
        return this.b.b().skip(l2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        try {
            this.b.c();
        }
        finally {
            if (this.a != null) {
                this.a.close();
            }
        }
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < d) {
            return false;
        }
        for (int i2 = 0; i2 < d; ++i2) {
            if (arrby[i2] == c[i2]) continue;
            return false;
        }
        return true;
    }
}

