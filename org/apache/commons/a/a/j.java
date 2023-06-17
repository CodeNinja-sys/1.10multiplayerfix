/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.apache.commons.a.a.g;
import org.apache.commons.a.a.h;

public class j
extends FilterOutputStream {
    private final boolean a;
    private final g b;
    private final byte[] c = new byte[1];
    private final h d = new h();

    public j(OutputStream outputStream, g g2, boolean bl2) {
        super(outputStream);
        this.b = g2;
        this.a = bl2;
    }

    @Override
    public void write(int n2) {
        this.c[0] = (byte)n2;
        this.write(this.c, 0, 1);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            throw new NullPointerException();
        }
        if (n2 < 0 || n3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 > arrby.length || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 > 0) {
            if (this.a) {
                this.b.b(arrby, n2, n3, this.d);
            } else {
                this.b.a(arrby, n2, n3, this.d);
            }
            this.a(false);
        }
    }

    private void a(boolean bl2) {
        byte[] arrby;
        int n2;
        int n3 = this.b.b(this.d);
        if (n3 > 0 && (n2 = this.b.c(arrby = new byte[n3], 0, n3, this.d)) > 0) {
            this.out.write(arrby, 0, n2);
        }
        if (bl2) {
            this.out.flush();
        }
    }

    @Override
    public void flush() {
        this.a(true);
    }

    @Override
    public void close() {
        if (this.a) {
            this.b.b(this.c, 0, -1, this.d);
        } else {
            this.b.a(this.c, 0, -1, this.d);
        }
        this.flush();
        this.out.close();
    }
}

