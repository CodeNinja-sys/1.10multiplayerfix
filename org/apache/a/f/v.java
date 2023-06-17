/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.apache.a.f.c.m;
import org.apache.a.f.g;
import org.apache.a.l.h;
import org.apache.a.l.j;
import org.apache.a.o.a;
import org.apache.a.o.b;

public final class v
implements m {
    private static final v a = new v();

    public static v a() {
        return a;
    }

    private v() {
    }

    public Socket b() {
        return new Socket();
    }

    public Socket a(Socket socket, String string, int n2, InetAddress inetAddress, int n3, j j2) {
        org.apache.a.o.a.a((Object)string, "Target host");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        Socket socket2 = socket;
        if (socket2 == null) {
            socket2 = this.b();
        }
        if (inetAddress != null || n3 > 0) {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, n3 > 0 ? n3 : 0);
            socket2.bind(inetSocketAddress);
        }
        int n4 = h.f(j2);
        InetAddress[] arrinetAddress = InetAddress.getAllByName(string);
        ArrayList<InetAddress> arrayList = new ArrayList<InetAddress>(arrinetAddress.length);
        arrayList.addAll(Arrays.asList(arrinetAddress));
        Collections.shuffle(arrayList);
        IOException iOException = null;
        for (InetAddress inetAddress2 : arrayList) {
            try {
                socket2.connect(new InetSocketAddress(inetAddress2, n2), n4);
                break;
            }
            catch (SocketTimeoutException socketTimeoutException) {
                throw new g("Connect to " + inetAddress2 + " timed out");
            }
            catch (IOException iOException2) {
                socket2 = new Socket();
                iOException = iOException2;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
        return socket2;
    }

    public final boolean a(Socket socket) {
        org.apache.a.o.a.a(socket, "Socket");
        b.a(!socket.isClosed(), "Socket is closed");
        return false;
    }
}

