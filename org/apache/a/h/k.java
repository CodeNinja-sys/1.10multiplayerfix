/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.a;
import org.apache.a.h.g;

public class k
extends a {
    private final InputStream e;
    private final long f;

    public k(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public k(InputStream inputStream, long l2) {
        this(inputStream, l2, null);
    }

    public k(InputStream inputStream, g g2) {
        this(inputStream, -1L, g2);
    }

    public k(InputStream inputStream, long l2, g g2) {
        this.e = (InputStream)org.apache.a.o.a.a(inputStream, "Source input stream");
        this.f = l2;
        if (g2 != null) {
            this.a(g2.toString());
        }
    }

    public boolean a() {
        return false;
    }

    public long c() {
        return this.f;
    }

    public InputStream f() {
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        block7: {
            org.apache.a.o.a.a(outputStream, "Output stream");
            InputStream inputStream = this.e;
            try {
                int n2;
                byte[] arrby = new byte[4096];
                if (this.f < 0L) {
                    int n3;
                    while ((n3 = inputStream.read(arrby)) != -1) {
                        outputStream.write(arrby, 0, n3);
                    }
                    break block7;
                }
                for (long i2 = this.f; i2 > 0L; i2 -= (long)n2) {
                    n2 = inputStream.read(arrby, 0, (int)Math.min(4096L, i2));
                    if (n2 == -1) {
                        break;
                    }
                    outputStream.write(arrby, 0, n2);
                }
            }
            finally {
                inputStream.close();
            }
        }
    }

    public boolean g() {
        return true;
    }
}

