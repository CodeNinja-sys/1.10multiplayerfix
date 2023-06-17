/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.d;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.a.f.d.a;
import org.apache.a.n.g;
import org.apache.a.r;

public class c
implements a {
    public static final c a = new c();

    public static c a() {
        return a;
    }

    public Socket a(g g2) {
        return new Socket();
    }

    public Socket a(int n2, Socket socket, r r2, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g g2) {
        Socket socket2;
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
        return socket2;
    }
}

