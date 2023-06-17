/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.w;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.k;
import org.apache.a.o.a;

class h
extends k {
    private final long e;
    private final InputStream f;
    private final w g;

    public h(InputStream inputStream, long l2, w w2) {
        super(inputStream);
        this.f = inputStream;
        this.e = l2;
        this.g = w2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(OutputStream outputStream) {
        block7: {
            org.apache.a.o.a.a(outputStream, "Output stream");
            InputStream inputStream = this.f;
            try {
                int n2;
                byte[] arrby = new byte[4096];
                if (this.e < 0L) {
                    int n3;
                    while ((n3 = inputStream.read(arrby)) != -1) {
                        outputStream.write(arrby, 0, n3);
                        w w2 = this.g;
                        Long.valueOf(w2.a + (long)n3);
                        w2.a = w2.a;
                    }
                    break block7;
                }
                for (long i2 = this.e; i2 > 0L; i2 -= (long)n2) {
                    n2 = inputStream.read(arrby, 0, (int)Math.min(4096L, i2));
                    if (n2 == -1) {
                        break;
                    }
                    outputStream.write(arrby, 0, n2);
                    w w3 = this.g;
                    Long.valueOf(w3.a + (long)n2);
                    w3.a = w3.a;
                    outputStream.flush();
                }
            }
            finally {
                inputStream.close();
            }
        }
    }
}

