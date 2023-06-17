/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.a.e.d;
import org.apache.a.f;
import org.apache.a.h.e;
import org.apache.a.i.c.ac;
import org.apache.a.i.c.ae;
import org.apache.a.i.c.az;
import org.apache.a.i.c.q;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;

class ad
extends q {
    private final a a;
    private final a b;
    private final az c;

    public ad(String string, a a2, a a3, a a4, int n2, int n3, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, d d2, e e2, e e3, org.apache.a.j.f f2, org.apache.a.j.d d3) {
        super(string, n2, n3, charsetDecoder, charsetEncoder, d2, e2, e3, f2, d3);
        this.a = a2;
        this.b = a3;
        this.c = new az(a4, string);
    }

    public void close() {
        if (this.a.a()) {
            this.a.b(this.s() + ": Close connection");
        }
        super.close();
    }

    public void f() {
        if (this.a.a()) {
            this.a.b(this.s() + ": Shutdown connection");
        }
        super.f();
    }

    protected InputStream b(Socket socket) {
        InputStream inputStream = super.b(socket);
        if (this.c.a()) {
            inputStream = new ac(inputStream, this.c);
        }
        return inputStream;
    }

    protected OutputStream c(Socket socket) {
        OutputStream outputStream = super.c(socket);
        if (this.c.a()) {
            outputStream = new ae(outputStream, this.c);
        }
        return outputStream;
    }

    protected void b(x x2) {
        if (x2 != null && this.b.a()) {
            f[] arrf;
            this.b.b(this.s() + " << " + x2.a().toString());
            for (f f2 : arrf = x2.cJ_()) {
                this.b.b(this.s() + " << " + f2.toString());
            }
        }
    }

    protected void b(u u2) {
        if (u2 != null && this.b.a()) {
            f[] arrf;
            this.b.b(this.s() + " >> " + u2.g().toString());
            for (f f2 : arrf = u2.cJ_()) {
                this.b.b(this.s() + " >> " + f2.toString());
            }
        }
    }
}

