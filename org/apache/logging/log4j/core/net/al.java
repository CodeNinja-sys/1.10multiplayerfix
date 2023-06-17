/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.net.a.c;
import org.apache.logging.log4j.core.net.ah;
import org.apache.logging.log4j.core.net.an;
import org.apache.logging.log4j.core.net.ao;
import org.apache.logging.log4j.d;

public class al
extends ah {
    public static final int g = 6514;
    private static final ao h = new ao(null);
    private c i;

    public al(String string, OutputStream outputStream, Socket socket, c c2, InetAddress inetAddress, String string2, int n2, int n3, boolean bl2, f f2) {
        super(string, outputStream, socket, inetAddress, string2, n2, n3, bl2, f2);
        this.i = c2;
    }

    public static al a(c c2, String string, int n2, int n3, boolean bl2, f f2) {
        if (v.a(string)) {
            throw new IllegalArgumentException("A host name is required");
        }
        if (n2 <= 0) {
            n2 = 6514;
        }
        if (n3 == 0) {
            n3 = 30000;
        }
        return (al)al.a("TLS:" + string + ":" + n2, new an(c2, string, n2, n3, bl2, f2), h);
    }

    @Override
    protected Socket a(String string, int n2) {
        SSLSocketFactory sSLSocketFactory = al.b(this.i);
        return sSLSocketFactory.createSocket(string, n2);
    }

    private static SSLSocketFactory b(c c2) {
        SSLSocketFactory sSLSocketFactory = c2 != null ? c2.a() : (SSLSocketFactory)SSLSocketFactory.getDefault();
        return sSLSocketFactory;
    }

    static /* synthetic */ d p() {
        return a;
    }

    static /* synthetic */ d q() {
        return a;
    }

    static /* synthetic */ SSLSocketFactory a(c c2) {
        return al.b(c2);
    }
}

