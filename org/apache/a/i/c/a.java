/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.f.c;
import org.apache.a.f.t;
import org.apache.a.f.w;
import org.apache.a.i.c.k;
import org.apache.a.m;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.u;
import org.apache.a.x;

public abstract class a
implements t,
g {
    private final c a;
    private volatile w b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile long e;

    protected a(c c2, w w2) {
        this.a = c2;
        this.b = w2;
        this.c = false;
        this.d = false;
        this.e = Long.MAX_VALUE;
    }

    protected synchronized void u() {
        this.b = null;
        this.e = Long.MAX_VALUE;
    }

    protected w v() {
        return this.b;
    }

    protected c w() {
        return this.a;
    }

    protected final void x() {
        if (this.y()) {
            throw new InterruptedIOException("Connection has been shut down");
        }
    }

    protected boolean y() {
        return this.d;
    }

    protected final void a(w w2) {
        if (this.y() || w2 == null) {
            throw new k();
        }
    }

    public boolean c() {
        w w2 = this.v();
        if (w2 == null) {
            return false;
        }
        return w2.c();
    }

    public boolean d() {
        if (this.y()) {
            return true;
        }
        w w2 = this.v();
        if (w2 == null) {
            return true;
        }
        return w2.d();
    }

    public void b(int n2) {
        w w2 = this.v();
        this.a(w2);
        w2.b(n2);
    }

    public int e() {
        w w2 = this.v();
        this.a(w2);
        return w2.e();
    }

    public m g() {
        w w2 = this.v();
        this.a(w2);
        return w2.g();
    }

    public void b() {
        w w2 = this.v();
        this.a(w2);
        w2.b();
    }

    public boolean a(int n2) {
        w w2 = this.v();
        this.a(w2);
        return w2.a(n2);
    }

    public void a(x x2) {
        w w2 = this.v();
        this.a(w2);
        this.p();
        w2.a(x2);
    }

    public x a() {
        w w2 = this.v();
        this.a(w2);
        this.p();
        return w2.a();
    }

    public void a(o o2) {
        w w2 = this.v();
        this.a(w2);
        this.p();
        w2.a(o2);
    }

    public void a(u u2) {
        w w2 = this.v();
        this.a(w2);
        this.p();
        w2.a(u2);
    }

    public InetAddress h() {
        w w2 = this.v();
        this.a(w2);
        return w2.h();
    }

    public int i() {
        w w2 = this.v();
        this.a(w2);
        return w2.i();
    }

    public InetAddress j() {
        w w2 = this.v();
        this.a(w2);
        return w2.j();
    }

    public int k() {
        w w2 = this.v();
        this.a(w2);
        return w2.k();
    }

    public boolean l() {
        w w2 = this.v();
        this.a(w2);
        return w2.m();
    }

    public void a(Socket socket) {
        throw new UnsupportedOperationException();
    }

    public Socket t() {
        w w2 = this.v();
        this.a(w2);
        if (!this.c()) {
            return null;
        }
        return w2.t();
    }

    public SSLSession n() {
        w w2 = this.v();
        this.a(w2);
        if (!this.c()) {
            return null;
        }
        SSLSession sSLSession = null;
        Socket socket = w2.t();
        if (socket instanceof SSLSocket) {
            sSLSession = ((SSLSocket)socket).getSession();
        }
        return sSLSession;
    }

    public void o() {
        this.c = true;
    }

    public void p() {
        this.c = false;
    }

    public boolean q() {
        return this.c;
    }

    public void a(long l2, TimeUnit timeUnit) {
        this.e = l2 > 0L ? timeUnit.toMillis(l2) : -1L;
    }

    public synchronized void cM_() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a(this, this.e, TimeUnit.MILLISECONDS);
    }

    public synchronized void cN_() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.p();
        try {
            this.f();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.a.a(this, this.e, TimeUnit.MILLISECONDS);
    }

    public Object a(String string) {
        w w2 = this.v();
        this.a(w2);
        if (w2 instanceof g) {
            return ((g)((Object)w2)).a(string);
        }
        return null;
    }

    public Object b(String string) {
        w w2 = this.v();
        this.a(w2);
        if (w2 instanceof g) {
            return ((g)((Object)w2)).b(string);
        }
        return null;
    }

    public void a(String string, Object object) {
        w w2 = this.v();
        this.a(w2);
        if (w2 instanceof g) {
            ((g)((Object)w2)).a(string, object);
        }
    }
}

