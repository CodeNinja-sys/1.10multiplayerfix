/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.c.b.h;
import org.apache.a.h.j;
import org.apache.a.n;

abstract class a
extends j {
    private static final int a = 2048;
    private InputStream b;

    public a(n n2) {
        super(n2);
    }

    abstract InputStream a(InputStream var1);

    private InputStream i() {
        InputStream inputStream = this.c.f();
        return new h(inputStream, this);
    }

    public InputStream f() {
        if (this.c.g()) {
            if (this.b == null) {
                this.b = this.i();
            }
            return this.b;
        }
        return this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        InputStream inputStream = this.f();
        try {
            int n2;
            byte[] arrby = new byte[2048];
            while ((n2 = inputStream.read(arrby)) != -1) {
                outputStream.write(arrby, 0, n2);
            }
        }
        finally {
            inputStream.close();
        }
    }
}

