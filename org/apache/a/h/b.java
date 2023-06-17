/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.a;

public class b
extends a {
    private InputStream e;
    private long f = -1L;

    public long c() {
        return this.f;
    }

    public InputStream f() {
        org.apache.a.o.b.a(this.e != null, "Content has not been provided");
        return this.e;
    }

    public boolean a() {
        return false;
    }

    public void a(long l2) {
        this.f = l2;
    }

    public void a(InputStream inputStream) {
        this.e = inputStream;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        InputStream inputStream = this.f();
        try {
            int n2;
            byte[] arrby = new byte[4096];
            while ((n2 = inputStream.read(arrby)) != -1) {
                outputStream.write(arrby, 0, n2);
            }
        }
        finally {
            inputStream.close();
        }
    }

    public boolean g() {
        return this.e != null;
    }
}

