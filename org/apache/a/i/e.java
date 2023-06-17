/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.a.e.d;
import org.apache.a.i.c;
import org.apache.a.i.g.l;
import org.apache.a.i.g.n;
import org.apache.a.j;
import org.apache.a.j.f;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.t;
import org.apache.a.u;
import org.apache.a.x;

public class e
extends c
implements j {
    private final org.apache.a.j.c a;
    private final org.apache.a.j.e b;

    public e(int n2, int n3, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, d d2, org.apache.a.h.e e2, org.apache.a.h.e e3, f f2, org.apache.a.j.d d3) {
        super(n2, n3, charsetDecoder, charsetEncoder, d2, e2, e3);
        this.b = (f2 != null ? f2 : l.a).a(this.o());
        this.a = (d3 != null ? d3 : n.a).a(this.m(), d2);
    }

    public e(int n2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, d d2) {
        this(n2, n2, charsetDecoder, charsetEncoder, d2, null, null, null, null);
    }

    public e(int n2) {
        this(n2, n2, null, null, null, null, null, null, null);
    }

    protected void b(x x2) {
    }

    protected void b(u u2) {
    }

    public void a(Socket socket) {
        super.a(socket);
    }

    public boolean a(int n2) {
        this.l();
        try {
            return this.c(n2);
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return false;
        }
    }

    public void a(u u2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        this.l();
        this.b.b(u2);
        this.b(u2);
        this.q();
    }

    public void a(o o2) {
        org.apache.a.o.a.a(o2, "HTTP request");
        this.l();
        org.apache.a.n n2 = o2.b();
        if (n2 == null) {
            return;
        }
        OutputStream outputStream = this.a((t)o2);
        n2.a(outputStream);
        outputStream.close();
    }

    public x a() {
        this.l();
        x x2 = (x)this.a.a();
        this.b(x2);
        if (x2.a().b() >= 200) {
            this.r();
        }
        return x2;
    }

    public void a(x x2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        this.l();
        org.apache.a.n n2 = this.b((t)x2);
        x2.a(n2);
    }

    public void b() {
        this.l();
        this.p();
    }
}

