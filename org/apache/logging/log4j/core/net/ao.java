/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.net.a.c;
import org.apache.logging.log4j.core.net.al;
import org.apache.logging.log4j.core.net.am;
import org.apache.logging.log4j.core.net.an;
import org.apache.logging.log4j.core.net.ap;

class ao
implements x {
    private ao() {
    }

    public al a(String string, an an2) {
        InetAddress inetAddress = null;
        OutputStream outputStream = null;
        Socket socket = null;
        try {
            inetAddress = this.a(an.a(an2));
            socket = this.a(an2);
            outputStream = socket.getOutputStream();
            this.a(an.b(an2), outputStream);
        }
        catch (IOException iOException) {
            al.p().b("TLSSocketManager (" + string + ") " + iOException);
            outputStream = new ByteArrayOutputStream();
        }
        catch (ap ap2) {
            return null;
        }
        return this.a(string, outputStream, socket, an2.a, inetAddress, an.a(an2), an.c(an2), an.b(an2), an.d(an2), an.e(an2));
    }

    private InetAddress a(String string) {
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            al.q().b("Could not find address of " + string, (Throwable)unknownHostException);
            throw new ap(this, null);
        }
        return inetAddress;
    }

    private void a(int n2, OutputStream outputStream) {
        if (n2 == 0 && outputStream == null) {
            throw new ap(this, null);
        }
    }

    private Socket a(an an2) {
        SSLSocketFactory sSLSocketFactory = al.a(an2.a);
        SSLSocket sSLSocket = (SSLSocket)sSLSocketFactory.createSocket(an.a(an2), an.c(an2));
        return sSLSocket;
    }

    private al a(String string, OutputStream outputStream, Socket socket, c c2, InetAddress inetAddress, String string2, int n2, int n3, boolean bl2, f f2) {
        return new al(string, outputStream, socket, c2, inetAddress, string2, n2, n3, bl2, f2);
    }

    /* synthetic */ ao(am am2) {
        this();
    }
}

