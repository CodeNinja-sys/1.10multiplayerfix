/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.e.d;
import org.apache.a.f.u;
import org.apache.a.i.e;
import org.apache.a.j.f;
import org.apache.a.n.g;

public class q
extends e
implements u,
g {
    private final String a;
    private final Map b;
    private volatile boolean c;

    public q(String string, int n2, int n3, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, d d2, org.apache.a.h.e e2, org.apache.a.h.e e3, f f2, org.apache.a.j.d d3) {
        super(n2, n3, charsetDecoder, charsetEncoder, d2, e2, e3, f2, d3);
        this.a = string;
        this.b = new ConcurrentHashMap();
    }

    public q(String string, int n2) {
        this(string, n2, n2, null, null, null, null, null, null, null);
    }

    public String s() {
        return this.a;
    }

    public void f() {
        this.c = true;
        super.f();
    }

    public Object a(String string) {
        return this.b.get(string);
    }

    public Object b(String string) {
        return this.b.remove(string);
    }

    public void a(String string, Object object) {
        this.b.put(string, object);
    }

    public void a(Socket socket) {
        if (this.c) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
        super.a(socket);
    }

    public Socket t() {
        return super.t();
    }

    public SSLSession n() {
        Socket socket = super.t();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket)socket).getSession();
        }
        return null;
    }
}

