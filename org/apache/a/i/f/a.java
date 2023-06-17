/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.a.c.c.e;
import org.apache.a.c.c.i;
import org.apache.a.c.c.q;
import org.apache.a.c.d;
import org.apache.a.c.e.c;
import org.apache.a.c.g;
import org.apache.a.i.f.b;
import org.apache.a.p;
import org.apache.a.x;

public class a
implements b {
    private final b a;
    private final g b;
    private final d c;

    public a(b b2, g g2, d d2) {
        org.apache.a.o.a.a(b2, "HTTP client request executor");
        org.apache.a.o.a.a(g2, "Connection backoff strategy");
        org.apache.a.o.a.a(d2, "Backoff manager");
        this.a = b2;
        this.b = g2;
        this.c = d2;
    }

    public e a(org.apache.a.f.b.b b2, q q2, c c2, i i2) {
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.a.a(q2, "HTTP request");
        org.apache.a.o.a.a(c2, "HTTP context");
        Closeable closeable = null;
        try {
            closeable = this.a.a(b2, q2, c2, i2);
        }
        catch (Exception exception) {
            if (closeable != null) {
                closeable.close();
            }
            if (this.b.a(exception)) {
                this.c.a(b2);
            }
            if (exception instanceof RuntimeException) {
                throw (RuntimeException)exception;
            }
            if (exception instanceof p) {
                throw (p)exception;
            }
            if (exception instanceof IOException) {
                throw (IOException)exception;
            }
            throw new UndeclaredThrowableException(exception);
        }
        if (this.b.a((x)((Object)closeable))) {
            this.c.a(b2);
        } else {
            this.c.b(b2);
        }
        return closeable;
    }
}

