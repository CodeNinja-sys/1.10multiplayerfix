/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.c.a;
import io.netty.util.c.ad;
import io.netty.util.c.u;
import java.net.SocketAddress;
import java.util.concurrent.ConcurrentMap;

final class i {
    private static final ConcurrentMap a = u.m();

    static a a(an an2, a a2, SocketAddress socketAddress) {
        an an3;
        if (a2 != null) {
            throw new ar("already bound");
        }
        if (!(socketAddress instanceof a)) {
            throw new ar("unsupported address type: " + ad.a(socketAddress));
        }
        a a3 = (a)socketAddress;
        if (io.netty.channel.c.a.a.equals(a3)) {
            a3 = new a(an2);
        }
        if ((an3 = a.putIfAbsent(a3, an2)) != null) {
            throw new ar("address already in use by: " + an3);
        }
        return a3;
    }

    static an a(SocketAddress socketAddress) {
        return (an)a.get(socketAddress);
    }

    static void a(a a2) {
        a.remove(a2);
    }

    private i() {
    }
}

