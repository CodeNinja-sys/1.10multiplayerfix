/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.util.an;
import io.netty.util.c.u;
import java.util.concurrent.ConcurrentMap;

public class bi
extends an {
    private static final ConcurrentMap C = io.netty.util.c.u.m();
    public static final bi a = bi.a("ALLOCATOR");
    public static final bi b = bi.a("RCVBUF_ALLOCATOR");
    public static final bi c = bi.a("MESSAGE_SIZE_ESTIMATOR");
    public static final bi d = bi.a("CONNECT_TIMEOUT_MILLIS");
    public static final bi e = bi.a("MAX_MESSAGES_PER_READ");
    public static final bi f = bi.a("WRITE_SPIN_COUNT");
    public static final bi g = bi.a("WRITE_BUFFER_HIGH_WATER_MARK");
    public static final bi h = bi.a("WRITE_BUFFER_LOW_WATER_MARK");
    public static final bi i = bi.a("ALLOW_HALF_CLOSURE");
    public static final bi j = bi.a("AUTO_READ");
    public static final bi k = bi.a("AUTO_CLOSE");
    public static final bi l = bi.a("SO_BROADCAST");
    public static final bi m = bi.a("SO_KEEPALIVE");
    public static final bi n = bi.a("SO_SNDBUF");
    public static final bi o = bi.a("SO_RCVBUF");
    public static final bi p = bi.a("SO_REUSEADDR");
    public static final bi q = bi.a("SO_LINGER");
    public static final bi r = bi.a("SO_BACKLOG");
    public static final bi s = bi.a("SO_TIMEOUT");
    public static final bi t = bi.a("IP_TOS");
    public static final bi u = bi.a("IP_MULTICAST_ADDR");
    public static final bi v = bi.a("IP_MULTICAST_IF");
    public static final bi w = bi.a("IP_MULTICAST_TTL");
    public static final bi x = bi.a("IP_MULTICAST_LOOP_DISABLED");
    public static final bi y = bi.a("TCP_NODELAY");
    public static final bi z = bi.a("AIO_READ_TIMEOUT");
    public static final bi A = bi.a("AIO_WRITE_TIMEOUT");
    public static final bi B = bi.a("DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION");

    public static bi a(String string) {
        return new bi(string);
    }

    protected bi(String string) {
        super(C, string, new Object[0]);
    }

    public void a(Object object) {
        if (object == null) {
            throw new NullPointerException("value");
        }
    }
}

