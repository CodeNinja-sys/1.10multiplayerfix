/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.IOException;
import java.io.InputStream;
import org.apache.a.ad;
import org.apache.a.ap;
import org.apache.a.f;
import org.apache.a.i.g.a;
import org.apache.a.j.h;
import org.apache.a.o.d;
import org.apache.a.p;

public class e
extends InputStream {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 2048;
    private final h e;
    private final d f;
    private int g;
    private int h;
    private int i;
    private boolean j = false;
    private boolean k = false;
    private f[] l = new f[0];

    public e(h h2) {
        this.e = (h)org.apache.a.o.a.a(h2, "Session input buffer");
        this.i = 0;
        this.f = new d(16);
        this.g = 1;
    }

    public int available() {
        if (this.e instanceof org.apache.a.j.a) {
            int n2 = ((org.apache.a.j.a)((Object)this.e)).g();
            return Math.min(n2, this.h - this.i);
        }
        return 0;
    }

    public int read() {
        int n2;
        if (this.k) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.j) {
            return -1;
        }
        if (this.g != 2) {
            this.b();
            if (this.j) {
                return -1;
            }
        }
        if ((n2 = this.e.a()) != -1) {
            ++this.i;
            if (this.i >= this.h) {
                this.g = 3;
            }
        }
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4;
        if (this.k) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.j) {
            return -1;
        }
        if (this.g != 2) {
            this.b();
            if (this.j) {
                return -1;
            }
        }
        if ((n4 = this.e.a(arrby, n2, Math.min(n3, this.h - this.i))) != -1) {
            this.i += n4;
            if (this.i >= this.h) {
                this.g = 3;
            }
            return n4;
        }
        this.j = true;
        throw new ap("Truncated chunk ( expected size: " + this.h + "; actual size: " + this.i + ")");
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    private void b() {
        this.h = this.c();
        if (this.h < 0) {
            throw new ad("Negative chunk size");
        }
        this.g = 2;
        this.i = 0;
        if (this.h == 0) {
            this.j = true;
            this.d();
        }
    }

    private int c() {
        int n2 = this.g;
        switch (n2) {
            case 3: {
                this.f.a();
                int n3 = this.e.a(this.f);
                if (n3 == -1) {
                    return 0;
                }
                if (!this.f.f()) {
                    throw new ad("Unexpected content at the end of chunk");
                }
                this.g = 1;
            }
            case 1: {
                this.f.a();
                int n4 = this.e.a(this.f);
                if (n4 == -1) {
                    return 0;
                }
                int n5 = this.f.d(59);
                if (n5 < 0) {
                    n5 = this.f.e();
                }
                try {
                    return Integer.parseInt(this.f.b(0, n5), 16);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new ad("Bad chunk header");
                }
            }
        }
        throw new IllegalStateException("Inconsistent codec state");
    }

    private void d() {
        try {
            this.l = org.apache.a.i.g.a.a(this.e, -1, -1, null);
        }
        catch (p p2) {
            ad ad2 = new ad("Invalid footer: " + p2.getMessage());
            ad2.initCause(p2);
            throw ad2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        if (!this.k) {
            try {
                if (!this.j) {
                    byte[] arrby = new byte[2048];
                    while (this.read(arrby) >= 0) {
                    }
                }
            }
            finally {
                this.j = true;
                this.k = true;
            }
        }
    }

    public f[] a() {
        return (f[])this.l.clone();
    }
}

