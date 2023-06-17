/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.IOException;
import org.apache.a.ah;
import org.apache.a.c.c.e;
import org.apache.a.c.c.i;
import org.apache.a.c.c.q;
import org.apache.a.c.e.c;
import org.apache.a.c.k;
import org.apache.a.f;
import org.apache.a.i.f.b;
import org.apache.a.i.f.g;
import org.apache.commons.d.a;

public class m
implements b {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final b b;
    private final k c;

    public m(b b2, k k2) {
        org.apache.a.o.a.a(b2, "HTTP request executor");
        org.apache.a.o.a.a(k2, "HTTP request retry handler");
        this.b = b2;
        this.c = k2;
    }

    public e a(org.apache.a.f.b.b b2, q q2, c c2, i i2) {
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.a.a(q2, "HTTP request");
        org.apache.a.o.a.a(c2, "HTTP context");
        f[] arrf = q2.cJ_();
        int n2 = 1;
        while (true) {
            try {
                return this.b.a(b2, q2, c2, i2);
            }
            catch (IOException iOException) {
                if (i2 != null && i2.h()) {
                    this.a.b("Request has been aborted");
                    throw iOException;
                }
                if (this.c.a(iOException, n2, c2)) {
                    if (this.a.d()) {
                        this.a.c("I/O exception (" + iOException.getClass().getName() + ") caught when processing request to " + b2 + ": " + iOException.getMessage());
                    }
                    if (this.a.a()) {
                        this.a.b(iOException.getMessage(), iOException);
                    }
                    if (!g.a(q2)) {
                        this.a.b("Cannot retry non-repeatable request");
                        throw new org.apache.a.c.m("Cannot retry request with a non-repeatable request entity", iOException);
                    }
                    q2.a(arrf);
                    if (this.a.d()) {
                        this.a.c("Retrying request to " + b2);
                    }
                } else {
                    if (iOException instanceof ah) {
                        ah ah2 = new ah(b2.a().f() + " failed to respond");
                        ah2.setStackTrace(iOException.getStackTrace());
                        throw ah2;
                    }
                    throw iOException;
                }
                ++n2;
                continue;
            }
            break;
        }
    }
}

