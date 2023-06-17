/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.a.f.c.a;
import org.apache.a.f.e.b;
import org.apache.a.f.e.c;
import org.apache.a.f.e.j;
import org.apache.a.f.e.m;
import org.apache.a.f.e.o;
import org.apache.a.f.e.p;
import org.apache.a.f.r;
import org.apache.a.l.h;
import org.apache.a.n.g;
import org.apache.a.o.k;

public class l
implements org.apache.a.f.c.b,
org.apache.a.f.c.c,
org.apache.a.f.c.g,
org.apache.a.f.d.b {
    public static final String a = "TLS";
    public static final String b = "SSL";
    public static final String c = "SSLv2";
    public static final p d = new b();
    public static final p e = new c();
    public static final p f = new m();
    private final SSLSocketFactory g;
    private final a h;
    private volatile p i;
    private final String[] j;
    private final String[] k;

    public static l a() {
        return new l(org.apache.a.f.e.j.a(), e);
    }

    private static String[] a(String string) {
        if (org.apache.a.o.k.b(string)) {
            return null;
        }
        return string.split(" *, *");
    }

    public static l c() {
        return new l((SSLSocketFactory)SSLSocketFactory.getDefault(), l.a(System.getProperty("https.protocols")), l.a(System.getProperty("https.cipherSuites")), e);
    }

    public l(String string, KeyStore keyStore, String string2, KeyStore keyStore2, SecureRandom secureRandom, a a2) {
        this(org.apache.a.f.e.j.c().a(string).a(secureRandom).a(keyStore, string2 != null ? string2.toCharArray() : null).a(keyStore2).c(), a2);
    }

    public l(String string, KeyStore keyStore, String string2, KeyStore keyStore2, SecureRandom secureRandom, o o2, p p2) {
        this(org.apache.a.f.e.j.c().a(string).a(secureRandom).a(keyStore, string2 != null ? string2.toCharArray() : null).a(keyStore2, o2).c(), p2);
    }

    public l(String string, KeyStore keyStore, String string2, KeyStore keyStore2, SecureRandom secureRandom, p p2) {
        this(org.apache.a.f.e.j.c().a(string).a(secureRandom).a(keyStore, string2 != null ? string2.toCharArray() : null).a(keyStore2).c(), p2);
    }

    public l(KeyStore keyStore, String string, KeyStore keyStore2) {
        this(org.apache.a.f.e.j.c().a(keyStore, string != null ? string.toCharArray() : null).a(keyStore2).c(), e);
    }

    public l(KeyStore keyStore, String string) {
        this(org.apache.a.f.e.j.c().a(keyStore, string != null ? string.toCharArray() : null).c(), e);
    }

    public l(KeyStore keyStore) {
        this(org.apache.a.f.e.j.c().a(keyStore).c(), e);
    }

    public l(o o2, p p2) {
        this(org.apache.a.f.e.j.c().a(null, o2).c(), p2);
    }

    public l(o o2) {
        this(org.apache.a.f.e.j.c().a(null, o2).c(), e);
    }

    public l(SSLContext sSLContext) {
        this(sSLContext, e);
    }

    public l(SSLContext sSLContext, a a2) {
        this.g = sSLContext.getSocketFactory();
        this.i = e;
        this.h = a2;
        this.j = null;
        this.k = null;
    }

    public l(SSLContext sSLContext, p p2) {
        this(((SSLContext)org.apache.a.o.a.a(sSLContext, "SSL context")).getSocketFactory(), null, null, p2);
    }

    public l(SSLContext sSLContext, String[] arrstring, String[] arrstring2, p p2) {
        this(((SSLContext)org.apache.a.o.a.a(sSLContext, "SSL context")).getSocketFactory(), arrstring, arrstring2, p2);
    }

    public l(SSLSocketFactory sSLSocketFactory, p p2) {
        this(sSLSocketFactory, null, null, p2);
    }

    public l(SSLSocketFactory sSLSocketFactory, String[] arrstring, String[] arrstring2, p p2) {
        this.g = (SSLSocketFactory)org.apache.a.o.a.a(sSLSocketFactory, "SSL socket factory");
        this.j = arrstring;
        this.k = arrstring2;
        this.i = p2 != null ? p2 : e;
        this.h = null;
    }

    public Socket a(org.apache.a.l.j j2) {
        return this.a((g)null);
    }

    public Socket b() {
        return this.a((g)null);
    }

    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, org.apache.a.l.j j2) {
        org.apache.a.o.a.a(inetSocketAddress, "Remote address");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        org.apache.a.r r2 = inetSocketAddress instanceof r ? ((r)inetSocketAddress).a() : new org.apache.a.r(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        int n2 = org.apache.a.l.h.f(j2);
        return this.a(n2, socket, r2, inetSocketAddress, inetSocketAddress2, null);
    }

    public boolean a(Socket socket) {
        org.apache.a.o.a.a(socket, "Socket");
        org.apache.a.o.b.a(socket instanceof SSLSocket, "Socket not created by this factory");
        org.apache.a.o.b.a(!socket.isClosed(), "Socket is closed");
        return true;
    }

    public Socket a(Socket socket, String string, int n2, org.apache.a.l.j j2) {
        return this.a(socket, string, n2, (g)null);
    }

    public Socket a(Socket socket, String string, int n2, boolean bl2) {
        return this.a(socket, string, n2, (g)null);
    }

    public void a(p p2) {
        org.apache.a.o.a.a(p2, "Hostname verifier");
        this.i = p2;
    }

    public p d() {
        return this.i;
    }

    public Socket a(Socket socket, String string, int n2, InetAddress inetAddress, int n3, org.apache.a.l.j j2) {
        InetAddress inetAddress2 = this.h != null ? this.h.a(string) : InetAddress.getByName(string);
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || n3 > 0) {
            inetSocketAddress = new InetSocketAddress(inetAddress, n3 > 0 ? n3 : 0);
        }
        r r2 = new r(new org.apache.a.r(string, n2), inetAddress2, n2);
        return this.a(socket, r2, inetSocketAddress, j2);
    }

    public Socket b(Socket socket, String string, int n2, boolean bl2) {
        return this.a(socket, string, n2, bl2);
    }

    protected void a(SSLSocket sSLSocket) {
    }

    private void b(SSLSocket sSLSocket) {
        if (this.j != null) {
            sSLSocket.setEnabledProtocols(this.j);
        }
        if (this.k != null) {
            sSLSocket.setEnabledCipherSuites(this.k);
        }
        this.a(sSLSocket);
    }

    public Socket a(g g2) {
        SSLSocket sSLSocket = (SSLSocket)this.g.createSocket();
        this.b(sSLSocket);
        return sSLSocket;
    }

    public Socket a(int n2, Socket socket, org.apache.a.r r2, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g g2) {
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
        this.b(sSLSocket);
        sSLSocket.startHandshake();
        this.a(sSLSocket, string);
        return sSLSocket;
    }

    private void a(SSLSocket sSLSocket, String string) {
        try {
            this.i.a(string, sSLSocket);
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

