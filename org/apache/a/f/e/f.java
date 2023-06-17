/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.a.f.e.b;
import org.apache.a.f.e.c;
import org.apache.a.f.e.j;
import org.apache.a.f.e.m;
import org.apache.a.f.e.p;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.o.k;
import org.apache.a.r;

public class f
implements org.apache.a.f.d.b {
    public static final String a = "TLS";
    public static final String b = "SSL";
    public static final String c = "SSLv2";
    public static final p d = new b();
    public static final p e = new c();
    public static final p f = new m();
    private final SSLSocketFactory g;
    private final p h;
    private final String[] i;
    private final String[] j;

    public static f a() {
        return new f(org.apache.a.f.e.j.a(), e);
    }

    private static String[] a(String string) {
        if (k.b(string)) {
            return null;
        }
        return string.split(" *, *");
    }

    public static f b() {
        return new f((SSLSocketFactory)SSLSocketFactory.getDefault(), org.apache.a.f.e.f.a(System.getProperty("https.protocols")), org.apache.a.f.e.f.a(System.getProperty("https.cipherSuites")), e);
    }

    public f(SSLContext sSLContext) {
        this(sSLContext, e);
    }

    public f(SSLContext sSLContext, p p2) {
        this(((SSLContext)org.apache.a.o.a.a(sSLContext, "SSL context")).getSocketFactory(), null, null, p2);
    }

    public f(SSLContext sSLContext, String[] arrstring, String[] arrstring2, p p2) {
        this(((SSLContext)org.apache.a.o.a.a(sSLContext, "SSL context")).getSocketFactory(), arrstring, arrstring2, p2);
    }

    public f(SSLSocketFactory sSLSocketFactory, p p2) {
        this(sSLSocketFactory, null, null, p2);
    }

    public f(SSLSocketFactory sSLSocketFactory, String[] arrstring, String[] arrstring2, p p2) {
        this.g = (SSLSocketFactory)org.apache.a.o.a.a(sSLSocketFactory, "SSL socket factory");
        this.i = arrstring;
        this.j = arrstring2;
        this.h = p2 != null ? p2 : e;
    }

    protected void a(SSLSocket sSLSocket) {
    }

    public Socket a(g g2) {
        return SocketFactory.getDefault().createSocket();
    }

    public Socket a(int n2, Socket socket, r r2, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g g2) {
        Socket socket2;
        org.apache.a.o.a.a(r2, "HTTP host");
        org.apache.a.o.a.a(inetSocketAddress, "Remote address");
        Socket socket3 = socket2 = socket != null ? socket : this.a(g2);
        if (inetSocketAddress2 != null) {
            socket2.bind(inetSocketAddress2);
        }
        try {
            socket2.connect(inetSocketAddress, n2);
        }
        catch (IOException iOException) {
            try {
                socket2.close();
            }
            catch (IOException iOException2) {
                // empty catch block
            }
            throw iOException;
        }
        if (socket2 instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket)socket2;
            sSLSocket.startHandshake();
            this.a(sSLSocket, r2.a());
            return socket2;
        }
        return this.a(socket2, r2.a(), inetSocketAddress.getPort(), g2);
    }

    public Socket a(Socket socket, String string, int n2, g g2) {
        SSLSocket sSLSocket = (SSLSocket)this.g.createSocket(socket, string, n2, true);
        if (this.i != null) {
            sSLSocket.setEnabledProtocols(this.i);
        }
        if (this.j != null) {
            sSLSocket.setEnabledCipherSuites(this.j);
        }
        this.a(sSLSocket);
        sSLSocket.startHandshake();
        this.a(sSLSocket, string);
        return sSLSocket;
    }

    p c() {
        return this.h;
    }

    private void a(SSLSocket sSLSocket, String string) {
        try {
            this.h.a(string, sSLSocket);
        }
        catch (IOException iOException) {
            try {
                sSLSocket.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            throw iOException;
        }
    }
}

