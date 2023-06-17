/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.e;

import java.io.OutputStream;
import org.apache.a.h.e;
import org.apache.a.i.g.f;
import org.apache.a.i.g.h;
import org.apache.a.i.g.w;
import org.apache.a.j.i;
import org.apache.a.n;
import org.apache.a.o.a;
import org.apache.a.t;

public class c {
    private final e a;

    public c(e e2) {
        this.a = (e)org.apache.a.o.a.a(e2, "Content length strategy");
    }

    protected OutputStream a(i i2, t t2) {
        long l2 = this.a.a(t2);
        if (l2 == -2L) {
            return new f(i2);
        }
        if (l2 == -1L) {
            return new w(i2);
        }
        return new h(i2, l2);
    }

    public void a(i i2, t t2, n n2) {
        org.apache.a.o.a.a(i2, "Session output buffer");
        org.apache.a.o.a.a(t2, "HTTP message");
        org.apache.a.o.a.a(n2, "HTTP entity");
        OutputStream outputStream = this.a(i2, t2);
        n2.a(outputStream);
        outputStream.close();
    }
}

