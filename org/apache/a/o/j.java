/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import org.apache.a.o.a;

public final class j {
    public static void a(StringBuilder stringBuilder, SocketAddress socketAddress) {
        a.a((Object)stringBuilder, "Buffer");
        a.a(socketAddress, "Socket address");
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
            InetAddress inetAddress = inetSocketAddress.getAddress();
            stringBuilder.append(inetAddress != null ? inetAddress.getHostAddress() : inetAddress).append(':').append(inetSocketAddress.getPort());
        } else {
            stringBuilder.append(socketAddress);
        }
    }
}

