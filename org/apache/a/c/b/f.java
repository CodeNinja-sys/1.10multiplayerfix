/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.a.h.j;
import org.apache.a.k.b;
import org.apache.a.n;
import org.apache.a.o.a;

public class f
extends j {
    private static final String a = "gzip";

    public f(n n2) {
        super(n2);
    }

    public org.apache.a.f e() {
        return new b("Content-Encoding", a);
    }

    public long c() {
        return -1L;
    }

    public boolean b() {
        return true;
    }

    public InputStream f() {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            this.c.a(gZIPOutputStream);
        }
        finally {
            gZIPOutputStream.close();
        }
    }
}

