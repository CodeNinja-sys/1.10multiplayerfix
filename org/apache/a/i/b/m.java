/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import org.apache.a.c.c.e;
import org.apache.a.c.f;
import org.apache.a.c.f.k;
import org.apache.a.c.j;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public abstract class m
implements Closeable,
j {
    private final a a = c.b(this.getClass());

    protected abstract e b(r var1, u var2, g var3);

    public e c(r r2, u u2, g g2) {
        return this.b(r2, u2, g2);
    }

    public e b(org.apache.a.c.c.u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        return this.b(m.c(u2), u2, g2);
    }

    private static r c(org.apache.a.c.c.u u2) {
        r r2 = null;
        URI uRI = u2.k();
        if (uRI.isAbsolute() && (r2 = k.b(uRI)) == null) {
            throw new f("URI does not specify a valid host name: " + uRI);
        }
        return r2;
    }

    public e b(org.apache.a.c.c.u u2) {
        return this.b(u2, (g)null);
    }

    public e b(r r2, u u2) {
        return this.b(r2, u2, null);
    }

    public Object a(org.apache.a.c.c.u u2, org.apache.a.c.r r2) {
        return this.a(u2, r2, null);
    }

    public Object a(org.apache.a.c.c.u u2, org.apache.a.c.r r2, g g2) {
        r r3 = m.c(u2);
        return this.a(r3, u2, r2, g2);
    }

    public Object a(r r2, u u2, org.apache.a.c.r r3) {
        return this.a(r2, u2, r3, null);
    }

    public Object a(r r2, u u2, org.apache.a.c.r r3, g g2) {
        Object object;
        org.apache.a.o.a.a(r3, "Response handler");
        e e2 = this.c(r2, u2, g2);
        try {
            object = r3.a(e2);
        }
        catch (Exception exception) {
            n n2 = e2.b();
            try {
                org.apache.a.o.g.b(n2);
            }
            catch (Exception exception2) {
                this.a.d("Error consuming content after an exception.", exception2);
            }
            if (exception instanceof RuntimeException) {
                throw (RuntimeException)exception;
            }
            if (exception instanceof IOException) {
                throw (IOException)exception;
            }
            throw new UndeclaredThrowableException(exception);
        }
        n n3 = e2.b();
        org.apache.a.o.g.b(n3);
        return object;
    }

    public /* synthetic */ x a(r r2, u u2, g g2) {
        return this.c(r2, u2, g2);
    }

    public /* synthetic */ x a(r r2, u u2) {
        return this.b(r2, u2);
    }

    public /* synthetic */ x a(org.apache.a.c.c.u u2, g g2) {
        return this.b(u2, g2);
    }

    public /* synthetic */ x a(org.apache.a.c.c.u u2) {
        return this.b(u2);
    }
}

