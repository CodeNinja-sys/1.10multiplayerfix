/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.a.aa;
import org.apache.a.e.d;
import org.apache.a.h.e;
import org.apache.a.i.c;
import org.apache.a.i.e.a;
import org.apache.a.i.g.j;
import org.apache.a.i.g.p;
import org.apache.a.j.f;
import org.apache.a.n;
import org.apache.a.o;
import org.apache.a.t;
import org.apache.a.u;
import org.apache.a.x;

public class g
extends c
implements aa {
    private final org.apache.a.j.c a;
    private final org.apache.a.j.e b;

    public g(int n2, int n3, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, d d2, e e2, e e3, org.apache.a.j.d d3, f f2) {
        super(n2, n3, charsetDecoder, charsetEncoder, d2, e2 != null ? e2 : org.apache.a.i.e.a.c, e3);
        this.a = (d3 != null ? d3 : j.a).a(this.m(), d2);
        this.b = (f2 != null ? f2 : p.a).a(this.o());
    }

    public g(int n2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, d d2) {
        this(n2, n2, charsetDecoder, charsetEncoder, d2, null, null, null, null);
    }

    public g(int n2) {
        this(n2, n2, null, null, null, null, null, null, null);
    }

    protected void a(u u2) {
    }

    protected void c(x x2) {
    }

    public void a(Socket socket) {
        super.a(socket);
    }

    public u a() {
        this.l();
        u u2 = (u)this.a.a();
        this.a(u2);
        this.q();
        return u2;
    }

    public void a(o o2) {
        org.apache.a.o.a.a(o2, "HTTP request");
        this.l();
        n n2 = this.b(o2);
        o2.a(n2);
    }

    public void a(x x2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        this.l();
        this.b.b(x2);
        this.c(x2);
        if (x2.a().b() >= 200) {
            this.r();
        }
    }

    public void b(x x2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        this.l();
        n n2 = x2.b();
        if (n2 == null) {
            return;
        }
        OutputStream outputStream = this.a((t)x2);
        n2.a(outputStream);
        outputStream.close();
    }

    public void b() {
        this.l();
        this.p();
    }
}

