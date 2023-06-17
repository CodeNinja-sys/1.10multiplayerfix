/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.f;
import org.apache.a.f.w;
import org.apache.a.i.c.af;
import org.apache.a.i.c.ag;
import org.apache.a.i.c.az;
import org.apache.a.i.c.n;
import org.apache.a.i.q;
import org.apache.a.j.h;
import org.apache.a.j.i;
import org.apache.a.l.b;
import org.apache.a.l.j;
import org.apache.a.l.m;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.a.y;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class l
extends q
implements org.apache.a.f.u,
w,
g {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final a b = org.apache.commons.d.c.d("org.apache.http.headers");
    private final a c = org.apache.commons.d.c.d("org.apache.http.wire");
    private volatile Socket d;
    private r e;
    private boolean f;
    private volatile boolean g;
    private final Map h = new HashMap();

    public String s() {
        return null;
    }

    public final r l() {
        return this.e;
    }

    public final boolean m() {
        return this.f;
    }

    public final Socket t() {
        return this.d;
    }

    public SSLSession n() {
        if (this.d instanceof SSLSocket) {
            return ((SSLSocket)this.d).getSession();
        }
        return null;
    }

    public void a(Socket socket, r r2) {
        this.w();
        this.d = socket;
        this.e = r2;
        if (this.g) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    public void a(boolean bl2, j j2) {
        org.apache.a.o.a.a(j2, "Parameters");
        this.w();
        this.f = bl2;
        this.a(this.d, j2);
    }

    public void f() {
        this.g = true;
        try {
            Socket socket;
            super.f();
            if (this.a.a()) {
                this.a.b("Connection " + this + " shut down");
            }
            if ((socket = this.d) != null) {
                socket.close();
            }
        }
        catch (IOException iOException) {
            this.a.b("I/O error shutting down connection", iOException);
        }
    }

    public void close() {
        try {
            super.close();
            if (this.a.a()) {
                this.a.b("Connection " + this + " closed");
            }
        }
        catch (IOException iOException) {
            this.a.b("I/O error closing connection", iOException);
        }
    }

    protected h a(Socket socket, int n2, j j2) {
        h h2 = super.a(socket, n2 > 0 ? n2 : 8192, j2);
        if (this.c.a()) {
            h2 = new af(h2, new az(this.c), m.a(j2));
        }
        return h2;
    }

    protected i b(Socket socket, int n2, j j2) {
        i i2 = super.b(socket, n2 > 0 ? n2 : 8192, j2);
        if (this.c.a()) {
            i2 = new ag(i2, new az(this.c), m.a(j2));
        }
        return i2;
    }

    protected org.apache.a.j.c a(h h2, y y2, j j2) {
        return new n(h2, null, y2, j2);
    }

    public void a(Socket socket) {
        this.a(socket, (j)new b());
    }

    public void a(Socket socket, r r2, boolean bl2, j j2) {
        this.o();
        org.apache.a.o.a.a(r2, "Target host");
        org.apache.a.o.a.a(j2, "Parameters");
        if (socket != null) {
            this.d = socket;
            this.a(socket, j2);
        }
        this.e = r2;
        this.f = bl2;
    }

    public x a() {
        x x2 = super.a();
        if (this.a.a()) {
            this.a.b("Receiving response: " + x2.a());
        }
        if (this.b.a()) {
            f[] arrf;
            this.b.b("<< " + x2.a().toString());
            for (f f2 : arrf = x2.cJ_()) {
                this.b.b("<< " + f2.toString());
            }
        }
        return x2;
    }

    public void a(u u2) {
        if (this.a.a()) {
            this.a.b("Sending request: " + u2.g());
        }
        super.a(u2);
        if (this.b.a()) {
            f[] arrf;
            this.b.b(">> " + u2.g().toString());
            for (f f2 : arrf = u2.cJ_()) {
                this.b.b(">> " + f2.toString());
            }
        }
    }

    public Object a(String string) {
        return this.h.get(string);
    }

    public Object b(String string) {
        return this.h.remove(string);
    }

    public void a(String string, Object object) {
        this.h.put(string, object);
    }
}

