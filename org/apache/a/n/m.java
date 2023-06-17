/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.io.IOException;
import org.apache.a.ac;
import org.apache.a.aj;
import org.apache.a.ak;
import org.apache.a.j;
import org.apache.a.n.g;
import org.apache.a.n.k;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.p;
import org.apache.a.u;
import org.apache.a.x;

public class m {
    public static final int a = 3000;
    private final int b;

    public m(int n2) {
        this.b = org.apache.a.o.a.a(n2, "Wait for continue time");
    }

    public m() {
        this(3000);
    }

    protected boolean a(u u2, x x2) {
        if ("HEAD".equalsIgnoreCase(u2.g().a())) {
            return false;
        }
        int n2 = x2.a().b();
        return n2 >= 200 && n2 != 204 && n2 != 304 && n2 != 205;
    }

    public x a(u u2, j j2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(j2, "Client connection");
        org.apache.a.o.a.a(g2, "HTTP context");
        try {
            x x2 = this.b(u2, j2, g2);
            if (x2 == null) {
                x2 = this.c(u2, j2, g2);
            }
            return x2;
        }
        catch (IOException iOException) {
            m.a(j2);
            throw iOException;
        }
        catch (p p2) {
            m.a(j2);
            throw p2;
        }
        catch (RuntimeException runtimeException) {
            m.a(j2);
            throw runtimeException;
        }
    }

    private static void a(j j2) {
        try {
            j2.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void a(u u2, k k2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(k2, "HTTP processor");
        org.apache.a.o.a.a(g2, "HTTP context");
        g2.a("http.request", u2);
        k2.a(u2, g2);
    }

    protected x b(u u2, j j2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(j2, "Client connection");
        org.apache.a.o.a.a(g2, "HTTP context");
        x x2 = null;
        g2.a("http.connection", j2);
        g2.a("http.request_sent", Boolean.FALSE);
        j2.a(u2);
        if (u2 instanceof o) {
            boolean bl2 = true;
            ak ak2 = u2.g().b();
            if (((o)u2).a() && !ak2.d(ac.c)) {
                j2.b();
                if (j2.a(this.b)) {
                    int n2;
                    x2 = j2.a();
                    if (this.a(u2, x2)) {
                        j2.a(x2);
                    }
                    if ((n2 = x2.a().b()) < 200) {
                        if (n2 != 100) {
                            throw new aj("Unexpected response: " + x2.a());
                        }
                        x2 = null;
                    } else {
                        bl2 = false;
                    }
                }
            }
            if (bl2) {
                j2.a((o)u2);
            }
        }
        j2.b();
        g2.a("http.request_sent", Boolean.TRUE);
        return x2;
    }

    protected x c(u u2, j j2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(j2, "Client connection");
        org.apache.a.o.a.a(g2, "HTTP context");
        x x2 = null;
        int n2 = 0;
        while (x2 == null || n2 < 200) {
            x2 = j2.a();
            if (this.a(u2, x2)) {
                j2.a(x2);
            }
            n2 = x2.a().b();
        }
        return x2;
    }

    public void a(x x2, k k2, g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        org.apache.a.o.a.a(k2, "HTTP processor");
        org.apache.a.o.a.a(g2, "HTTP context");
        g2.a("http.response", x2);
        k2.a(x2, g2);
    }
}

